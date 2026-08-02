package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pq8 extends exj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ rq8 e;

    public pq8(rq8 rq8Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = rq8Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void e(xwj xwjVar) {
        xwjVar.A(this);
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void f(xwj xwjVar) {
        rq8 rq8Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            rq8Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            rq8Var.z(obj2, this.d, null);
        }
    }
}
