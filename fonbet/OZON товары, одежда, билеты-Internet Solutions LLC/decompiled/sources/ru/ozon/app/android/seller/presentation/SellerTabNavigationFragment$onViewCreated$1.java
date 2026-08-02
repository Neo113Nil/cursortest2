package ru.ozon.app.android.seller.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SellerTabNavigationFragment$onViewCreated$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SellerTabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTabNavigationFragment$onViewCreated$1(SellerTabNavigationFragment sellerTabNavigationFragment) {
        super(0);
        this.this$0 = sellerTabNavigationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SellerViewModel sellerViewModel;
        String str;
        String str2;
        sellerViewModel = this.this$0.sellerViewModel;
        if (sellerViewModel == null) {
            Intrinsics.n("sellerViewModel");
            throw null;
        }
        str = this.this$0.miniAppName;
        if (str == null) {
            Intrinsics.n("miniAppName");
            throw null;
        }
        str2 = this.this$0.referrerMiniAppName;
        sellerViewModel.getTabConfig(str, str2);
    }
}
