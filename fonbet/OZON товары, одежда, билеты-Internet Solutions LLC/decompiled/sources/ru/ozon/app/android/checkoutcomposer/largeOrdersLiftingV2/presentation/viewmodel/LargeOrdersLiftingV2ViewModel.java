package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel;

import B90.C2621x;
import Hs.b;
import Hs.c;
import Mc.a;
import Nc.C3669c;
import android.net.Uri;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.g;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.api.LargeOrdersLiftingApi;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.FloorChangeResultModel;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.InputVO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.LargeOrdersLiftingV2VO;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00060\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0#8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0#8\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/api/LargeOrdersLiftingApi;", "api", "<init>", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/api/LargeOrdersLiftingApi;)V", "", "buildUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "debounce", "", "observeTextChange", "(Ljava/lang/Long;)V", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;", "vo", "setData", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;)V", "floor", "onFloorChange", "(Ljava/lang/String;)V", "onLiftingConfirm", "()V", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/api/LargeOrdersLiftingApi;", "LNc/c;", "kotlin.jvm.PlatformType", "floorChangeSubject", "LNc/c;", "Lqc/g;", "", "onErrorConsumer", "Lqc/g;", "selectedFloor", "Ljava/lang/String;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;", "Landroidx/lifecycle/V;", "inputError", "Landroidx/lifecycle/V;", "getInputError", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/FloorChangeResultModel;", "floorChange", "getFloorChange", "Lru/ozon/uni/atoms/af/AtomAction;", "confirmAction", "getConfirmAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "message", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getMessage", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeOrdersLiftingV2ViewModel extends w0 {

    @NotNull
    private final LargeOrdersLiftingApi api;

    @NotNull
    private final V<AtomAction> confirmAction;

    @NotNull
    private final V<FloorChangeResultModel> floorChange;

    @NotNull
    private final C3669c<String> floorChangeSubject;

    @NotNull
    private final V<String> inputError;

    @NotNull
    private final SingleLiveEvent<String> message;

    @NotNull
    private final g<Throwable> onErrorConsumer;
    private String selectedFloor;
    private LargeOrdersLiftingV2VO vo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel$Companion;", "", "<init>", "()V", "TEXT_CHANGE_DEBOUNCE_DEFAULT", "", "FIELD_FLOOR", "", "BASE_URL", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LargeOrdersLiftingV2ViewModel(@NotNull LargeOrdersLiftingApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        C3669c<String> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.floorChangeSubject = d11;
        this.onErrorConsumer = new C2621x(this);
        this.inputError = new V<>();
        this.floorChange = new V<>();
        this.confirmAction = new V<>();
        this.message = new SingleLiveEvent<>();
    }

    private final String buildUrl(String str) {
        String builder = Uri.parse("composer-api.bx/_action/v2/").buildUpon().appendEncodedPath(str + "&address_floor=" + this.selectedFloor).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onErrorConsumer$lambda$0(LargeOrdersLiftingV2ViewModel largeOrdersLiftingV2ViewModel, Throwable th2) {
        SingleLiveEvent<String> singleLiveEvent = largeOrdersLiftingV2ViewModel.message;
        Intrinsics.f(th2);
        singleLiveEvent.setValue(ScreenStateExtKt.toScreenState$default(th2, null, false, 3, null) instanceof ScreenState.NoConnection ? StringProvider.getString(R$string.error_common_error_no_connection_description) : StringProvider.getString(R$string.error_common_error_technical_error_title));
    }

    @NotNull
    public final V<AtomAction> getConfirmAction() {
        return this.confirmAction;
    }

    @NotNull
    public final V<FloorChangeResultModel> getFloorChange() {
        return this.floorChange;
    }

    @NotNull
    public final V<String> getInputError() {
        return this.inputError;
    }

    @NotNull
    public final SingleLiveEvent<String> getMessage() {
        return this.message;
    }

    public final void observeTextChange(Long debounce) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = this.floorChangeSubject.distinctUntilChanged().debounce(debounce != null ? debounce.longValue() : 2000L, TimeUnit.MILLISECONDS).observeOn(C8125a.a()).subscribe(new b(new LargeOrdersLiftingV2ViewModel$observeTextChange$1(this), 14), this.onErrorConsumer);
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    public final void onFloorChange(@NotNull String floor) {
        Intrinsics.checkNotNullParameter(floor, "floor");
        this.selectedFloor = floor;
        this.floorChangeSubject.onNext(floor);
        this.inputError.setValue(null);
    }

    public final void onLiftingConfirm() {
        InputVO input;
        ButtonV3DTO confirmButton;
        CommonControlSettings common;
        AtomActionDTO action;
        String str = this.selectedFloor;
        String str2 = null;
        if (str == null || h.K(str)) {
            V<String> v11 = this.inputError;
            LargeOrdersLiftingV2VO largeOrdersLiftingV2VO = this.vo;
            if (largeOrdersLiftingV2VO != null && (input = largeOrdersLiftingV2VO.getInput()) != null) {
                str2 = input.getEmptyValidationText();
            }
            v11.setValue(str2);
            return;
        }
        C8486a a11 = C5415f.a(this);
        LargeOrdersLiftingApi largeOrdersLiftingApi = this.api;
        LargeOrdersLiftingV2VO largeOrdersLiftingV2VO2 = this.vo;
        if (largeOrdersLiftingV2VO2 != null && (confirmButton = largeOrdersLiftingV2VO2.getConfirmButton()) != null && (common = confirmButton.getCommon()) != null && (action = common.getAction()) != null) {
            str2 = action.getLink();
        }
        if (str2 == null) {
            str2 = "";
        }
        InterfaceC8487b h11 = largeOrdersLiftingApi.confirmLifting(buildUrl(str2)).j(a.b()).g(C8125a.a()).h(new c(new LargeOrdersLiftingV2ViewModel$onLiftingConfirm$1(this), 16), this.onErrorConsumer);
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    public final void setData(@NotNull LargeOrdersLiftingV2VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.vo = vo;
        this.selectedFloor = vo.getInput().getValue();
    }
}
