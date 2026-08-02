package defpackage;

import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h5b {
    public final long a;
    public final TreeSet b = new TreeSet(new m39(6));
    public long c;

    public h5b(long j) {
        this.a = j;
    }

    public final void a(he2 he2Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            hhh hhhVar = (hhh) this.b.first();
            ghh ghhVar = (ghh) he2Var;
            synchronized (ghhVar) {
                ghhVar.k(hhhVar);
            }
        }
    }

    public final void b(ghh ghhVar, hhh hhhVar) {
        this.b.add(hhhVar);
        this.c += hhhVar.c;
        a(ghhVar, 0L);
    }
}
