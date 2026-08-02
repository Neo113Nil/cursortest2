package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ge.n;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import xe.B0;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder$onAttach$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkuThinScrollItemViewHolder$onAttach$1 implements DefaultLifecycleObserver {
    final /* synthetic */ SkuThinScrollItemViewHolder<VB> this$0;

    SkuThinScrollItemViewHolder$onAttach$1(SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder) {
        this.this$0 = skuThinScrollItemViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onCreate$bindIcon(SkuThinScrollItemViewHolder skuThinScrollItemViewHolder, SkuThinScrollVO.ItemVO itemVO, d dVar) {
        skuThinScrollItemViewHolder.bindIcon(itemVO);
        return Unit.f71690a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(J owner) {
        CartButtonDelegate cartButtonDelegate;
        AdultDelegate adultDelegate;
        B0 b02;
        AdultDelegate adultDelegate2;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        cartButtonDelegate = ((SkuThinScrollItemViewHolder) this.this$0).cartButtonDelegate;
        if (cartButtonDelegate != null) {
            cartButtonDelegate.observeButtonState(new SkuThinScrollItemViewHolder$onAttach$1$onCreate$1(this.this$0));
        }
        SkuThinScrollVO.ItemVO boundItem = this.this$0.getBoundItem();
        if (boundItem == null || !boundItem.getIsAdult()) {
            return;
        }
        adultDelegate = ((SkuThinScrollItemViewHolder) this.this$0).adultDelegate;
        if (adultDelegate != null) {
            b02 = ((SkuThinScrollItemViewHolder) this.this$0).job;
            if (b02 != null && b02.isActive()) {
                this.this$0.stopJob();
            }
            SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder = this.this$0;
            adultDelegate2 = ((SkuThinScrollItemViewHolder) skuThinScrollItemViewHolder).adultDelegate;
            InterfaceC2395h a11 = n.a(adultDelegate2.observeItem());
            composerReferences = ((SkuThinScrollItemViewHolder) this.this$0).refs;
            C c11 = new C(new C2408n0(C5427n.a(a11, composerReferences.getContainer().g().getLifecycle(), AbstractC5434v.b.STARTED), new SkuThinScrollItemViewHolder$onAttach$1$onCreate$2(this.this$0)), new SkuThinScrollItemViewHolder$onAttach$1$onCreate$3(null));
            composerReferences2 = ((SkuThinScrollItemViewHolder) this.this$0).refs;
            ((SkuThinScrollItemViewHolder) skuThinScrollItemViewHolder).job = C2399j.C(c11, K.a(composerReferences2.getContainer().g()));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(J owner) {
        CartButtonDelegate cartButtonDelegate;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        cartButtonDelegate = ((SkuThinScrollItemViewHolder) this.this$0).cartButtonDelegate;
        if (cartButtonDelegate != null) {
            cartButtonDelegate.detach();
        }
        this.this$0.stopJob();
        composerReferences = ((SkuThinScrollItemViewHolder) this.this$0).refs;
        composerReferences.getContainer().g().getLifecycle().e(this);
    }
}
