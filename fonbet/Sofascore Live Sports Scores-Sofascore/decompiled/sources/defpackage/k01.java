package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.results.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k01 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ k01(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        int i = this.a;
        BaseActivity baseActivity = this.b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = BaseActivity.H;
                baseActivity.s = System.currentTimeMillis();
                return Unit.a;
            default:
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "PREF_PREDICTIONS_NOTIFICATION_PERMISSION", true);
                Unit unit = Unit.a;
                i2.apply();
                return Unit.a;
        }
    }
}
