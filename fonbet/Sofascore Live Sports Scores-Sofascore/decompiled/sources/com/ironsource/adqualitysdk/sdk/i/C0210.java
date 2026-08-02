package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.İ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0210 extends AbstractC1131 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210(String str, String str2, C0950 c0950) {
        super(str, str2);
        C0950 c09502 = c0950;
        if (c09502 != null) {
            C1102 c1102 = c09502.f3162;
            String str3 = c1102 != null ? c1102.f3466.f299.f3759 : null;
            String str4 = c1102 != null ? c1102.f3459.f2792.f3076 : null;
            ArrayList arrayList = new ArrayList();
            while (c09502 != null && c09502.f3163 != null) {
                arrayList.add(c09502);
                c09502 = c09502.f3164;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0499 c0499 = ((C0950) it.next()).f3163;
                C1183 c1183 = c0499.f1613;
                StringBuilder sb = new StringBuilder();
                ceo.g(c1183.f3758, "kw==\n", sb, "veXoSxg7Y0U=\n");
                sb.append(c1183.f3759);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(StringFog.decrypt("WDmPQ90ZR1w=\n", "OVfrMbJwI3E=\n"));
                ceo.g(c1183.f3758, "jw==\n", sb3, "opy4ZslfkcI=\n");
                sb3.append(c1183.f3759);
                this.f3533.add(new C1099(sb2, c0499.f1614, AbstractC1133.m662("+/UCHg==\n", "1YZwcg2/FgY=\n", sb3), (r5.m563() + r5.f3163.m324()) - 1, (str3 == null || str4 == null || !str4.equals(c1183.f3758) || str3.equals(c1183.f3759)) ? null : str3));
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            this.f3533.add(new C1099(str, str2, AbstractC1133.m662("yS2Oa4U2kMuLPM9vmDyd\n", "5E7hBetT878=\n", sb4), 0, null));
        }
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        ArrayList arrayList2 = new ArrayList();
        String name = C0499.class.getName();
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList2.add(0, stackTraceElement);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            StackTraceElement stackTraceElement2 = (StackTraceElement) it2.next();
            this.f3533.add(new C1099(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber(), null));
        }
    }
}
