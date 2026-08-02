package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y0l {
    public static final s90 a;
    public static final s90 b;
    public static final s90 c;
    public static final s90 d;
    public static final s90 e;
    public static final s90 f;
    public static final s90 g;
    public static final s90 h;
    public static final x0l i;
    public static final s90 j;

    static {
        new s90("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 0);
        new s90("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 0);
        new s90("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 3);
        new s90("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 1);
        new s90("START_SAFE_BROWSING", "START_SAFE_BROWSING", 4);
        new s90("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 4);
        new s90("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 4);
        new s90("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 4);
        new s90("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 4);
        new s90("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 4);
        new s90("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 1);
        new s90("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 1);
        new s90("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 1);
        new s90("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 1);
        new s90("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 1);
        new s90("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 1);
        new s90("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 0);
        new s90("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 0);
        new s90("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 1);
        new s90("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 4);
        new s90("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 1);
        a = new s90("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 0);
        b = new s90("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 0);
        new s90("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 4);
        new s90("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 4);
        c = new s90("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 4);
        new s90("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 0);
        new s90("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 0);
        d = new s90("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", 2);
        new s90("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 0);
        new s90("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 0);
        new s90("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 0);
        new s90("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 0);
        new s90("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 3);
        new s90("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 3);
        new s90("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 6);
        new s90("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 6);
        new s90("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 5);
        new vci();
        new vci();
        new s90("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 6);
        new w0l();
        new s90("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", 2);
        e = new s90("MULTI_PROCESS", "MULTI_PROCESS_QUERY", 2);
        new s90("FORCE_DARK", "FORCE_DARK", 6);
        new s90("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", 2);
        f = new s90("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", 2);
        g = new s90("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", 2);
        new s90("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", 2);
        h = new s90("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", 2);
        new s90("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", 2);
        new s90("GET_COOKIE_INFO", "GET_COOKIE_INFO", 2);
        new s90("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", 2);
        new s90("USER_AGENT_METADATA", "USER_AGENT_METADATA", 2);
        i = new x0l("MULTI_PROFILE", "MULTI_PROFILE", 2);
        new s90("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", 2);
        new s90("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", 2);
        j = new s90("MUTE_AUDIO", "MUTE_AUDIO", 2);
        new s90("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", 2);
        new s90("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", 2);
        new s90("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", 2);
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        Set<t90> unmodifiableSet = Collections.unmodifiableSet(t90.c);
        HashSet hashSet = new HashSet();
        for (t90 t90Var : unmodifiableSet) {
            if (t90Var.a.equals(str)) {
                hashSet.add(t90Var);
            }
        }
        if (hashSet.isEmpty()) {
            cp4.h("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            t90 t90Var2 = (t90) it.next();
            if (t90Var2.a() || t90Var2.b()) {
                return true;
            }
        }
        return false;
    }
}
