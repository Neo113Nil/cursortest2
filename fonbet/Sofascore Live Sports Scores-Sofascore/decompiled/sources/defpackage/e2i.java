package defpackage;

import com.sofascore.results.stagesport.StageConstructorActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e2i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageConstructorActivity b;

    public /* synthetic */ e2i(StageConstructorActivity stageConstructorActivity, int i) {
        this.a = i;
        this.b = stageConstructorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageConstructorActivity stageConstructorActivity = this.b;
        switch (i) {
            case 0:
                return stageConstructorActivity.getDefaultViewModelProviderFactory();
            case 1:
                return stageConstructorActivity.getViewModelStore();
            default:
                return stageConstructorActivity.getDefaultViewModelCreationExtras();
        }
    }
}
