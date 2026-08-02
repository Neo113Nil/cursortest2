package defpackage;

import android.os.Bundle;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pmc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaFightNightActivity b;

    public /* synthetic */ pmc(MmaFightNightActivity mmaFightNightActivity, int i) {
        this.a = i;
        this.b = mmaFightNightActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MmaFightNightActivity mmaFightNightActivity = this.b;
        switch (i) {
            case 0:
                int i2 = MmaFightNightActivity.R;
                break;
            case 1:
                int i3 = MmaFightNightActivity.R;
                Bundle extras = mmaFightNightActivity.getIntent().getExtras();
                break;
            case 2:
                int i4 = MmaFightNightActivity.R;
                mmaFightNightActivity.N();
                break;
            default:
                int i5 = MmaFightNightActivity.R;
                ((inc) mmaFightNightActivity.N.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
