package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler;

import DM.e;
import DM.f;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "withCompleteOnAuth", "", "checkAuthorise", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Z)V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent;", "_action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "commentAction", "Landroidx/lifecycle/P;", "getCommentAction", "()Landroidx/lifecycle/P;", "CommentEvent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentFooterViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<CommentEvent> _action;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final P<CommentEvent> commentAction;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent;", "", "<init>", "()V", "CallAuth", "CompleteAction", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent$CallAuth;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent$CompleteAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CommentEvent {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent$CallAuth;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CallAuth extends CommentEvent {

            @NotNull
            public static final CallAuth INSTANCE = new CallAuth();

            private CallAuth() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CallAuth);
            }

            public int hashCode() {
                return 514506821;
            }

            @NotNull
            public String toString() {
                return "CallAuth";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent$CompleteAction;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CompleteAction extends CommentEvent {
            public static final int $stable = AtomAction.Click.$stable;

            @NotNull
            private final AtomAction.Click action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompleteAction(@NotNull AtomAction.Click action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompleteAction) && Intrinsics.d(this.action, ((CompleteAction) other).action);
            }

            @NotNull
            public final AtomAction.Click getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "CompleteAction(action=" + this.action + ")";
            }
        }

        public /* synthetic */ CommentEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CommentEvent() {
        }
    }

    public CommentFooterViewModel(@NotNull AuthStateStorage authManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.authManager = authManager;
        SingleLiveEvent<CommentEvent> singleLiveEvent = new SingleLiveEvent<>();
        this._action = singleLiveEvent;
        this.commentAction = singleLiveEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAuthorise$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    public final void checkAuthorise(@NotNull AtomAction.Click action, boolean withCompleteOnAuth) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.authManager.isAuthenticated()) {
            this._action.setValue(new CommentEvent.CompleteAction(action));
            return;
        }
        this._action.setValue(CommentEvent.CallAuth.INSTANCE);
        if (withCompleteOnAuth) {
            C8486a a11 = C5415f.a(this);
            InterfaceC8487b subscribe = this.authManager.getAuthState().subscribeOn(a.b()).observeOn(C8125a.a()).filter(new e(CommentFooterViewModel$checkAuthorise$1.INSTANCE, 9)).subscribe(new f(new CommentFooterViewModel$checkAuthorise$2(this, action), 6));
            Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
            RxExtKt.plusAssign(a11, subscribe);
        }
    }

    @NotNull
    public final P<CommentEvent> getCommentAction() {
        return this.commentAction;
    }
}
