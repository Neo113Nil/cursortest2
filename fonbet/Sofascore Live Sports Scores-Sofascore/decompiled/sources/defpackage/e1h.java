package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e1h extends d1h {
    public final List j;

    public e1h(jlf jlfVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(jlfVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.d1h
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.d1h
    public final jlf h(mzf mzfVar, long j) {
        return (jlf) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.d1h
    public final boolean i() {
        return true;
    }
}
