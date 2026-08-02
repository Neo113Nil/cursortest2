package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import xsna.bd3;
import xsna.dez0;
import xsna.odj;

/* loaded from: classes13.dex */
public class T1 {
    private final F0 a;

    public T1(F0 f0) {
        this.a = f0;
    }

    public void a(@Nullable Double d) {
        HashMap hashMap;
        if (d != null) {
            hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            hashMap = null;
        }
        this.a.a(C0.AUCTION_REQUEST, hashMap);
    }

    public void b(String str) {
        this.a.a(C0.AUCTION_REQUEST_WATERFALL, dez0.a(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void c(String str) {
        this.a.a(C0.AUCTION_RESULT_WATERFALL, dez0.a(IronSourceConstants.EVENTS_EXT1, str));
    }

    public String a(int i, int i2, int i3, int i4) {
        return bd3.b(";native=", i3, i4, odj.a(i, i2, "interstitial=", ";rewarded=", ";banner="));
    }

    public void a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.a.a(C0.AUCTION_FAILED, hashMap);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.a.a(C0.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    public void a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.a.a(C0.AUCTION_SUCCESS, hashMap);
    }

    public void a(String str) {
        this.a.a(C0.AD_FORMAT_CAPPED, dez0.a("auctionId", str));
    }
}
