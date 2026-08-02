package ru.ozon.app.android.atoms.atom2;

import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "typedAttrs", "Landroid/content/res/TypedArray;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ButtonAtom$constructTitle$1 extends AbstractC7737t implements Function1<TypedArray, Unit> {
    final /* synthetic */ K $titleStyleAttr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonAtom$constructTitle$1(K k11) {
        super(1);
        this.$titleStyleAttr = k11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TypedArray typedArray) {
        invoke2(typedArray);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TypedArray typedAttrs) {
        Intrinsics.checkNotNullParameter(typedAttrs, "typedAttrs");
        K k11 = this.$titleStyleAttr;
        k11.f71785a = typedAttrs.getResourceId(0, k11.f71785a);
    }
}
