package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BrazeNotificationStyleFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory;", "", "()V", k.M, "NoOpSentinelStyle", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BrazeNotificationStyleFactory {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String STORY_SET_GRAVITY = "setGravity";
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    /* compiled from: BrazeNotificationStyleFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$NoOpSentinelStyle;", "Landroidx/core/app/NotificationCompat$Style;", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class NoOpSentinelStyle extends NotificationCompat.Style {
    }

    @JvmStatic
    public static final void setBigPictureSummaryAndTitle(NotificationCompat.BigPictureStyle bigPictureStyle, BrazeNotificationPayload brazeNotificationPayload) {
        INSTANCE.setBigPictureSummaryAndTitle(bigPictureStyle, brazeNotificationPayload);
    }

    @JvmStatic
    public static final void setStyleIfSupported(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        INSTANCE.setStyleIfSupported(builder, brazeNotificationPayload);
    }

    /* compiled from: BrazeNotificationStyleFactory.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$Companion;", "", "()V", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "", "STORY_SET_GRAVITY", "", "STORY_SET_VISIBILITY", "createStoryPageClickedPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "pushStoryPage", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "createStoryTraversedPendingIntent", "notificationExtras", "Landroid/os/Bundle;", "pageIndex", "getBigPictureNotificationStyle", "Landroidx/core/app/NotificationCompat$BigPictureStyle;", "getBigTextNotificationStyle", "Landroidx/core/app/NotificationCompat$BigTextStyle;", "getConversationalPushStyle", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "getInlineImageStyle", "Landroidx/core/app/NotificationCompat$Style;", "getNotificationStyle", "getStoryStyle", "Landroidx/core/app/NotificationCompat$DecoratedCustomViewStyle;", "isRemoteViewNotificationAvailableSpaceConstrained", "", "populatePushStoryPage", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/RemoteViews;", "setBigPictureSummaryAndTitle", "", "bigPictureNotificationStyle", "setStyleIfSupported", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void setStyleIfSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            NotificationCompat.Style notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$setStyleIfSupported$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting style for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.setStyle(notificationStyle);
        }

        public final NotificationCompat.Style getNotificationStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            NotificationCompat.BigPictureStyle bigPictureStyle;
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.getIsPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering push notification with DecoratedCustomViewStyle (Story)";
                    }
                }, 3, (Object) null);
                bigPictureStyle = getStoryStyle(notificationBuilder, payload);
            } else if (payload.getIsConversationalPush() && Build.VERSION.SDK_INT >= 25) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering conversational push";
                    }
                }, 3, (Object) null);
                bigPictureStyle = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                bigPictureStyle = null;
            } else if (payload.getIsInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering push notification with custom inline image style";
                    }
                }, 3, (Object) null);
                bigPictureStyle = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering push notification with BigPictureStyle";
                    }
                }, 3, (Object) null);
                bigPictureStyle = getBigPictureNotificationStyle(payload);
            }
            if (bigPictureStyle != null) {
                return bigPictureStyle;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Rendering push notification with BigTextStyle";
                }
            }, 3, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        public final NotificationCompat.BigTextStyle getBigTextNotificationStyle(BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            Intrinsics.checkNotNullParameter(payload, "payload");
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider != null) {
                String contentText = payload.getContentText();
                if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                    bigTextStyle.bigText(htmlSpannedTextIfEnabled);
                }
                String bigSummaryText = payload.getBigSummaryText();
                if (bigSummaryText != null) {
                    bigTextStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
                }
                String bigTitleText = payload.getBigTitleText();
                if (bigTitleText != null) {
                    bigTextStyle.setBigContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
                    return bigTextStyle;
                }
            }
            return bigTextStyle;
        }

        public final NotificationCompat.DecoratedCustomViewStyle getStoryStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page cannot render without a context";
                    }
                }, 3, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, payload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
                    }
                }, 2, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            NotificationCompat.DecoratedCustomViewStyle decoratedCustomViewStyle = new NotificationCompat.DecoratedCustomViewStyle();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.setCustomBigContentView(remoteViews);
            notificationBuilder.setOnlyAlertOnce(true);
            return decoratedCustomViewStyle;
        }

        public final NotificationCompat.Style getInlineImageStyle(BrazeNotificationPayload payload, NotificationCompat.Builder notificationBuilder) {
            ApplicationInfo applicationInfo;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push cannot render without a context";
                    }
                }, 3, (Object) null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            String str = bigImageUrl;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push image url invalid";
                    }
                }, 3, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push failed to get image bitmap";
                    }
                }, 3, (Object) null);
                return null;
            }
            boolean isRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), isRemoteViewNotificationAvailableSpaceConstrained ? R.layout.com_braze_push_inline_image_constrained : R.layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
            Icon createWithResource = Icon.createWithResource(context, brazeConfigurationProvider.getSmallNotificationIconResourceId());
            Intrinsics.checkNotNullExpressionValue(createWithResource, "createWithResource(\n    …nResourceId\n            )");
            Integer accentColor = payload.getAccentColor();
            if (accentColor != null) {
                createWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R.id.com_braze_inline_image_push_app_icon, createWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L));
                } else {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                }
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "{\n                if (Bu…          }\n            }");
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) packageManager.getApplicationLabel(applicationInfo), brazeConfigurationProvider));
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString(Constants.BRAZE_PUSH_TITLE_KEY);
                if (string != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, brazeConfigurationProvider));
                }
                String string2 = notificationExtras.getString(Constants.BRAZE_PUSH_CONTENT_KEY);
                if (string2 != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, brazeConfigurationProvider));
                }
                notificationBuilder.setCustomContentView(remoteViews);
                if (isRemoteViewNotificationAvailableSpaceConstrained) {
                    notificationBuilder.setLargeIcon(pushBitmapFromUrl);
                    return new NotificationCompat.DecoratedCustomViewStyle();
                }
                remoteViews.setImageViewBitmap(R.id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                return new NoOpSentinelStyle();
            } catch (PackageManager.NameNotFoundException e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$applicationInfo$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push application info was null";
                    }
                });
                return null;
            }
        }

        public final NotificationCompat.BigPictureStyle getBigPictureNotificationStyle(BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                return null;
            }
            final String bigImageUrl = payload.getBigImageUrl();
            String str = bigImageUrl;
            if (str == null || StringsKt.isBlank(str)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Failed to download image bitmap for big picture notification style. Url: ", bigImageUrl);
                    }
                }, 3, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i > displayWidthPixels) {
                        i = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i, pixelsFromDensityAndDp, true);
                    } catch (Exception e) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$2
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to scale image bitmap, using original.";
                            }
                        });
                    }
                }
                if (pushBitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Bitmap download failed for push notification. No image will be included with the notification.";
                        }
                    }, 2, (Object) null);
                    return null;
                }
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                bigPictureStyle.bigPicture(pushBitmapFromUrl);
                setBigPictureSummaryAndTitle(bigPictureStyle, payload);
                return bigPictureStyle;
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to create Big Picture Style.";
                    }
                });
                return null;
            }
        }

        public final NotificationCompat.MessagingStyle getConversationalPushStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Reply person does not exist in mapping. Not rendering a style";
                        }
                    }, 3, (Object) null);
                    return null;
                }
                NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(conversationPerson.getPerson());
                for (final BrazeNotificationPayload.ConversationMessage conversationMessage : payload.getConversationMessages()) {
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(conversationMessage.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return Intrinsics.stringPlus("Message person does not exist in mapping. Not rendering a style. ", BrazeNotificationPayload.ConversationMessage.this);
                            }
                        }, 3, (Object) null);
                        return null;
                    }
                    messagingStyle.addMessage(conversationMessage.getMessage(), conversationMessage.getTimestamp(), conversationPerson2.getPerson());
                }
                boolean z = true;
                if (conversationPersonMap.size() <= 1) {
                    z = false;
                }
                messagingStyle.setGroupConversation(z);
                notificationBuilder.setShortcutId(payload.getConversationShortcutId());
                return messagingStyle;
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to create conversation push style. Returning null.";
                    }
                });
                return null;
            }
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent(Constants.BRAZE_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_S…lineActivity::class.java)");
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(payload.getNotificationExtras());
            intent.putExtra(Constants.BRAZE_ACTION_URI_KEY, pushStoryPage.getDeeplink());
            intent.putExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
            intent.putExtra(Constants.BRAZE_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
            intent.putExtra(Constants.BRAZE_CAMPAIGN_ID, pushStoryPage.getCampaignId());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, BrazeNotificationUtils.getNotificationId(payload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …tentFlags()\n            )");
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle notificationExtras, int pageIndex) {
            Intent intent = new Intent(Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (notificationExtras != null) {
                notificationExtras.putInt(Constants.BRAZE_STORY_INDEX_KEY, pageIndex);
                intent.putExtras(notificationExtras);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        private final boolean populatePushStoryPage(RemoteViews view, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page cannot render without a context";
                    }
                }, 3, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page cannot render without a configuration provider";
                    }
                }, 3, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            String str = bitmapUrl;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page image url invalid";
                    }
                }, 3, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            view.setImageViewBitmap(R.id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            String str2 = title;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                view.setTextViewText(R.id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                view.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getTitleGravity());
            } else {
                view.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            }
            String subtitle = pushStoryPage.getSubtitle();
            String str3 = subtitle;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                view.setTextViewText(R.id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                view.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getSubtitleGravity());
            } else {
                view.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            }
            view.setOnClickPendingIntent(R.id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, payload, pushStoryPage));
            return true;
        }

        @JvmStatic
        public final void setBigPictureSummaryAndTitle(NotificationCompat.BigPictureStyle bigPictureNotificationStyle, BrazeNotificationPayload payload) {
            String contentText;
            Intrinsics.checkNotNullParameter(bigPictureNotificationStyle, "bigPictureNotificationStyle");
            Intrinsics.checkNotNullParameter(payload, "payload");
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.setBigContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }
    }
}
