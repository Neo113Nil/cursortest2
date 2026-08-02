package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button;

import We.M;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.ConfirmDateButtonErrorBody;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "throwable", "", "handlingThrowableAndGetErrorMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "errorBody", "getErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "onButtonClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "singleLoading", "Landroidx/lifecycle/P;", "actions", "Landroidx/lifecycle/P;", "getActions", "()Landroidx/lifecycle/P;", "loading", "getLoading", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "State", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmDateButtonViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final P<State> actions;

    @NotNull
    private final J coroutineExceptionHandler;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final P<Boolean> loading;

    @NotNull
    private final SingleLiveEvent<State> singleAction;

    @NotNull
    private final SingleLiveEvent<Boolean> singleLoading;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Error", "Success", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State$Error;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State$Success;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {
        private final String message;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State$Error;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State;", "message", "", "<init>", "(Ljava/lang/String;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends State {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State$Success;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel$State;", "message", "", "<init>", "(Ljava/lang/String;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends State {
            public Success(String str) {
                super(str, null);
            }
        }

        public /* synthetic */ State(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getMessage() {
            return this.message;
        }

        private State(String str) {
            this.message = str;
        }
    }

    public ConfirmDateButtonViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.actionV2Repository = actionV2Repository;
        this.jsonDeserializer = jsonDeserializer;
        SingleLiveEvent<State> singleLiveEvent = new SingleLiveEvent<>();
        this.singleAction = singleLiveEvent;
        SingleLiveEvent<Boolean> singleLiveEvent2 = new SingleLiveEvent<>();
        this.singleLoading = singleLiveEvent2;
        this.actions = singleLiveEvent;
        this.loading = singleLiveEvent2;
        this.coroutineExceptionHandler = new ConfirmDateButtonViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
    }

    private final String getErrorMessage(String errorBody) {
        return ((ConfirmDateButtonErrorBody) this.jsonDeserializer.fromJson(errorBody, ConfirmDateButtonErrorBody.class)).getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String handlingThrowableAndGetErrorMessage(Throwable throwable) {
        M errorBody;
        if (!(throwable instanceof HttpException)) {
            return StringProvider.getString(R$string.error_common_message_service_error);
        }
        Response<?> response = ((HttpException) throwable).response();
        String string = (response == null || (errorBody = response.errorBody()) == null) ? null : errorBody.string();
        return string != null ? getErrorMessage(string) : StringProvider.getString(R$string.error_common_message_service_error);
    }

    @NotNull
    public final P<State> getActions() {
        return this.actions;
    }

    @NotNull
    public final P<Boolean> getLoading() {
        return this.loading;
    }

    public final void onButtonClick(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if (atomAction instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) atomAction;
            C10727i.c(x0.a(this), this.coroutineExceptionHandler, null, new ConfirmDateButtonViewModel$onButtonClick$1(this, new ActionV2Request(composerAction.getParams(), composerAction.getActionName(), false, 4, null), null), 2);
        }
    }
}
