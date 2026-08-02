package com.moloco.sdk.internal.client_metrics_data;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitAttempt("sdk_init_attempt"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitSuccess("sdk_init_success"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitFailure("sdk_init_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKPerformInitAttempt("sdk_perform_init_attempt"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKFetchInitAttempt("sdk_fetch_init_attempt"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitCacheRead("sdk_init_cache_read"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitCacheWrite("sdk_init_cache_write"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitCacheClear("sdk_init_cache_clear"),
    /* JADX INFO: Fake field, exist only in values array */
    SDKInitFailureDifferentAppKey("sdk_init_failure_different_app_key"),
    /* JADX INFO: Fake field, exist only in values array */
    CreateAd("create_ad"),
    /* JADX INFO: Fake field, exist only in values array */
    LoadAdAttempt("load_ad_attempted"),
    /* JADX INFO: Fake field, exist only in values array */
    LoadAdSuccess("load_ad_success"),
    /* JADX INFO: Fake field, exist only in values array */
    LoadAdFailed("load_ad_failed"),
    /* JADX INFO: Fake field, exist only in values array */
    NativeAdLoadAdAttempted("native_ad_load_attempted"),
    /* JADX INFO: Fake field, exist only in values array */
    NativeLoadAd("native_ad_load"),
    /* JADX INFO: Fake field, exist only in values array */
    BidTokenGetRequest("bid_token_get_request"),
    /* JADX INFO: Fake field, exist only in values array */
    BidTokenGetResponse("bid_token_get_response"),
    /* JADX INFO: Fake field, exist only in values array */
    BidTokenFetch("bid_token_fetch"),
    /* JADX INFO: Fake field, exist only in values array */
    BidTokenDurationTimeoutOneSecond("bid_token_duration_crossed_1s"),
    /* JADX INFO: Fake field, exist only in values array */
    BidTokenDurationTimeoutThreeSecond("bid_token_duration_crossed_3s"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerBidTokenFetch("sbt_fetch"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerBidTokenCached("sbt_cached"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerBidTokenApiFetch("sbt_api_fetch"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerBidTokenAsyncRefresh("sbt_async_fetch"),
    /* JADX INFO: Fake field, exist only in values array */
    ClientBidTokenBuild("bid_token_build"),
    /* JADX INFO: Fake field, exist only in values array */
    ClientBidTokenCached("cbt_cached"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowAdAttempt("show_ad_attempted"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowAdSuccess("show_ad_success"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowAdFailed("show_ad_failed"),
    /* JADX INFO: Fake field, exist only in values array */
    AdClicked("ad_clicked"),
    /* JADX INFO: Fake field, exist only in values array */
    AdClickedDeduped("ad_clicked_deduped"),
    /* JADX INFO: Fake field, exist only in values array */
    CrashDetected("crash_detected"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewLoadAd("webview_load_ad"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewHtmlAdError("webview_html_ad_error"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewHtmlAdRetryAttempt("webview_html_ad_retry_attempt"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewHtmlAdIgnoredError("webview_html_ad_ignored_error"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewEventHandled("webview_event_handled"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewEventMultipleHandlers("webview_event_multiple_handlers"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewPageLoadStart("webview_page_load_start"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewPageLoadEnd("webview_page_load_end"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewPageLoadFinishCallback("webview_page_load_finish_callback"),
    /* JADX INFO: Fake field, exist only in values array */
    WebviewRequiredContentLoaded("webview_required_content_loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    StoreLaunchStarted("store_launch_started"),
    /* JADX INFO: Fake field, exist only in values array */
    StoreLaunchComplete("store_launch_complete"),
    /* JADX INFO: Fake field, exist only in values array */
    TemplateBridgeNotifyReadyInvoked("template_bridge_notify_ready_invoked"),
    /* JADX INFO: Fake field, exist only in values array */
    TemplateBridgeNotifyReadyCompleted("template_bridge_notify_ready_completed"),
    /* JADX INFO: Fake field, exist only in values array */
    TemplateBridgeViewVisibleInvoked("template_bridge_view_visible_invoked"),
    /* JADX INFO: Fake field, exist only in values array */
    TemplateBridgeViewVisibleCompleted("template_bridge_view_visible_completed"),
    /* JADX INFO: Fake field, exist only in values array */
    FullscreenWebviewActivityOnCreate("fullscreen_webview_activity_create"),
    /* JADX INFO: Fake field, exist only in values array */
    RewardIssued("reward_issued"),
    /* JADX INFO: Fake field, exist only in values array */
    UnknownCreativeType("unknown_creative_type"),
    /* JADX INFO: Fake field, exist only in values array */
    WebViewNotAvailable("webview_not_available"),
    /* JADX INFO: Fake field, exist only in values array */
    VastShowFileNotExists("vast_show_file_not_exists"),
    /* JADX INFO: Fake field, exist only in values array */
    SoftwareRenderingDetected("software_rendering_detected"),
    /* JADX INFO: Fake field, exist only in values array */
    ExoPlayerError("exoplayer_error"),
    /* JADX INFO: Fake field, exist only in values array */
    AdHidden("ad_hidden"),
    /* JADX INFO: Fake field, exist only in values array */
    NativeAdComposeViewNotAvailable("native_ad_compose_not_available"),
    /* JADX INFO: Fake field, exist only in values array */
    FullscreenAdComposeViewNotAvailable("fullscreen_ad_compose_not_available"),
    /* JADX INFO: Fake field, exist only in values array */
    CreativeRenderingCheck("creative_rendering_check");

    public final String a;

    a(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
