package ru.ozon.app.android.partpayment.homecredit;

import Bc.e;
import Bc.i;
import Fy.C3065c;
import GH.b;
import GZ.g;
import Mc.a;
import a00.C4911f;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/partpayment/homecredit/HomeCreditActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/partpayment/homecredit/HomeCreditApi;", "homeCreditApi", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/partpayment/homecredit/HomeCreditApi;LGZ/g;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/partpayment/homecredit/HomeCreditApi;", "LGZ/g;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lnc/b;", "disposable", "Lnc/b;", "LifecycleDisposable", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeCreditActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final HomeCreditApi homeCreditApi;

    @NotNull
    private final g ozonRouter;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/homecredit/HomeCreditActionHandler$LifecycleDisposable;", "Lnc/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "lifecycleOwner", "disposable", "<init>", "(Landroidx/lifecycle/J;Lnc/b;)V", "", "isDisposed", "()Z", "", "dispose", "()V", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "Landroidx/lifecycle/J;", "Lnc/b;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class LifecycleDisposable implements InterfaceC8487b, DefaultLifecycleObserver {

        @NotNull
        private final InterfaceC8487b disposable;

        @NotNull
        private final J lifecycleOwner;

        public LifecycleDisposable(@NotNull J lifecycleOwner, @NotNull InterfaceC8487b disposable) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            this.lifecycleOwner = lifecycleOwner;
            this.disposable = disposable;
        }

        @Override // nc.InterfaceC8487b
        public void dispose() {
            this.disposable.dispose();
            this.lifecycleOwner.getLifecycle().e(this);
        }

        @Override // nc.InterfaceC8487b
        public boolean isDisposed() {
            return this.disposable.isDisposed() || this.lifecycleOwner.getLifecycle().b() == AbstractC5434v.b.DESTROYED;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.disposable.dispose();
        }
    }

    public HomeCreditActionHandler(@NotNull HomeCreditApi homeCreditApi, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(homeCreditApi, "homeCreditApi");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.homeCreditApi = homeCreditApi;
        this.ozonRouter = ozonRouter;
        this.actionId = "shockFormValidationAction";
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        C4911f container = handlerRefs.getRefs().getContainer();
        final InterfaceC7851b controller = handlerRefs.getRefs().getController();
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            String actionName = composerAction.getActionName();
            if (actionName == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.disposable.dispose();
            HomeCreditApi homeCreditApi = this.homeCreditApi;
            Map<String, String> params = composerAction.getParams();
            if (params == null) {
                params = U.c();
            }
            InterfaceC8487b h11 = new e(new i(homeCreditApi.sendInformation(actionName, params).j(a.b()).g(C8125a.a()), new GH.a(new HomeCreditActionHandler$processAction$singleDisposable$1(controller), 5)), new InterfaceC9019a() { // from class: aC.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    InterfaceC7851b.this.hideLoader();
                }
            }).h(new b(new HomeCreditActionHandler$processAction$singleDisposable$3(container, this), 6), new C3065c(new HomeCreditActionHandler$processAction$singleDisposable$4(Lm0.a.f17149a), 6));
            Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
            LifecycleDisposable lifecycleDisposable = new LifecycleDisposable(container.g(), h11);
            container.g().getLifecycle().a(lifecycleDisposable);
            this.disposable = lifecycleDisposable;
        }
    }
}
