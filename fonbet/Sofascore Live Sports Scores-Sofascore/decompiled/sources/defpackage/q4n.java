package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q4n extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        String f0 = e7nVar.f0();
        try {
            return UUID.fromString(f0);
        } catch (IllegalArgumentException e) {
            throw new o9p(16, sep.b((byte) 35, f0, e7nVar, "Failed parsing '", "' as UUID; at path "), e);
        }
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        UUID uuid = (UUID) obj;
        f7nVar.H(uuid == null ? null : uuid.toString());
    }
}
