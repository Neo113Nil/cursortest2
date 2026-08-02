package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di;

import As.C2444a;
import Pc.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/di/StickyPromoBadgeDIComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeMapper;", "getMapper", "()Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "getTotalVisibilityViewModelProvider", "()LPc/a;", "totalVisibilityViewModelProvider", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StickyPromoBadgeDIComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/di/StickyPromoBadgeDIComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/di/StickyPromoBadgeDIComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StickyPromoBadgeDIComponent create$lambda$0(C7475g c7475g) {
            return new StickyPromoBadgeDIComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<StickyPromoBadgeDIComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(StickyPromoBadgeDIComponent.class), new C2444a(storage, 11));
        }
    }

    @NotNull
    StickyPromoBadgeMapper getMapper();

    @NotNull
    a<TotalVisibilityViewModel> getTotalVisibilityViewModelProvider();
}
