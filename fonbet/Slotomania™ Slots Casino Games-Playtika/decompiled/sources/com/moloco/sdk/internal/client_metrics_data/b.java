package com.moloco.sdk.internal.client_metrics_data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {
    public static final /* synthetic */ b[] e0;
    public static final /* synthetic */ EnumEntries f0;
    public final String g0;
    public static final b a = new b("SDKInitAttempt", 0, "sdk_init_attempt");
    public static final b b = new b("SDKInitSuccess", 1, "sdk_init_success");
    public static final b c = new b("SDKInitFailure", 2, "sdk_init_failure");
    public static final b d = new b("SDKPerformInitAttempt", 3, "sdk_perform_init_attempt");
    public static final b e = new b("SDKFetchInitAttempt", 4, "sdk_fetch_init_attempt");
    public static final b f = new b("SDKInitCacheRead", 5, "sdk_init_cache_read");
    public static final b g = new b("SDKInitCacheWrite", 6, "sdk_init_cache_write");
    public static final b h = new b("SDKInitCacheClear", 7, "sdk_init_cache_clear");
    public static final b i = new b("SDKInitFailureDifferentAppKey", 8, "sdk_init_failure_different_app_key");
    public static final b j = new b("CreateAd", 9, "create_ad");
    public static final b k = new b("LoadAdAttempt", 10, "load_ad_attempted");
    public static final b l = new b("LoadAdSuccess", 11, "load_ad_success");
    public static final b m = new b("LoadAdFailed", 12, "load_ad_failed");
    public static final b n = new b("NativeAdLoadAdAttempted", 13, "native_ad_load_attempted");
    public static final b o = new b("NativeLoadAd", 14, "native_ad_load");
    public static final b p = new b("BidTokenGetRequest", 15, "bid_token_get_request");
    public static final b q = new b("BidTokenGetResponse", 16, "bid_token_get_response");
    public static final b r = new b("BidTokenFetch", 17, "bid_token_fetch");
    public static final b s = new b("BidTokenDurationTimeoutOneSecond", 18, "bid_token_duration_crossed_1s");
    public static final b t = new b("BidTokenDurationTimeoutThreeSecond", 19, "bid_token_duration_crossed_3s");
    public static final b u = new b("ServerBidTokenFetch", 20, "sbt_fetch");
    public static final b v = new b("ServerBidTokenCached", 21, "sbt_cached");
    public static final b w = new b("ServerBidTokenApiFetch", 22, "sbt_api_fetch");
    public static final b x = new b("ServerBidTokenAsyncRefresh", 23, "sbt_async_fetch");
    public static final b y = new b("ClientBidTokenBuild", 24, "bid_token_build");
    public static final b z = new b("ClientBidTokenCached", 25, "cbt_cached");
    public static final b A = new b("ShowAdAttempt", 26, "show_ad_attempted");
    public static final b B = new b("ShowAdSuccess", 27, "show_ad_success");
    public static final b C = new b("ShowAdFailed", 28, "show_ad_failed");
    public static final b D = new b("AdClicked", 29, "ad_clicked");
    public static final b E = new b("AdClickedDeduped", 30, "ad_clicked_deduped");
    public static final b F = new b("CrashDetected", 31, "crash_detected");
    public static final b G = new b("WebviewLoadAd", 32, "webview_load_ad");
    public static final b H = new b("WebviewHtmlAdError", 33, "webview_html_ad_error");
    public static final b I = new b("WebviewHtmlAdRetryAttempt", 34, "webview_html_ad_retry_attempt");
    public static final b J = new b("WebviewHtmlAdIgnoredError", 35, "webview_html_ad_ignored_error");
    public static final b K = new b("WebviewEventHandled", 36, "webview_event_handled");
    public static final b L = new b("WebviewEventMultipleHandlers", 37, "webview_event_multiple_handlers");
    public static final b M = new b("WebviewPageLoadStart", 38, "webview_page_load_start");
    public static final b N = new b("WebviewPageLoadEnd", 39, "webview_page_load_end");
    public static final b O = new b("WebviewPageLoadFinishCallback", 40, "webview_page_load_finish_callback");
    public static final b P = new b("WebviewRequiredContentLoaded", 41, "webview_required_content_loaded");
    public static final b Q = new b("StoreLaunchStarted", 42, "store_launch_started");
    public static final b R = new b("StoreLaunchComplete", 43, "store_launch_complete");
    public static final b S = new b("TemplateBridgeNotifyReadyInvoked", 44, "template_bridge_notify_ready_invoked");
    public static final b T = new b("TemplateBridgeNotifyReadyCompleted", 45, "template_bridge_notify_ready_completed");
    public static final b U = new b("TemplateBridgeViewVisibleInvoked", 46, "template_bridge_view_visible_invoked");
    public static final b V = new b("TemplateBridgeViewVisibleCompleted", 47, "template_bridge_view_visible_completed");
    public static final b W = new b("FullscreenWebviewActivityOnCreate", 48, "fullscreen_webview_activity_create");
    public static final b X = new b("RewardIssued", 49, "reward_issued");
    public static final b Y = new b("UnknownCreativeType", 50, "unknown_creative_type");
    public static final b Z = new b("WebViewNotAvailable", 51, "webview_not_available");
    public static final b a0 = new b("VastShowFileNotExists", 52, "vast_show_file_not_exists");
    public static final b b0 = new b("SoftwareRenderingDetected", 53, "software_rendering_detected");
    public static final b c0 = new b("ExoPlayerError", 54, "exoplayer_error");
    public static final b d0 = new b("AdHidden", 55, "ad_hidden");

    static {
        b[] a2 = a();
        e0 = a2;
        f0 = EnumEntriesKt.enumEntries(a2);
    }

    public b(String str, int i2, String str2) {
        this.g0 = str2;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0};
    }

    public static EnumEntries<b> b() {
        return f0;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e0.clone();
    }

    public final String c() {
        return this.g0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.g0;
    }
}
