package defpackage;

import com.sofascore.results.stagesport.StageDriverActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s4i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDriverActivity b;

    public /* synthetic */ s4i(StageDriverActivity stageDriverActivity, int i) {
        this.a = i;
        this.b = stageDriverActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageDriverActivity stageDriverActivity = this.b;
        switch (i) {
            case 0:
                return stageDriverActivity.getDefaultViewModelProviderFactory();
            case 1:
                return stageDriverActivity.getViewModelStore();
            default:
                return stageDriverActivity.getDefaultViewModelCreationExtras();
        }
    }
}
