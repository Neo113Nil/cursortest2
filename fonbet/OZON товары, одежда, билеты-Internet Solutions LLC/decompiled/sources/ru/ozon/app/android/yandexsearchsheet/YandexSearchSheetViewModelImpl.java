package ru.ozon.app.android.yandexsearchsheet;

import He0.a;
import Hs.b;
import Hs.d;
import Hs.e;
import Nc.C3669c;
import P4.f;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import W10.c;
import android.net.Uri;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVOKt;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.flags.InexactSuggestClickFlag;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.PointModel;
import ru.ozon.app.android.mapcommon.map.model.SuggestionType;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.data.YandexSearchSheetRepository;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import uc.i;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001cB?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0014H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010%J\u0019\u00100\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J7\u00105\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001bH\u0002¢\u0006\u0004\b5\u00106J%\u0010:\u001a\u00020\u00142\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020908\u0018\u000107H\u0002¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010<R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010=R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR \u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010H\u001a\b\u0012\u0004\u0012\u00020(0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR \u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;", "Lru/ozon/app/android/yandexsearchsheet/data/YandexSearchSheetRepository;", "repository", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;", "suggestionsProvider", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/yandexsearchsheet/data/YandexSearchSheetRepository;Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;LW10/c;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "data", "", "bindInitial", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;)V", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "suggest", "", "position", "", "inputQuery", "suggestClicked", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;ILjava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "suggestWarningClicked", "(Lru/ozon/uni/atoms/af/AtomAction;)V", SearchIntents.EXTRA_QUERY, "onTypedQuery", "(Ljava/lang/String;)V", "onCleared", "()V", "", "dismissOnSecondClick", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;)Z", "dismiss", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;)V", "formSuggestsWithCommunication", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", SuggestionDTO.TYPE_SUGGEST, "updateList", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO;)V", "searchString", "suggestValue", "link", "makeLink", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LSc/r;", "", "LHe0/a;", "updateSuggestions", "(LSc/r;)V", "Lru/ozon/app/android/yandexsearchsheet/data/YandexSearchSheetRepository;", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;", "LW10/c;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;", "screenUI", "Landroidx/lifecycle/V;", "getScreenUI", "()Landroidx/lifecycle/V;", "loader", "getLoader", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "sessionId", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "LNc/c;", "querySubject", "LNc/c;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "suggestionsController$delegate", "LSc/j;", "getSuggestionsController", "()Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "suggestionsController", "previousSuggest", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSearchSheetViewModelImpl extends w0 implements YandexSearchSheetViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final BoundingBoxModel DEFAULT_BOUNDING_BOX = new BoundingBoxModel(new PointModel(0.0d, 0.0d), new PointModel(0.0d, 0.0d));

    @NotNull
    private final SingleLiveEvent<YandexSearchSheetViewModel.Action> action;

    @NotNull
    private final AreaLocalStore areaLocalStore;
    private YandexSearchSheetFragment.Data data;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final V<Boolean> loader;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;
    private SuggestVO.Suggest.SuggestInfo previousSuggest;

    @NotNull
    private final C3669c<String> querySubject;

    @NotNull
    private final YandexSearchSheetRepository repository;

    @NotNull
    private final V<YandexSearchSheetViewModel.ScreenUI> screenUI;

    @NotNull
    private final String sessionId;

    /* renamed from: suggestionsController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j suggestionsController;

    @NotNull
    private SdkSuggestionsControllerWrapperProvider suggestionsProvider;

    @NotNull
    private final c trackingData;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModelImpl$Companion;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT", "J", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public YandexSearchSheetViewModelImpl(@NotNull YandexSearchSheetRepository repository, @NotNull SdkSuggestionsControllerWrapperProvider suggestionsProvider, @NotNull c trackingData, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(suggestionsProvider, "suggestionsProvider");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.repository = repository;
        this.suggestionsProvider = suggestionsProvider;
        this.trackingData = trackingData;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
        this.featureChecker = featureChecker;
        this.screenUI = new V<>();
        this.loader = new V<>();
        this.action = new SingleLiveEvent<>();
        this.sessionId = f.b("toString(...)");
        C3669c<String> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.querySubject = d11;
        this.disposables = new C8486a();
        this.suggestionsController = k.b(new YandexSearchSheetViewModelImpl$suggestionsController$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInitial$lambda$4(YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl, YandexSearchSheetFragment.Data data) {
        yandexSearchSheetViewModelImpl.getSuggestionsController().onStart();
        yandexSearchSheetViewModelImpl.getSuggestionsController().setSearchListener(new YandexSearchSheetViewModelImpl$bindInitial$1$1(yandexSearchSheetViewModelImpl));
        yandexSearchSheetViewModelImpl.disposables.d();
        C8486a c8486a = yandexSearchSheetViewModelImpl.disposables;
        AbstractC7094b switchMapCompletable = yandexSearchSheetViewModelImpl.querySubject.debounce(700L, TimeUnit.MILLISECONDS).observeOn(C8125a.a()).switchMapCompletable(new b(new YandexSearchSheetViewModelImpl$bindInitial$1$2(yandexSearchSheetViewModelImpl), 4));
        TY.c cVar = new TY.c();
        d dVar = new d(YandexSearchSheetViewModelImpl$bindInitial$1$4.INSTANCE, 2);
        switchMapCompletable.getClass();
        i iVar = new i(dVar, cVar);
        switchMapCompletable.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
        V<YandexSearchSheetViewModel.ScreenUI> screenUI = yandexSearchSheetViewModelImpl.getScreenUI();
        String title = data.getSearchOptions().getTitle();
        if (title == null) {
            title = data.getSheetTitle();
        }
        screenUI.postValue(new YandexSearchSheetViewModel.ScreenUI(title, data.getSearchOptions().getInitialElements(), data.getHint(), new SuggestVO(null, 1, null)));
        SingleLiveEvent<YandexSearchSheetViewModel.Action> action = yandexSearchSheetViewModelImpl.getAction();
        String startQuery = data.getStartQuery();
        if (startQuery == null) {
            startQuery = "";
        }
        action.setValue(new YandexSearchSheetViewModel.Action.ChangeQuery(startQuery));
        String startQuery2 = data.getStartQuery();
        if (startQuery2 != null) {
            yandexSearchSheetViewModelImpl.querySubject.onNext(startQuery2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.f bindInitial$lambda$4$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (io.reactivex.f) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInitial$lambda$4$lambda$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss(SuggestVO.Suggest.SuggestInfo suggest) {
        SingleLiveEvent<YandexSearchSheetViewModel.Action> action = getAction();
        YandexSearchSheetFragment.Data data = this.data;
        if (data == null) {
            Intrinsics.n("data");
            throw null;
        }
        action.setValue(new YandexSearchSheetViewModel.Action.SuggestSelected(YandexSearchSheetFragment.Data.copy$default(data, null, null, null, null, null, suggest, null, null, null, null, 991, null)));
        getAction().postValue(YandexSearchSheetViewModel.Action.Dismiss.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean dismissOnSecondClick(SuggestVO.Suggest.SuggestInfo suggest) {
        if (!this.featureChecker.isEnabled(InexactSuggestClickFlag.INSTANCE)) {
            return false;
        }
        SuggestVO.Suggest.SuggestInfo suggestInfo = this.previousSuggest;
        if (!Intrinsics.d(suggestInfo != null ? suggestInfo.getSearchText() : null, suggest.getSearchText())) {
            return false;
        }
        SuggestVO.Suggest.SuggestInfo suggestInfo2 = this.previousSuggest;
        if ((suggestInfo2 != null ? suggestInfo2.getUpdateLink() : null) == null) {
            return false;
        }
        dismiss(this.previousSuggest);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void formSuggestsWithCommunication(String query) {
        BoundingBoxModel boundingBoxModel;
        int length = query.length();
        YandexSearchSheetFragment.Data data = this.data;
        if (data == null) {
            Intrinsics.n("data");
            throw null;
        }
        if (length < data.getSearchOptions().getThreshold()) {
            updateSuggestions(null);
            return;
        }
        getLoader().postValue(Boolean.TRUE);
        YandexSearchSheetFragment.Data data2 = this.data;
        if (data2 == null) {
            Intrinsics.n("data");
            throw null;
        }
        FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox boundingBox = data2.getSearchOptions().getBoundingBox();
        if (boundingBox == null || (boundingBoxModel = FormBuilderBlockVOKt.toBoundingBoxModel(boundingBox)) == null) {
            boundingBoxModel = DEFAULT_BOUNDING_BOX;
        }
        SdkSuggestionsControllerWrapper suggestionsController = getSuggestionsController();
        SuggestionType suggestionType = SuggestionType.GEOGRAPHICAL_OBJECTS;
        YandexSearchSheetFragment.Data data3 = this.data;
        if (data3 == null) {
            Intrinsics.n("data");
            throw null;
        }
        String contextLocationUid = data3.getContextLocationUid();
        if (contextLocationUid == null) {
            contextLocationUid = this.areaLocalStore.getLocationUid();
        }
        suggestionsController.search(query, suggestionType, boundingBoxModel, contextLocationUid);
    }

    private final SdkSuggestionsControllerWrapper getSuggestionsController() {
        return (SdkSuggestionsControllerWrapper) this.suggestionsController.getValue();
    }

    private final String makeLink(String searchString, String suggestValue, int position, String inputQuery, String link) {
        String uri = Uri.parse(h.X(link, "{q}", searchString, true)).buildUpon().appendQueryParameter("searchString", inputQuery).appendQueryParameter("index", String.valueOf(position)).appendQueryParameter("suggestValue", suggestValue).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void suggestClicked$lambda$7(YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl) {
        yandexSearchSheetViewModelImpl.getLoader().postValue(Boolean.FALSE);
    }

    private final void updateList(SuggestVO suggests) {
        YandexSearchSheetViewModel.ScreenUI value = getScreenUI().getValue();
        if (value != null) {
            getScreenUI().postValue(YandexSearchSheetViewModel.ScreenUI.copy$default(value, null, null, null, suggests, 7, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateSuggestions(r<? extends List<a>> data) {
        List list;
        getLoader().postValue(Boolean.FALSE);
        YandexSearchSheetFragment.Data data2 = this.data;
        if (data2 == null) {
            Intrinsics.n("data");
            throw null;
        }
        List<AtomDTO> emptyState = data2.getSearchOptions().getEmptyState();
        if (data != null) {
            Object f26106a = data.getF26106a();
            list = (List) (f26106a instanceof r.b ? null : f26106a);
        }
        list = K.f71697a;
        updateList(ModelsKt.toVO(list, (!list.isEmpty() || emptyState.isEmpty() || data == null) ? K.f71697a : C7714v.a0(new SuggestVO.Suggest.Warning(emptyState))));
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    public void bindInitial(@NotNull final YandexSearchSheetFragment.Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        C8486a c8486a = this.disposables;
        AbstractC7094b createService$default = SdkSuggestionsControllerWrapper.DefaultImpls.createService$default(getSuggestionsController(), null, data.getGeoProviderConfig(), data.getAnalyticsModuleState(), false, 9, null);
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: TY.e
            @Override // qc.InterfaceC9019a
            public final void run() {
                YandexSearchSheetViewModelImpl.bindInitial$lambda$4(YandexSearchSheetViewModelImpl.this, data);
            }
        };
        BF.b bVar = new BF.b(new YandexSearchSheetViewModelImpl$bindInitial$2(Lm0.a.f17149a), 6);
        createService$default.getClass();
        i iVar = new i(bVar, interfaceC9019a);
        createService$default.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    public void onTypedQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.querySubject.onNext(query);
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    public void suggestClicked(@NotNull SuggestVO.Suggest.SuggestInfo suggest, int position, @NotNull String inputQuery) {
        List<String> list;
        List<String> list2;
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        Intrinsics.checkNotNullParameter(inputQuery, "inputQuery");
        String obj = h.z0(suggest.getSearchText()).toString();
        String valueOf = suggest.getIsTrustCoordinates() ? String.valueOf(suggest.getCoordinates()) : obj;
        C8486a c8486a = this.disposables;
        YandexSearchSheetRepository yandexSearchSheetRepository = this.repository;
        YandexSearchSheetFragment.Data data = this.data;
        if (data == null) {
            Intrinsics.n("data");
            throw null;
        }
        String makeLink = makeLink(valueOf, obj, position, inputQuery, data.getSearchOptions().getLink());
        c cVar = this.trackingData;
        YandexSearchSheetFragment.Data data2 = this.data;
        if (data2 == null) {
            Intrinsics.n("data");
            throw null;
        }
        YandexSearchSheetFragment.Data.MapInfoRequest mapInfoRequest = data2.getMapInfoRequest();
        if (mapInfoRequest == null) {
            String sessionId = getSessionId();
            GeoProviderConfig geoProviderConfig = this.ozonGeoProxyClient.getGeoProviderConfig();
            if (geoProviderConfig == null || (list = geoProviderConfig.parseGeocodePreferredProvider()) == null) {
                list = K.f71697a;
            }
            GeoProviderConfig geoProviderConfig2 = this.ozonGeoProxyClient.getGeoProviderConfig();
            if (geoProviderConfig2 == null || (list2 = geoProviderConfig2.parseRevGeocodePreferredProvider()) == null) {
                list2 = K.f71697a;
            }
            mapInfoRequest = new YandexSearchSheetFragment.Data.MapInfoRequest(new YandexSearchSheetFragment.Data.MapInfoRequest.MapInfo(sessionId, new YandexSearchSheetFragment.Data.MapInfoRequest.PreferredGeoProviders(list, list2, null, 4, null)));
        }
        y<DetailsSuggest> details = yandexSearchSheetRepository.getDetails(makeLink, cVar, mapInfoRequest);
        e eVar = new e(new YandexSearchSheetViewModelImpl$suggestClicked$1(this), 2);
        details.getClass();
        InterfaceC8487b h11 = new Bc.f(new Bc.i(details, eVar), new InterfaceC9019a() { // from class: TY.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                YandexSearchSheetViewModelImpl.suggestClicked$lambda$7(YandexSearchSheetViewModelImpl.this);
            }
        }).g(C8125a.a()).h(new CJ.a(new YandexSearchSheetViewModelImpl$suggestClicked$3(this, suggest), 4), new CJ.b(new YandexSearchSheetViewModelImpl$suggestClicked$4(Lm0.a.f17149a), 5));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    public void suggestWarningClicked(@NotNull AtomAction atomAction) {
        String link;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if (atomAction instanceof AtomAction.Move) {
            String link2 = ((AtomAction.Move) atomAction).getLink();
            if (link2 != null) {
                getAction().postValue(new YandexSearchSheetViewModel.Action.DismissAndRedirect(link2));
                return;
            }
            return;
        }
        if (!(atomAction instanceof AtomAction.Click) || (link = ((AtomAction.Click) atomAction).getLink()) == null) {
            return;
        }
        getAction().postValue(new YandexSearchSheetViewModel.Action.DismissAndRedirect(link));
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    @NotNull
    public SingleLiveEvent<YandexSearchSheetViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    @NotNull
    public V<Boolean> getLoader() {
        return this.loader;
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel
    @NotNull
    public V<YandexSearchSheetViewModel.ScreenUI> getScreenUI() {
        return this.screenUI;
    }
}
