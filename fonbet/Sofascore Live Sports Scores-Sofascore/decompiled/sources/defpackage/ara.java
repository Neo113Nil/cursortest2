package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ara {
    public final Object a;
    public final bra b;
    public int d;
    public ara e;
    public boolean f;
    public int c = -1;
    public final e1d g = e.f(null);

    public ara(Object obj, bra braVar) {
        this.a = obj;
        this.b = braVar;
    }

    public final ara a() {
        if (this.f) {
            u3a.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            ara araVar = (ara) ((eoh) this.g).getValue();
            if (araVar != null) {
                araVar.a();
            } else {
                araVar = null;
            }
            this.e = araVar;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            u3a.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            ara araVar = this.e;
            if (araVar != null) {
                araVar.b();
            }
            this.e = null;
        }
    }
}
