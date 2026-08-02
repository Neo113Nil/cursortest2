package defpackage;

import com.sofascore.results.mma.fighter.MmaFighterActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pnc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaFighterActivity b;

    public /* synthetic */ pnc(MmaFighterActivity mmaFighterActivity, int i) {
        this.a = i;
        this.b = mmaFighterActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MmaFighterActivity mmaFighterActivity = this.b;
        switch (i) {
            case 0:
                return mmaFighterActivity.getDefaultViewModelProviderFactory();
            case 1:
                return mmaFighterActivity.getViewModelStore();
            default:
                return mmaFighterActivity.getDefaultViewModelCreationExtras();
        }
    }
}
