package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data.StickyPromoBadgeDTO;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di.StickyPromoBadgeDIComponent;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.domain.StickyPromoBadgeVO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/di/StickyPromoBadgeDIComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyPromoBadgeViewMapper extends OverlayWidgetScreenViewItemMapper2<StickyPromoBadgeDIComponent, StickyPromoBadgeDTO, StickyPromoBadgeVO> {
    /* JADX INFO: Access modifiers changed from: private */
    public final View createView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StickyPromoBadgeView stickyPromoBadgeView = new StickyPromoBadgeView(context, null, 0, 6, null);
        stickyPromoBadgeView.setId(R$id.checkoutStickyPromoBadgeContainer);
        stickyPromoBadgeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        stickyPromoBadgeView.setClipToOutline(true);
        stickyPromoBadgeView.setOrientation(0);
        return stickyPromoBadgeView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyPromoBadgeVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        StickyPromoBadgeViewMapper$createHolder$1 stickyPromoBadgeViewMapper$createHolder$1 = new StickyPromoBadgeViewMapper$createHolder$1(this);
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TotalVisibilityViewModel totalVisibilityViewModel = StickyPromoBadgeViewMapper.this.component().getTotalVisibilityViewModelProvider().get();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new StickyPromoBadgeViewHolder(container, stickyPromoBadgeViewMapper$createHolder$1, (TotalVisibilityViewModel) a11);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyPromoBadgeDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return StickyPromoBadgeDIComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyPromoBadgeVO> map(@NotNull StickyPromoBadgeDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
