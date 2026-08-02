package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ato extends puo {
    public final long h;

    public ato(zro zroVar, s9n s9nVar, long j, int i) {
        super(zroVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", s9nVar, i, 25);
        this.h = j;
    }

    @Override // defpackage.puo
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, null)).longValue();
        s9n s9nVar = this.d;
        synchronized (s9nVar) {
            s9nVar.b();
            ((cmn) s9nVar.b).a0(longValue);
            long j = this.h;
            if (j != 0) {
                s9nVar.b();
                ((cmn) s9nVar.b).y0(longValue - j);
                s9nVar.b();
                ((cmn) s9nVar.b).B0(j);
            }
        }
    }
}
