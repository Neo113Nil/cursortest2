package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.忄, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC1004 extends AbstractC0697 {
    public AbstractC1004(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        super(abstractC0287, abstractC02872);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        Object obj = this.f2352.m171(c0950, c1102).f3367;
        Object obj2 = this.f2351.m171(c0950, c1102).f3367;
        try {
            return new C1068(Boolean.valueOf(mo173(new BigDecimal(obj.toString()).compareTo(new BigDecimal(obj2.toString())))));
        } catch (Exception unused) {
            return ((obj instanceof String) && (obj2 instanceof String)) ? new C1068(Boolean.valueOf(mo185((String) obj, (String) obj2))) : new C1068(Boolean.valueOf(mo184(obj, obj2)));
        }
    }

    /* renamed from: ﾒ */
    public abstract boolean mo173(int i);

    /* renamed from: ﾒ */
    public abstract boolean mo184(Object obj, Object obj2);

    /* renamed from: ﾒ */
    public abstract boolean mo185(String str, String str2);
}
