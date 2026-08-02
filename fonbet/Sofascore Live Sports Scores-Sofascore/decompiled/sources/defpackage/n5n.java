package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n5n extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        try {
            int u0 = e7nVar.u0();
            if (u0 <= 255 && u0 >= -128) {
                return Byte.valueOf((byte) u0);
            }
            String P0 = e7nVar.P0();
            zzl.h("Lossy conversion from ", fn0.a(u0, 40) + P0.length(), " to byte; at path ", P0, u0);
            return null;
        } catch (NumberFormatException e) {
            throw new o9p(16, e);
        }
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        if (((Number) obj) == null) {
            f7nVar.f0();
        } else {
            f7nVar.a0(r4.byteValue());
        }
    }
}
