package defpackage;

import com.sofascore.results.stagesport.StageDetailsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p2i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDetailsActivity b;

    public /* synthetic */ p2i(StageDetailsActivity stageDetailsActivity, int i) {
        this.a = i;
        this.b = stageDetailsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageDetailsActivity stageDetailsActivity = this.b;
        switch (i) {
            case 0:
                return stageDetailsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return stageDetailsActivity.getViewModelStore();
            default:
                return stageDetailsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
