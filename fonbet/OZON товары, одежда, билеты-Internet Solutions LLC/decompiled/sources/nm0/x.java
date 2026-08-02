package nm0;

import Sc.r;
import Ve.Xn;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes4.dex */
public final class x extends AbstractC7737t implements Function1<lm0.e<Unit>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8609D f77428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f77429c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C8609D c8609d, ReviewInfo reviewInfo) {
        super(1);
        this.f77428b = c8609d;
        this.f77429c = reviewInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lm0.e<Unit> eVar) {
        Object a11;
        lm0.e<Unit> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C8609D c8609d = this.f77428b;
        ReviewInfo reviewInfo = this.f77429c;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Context context = c8609d.f77384a;
            String applicationId = c8609d.f77385b;
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            C8609D.a(c8609d.f77384a, new v(emitter), new j(context, reviewInfo, applicationId, new Xn(emitter, 1), new w(emitter, 0)));
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            emitter.a(b11);
        }
        return Unit.f71690a;
    }
}
