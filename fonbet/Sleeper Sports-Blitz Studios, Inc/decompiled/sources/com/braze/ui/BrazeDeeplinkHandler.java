package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BrazeDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J,\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J*\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u001b"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler;", "Lcom/braze/IBrazeDeeplinkHandler;", "<init>", "()V", "gotoUri", "", "context", "Landroid/content/Context;", "uriAction", "Lcom/braze/ui/actions/UriAction;", "getIntentFlags", "", "intentFlagPurpose", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "createUriActionFromUrlString", "url", "", "extras", "Landroid/os/Bundle;", "openInWebView", "", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "createUriActionFromUri", "uri", "Landroid/net/Uri;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {
    private static volatile IBrazeDeeplinkHandler customHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    /* compiled from: BrazeDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final IBrazeDeeplinkHandler getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final void setBrazeDeeplinkHandler(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
        INSTANCE.setBrazeDeeplinkHandler(iBrazeDeeplinkHandler);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoUri(Context context, UriAction uriAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uriAction, "uriAction");
        uriAction.execute(context);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public int getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose) {
        Intrinsics.checkNotNullParameter(intentFlagPurpose, "intentFlagPurpose");
        switch (WhenMappings.$EnumSwitchMapping$0[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return 1073741824;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUrlString(String url, Bundle extras, boolean openInWebView, Channel channel) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(channel, "channel");
        try {
            if (!StringsKt.isBlank(url)) {
                return createUriActionFromUri(Uri.parse(url), extras, openInWebView, channel);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeDeeplinkHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String createUriActionFromUrlString$lambda$0;
                    createUriActionFromUrlString$lambda$0 = BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$0();
                    return createUriActionFromUrlString$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.BrazeDeeplinkHandler$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String createUriActionFromUrlString$lambda$1;
                    createUriActionFromUrlString$lambda$1 = BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$1();
                    return createUriActionFromUrlString$lambda$1;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$0() {
        return "createUriActionFromUrlString url was null. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$1() {
        return "createUriActionFromUrlString failed. Returning null.";
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUri(Uri uri, Bundle extras, boolean openInWebView, Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new UriAction(uri, extras, openInWebView, channel);
    }

    /* compiled from: BrazeDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler$Companion;", "", "<init>", "()V", "defaultHandler", "Lcom/braze/IBrazeDeeplinkHandler;", "customHandler", "getInstance", "setBrazeDeeplinkHandler", "", "brazeDeeplinkHandler", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IBrazeDeeplinkHandler getInstance() {
            IBrazeDeeplinkHandler iBrazeDeeplinkHandler = BrazeDeeplinkHandler.customHandler;
            return iBrazeDeeplinkHandler == null ? BrazeDeeplinkHandler.defaultHandler : iBrazeDeeplinkHandler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setBrazeDeeplinkHandler$lambda$0(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
            return "Custom IBrazeDeeplinkHandler ".concat(iBrazeDeeplinkHandler == null ? "cleared" : "set");
        }

        @JvmStatic
        public final void setBrazeDeeplinkHandler(final IBrazeDeeplinkHandler brazeDeeplinkHandler) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeDeeplinkHandler$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String brazeDeeplinkHandler$lambda$0;
                    brazeDeeplinkHandler$lambda$0 = BrazeDeeplinkHandler.Companion.setBrazeDeeplinkHandler$lambda$0(IBrazeDeeplinkHandler.this);
                    return brazeDeeplinkHandler$lambda$0;
                }
            }, 7, (Object) null);
            BrazeDeeplinkHandler.customHandler = brazeDeeplinkHandler;
        }
    }
}
