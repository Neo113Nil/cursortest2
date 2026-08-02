package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vp8 extends yqf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yqf
    public void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ei3) obj).h(true);
                break;
            case 1:
                a9d a9dVar = (a9d) obj;
                a9dVar.e = a9dVar.c.getItemCount();
                r18 r18Var = a9dVar.d;
                ((nh3) r18Var.a).notifyDataSetChanged();
                r18Var.b();
                break;
            case 3:
                ((osi) obj).c();
                break;
        }
    }

    @Override // defpackage.yqf
    public void b(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                a9d a9dVar = (a9d) obj;
                r18 r18Var = a9dVar.d;
                ((nh3) r18Var.a).notifyItemRangeChanged(i + r18Var.d(a9dVar), i2, null);
                break;
            case 3:
                ((osi) obj).c();
                break;
        }
    }

    @Override // defpackage.yqf
    public void c(int i, int i2, Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                a9d a9dVar = (a9d) obj2;
                r18 r18Var = a9dVar.d;
                ((nh3) r18Var.a).notifyItemRangeChanged(i + r18Var.d(a9dVar), i2, obj);
                break;
            case 2:
            default:
                super.c(i, i2, obj);
                break;
            case 3:
                ((osi) obj2).c();
                break;
        }
    }

    @Override // defpackage.yqf
    public final void d(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                a9d a9dVar = (a9d) obj;
                a9dVar.e += i2;
                r18 r18Var = a9dVar.d;
                ((nh3) r18Var.a).notifyItemRangeInserted(i + r18Var.d(a9dVar), i2);
                if (a9dVar.e > 0 && a9dVar.c.getStateRestorationPolicy() == wqf.b) {
                    r18Var.b();
                    break;
                }
                break;
            case 2:
                y6 y6Var = (y6) obj;
                if (y6Var.getStateRestorationPolicy() == wqf.c && !y6Var.a) {
                    y6Var.setStateRestorationPolicy(wqf.a);
                }
                y6Var.unregisterAdapterDataObserver(this);
                break;
            default:
                ((osi) obj).c();
                break;
        }
    }

    @Override // defpackage.yqf
    public void e(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                a9d a9dVar = (a9d) obj;
                r18 r18Var = a9dVar.d;
                int d = r18Var.d(a9dVar);
                ((nh3) r18Var.a).notifyItemMoved(i + d, i2 + d);
                break;
            case 3:
                ((osi) obj).c();
                break;
        }
    }

    @Override // defpackage.yqf
    public void f(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case 1:
                a9d a9dVar = (a9d) obj;
                a9dVar.e -= i2;
                r18 r18Var = a9dVar.d;
                ((nh3) r18Var.a).notifyItemRangeRemoved(i + r18Var.d(a9dVar), i2);
                if (a9dVar.e < 1 && a9dVar.c.getStateRestorationPolicy() == wqf.b) {
                    r18Var.b();
                    break;
                }
                break;
            case 3:
                ((osi) obj).c();
                break;
        }
    }

    @Override // defpackage.yqf
    public void g() {
        switch (this.a) {
            case 1:
                ((a9d) this.b).d.b();
                break;
        }
    }
}
