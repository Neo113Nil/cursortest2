package defpackage;

import com.sofascore.results.stagesport.StageCategoryActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e1i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageCategoryActivity b;

    public /* synthetic */ e1i(StageCategoryActivity stageCategoryActivity, int i) {
        this.a = i;
        this.b = stageCategoryActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageCategoryActivity stageCategoryActivity = this.b;
        switch (i) {
            case 0:
                return stageCategoryActivity.getDefaultViewModelProviderFactory();
            case 1:
                return stageCategoryActivity.getViewModelStore();
            default:
                return stageCategoryActivity.getDefaultViewModelCreationExtras();
        }
    }
}
