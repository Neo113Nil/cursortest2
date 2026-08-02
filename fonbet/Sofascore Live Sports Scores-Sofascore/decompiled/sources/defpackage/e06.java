package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e06 implements v6b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public e06(a7b a7bVar, Context context, vnb vnbVar, esf esfVar) {
        this.a = 3;
        this.b = context;
        this.d = vnbVar;
        this.c = esfVar;
    }

    @Override // defpackage.v6b
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Context context = this.b;
        switch (i) {
            case 0:
                nv.L(context, "event_lineups", yaa.v() - ((esf) obj).a, ((bnf) obj2).b);
                break;
            case 1:
                boh bohVar = (boh) obj;
                if (bohVar.h() != 0) {
                    nv.C(context, ((dy7) ((e1d) obj2).getValue()).f, yaa.v() - bohVar.h());
                }
                bohVar.i(0L);
                break;
            case 2:
                nv.L(context, "league_draft", yaa.v() - ((boh) obj2).h(), ((xva) obj).m.b);
                break;
            default:
                nv.L(context, "league_transactions", yaa.v() - ((esf) obj).a, ((m4b) ((unb) ((vnb) obj2)).a).b.c);
                break;
        }
    }

    public /* synthetic */ e06(a7b a7bVar, Context context, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
        this.d = obj2;
    }
}
