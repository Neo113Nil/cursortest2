package com.moloco.sdk.internal.client_metrics_data;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    SDKInit("sdk_init_time"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKPerformInitAttempt("sdk_perform_init_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitHttpRequest("sdk_init_request_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitCacheRead("sdk_init_cache_read_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitCacheWrite("sdk_init_cache_write_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitCacheClear("sdk_init_cache_clear_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    CreateAd("create_ad_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    CreateAdAwaitAdFactory("create_ad_await_ad_factory_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    LoadAd("load_ad_time"),
    /* JADX INFO: Fake field, exist only in values array */
    NativePrepareAd("native_ad_load_prepare_time"),
    /* JADX INFO: Fake field, exist only in values array */
    BidTokenFetch("bid_token_fetch_time"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerBidTokenFetch("sbt_fetch_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerBidTokenApiFetchTime("sbt_api_fetch_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    ClientBidTokenBuild("bid_token_build_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    LoadToShow("load_to_show_time"),
    /* JADX INFO: Fake field, exist only in values array */
    CreateToLoad("ad_create_to_load_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewLoadAd("webview_load_ad_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewEventHandled("webview_event_handled_time_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewEventHandlerLatency("webview_event_handler_latency_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewPageLoadLatency("webview_page_load_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewRequiredContentLoadLatency("webview_required_content_load_ms"),
    /* JADX INFO: Fake field, exist only in values array */
    VastShowFileNotExistsLoadToShow("vast_show_file_not_exists_load_to_show_ms");

    public final String a;

    c(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
