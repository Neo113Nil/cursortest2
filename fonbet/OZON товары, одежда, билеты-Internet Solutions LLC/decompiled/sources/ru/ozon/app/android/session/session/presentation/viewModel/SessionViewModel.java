package ru.ozon.app.android.session.session.presentation.viewModel;

import Bc.e;
import Bc.i;
import Bc.t;
import GJ.b;
import Mc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import io.reactivex.y;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionEvent;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00018\u00008\u00000\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/session/session/presentation/viewModel/SessionViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;", "sessionListUpdatedEventBus", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "T", "Lio/reactivex/y;", "kotlin.jvm.PlatformType", "withLoader", "(Lio/reactivex/y;)Lio/reactivex/y;", "", "jsonString", "", "", "parseToMap", "(Ljava/lang/String;)Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "onLogoutButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "onLogoutConfirmed", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/account/session/SessionListUpdatedEventBus;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Ljava/lang/reflect/ParameterizedType;", "type$delegate", "LSc/j;", "getType", "()Ljava/lang/reflect/ParameterizedType;", "type", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "events", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getEvents", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final SingleLiveEvent<SessionEvent> events;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final SessionListUpdatedEventBus sessionListUpdatedEventBus;

    /* renamed from: type$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j type;

    public SessionViewModel(@NotNull ActionV2Repository actionRepository, @NotNull SessionListUpdatedEventBus sessionListUpdatedEventBus, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(sessionListUpdatedEventBus, "sessionListUpdatedEventBus");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.actionRepository = actionRepository;
        this.sessionListUpdatedEventBus = sessionListUpdatedEventBus;
        this.jsonDeserializer = jsonDeserializer;
        this.type = k.b(SessionViewModel$type$2.INSTANCE);
        this.events = new SingleLiveEvent<>();
    }

    private final ParameterizedType getType() {
        return (ParameterizedType) this.type.getValue();
    }

    private final Map<String, Object> parseToMap(String jsonString) {
        if (jsonString != null && !h.K(jsonString)) {
            try {
                return (Map) this.jsonDeserializer.fromJson(jsonString, getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final <T> y<T> withLoader(y<T> yVar) {
        b bVar = new b(new SessionViewModel$withLoader$1(this), 0);
        yVar.getClass();
        e eVar = new e(new i(yVar, bVar), new InterfaceC9019a() { // from class: GJ.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                SessionViewModel.withLoader$lambda$3(SessionViewModel.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(eVar, "doAfterTerminate(...)");
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withLoader$lambda$3(SessionViewModel sessionViewModel) {
        sessionViewModel.events.setValue(SessionEvent.HideLoadingOverlay.INSTANCE);
    }

    @NotNull
    public final SingleLiveEvent<SessionEvent> getEvents() {
        return this.events;
    }

    public final void onLogoutButtonClicked(@NotNull AtomAction.ComposerAction action) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("confirmationTitle")) == null || (str2 = params.get("confirmationConfirm")) == null || (str3 = params.get("confirmationCancel")) == null) {
            return;
        }
        this.events.setValue(new SessionEvent.ShowLogoutDialog(action, str, params.get("confirmationSubtitle"), str2, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLogoutConfirmed(@NotNull AtomAction.ComposerAction action) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        String actionName = action.getActionName();
        Map<String, String> params = action.getParams();
        ActionV2Request actionV2Request = new ActionV2Request((params == null || (str = params.get("postBody")) == null) ? null : parseToMap(str), actionName, false, 4, null);
        C8486a a11 = C5415f.a(this);
        t g10 = this.actionRepository.callAction(actionV2Request, Object.class).j(a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        InterfaceC8487b h11 = withLoader(g10).h(new BO.b(new SessionViewModel$onLogoutConfirmed$1(this, action), 1), new GJ.a(new SessionViewModel$onLogoutConfirmed$2(this), 0 == true ? 1 : 0));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }
}
