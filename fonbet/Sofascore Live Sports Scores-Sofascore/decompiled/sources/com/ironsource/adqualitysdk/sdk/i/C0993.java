package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.丨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0993 extends C0380 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AbstractC0287[] f3227;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0287 f3228;

    public C0993(AbstractC0287 abstractC0287, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(str, arrayList2);
        this.f3228 = abstractC0287;
        if (arrayList != null) {
            AbstractC0287[] abstractC0287Arr = new AbstractC0287[arrayList.size()];
            this.f3227 = abstractC0287Arr;
            arrayList.toArray(abstractC0287Arr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0380, com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0993 c0993 = (C0993) obj;
        AbstractC0287 abstractC0287 = this.f3228;
        if (abstractC0287 == null ? c0993.f3228 == null : abstractC0287.equals(c0993.f3228)) {
            return Arrays.equals(this.f3227, c0993.f3227);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0380, com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        AbstractC0287 abstractC0287 = this.f3228;
        return Arrays.hashCode(this.f3227) + ((hashCode + (abstractC0287 != null ? abstractC0287.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0380
    public final String toString() {
        return mo218(this.f1121);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0380
    /* renamed from: ﾇ */
    public final String mo218(Object[] objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3228);
        sb.append(StringFog.decrypt("Ww==\n", "dWQE3iocrIs=\n"));
        sb.append(this.f1122);
        if (this.f3227 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("gA==\n", "vGvmKcT2D7U=\n"));
            sb2.append(AbstractC0287.m170(this.f3227));
            str = AbstractC1133.m662("Xw==\n", "YRQ/WAOYKuQ=\n", sb2);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(StringFog.decrypt("WA==\n", "cEhzOLqEyxE=\n"));
        sb.append(AbstractC0287.m170(objArr));
        return AbstractC1133.m662("lw==\n", "vpJlS+McaoQ=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0380, com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m325;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0287 abstractC0287 : this.f1121) {
            arrayList.add(abstractC0287.m171(c0950, c1102).f3367);
        }
        AbstractC0287 abstractC02872 = this.f3228;
        if ((abstractC02872 instanceof C0337) && ((C0337) abstractC02872).f829.equals(StringFog.decrypt("n3z/g9c=\n", "7AmP5qWC3C4=\n"))) {
            C0499 m128 = c1102.f3466.f298.m128(this.f1122);
            m128.getClass();
            C1068 m3252 = m128.m325(c0950, c0950.f3165, c1102, arrayList);
            m3252.f3366 = false;
            return m3252;
        }
        Object obj = this.f3228.m171(c0950, c1102).f3367;
        if (obj instanceof InterfaceC0823) {
            return new C1068(((InterfaceC0823) obj).mo55(c1102, this.f1122, arrayList, c1102.f3462, c0950));
        }
        if (obj instanceof C1102) {
            synchronized (obj) {
                try {
                    C1102 c11022 = (C1102) obj;
                    String str = this.f1122;
                    C0499 m1282 = str != null ? c11022.f3466.m128(str) : null;
                    if (m1282 == null) {
                        throw new C0320(c1102, c0950, this.f1122, StringFog.decrypt("lvKmJQwiv3q246E+F2y9Ir7loCIRZvo=\n", "04DUSn4C2gI=\n") + this.f1122);
                    }
                    m325 = m1282.m325(c0950, c11022.f3465.f3165, c11022, arrayList);
                    m325.f3366 = false;
                } finally {
                }
            }
            return m325;
        }
        try {
            AbstractC0287[] abstractC0287Arr = this.f3227;
            Method m504 = abstractC0287Arr != null ? AbstractC0816.m504(obj, this.f1122, m601(abstractC0287Arr, c0950, c1102)) : AbstractC0816.m505(obj, this.f1122, (List) arrayList);
            if (m504 != null) {
                return new C1068(m504.invoke(obj, arrayList.toArray()));
            }
            arrayList.add(0, obj);
            return new C1068(c1102.f3464.mo55(c1102, this.f1122, arrayList, c1102.f3462, c0950));
        } catch (IllegalAccessException e) {
            e = e;
            throw new C0240(c1102, c0950, StringFog.decrypt("MDU4CGv/FDQQJD8TcLEWbBgiPg92u1E=\n", "dUdKZxnfcUw=\n") + this, e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new C0240(c1102, c0950, StringFog.decrypt("MDU4CGv/FDQQJD8TcLEWbBgiPg92u1E=\n", "dUdKZxnfcUw=\n") + this, e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m601(AbstractC0287[] abstractC0287Arr, C0950 c0950, C1102 c1102) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0287 abstractC0287 : abstractC0287Arr) {
            arrayList.add((Class) abstractC0287.m171(c0950, c1102).f3367);
        }
        return arrayList;
    }
}
