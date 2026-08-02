package defpackage;

import com.sofascore.results.stagesport.StageDriverActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q4i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDriverActivity b;

    public /* synthetic */ q4i(StageDriverActivity stageDriverActivity, int i) {
        this.a = i;
        this.b = stageDriverActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageDriverActivity stageDriverActivity = this.b;
        switch (i) {
            case 0:
                int i2 = StageDriverActivity.R;
                break;
            case 1:
                int i3 = StageDriverActivity.R;
                stageDriverActivity.N();
                break;
            default:
                int i4 = StageDriverActivity.R;
                ((c5i) stageDriverActivity.M.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
