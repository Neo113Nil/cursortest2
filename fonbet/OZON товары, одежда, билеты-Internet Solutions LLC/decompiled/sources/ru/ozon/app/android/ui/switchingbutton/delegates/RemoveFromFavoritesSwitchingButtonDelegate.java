package ru.ozon.app.android.ui.switchingbutton.delegates;

import AF.d;
import Fn.C3055d;
import Lm0.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.utils.AnalyticRefs;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;
import ru.ozon.app.android.utils.CustomComposerActionLifecycleDisposable;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonActionDelegate;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "interactor", "<init>", "(Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "switchingButtonAction", "", "executeActionIfNeedIt", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)V", "executeAction", "", "canHandle", "(Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)Z", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "", "", "actionIds", "Ljava/util/List;", "getActionIds", "()Ljava/util/List;", "Lnc/b;", "disposable", "Lnc/b;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoveFromFavoritesSwitchingButtonDelegate extends SwitchingButtonActionDelegate {

    @NotNull
    private final List<String> actionIds;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final FavoritesCustomActionHandlerInteractor interactor;

    public RemoveFromFavoritesSwitchingButtonDelegate(@NotNull FavoritesCustomActionHandlerInteractor interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.interactor = interactor;
        this.actionIds = C7714v.a0("removeFromFavorites");
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    private final void executeAction(AtomAction.ComposerAction action, SwitchingButtonAction switchingButtonAction) {
        InterfaceC8487b h11 = this.interactor.removeFromFavorite(action, new AnalyticRefs(getRefs().getTokenizedAnalytics(), Long.valueOf(switchingButtonAction.getVoId()))).h(new C3055d(RemoveFromFavoritesSwitchingButtonDelegate$executeAction$actionDisposable$1.INSTANCE, 13), new d(new RemoveFromFavoritesSwitchingButtonDelegate$executeAction$actionDisposable$2(a.f17149a), 12));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        CustomComposerActionLifecycleDisposable customComposerActionLifecycleDisposable = new CustomComposerActionLifecycleDisposable(getRefs().getContainer().g(), h11);
        getRefs().getContainer().g().getLifecycle().a(customComposerActionLifecycleDisposable);
        this.disposable = customComposerActionLifecycleDisposable;
    }

    private final void executeActionIfNeedIt(AtomAction.ComposerAction action, SwitchingButtonAction switchingButtonAction) {
        executeAction(action, switchingButtonAction);
    }

    @Override // ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonActionDelegate
    public boolean canHandle(@NotNull SwitchingButtonAction switchingButtonAction) {
        Intrinsics.checkNotNullParameter(switchingButtonAction, "switchingButtonAction");
        if (!(switchingButtonAction.getAction() instanceof AtomAction.ComposerAction) || !C7714v.A(getActionIds(), ((AtomAction.ComposerAction) switchingButtonAction.getAction()).getId())) {
            return false;
        }
        this.disposable.dispose();
        executeActionIfNeedIt((AtomAction.ComposerAction) switchingButtonAction.getAction(), switchingButtonAction);
        return true;
    }

    @NotNull
    protected List<String> getActionIds() {
        return this.actionIds;
    }
}
