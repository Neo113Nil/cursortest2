package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nkj extends wuk {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public nkj(uuk uukVar) {
        this.a = 1;
        this.d = uukVar;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.wuk, defpackage.vuk
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.wuk, defpackage.vuk
    public final void b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((okj) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    vuk vukVar = ((uuk) obj).d;
                    if (vukVar != null) {
                        vukVar.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.vuk
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((okj) obj).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                uuk uukVar = (uuk) obj;
                if (i2 == uukVar.a.size()) {
                    vuk vukVar = uukVar.d;
                    if (vukVar != null) {
                        vukVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    uukVar.e = false;
                    break;
                }
                break;
        }
    }

    public nkj(okj okjVar, int i) {
        this.a = 0;
        this.d = okjVar;
        this.c = i;
        this.b = false;
    }
}
