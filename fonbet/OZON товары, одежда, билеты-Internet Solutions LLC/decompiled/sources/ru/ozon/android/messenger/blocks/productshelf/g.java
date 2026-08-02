package ru.ozon.android.messenger.blocks.productshelf;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f86063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(b bVar) {
        super(1);
        this.f86063b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i11;
        int i12;
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        this.f86063b.getClass();
        i11 = ru.ozon.android.messenger.utils.e.f91911h;
        updateMarginLP.setMarginStart(i11);
        i12 = ru.ozon.android.messenger.utils.e.f91911h;
        updateMarginLP.setMarginEnd(i12);
        return Unit.f71690a;
    }
}
