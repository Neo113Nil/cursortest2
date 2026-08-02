package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormRatingComposableKt$SafeRatingWrapper$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ RatingDTO $dto;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<Float, Unit> $onSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormRatingComposableKt$SafeRatingWrapper$1(e eVar, RatingDTO ratingDTO, Function1<? super Float, Unit> function1, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$dto = ratingDTO;
        this.$onSelected = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReviewFormRatingComposableKt.SafeRatingWrapper(this.$modifier, this.$dto, this.$onSelected, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
