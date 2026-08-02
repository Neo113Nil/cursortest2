package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import cw.C5978a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeMapper;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/di/StickyPromoBadgeDIComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/di/StickyPromoBadgeDIComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModelProvider", "LPc/a;", "getTotalVisibilityViewModelProvider", "()LPc/a;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBadgeDIComponent$Companion$create$1$1 implements StickyPromoBadgeDIComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(StickyPromoBadgeDIComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<TotalVisibilityViewModel> totalVisibilityViewModelProvider = new C5978a(2);

    StickyPromoBadgeDIComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TotalVisibilityViewModel totalVisibilityViewModelProvider$lambda$0() {
        return new TotalVisibilityViewModel();
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di.StickyPromoBadgeDIComponent
    public StickyPromoBadgeMapper getMapper() {
        return (StickyPromoBadgeMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di.StickyPromoBadgeDIComponent
    public a<TotalVisibilityViewModel> getTotalVisibilityViewModelProvider() {
        return this.totalVisibilityViewModelProvider;
    }
}
