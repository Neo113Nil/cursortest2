package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Hi.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHi/g;", "result", "", "invoke", "(LHi/g;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SearchByImageRouter$openGallery$1 extends AbstractC7737t implements Function1<g, Unit> {
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ Function1<g, Unit> $handleGalleryResult;
    final /* synthetic */ SearchByImageRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchByImageRouter$openGallery$1(SearchByImageRouter searchByImageRouter, ComponentCallbacksC5392m componentCallbacksC5392m, Function1<? super g, Unit> function1) {
        super(1);
        this.this$0 = searchByImageRouter;
        this.$fragment = componentCallbacksC5392m;
        this.$handleGalleryResult = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
        invoke2(gVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(g result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.this$0.checkIfSearchOnboarding(this.$fragment);
        this.$handleGalleryResult.invoke(result);
    }
}
