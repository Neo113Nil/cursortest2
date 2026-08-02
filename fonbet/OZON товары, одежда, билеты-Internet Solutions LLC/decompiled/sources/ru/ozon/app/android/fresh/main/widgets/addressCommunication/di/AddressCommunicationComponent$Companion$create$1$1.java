package ru.ozon.app.android.fresh.main.widgets.addressCommunication.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationApi;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationMapper;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewModel;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/addressCommunication/di/AddressCommunicationComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/di/AddressCommunicationComponent;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressCommunicationComponent$Companion$create$1$1 implements AddressCommunicationComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(AddressCommunicationComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<AddressCommunicationViewModel> viewModelProvider;

    AddressCommunicationComponent$Companion$create$1$1(final C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new a() { // from class: Nv.a
            @Override // Pc.a
            public final Object get() {
                AddressCommunicationViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = AddressCommunicationComponent$Companion$create$1$1.viewModelProvider$lambda$0(AddressCommunicationComponent$Companion$create$1$1.this, c7475g);
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressCommunicationViewModel viewModelProvider$lambda$0(AddressCommunicationComponent$Companion$create$1$1 addressCommunicationComponent$Companion$create$1$1, C7475g c7475g) {
        Object create = addressCommunicationComponent$Companion$create$1$1.getNetworkComponentApi().getRetrofit().create(AddressCommunicationApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new AddressCommunicationViewModel((AddressCommunicationApi) create, ((LocationComponentApi) c7475g.getComponent(LocationComponentApi.class)).getLocationRepository(), addressCommunicationComponent$Companion$create$1$1.getNetworkComponentApi().getFeatureChecker());
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationComponent
    public FeatureChecker getFeatureChecker() {
        return getNetworkComponentApi().getFeatureChecker();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationComponent
    public AddressCommunicationMapper getMapper() {
        return (AddressCommunicationMapper) this.mapper.getValue();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationComponent
    public a<AddressCommunicationViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
