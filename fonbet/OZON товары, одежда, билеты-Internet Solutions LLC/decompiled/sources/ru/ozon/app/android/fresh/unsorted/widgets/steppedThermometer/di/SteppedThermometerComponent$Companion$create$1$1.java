package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/di/SteppedThermometerComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/di/SteppedThermometerComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SteppedThermometerComponent$Companion$create$1$1 implements SteppedThermometerComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(SteppedThermometerComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<SteppedThermometerViewModel> viewModelProvider;

    SteppedThermometerComponent$Companion$create$1$1(final C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new a() { // from class: Ux.a
            @Override // Pc.a
            public final Object get() {
                SteppedThermometerViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = SteppedThermometerComponent$Companion$create$1$1.viewModelProvider$lambda$0(C7475g.this, this);
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SteppedThermometerViewModel viewModelProvider$lambda$0(C7475g c7475g, SteppedThermometerComponent$Companion$create$1$1 steppedThermometerComponent$Companion$create$1$1) {
        return new SteppedThermometerViewModel(((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService(), ((ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository(), steppedThermometerComponent$Companion$create$1$1.getMapper());
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerComponent
    public SteppedThermometerMapper getMapper() {
        return (SteppedThermometerMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerComponent
    public a<SteppedThermometerViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
