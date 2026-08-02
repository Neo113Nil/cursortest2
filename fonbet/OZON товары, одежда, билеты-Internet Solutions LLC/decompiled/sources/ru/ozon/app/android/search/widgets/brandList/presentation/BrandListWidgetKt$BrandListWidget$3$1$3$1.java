package ru.ozon.app.android.search.widgets.brandList.presentation;

import GZ.g;
import GZ.l;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BrandListWidgetKt$BrandListWidget$3$1$3$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ g $router;
    final /* synthetic */ InterfaceC3978p0<String> $searchText$delegate;
    final /* synthetic */ BrandListViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandListWidgetKt$BrandListWidget$3$1$3$1(BrandListViewModel brandListViewModel, g gVar, InterfaceC3978p0<String> interfaceC3978p0) {
        super(0);
        this.$viewModel = brandListViewModel;
        this.$router = gVar;
        this.$searchText$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$searchText$delegate.setValue("");
        this.$viewModel.clearSearchText();
        l.a(this.$router);
    }
}
