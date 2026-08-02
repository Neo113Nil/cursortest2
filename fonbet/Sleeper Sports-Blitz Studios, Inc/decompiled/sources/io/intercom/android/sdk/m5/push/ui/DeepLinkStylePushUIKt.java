package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinkStylePushUI.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¨\u0006\n"}, d2 = {"buildDeepLinkNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "deepLinkPushData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "contentBitmap", "Landroid/graphics/Bitmap;", "customStack", "Landroid/app/TaskStackBuilder;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeepLinkStylePushUIKt {
    public static /* synthetic */ Notification buildDeepLinkNotification$default(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder, int i, Object obj) {
        if ((i & 8) != 0) {
            taskStackBuilder = null;
        }
        return buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder);
    }

    public static final Notification buildDeepLinkNotification(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deepLinkPushData, "deepLinkPushData");
        NotificationCompat.Builder createBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, deepLinkPushData.getContentTitle(), deepLinkPushData.getContentText(), NotificationChannel.ACTIONS_CHANNEL);
        if (bitmap != null) {
            createBaseNotificationBuilder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null).setBigContentTitle(deepLinkPushData.getContentTitle()).setSummaryText(deepLinkPushData.getContentText()));
            createBaseNotificationBuilder.setLargeIcon(bitmap);
        } else {
            createBaseNotificationBuilder.setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(deepLinkPushData.getContentTitle()).bigText(deepLinkPushData.getContentText()));
        }
        Notification build = createBaseNotificationBuilder.setContentIntent(ConversationDeepLinkRouterKt.buildIntentForDeepLinkScreen(context, deepLinkPushData.getUri(), deepLinkPushData.getInstanceId(), taskStackBuilder)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
