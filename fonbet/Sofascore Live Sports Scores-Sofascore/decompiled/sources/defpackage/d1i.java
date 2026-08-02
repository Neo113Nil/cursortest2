package defpackage;

import com.sofascore.results.stagesport.StageCategoryActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class d1i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageCategoryActivity b;

    public /* synthetic */ d1i(StageCategoryActivity stageCategoryActivity, int i) {
        this.a = i;
        this.b = stageCategoryActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StageCategoryActivity stageCategoryActivity = this.b;
        switch (i) {
            case 0:
                int i2 = StageCategoryActivity.R;
                return new b2i(stageCategoryActivity, stageCategoryActivity.Q().k, stageCategoryActivity.Q().h);
            default:
                int i3 = StageCategoryActivity.R;
                stageCategoryActivity.Y().F();
                return Unit.a;
        }
    }
}
