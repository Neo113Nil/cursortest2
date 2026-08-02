package defpackage;

import android.content.Context;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class op5 extends rz8 {
    public final String q;
    public final String r;
    public final AdType.Interstitial s;
    public final pp5 t;
    public final /* synthetic */ qp5 u;

    public op5(qp5 qp5Var, String str, String str2, Integer num, AdType.Interstitial interstitial, pp5 pp5Var) {
        str.getClass();
        str2.getClass();
        interstitial.getClass();
        this.u = qp5Var;
        this.q = str;
        this.r = str2;
        this.s = interstitial;
        this.t = pp5Var;
    }

    @Override // defpackage.rz8
    public final void M(hdg hdgVar) {
        beg begVar = this.u.b;
        if (begVar != null) {
            begVar.i = null;
            ia0 ia0Var = ia0.q;
            Context applicationContext = ok3.p().getApplicationContext();
            applicationContext.getClass();
            ru ruVar = ru.EQUATIV;
            int ordinal = hdgVar.a.ordinal();
            String message = hdgVar.getMessage();
            if (message == null) {
                message = "";
            }
            qu quVar = qu.LOAD;
            nv.j(applicationContext, this.r, this.s, ruVar, this.q, ordinal, message, quVar, null, null, 768);
            p2g p2gVar = w2g.b;
            String message2 = hdgVar.getMessage();
            this.q.getClass();
            this.t.invoke(new w2g(new u2g(new wo0(message2))));
        }
    }

    @Override // defpackage.rz8
    public final void O(uag uagVar) {
        beg begVar = this.u.b;
        if (begVar != null) {
            ia0 ia0Var = ia0.q;
            Context applicationContext = ok3.p().getApplicationContext();
            applicationContext.getClass();
            nv.e(applicationContext, this.r, this.s, ru.EQUATIV, this.q, null, null, null, 224);
            begVar.i = null;
            p2g p2gVar = w2g.b;
            this.t.invoke(new w2g(new rp5(begVar, this.q, this.r, this.s)));
        }
    }
}
