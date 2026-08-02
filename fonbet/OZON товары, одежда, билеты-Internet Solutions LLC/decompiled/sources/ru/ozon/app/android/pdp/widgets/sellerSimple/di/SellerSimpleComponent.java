package ru.ozon.app.android.pdp.widgets.sellerSimple.di;

import OE.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.widgets.sellerSimple.core.SellerSimpleMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerSimple/di/SellerSimpleComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/pdp/widgets/sellerSimple/core/SellerSimpleMapper;", "getSellerSimpleMapper", "()Lru/ozon/app/android/pdp/widgets/sellerSimple/core/SellerSimpleMapper;", "sellerSimpleMapper", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SellerSimpleComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerSimple/di/SellerSimpleComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/sellerSimple/di/SellerSimpleComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "createComponent", "()Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SellerSimpleComponent createComponent$lambda$0() {
            return new SellerSimpleComponent() { // from class: ru.ozon.app.android.pdp.widgets.sellerSimple.di.SellerSimpleComponent$Companion$createComponent$1$1

                /* renamed from: inhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j inhibitor = k.b(SellerSimpleComponent$Companion$createComponent$1$1$inhibitor$2.INSTANCE);

                /* renamed from: sellerSimpleMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j sellerSimpleMapper = k.b(SellerSimpleComponent$Companion$createComponent$1$1$sellerSimpleMapper$2.INSTANCE);

                @Override // ru.ozon.app.android.pdp.widgets.sellerSimple.di.SellerSimpleComponent
                public HandlersInhibitor getInhibitor() {
                    return (HandlersInhibitor) this.inhibitor.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.sellerSimple.di.SellerSimpleComponent
                public SellerSimpleMapper getSellerSimpleMapper() {
                    return (SellerSimpleMapper) this.sellerSimpleMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<SellerSimpleComponent> createComponent() {
            return new C7473e<>(N.b(SellerSimpleComponent.class), new a(0));
        }
    }

    @NotNull
    HandlersInhibitor getInhibitor();

    @NotNull
    SellerSimpleMapper getSellerSimpleMapper();
}
