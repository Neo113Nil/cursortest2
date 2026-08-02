package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.x;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface InneractiveAdSpot {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface RequestListener {
        void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class RequestListenerAdapter implements RequestListener {
        public abstract void onInneractiveAdRequestResult(InneractiveAdSpot inneractiveAdSpot, boolean z, InneractiveErrorCode inneractiveErrorCode);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            onInneractiveAdRequestResult(inneractiveAdSpot, false, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            onInneractiveAdRequestResult(inneractiveAdSpot, true, null);
        }
    }

    void addUnitController(InneractiveUnitController inneractiveUnitController);

    void destroy();

    x getAdContent();

    InneractiveAdRequest getCurrentProcessedRequest();

    String getLocalUniqueId();

    InneractiveMediationName getMediationName();

    String getMediationNameString();

    String getMediationVersion();

    String getRequestedSpotId();

    InneractiveUnitController getSelectedUnitController();

    boolean isReady();

    void loadAd(String str);

    void loadAd(String str, String str2);

    void removeUnitController(InneractiveUnitController inneractiveUnitController);

    void requestAd(InneractiveAdRequest inneractiveAdRequest);

    void setMediationName(InneractiveMediationName inneractiveMediationName);

    void setMediationName(String str);

    void setMediationVersion(String str);

    void setRequestListener(RequestListener requestListener);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class NativeAdRequestListener implements RequestListener {
        public abstract void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        }
    }
}
