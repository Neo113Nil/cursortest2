package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.C;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationActionHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u001a\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"KEY_TEXT_REPLY", "", "KEY_CONVERSATION_ID", "KEY_CUSTOM_STACK_INTENTS", "buildReplyAction", "Landroidx/core/app/NotificationCompat$Action;", "context", "Landroid/content/Context;", "conversationId", "customStack", "Landroid/app/TaskStackBuilder;", "getReplyIntent", "Landroid/app/PendingIntent;", "buildContextualAction", "url", "getAttachmentIntent", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationActionHandlerKt {
    public static final String KEY_CONVERSATION_ID = "io.intercom.android.sdk.INTERCOM_KEY_CONVERSATION_ID";
    public static final String KEY_CUSTOM_STACK_INTENTS = "io.intercom.android.sdk.INTERCOM_KEY_CUSTOM_STACK_INTENTS";
    public static final String KEY_TEXT_REPLY = "io.intercom.android.sdk.INTERCOM_KEY_TEXT_REPLY";

    public static final NotificationCompat.Action buildReplyAction(Context context, String conversationId, TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        RemoteInput build = new RemoteInput.Builder(KEY_TEXT_REPLY).setLabel(context.getString(R.string.intercom_reply)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        NotificationCompat.Action build2 = new NotificationCompat.Action.Builder(io.intercom.android.sdk.ui.R.drawable.intercom_send, context.getString(R.string.intercom_reply), getReplyIntent(context, conversationId, taskStackBuilder)).addRemoteInput(build).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }

    private static final PendingIntent getReplyIntent(Context context, String str, TaskStackBuilder taskStackBuilder) {
        int hashCode = str.hashCode();
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE;
        Intent intent = new Intent(context, (Class<?>) ConversationReplyReceiver.class);
        intent.putExtra(KEY_CONVERSATION_ID, str);
        if (taskStackBuilder != null) {
            intent.putExtra(KEY_CUSTOM_STACK_INTENTS, taskStackBuilder.getIntents());
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, hashCode, intent, i);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static final NotificationCompat.Action buildContextualAction(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        IconCompat createWithResource = IconCompat.createWithResource(context, R.drawable.intercom_ic_attachment);
        Intrinsics.checkNotNullExpressionValue(createWithResource, "createWithResource(...)");
        NotificationCompat.Action build = new NotificationCompat.Action.Builder(createWithResource, "Open Attachment", getAttachmentIntent(context, url)).setContextual(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private static final PendingIntent getAttachmentIntent(Context context, String str) {
        int hashCode = str.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }
}
