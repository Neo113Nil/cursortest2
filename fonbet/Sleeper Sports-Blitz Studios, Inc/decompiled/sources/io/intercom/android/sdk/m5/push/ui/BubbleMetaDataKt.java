package io.intercom.android.sdk.m5.push.ui;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleMetaData.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"getBubbleMetaData", "Landroidx/core/app/NotificationCompat$BubbleMetadata;", "context", "Landroid/content/Context;", "conversation", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BubbleMetaDataKt {
    public static final NotificationCompat.BubbleMetadata getBubbleMetaData(Context context, IntercomPushConversation conversation) {
        Person person;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        PendingIntent activity = PendingIntent.getActivity(context, 2, ConversationScreenOpenerKt.getComposerIntent$default(context, null, false, null, conversation.getConversationId(), IntercomBubbleActivity.class, 2, null), 33554432);
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) CollectionsKt.firstOrNull((List) conversation.getMessages());
        IconCompat icon = (message == null || (person = message.getPerson()) == null) ? null : person.getIcon();
        if (icon == null) {
            icon = IconCompat.createWithResource(context, R.drawable.intercom_ic_avatar_person);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(...)");
        }
        NotificationCompat.BubbleMetadata.Builder suppressNotification = new NotificationCompat.BubbleMetadata.Builder(activity, icon).setDesiredHeight(600).setSuppressNotification(true);
        Intrinsics.checkNotNullExpressionValue(suppressNotification, "setSuppressNotification(...)");
        NotificationCompat.BubbleMetadata build = suppressNotification.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
