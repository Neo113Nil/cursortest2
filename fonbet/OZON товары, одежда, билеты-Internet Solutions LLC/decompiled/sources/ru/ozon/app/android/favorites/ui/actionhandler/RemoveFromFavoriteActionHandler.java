package ru.ozon.app.android.favorites.ui.actionhandler;

import DM.i;
import GH.b;
import Lm0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.favorites.data.utils.AnalyticRefs;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.utils.CustomComposerActionLifecycleDisposable;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/RemoveFromFavoriteActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "interactor", "<init>", "(Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "executeActionIfNeedIt", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "executeAction", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "", "manualAnalyticTracking", "Z", "getManualAnalyticTracking", "()Z", "Lnc/b;", "disposable", "Lnc/b;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveFromFavoriteActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final FavoritesCustomActionHandlerInteractor interactor;
    private final boolean manualAnalyticTracking;

    public RemoveFromFavoriteActionHandler(@NotNull FavoritesCustomActionHandlerInteractor interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.interactor = interactor;
        this.actionId = "removeFromFavorites";
        this.manualAnalyticTracking = true;
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    private final void executeAction(AtomAction.ComposerAction action, CustomActionHandler.HandlerReferences handlerRefs) {
        InterfaceC8487b h11 = this.interactor.removeFromFavorite(action, new AnalyticRefs(handlerRefs.getRefs().getTokenizedAnalytics(), handlerRefs.getVoId())).h(new i(RemoveFromFavoriteActionHandler$executeAction$actionDisposable$1.INSTANCE, 15), new b(new RemoveFromFavoriteActionHandler$executeAction$actionDisposable$2(a.f17149a), 11));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        CustomComposerActionLifecycleDisposable customComposerActionLifecycleDisposable = new CustomComposerActionLifecycleDisposable(handlerRefs.getRefs().getContainer().g(), h11);
        handlerRefs.getRefs().getContainer().g().getLifecycle().a(customComposerActionLifecycleDisposable);
        this.disposable = customComposerActionLifecycleDisposable;
    }

    private final void executeActionIfNeedIt(AtomAction.ComposerAction action, CustomActionHandler.HandlerReferences handlerRefs) {
        executeAction(action, handlerRefs);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public boolean getManualAnalyticTracking() {
        return this.manualAnalyticTracking;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            if (h.K(composerAction.getActionName())) {
                return;
            }
            this.disposable.dispose();
            executeActionIfNeedIt(composerAction, handlerRefs);
        }
    }
}
