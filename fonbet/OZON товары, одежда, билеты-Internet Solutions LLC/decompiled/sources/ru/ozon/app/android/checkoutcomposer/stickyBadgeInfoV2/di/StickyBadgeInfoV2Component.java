package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.di;

import QU.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/di/StickyBadgeInfoV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/di/TotalVisibilityViewModelFactory;", "getTotalVisibilityViewModelFactory", "()Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/di/TotalVisibilityViewModelFactory;", "totalVisibilityViewModelFactory", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StickyBadgeInfoV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/di/StickyBadgeInfoV2Component$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/di/StickyBadgeInfoV2Component;", "create", "()Lk20/e;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StickyBadgeInfoV2Component create$lambda$0() {
            return new StickyBadgeInfoV2Component() { // from class: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.di.StickyBadgeInfoV2Component$Companion$create$1$1

                /* renamed from: totalVisibilityViewModelFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j totalVisibilityViewModelFactory = k.b(StickyBadgeInfoV2Component$Companion$create$1$1$totalVisibilityViewModelFactory$2.INSTANCE);

                @Override // ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.di.StickyBadgeInfoV2Component
                public TotalVisibilityViewModelFactory getTotalVisibilityViewModelFactory() {
                    return (TotalVisibilityViewModelFactory) this.totalVisibilityViewModelFactory.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<StickyBadgeInfoV2Component> create() {
            return new C7473e<>(N.b(StickyBadgeInfoV2Component.class), new a(1));
        }
    }

    @NotNull
    TotalVisibilityViewModelFactory getTotalVisibilityViewModelFactory();
}
