package ru.ozon.app.android.atoms.atom2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/atoms/atom2/ButtonAtom$ViewContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ButtonAtom$setEnabled$1 extends AbstractC7737t implements Function1<ButtonAtom.ViewContainer, Unit> {
    final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonAtom$setEnabled$1(boolean z11) {
        super(1);
        this.$enabled = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ButtonAtom.ViewContainer viewContainer) {
        invoke2(viewContainer);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ButtonAtom.ViewContainer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getContainer().setEnabled(this.$enabled);
        it.getTitleView().setEnabled(this.$enabled);
        it.getSubtitleView().setEnabled(this.$enabled);
    }
}
