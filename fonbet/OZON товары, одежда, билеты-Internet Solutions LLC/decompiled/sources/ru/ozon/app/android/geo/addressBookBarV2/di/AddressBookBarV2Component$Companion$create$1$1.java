package ru.ozon.app.android.geo.addressBookBarV2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.geo.addressBookBarV2.core.AddressBookBarV2Mapper;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"ru/ozon/app/android/geo/addressBookBarV2/di/AddressBookBarV2Component$Companion$create$1$1", "Lru/ozon/app/android/geo/addressBookBarV2/di/AddressBookBarV2Component;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "addressComponentApi", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressInfoViewModel", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "getAddressInfoViewModel", "()Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/app/android/geo/addressBookBarV2/core/AddressBookBarV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/geo/addressBookBarV2/core/AddressBookBarV2Mapper;", "mapper", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressBookBarV2Component$Companion$create$1$1 implements AddressBookBarV2Component {
    private final AddressComponentApi addressComponentApi;
    private final AddressUiInfoViewModel addressInfoViewModel;
    private final FeatureService featureService;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final f viewedPond;

    AddressBookBarV2Component$Companion$create$1$1(C7475g c7475g) {
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.networkComponentApi = networkComponentApi;
        AddressComponentApi addressComponentApi = (AddressComponentApi) c7475g.getComponent(AddressComponentApi.class);
        this.addressComponentApi = addressComponentApi;
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComposerComponentApi = retainComposerComponentApi;
        this.featureService = networkComponentApi.getFeatureService();
        this.addressInfoViewModel = addressComponentApi.getAddressUiInfoViewModel();
        this.mapper = k.b(new AddressBookBarV2Component$Companion$create$1$1$mapper$2(this));
        this.viewedPond = retainComposerComponentApi.getViewedPond();
    }

    @Override // ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component
    public AddressUiInfoViewModel getAddressInfoViewModel() {
        return this.addressInfoViewModel;
    }

    @Override // ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component
    public AddressBookBarV2Mapper getMapper() {
        return (AddressBookBarV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component
    public f getViewedPond() {
        return this.viewedPond;
    }
}
