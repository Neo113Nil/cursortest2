package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x0a implements b0h {
    public final ojb a;
    public final ojb b;
    public long c;

    public x0a(long[] jArr, long[] jArr2, long j) {
        ojb ojbVar;
        ojb ojbVar2;
        z1a.s(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            ojbVar = new ojb(length);
            this.a = ojbVar;
            ojbVar2 = new ojb(length);
            this.b = ojbVar2;
        } else {
            int i = length + 1;
            ojbVar = new ojb(i);
            this.a = ojbVar;
            ojbVar2 = new ojb(i);
            this.b = ojbVar2;
            ojbVar.a(0L);
            ojbVar2.a(0L);
        }
        ojbVar.b(jArr);
        ojbVar2.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        ojb ojbVar = this.b;
        if (ojbVar.b == 0) {
            f0h f0hVar = f0h.c;
            return new zzg(f0hVar, f0hVar);
        }
        int c = nik.c(ojbVar, j);
        long d = ojbVar.d(c);
        ojb ojbVar2 = this.a;
        f0h f0hVar2 = new f0h(d, ojbVar2.d(c));
        if (d == j || c == ojbVar.b - 1) {
            return new zzg(f0hVar2, f0hVar2);
        }
        int i = c + 1;
        return new zzg(f0hVar2, new f0h(ojbVar.d(i), ojbVar2.d(i)));
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return this.b.b > 0;
    }
}
