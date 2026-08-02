package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonsComposableKt$ButtonsComposable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ButtonV3DTO $addPhotoButton;
    final /* synthetic */ ButtonV3DTO $continueButton;
    final /* synthetic */ Function1<AtomAction, Unit> $onAddPhoto;
    final /* synthetic */ Function1<AtomAction, Unit> $onContinue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonsComposableKt$ButtonsComposable$2(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Function1<? super AtomAction, Unit> function1, Function1<? super AtomAction, Unit> function12, int i11) {
        super(2);
        this.$continueButton = buttonV3DTO;
        this.$addPhotoButton = buttonV3DTO2;
        this.$onContinue = function1;
        this.$onAddPhoto = function12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ButtonsComposableKt.ButtonsComposable(this.$continueButton, this.$addPhotoButton, this.$onContinue, this.$onAddPhoto, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
