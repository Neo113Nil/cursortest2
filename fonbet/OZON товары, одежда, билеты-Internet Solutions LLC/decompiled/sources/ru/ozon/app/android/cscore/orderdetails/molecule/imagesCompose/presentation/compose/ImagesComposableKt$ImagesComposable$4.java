package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImagesVO;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ImagesComposableKt$ImagesComposable$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AdultListDelegate<ComposableImageVO> $adultListDelegate;
    final /* synthetic */ HorizontalPadding $horizontalPadding;
    final /* synthetic */ ComposableImagesVO $item;
    final /* synthetic */ int $maxCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ImagesComposableKt$ImagesComposable$4(ComposableImagesVO composableImagesVO, HorizontalPadding horizontalPadding, AdultListDelegate<ComposableImageVO> adultListDelegate, int i11, Function1<? super AtomAction, Unit> function1, int i12) {
        super(2);
        this.$item = composableImagesVO;
        this.$horizontalPadding = horizontalPadding;
        this.$adultListDelegate = adultListDelegate;
        this.$maxCount = i11;
        this.$actionHandler = function1;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ImagesComposableKt.ImagesComposable(this.$item, this.$horizontalPadding, this.$adultListDelegate, this.$maxCount, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
