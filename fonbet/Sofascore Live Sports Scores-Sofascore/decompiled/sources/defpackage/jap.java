package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jap extends map {
    public final /* synthetic */ map a;

    public /* synthetic */ jap(map mapVar) {
        this.a = mapVar;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() != 9) {
            return this.a.read(e7nVar);
        }
        e7nVar.j0();
        return null;
    }

    public final String toString() {
        String obj = this.a.toString();
        return wt3.m("NullSafeTypeAdapter[", obj, new StringBuilder(obj.length() + 21), U3.j.e);
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        if (obj == null) {
            f7nVar.f0();
        } else {
            this.a.write(f7nVar, obj);
        }
    }
}
