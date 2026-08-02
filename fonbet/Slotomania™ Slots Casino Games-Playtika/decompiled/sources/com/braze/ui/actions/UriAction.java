package com.braze.ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UriAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0005J5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\u0010$J\"\u0010%\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0004J\"\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0004J\"\u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0004J\"\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0004R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "uri", "Landroid/net/Uri;", "extras", "Landroid/os/Bundle;", "useWebView", "", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)V", "original", "(Lcom/braze/ui/actions/UriAction;)V", "getChannel", "()Lcom/braze/enums/Channel;", "getExtras", "()Landroid/os/Bundle;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "execute", "", "context", "Landroid/content/Context;", "getActionViewIntent", "Landroid/content/Intent;", "getIntentArrayWithConfiguredBackStack", "", "targetIntent", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lcom/braze/configuration/BrazeConfigurationProvider;)[Landroid/content/Intent;", "getWebViewActivityIntent", "openUriWithActionView", "openUriWithActionViewFromPush", "openUriWithWebViewActivity", "openUriWithWebViewActivityFromPush", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.appboy");
        p0.startActivity(p1);
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    @Override // com.braze.ui.actions.IAction
    public Channel getChannel() {
        return this.channel;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.uri = uri;
    }

    public final boolean getUseWebView() {
        return this.useWebView;
    }

    public final void setUseWebView(boolean z) {
        this.useWebView = z;
    }

    public UriAction(Uri uri, Bundle bundle, boolean z, Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z;
        this.channel = channel;
    }

    public UriAction(UriAction original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.uri = original.uri;
        this.extras = original.extras;
        this.useWebView = original.useWebView;
        this.channel = original.getChannel();
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$execute$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Not executing local Uri: ", UriAction.this.getUri());
                }
            }, 3, (Object) null);
            return;
        }
        if (BrazeActionParser.INSTANCE.isBrazeActionUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$execute$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Executing BrazeActions uri:\n'" + UriAction.this.getUri() + '\'';
                }
            }, 2, (Object) null);
            BrazeActionParser.INSTANCE.execute(context, this.uri, getChannel());
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$execute$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Executing Uri action from channel " + UriAction.this.getChannel() + ": " + UriAction.this.getUri() + ". UseWebView: " + UriAction.this.getUseWebView() + ". Extras: " + UriAction.this.getExtras();
            }
        }, 3, (Object) null);
        if (this.useWebView && CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            if (getChannel() == Channel.PUSH) {
                openUriWithWebViewActivityFromPush(context, this.uri, this.extras);
                return;
            } else {
                openUriWithWebViewActivity(context, this.uri, this.extras);
                return;
            }
        }
        if (getChannel() == Channel.PUSH) {
            openUriWithActionViewFromPush(context, this.uri, this.extras);
        } else {
            openUriWithActionView(context, this.uri, this.extras);
        }
    }

    protected final void openUriWithWebViewActivity(Context context, Uri uri, Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, extras);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, webViewActivityIntent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$openUriWithWebViewActivity$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeWebViewActivity not opened successfully.";
                }
            });
        }
    }

    protected void openUriWithActionView(Context context, final Uri uri, final Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent actionViewIntent = getActionViewIntent(context, uri, extras);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, actionViewIntent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$openUriWithActionView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to handle uri " + uri + " with extras: " + extras;
                }
            });
        }
    }

    protected final void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getWebViewActivityIntent(context, uri, extras), new BrazeConfigurationProvider(context)));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$openUriWithWebViewActivityFromPush$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Braze WebView Activity not opened successfully.";
                }
            });
        }
    }

    protected final void openUriWithActionViewFromPush(Context context, final Uri uri, Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getActionViewIntent(context, uri, extras), new BrazeConfigurationProvider(context)));
        } catch (ActivityNotFoundException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$openUriWithActionViewFromPush$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Could not find appropriate activity to open for deep link ", uri);
                }
            });
        }
    }

    protected final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle extras) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        final String customHtmlWebViewActivityClassName = new BrazeConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        String str = customHtmlWebViewActivityClassName;
        if (str != null && !StringsKt.isBlank(str) && UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getWebViewActivityIntent$webViewActivityIntent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Launching custom WebView Activity with class name: ", customHtmlWebViewActivityClassName);
                }
            }, 3, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            Intrinsics.checkNotNullExpressionValue(intent, "val customWebViewActivit…ivityClassName)\n        }");
        } else {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    protected final Intent getActionViewIntent(Context context, Uri uri, Bundle extras) {
        List<ResolveInfo> queryIntentActivities;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (extras != null) {
            intent.putExtras(extras);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "if (Build.VERSION.SDK_IN…ties(intent, 0)\n        }");
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final ResolveInfo next = it.next();
                if (Intrinsics.areEqual(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getActionViewIntent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Setting deep link intent package to " + ((Object) next.activityInfo.packageName) + '.';
                        }
                    }, 3, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle extras, Intent targetIntent, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intent intent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            final String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            String str = pushDeepLinkBackStackActivityClassName;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Adding main activity intent to back stack while opening uri from push";
                    }
                }, 2, (Object) null);
                intent = UriUtils.getMainActivityIntent(context, extras);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Adding custom back stack activity while opening uri from push: ", pushDeepLinkBackStackActivityClassName);
                    }
                }, 2, (Object) null);
                if (extras != null) {
                    intent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(extras);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Not adding unregistered activity to the back stack while opening uri from push: ", pushDeepLinkBackStackActivityClassName);
                    }
                }, 2, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
                }
            }, 2, (Object) null);
        }
        if (intent == null) {
            targetIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
            return new Intent[]{targetIntent};
        }
        return new Intent[]{intent, targetIntent};
    }
}
