package ru.ozon.app.android.session.sessionList.presentation;

import AA.a;
import Bc.e;
import Bc.i;
import Bc.t;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.session.sessionList.presentation.SessionListEvent;
import ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u00000\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/SessionListViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;", "sessionListUpdatedEventBus", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;)V", "T", "Lio/reactivex/y;", "kotlin.jvm.PlatformType", "withLoader", "(Lio/reactivex/y;)Lio/reactivex/y;", "", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;", "toDialogTheme", "(Ljava/lang/String;)Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "", "getLogoutCurrentUser", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "action", "", "onLogoutOnAllButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "onLogoutOnAllConfirmed", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "events", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getEvents", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final SingleLiveEvent<SessionListEvent> events;

    @NotNull
    private final SessionListUpdatedEventBus sessionListUpdatedEventBus;

    public SessionListViewModel(@NotNull ActionV2Repository actionRepository, @NotNull SessionListUpdatedEventBus sessionListUpdatedEventBus) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(sessionListUpdatedEventBus, "sessionListUpdatedEventBus");
        this.actionRepository = actionRepository;
        this.sessionListUpdatedEventBus = sessionListUpdatedEventBus;
        this.events = new SingleLiveEvent<>();
    }

    private final boolean getLogoutCurrentUser(AtomAction.ComposerAction composerAction) {
        String str;
        Map<String, String> params = composerAction.getParams();
        if (params == null || (str = params.get("logoutCurrentUser")) == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    private final SessionListEvent.ShowLogoutOnAllDialog.DialogTheme toDialogTheme(String str) {
        return Intrinsics.d(str, "delete") ? SessionListEvent.ShowLogoutOnAllDialog.DialogTheme.DELETE : SessionListEvent.ShowLogoutOnAllDialog.DialogTheme.PRIMARY;
    }

    private final <T> y<T> withLoader(y<T> yVar) {
        a aVar = new a(new SessionListViewModel$withLoader$1(this), 2);
        yVar.getClass();
        e eVar = new e(new i(yVar, aVar), new InterfaceC9019a() { // from class: IJ.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                SessionListViewModel.withLoader$lambda$3(SessionListViewModel.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(eVar, "doAfterTerminate(...)");
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withLoader$lambda$3(SessionListViewModel sessionListViewModel) {
        sessionListViewModel.events.setValue(SessionListEvent.HideLoadingOverlay.INSTANCE);
    }

    @NotNull
    public final SingleLiveEvent<SessionListEvent> getEvents() {
        return this.events;
    }

    public final void onLogoutOnAllButtonClicked(@NotNull AtomAction.ComposerAction action) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("confirmationTitle")) == null || (str2 = params.get("confirmationConfirm")) == null || (str3 = params.get("confirmationCancel")) == null) {
            return;
        }
        this.events.setValue(new SessionListEvent.ShowLogoutOnAllDialog(action, str, params.get("confirmationSubtitle"), str2, str3, toDialogTheme(params.get("confirmationTheme"))));
    }

    public final void onLogoutOnAllConfirmed(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean logoutCurrentUser = getLogoutCurrentUser(action);
        ActionV2Request actionV2Request = new ActionV2Request(null, action.getActionName(), false, 5, null);
        C8486a a11 = C5415f.a(this);
        t g10 = this.actionRepository.callAction(actionV2Request, Object.class).j(Mc.a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        InterfaceC8487b h11 = withLoader(g10).h(new IJ.a(new SessionListViewModel$onLogoutOnAllConfirmed$1(action, this, logoutCurrentUser), 0), new HX.a(new SessionListViewModel$onLogoutOnAllConfirmed$2(this), 1));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }
}
