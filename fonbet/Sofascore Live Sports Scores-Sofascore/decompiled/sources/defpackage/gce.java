package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class gce implements swf {
    public final Set a;
    public final i1d b = new i1d(new ev8[16], 0);

    public gce(Set set) {
        this.a = set;
    }

    @Override // defpackage.swf
    public final void a() {
        i1d i1dVar = this.b;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            swf swfVar = ((ev8) objArr[i2]).a;
            this.a.remove(swfVar);
            swfVar.a();
        }
    }

    @Override // defpackage.swf
    public final void b() {
    }

    @Override // defpackage.swf
    public final void d() {
    }
}
