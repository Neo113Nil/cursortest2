package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SubviewsDelegate$getProductsRecyclerScrollState$1 extends AbstractC7737t implements Function1<RecyclerView, Unit> {
    final /* synthetic */ M<Parcelable> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubviewsDelegate$getProductsRecyclerScrollState$1(M<Parcelable> m11) {
        super(1);
        this.$state = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecyclerView recyclerView) {
        invoke2(recyclerView);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        M<Parcelable> m11 = this.$state;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        m11.f71787a = layoutManager != null ? layoutManager.onSaveInstanceState() : 0;
    }
}
