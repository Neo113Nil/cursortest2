package defpackage;

import android.os.Bundle;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class nnc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaFighterActivity b;

    public /* synthetic */ nnc(MmaFighterActivity mmaFighterActivity, int i) {
        this.a = i;
        this.b = mmaFighterActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MmaFighterActivity mmaFighterActivity = this.b;
        switch (i) {
            case 0:
                int i2 = MmaFighterActivity.U;
                Bundle extras = mmaFighterActivity.getIntent().getExtras();
                break;
            case 1:
                int i3 = MmaFighterActivity.U;
                break;
            case 2:
                int i4 = MmaFighterActivity.U;
                mmaFighterActivity.N();
                break;
            default:
                int i5 = MmaFighterActivity.U;
                ((voc) mmaFighterActivity.O.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
