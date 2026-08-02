package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.IRecent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class w41 extends ynb {
    public IRecent l;
    public final String m;
    public final fdi n;
    public final fdi o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(@NotNull Application application) {
        super(application, tnb.a);
        application.getClass();
        this.m = dv3.c();
        fdi a = gdi.a(gec.c);
        this.n = a;
        rq3 rq3Var = null;
        fdi a2 = gdi.a(null);
        this.o = a2;
        fcp.m0(new v98(k53.g0(new yf4(a2, a, new q41(this, rq3Var, 0), 1), z45.a), new r1(this, rq3Var, 2), 3), un0.z(this));
    }

    public Object A(rq3 rq3Var) {
        return Boolean.FALSE;
    }

    public Object B(t41 t41Var) {
        return Boolean.FALSE;
    }

    public Object C(rq3 rq3Var) {
        return Boolean.FALSE;
    }

    public Object D(t41 t41Var) {
        return Boolean.FALSE;
    }

    public Object E(t41 t41Var) {
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(String str, sq3 sq3Var) {
        s41 s41Var;
        int i;
        if (sq3Var instanceof s41) {
            s41Var = (s41) sq3Var;
            int i2 = s41Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s41Var.t = i2 - Integer.MIN_VALUE;
                Object obj = s41Var.r;
                lu3 lu3Var = lu3.a;
                i = s41Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    r3 r3Var = new r3(str, rq3Var, 2);
                    s41Var.t = 1;
                    obj = yaa.P(r3Var, s41Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                return list != null ? km5.a : list;
            }
        }
        s41Var = new s41(this, sq3Var);
        Object obj2 = s41Var.r;
        lu3 lu3Var2 = lu3.a;
        i = s41Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        List list2 = (List) yaa.x((x2g) obj2);
        if (list2 != null) {
        }
    }

    public final void G(IRecent iRecent) {
        iRecent.getClass();
        this.l = iRecent;
        zbc zbcVar = (zbc) l().a();
        if (zbcVar != null && zbcVar.e != null) {
            n(null, new dt(24));
        }
        xw3.L(un0.z(this), null, null, new v41(this, iRecent, null), 3);
    }

    public Object t(rq3 rq3Var) {
        return km5.a;
    }

    public final IRecent u() {
        IRecent iRecent = this.l;
        if (iRecent != null) {
            return iRecent;
        }
        Intrinsics.i("entity");
        throw null;
    }

    public Object v(rq3 rq3Var) {
        return km5.a;
    }

    public Object w(rq3 rq3Var) {
        return km5.a;
    }

    public Object x(rq3 rq3Var) {
        return km5.a;
    }

    public Object y(rq3 rq3Var) {
        return km5.a;
    }

    public Boolean z() {
        return Boolean.FALSE;
    }
}
