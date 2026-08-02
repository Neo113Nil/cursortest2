package ru.ozon.app.android.product.actionhandlers;

import BF.a;
import BF.b;
import W10.c;
import a00.C4911f;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ResponseRedirectAction;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00072\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00072\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u001b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/product/actionhandlers/ComposerActionWithRefreshActionHandler;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lkotlin/Function0;", "", "onSuccessResponse", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/v2/ActionV2Repository;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "processHandleAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/uni/android/flashbar/model/Restriction;", "message", "showRestriction", "(La00/f;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "showError", "(La00/f;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)Z", "onClear", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lkotlin/jvm/functions/Function0;", "", "id", "Ljava/lang/String;", "Lnc/a;", "disposables", "Lnc/a;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerActionWithRefreshActionHandler {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final String id;
    private final Function0<Unit> onSuccessResponse;

    @NotNull
    private final ComposerReferences refs;

    public ComposerActionWithRefreshActionHandler(@NotNull ComposerReferences refs, @NotNull ActionV2Repository actionV2Repository, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.refs = refs;
        this.actionV2Repository = actionV2Repository;
        this.onSuccessResponse = function0;
        this.id = "composerActionWithRefresh";
        this.disposables = new C8486a();
    }

    private final void processHandleAction(AtomAction.ComposerAction action, c trackingData) {
        ActionV2Request actionV2Request = new ActionV2Request(action.getParams(), action.getActionName(), false, 4, null);
        C4911f container = this.refs.getContainer();
        C8486a c8486a = this.disposables;
        int i11 = 0;
        InterfaceC8487b h11 = this.actionV2Repository.callActionWithTracking(actionV2Request, trackingData, ResponseRedirectAction.class).g(C8125a.a()).h(new a(new ComposerActionWithRefreshActionHandler$processHandleAction$1(this, container), i11), new b(new ComposerActionWithRefreshActionHandler$processHandleAction$2(this, container), i11));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRestriction(C4911f container, Restriction message) {
        ViewGroup rootView;
        if (message == null || (rootView = ContextExtKt.getRootView(container.a())) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(message), container.g(), null, null, null, null, null, 248, null);
    }

    public final boolean handle(@NotNull AtomAction action, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return false;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        if (!Intrinsics.d(composerAction.getId(), this.id)) {
            return false;
        }
        processHandleAction(composerAction, trackingData);
        return true;
    }

    public final void onClear() {
        this.disposables.d();
    }

    public /* synthetic */ ComposerActionWithRefreshActionHandler(ComposerReferences composerReferences, ActionV2Repository actionV2Repository, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, actionV2Repository, (i11 & 4) != 0 ? null : function0);
    }
}
