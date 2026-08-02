package defpackage;

import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.results.mvvm.base.AbstractFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s3 implements Function0 {
    public final /* synthetic */ AbstractFragment a;
    public final /* synthetic */ SurveyConfigData b;
    public final /* synthetic */ boolean c;

    public s3(AbstractFragment abstractFragment, SurveyConfigData surveyConfigData, boolean z) {
        this.a = abstractFragment;
        this.b = surveyConfigData;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        p1f p1fVar = this.a.k;
        if (p1fVar != null) {
            p1fVar.a(new f1f(this.b, this.c));
            return Unit.a;
        }
        Intrinsics.i("popUpManager");
        throw null;
    }
}
