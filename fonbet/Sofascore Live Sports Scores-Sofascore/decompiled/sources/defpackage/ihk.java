package defpackage;

import android.content.Context;
import com.sofascore.local_persistance.UserAccount;
import java.util.Calendar;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ihk {
    public final Context a;
    public final dhk b;

    public ihk(Context context, dhk dhkVar) {
        dhkVar.getClass();
        this.a = context;
        this.b = dhkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (r0.b(r10, r9, r1) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r0.a(r1) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r10 == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r10 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        hhk hhkVar;
        Object obj;
        int i;
        String d;
        dhk dhkVar = this.b;
        if (sq3Var instanceof hhk) {
            hhkVar = (hhk) sq3Var;
            int i2 = hhkVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hhkVar.u = i2 - Integer.MIN_VALUE;
                obj = hhkVar.s;
                lu3 lu3Var = lu3.a;
                i = hhkVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    Calendar calendar = ke0.a;
                    d = ke0.d(this.a);
                    ia0 ia0Var = ia0.q;
                    bfk g = ok3.p().g();
                    hhkVar.r = d;
                    hhkVar.u = 1;
                    obj = g.c(hhkVar);
                } else if (i == 1) {
                    d = hhkVar.r;
                    y6a.M(obj);
                } else {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d = hhkVar.r;
                    y6a.M(obj);
                    Set set = (Set) obj;
                    Set set2 = jhk.a;
                    set.getClass();
                    jhk.a = set;
                    yea yeaVar = j58.a;
                    e58 f = e58.f();
                    f.getClass();
                    int d2 = (int) f.d("user_segmentation_prefix_character_limit");
                    hhkVar.r = null;
                    hhkVar.u = 4;
                }
                if (Intrinsics.c(((UserAccount) obj).getDataSharingOptOut(), Boolean.TRUE)) {
                    hhkVar.r = d;
                    hhkVar.u = 3;
                    obj = dhkVar.f(hhkVar);
                } else {
                    hhkVar.r = null;
                    hhkVar.u = 2;
                }
                return lu3Var;
            }
        }
        hhkVar = new hhk(this, sq3Var);
        obj = hhkVar.s;
        lu3 lu3Var2 = lu3.a;
        i = hhkVar.u;
        if (i != 0) {
        }
        if (Intrinsics.c(((UserAccount) obj).getDataSharingOptOut(), Boolean.TRUE)) {
        }
        return lu3Var2;
    }
}
