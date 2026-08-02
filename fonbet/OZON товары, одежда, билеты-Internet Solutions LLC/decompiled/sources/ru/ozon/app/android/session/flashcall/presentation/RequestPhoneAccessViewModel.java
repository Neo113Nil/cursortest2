package ru.ozon.app.android.session.flashcall.presentation;

import Bc.i;
import CJ.b;
import Mc.a;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.session.flashcall.presentation.PermissionsAction;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "actionLink", "", "", "body", "", "sendAction", "(Ljava/lang/String;Ljava/util/Map;)V", "onCleared", "()V", "onPermissionGranted", "", "isReadCallLogGranted", "shouldShowReadCallLogRational", "isReadPhoneStateGranted", "shouldShowReadPhoneStateRational", "onRequestPermissionsResult", "(ZZZZ)V", "onDisallowAccessButtonClicked", "(Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "setAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/flashcall/presentation/PermissionsAction;", "permissionAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getPermissionAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "disposables", "Lnc/a;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestPhoneAccessViewModel extends w0 {
    private AtomAction.Click action;

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final SingleLiveEvent<PermissionsAction> permissionAction;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewModel$Companion;", "", "<init>", "()V", "CALL_LOG_ANALYTICS_KEY", "", "PHONE_STATE_ANALYTICS_KEY", "ALLOW_ANALYTICS_VALUE", "DECLINE_ANALYTICS_VALUE", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RequestPhoneAccessViewModel(@NotNull ActionV2Repository actionRepository) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        this.actionRepository = actionRepository;
        this.permissionAction = new SingleLiveEvent<>();
        this.disposables = new C8486a();
    }

    private final void sendAction(String actionLink, Map<String, ? extends Object> body) {
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new i(this.actionRepository.callAction(new ActionV2Request(body, actionLink, false, 4, null), Response.class).j(a.b()).g(C8125a.a()), new CJ.a(new RequestPhoneAccessViewModel$sendAction$1(this), 0)).h(new b(new RequestPhoneAccessViewModel$sendAction$2(this), 0), new BF.a(new RequestPhoneAccessViewModel$sendAction$3(this), 1));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendAction$default(RequestPhoneAccessViewModel requestPhoneAccessViewModel, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = U.c();
        }
        requestPhoneAccessViewModel.sendAction(str, map);
    }

    @NotNull
    public final SingleLiveEvent<PermissionsAction> getPermissionAction() {
        return this.permissionAction;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
    }

    public final void onDisallowAccessButtonClicked(String actionLink) {
        if (actionLink != null) {
            sendAction$default(this, actionLink, null, 2, null);
        }
    }

    public final void onPermissionGranted() {
        String link;
        AtomAction.Click click = this.action;
        if (click == null || (link = click.getLink()) == null) {
            return;
        }
        sendAction$default(this, link, null, 2, null);
    }

    public final void onRequestPermissionsResult(boolean isReadCallLogGranted, boolean shouldShowReadCallLogRational, boolean isReadPhoneStateGranted, boolean shouldShowReadPhoneStateRational) {
        String link;
        Map<String, ? extends Object> j11 = U.j(new Pair("ozonid_setup_read_history_call", isReadCallLogGranted ? "allow" : "decline"), new Pair("ozonid_setup_call_manage", isReadPhoneStateGranted ? "allow" : "decline"));
        if ((!isReadCallLogGranted && !shouldShowReadCallLogRational) || (!isReadPhoneStateGranted && !shouldShowReadPhoneStateRational)) {
            this.permissionAction.setValue(PermissionsAction.ShowSettings.INSTANCE);
            return;
        }
        AtomAction.Click click = this.action;
        if (click == null || (link = click.getLink()) == null) {
            return;
        }
        sendAction(link, j11);
    }

    public final void setAction(AtomAction.Click click) {
        this.action = click;
    }
}
