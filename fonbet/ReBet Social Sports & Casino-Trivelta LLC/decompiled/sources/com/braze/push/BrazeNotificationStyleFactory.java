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
import androidx.core.app.o;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory;", "", "Companion", "NoOpSentinelStyle", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BrazeNotificationStyleFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u001c2\u0006\u00100\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPage", "Landroid/app/PendingIntent;", "createStoryPageClickedPendingIntent", "(Landroid/content/Context;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;)Landroid/app/PendingIntent;", "Landroid/os/Bundle;", "notificationExtras", "", "pageIndex", "createStoryTraversedPendingIntent", "(Landroid/content/Context;Landroid/os/Bundle;I)Landroid/app/PendingIntent;", "Landroid/widget/RemoteViews;", "view", "", "populatePushStoryPage", "(Landroid/widget/RemoteViews;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;)Z", "isRemoteViewNotificationAvailableSpaceConstrained", "(Landroid/content/Context;)Z", "Landroidx/core/app/o$e;", "notificationBuilder", "", "setStyleIfSupported", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/o$i;", "getNotificationStyle", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/o$i;", "Landroidx/core/app/o$c;", "getBigTextNotificationStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/o$c;", "Landroidx/core/app/o$f;", "getStoryStyle", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/o$f;", "getInlineImageStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;Landroidx/core/app/o$e;)Landroidx/core/app/o$i;", "Landroidx/core/app/o$b;", "getBigPictureNotificationStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/o$b;", "Landroidx/core/app/o$h;", "getConversationalPushStyle", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/o$h;", "bigPictureNotificationStyle", "setBigPictureSummaryAndTitle", "(Landroidx/core/app/o$b;Lcom/braze/models/push/BrazeNotificationPayload;)V", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "I", "", "STORY_SET_GRAVITY", "Ljava/lang/String;", "STORY_SET_VISIBILITY", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeNotificationStyleFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeNotificationStyleFactory.kt\ncom/braze/push/BrazeNotificationStyleFactory$Companion\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,612:1\n71#2,2:613\n*S KotlinDebug\n*F\n+ 1 BrazeNotificationStyleFactory.kt\ncom/braze/push/BrazeNotificationStyleFactory$Companion\n*L\n364#1:613,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent("com.braze.action.BRAZE_STORY_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(payload.getNotificationExtras());
            intent.putExtra("braze_action_uri", pushStoryPage.getDeeplink());
            intent.putExtra("braze_action_use_webview", pushStoryPage.getUseWebview());
            intent.putExtra("braze_story_page_id", pushStoryPage.getStoryPageId());
            intent.putExtra("braze_campaign_id", pushStoryPage.getCampaignId());
            intent.putExtra("nid", BrazeNotificationUtils.getNotificationId(payload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle notificationExtras, int pageIndex) {
            Intent intent = new Intent("com.braze.action.STORY_TRAVERSE").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            if (notificationExtras != null) {
                notificationExtras.putInt("braze_story_index", pageIndex);
                intent.putExtras(notificationExtras);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$0(String str) {
            return "Failed to download image bitmap for big picture notification style. Url: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$1() {
            return "Failed to scale image bitmap, using original.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$2() {
            return "Failed to create Big Picture Style.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$0() {
            return "Reply person does not exist in mapping. Not rendering a style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$1(BrazeNotificationPayload.ConversationMessage conversationMessage) {
            return "Message person does not exist in mapping. Not rendering a style. " + conversationMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$2() {
            return "Failed to create conversation push style. Returning null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$0() {
            return "Inline Image Push cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$1() {
            return "Inline Image Push image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$2() {
            return "Inline Image Push failed to get image bitmap";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$4() {
            return "Inline Image Push application info was null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$0() {
            return "Rendering push notification with DecoratedCustomViewStyle (Story)";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$1() {
            return "Rendering conversational push";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$2() {
            return "Rendering push notification with custom inline image style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$3() {
            return "Rendering push notification with BigPictureStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$4() {
            return "Rendering push notification with BigTextStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$0() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$1() {
            return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }

        private final boolean populatePushStoryPage(RemoteViews view, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.N
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populatePushStoryPage$lambda$0;
                        populatePushStoryPage$lambda$0 = BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$0();
                        return populatePushStoryPage$lambda$0;
                    }
                }, 7, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populatePushStoryPage$lambda$1;
                        populatePushStoryPage$lambda$1 = BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$1();
                        return populatePushStoryPage$lambda$1;
                    }
                }, 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || StringsKt.isBlank(bitmapUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populatePushStoryPage$lambda$2;
                        populatePushStoryPage$lambda$2 = BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$2();
                        return populatePushStoryPage$lambda$2;
                    }
                }, 7, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            view.setImageViewBitmap(R$id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title == null || StringsKt.isBlank(title)) {
                view.setInt(R$id.com_braze_story_text_view_container, "setVisibility", 8);
            } else {
                view.setTextViewText(R$id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                view.setInt(R$id.com_braze_story_text_view_container, "setGravity", pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || StringsKt.isBlank(subtitle)) {
                view.setInt(R$id.com_braze_story_text_view_small_container, "setVisibility", 8);
            } else {
                view.setTextViewText(R$id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                view.setInt(R$id.com_braze_story_text_view_small_container, "setGravity", pushStoryPage.getSubtitleGravity());
            }
            view.setOnClickPendingIntent(R$id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, payload, pushStoryPage));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$0() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$1() {
            return "Push story page cannot render without a configuration provider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$2() {
            return "Push story page image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setStyleIfSupported$lambda$0() {
            return "Setting style for notification";
        }

        @Nullable
        public final o.b getBigPictureNotificationStyle(@NotNull BrazeNotificationPayload payload) {
            final String bigImageUrl;
            Companion companion;
            o.b bVar;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null || (bigImageUrl = payload.getBigImageUrl()) == null || StringsKt.isBlank(bigImageUrl)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String bigPictureNotificationStyle$lambda$0;
                        bigPictureNotificationStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$0(bigImageUrl);
                        return bigPictureNotificationStyle$lambda$0;
                    }
                }, 7, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i10 = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i10 > displayWidthPixels) {
                        i10 = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i10, pixelsFromDensityAndDp, true);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.X
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String bigPictureNotificationStyle$lambda$1;
                                bigPictureNotificationStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$1();
                                return bigPictureNotificationStyle$lambda$1;
                            }
                        }, 4, (Object) null);
                    }
                }
                bVar = new o.b();
                bVar.b(pushBitmapFromUrl);
                companion = this;
            } catch (Exception e11) {
                e = e11;
                companion = this;
            }
            try {
                companion.setBigPictureSummaryAndTitle(bVar, payload);
                return bVar;
            } catch (Exception e12) {
                e = e12;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.f29470E, (Throwable) e, false, new Function0() { // from class: T3.Y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String bigPictureNotificationStyle$lambda$2;
                        bigPictureNotificationStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$2();
                        return bigPictureNotificationStyle$lambda$2;
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        @NotNull
        public final o.c getBigTextNotificationStyle(@NotNull BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            Intrinsics.checkNotNullParameter(payload, "payload");
            o.c cVar = new o.c();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider != null) {
                String contentText = payload.getContentText();
                if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                    cVar.a(htmlSpannedTextIfEnabled);
                }
                String bigSummaryText = payload.getBigSummaryText();
                if (bigSummaryText != null) {
                    cVar.c(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
                }
                String bigTitleText = payload.getBigTitleText();
                if (bigTitleText != null) {
                    cVar.b(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
                }
            }
            return cVar;
        }

        @Nullable
        public final o.h getConversationalPushStyle(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.Z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String conversationalPushStyle$lambda$0;
                            conversationalPushStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$0();
                            return conversationalPushStyle$lambda$0;
                        }
                    }, 7, (Object) null);
                    return null;
                }
                o.h hVar = new o.h(conversationPerson.getPerson());
                for (final BrazeNotificationPayload.ConversationMessage conversationMessage : payload.getConversationMessages()) {
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(conversationMessage.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.F
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String conversationalPushStyle$lambda$1;
                                conversationalPushStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$1(BrazeNotificationPayload.ConversationMessage.this);
                                return conversationalPushStyle$lambda$1;
                            }
                        }, 7, (Object) null);
                        return null;
                    }
                    hVar.b(conversationMessage.getMessage(), conversationMessage.getTimestamp(), conversationPerson2.getPerson());
                }
                boolean z10 = true;
                if (conversationPersonMap.size() <= 1) {
                    z10 = false;
                }
                hVar.d(z10);
                notificationBuilder.C(payload.getConversationShortcutId());
                return hVar;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String conversationalPushStyle$lambda$2;
                        conversationalPushStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$2();
                        return conversationalPushStyle$lambda$2;
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        @Nullable
        public final o.i getInlineImageStyle(@NotNull BrazeNotificationPayload payload, @NotNull o.e notificationBuilder) {
            ApplicationInfo applicationInfo;
            PackageManager.ApplicationInfoFlags of2;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String inlineImageStyle$lambda$0;
                        inlineImageStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$0();
                        return inlineImageStyle$lambda$0;
                    }
                }, 7, (Object) null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl == null || StringsKt.isBlank(bigImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String inlineImageStyle$lambda$1;
                        inlineImageStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$1();
                        return inlineImageStyle$lambda$1;
                    }
                }, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String inlineImageStyle$lambda$2;
                        inlineImageStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$2();
                        return inlineImageStyle$lambda$2;
                    }
                }, 7, (Object) null);
                return null;
            }
            boolean isRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), isRemoteViewNotificationAvailableSpaceConstrained ? R$layout.com_braze_push_inline_image_constrained : R$layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Icon createWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
            Intrinsics.checkNotNullExpressionValue(createWithResource, "createWithResource(...)");
            Integer accentColor = payload.getAccentColor();
            if (accentColor != null) {
                createWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R$id.com_braze_inline_image_push_app_icon, createWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    String packageName = context.getPackageName();
                    of2 = PackageManager.ApplicationInfoFlags.of(0L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of2);
                } else {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                }
                Intrinsics.checkNotNull(applicationInfo);
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                Intrinsics.checkNotNull(applicationLabel, "null cannot be cast to non-null type kotlin.String");
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, configurationProvider));
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString("t");
                if (string != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, configurationProvider));
                }
                String string2 = notificationExtras.getString("a");
                if (string2 != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                }
                notificationBuilder.o(remoteViews);
                if (isRemoteViewNotificationAvailableSpaceConstrained) {
                    notificationBuilder.u(pushBitmapFromUrl);
                    return new o.f();
                }
                remoteViews.setImageViewBitmap(R$id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                return new NoOpSentinelStyle();
            } catch (PackageManager.NameNotFoundException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String inlineImageStyle$lambda$4;
                        inlineImageStyle$lambda$4 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$4();
                        return inlineImageStyle$lambda$4;
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        @NotNull
        public final o.i getNotificationStyle(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            o.i iVar;
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.getIsPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.P
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String notificationStyle$lambda$0;
                        notificationStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$0();
                        return notificationStyle$lambda$0;
                    }
                }, 7, (Object) null);
                iVar = getStoryStyle(notificationBuilder, payload);
            } else if (payload.getIsConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String notificationStyle$lambda$1;
                        notificationStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$1();
                        return notificationStyle$lambda$1;
                    }
                }, 7, (Object) null);
                iVar = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                iVar = null;
            } else if (payload.getIsInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.T
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String notificationStyle$lambda$2;
                        notificationStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$2();
                        return notificationStyle$lambda$2;
                    }
                }, 7, (Object) null);
                iVar = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.U
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String notificationStyle$lambda$3;
                        notificationStyle$lambda$3 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$3();
                        return notificationStyle$lambda$3;
                    }
                }, 7, (Object) null);
                iVar = getBigPictureNotificationStyle(payload);
            }
            if (iVar != null) {
                return iVar;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.V
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String notificationStyle$lambda$4;
                    notificationStyle$lambda$4 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$4();
                    return notificationStyle$lambda$4;
                }
            }, 7, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        @Nullable
        public final o.f getStoryStyle(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String storyStyle$lambda$0;
                        storyStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$0();
                        return storyStyle$lambda$0;
                    }
                }, 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, payload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String storyStyle$lambda$1;
                        storyStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$1();
                        return storyStyle$lambda$1;
                    }
                }, 6, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            o.f fVar = new o.f();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.n(remoteViews);
            notificationBuilder.z(true);
            return fVar;
        }

        @JvmStatic
        public final void setBigPictureSummaryAndTitle(@NotNull o.b bigPictureNotificationStyle, @NotNull BrazeNotificationPayload payload) {
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
                bigPictureNotificationStyle.d(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.c(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.d(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        @JvmStatic
        public final void setStyleIfSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            o.i notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String styleIfSupported$lambda$0;
                    styleIfSupported$lambda$0 = BrazeNotificationStyleFactory.Companion.setStyleIfSupported$lambda$0();
                    return styleIfSupported$lambda$0;
                }
            }, 7, (Object) null);
            notificationBuilder.G(notificationStyle);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$NoOpSentinelStyle;", "Landroidx/core/app/o$i;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoOpSentinelStyle extends o.i {
    }
}
