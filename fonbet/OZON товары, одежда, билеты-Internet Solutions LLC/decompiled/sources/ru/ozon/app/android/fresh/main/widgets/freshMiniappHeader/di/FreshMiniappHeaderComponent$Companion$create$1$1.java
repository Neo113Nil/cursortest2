package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import jw.C7442a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderMapper;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderViewModel;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/di/FreshMiniappHeaderComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/di/FreshMiniappHeaderComponent;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "getAddressUiInfoViewModel", "()Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshMiniappHeaderComponent$Companion$create$1$1 implements FreshMiniappHeaderComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(FreshMiniappHeaderComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<FreshMiniappHeaderViewModel> viewModelProvider;

    FreshMiniappHeaderComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new C7442a(c7475g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreshMiniappHeaderViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        return new FreshMiniappHeaderViewModel(((ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository());
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent
    public AddressUiInfoViewModel getAddressUiInfoViewModel() {
        return ((AddressComponentApi) this.$storage.getComponent(AddressComponentApi.class)).getAddressUiInfoViewModel();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent
    public FreshMiniappHeaderMapper getMapper() {
        return (FreshMiniappHeaderMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent
    public a<FreshMiniappHeaderViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
