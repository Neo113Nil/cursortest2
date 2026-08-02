package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zr4 {
    public final Context a;
    public final py3 b;
    public boolean c;

    public zr4(Context context) {
        this.a = context;
        this.b = new py3(context, 1);
    }

    public final n51[] a(Handler handler, mg6 mg6Var, mg6 mg6Var2, mg6 mg6Var3, mg6 mg6Var4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.c;
        Context context = this.a;
        y3c y3cVar = new y3c(context);
        py3 py3Var = this.b;
        y3cVar.c = py3Var;
        y3cVar.d = 5000L;
        y3cVar.e = z;
        y3cVar.f = handler;
        y3cVar.g = mg6Var;
        y3cVar.h = 50;
        z1a.E(!y3cVar.b);
        Handler handler2 = y3cVar.f;
        z1a.E((handler2 == null && y3cVar.g == null) || !(handler2 == null || y3cVar.g == null));
        y3cVar.b = true;
        arrayList.add(new b4c(y3cVar));
        rd4 rd4Var = new rd4(context);
        z1a.E(!rd4Var.a);
        rd4Var.a = true;
        if (((x6k) rd4Var.d) == null) {
            rd4Var.d = new x6k(new mo0[0]);
        }
        mp0 mp0Var = (mp0) rd4Var.f;
        w70 w70Var = (w70) rd4Var.g;
        if (mp0Var == null) {
            if (w70Var == null) {
                rd4Var.g = new w70(context);
            }
            if (((wib) rd4Var.e) == null) {
                rd4Var.e = wib.c;
            }
            ujg ujgVar = new ujg(context);
            jn0 jn0Var = context != null ? null : (jn0) rd4Var.c;
            Context context2 = (Context) ujgVar.b;
            if (context2 == null) {
                ujgVar.e = jn0Var;
            }
            w70 w70Var2 = (w70) rd4Var.g;
            ujgVar.c = w70Var2;
            ujgVar.d = (wib) rd4Var.e;
            if (w70Var2 == null) {
                ujgVar.c = new w70(context2);
            }
            rd4Var.f = new mp0(ujgVar);
        } else {
            z1a.E(w70Var == null);
            z1a.E(((wib) rd4Var.e) == null);
        }
        arrayList.add(new u2c(this.a, py3Var, this.c, handler, mg6Var2, new pn4(rd4Var)));
        arrayList.add(new sej(mg6Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new ajc(mg6Var4, looper));
        }
        arrayList.add(new fi2());
        arrayList.add(new gt9(new u00(context, 1)));
        return (n51[]) arrayList.toArray(new n51[0]);
    }
}
