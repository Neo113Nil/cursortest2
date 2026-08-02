package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class h01 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ h01(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dd ddVar;
        int i = this.a;
        int i2 = 0;
        BaseActivity baseActivity = this.b;
        switch (i) {
            case 0:
                ibd ibdVar = (ibd) obj;
                KProperty[] kPropertyArr = BaseActivity.H;
                if (Intrinsics.c(ibdVar, fbd.a)) {
                    String str = ke0.j;
                    baseActivity.p = str;
                    if (str == null || (ddVar = baseActivity.n) == null) {
                        baseActivity.E();
                    } else {
                        ((TextView) ddVar.c).setText(str);
                        dd ddVar2 = baseActivity.n;
                        if (ddVar2 != null) {
                            GraphicLarge graphicLarge = (GraphicLarge) ddVar2.d;
                            String str2 = baseActivity.p;
                            str2.getClass();
                            graphicLarge.setTitleResource(str2);
                        }
                        dd ddVar3 = baseActivity.n;
                        if (ddVar3 != null) {
                            ((GraphicLarge) ddVar3.d).setSubtitleVisibility(false);
                        }
                        baseActivity.K();
                    }
                } else if (Intrinsics.c(ibdVar, gbd.a)) {
                    baseActivity.K();
                } else {
                    if (!Intrinsics.c(ibdVar, hbd.a)) {
                        zzl.b();
                        return null;
                    }
                    baseActivity.E();
                }
                return Unit.a;
            case 1:
                j1f j1fVar = (j1f) obj;
                KProperty[] kPropertyArr2 = BaseActivity.H;
                if (j1fVar != null) {
                    g6b lifecycle = baseActivity.getLifecycle();
                    if (lifecycle.b().compareTo(e6b.e) >= 0) {
                        j1f j1fVar2 = (j1f) baseActivity.z().d.d();
                        if (j1fVar2 != null) {
                            baseActivity.L(j1fVar2);
                        }
                    } else {
                        lifecycle.a(new o01(lifecycle, baseActivity, i2));
                    }
                }
                return Unit.a;
            default:
                ((Boolean) obj).getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                if (sharedPreferences.getBoolean("PREF_SHOW_PREDICTION_DIALOG", true)) {
                    if (zic.B(baseActivity)) {
                        zic.E(baseActivity, new mn(baseActivity, 9));
                    } else {
                        zic.J(baseActivity);
                    }
                }
                return Unit.a;
        }
    }
}
