package ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate;

import DM.a;
import Hs.d;
import Hs.e;
import android.view.View;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonActionDelegateKt;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonState;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00028\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0012H&¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010&\u001a\u000e\u0012\u0002\b\u00030$j\u0006\u0012\u0002\b\u0003`%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\"\u0010#\u001a\u00020\"8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b#\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010&\u001a\u000e\u0012\u0002\b\u00030$j\u0006\u0012\u0002\b\u0003`%8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b&\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R&\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f0?j\u0002`@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010\u001d\u001a\u0004\u0018\u00018\u00008$@$X¤\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010+¨\u0006S"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/BaseSwitchingButtonDelegate;", "Landroid/view/View;", "V", "", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "stateStorage", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;", "favActionDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;", "unFavActionDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;", "composerActionWithRedirectDelegate", "<init>", "(Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "preProcess", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "", "id", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;", "toSwitchingButtonState", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;J)Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "buttonAtom", "atomView", "forceChange", "", "bind", "(Lru/ozon/app/android/atoms/data/button/SwitchingButton;Landroid/view/View;Z)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "view", "attach", "(Landroid/view/View;)V", "detach", "()V", "event", "updateAndRebindIfNeedIt", "(Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;)V", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "setRefs", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/composer/ui/widget/k;", "getVh", "()Lru/ozon/composer/ui/widget/k;", "setVh", "(Lru/ozon/composer/ui/widget/k;)V", "Lkotlin/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "atomModel", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getAtomModel", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "setAtomModel", "(Lru/ozon/app/android/atoms/data/button/SwitchingButton;)V", "Lnc/a;", "disposables", "Lnc/a;", "", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonActionDelegate;", "actionDelegates", "Ljava/util/Set;", "getAtomView", "()Landroid/view/View;", "setAtomView", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseSwitchingButtonDelegate<V extends View> {

    @NotNull
    private final Set<SwitchingButtonActionDelegate> actionDelegates;
    private Function1<? super AtomAction, Unit> actionHandler;
    private SwitchingButton atomModel;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FavoriteManager favoriteManager;
    protected ComposerReferences refs;

    @NotNull
    private final SwitchingButtonStateStorage stateStorage;
    protected k<?> vh;

    public BaseSwitchingButtonDelegate(@NotNull SwitchingButtonStateStorage stateStorage, @NotNull FavoriteManager favoriteManager, @NotNull SwitchingButtonAddToFavoriteActionDelegate favActionDelegate, @NotNull RemoveFromFavoritesSwitchingButtonDelegate unFavActionDelegate, @NotNull SwitchingButtonComposerActionWithRedirectDelegate composerActionWithRedirectDelegate) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(favActionDelegate, "favActionDelegate");
        Intrinsics.checkNotNullParameter(unFavActionDelegate, "unFavActionDelegate");
        Intrinsics.checkNotNullParameter(composerActionWithRedirectDelegate, "composerActionWithRedirectDelegate");
        this.stateStorage = stateStorage;
        this.favoriteManager = favoriteManager;
        this.disposables = new C8486a();
        SwitchingButtonActionDelegate[] elements = {favActionDelegate, unFavActionDelegate, composerActionWithRedirectDelegate};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.actionDelegates = C7705l.j0(elements);
    }

    public static /* synthetic */ void bind$default(BaseSwitchingButtonDelegate baseSwitchingButtonDelegate, SwitchingButton switchingButton, View view, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        baseSwitchingButtonDelegate.bind(switchingButton, view, z11);
    }

    private final boolean preProcess(AtomAction action) {
        c d11;
        l viewItem = getVh().getViewItem();
        if (viewItem == null || (d11 = viewItem.d()) == null) {
            return false;
        }
        long id2 = d11.getId();
        SwitchingButton switchingButton = this.atomModel;
        if (switchingButton == null) {
            return false;
        }
        return SwitchingButtonActionDelegateKt.canHandle(this.actionDelegates, new SwitchingButtonAction(id2, switchingButton, action, getVh().getTrackingData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwitchingButtonState toSwitchingButtonState(FavoriteEvent favoriteEvent, long j11) {
        return favoriteEvent instanceof FavoriteAdd ? new SwitchingButtonState.ActiveButton(String.valueOf(j11)) : new SwitchingButtonState.InActiveButton(String.valueOf(j11));
    }

    public void attach(@NotNull V view) {
        String id2;
        Intrinsics.checkNotNullParameter(view, "view");
        setAtomView(view);
        SwitchingButton switchingButton = this.atomModel;
        if (switchingButton == null || (id2 = switchingButton.getId()) == null) {
            return;
        }
        Long y02 = h.y0(id2);
        if (y02 != null) {
            long longValue = y02.longValue();
            C8486a c8486a = this.disposables;
            InterfaceC8487b subscribe = this.favoriteManager.onFavoriteChange(longValue).observeOn(C8125a.a()).subscribe(new Hs.c(new BaseSwitchingButtonDelegate$attach$1$1$1(this, longValue), 10), new d(BaseSwitchingButtonDelegate$attach$1$1$2.INSTANCE, 9));
            Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
            RxExtKt.plusAssign(c8486a, subscribe);
        }
        C8486a c8486a2 = this.disposables;
        InterfaceC8487b subscribe2 = this.stateStorage.observeState(id2).distinctUntilChanged().subscribe(new e(new BaseSwitchingButtonDelegate$attach$1$2(this), 7), new a(BaseSwitchingButtonDelegate$attach$1$3.INSTANCE, 7));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(c8486a2, subscribe2);
    }

    public abstract void bind(SwitchingButton buttonAtom, @NotNull V atomView, boolean forceChange);

    public void detach() {
        setAtomView(null);
        this.disposables.d();
    }

    protected abstract V getAtomView();

    @NotNull
    protected final k<?> getVh() {
        k<?> kVar = this.vh;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.n("vh");
        throw null;
    }

    protected final void handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (preProcess(action)) {
            return;
        }
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        } else {
            Intrinsics.n("actionHandler");
            throw null;
        }
    }

    public void init(@NotNull ComposerReferences refs, @NotNull k<?> vh2) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        setRefs(refs);
        setVh(vh2);
        Iterator<T> it = this.actionDelegates.iterator();
        while (it.hasNext()) {
            ((SwitchingButtonActionDelegate) it.next()).init(refs, vh2);
        }
        this.actionHandler = new ActionHandler.Builder(refs, vh2).buildHandler();
    }

    protected final void setAtomModel(SwitchingButton switchingButton) {
        this.atomModel = switchingButton;
    }

    protected abstract void setAtomView(V v11);

    protected final void setRefs(@NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "<set-?>");
        this.refs = composerReferences;
    }

    protected final void setVh(@NotNull k<?> kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.vh = kVar;
    }

    public void updateAndRebindIfNeedIt(@NotNull SwitchingButtonState event) {
        V atomView;
        Intrinsics.checkNotNullParameter(event, "event");
        SwitchingButton switchingButton = this.atomModel;
        if (switchingButton == null || (event instanceof SwitchingButtonState.Empty) || (atomView = getAtomView()) == null) {
            return;
        }
        SwitchingButton copy$default = SwitchingButton.copy$default(switchingButton, null, event instanceof SwitchingButtonState.ActiveButton, null, null, null, null, 61, null);
        this.atomModel = copy$default;
        bind(copy$default, atomView, true);
    }
}
