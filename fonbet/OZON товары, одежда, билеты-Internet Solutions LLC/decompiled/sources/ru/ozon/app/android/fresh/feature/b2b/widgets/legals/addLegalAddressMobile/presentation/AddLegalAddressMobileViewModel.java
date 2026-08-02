package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import Bt.C2673b;
import Dp.C2877a;
import Lm0.a;
import Nc.C3667a;
import androidx.lifecycle.w0;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewModel;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.PointModel;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import uc.i;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00190\u00190+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\"0\"0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/CheckLegalAddressRepository;", "checkLegalAddressRepository", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;", "suggestionsProvider", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/CheckLegalAddressRepository;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;)V", "", "LHe0/a;", "addresses", "", "mapAddresses", "(Ljava/util/List;)Ljava/util/List;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "mapItem", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "onCleared", "()V", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "postData", "Lio/reactivex/y;", "checkLegalAddress", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "searchAddress", "(Ljava/lang/String;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddressSearchResult;", "observeAddresses", "()Lio/reactivex/p;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/CheckLegalAddressRepository;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lnc/a;", "disposables", "Lnc/a;", "LNc/a;", "kotlin.jvm.PlatformType", "searchListener", "LNc/a;", "searchCompleteListener", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "suggestionsController", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalAddressMobileViewModel extends w0 {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final BoundingBoxModel boundingBox;

    @NotNull
    private final CheckLegalAddressRepository checkLegalAddressRepository;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final C3667a<AddressSearchResult> searchCompleteListener;

    @NotNull
    private final C3667a<String> searchListener;

    @NotNull
    private final SdkSuggestionsControllerWrapper suggestionsController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewModel$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    public AddLegalAddressMobileViewModel(@NotNull CheckLegalAddressRepository checkLegalAddressRepository, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore, @NotNull SdkSuggestionsControllerWrapperProvider suggestionsProvider) {
        Intrinsics.checkNotNullParameter(checkLegalAddressRepository, "checkLegalAddressRepository");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(suggestionsProvider, "suggestionsProvider");
        this.checkLegalAddressRepository = checkLegalAddressRepository;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        C3667a<String> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.searchListener = d11;
        C3667a<AddressSearchResult> d12 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d12, "create(...)");
        this.searchCompleteListener = d12;
        SdkSuggestionsControllerWrapper provideSuggestionsController = suggestionsProvider.provideSuggestionsController();
        this.suggestionsController = provideSuggestionsController;
        this.boundingBox = new BoundingBoxModel(new PointModel(0.0d, 0.0d), new PointModel(0.0d, 0.0d));
        ozonGeoProxyClient.setAppName("b2b-bx-android", areaLocalStore.getLocationUid());
        AbstractC7094b createService$default = SdkSuggestionsControllerWrapper.DefaultImpls.createService$default(provideSuggestionsController, null, null, null, true, 7, null);
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: Yu.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                AddLegalAddressMobileViewModel._init_$lambda$1(AddLegalAddressMobileViewModel.this);
            }
        };
        C2877a c2877a = new C2877a(new AnonymousClass2(a.f17149a), 5);
        createService$default.getClass();
        i iVar = new i(c2877a, interfaceC9019a);
        createService$default.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AddLegalAddressMobileViewModel addLegalAddressMobileViewModel) {
        addLegalAddressMobileViewModel.suggestionsController.onStart();
        addLegalAddressMobileViewModel.suggestionsController.setSearchListener(new AddLegalAddressMobileViewModel$1$1(addLegalAddressMobileViewModel));
        C8486a c8486a = addLegalAddressMobileViewModel.disposables;
        InterfaceC8487b subscribe = addLegalAddressMobileViewModel.searchListener.distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS).observeOn(Mc.a.a()).subscribe(new C2673b(new AddLegalAddressMobileViewModel$1$2(addLegalAddressMobileViewModel), 3));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CharSequence> mapAddresses(List<He0.a> addresses) {
        List<He0.a> list = addresses;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OzonSpannableStringKt.toOzonSpannableString(mapItem(((He0.a) it.next()).e().toString(), null)));
        }
        return arrayList;
    }

    private final CharSequence mapItem(CharSequence title, CharSequence subtitle) {
        if (subtitle != null) {
            String str = ((Object) title) + ", " + ((Object) subtitle);
            if (str != null) {
                return str;
            }
        }
        return title;
    }

    @NotNull
    public final y<String> checkLegalAddress(@NotNull String address, @NotNull String postData) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(postData, "postData");
        return this.checkLegalAddressRepository.checkLegalAddress(address, postData);
    }

    @NotNull
    public final p<AddressSearchResult> observeAddresses() {
        return this.searchCompleteListener;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.ozonGeoProxyClient.setAppName("ozonapp_android", this.areaLocalStore.getLocationUid());
        this.disposables.d();
    }

    public final void searchAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.searchListener.onNext(address);
    }
}
