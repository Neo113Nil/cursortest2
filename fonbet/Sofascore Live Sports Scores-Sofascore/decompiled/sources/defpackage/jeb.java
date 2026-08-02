package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class jeb {
    public final skd a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ keb d;

    public jeb(keb kebVar, skd skdVar) {
        this.d = kebVar;
        this.a = skdVar;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        keb kebVar = this.d;
        int i2 = kebVar.c;
        kebVar.c = i + i2;
        if (!kebVar.d) {
            kebVar.d = true;
            while (true) {
                try {
                    int i3 = kebVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        kebVar.g();
                    } else if (z3) {
                        kebVar.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    kebVar.d = false;
                    throw th;
                }
            }
            kebVar.d = false;
        }
        if (this.b) {
            kebVar.c(this);
        }
    }

    public boolean c(u6b u6bVar) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
