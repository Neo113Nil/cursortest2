package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.di;

import Sc.InterfaceC4008j;
import Sc.k;
import bF.C5600a;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/di/WholeSaleModalComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/di/WholeSaleModalViewModelFactory;", "viewModelFactory$delegate", "LSc/j;", "getViewModelFactory", "()Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/di/WholeSaleModalViewModelFactory;", "viewModelFactory", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WholeSaleModalComponent implements InterfaceC6958a {

    /* renamed from: viewModelFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModelFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/di/WholeSaleModalComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/di/WholeSaleModalComponent;", "getInstance", "()Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WholeSaleModalComponent getInstance$lambda$0() {
            return new WholeSaleModalComponent(null);
        }

        @NotNull
        public final C7473e<WholeSaleModalComponent> getInstance() {
            return new C7473e<>(N.b(WholeSaleModalComponent.class), new C5600a(0));
        }

        private Companion() {
        }
    }

    public /* synthetic */ WholeSaleModalComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final WholeSaleModalViewModelFactory getViewModelFactory() {
        return (WholeSaleModalViewModelFactory) this.viewModelFactory.getValue();
    }

    private WholeSaleModalComponent() {
        this.viewModelFactory = k.b(WholeSaleModalComponent$viewModelFactory$2.INSTANCE);
    }
}
