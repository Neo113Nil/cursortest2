package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import S0.A1;
import S0.InterfaceC3972m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormRatingComposableKt$SafeRatingWrapper$stableOnSelected$1$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ A1<Function1<Float, Unit>> $actualOnSelected$delegate;
    final /* synthetic */ InterfaceC3972m0 $resetKey$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormRatingComposableKt$SafeRatingWrapper$stableOnSelected$1$1(A1<? extends Function1<? super Float, Unit>> a12, InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.$actualOnSelected$delegate = a12;
        this.$resetKey$delegate = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        Function1 SafeRatingWrapper$lambda$8;
        Function1 SafeRatingWrapper$lambda$82;
        int intValue;
        if (f7 >= 1.0f) {
            SafeRatingWrapper$lambda$8 = ReviewFormRatingComposableKt.SafeRatingWrapper$lambda$8(this.$actualOnSelected$delegate);
            SafeRatingWrapper$lambda$8.invoke(Float.valueOf(f7));
        } else {
            SafeRatingWrapper$lambda$82 = ReviewFormRatingComposableKt.SafeRatingWrapper$lambda$8(this.$actualOnSelected$delegate);
            SafeRatingWrapper$lambda$82.invoke(Float.valueOf(1.0f));
            intValue = this.$resetKey$delegate.getIntValue();
            this.$resetKey$delegate.d(intValue + 1);
        }
    }
}
