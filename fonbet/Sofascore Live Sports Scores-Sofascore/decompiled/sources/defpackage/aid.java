package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aid extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ jid t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aid(jid jidVar, Context context, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = jidVar;
        this.u = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Context context = this.u;
        jid jidVar = this.t;
        switch (i) {
            case 0:
                aid aidVar = new aid(jidVar, context, rq3Var, 0);
                aidVar.s = obj;
                return aidVar;
            default:
                aid aidVar2 = new aid(jidVar, context, rq3Var, 1);
                aidVar2.s = obj;
                return aidVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((aid) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 0;
        jid jidVar = this.t;
        Context context = this.u;
        rq3 rq3Var = null;
        int i3 = 3;
        ku3 ku3Var = (ku3) this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, i2), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 1), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 2), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, i3), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 4), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 5), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 6), 3);
                xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 7), 3);
                return xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 8), 3);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                SharedPreferences sharedPreferences = jidVar.i;
                SharedPreferences sharedPreferences2 = jidVar.i;
                if (sharedPreferences.getBoolean("RETRY_LEAGUES", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 9), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_TEAMS", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 10), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_STAGES", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 11), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_MUTED_STAGES", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 12), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_UNIQUE_STAGES", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 13), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_EVENTS", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 14), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_MUTED_EVENTS", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 15), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_NOTIFICATIONS", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 16), 3);
                }
                if (sharedPreferences2.getBoolean("RETRY_COMPETITIONS", false)) {
                    xw3.L(ku3Var, null, null, new zhd(jidVar, context, rq3Var, 17), 3);
                }
                return Unit.a;
        }
    }
}
