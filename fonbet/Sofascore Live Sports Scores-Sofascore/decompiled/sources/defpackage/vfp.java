package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vfp extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        String f0 = e7nVar.f0();
        if (f0.length() == 1) {
            return Character.valueOf(f0.charAt(0));
        }
        throw new o9p(sep.b((byte) 31, f0, e7nVar, "Expecting character, got: ", "; at "), 16);
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        Character ch = (Character) obj;
        f7nVar.H(ch == null ? null : ch.toString());
    }
}
