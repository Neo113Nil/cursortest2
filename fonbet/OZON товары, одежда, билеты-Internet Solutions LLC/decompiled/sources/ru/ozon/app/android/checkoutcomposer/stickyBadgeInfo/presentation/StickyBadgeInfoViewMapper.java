package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.data.StickyBadgeInfoDTO;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di.StickyBadgeInfoComponent;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation.StickyBadgeInfoViewMapper;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoViewMapper;", "Lc20/r;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/data/StickyBadgeInfoDTO;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoVO;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/di/StickyBadgeInfoComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/di/StickyBadgeInfoComponent;)V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/data/StickyBadgeInfoDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/di/StickyBadgeInfoComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyBadgeInfoViewMapper extends r<StickyBadgeInfoDTO, StickyBadgeInfoVO> {

    @NotNull
    private final StickyBadgeInfoComponent component;

    @NotNull
    private final r.a viewType;

    public StickyBadgeInfoViewMapper(@NotNull StickyBadgeInfoComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$4(FrameLayout frameLayout, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return frameLayout;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyBadgeInfoVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        BadgeView badgeView = new BadgeView(L11, null, 0, 6, null);
        badgeView.setId(R$id.stickyBadgeView);
        final FrameLayout frameLayout = new FrameLayout(container.L());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(badgeView);
        return new StickyBadgeInfoViewHolder(container, (TotalVisibilityViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation.StickyBadgeInfoViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                StickyBadgeInfoComponent stickyBadgeInfoComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                stickyBadgeInfoComponent = StickyBadgeInfoViewMapper.this.component;
                TotalVisibilityViewModel totalVisibilityViewModel = stickyBadgeInfoComponent.getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class), new InterfaceC6068e() { // from class: So.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$4;
                createHolder$lambda$4 = StickyBadgeInfoViewMapper.createHolder$lambda$4(frameLayout, (LinearLayout) viewGroup);
                return createHolder$lambda$4;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyBadgeInfoVO> map(@NotNull StickyBadgeInfoDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
