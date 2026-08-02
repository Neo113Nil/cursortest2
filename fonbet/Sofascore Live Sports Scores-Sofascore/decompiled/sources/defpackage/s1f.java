package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s1f extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Context t;
    public final /* synthetic */ nta u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1f(Context context, nta ntaVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = context;
        this.u = ntaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        nta ntaVar = this.u;
        Context context = this.t;
        switch (i) {
            case 0:
                return new s1f(context, ntaVar, rq3Var, 0);
            default:
                return new s1f(context, ntaVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((s1f) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        nta ntaVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dti dtiVar = dti.d;
                int i3 = ntaVar.a;
                this.s = 1;
                Object s = dtiVar.s(this.t, pco.M(i3), R.drawable.player_photo_placeholder, new awj[]{new urh()}, this);
                return s == lu3Var ? lu3Var : s;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dti dtiVar2 = dti.d;
                int i5 = ntaVar.d;
                this.s = 1;
                Object s2 = dtiVar2.s(this.t, pco.R(i5), R.drawable.team_logo_placeholder, new awj[]{new urh()}, this);
                return s2 == lu3Var2 ? lu3Var2 : s2;
        }
    }
}
