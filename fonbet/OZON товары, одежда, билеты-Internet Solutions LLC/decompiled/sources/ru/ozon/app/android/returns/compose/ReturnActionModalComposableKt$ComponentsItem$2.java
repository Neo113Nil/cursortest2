package ru.ozon.app.android.returns.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.uploadPhotos.model.ViewState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$ComponentsItem$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ReturnActionModalVO $item;
    final /* synthetic */ Function1<Integer, Unit> $onPhotoLimitChanged;
    final /* synthetic */ Function1<Integer, Unit> $onPhotoPickerClicked;
    final /* synthetic */ Function1<Long, Unit> $onRemovePhotoClicked;
    final /* synthetic */ Function1<Long, Unit> $onRetryLoadPhotoClick;
    final /* synthetic */ Function2<Component, String, Unit> $onTextEntered;
    final /* synthetic */ ViewState $photosState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalComposableKt$ComponentsItem$2(ReturnActionModalVO returnActionModalVO, ViewState viewState, Function1<? super Integer, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Integer, Unit> function13, Function2<? super Component, ? super String, Unit> function2, Function1<? super Long, Unit> function14, int i11) {
        super(2);
        this.$item = returnActionModalVO;
        this.$photosState = viewState;
        this.$onPhotoPickerClicked = function1;
        this.$onRemovePhotoClicked = function12;
        this.$onPhotoLimitChanged = function13;
        this.$onTextEntered = function2;
        this.$onRetryLoadPhotoClick = function14;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReturnActionModalComposableKt.ComponentsItem(this.$item, this.$photosState, this.$onPhotoPickerClicked, this.$onRemovePhotoClicked, this.$onPhotoLimitChanged, this.$onTextEntered, this.$onRetryLoadPhotoClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
