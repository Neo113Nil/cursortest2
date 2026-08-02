package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class cp {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f1495 = 56689170983056066L;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1496 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1497;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private dp f1498;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List<cl> f1499 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private be f1500;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private bb f1501;

    /* renamed from: ｋ, reason: contains not printable characters */
    private dc f1502;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private dg f1503;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Context f1504;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m7288(cp cpVar) {
        int i = 2 % 2;
        int i2 = f1497 + 47;
        int i3 = i2 % 128;
        f1496 = i3;
        int i4 = i2 % 2;
        List<cl> list = cpVar.f1499;
        int i5 = i3 + 13;
        f1497 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public cp(Context context, dg dgVar, bb bbVar, dc dcVar, be beVar) {
        this.f1503 = dgVar;
        this.f1501 = bbVar;
        this.f1502 = dcVar;
        this.f1500 = beVar;
        this.f1504 = context.getApplicationContext();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m7299() {
        Iterator<cl> it;
        int i = 2 % 2;
        int i2 = f1496 + 99;
        f1497 = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.f1499.iterator();
            int i3 = 53 / 0;
        } else {
            it = this.f1499.iterator();
        }
        int i4 = f1496 + 23;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            it.next().m7200();
        }
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                cp.m7288(cp.this).clear();
            }
        });
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m7287(dp dpVar) {
        int i = 2 % 2;
        int i2 = f1497 + 23;
        int i3 = i2 % 128;
        f1496 = i3;
        int i4 = i2 % 2;
        if (dpVar != null) {
            this.f1498 = dpVar;
            int i5 = 2 % 2;
        }
        int i6 = i3 + 91;
        f1497 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private synchronized List<cl> m7281() {
        int i = 2 % 2;
        int i2 = f1496 + 53;
        f1497 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f1499 != null) {
            return new ArrayList(this.f1499);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = f1496 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r3.m7582() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        m7282(new com.ironsource.adqualitysdk.sdk.i.cl(r10, r10.f1502, r10.f1500, m7286(r3), r10.f1503.m7478()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r3.m7582() == false) goto L22;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7300() {
        dl dlVar;
        int i = 2 % 2;
        int i2 = f1496 + 89;
        f1497 = i2 % 128;
        if (i2 % 2 == 0) {
            dp m7477 = this.f1503.m7477();
            if (m7477 != null) {
                m7285(m7477);
                if (this.f1500.mo6378()) {
                    int i3 = f1496 + 41;
                    f1497 = i3 % 128;
                    if (i3 % 2 != 0) {
                        jz.m8324(m7477);
                        int i4 = 82 / 0;
                    } else {
                        jz.m8324(m7477);
                    }
                }
            }
            this.f1503.m7478().m7713(m7283("甜畲ￒ̉署赱\ue6f9ꉵ빢쉽돇\ud966\ue365\uf764磺ᑩ", Color.green(0)).intern(), this.f1500);
            Iterator<String> it = this.f1503.m7479().keySet().iterator();
            while (it.hasNext()) {
                int i5 = f1497 + 77;
                f1496 = i5 % 128;
                if (i5 % 2 != 0) {
                    dlVar = this.f1503.m7479().get(it.next());
                } else {
                    dlVar = this.f1503.m7479().get(it.next());
                    int i6 = 60 / 0;
                }
                int i7 = f1497 + 63;
                f1496 = i7 % 128;
                int i8 = i7 % 2;
            }
            m7284(this.f1503, this.f1500);
            return;
        }
        this.f1503.m7477();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private ic m7286(dl dlVar) {
        int i = 2 % 2;
        int i2 = f1496 + 7;
        f1497 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
            if (dlVar == null) {
                return null;
            }
        } else if (dlVar == null) {
            return null;
        }
        ic icVar = new ic(dlVar, m7286(this.f1503.m7479().get(dlVar.m7579())));
        int i4 = f1497 + 41;
        f1496 = i4 % 128;
        int i5 = i4 % 2;
        return icVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m7302() {
        int i = 2 % 2;
        int i2 = f1496 + 99;
        f1497 = i2 % 128;
        int i3 = i2 % 2;
        String m7484 = this.f1503.m7484();
        int i4 = f1497 + 51;
        f1496 = i4 % 128;
        int i5 = i4 % 2;
        return m7484;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m7303() {
        int i = 2 % 2;
        int i2 = f1496 + 39;
        f1497 = i2 % 128;
        int i3 = i2 % 2;
        String m7482 = this.f1503.m7482();
        int i4 = f1496 + 23;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
        return m7482;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7298() {
        int i = 2 % 2;
        int i2 = f1497 + 15;
        f1496 = i2 % 128;
        int i3 = i2 % 2;
        String m7481 = this.f1503.m7481();
        int i4 = f1496 + 51;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
        return m7481;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String m7293() {
        int i = 2 % 2;
        int i2 = f1497 + 81;
        f1496 = i2 % 128;
        int i3 = i2 % 2;
        String m6379 = this.f1500.m6379();
        int i4 = f1497 + 95;
        f1496 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return m6379;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String m7296() {
        int i = 2 % 2;
        int i2 = f1496 + 77;
        f1497 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1500.mo6384();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String mo6384 = this.f1500.mo6384();
        int i3 = f1496 + 83;
        f1497 = i3 % 128;
        int i4 = i3 % 2;
        return mo6384;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m7297() {
        int i = 2 % 2;
        String m7293 = m7293();
        if (TextUtils.isEmpty(m7293)) {
            return null;
        }
        int i2 = f1496 + 63;
        f1497 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
            if (m7283("霸靽⏘\ued03搿兔ࣆ㰻屼ṗ巋", TextUtils.indexOf("", "")).intern().equals(m7293)) {
                return null;
            }
        } else if (m7283("霸靽⏘\ued03搿兔ࣆ㰻屼ṗ巋", TextUtils.indexOf("", "")).intern().equals(m7293)) {
            return null;
        }
        if (m7283("\uf72d\uf769\ue825䜮鱚骮ꋹ쑝㱧햣\uf7e7뽐", View.getDefaultSize(0, 0)).intern().equals(m7293)) {
            return null;
        }
        String m7483 = this.f1503.m7483(m7293());
        int i4 = f1497 + 3;
        f1496 = i4 % 128;
        int i5 = i4 % 2;
        return m7483;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String m7294() {
        int i = 2 % 2;
        int i2 = f1496 + 27;
        f1497 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1503.m7480();
            throw null;
        }
        String m7480 = this.f1503.m7480();
        int i3 = f1497 + 87;
        f1496 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        return m7480;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m7295() {
        int i = 2 % 2;
        int i2 = f1496 + 43;
        f1497 = i2 % 128;
        int i3 = i2 % 2;
        String m7485 = this.f1503.m7485();
        int i4 = f1496 + 99;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
        return m7485;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m7301(String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f1497 + 81;
        f1496 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<cl> it = m7281().iterator();
        int i4 = f1496 + 55;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            it.next().m7213(str, list);
        }
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final Context m7289() {
        int i = 2 % 2;
        int i2 = f1496;
        int i3 = i2 + 93;
        f1497 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        Context context = this.f1504;
        int i4 = i2 + 89;
        f1497 = i4 % 128;
        if (i4 % 2 == 0) {
            return context;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7282(cl clVar) {
        int i = 2 % 2;
        int i2 = f1497 + 27;
        f1496 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1499.add(clVar);
            int i3 = 0 / 0;
        } else {
            this.f1499.add(clVar);
        }
        int i4 = f1496 + 107;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7285(dp dpVar) {
        int i = 2 % 2;
        int i2 = f1496 + 115;
        f1497 = i2 % 128;
        int i3 = i2 % 2;
        m7287(dpVar);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f1496 + 9;
        f1497 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    protected final synchronized dp m7291() {
        dp dpVar;
        int i = 2 % 2;
        int i2 = f1497;
        int i3 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1496 = i3 % 128;
        int i4 = i3 % 2;
        dpVar = this.f1498;
        int i5 = i2 + 91;
        f1496 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return dpVar;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final bb m7292() {
        int i = 2 % 2;
        int i2 = f1496;
        int i3 = i2 + 111;
        f1497 = i3 % 128;
        int i4 = i3 % 2;
        bb bbVar = this.f1501;
        int i5 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1497 = i5 % 128;
        if (i5 % 2 == 0) {
            return bbVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m7284(dg dgVar, be beVar) {
        int i = 2 % 2;
        if (beVar.mo6370()) {
            int i2 = f1497 + 63;
            f1496 = i2 % 128;
            if (i2 % 2 == 0) {
                m7281().iterator();
                throw null;
            }
            Iterator<cl> it = m7281().iterator();
            int i3 = f1497 + 95;
            f1496 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            while (it.hasNext()) {
                int i5 = f1497 + 95;
                f1496 = i5 % 128;
                if (i5 % 2 == 0) {
                    cl next = it.next();
                    dgVar.m7478().m7707().m7713(next.m7210().m7928(), next);
                    throw null;
                }
                cl next2 = it.next();
                dgVar.m7478().m7707().m7713(next2.m7210().m7928(), next2);
            }
        }
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final synchronized boolean m7290() {
        int i = 2 % 2;
        int i2 = f1497 + 13;
        f1496 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1500.mo6370();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f1500.mo6370();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7283(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f1495, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f1495));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
