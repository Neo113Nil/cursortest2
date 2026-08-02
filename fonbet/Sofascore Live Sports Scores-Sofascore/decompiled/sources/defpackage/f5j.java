package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f5j {
    public static final f5j a = new f5j();
    public static final LocalDate b;

    static {
        LocalDate of = LocalDate.of(2026, 9, 15);
        of.getClass();
        b = of;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, cg4 cg4Var, sq3 sq3Var) {
        d5j d5jVar;
        Object obj;
        int i;
        if (sq3Var instanceof d5j) {
            d5jVar = (d5j) sq3Var;
            int i2 = d5jVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d5jVar.t = i2 - Integer.MIN_VALUE;
                obj = d5jVar.r;
                Object obj2 = lu3.a;
                i = d5jVar.t;
                boolean z = false;
                if (i != 0) {
                    y6a.M(obj);
                    if (!LocalDate.now().isAfter(b) && s6a.A(context)) {
                        d5jVar.t = 1;
                        obj = cg4Var.a("PREF_TENNIS_ANALYST_PROMO_SHOWN", false, d5jVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (!((Boolean) obj).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        d5jVar = new d5j(this, sq3Var);
        obj = d5jVar.r;
        Object obj22 = lu3.a;
        i = d5jVar.t;
        boolean z2 = false;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, Event event, cg4 cg4Var, sq3 sq3Var) {
        e5j e5jVar;
        Object obj;
        int i;
        if (sq3Var instanceof e5j) {
            e5jVar = (e5j) sq3Var;
            int i2 = e5jVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e5jVar.t = i2 - Integer.MIN_VALUE;
                obj = e5jVar.r;
                Object obj2 = lu3.a;
                i = e5jVar.t;
                boolean z = false;
                if (i != 0) {
                    y6a.M(obj);
                    if (!LocalDate.now().isAfter(b) && Intrinsics.c(ok3.s(event), Sports.TENNIS) && !ok3.D(event) && !s6a.A(context)) {
                        e5jVar.t = 1;
                        obj = cg4Var.a("PREF_TENNIS_ANALYST_PROMO_SHOWN", false, e5jVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (!((Boolean) obj).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        e5jVar = new e5j(this, sq3Var);
        obj = e5jVar.r;
        Object obj22 = lu3.a;
        i = e5jVar.t;
        boolean z2 = false;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }
}
