package nm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes4.dex */
public final class z extends AbstractC7737t implements Function1<ReviewInfo, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm0.e<ReviewInfo> f77432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(lm0.e<ReviewInfo> eVar) {
        super(1);
        this.f77432b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReviewInfo reviewInfo) {
        ReviewInfo reviewInfo2 = reviewInfo;
        Intrinsics.checkNotNullParameter(reviewInfo2, "reviewInfo");
        this.f77432b.b(reviewInfo2);
        return Unit.f71690a;
    }
}
