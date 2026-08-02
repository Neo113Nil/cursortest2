package P2;

import P2.a;
import P2.o;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f8749a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f8751b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c, reason: collision with root package name */
    public static final a.e f8753c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d, reason: collision with root package name */
    public static final a.c f8755d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e, reason: collision with root package name */
    public static final a.f f8757e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: f, reason: collision with root package name */
    public static final a.f f8759f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: g, reason: collision with root package name */
    public static final a.f f8761g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h, reason: collision with root package name */
    public static final a.f f8763h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i, reason: collision with root package name */
    public static final a.f f8765i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j, reason: collision with root package name */
    public static final a.f f8767j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k, reason: collision with root package name */
    public static final a.c f8769k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l, reason: collision with root package name */
    public static final a.c f8771l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m, reason: collision with root package name */
    public static final a.c f8773m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n, reason: collision with root package name */
    public static final a.c f8775n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o, reason: collision with root package name */
    public static final a.c f8777o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p, reason: collision with root package name */
    public static final a.c f8779p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q, reason: collision with root package name */
    public static final a.b f8781q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r, reason: collision with root package name */
    public static final a.b f8783r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s, reason: collision with root package name */
    public static final a.c f8785s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t, reason: collision with root package name */
    public static final a.f f8787t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u, reason: collision with root package name */
    public static final a.c f8789u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v, reason: collision with root package name */
    public static final a.b f8791v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w, reason: collision with root package name */
    public static final a.b f8792w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x, reason: collision with root package name */
    public static final a.f f8793x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y, reason: collision with root package name */
    public static final a.f f8794y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z, reason: collision with root package name */
    public static final a.f f8795z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: A, reason: collision with root package name */
    public static final a.b f8723A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B, reason: collision with root package name */
    public static final a.b f8724B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C, reason: collision with root package name */
    public static final a.d f8725C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: D, reason: collision with root package name */
    public static final a.b f8726D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E, reason: collision with root package name */
    public static final a.b f8727E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F, reason: collision with root package name */
    public static final a.b f8728F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G, reason: collision with root package name */
    public static final a.b f8729G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H, reason: collision with root package name */
    public static final a.e f8730H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I, reason: collision with root package name */
    public static final a.e f8731I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J, reason: collision with root package name */
    public static final a.h f8732J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K, reason: collision with root package name */
    public static final a.h f8733K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L, reason: collision with root package name */
    public static final a.g f8734L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M, reason: collision with root package name */
    public static final o.b f8735M = new o.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N, reason: collision with root package name */
    public static final o.a f8736N = new o.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: O, reason: collision with root package name */
    public static final o.a f8737O = new o.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");

    /* renamed from: P, reason: collision with root package name */
    public static final a.h f8738P = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: Q, reason: collision with root package name */
    public static final a.i f8739Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: R, reason: collision with root package name */
    public static final a.d f8740R = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: S, reason: collision with root package name */
    public static final a.d f8741S = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: T, reason: collision with root package name */
    public static final a.h f8742T = new a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: U, reason: collision with root package name */
    public static final a.d f8743U = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: V, reason: collision with root package name */
    public static final a.d f8744V = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: W, reason: collision with root package name */
    public static final a.d f8745W = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: X, reason: collision with root package name */
    public static final a.d f8746X = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: Y, reason: collision with root package name */
    public static final a.d f8747Y = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Z, reason: collision with root package name */
    public static final a.d f8748Z = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: a0, reason: collision with root package name */
    public static final a.d f8750a0 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: b0, reason: collision with root package name */
    public static final a.d f8752b0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: c0, reason: collision with root package name */
    public static final a.d f8754c0 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: d0, reason: collision with root package name */
    public static final a.d f8756d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: e0, reason: collision with root package name */
    public static final a.d f8758e0 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: f0, reason: collision with root package name */
    public static final a.d f8760f0 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: g0, reason: collision with root package name */
    public static final a.d f8762g0 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* renamed from: h0, reason: collision with root package name */
    public static final a.d f8764h0 = new a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* renamed from: i0, reason: collision with root package name */
    public static final a.d f8766i0 = new a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* renamed from: j0, reason: collision with root package name */
    public static final a.d f8768j0 = new a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* renamed from: k0, reason: collision with root package name */
    public static final a.d f8770k0 = new a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* renamed from: l0, reason: collision with root package name */
    public static final a.d f8772l0 = new c("PREFETCH_URL_V4", "PREFETCH_URL_V4");

    /* renamed from: m0, reason: collision with root package name */
    public static final a.d f8774m0 = new a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* renamed from: n0, reason: collision with root package name */
    public static final a.d f8776n0 = new a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* renamed from: o0, reason: collision with root package name */
    public static final a.d f8778o0 = new a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");

    /* renamed from: p0, reason: collision with root package name */
    public static final a.d f8780p0 = new a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* renamed from: q0, reason: collision with root package name */
    public static final a.d f8782q0 = new a.d("SAVE_STATE", "SAVE_STATE");

    /* renamed from: r0, reason: collision with root package name */
    public static final a.d f8784r0 = new a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* renamed from: s0, reason: collision with root package name */
    public static final a.d f8786s0 = new a.d("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* renamed from: t0, reason: collision with root package name */
    public static final a.d f8788t0 = new a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* renamed from: u0, reason: collision with root package name */
    public static final a.d f8790u0 = new a.d("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");

    public class a extends a.i {

        /* renamed from: d, reason: collision with root package name */
        public final Pattern f8796d;

        public a(String str, String str2) {
            super(str, str2);
            this.f8796d = Pattern.compile("\\A\\d+");
        }

        @Override // P2.a
        public boolean c() {
            boolean c10 = super.c();
            if (!c10 || Build.VERSION.SDK_INT >= 29) {
                return c10;
            }
            PackageInfo c11 = O2.f.c();
            if (c11 == null) {
                return false;
            }
            Matcher matcher = this.f8796d.matcher(c11.versionName);
            return matcher.find() && Integer.parseInt(c11.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public boolean c() {
            if (super.c() && O2.g.a("MULTI_PROCESS")) {
                return O2.f.i();
            }
            return false;
        }
    }

    public class c extends a.d {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public boolean c() {
            if (O2.g.a("MULTI_PROFILE")) {
                return super.c();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, P2.a.d());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.a().equals(str)) {
                hashSet.add(jVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((j) it2.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
