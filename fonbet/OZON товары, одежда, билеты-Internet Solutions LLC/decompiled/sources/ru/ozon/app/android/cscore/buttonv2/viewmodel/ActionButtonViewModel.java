package ru.ozon.app.android.cscore.buttonv2.viewmodel;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.csma.api.models.CsmaErrorBody;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, d2 = {"Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/csma/api/ComposerActionApi;", "composerActionApi", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "moshi", "<init>", "(Lru/ozon/app/android/csma/api/ComposerActionApi;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "errorBody", "getErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "actionName", "params", "", "onButtonClick", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/csma/api/ComposerActionApi;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "actions$delegate", "LSc/j;", "getActions", "()Landroidx/lifecycle/P;", "actions", "", "clickableAction$delegate", "getClickableAction", "clickableAction", "loading$delegate", "getLoading", "loading", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "singleClickableAction", "singleLoading", "Action", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionButtonViewModel extends w0 {

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actions;

    /* renamed from: clickableAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j clickableAction;

    @NotNull
    private final ComposerActionApi composerActionApi;

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j loading;

    @NotNull
    private final JsonParser moshi;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;

    @NotNull
    private final SingleLiveEvent<Boolean> singleClickableAction;

    @NotNull
    private final SingleLiveEvent<Boolean> singleLoading;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001d\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "", "message", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getDeeplink", "Error", "Success", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action$Error;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action$Success;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {
        private final String deeplink;
        private final String message;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action$Error;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "", "message", "", "finish", "<init>", "(Ljava/lang/String;Z)V", "Z", "getFinish", "()Z", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends Action {
            private final boolean finish;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Error(@NotNull String message, boolean z11) {
                super(message, null, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(message, "message");
                this.finish = z11;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action$Success;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "message", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends Action {
            public Success(String str, String str2) {
                super(str, str2, null);
            }
        }

        public /* synthetic */ Action(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getMessage() {
            return this.message;
        }

        private Action(String str, String str2) {
            this.message = str;
            this.deeplink = str2;
        }
    }

    public ActionButtonViewModel(@NotNull ComposerActionApi composerActionApi, @NotNull JsonParser moshi) {
        Intrinsics.checkNotNullParameter(composerActionApi, "composerActionApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.composerActionApi = composerActionApi;
        this.moshi = moshi;
        this.actions = k.b(new ActionButtonViewModel$actions$2(this));
        this.clickableAction = k.b(new ActionButtonViewModel$clickableAction$2(this));
        this.loading = k.b(new ActionButtonViewModel$loading$2(this));
        this.singleAction = new SingleLiveEvent<>();
        this.singleClickableAction = new SingleLiveEvent<>();
        this.singleLoading = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getErrorMessage(String errorBody) {
        return ((CsmaErrorBody) this.moshi.fromJson(errorBody, CsmaErrorBody.class)).getError();
    }

    @NotNull
    public final P<Action> getActions() {
        return (P) this.actions.getValue();
    }

    @NotNull
    public final P<Boolean> getClickableAction() {
        return (P) this.clickableAction.getValue();
    }

    @NotNull
    public final P<Boolean> getLoading() {
        return (P) this.loading.getValue();
    }

    public final void onButtonClick(@NotNull String actionName, String params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C10727i.c(x0.a(this), null, null, new ActionButtonViewModel$onButtonClick$1(this, actionName, params, null), 3);
    }
}
