package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B90.C2618u;
import Ef0.c;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscribeRepository;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 +2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0003+,-B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;", "freshSubscribeRepository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "", "actionId", "", "productId", "", "subscribeAction", "(Ljava/lang/String;J)V", "onCleared", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "clickAction", "onSubscribeClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "LAe/x0;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$UiState;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "Lze/h;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;", "_actions", "Lze/h;", "LAe/h;", "actions", "LAe/h;", "getActions", "()LAe/h;", "Companion", "UiState", "Action", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwapButtonViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final h<Action> _actions;

    @NotNull
    private final x0<UiState> _state;

    @NotNull
    private final InterfaceC2395h<Action> actions;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final FreshSubscribeRepository freshSubscribeRepository;

    @NotNull
    private final M0<UiState> state;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;", "", "SubscriptionError", "NeedAuth", "SubscriptionInProgress", "SubscriptionSuccess", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$NeedAuth;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$SubscriptionError;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$SubscriptionInProgress;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$SubscriptionSuccess;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$NeedAuth;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NeedAuth implements Action {

            @NotNull
            public static final NeedAuth INSTANCE = new NeedAuth();

            private NeedAuth() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NeedAuth);
            }

            public int hashCode() {
                return 714047850;
            }

            @NotNull
            public String toString() {
                return "NeedAuth";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$SubscriptionError;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubscriptionError implements Action {

            @NotNull
            public static final SubscriptionError INSTANCE = new SubscriptionError();

            private SubscriptionError() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SubscriptionError);
            }

            public int hashCode() {
                return -1773642145;
            }

            @NotNull
            public String toString() {
                return "SubscriptionError";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$SubscriptionInProgress;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubscriptionInProgress implements Action {

            @NotNull
            public static final SubscriptionInProgress INSTANCE = new SubscriptionInProgress();

            private SubscriptionInProgress() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SubscriptionInProgress);
            }

            public int hashCode() {
                return 1946144891;
            }

            @NotNull
            public String toString() {
                return "SubscriptionInProgress";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action$SubscriptionSuccess;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;", "", "isSubscribed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubscriptionSuccess implements Action {
            private final boolean isSubscribed;

            public SubscriptionSuccess(boolean z11) {
                this.isSubscribed = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubscriptionSuccess) && this.isSubscribed == ((SubscriptionSuccess) other).isSubscribed;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSubscribed);
            }

            /* renamed from: isSubscribed, reason: from getter */
            public final boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            public String toString() {
                return C2618u.g("SubscriptionSuccess(isSubscribed=", ")", this.isSubscribed);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$UiState;", "", "", "isSwapped", "isButtonEnabled", "<init>", "(ZZ)V", "copy", "(ZZ)Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$UiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UiState {
        private final boolean isButtonEnabled;
        private final boolean isSwapped;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UiState() {
            this(r2, r2, 3, null);
            boolean z11 = false;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = uiState.isSwapped;
            }
            if ((i11 & 2) != 0) {
                z12 = uiState.isButtonEnabled;
            }
            return uiState.copy(z11, z12);
        }

        @NotNull
        public final UiState copy(boolean isSwapped, boolean isButtonEnabled) {
            return new UiState(isSwapped, isButtonEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiState)) {
                return false;
            }
            UiState uiState = (UiState) other;
            return this.isSwapped == uiState.isSwapped && this.isButtonEnabled == uiState.isButtonEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isButtonEnabled) + (Boolean.hashCode(this.isSwapped) * 31);
        }

        /* renamed from: isButtonEnabled, reason: from getter */
        public final boolean getIsButtonEnabled() {
            return this.isButtonEnabled;
        }

        /* renamed from: isSwapped, reason: from getter */
        public final boolean getIsSwapped() {
            return this.isSwapped;
        }

        @NotNull
        public String toString() {
            return c.c("UiState(isSwapped=", ", isButtonEnabled=", ")", this.isSwapped, this.isButtonEnabled);
        }

        public UiState(boolean z11, boolean z12) {
            this.isSwapped = z11;
            this.isButtonEnabled = z12;
        }

        public /* synthetic */ UiState(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12);
        }
    }

    public SwapButtonViewModel(@NotNull FreshSubscribeRepository freshSubscribeRepository, @NotNull AuthStateStorage authStateStorage) {
        Intrinsics.checkNotNullParameter(freshSubscribeRepository, "freshSubscribeRepository");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        this.freshSubscribeRepository = freshSubscribeRepository;
        this.authStateStorage = authStateStorage;
        boolean z11 = false;
        x0<UiState> a11 = O0.a(new UiState(z11, z11, 3, null));
        this._state = a11;
        this.state = C2399j.b(a11);
        C11115c a12 = k.a(-2, 6, null);
        this._actions = a12;
        this.actions = C2399j.H(a12);
    }

    private final void subscribeAction(String actionId, long productId) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SwapButtonViewModel$subscribeAction$1(this, actionId, productId, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final M0<UiState> getState() {
        return this.state;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        boolean z11 = false;
        this._state.setValue(new UiState(z11, z11, 3, null));
    }

    public final void onSubscribeClick(@NotNull AtomAction.Click clickAction) {
        String str;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Map<String, String> params = clickAction.getParams();
        Long y02 = (params == null || (str = params.get("sku")) == null) ? null : kotlin.text.h.y0(str);
        String link = clickAction.getLink();
        if (!this.authStateStorage.isAuthenticated()) {
            this._actions.b(Action.NeedAuth.INSTANCE);
        } else {
            if (y02 == null || link == null) {
                return;
            }
            subscribeAction(link, y02.longValue());
        }
    }
}
