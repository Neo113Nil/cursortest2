package ru.ozon.app.android.analytics.plugins.af;

import AA.c;
import Ay.C2452a;
import Lm0.a;
import Ml.C3639a;
import Nc.C3667a;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import io.reactivex.p;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010'\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u001c0\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R8\u0010)\u001a&\u0012\f\u0012\n &*\u0004\u0018\u00010\u001c0\u001c &*\u0012\u0012\f\u0012\n &*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorageImpl;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "Landroid/content/Context;", "context", "Lcom/appsflyer/AppsFlyerLib;", "appsFlyerLib", "<init>", "(Landroid/content/Context;Lcom/appsflyer/AppsFlyerLib;)V", "", "link", "Ljava/net/URI;", "parseLink", "(Ljava/lang/String;)Ljava/net/URI;", "", "", "map", "Landroid/net/Uri;", "getDeeplink", "(Ljava/util/Map;)Landroid/net/Uri;", "decodedOrThis", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "start", "()V", "uri", "performDeeplink", "(Landroid/net/Uri;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "observeResult", "()Lio/reactivex/p;", "observeDeferredResult", "Landroid/content/Context;", "Lcom/appsflyer/AppsFlyerLib;", "", "isDeferredEnabled", "Z", "LNc/a;", "kotlin.jvm.PlatformType", "oneLinkListener", "LNc/a;", "oneLinkResultListener", "Lio/reactivex/p;", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerConversionStorageImpl implements AppsFlyerConversionStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppsFlyerLib appsFlyerLib;

    @NotNull
    private final Context context;
    private volatile boolean isDeferredEnabled;

    @NotNull
    private final C3667a<AppsFlyerDeeplinkResult> oneLinkListener;
    private final p<AppsFlyerDeeplinkResult> oneLinkResultListener;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorageImpl$Companion;", "", "<init>", "()V", "AF_DP_URL", "", "AF_STATUS", "AF_STATUS_NON_ORGANIC", "AF_IS_FIRST_LAUNCH", "AF_DEEPLINK_VALUE", "AF_UTM_PREFIX", "ERROR_TIMEOUT", "", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppsFlyerConversionStorageImpl(@NotNull Context context, @NotNull AppsFlyerLib appsFlyerLib) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        this.context = context;
        this.appsFlyerLib = appsFlyerLib;
        this.isDeferredEnabled = true;
        C3667a<AppsFlyerDeeplinkResult> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.oneLinkListener = d11;
        this.oneLinkResultListener = d11.doOnNext(new C3639a(new AppsFlyerConversionStorageImpl$oneLinkResultListener$1(this)));
    }

    private final Uri decodedOrThis(Uri uri) {
        if (uri.getAuthority() != null) {
            return uri;
        }
        Uri parse = Uri.parse(Uri.decode(uri.toString()));
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return parse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri getDeeplink(Map<String, ? extends Object> map) {
        String obj;
        Object obj2 = map.get("af_dp");
        if (obj2 == null || (obj = obj2.toString()) == null) {
            return null;
        }
        Uri parse = Uri.parse(obj);
        Uri.Builder buildUpon = parse.buildUpon();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                if (parse.getQueryParameter(str) == null && h.e0(str, "utm_", false)) {
                    buildUpon.appendQueryParameter(str, value.toString());
                }
            } catch (RuntimeException e11) {
                a.f17149a.e(e11);
                return null;
            }
        }
        Uri build = buildUpon.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return decodedOrThis(build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeDeferredResult$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeResult$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    private final URI parseLink(String link) {
        try {
            return URI.create(link);
        } catch (IllegalArgumentException unused) {
            return URI.create(Uri.encode(Uri.decode(link).toString(), "/,:,&,?,=").toString());
        }
    }

    @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage
    @NotNull
    public p<AppsFlyerDeeplinkResult> observeDeferredResult() {
        p<AppsFlyerDeeplinkResult> filter = this.oneLinkResultListener.filter(new C2452a(AppsFlyerConversionStorageImpl$observeDeferredResult$1.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        return filter;
    }

    @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage
    @NotNull
    public p<AppsFlyerDeeplinkResult> observeResult() {
        p<AppsFlyerDeeplinkResult> filter = this.oneLinkResultListener.filter(new c(AppsFlyerConversionStorageImpl$observeResult$1.INSTANCE, 2));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        return filter;
    }

    @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage
    public void performDeeplink(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.isDeferredEnabled = false;
        this.oneLinkListener.onNext(AppsFlyerDeeplinkResult.Nan.INSTANCE);
        AppsFlyerLib appsFlyerLib = this.appsFlyerLib;
        Context context = this.context;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        appsFlyerLib.performOnAppAttribution(context, parseLink(uri2));
    }

    @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage
    public void start() {
        AppsFlyerConversionListener appsFlyerConversionListener = new AppsFlyerConversionListener() { // from class: ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorageImpl$start$conversionListener$1
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                Uri deeplink;
                C3667a c3667a;
                C3667a c3667a2;
                Intrinsics.checkNotNullParameter(map, "map");
                deeplink = AppsFlyerConversionStorageImpl.this.getDeeplink(map);
                if (deeplink != null) {
                    c3667a2 = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                    c3667a2.onNext(new AppsFlyerDeeplinkResult.Success(deeplink, false));
                } else {
                    c3667a = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                    c3667a.onNext(new AppsFlyerDeeplinkResult.Failure(false));
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String s11) {
                C3667a c3667a;
                Intrinsics.checkNotNullParameter(s11, "s");
                c3667a = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                c3667a.onNext(new AppsFlyerDeeplinkResult.Failure(false));
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String s11) {
                C3667a c3667a;
                Intrinsics.checkNotNullParameter(s11, "s");
                c3667a = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                c3667a.onNext(new AppsFlyerDeeplinkResult.Failure(true));
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
            
                r4 = r3.this$0.getDeeplink(r4);
             */
            @Override // com.appsflyer.AppsFlyerConversionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onConversionDataSuccess(Map<String, ? extends Object> map) {
                boolean z11;
                C3667a c3667a;
                Uri deeplink;
                C3667a c3667a2;
                C3667a c3667a3;
                String obj;
                Boolean t02;
                C3667a c3667a4;
                Intrinsics.checkNotNullParameter(map, "map");
                z11 = AppsFlyerConversionStorageImpl.this.isDeferredEnabled;
                if (z11) {
                    Object obj2 = map.get("af_status");
                    if (!Intrinsics.d(obj2 != null ? obj2.toString() : null, "Non-organic")) {
                        c3667a4 = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                        c3667a4.onNext(new AppsFlyerDeeplinkResult.Failure(true));
                        return;
                    }
                    Object obj3 = map.get("is_first_launch");
                    if (!((obj3 == null || (obj = obj3.toString()) == null || (t02 = h.t0(obj)) == null) ? false : t02.booleanValue())) {
                        c3667a3 = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                        c3667a3.onNext(new AppsFlyerDeeplinkResult.Failure(true));
                    } else if (map.containsKey("deep_link_value") || deeplink == null) {
                        c3667a = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                        c3667a.onNext(new AppsFlyerDeeplinkResult.Failure(true));
                    } else {
                        c3667a2 = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                        c3667a2.onNext(new AppsFlyerDeeplinkResult.Success(deeplink, true));
                    }
                }
            }
        };
        String appsFlyerToken = AppsFlyerSecretKt.getAppsFlyerToken();
        this.appsFlyerLib.init(appsFlyerToken, appsFlyerConversionListener, this.context);
        this.appsFlyerLib.start(this.context, appsFlyerToken, new AppsFlyerRequestListener() { // from class: ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorageImpl$start$1
            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
            public void onError(int code, String error) {
                C3667a c3667a;
                C3667a c3667a2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (code == 10) {
                    return;
                }
                c3667a = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                AppsFlyerDeeplinkResult appsFlyerDeeplinkResult = (AppsFlyerDeeplinkResult) c3667a.f();
                if (appsFlyerDeeplinkResult == null || appsFlyerDeeplinkResult.equals(AppsFlyerDeeplinkResult.Nan.INSTANCE)) {
                    c3667a2 = AppsFlyerConversionStorageImpl.this.oneLinkListener;
                    c3667a2.onNext(new AppsFlyerDeeplinkResult.Failure(false));
                }
            }

            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
            public void onSuccess() {
            }
        });
    }
}
