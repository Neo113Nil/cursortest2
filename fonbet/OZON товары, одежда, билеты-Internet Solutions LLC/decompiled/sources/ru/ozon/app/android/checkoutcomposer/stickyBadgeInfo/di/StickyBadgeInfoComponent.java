package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di;

import Ro.C3938a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation.StickyBadgeInfoMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/di/StickyBadgeInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoMapper;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoMapper;", "mapper", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "getTotalVisibilityViewModel", "()Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StickyBadgeInfoComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/di/StickyBadgeInfoComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/di/StickyBadgeInfoComponent;", "create", "()Lk20/e;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StickyBadgeInfoComponent create$lambda$0() {
            return new StickyBadgeInfoComponent() { // from class: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di.StickyBadgeInfoComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(StickyBadgeInfoComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: totalVisibilityViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j totalVisibilityViewModel = k.b(StickyBadgeInfoComponent$Companion$create$1$1$totalVisibilityViewModel$2.INSTANCE);

                @Override // ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di.StickyBadgeInfoComponent
                public StickyBadgeInfoMapper getMapper() {
                    return (StickyBadgeInfoMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di.StickyBadgeInfoComponent
                public TotalVisibilityViewModel getTotalVisibilityViewModel() {
                    return (TotalVisibilityViewModel) this.totalVisibilityViewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<StickyBadgeInfoComponent> create() {
            return new C7473e<>(N.b(StickyBadgeInfoComponent.class), new C3938a(0));
        }
    }

    @NotNull
    StickyBadgeInfoMapper getMapper();

    @NotNull
    TotalVisibilityViewModel getTotalVisibilityViewModel();
}
