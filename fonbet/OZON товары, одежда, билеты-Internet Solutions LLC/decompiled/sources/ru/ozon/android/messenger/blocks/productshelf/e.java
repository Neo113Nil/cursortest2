package ru.ozon.android.messenger.blocks.productshelf;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<ViewGroup.MarginLayoutParams, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f86060b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f86061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, b bVar) {
        super(1);
        this.f86060b = iVar;
        this.f86061c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i11;
        ViewGroup.MarginLayoutParams updateMarginLP = marginLayoutParams;
        Intrinsics.checkNotNullParameter(updateMarginLP, "$this$updateMarginLP");
        if (this.f86060b.f() != null) {
            this.f86061c.getClass();
            i11 = ru.ozon.android.messenger.utils.e.f91906c;
        } else {
            i11 = 0;
        }
        updateMarginLP.topMargin = i11;
        return Unit.f71690a;
    }
}
