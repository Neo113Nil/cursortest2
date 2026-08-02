package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation;

import A00.a;
import Bc.f;
import Bc.i;
import Bc.r;
import DM.h;
import Fy.C3065c;
import GH.b;
import W10.c;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.api.TravelRailwaySeatSelectChangeSchemeV2SeatsResponse;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.TravelRailwaySeatSelectFooterMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.TravelRailwaySeatSelectWithSchemeV2Mapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 <2\u00060\u0001j\u0002`\u0002:\u0003<=>B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0013\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010$\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u0002090\u001f038\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectFooterMapper;", "footerMapper", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectWithSchemeV2Mapper;", "schemeSeatsMapperV2", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectFooterMapper;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectWithSchemeV2Mapper;)V", "T", "R", "Lio/reactivex/y;", "source", "Lkotlin/Function1;", "mapper", "", "onSuccess", "commonActionPerformer", "(Lio/reactivex/y;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/api/TravelRailwaySeatSelectChangeSchemeV2SeatsResponse;", "response", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$UpdateWrapper;", "prepareSchemeSeatsUpdatesV2", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$UpdateWrapper;", "onCleared", "()V", "", "actionName", "", "params", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "changeSchemeSeatsV2", "(Ljava/lang/String;Ljava/util/Map;LW10/c;)V", "showSeatsLeft", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectFooterMapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectWithSchemeV2Mapper;", "Lnc/a;", "disposables", "Lnc/a;", "Landroidx/lifecycle/V;", "", "progressLiveData", "Landroidx/lifecycle/V;", "getProgressLiveData", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingLiveData", "getTrackingLiveData", "Companion", "Action", "UpdateWrapper", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWidgetViewModel implements InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final TravelRailwaySeatSelectFooterMapper footerMapper;

    @NotNull
    private final V<Boolean> progressLiveData;

    @NotNull
    private final TravelRailwaySeatSelectWithSchemeV2Mapper schemeSeatsMapperV2;

    @NotNull
    private final SingleLiveEvent<Map<String, TokenizedTrackingInfo>> trackingLiveData;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action;", "", "Error", "Update", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action$Update;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1280186538;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action$Update;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action;", "LA00/a$J$a;", "update", "<init>", "(LA00/a$J$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "getUpdate", "()LA00/a$J$a;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Update implements Action {

            @NotNull
            private final a.J.InterfaceC0007a update;

            public Update(@NotNull a.J.InterfaceC0007a update) {
                Intrinsics.checkNotNullParameter(update, "update");
                this.update = update;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Update) && Intrinsics.d(this.update, ((Update) other).update);
            }

            @NotNull
            public final a.J.InterfaceC0007a getUpdate() {
                return this.update;
            }

            public int hashCode() {
                return this.update.hashCode();
            }

            @NotNull
            public String toString() {
                return "Update(update=" + this.update + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$UpdateWrapper;", "", "LA00/a$J$a;", "update", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(LA00/a$J$a;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "getUpdate", "()LA00/a$J$a;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateWrapper {
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final a.J.InterfaceC0007a update;

        public UpdateWrapper(@NotNull a.J.InterfaceC0007a update, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(update, "update");
            this.update = update;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateWrapper)) {
                return false;
            }
            UpdateWrapper updateWrapper = (UpdateWrapper) other;
            return Intrinsics.d(this.update, updateWrapper.update) && Intrinsics.d(this.trackingInfo, updateWrapper.trackingInfo);
        }

        @NotNull
        public final a.J.InterfaceC0007a getUpdate() {
            return this.update;
        }

        public int hashCode() {
            int hashCode = this.update.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "UpdateWrapper(update=" + this.update + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public TravelRailwaySeatSelectWidgetViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull TravelRailwaySeatSelectFooterMapper footerMapper, @NotNull TravelRailwaySeatSelectWithSchemeV2Mapper schemeSeatsMapperV2) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(schemeSeatsMapperV2, "schemeSeatsMapperV2");
        this.actionV2Repository = actionV2Repository;
        this.footerMapper = footerMapper;
        this.schemeSeatsMapperV2 = schemeSeatsMapperV2;
        this.disposables = new C8486a();
        this.progressLiveData = new V<>();
        this.actionLiveData = new SingleLiveEvent<>();
        this.trackingLiveData = new SingleLiveEvent<>();
    }

    private final <T, R> void commonActionPerformer(y<T> source, Function1<? super T, ? extends R> mapper, Function1<? super R, Unit> onSuccess) {
        this.disposables.d();
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new f(new i(new r(source.j(Mc.a.b()), new h(mapper, 6)).g(C8125a.a()), new GH.a(new TravelRailwaySeatSelectWidgetViewModel$commonActionPerformer$1(this), 12)), new InterfaceC9019a() { // from class: lT.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                TravelRailwaySeatSelectWidgetViewModel.commonActionPerformer$lambda$2(TravelRailwaySeatSelectWidgetViewModel.this);
            }
        }).h(new b(new TravelRailwaySeatSelectWidgetViewModel$commonActionPerformer$3(onSuccess), 9), new C3065c(new TravelRailwaySeatSelectWidgetViewModel$commonActionPerformer$4(this), 13));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object commonActionPerformer$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commonActionPerformer$lambda$2(TravelRailwaySeatSelectWidgetViewModel travelRailwaySeatSelectWidgetViewModel) {
        travelRailwaySeatSelectWidgetViewModel.progressLiveData.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateWrapper prepareSchemeSeatsUpdatesV2(ActionV2Response<TravelRailwaySeatSelectChangeSchemeV2SeatsResponse> response) {
        List list;
        ActionV2ExtensionsKt.ensureSuccessful(response);
        TravelRailwaySeatSelectChangeSchemeV2SeatsResponse data = response.getData();
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TravelRailwaySeatSelectChangeSchemeV2SeatsResponse travelRailwaySeatSelectChangeSchemeV2SeatsResponse = data;
        TravelRailwaySeatSelectFooterVO map$default = TravelRailwaySeatSelectFooterMapper.map$default(this.footerMapper, travelRailwaySeatSelectChangeSchemeV2SeatsResponse.getFooter(), 0L, null, 6, null);
        ButtonV3Atom.LargeButton continueButton = travelRailwaySeatSelectChangeSchemeV2SeatsResponse.getFooter().getContinueButton();
        Boolean bool = Boolean.FALSE;
        List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> seats = travelRailwaySeatSelectChangeSchemeV2SeatsResponse.getSeats();
        if (seats != null) {
            List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> list2 = seats;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(this.schemeSeatsMapperV2.mapToVO((TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO) it.next()));
            }
            list = C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel$prepareSchemeSeatsUpdatesV2$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t11) {
                    return Vc.a.b(Integer.valueOf(((TravelRailwaySeatSelectWithSchemeVO.SeatVO) t2).getId()), Integer.valueOf(((TravelRailwaySeatSelectWithSchemeVO.SeatVO) t11).getId()));
                }
            }, arrayList);
        } else {
            list = null;
        }
        return new UpdateWrapper(new UpdateSeatSelect(map$default, continueButton, bool, list), null);
    }

    public final void changeSchemeSeatsV2(@NotNull String actionName, Map<String, String> params, c trackingData) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        ActionV2Request actionV2Request = new ActionV2Request(params, actionName, false, 4, null);
        commonActionPerformer(trackingData != null ? this.actionV2Repository.callActionWithTracking(actionV2Request, trackingData, TravelRailwaySeatSelectChangeSchemeV2SeatsResponse.class) : this.actionV2Repository.callAction(actionV2Request, TravelRailwaySeatSelectChangeSchemeV2SeatsResponse.class), new TravelRailwaySeatSelectWidgetViewModel$changeSchemeSeatsV2$1(this), new TravelRailwaySeatSelectWidgetViewModel$changeSchemeSeatsV2$2(this));
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final V<Boolean> getProgressLiveData() {
        return this.progressLiveData;
    }

    @NotNull
    public final SingleLiveEvent<Map<String, TokenizedTrackingInfo>> getTrackingLiveData() {
        return this.trackingLiveData;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        this.disposables.d();
    }

    public final void showSeatsLeft() {
        this.actionLiveData.setValue(new Action.Update(new UpdateSeatSelect(null, null, Boolean.TRUE, null, 11, null)));
    }
}
