package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c41 extends ouk {
    public final /* synthetic */ d41 a;

    public c41(d41 d41Var) {
        this.a = d41Var;
    }

    @Override // defpackage.ouk
    public final void c(final int i) {
        final d41 d41Var = this.a;
        if (d41Var.n) {
            jta jtaVar = d41Var.o;
            if (jtaVar != null) {
                jtaVar.invoke(Integer.valueOf(i));
            }
            final int i2 = i - 1;
            final int i3 = i + 1;
            d41Var.j.post(new Runnable() { // from class: a41
                @Override // java.lang.Runnable
                public final void run() {
                    boolean c;
                    g6b lifecycle;
                    d41 d41Var2 = d41Var;
                    ArrayList arrayList = d41Var2.l;
                    int i4 = i;
                    if (i4 < 0 || i4 >= arrayList.size()) {
                        return;
                    }
                    Fragment z = d41Var2.z(i4);
                    AbstractFragment abstractFragment = z instanceof AbstractFragment ? (AbstractFragment) z : null;
                    if (abstractFragment != null) {
                        abstractFragment.q();
                    } else {
                        abstractFragment = null;
                    }
                    Boolean bool = y05.a;
                    Context y = d41Var2.y();
                    y.getClass();
                    Boolean bool2 = y05.a;
                    if (bool2 != null) {
                        c = bool2.equals(Boolean.TRUE);
                    } else {
                        Object systemService = y.getSystemService("activity");
                        systemService.getClass();
                        ActivityManager activityManager = (ActivityManager) systemService;
                        activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
                        double d = r5.totalMem * 1.0E-9d;
                        y05.a = Boolean.valueOf(Runtime.getRuntime().availableProcessors() <= 4 || (activityManager.getMemoryClass() <= 128) || ((d > 4.0d ? 1 : (d == 4.0d ? 0 : -1)) <= 0));
                        Boolean bool3 = y05.a;
                        Boolean bool4 = Boolean.TRUE;
                        Intrinsics.c(bool3, bool4);
                        rei.b(1, Double.valueOf(d));
                        ugj.a.getClass();
                        c = Intrinsics.c(y05.a, bool4);
                    }
                    if (c || abstractFragment == null || (lifecycle = abstractFragment.getLifecycle()) == null) {
                        return;
                    }
                    int compareTo = lifecycle.b().compareTo(e6b.e);
                    int i5 = i2;
                    int i6 = i3;
                    if (compareTo < 0) {
                        lifecycle.a(new b41(lifecycle, i5, d41Var2, i6));
                        return;
                    }
                    if (i5 >= 0 && i5 < arrayList.size()) {
                        Fragment z2 = d41Var2.z(i5);
                        AbstractFragment abstractFragment2 = z2 instanceof AbstractFragment ? (AbstractFragment) z2 : null;
                        if (abstractFragment2 != null) {
                            abstractFragment2.q();
                        }
                    }
                    if (i6 < 0 || i6 >= arrayList.size()) {
                        return;
                    }
                    Fragment z3 = d41Var2.z(i6);
                    AbstractFragment abstractFragment3 = z3 instanceof AbstractFragment ? (AbstractFragment) z3 : null;
                    if (abstractFragment3 != null) {
                        abstractFragment3.q();
                    }
                }
            });
        }
    }
}
