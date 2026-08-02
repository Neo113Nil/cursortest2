package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.local_persistance.UserAccount;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p05 extends hoi implements Function2 {
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ q05 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p05(q05 q05Var, boolean z, boolean z2, boolean z3, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = q05Var;
        this.v = z;
        this.w = z2;
        this.x = z3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        p05 p05Var = new p05(this.u, this.v, this.w, this.x, rq3Var);
        p05Var.t = obj;
        return p05Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p05) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fb, code lost:
    
        if (defpackage.bfk.e(r1, null, null, null, null, null, r2, null, null, null, r14, 8127) == r13) goto L48;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        SharedPreferences d;
        boolean z = this.w;
        q05 q05Var = this.u;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i2 = this.s;
        if (i2 == 0) {
            y6a.M(obj);
            Context i3 = q05Var.i();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i3.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            String string = sharedPreferences.getString("REGION_USER_LAST_REGION", null);
            oo5 oo5Var = q05Var.g.d;
            int i4 = (jca.M((UserAccount) q05Var.k.getValue()) && this.v) ? 1 : 0;
            xw3.L(ku3Var, null, null, new n05(q05Var, null, 1), 3);
            xw3.L(ku3Var, null, null, new n05(q05Var, null, 2), 3);
            SharedPreferences.Editor edit = q05Var.h.edit();
            edit.getClass();
            edit.clear();
            if (z) {
                edit.putInt("PREF_DEV_MODE_MCC", ke0.c);
                edit.putInt("PREF_DEV_MODE_MCC_2", ke0.c);
            }
            edit.apply();
            if (z) {
                b0a.Q(q05Var.i(), string);
            } else {
                Calendar calendar = ke0.a;
                Context i5 = q05Var.i();
                ke0.c = c1c.a;
                ke0.e = null;
                ke0.e(i5);
            }
            q05Var.g.i(q05Var.i(), true);
            if (this.x && oo5Var != null) {
                mi6 mi6Var = oo5Var.a;
                ri6 ri6Var = oo5Var.b;
                if (ri6Var != null) {
                    q05Var.g.h(mi6Var, ri6Var);
                }
            }
            bfk bfkVar = q05Var.f;
            this.t = null;
            this.r = i4;
            this.s = 1;
            if (bfkVar.d(this) != lu3Var) {
                i = i4;
            }
            return lu3Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            q05Var.l();
            return Unit.a;
        }
        i = this.r;
        y6a.M(obj);
        bfk bfkVar2 = q05Var.f;
        Boolean valueOf = Boolean.valueOf(i != 0);
        this.t = null;
        this.r = i;
        this.s = 2;
    }
}
