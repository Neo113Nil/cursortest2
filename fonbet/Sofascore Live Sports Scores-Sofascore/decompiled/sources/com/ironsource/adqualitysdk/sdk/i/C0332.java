package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.a70;
import defpackage.ceo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0332 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public volatile C1112 f815;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C1138 f816;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public Context f817;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final C0740 f818;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0386 f819;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0465 f820;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0506 f821;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0848 f822;

    public C0332(C0848 c0848) {
        C0506 c0506 = new C0506();
        this.f815 = new C1112(new C1121());
        this.f822 = c0848;
        this.f821 = c0506;
        C0465 c0465 = new C0465();
        this.f820 = c0465;
        this.f819 = new C0386(c0506, c0465, c0848);
        this.f818 = new C0740();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1112 m190() {
        C1042 c1042;
        C1176 c1176;
        int i;
        C1138 c1138 = this.f816;
        if (c1138 == null) {
            a70.r(StringFog.decrypt("L/kCY6EVjkta1ilGwhOSRw7RJ16LAJlKVJgFU44W3EcU0TJbgxaVVB+QJV2MDplWDpFmVIsIj1pU\n", "erhGMuJ6/C4=\n"));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        try {
            C1034 c1034 = c1138.f3553;
            Context context = c1138.f3554;
            c1034.getClass();
            c1042 = C1034.m620(context);
        } catch (Exception e) {
            arrayList.add(StringFog.decrypt("D0uZ//MdTBE0V4Li2AsDQw==\n", "XST2i7t4OWM=\n") + e.getMessage());
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(7);
            c1042 = new C1042(true, true, arrayList3);
        }
        arrayList2.addAll(c1042.f3324);
        try {
            C1174 c1174 = c1138.f3552;
            Context context2 = c1138.f3554;
            c1174.getClass();
            c1176 = C1174.m664(context2);
        } catch (Exception e2) {
            arrayList.add(StringFog.decrypt("KzfozM+yv+gMLfrM1Ki8xQcs6dHOs7vuEWO7\n", "YlmbuL3H0o0=\n") + e2.getMessage());
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(21);
            c1176 = new C1176(true, true, true, true, arrayList4);
        }
        arrayList2.addAll(c1176.f3671);
        HashMap hashMap = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (InterfaceC1129 interfaceC1129 : c1138.f3551) {
            try {
                C0350 mo221 = interfaceC1129.mo221();
                arrayList7.add(new C1154(interfaceC1129.getName(), mo221));
                arrayList2.addAll(mo221.f888);
                if (mo221.f889 || mo221.f886 == null) {
                    i = i2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(interfaceC1129.getName());
                    i = i2;
                    try {
                        sb.append(StringFog.decrypt("FQc=\n", "LycKgzy/iVg=\n"));
                        sb.append(mo221.f886);
                        arrayList.add(sb.toString());
                    } catch (Exception e3) {
                        e = e3;
                        arrayList.add(interfaceC1129.getName() + StringFog.decrypt("rzE=\n", "lRFNNXjkKGQ=\n") + e.getMessage());
                        arrayList7.add(new C1154(interfaceC1129.getName(), new C0350(false, Collections.EMPTY_LIST, null, null)));
                        i2 = i;
                    }
                }
                if (mo221.f887 != null) {
                    hashMap.put(interfaceC1129.getName(), mo221.f887);
                }
                interfaceC1129.getName();
                for (Integer num : mo221.f888) {
                    int intValue = num.intValue();
                    if (intValue != 30 && intValue != 31 && intValue != 33 && intValue != 32 && intValue != 40 && intValue != 42 && intValue != 44 && intValue != 41) {
                        if (intValue != 63 && intValue != 64 && intValue != 61 && intValue != 62 && intValue != 60) {
                            if (intValue >= 50 && intValue <= 56) {
                                arrayList6.add(num);
                            }
                        }
                        arrayList5.add(num);
                    }
                }
            } catch (Exception e4) {
                e = e4;
                i = i2;
            }
            i2 = i;
        }
        int i3 = i2;
        boolean z = c1042.f3326;
        boolean z2 = c1042.f3325;
        boolean z3 = c1176.f3675;
        boolean z4 = c1176.f3674;
        boolean z5 = c1176.f3673;
        boolean z6 = c1176.f3672;
        int i4 = !z ? 1 : 0;
        if (!z2) {
            i4++;
        }
        if (!z3 && !z4 && !z5 && !z6) {
            i4 += 2;
        }
        Iterator it = arrayList7.iterator();
        while (it.hasNext()) {
            C1154 c1154 = (C1154) it.next();
            if (c1154.f3643.f889) {
                Integer num2 = (Integer) C1138.f3549.get(c1154.f3644);
                i4 += num2 != null ? num2.intValue() : i3;
            }
        }
        C1121 c1121 = new C1121();
        c1121.f3516 = i4;
        c1121.f3515 = arrayList5;
        c1121.f3514 = arrayList6;
        c1121.f3513 = hashMap;
        c1121.f3512 = arrayList2;
        c1121.f3511 = arrayList;
        C1112 c1112 = new C1112(c1121);
        this.f815 = c1112;
        return c1112;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m191(Context context) {
        this.f817 = context.getApplicationContext();
        Context context2 = this.f817;
        C0452 c0452 = new C0452(this.f817);
        C1055 c1055 = new C1055(this.f817);
        Context context3 = this.f817;
        this.f816 = new C1138(context2, Arrays.asList(c0452, c1055, new C0384(context3), new C0566(context3)));
        m190();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m192(byte[] bArr, String str) {
        C0740 c0740 = this.f818;
        C1075 c1075 = (C1075) c0740.f2455.remove(str);
        if (c1075 == null || System.currentTimeMillis() - c1075.f3377 > c0740.f2456) {
            c1075 = null;
        }
        if (c1075 != null) {
            return AbstractC1069.m641(bArr, c1075, this.f821);
        }
        a70.r(ceo.e("Lq389fSP0qAPrPzg/onPrUCks/SxjsS4Faev8tiYm+k=\n", "YMLchpH8ock=\n", str));
        return null;
    }
}
