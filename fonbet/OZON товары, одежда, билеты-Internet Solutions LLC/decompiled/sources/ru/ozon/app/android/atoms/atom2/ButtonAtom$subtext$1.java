package ru.ozon.app.android.atoms.atom2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/atoms/atom2/ButtonAtom$ViewContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ButtonAtom$subtext$1 extends AbstractC7737t implements Function1<ButtonAtom.ViewContainer, Unit> {
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonAtom$subtext$1(String str) {
        super(1);
        this.$value = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ButtonAtom.ViewContainer viewContainer) {
        invoke2(viewContainer);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ButtonAtom.ViewContainer it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        it.getSubtitleView().setText(this.$value);
        ViewExtKt.showOrGone(it.getSubtitleView(), Boolean.valueOf((!it.getSubtitleVisibility() || (str = this.$value) == null || h.K(str)) ? false : true));
    }
}
