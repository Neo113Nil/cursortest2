package ru.ozon.android.messenger.blocks.messagetext;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f85877b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(g gVar) {
        super(1);
        this.f85877b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i11;
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        this.f85877b.getClass();
        i11 = ru.ozon.android.messenger.utils.e.f91905b;
        updateMarginLP.setMarginStart(i11);
        return Unit.f71690a;
    }
}
