package com.playtika.pras.sdk.network.models.results;

import android.os.Bundle;
import com.playtika.pras.sdk.network.PPSResponse;
import com.playtika.pras.sdk.network.ResponseCode;

/* loaded from: classes6.dex */
public class BillingResult {
    public static final String BUNDLE_RESPONSE_CODE = "RESPONSE_CODE";
    private final PPSResponse response;
    private final ResponseCode responseCode;

    public BillingResult(ResponseCode responseCode) {
        this(responseCode, null);
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(BUNDLE_RESPONSE_CODE, this.responseCode.getCode());
        return bundle;
    }

    public <T extends PPSResponse> T getResponse() {
        return (T) this.response;
    }

    public final Bundle toBundle() {
        return getBundle();
    }

    public BillingResult(PPSResponse pPSResponse) {
        this(pPSResponse.getResponseCode(), pPSResponse);
    }

    private BillingResult(ResponseCode responseCode, PPSResponse pPSResponse) {
        this.response = pPSResponse;
        this.responseCode = responseCode;
    }
}
