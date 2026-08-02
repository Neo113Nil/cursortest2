package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ybg implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wib b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ybg(wib wibVar, Context context, int i) {
        this.a = i;
        this.b = wibVar;
        this.c = context;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Context context = this.c;
        switch (i) {
            case 0:
                qcg qcgVar = (qcg) obj;
                xag xagVar = (xag) obj2;
                pgg pggVar = (pgg) obj3;
                qcgVar.getClass();
                xagVar.getClass();
                pggVar.getClass();
                yia yiaVar = new yia((byte) 0, 14);
                y3g y3gVar = new y3g(qcgVar);
                wib wibVar = this.b;
                wibVar.getClass();
                jbg jbgVar = new jbg(y3gVar);
                y3g y3gVar2 = new y3g(context, 2);
                y3g y3gVar3 = new y3g(context, 4);
                mjg a = mjg.a();
                a.getClass();
                return new ebg(jbgVar, y3gVar2, xagVar, y3gVar3, pggVar, a, yiaVar, new pig(context, yiaVar, new tcg(context), new vt(context, 11)), qcgVar, wibVar);
            default:
                qcg qcgVar2 = (qcg) obj;
                xag xagVar2 = (xag) obj2;
                pgg pggVar2 = (pgg) obj3;
                qcgVar2.getClass();
                xagVar2.getClass();
                pggVar2.getClass();
                yia yiaVar2 = new yia((byte) 0, 14);
                y3g y3gVar4 = new y3g(qcgVar2);
                wib wibVar2 = this.b;
                wibVar2.getClass();
                jbg jbgVar2 = new jbg(y3gVar4);
                y3g y3gVar5 = new y3g(context, 2);
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                y3g y3gVar6 = new y3g(applicationContext, 4);
                mjg a2 = mjg.a();
                a2.getClass();
                Context applicationContext2 = context.getApplicationContext();
                applicationContext2.getClass();
                Context applicationContext3 = context.getApplicationContext();
                applicationContext3.getClass();
                return new ebg(jbgVar2, y3gVar5, xagVar2, y3gVar6, pggVar2, a2, yiaVar2, new pig(applicationContext2, yiaVar2, new tcg(applicationContext3), new vt(context, 13)), qcgVar2, wibVar2);
        }
    }
}
