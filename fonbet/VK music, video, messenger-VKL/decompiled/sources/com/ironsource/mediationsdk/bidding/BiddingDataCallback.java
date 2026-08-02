package com.ironsource.mediationsdk.bidding;

import java.util.Map;

/* loaded from: classes13.dex */
public interface BiddingDataCallback {
    void onFailure(String str);

    void onSuccess(Map<String, Object> map);
}
