package defpackage;

import android.content.SharedPreferences;
import com.sofascore.model.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class px5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Country c;

    public /* synthetic */ px5(int i, Country country, int i2) {
        this.a = i2;
        this.b = i;
        this.c = country;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Country country = this.c;
        int i2 = this.b;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        switch (i) {
            case 0:
                editor.getClass();
                editor.putInt("tv_mcc_" + i2, country.getMccList().get(0).intValue());
                break;
            default:
                editor.getClass();
                editor.putInt("tv_mcc_" + i2, country.getMccList().get(0).intValue());
                break;
        }
        return Unit.a;
    }
}
