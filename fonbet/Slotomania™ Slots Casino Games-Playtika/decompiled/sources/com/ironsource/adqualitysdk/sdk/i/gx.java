package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.moloco.sdk.publisher.Moloco;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class gx extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2275 = 6126857728165377889L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2276 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2277 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2277 + 89;
        f2276 = i2 % 128;
        int i3 = i2 % 2;
        return m7821("眂뼓\ue736⼘坸龟잣࿅㟪縋ꙭ\uee2dᙙ平蛙캢\uf6c4㻮攇괯핖ᵨ䕺趈뗷ﷹ◼氂鐢\udc4bѨ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51228).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2276;
        int i3 = i2 + 61;
        f2277 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2277 = i4 % 128;
        if (i4 % 2 != 0) {
            return Moloco.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bv bvVar = new bv(mo7797());
        int i2 = f2277 + 11;
        f2276 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return bvVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2276 + 115;
        f2277 = i2 % 128;
        return (i2 % 2 == 0 ? m7821("県\ufb37潿펥䟦쨓", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) * 35897) : m7821("県\ufb37潿펥䟦쨓", 35897 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7821(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2275);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
