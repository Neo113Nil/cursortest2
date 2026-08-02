package defpackage;

import com.sofascore.results.stagesport.StageConstructorActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c2i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageConstructorActivity b;

    public /* synthetic */ c2i(StageConstructorActivity stageConstructorActivity, int i) {
        this.a = i;
        this.b = stageConstructorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageConstructorActivity stageConstructorActivity = this.b;
        switch (i) {
            case 0:
                int i2 = StageConstructorActivity.R;
                break;
            case 1:
                int i3 = StageConstructorActivity.R;
                stageConstructorActivity.N();
                break;
            default:
                int i4 = StageConstructorActivity.R;
                ((n2i) stageConstructorActivity.M.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
