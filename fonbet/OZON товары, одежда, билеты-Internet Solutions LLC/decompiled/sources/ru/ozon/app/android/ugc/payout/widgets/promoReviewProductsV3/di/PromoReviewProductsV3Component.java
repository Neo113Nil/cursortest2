package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.di;

import EL.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewItemMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewSectionHeaderMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModelImpl;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \u00162\u00060\u0001j\u0002`\u0002:\u0002\u0016\u0017J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/di/PromoReviewProductsV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModelImpl;", "getItemViewModel", "()LPc/a;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewSectionHeaderMapper;", "getHeaderMapper", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewSectionHeaderMapper;", "headerMapper", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemMapper;", "getItemMapper", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemMapper;", "itemMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "Factory", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PromoReviewProductsV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/di/PromoReviewProductsV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/di/PromoReviewProductsV3Component;", "getInstance", "(Lk20/g;)Lk20/e;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromoReviewProductsV3Component getInstance$lambda$0(C7475g c7475g) {
            return DaggerPromoReviewProductsV3Component.factory().create((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class));
        }

        @NotNull
        public final C7473e<PromoReviewProductsV3Component> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PromoReviewProductsV3Component.class), new a(storage, 2));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/di/PromoReviewProductsV3Component$Factory;", "", "create", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/di/PromoReviewProductsV3Component;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        PromoReviewProductsV3Component create(@NotNull RetainComposerComponentApi retainComposerComponentApi);
    }

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    PromoReviewSectionHeaderMapper getHeaderMapper();

    @NotNull
    PromoReviewItemMapper getItemMapper();

    @NotNull
    Pc.a<PromoReviewItemViewModelImpl> getItemViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
