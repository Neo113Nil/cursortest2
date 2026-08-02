package ru.ozon.app.android.seller.presentation;

import Sc.o;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.miniapp.databinding.FragmentSellerTabBinding;
import ru.ozon.app.android.seller.presentation.SellerState;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/seller/presentation/SellerState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/seller/presentation/SellerState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SellerTabNavigationFragment$onViewCreated$2 extends AbstractC7737t implements Function1<SellerState, Unit> {
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ SellerTabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTabNavigationFragment$onViewCreated$2(SellerTabNavigationFragment sellerTabNavigationFragment, Bundle bundle) {
        super(1);
        this.this$0 = sellerTabNavigationFragment;
        this.$savedInstanceState = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SellerState sellerState) {
        invoke2(sellerState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SellerState sellerState) {
        FragmentSellerTabBinding binding;
        FragmentSellerTabBinding binding2;
        if (sellerState instanceof SellerState.Loading) {
            binding2 = this.this$0.getBinding();
            binding2.screenState.showState(new ScreenState.Loading());
        } else if (sellerState instanceof SellerState.Error) {
            binding = this.this$0.getBinding();
            binding.screenState.showState(ScreenStateExtKt.toScreenState$default(((SellerState.Error) sellerState).getEx(), null, false, 3, null));
        } else {
            if (!(sellerState instanceof SellerState.Success)) {
                throw new o();
            }
            this.this$0.handleSuccessfulState((SellerState.Success) sellerState, this.$savedInstanceState);
        }
    }
}
