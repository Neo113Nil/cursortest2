package defpackage;

import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rmc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaFightNightActivity b;

    public /* synthetic */ rmc(MmaFightNightActivity mmaFightNightActivity, int i) {
        this.a = i;
        this.b = mmaFightNightActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MmaFightNightActivity mmaFightNightActivity = this.b;
        switch (i) {
            case 0:
                return mmaFightNightActivity.getDefaultViewModelProviderFactory();
            case 1:
                return mmaFightNightActivity.getViewModelStore();
            default:
                return mmaFightNightActivity.getDefaultViewModelCreationExtras();
        }
    }
}
