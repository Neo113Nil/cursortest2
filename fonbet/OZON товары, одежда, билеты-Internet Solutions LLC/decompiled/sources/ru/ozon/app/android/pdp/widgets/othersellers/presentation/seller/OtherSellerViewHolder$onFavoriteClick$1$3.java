package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$onFavoriteClick$1$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ boolean $selected;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellerViewHolder$onFavoriteClick$1$3(View view, boolean z11) {
        super(1);
        this.$view = view;
        this.$selected = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$view.setSelected(this.$selected);
    }
}
