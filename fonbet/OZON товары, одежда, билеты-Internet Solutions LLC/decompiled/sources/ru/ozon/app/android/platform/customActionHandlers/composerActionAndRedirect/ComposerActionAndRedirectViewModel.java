package ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect;

import Lz.C3602a;
import Mc.a;
import W10.c;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "callRequest", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;", "_state", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "state", "Landroidx/lifecycle/P;", "getState", "()Landroidx/lifecycle/P;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerActionAndRedirectViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<ComposerActionAndRedirectState> _state;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final P<ComposerActionAndRedirectState> state;

    public ComposerActionAndRedirectViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        SingleLiveEvent<ComposerActionAndRedirectState> singleLiveEvent = new SingleLiveEvent<>();
        this._state = singleLiveEvent;
        this.state = singleLiveEvent;
    }

    public final void callRequest(@NotNull AtomAction.ComposerAction action, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        ActionV2Request actionV2Request = new ActionV2Request(action.getParams(), action.getActionName(), false, 4, null);
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = this.actionV2Repository.callActionWithTracking(actionV2Request, trackingData, ResponseRedirectAction.class).j(a.b()).g(C8125a.a()).h(new AA.a(new ComposerActionAndRedirectViewModel$callRequest$1(this), 9), new C3602a(new ComposerActionAndRedirectViewModel$callRequest$2(this), 9));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    @NotNull
    public final P<ComposerActionAndRedirectState> getState() {
        return this.state;
    }
}
