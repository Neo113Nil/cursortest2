package com.appsonair.applink.services;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.AbstractC1488z;
import Ph.C1452g0;
import Ph.InterfaceC1484x;
import Ph.Q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsonair.applink.interfaces.AppLinkListener;
import com.appsonair.applink.services.AppLinkHandler;
import com.appsonair.core.services.CoreService;
import com.twilio.voice.EventKeys;
import java.net.URI;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0001LB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J%\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0097\u0001\u0010;\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00106\u001a\u0004\u0018\u0001042\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u0001042\n\b\u0002\u00109\u001a\u0004\u0018\u0001042\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0014H\u0007¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J5\u0010B\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0006\u0010A\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bB\u0010CJ\u0013\u0010D\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\bD\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010FR\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/appsonair/applink/services/AppLinkService;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "packageName", "fallbackUrl", "source", "", "handleFallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "callback", "fetchInstallReferrer", "(Lkotlin/jvm/functions/Function1;)V", "getUserAgent", "()Ljava/lang/String;", "key", "Lorg/json/JSONObject;", "jsonObject", "saveJsonToPrefs", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)V", "getJsonFromPrefs", "(Landroid/content/Context;Ljava/lang/String;)Lorg/json/JSONObject;", "domain", "linkId", "referLink", "getFullReferralDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "onDeepLinkProcessed", "(Landroid/net/Uri;)V", "error", "onDeepLinkError", "(Landroid/net/Uri;Ljava/lang/String;)V", "openFallbackUrl", "(Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "Lcom/appsonair/applink/interfaces/AppLinkListener;", "listener", "initialize", "(Landroid/content/Context;Landroid/content/Intent;Lcom/appsonair/applink/interfaces/AppLinkListener;)V", EventKeys.URL, "name", "urlPrefix", "shortId", "", "socialMeta", "", "isOpenInBrowserAndroid", "isOpenInAndroidApp", "androidFallbackUrl", "isOpenInBrowserApple", "isOpenInIosApp", "iosFallbackUrl", "createAppLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReferralDetails", "()Lorg/json/JSONObject;", "getReferralInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fallbackPackageName", "handleDeepLink", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReferralUsingIp", "Landroid/content/Context;", "Lcom/appsonair/applink/interfaces/AppLinkListener;", "referralLink", "Lorg/json/JSONObject;", "LPh/x;", "referralDeferred", "LPh/x;", "Companion", "applink_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppLinkService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile AppLinkService instance;

    @NotNull
    private final Context context;
    private AppLinkListener listener;

    @Nullable
    private InterfaceC1484x referralDeferred;

    @NotNull
    private JSONObject referralLink;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/appsonair/applink/services/AppLinkService$Companion;", "", "()V", "instance", "Lcom/appsonair/applink/services/AppLinkService;", "getInstance", "context", "Landroid/content/Context;", "applink_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppLinkService getInstance(@NotNull Context context) {
            AppLinkService appLinkService;
            Intrinsics.checkNotNullParameter(context, "context");
            AppLinkService appLinkService2 = AppLinkService.instance;
            if (appLinkService2 != null) {
                return appLinkService2;
            }
            synchronized (this) {
                appLinkService = AppLinkService.instance;
                if (appLinkService == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    appLinkService = new AppLinkService(applicationContext, null);
                    AppLinkService.instance = appLinkService;
                }
            }
            return appLinkService;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppLinkService(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object createAppLink$default(AppLinkService appLinkService, String str, String str2, String str3, String str4, Map map, Boolean bool, Boolean bool2, String str5, Boolean bool3, Boolean bool4, String str6, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            map = null;
        }
        if ((i10 & 32) != 0) {
            bool = null;
        }
        if ((i10 & 64) != 0) {
            bool2 = null;
        }
        if ((i10 & 128) != 0) {
            str5 = null;
        }
        if ((i10 & 256) != 0) {
            bool3 = null;
        }
        if ((i10 & 512) != 0) {
            bool4 = null;
        }
        if ((i10 & 1024) != 0) {
            str6 = null;
        }
        return appLinkService.createAppLink(str, str2, str3, str4, map, bool, bool2, str5, bool3, bool4, str6, continuation);
    }

    private final void fetchInstallReferrer(final Function1<? super String, Unit> callback) {
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(this.context).build();
        final SharedPreferences sharedPreferences = this.context.getSharedPreferences("AnalyticsData", 0);
        build.startConnection(new InstallReferrerStateListener() { // from class: com.appsonair.applink.services.AppLinkService$fetchInstallReferrer$1
            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
                callback.invoke("Install referrer service disconnected.");
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(int responseCode) {
                Context context;
                JSONObject jsonFromPrefs;
                if (responseCode != 0) {
                    if (responseCode == 1) {
                        callback.invoke("Install referrer service unavailable.");
                        return;
                    } else {
                        if (responseCode != 2) {
                            return;
                        }
                        callback.invoke("Install referrer API not supported on this device.");
                        return;
                    }
                }
                ReferrerDetails installReferrer = InstallReferrerClient.this.getInstallReferrer();
                Intrinsics.checkNotNullExpressionValue(installReferrer, "referrerClient.installReferrer");
                String queryParameter = Uri.parse("https://appsonair.com?" + installReferrer.getInstallReferrer()).getQueryParameter("appsonair_app_link");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (!StringsKt.startsWith$default(queryParameter, "http", false, 2, (Object) null)) {
                    queryParameter = "https://" + queryParameter;
                }
                Uri parse = Uri.parse(queryParameter);
                String lastPathSegment = parse.getLastPathSegment();
                String str = lastPathSegment == null ? "" : lastPathSegment;
                String host = parse.getHost();
                String str2 = host == null ? "" : host;
                if (sharedPreferences.getBoolean("isAppInstalled", false)) {
                    AppLinkService appLinkService = this;
                    context = appLinkService.context;
                    jsonFromPrefs = appLinkService.getJsonFromPrefs(context, "referral_details");
                    AppLinkService appLinkService2 = this;
                    if (jsonFromPrefs == null) {
                        jsonFromPrefs = new JSONObject();
                    }
                    appLinkService2.referralLink = jsonFromPrefs;
                } else {
                    sharedPreferences.edit().putBoolean("isAppInstalled", true).apply();
                    if (str.length() <= 0 || str2.length() <= 0) {
                        AbstractC1459k.d(Q.a(C1452g0.c()), null, null, new AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2(this, null), 3, null);
                    } else {
                        AppLinkHandler.INSTANCE.handleLinkCount(str, str2, false, true, true);
                        String uri = parse.toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "schemeUri.toString()");
                        if (uri.length() > 0) {
                            AbstractC1459k.d(Q.a(C1452g0.c()), null, null, new AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1(this, str2, str, parse, null), 3, null);
                        }
                    }
                }
                Function1<String, Unit> function1 = callback;
                String uri2 = parse.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "schemeUri.toString()");
                function1.invoke(uri2);
                InstallReferrerClient.this.endConnection();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:11:0x0037, B:12:0x0056, B:14:0x005e, B:16:0x0064, B:18:0x007d, B:19:0x0084, B:22:0x0087, B:24:0x008e, B:25:0x0095), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFullReferralDetails(String str, String str2, String str3, Continuation<? super JSONObject> continuation) {
        AppLinkService$getFullReferralDetails$1 appLinkService$getFullReferralDetails$1;
        int i10;
        AppLinkService appLinkService;
        InterfaceC1484x interfaceC1484x;
        JSONObject jSONObject;
        InterfaceC1484x interfaceC1484x2;
        if (continuation instanceof AppLinkService$getFullReferralDetails$1) {
            appLinkService$getFullReferralDetails$1 = (AppLinkService$getFullReferralDetails$1) continuation;
            int i11 = appLinkService$getFullReferralDetails$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appLinkService$getFullReferralDetails$1.label = i11 - Integer.MIN_VALUE;
                Object obj = appLinkService$getFullReferralDetails$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = appLinkService$getFullReferralDetails$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        AppLinkHandler.Companion companion = AppLinkHandler.INSTANCE;
                        appLinkService$getFullReferralDetails$1.L$0 = this;
                        appLinkService$getFullReferralDetails$1.L$1 = str3;
                        appLinkService$getFullReferralDetails$1.label = 1;
                        obj = companion.fetchAppLink(str2, str, appLinkService$getFullReferralDetails$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appLinkService = this;
                    } catch (Exception unused) {
                        appLinkService = this;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("message", "AppLink referral does not exist!");
                        interfaceC1484x = appLinkService.referralDeferred;
                        if (interfaceC1484x != null) {
                        }
                        appLinkService.referralDeferred = null;
                        appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject2);
                        return jSONObject2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) appLinkService$getFullReferralDetails$1.L$1;
                    appLinkService = (AppLinkService) appLinkService$getFullReferralDetails$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused2) {
                        JSONObject jSONObject22 = new JSONObject();
                        jSONObject22.put("message", "AppLink referral does not exist!");
                        interfaceC1484x = appLinkService.referralDeferred;
                        if (interfaceC1484x != null) {
                            Boxing.boxBoolean(interfaceC1484x.A0(jSONObject22));
                        }
                        appLinkService.referralDeferred = null;
                        appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject22);
                        return jSONObject22;
                    }
                }
                jSONObject = (JSONObject) obj;
                if (jSONObject.has(EventKeys.DATA) || jSONObject.isNull(EventKeys.DATA)) {
                    jSONObject.put("message", "AppLink referral does not exist!");
                    interfaceC1484x2 = appLinkService.referralDeferred;
                    if (interfaceC1484x2 != null) {
                        Boxing.boxBoolean(interfaceC1484x2.A0(jSONObject));
                    }
                    appLinkService.referralDeferred = null;
                    appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject);
                    return jSONObject;
                }
                jSONObject.getJSONObject(EventKeys.DATA).put("referralLink", str3);
                jSONObject.put("message", "Referral link fetched successfully!");
                appLinkService.referralLink = jSONObject;
                appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject);
                InterfaceC1484x interfaceC1484x3 = appLinkService.referralDeferred;
                if (interfaceC1484x3 != null) {
                    Boxing.boxBoolean(interfaceC1484x3.A0(jSONObject));
                }
                appLinkService.referralDeferred = null;
                return jSONObject;
            }
        }
        appLinkService$getFullReferralDetails$1 = new AppLinkService$getFullReferralDetails$1(this, continuation);
        Object obj2 = appLinkService$getFullReferralDetails$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = appLinkService$getFullReferralDetails$1.label;
        if (i10 != 0) {
        }
        jSONObject = (JSONObject) obj2;
        if (jSONObject.has(EventKeys.DATA)) {
        }
        jSONObject.put("message", "AppLink referral does not exist!");
        interfaceC1484x2 = appLinkService.referralDeferred;
        if (interfaceC1484x2 != null) {
        }
        appLinkService.referralDeferred = null;
        appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject getJsonFromPrefs(Context context, String key) {
        String string = context.getSharedPreferences("Referral", 0).getString(key, null);
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserAgent() {
        String userAgentString = new WebView(this.context).getSettings().getUserAgentString();
        return userAgentString == null ? "" : userAgentString;
    }

    public static /* synthetic */ void handleDeepLink$default(AppLinkService appLinkService, Intent intent, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        appLinkService.handleDeepLink(intent, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFallback(String packageName, String fallbackUrl, String source) {
        if (fallbackUrl == null || fallbackUrl.length() == 0) {
            return;
        }
        openFallbackUrl(fallbackUrl);
    }

    public static /* synthetic */ void handleFallback$default(AppLinkService appLinkService, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        appLinkService.handleFallback(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeepLinkError(Uri uri, String error) {
        AppLinkListener appLinkListener = this.listener;
        if (appLinkListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            appLinkListener = null;
        }
        appLinkListener.onDeepLinkError(uri, error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeepLinkProcessed(Uri uri) {
        AbstractC1459k.d(Q.a(C1452g0.c()), null, null, new AppLinkService$onDeepLinkProcessed$1(uri, this, null), 3, null);
    }

    private final void openFallbackUrl(String fallbackUrl) {
        Uri parse = Uri.parse(fallbackUrl);
        try {
            Context context = this.context;
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            onDeepLinkError(parse, "Failed to open fallback URL: " + e10.getMessage());
        }
    }

    private final void saveJsonToPrefs(Context context, String key, JSONObject jsonObject) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Referral", 0).edit();
        edit.putString(key, jsonObject.toString());
        edit.apply();
    }

    @Nullable
    public final Object createAppLink(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str6, @NotNull Continuation<? super JSONObject> continuation) {
        return AppLinkHandler.INSTANCE.createAppLink(str, str2, str3, str4, map, bool, bool2, str5, bool3, bool4, str6, continuation);
    }

    @Deprecated(message = "Use getReferralInfo() instead", replaceWith = @ReplaceWith(expression = "getReferralInfo()", imports = {}))
    @NotNull
    /* renamed from: getReferralDetails, reason: from getter */
    public final JSONObject getReferralLink() {
        return this.referralLink;
    }

    @Nullable
    public final Object getReferralInfo(@NotNull Continuation<? super JSONObject> continuation) {
        if (this.referralLink.length() > 0) {
            return this.referralLink;
        }
        JSONObject jsonFromPrefs = getJsonFromPrefs(this.context, "referral_details");
        if (jsonFromPrefs != null && jsonFromPrefs.length() > 0) {
            this.referralLink = jsonFromPrefs;
            return jsonFromPrefs;
        }
        InterfaceC1484x b10 = AbstractC1488z.b(null, 1, null);
        this.referralDeferred = b10;
        Intrinsics.checkNotNull(b10);
        return b10.await(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getReferralUsingIp(@NotNull Continuation<? super Unit> continuation) {
        AppLinkService$getReferralUsingIp$1 appLinkService$getReferralUsingIp$1;
        Object coroutine_suspended;
        int i10;
        AppLinkService appLinkService;
        AppLinkService appLinkService2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        InterfaceC1484x interfaceC1484x;
        AppLinkListener appLinkListener;
        if (continuation instanceof AppLinkService$getReferralUsingIp$1) {
            appLinkService$getReferralUsingIp$1 = (AppLinkService$getReferralUsingIp$1) continuation;
            int i11 = appLinkService$getReferralUsingIp$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appLinkService$getReferralUsingIp$1.label = i11 - Integer.MIN_VALUE;
                Object obj = appLinkService$getReferralUsingIp$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = appLinkService$getReferralUsingIp$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String userAgent = getUserAgent();
                    AppLinkHandler.Companion companion = AppLinkHandler.INSTANCE;
                    appLinkService$getReferralUsingIp$1.L$0 = this;
                    appLinkService$getReferralUsingIp$1.label = 1;
                    obj = companion.getReferralLinkByIP(userAgent, appLinkService$getReferralUsingIp$1);
                    if (obj != coroutine_suspended) {
                        appLinkService = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) appLinkService$getReferralUsingIp$1.L$2;
                    jSONObject2 = (JSONObject) appLinkService$getReferralUsingIp$1.L$1;
                    appLinkService2 = (AppLinkService) appLinkService$getReferralUsingIp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    interfaceC1484x = appLinkService2.referralDeferred;
                    if (interfaceC1484x != null) {
                        Boxing.boxBoolean(interfaceC1484x.A0(jSONObject2));
                    }
                    appLinkListener = appLinkService2.listener;
                    if (appLinkListener == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("listener");
                        appLinkListener = null;
                    }
                    appLinkListener.onReferralLinkDetected(jSONObject2);
                    if (jSONObject != null) {
                        String shortId = jSONObject.optString("shortId", "");
                        String referralLink = jSONObject.optString("referralLink", "");
                        Intrinsics.checkNotNullExpressionValue(shortId, "shortId");
                        if (shortId.length() > 0) {
                            Intrinsics.checkNotNullExpressionValue(referralLink, "referralLink");
                            if (referralLink.length() > 0) {
                                String domain = new URI(referralLink).getHost();
                                AppLinkHandler.Companion companion2 = AppLinkHandler.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(domain, "domain");
                                companion2.handleLinkCount(shortId, domain, false, true, true);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                appLinkService = (AppLinkService) appLinkService$getReferralUsingIp$1.L$0;
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject3 = (JSONObject) obj;
                JSONObject optJSONObject = jSONObject3.optJSONObject(EventKeys.DATA);
                appLinkService.referralLink = jSONObject3;
                appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject3);
                appLinkService$getReferralUsingIp$1.L$0 = appLinkService;
                appLinkService$getReferralUsingIp$1.L$1 = jSONObject3;
                appLinkService$getReferralUsingIp$1.L$2 = optJSONObject;
                appLinkService$getReferralUsingIp$1.label = 2;
                if (AbstractC1440a0.a(500L, appLinkService$getReferralUsingIp$1) != coroutine_suspended) {
                    appLinkService2 = appLinkService;
                    jSONObject = optJSONObject;
                    jSONObject2 = jSONObject3;
                    interfaceC1484x = appLinkService2.referralDeferred;
                    if (interfaceC1484x != null) {
                    }
                    appLinkListener = appLinkService2.listener;
                    if (appLinkListener == null) {
                    }
                    appLinkListener.onReferralLinkDetected(jSONObject2);
                    if (jSONObject != null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        appLinkService$getReferralUsingIp$1 = new AppLinkService$getReferralUsingIp$1(this, continuation);
        Object obj2 = appLinkService$getReferralUsingIp$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = appLinkService$getReferralUsingIp$1.label;
        if (i10 != 0) {
        }
        JSONObject jSONObject32 = (JSONObject) obj2;
        JSONObject optJSONObject2 = jSONObject32.optJSONObject(EventKeys.DATA);
        appLinkService.referralLink = jSONObject32;
        appLinkService.saveJsonToPrefs(appLinkService.context, "referral_details", jSONObject32);
        appLinkService$getReferralUsingIp$1.L$0 = appLinkService;
        appLinkService$getReferralUsingIp$1.L$1 = jSONObject32;
        appLinkService$getReferralUsingIp$1.L$2 = optJSONObject2;
        appLinkService$getReferralUsingIp$1.label = 2;
        if (AbstractC1440a0.a(500L, appLinkService$getReferralUsingIp$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final void handleDeepLink(@NotNull Intent intent, @NotNull String fallbackPackageName, @Nullable String source, @Nullable String fallbackUrl) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(fallbackPackageName, "fallbackPackageName");
        Uri data = intent.getData();
        if (data != null) {
            AbstractC1459k.d(Q.a(C1452g0.c()), null, null, new AppLinkService$handleDeepLink$1(this, data, fallbackPackageName, fallbackUrl, source, null), 3, null);
        }
    }

    public final void initialize(@NotNull Context context, @NotNull Intent intent, @NotNull AppLinkListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        NetworkWatcherService.INSTANCE.checkNetworkConnection(context);
        AppLinkHandler.INSTANCE.setAppsOnAirAppId$applink_release(CoreService.INSTANCE.getAppId(context));
        fetchInstallReferrer(new Function1<String, Unit>() { // from class: com.appsonair.applink.services.AppLinkService$initialize$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        });
        handleDeepLink$default(this, intent, "com.example.appsonair_android_applink", null, null, 12, null);
    }

    private AppLinkService(Context context) {
        this.context = context;
        this.referralLink = new JSONObject();
    }
}
