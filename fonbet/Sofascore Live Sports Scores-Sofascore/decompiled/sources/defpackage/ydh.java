package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ydh implements q55 {
    public final aeh a;
    public final long b;
    public final Object c;
    public final lj2 d;

    public ydh(aeh aehVar, long j, Object obj, lj2 lj2Var) {
        this.a = aehVar;
        this.b = j;
        this.c = obj;
        this.d = lj2Var;
    }

    @Override // defpackage.q55
    public final void d() {
        aeh aehVar = this.a;
        synchronized (aehVar) {
            try {
                if (this.b >= aehVar.q()) {
                    Object[] objArr = aehVar.h;
                    objArr.getClass();
                    long j = this.b;
                    if (objArr[((int) j) & (objArr.length - 1)] == this) {
                        beh.d(objArr, j, beh.a);
                        aehVar.l();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
