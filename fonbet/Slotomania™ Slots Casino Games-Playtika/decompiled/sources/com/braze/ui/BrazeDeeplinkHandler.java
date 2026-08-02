package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BrazeDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J,\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¨\u0006\u001d"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler;", "Lcom/braze/IBrazeDeeplinkHandler;", "()V", "createUriActionFromUri", "Lcom/braze/ui/actions/UriAction;", "uri", "Landroid/net/Uri;", "extras", "Landroid/os/Bundle;", "openInWebView", "", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "createUriActionFromUrlString", "url", "", "getIntentFlags", "", "intentFlagPurpose", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "gotoNewsFeed", "", "context", "Landroid/content/Context;", "newsfeedAction", "Lcom/braze/ui/actions/NewsfeedAction;", "gotoUri", "uriAction", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {
    private static volatile IBrazeDeeplinkHandler customHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    /* compiled from: BrazeDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
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
    public void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newsfeedAction, "newsfeedAction");
        newsfeedAction.execute(context);
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
        Exception exc;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(channel, "channel");
        try {
            if (!StringsKt.isBlank(url)) {
                try {
                    Uri uri = Uri.parse(url);
                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    return createUriActionFromUri(uri, extras, openInWebView, channel);
                } catch (Exception e) {
                    exc = e;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, exc, new Function0<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler$createUriActionFromUrlString$2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "createUriActionFromUrlString failed. Returning null.";
                        }
                    });
                    return null;
                }
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler$createUriActionFromUrlString$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "createUriActionFromUrlString url was null. Returning null.";
                    }
                }, 2, (Object) null);
                return null;
            } catch (Exception e2) {
                e = e2;
                exc = e;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, exc, new Function0<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler$createUriActionFromUrlString$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "createUriActionFromUrlString failed. Returning null.";
                    }
                });
                return null;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUri(Uri uri, Bundle extras, boolean openInWebView, Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new UriAction(uri, extras, openInWebView, channel);
    }

    /* compiled from: BrazeDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler$Companion;", "", "()V", "customHandler", "Lcom/braze/IBrazeDeeplinkHandler;", "defaultHandler", Constants.GET_INSTANCE, "setBrazeDeeplinkHandler", "", "brazeDeeplinkHandler", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

        @JvmStatic
        public final void setBrazeDeeplinkHandler(final IBrazeDeeplinkHandler brazeDeeplinkHandler) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.BrazeDeeplinkHandler$Companion$setBrazeDeeplinkHandler$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Custom IBrazeDeeplinkHandler ", IBrazeDeeplinkHandler.this == null ? "cleared" : "set");
                }
            }, 3, (Object) null);
            BrazeDeeplinkHandler.customHandler = brazeDeeplinkHandler;
        }
    }
}
