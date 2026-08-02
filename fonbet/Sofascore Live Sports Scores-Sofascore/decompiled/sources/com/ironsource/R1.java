package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.lnb;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class R1 {
    private final E0 a;

    public R1(E0 e0) {
        this.a = e0;
    }

    public void a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.a.a(B0.AUCTION_FAILED, hashMap);
    }

    public void b(String str) {
        this.a.a(B0.AUCTION_REQUEST_WATERFALL, com.appsflyer.internal.i.l(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void c(String str) {
        this.a.a(B0.AUCTION_RESULT_WATERFALL, com.appsflyer.internal.i.l(IronSourceConstants.EVENTS_EXT1, str));
    }

    public String a(int i, int i2, int i3, int i4) {
        StringBuilder s = lnb.s(i, i2, "interstitial=", ";rewarded=", ";banner=");
        s.append(i3);
        s.append(";native=");
        s.append(i4);
        return s.toString();
    }

    public void a(@Nullable Double d) {
        HashMap hashMap;
        if (d != null) {
            hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            hashMap = null;
        }
        this.a.a(B0.AUCTION_REQUEST, hashMap);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.a.a(B0.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    public void a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.a.a(B0.AUCTION_SUCCESS, hashMap);
    }

    public void a(String str) {
        this.a.a(B0.AD_FORMAT_CAPPED, com.appsflyer.internal.i.l("auctionId", str));
    }
}
