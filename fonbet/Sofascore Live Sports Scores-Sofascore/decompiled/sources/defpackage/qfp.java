package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qfp extends map {
    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ Object read(e7n e7nVar) {
        if (e7nVar.Q0() != 9) {
            return Float.valueOf((float) e7nVar.n0());
        }
        e7nVar.j0();
        return null;
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            f7nVar.f0();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        f7nVar.e0(number);
    }
}
