package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅼ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0960 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f3177;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3178;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3179;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f3180;

    public C0960(C0776 c0776, String str, boolean z, C1102 c1102) {
        this.f3177 = c0776;
        this.f3180 = str;
        this.f3179 = z;
        this.f3178 = c1102;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m594(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                String str = this.f3180 + StringFog.decrypt("Dw==\n", "IZi/gytshtA=\n") + method.getName();
                ArrayList m437 = C0776.m437(this.f3177, objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(InterfaceC0873) obj});
                ArrayList arrayList = new ArrayList();
                if (this.f3179) {
                    arrayList.add(m437);
                    m437 = arrayList;
                }
                C0683 c0683 = this.f3178.f3462;
                C1102.m648(c0683.f2325, str, true, false, m437);
                C1102 c1102 = c0683.f2325;
                C0720 c0720 = new C0720(c0683, str, false, m437);
                c1102.getClass();
                try {
                    AbstractC1008.m614(c0720);
                } catch (Throwable unused) {
                }
                C1102 c11022 = c0683.f2325;
                C0720 c07202 = new C0720(c0683, str, true, m437);
                c11022.getClass();
                try {
                    AbstractC1008.m612(new C0582(c07202));
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                String m651 = this.f3178.m651();
                StringBuilder sb = new StringBuilder();
                sb.append(StringFog.decrypt("M8l78sSK9E4A1GL02M29\n", "drsJnbaqnSA=\n"));
                sb.append(method.getName());
                sb.append(StringFog.decrypt("NC5UbQ8dwuN7LRE=\n", "FEMxGWdypsM=\n"));
                sb.append(this.f3180);
                AbstractC0356.m204(m651, AbstractC1133.m662("ynskR6XqzM2Y\n", "6hdNNNGPoqg=\n", sb), th, false);
            }
        }
    }
}
