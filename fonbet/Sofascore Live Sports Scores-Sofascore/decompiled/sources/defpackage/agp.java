package defpackage;

import java.math.BigDecimal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class agp extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        String f0 = e7nVar.f0();
        try {
            return tz9.b0(f0);
        } catch (NumberFormatException e) {
            throw new o9p(16, sep.b((byte) 41, f0, e7nVar, "Failed parsing '", "' as BigDecimal; at path "), e);
        }
    }

    @Override // defpackage.map
    public final /* synthetic */ void write(f7n f7nVar, Object obj) {
        f7nVar.e0((BigDecimal) obj);
    }
}
