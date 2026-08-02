package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class gv extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2266 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2267 = -4174718550658798707L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2268 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int packedPositionGroup;
        int i = 2 % 2;
        int i2 = f2266 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2268 = i2 % 128;
        if (i2 % 2 == 0) {
            ExpandableListView.getPackedPositionGroup(1L);
            packedPositionGroup = 0;
        } else {
            packedPositionGroup = 1 - ExpandableListView.getPackedPositionGroup(0L);
        }
        String intern = m7819("疅痦塚\ue366\uf3b8됑盙瑐\udbd9Ǣ\ue658쓹⦀志僊⬾罷\uee17芢祼촼㱣\ueca2코ዥ䪠嵖ᶋ惑飾轗揪뚄㛆年눷Ћ䔧⮰v樲鍞闥噎믣↻옐ꒆ\u09c9翶", packedPositionGroup).intern();
        int i3 = f2268 + 109;
        f2266 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2266 + 43;
        int i3 = i2 % 128;
        f2268 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 107;
        f2266 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return PlacementType.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bo boVar = new bo(mo7797());
        int i2 = f2268 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2266 = i2 % 128;
        int i3 = i2 % 2;
        return boVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2266 + 43;
        f2268 = i2 % 128;
        String intern = m7819("㳀㲨䡢\uf389\ue396ꓣ髩頼銙ᇛ", i2 % 2 == 0 ? ViewConfiguration.getKeyRepeatDelay() - 48 : (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern();
        int i3 = f2266 + 113;
        f2268 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7819(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2267, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2267));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
