package ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.data.CharityAddressSelectorApi;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation.CharityAddressSelectorMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation.CharityAddressSelectorViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/di/CharityAddressSelectorComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/di/CharityAddressSelectorComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "getAddressUpdateManager", "()Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManager", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/data/CharityAddressSelectorApi;", "getCharityAddressSelectorApi", "()Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/data/CharityAddressSelectorApi;", "charityAddressSelectorApi", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CharityAddressSelectorComponent$Companion$create$1$1 implements CharityAddressSelectorComponent {
    final /* synthetic */ C7475g $storage;
    private final a<CharityAddressSelectorViewModel> viewModelProvider = new a() { // from class: bx.a
        @Override // Pc.a
        public final Object get() {
            CharityAddressSelectorViewModel viewModelProvider$lambda$0;
            viewModelProvider$lambda$0 = CharityAddressSelectorComponent$Companion$create$1$1.viewModelProvider$lambda$0(CharityAddressSelectorComponent$Companion$create$1$1.this);
            return viewModelProvider$lambda$0;
        }
    };

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CharityAddressSelectorComponent$Companion$create$1$1$mapper$2.INSTANCE);

    CharityAddressSelectorComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharityAddressSelectorViewModel viewModelProvider$lambda$0(CharityAddressSelectorComponent$Companion$create$1$1 charityAddressSelectorComponent$Companion$create$1$1) {
        return new CharityAddressSelectorViewModel(charityAddressSelectorComponent$Companion$create$1$1.getCharityAddressSelectorApi(), charityAddressSelectorComponent$Companion$create$1$1.getAddressUpdateManager());
    }

    public AddressUpdateManager getAddressUpdateManager() {
        return ((AddressComponentApi) this.$storage.getComponent(AddressComponentApi.class)).getAddressManager();
    }

    public CharityAddressSelectorApi getCharityAddressSelectorApi() {
        Object create = ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getRetrofit().create(CharityAddressSelectorApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (CharityAddressSelectorApi) create;
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorComponent
    public CharityAddressSelectorMapper getMapper() {
        return (CharityAddressSelectorMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorComponent
    public a<CharityAddressSelectorViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
