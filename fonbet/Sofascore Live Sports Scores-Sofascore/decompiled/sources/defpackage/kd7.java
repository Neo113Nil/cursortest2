package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kd7 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public kd7(od7 od7Var, ho1 ho1Var, mei meiVar, nei neiVar, Float f, String str, String str2) {
        this.d = od7Var;
        this.e = ho1Var;
        this.f = meiVar;
        this.g = neiVar;
        this.h = f;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                od7 od7Var = (od7) obj3;
                ho1 ho1Var = (ho1) obj5;
                return new fj7(od7Var.getX(), ho1Var != null ? Integer.valueOf(ho1Var.a) : null, (Float) obj, this.b, od7Var.e, this.c, ((mei) obj4).a, ((nei) obj2).a);
            default:
                old oldVar = (old) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) obj3;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    nv.b0((Context) obj5, this.b, oldVar.a.c, this.c, (Integer) obj2, (vmd) obj, "provider_logo", oldVar.f);
                    bea.G((Context) obj5, oldVar.b);
                }
                return Unit.a;
        }
    }

    public kd7(boh bohVar, Context context, String str, old oldVar, String str2, Integer num, vmd vmdVar) {
        this.d = bohVar;
        this.e = context;
        this.b = str;
        this.f = oldVar;
        this.c = str2;
        this.g = num;
        this.h = vmdVar;
    }
}
