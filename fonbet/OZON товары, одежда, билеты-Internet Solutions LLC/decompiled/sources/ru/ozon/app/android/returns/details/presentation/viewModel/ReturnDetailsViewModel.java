package ru.ozon.app.android.returns.details.presentation.viewModel;

import B90.C2618u;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;
import ru.ozon.app.android.returns.details.data.dto.controls.RmsAspectDto;
import ru.ozon.app.android.returns.details.data.dto.controls.RmsSelectDto;
import ru.ozon.app.android.returns.details.data.response.ConfirmTimeSlotResponse;
import ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.atoms.select.dialog.SelectModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 @2\u00020\u0001:\u0002@AB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019*\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0018\u00101\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R#\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0019098\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=¨\u0006B"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;", "interactor", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;)V", "Lru/ozon/app/android/returns/details/data/response/ConfirmTimeSlotResponse;", "response", "", "handleConfirmReturnSuccess", "(Lru/ozon/app/android/returns/details/data/response/ConfirmTimeSlotResponse;)V", "", "error", "handleConfirmReturnError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;", "other", "", "areDateSame", "(Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;)Z", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "selected", "(Ljava/util/List;)Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "", "selectedPosition", "Lru/ozon/app/android/uikit/view/atoms/select/dialog/SelectModel;", "toSelectModelList", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;I)Ljava/util/List;", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;", "timeSlotSelector", "init", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;)V", "onDateSlotChange", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;)V", "onTimeSlotChange", "(I)V", "", "actionName", "confirmReturnDate", "(Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;", "selectedTimeSlotValue", "Ljava/lang/String;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "dateSlots", "Landroidx/lifecycle/V;", "getDateSlots", "()Landroidx/lifecycle/V;", "timeSlots", "getTimeSlots", "Companion", "Action", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> action;

    @NotNull
    private final V<List<ReturnMethodDto.TimeSlotDto>> dateSlots;

    @NotNull
    private final ReturnUpdateInteractor interactor;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final ActionV2Repository repository;
    private String selectedTimeSlotValue;

    @NotNull
    private final V<List<SelectModel>> timeSlots;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;", "", "<init>", "()V", "Success", "Error", "Loading", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action$Error;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action$Loading;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action$Success;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action$Error;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "msg", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMsg", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {
            public static final int $stable = OzonSpannableString.$stable;

            @NotNull
            private final OzonSpannableString msg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull OzonSpannableString msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.msg = msg;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.msg, ((Error) other).msg);
            }

            @NotNull
            public final OzonSpannableString getMsg() {
                return this.msg;
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(msg=" + ((Object) this.msg) + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action$Loading;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;", "", "showLoader", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowLoader", "()Z", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends Action {
            private final boolean showLoader;

            public Loading(boolean z11) {
                super(null);
                this.showLoader = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.showLoader == ((Loading) other).showLoader;
            }

            public final boolean getShowLoader() {
                return this.showLoader;
            }

            public int hashCode() {
                return Boolean.hashCode(this.showLoader);
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loading(showLoader=", ")", this.showLoader);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action$Success;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "message", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMessage", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {
            public static final int $stable = OzonSpannableString.$stable | AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            @NotNull
            private final OzonSpannableString message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull AtomAction action, @NotNull OzonSpannableString message) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(message, "message");
                this.action = action;
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.action, success.action) && Intrinsics.d(this.message, success.message);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final OzonSpannableString getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode() + (this.action.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Success(action=" + this.action + ", message=" + ((Object) this.message) + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Companion;", "", "<init>", "()V", "CONFIRM_RETURN_DATE_PARAM_NAME", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReturnDetailsViewModel(@NotNull ActionV2Repository repository, @NotNull JsonParser jsonDeserializer, @NotNull ReturnUpdateInteractor interactor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.repository = repository;
        this.jsonDeserializer = jsonDeserializer;
        this.interactor = interactor;
        this.action = new SingleLiveEvent<>();
        this.dateSlots = new V<>();
        this.timeSlots = new V<>();
    }

    private final boolean areDateSame(RmsAspectDto rmsAspectDto, RmsAspectDto rmsAspectDto2) {
        return Intrinsics.d(rmsAspectDto.getTitle(), rmsAspectDto2.getTitle()) && Intrinsics.d(rmsAspectDto.getSubtitle(), rmsAspectDto2.getSubtitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConfirmReturnError(Throwable error) {
        this.action.setValue(new Action.Error(OzonSpannableStringKt.toOzonSpannableString(ScreenStateExtKt.toScreenState$default(error, null, false, 3, null) instanceof ScreenState.NoConnection ? StringProvider.getString(R$string.error_common_error_no_connection_description) : StringProvider.getString(R$string.error_common_error_technical_error_title))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConfirmReturnSuccess(ConfirmTimeSlotResponse response) {
        Action error;
        SingleLiveEvent<Action> singleLiveEvent = this.action;
        if (response.getNextAction() != null) {
            C10727i.c(x0.a(this), null, null, new ReturnDetailsViewModel$handleConfirmReturnSuccess$1(this, null), 3);
            error = new Action.Success(AtomActionMapperKt.toAtomAction(response.getNextAction(), null), response.getMessage());
        } else {
            error = new Action.Error(response.getMessage());
        }
        singleLiveEvent.setValue(error);
    }

    private final ReturnMethodDto.TimeSlotDto selected(List<ReturnMethodDto.TimeSlotDto> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((ReturnMethodDto.TimeSlotDto) obj).getDay().getSelected(), Boolean.TRUE)) {
                break;
            }
        }
        return (ReturnMethodDto.TimeSlotDto) obj;
    }

    private final List<SelectModel> toSelectModelList(ReturnMethodDto.TimeSlotDto timeSlotDto, int i11) {
        RmsSelectDto timeInterval;
        List<RmsSelectDto.Option> options;
        ArrayList arrayList = null;
        if (timeSlotDto != null && (timeInterval = timeSlotDto.getTimeInterval()) != null && (options = timeInterval.getOptions()) != null) {
            List<RmsSelectDto.Option> list = options;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                RmsSelectDto.Option option = (RmsSelectDto.Option) obj;
                boolean z11 = i12 == i11;
                if (z11) {
                    this.selectedTimeSlotValue = option.getValue();
                }
                arrayList2.add(new SelectModel(option.getLabel(), z11));
                i12 = i13;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }

    static /* synthetic */ List toSelectModelList$default(ReturnDetailsViewModel returnDetailsViewModel, ReturnMethodDto.TimeSlotDto timeSlotDto, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return returnDetailsViewModel.toSelectModelList(timeSlotDto, i11);
    }

    public final void confirmReturnDate(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C10727i.c(x0.a(this), null, null, new ReturnDetailsViewModel$confirmReturnDate$1(this, actionName, null), 3);
    }

    @NotNull
    public final SingleLiveEvent<Action> getAction() {
        return this.action;
    }

    @NotNull
    public final V<List<ReturnMethodDto.TimeSlotDto>> getDateSlots() {
        return this.dateSlots;
    }

    @NotNull
    public final V<List<SelectModel>> getTimeSlots() {
        return this.timeSlots;
    }

    public final void init(ReturnMethodDto.TimeSlotSelector timeSlotSelector) {
        List<ReturnMethodDto.TimeSlotDto> timeSlots;
        this.dateSlots.setValue(timeSlotSelector != null ? timeSlotSelector.getTimeSlots() : null);
        this.timeSlots.setValue(toSelectModelList$default(this, (timeSlotSelector == null || (timeSlots = timeSlotSelector.getTimeSlots()) == null) ? null : selected(timeSlots), 0, 1, null));
    }

    public final void onDateSlotChange(@NotNull ReturnMethodDto.TimeSlotDto selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        List<ReturnMethodDto.TimeSlotDto> value = this.dateSlots.getValue();
        if (value == null) {
            return;
        }
        List<ReturnMethodDto.TimeSlotDto> list = value;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ReturnMethodDto.TimeSlotDto timeSlotDto : list) {
            if (areDateSame(timeSlotDto.getDay(), selected.getDay())) {
                timeSlotDto = ReturnMethodDto.TimeSlotDto.copy$default(timeSlotDto, RmsAspectDto.copy$default(timeSlotDto.getDay(), null, null, null, Boolean.TRUE, 7, null), null, 2, null);
            } else if (Intrinsics.d(timeSlotDto.getDay().getSelected(), Boolean.TRUE)) {
                timeSlotDto = ReturnMethodDto.TimeSlotDto.copy$default(timeSlotDto, RmsAspectDto.copy$default(timeSlotDto.getDay(), null, null, null, Boolean.FALSE, 7, null), null, 2, null);
            }
            arrayList.add(timeSlotDto);
        }
        this.dateSlots.setValue(arrayList);
        this.timeSlots.setValue(toSelectModelList$default(this, selected, 0, 1, null));
    }

    public final void onTimeSlotChange(int selectedPosition) {
        V<List<SelectModel>> v11 = this.timeSlots;
        List<ReturnMethodDto.TimeSlotDto> value = this.dateSlots.getValue();
        v11.setValue(toSelectModelList(value != null ? selected(value) : null, selectedPosition));
    }
}
