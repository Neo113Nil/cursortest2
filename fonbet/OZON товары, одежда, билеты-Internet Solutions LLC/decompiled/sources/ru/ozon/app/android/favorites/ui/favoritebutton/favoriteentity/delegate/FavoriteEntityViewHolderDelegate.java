package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate;

import AJ.a;
import AJ.d;
import Bc.h;
import DJ.c;
import DJ.e;
import Hs.b;
import Nc.C3669c;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.MapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.databinding.FavoriteButtonBinding;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.models.FavoriteEntityVOKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.models.RestrictionModelKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001c\u001a\u00020\u000b*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\rJ5\u0010%\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010$\u001a\u000e\u0012\u0002\b\u00030\"j\u0006\u0012\u0002\b\u0003`#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00108R\"\u0010;\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010\u000e0\u000e098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityViewHolderDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityDelegate;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "revertAndreBindViewState", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "entity", "onFavoriteUpdateClicker", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;)V", "initSubscribers", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "model", "showRestriction", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindFavoriteOrGone", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lkotlin/jvm/functions/Function1;)V", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;)V", "detachFavButtonView", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bindFavoriteEntityButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lru/ozon/composer/ui/widget/k;)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Landroid/view/View;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/databinding/FavoriteButtonBinding;", "binding", "Lru/ozon/app/android/favorites/ui/databinding/FavoriteButtonBinding;", "Lnc/a;", "disposables", "Lnc/a;", "currentFavoriteEntity", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "Lkotlin/jvm/functions/Function1;", "LNc/c;", "kotlin.jvm.PlatformType", "clickSubject", "LNc/c;", "favButton", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "", "widgetId", "Ljava/lang/Long;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteEntityViewHolderDelegate implements DefaultLifecycleObserver, FavoriteEntityDelegate {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final FavoriteButtonBinding binding;

    @NotNull
    private final C3669c<FavoriteEntity> clickSubject;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final View containerView;
    private FavoriteEntity currentFavoriteEntity;

    @NotNull
    private final C8486a disposables;
    private FavoriteButtonView favButton;

    @NotNull
    private final FavoriteEntityInteractor favoriteEntityInteractor;
    private Long widgetId;

    public FavoriteEntityViewHolderDelegate(@NotNull View containerView, @NotNull FavoriteEntityInteractor favoriteEntityInteractor, @NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.containerView = containerView;
        this.favoriteEntityInteractor = favoriteEntityInteractor;
        this.composerReferences = composerReferences;
        FavoriteButtonBinding bind = FavoriteButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.disposables = new C8486a();
        C3669c<FavoriteEntity> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.clickSubject = d11;
        composerReferences.getContainer().f().getLifecycle().a(this);
    }

    private final void bindFavoriteOrGone(FavoriteButtonView favoriteButtonView, FavoriteEntity favoriteEntity, Function1<? super AtomAction, Unit> function1) {
        FavoriteEntity clearTrackingInfo;
        if (favoriteEntity == null || (clearTrackingInfo = FavoriteEntityKt.clearTrackingInfo(favoriteEntity)) == null) {
            SmallIconButtonView favIcon = this.binding.favIcon;
            Intrinsics.checkNotNullExpressionValue(favIcon, "favIcon");
            ViewExtKt.gone(favIcon);
        } else {
            ViewExtKt.show(favoriteButtonView);
            SmallIconButtonView favIcon2 = this.binding.favIcon;
            Intrinsics.checkNotNullExpressionValue(favIcon2, "favIcon");
            WrappedIconButtonHolderKt.bind(favIcon2, FavoriteEntityVOKt.toVO(clearTrackingInfo).getButton(), function1);
            this.binding.favIcon.setPadding(0, 0, 0, 0);
        }
    }

    private final void initSubscribers() {
        C8486a c8486a = this.disposables;
        InterfaceC8487b subscribe = this.favoriteEntityInteractor.subscribeOnFavoriteUpdate().filter(new a(new FavoriteEntityViewHolderDelegate$initSubscribers$1(this), 8)).observeOn(C8125a.a()).subscribe(new c(new FavoriteEntityViewHolderDelegate$initSubscribers$2(this), 11), new AJ.c(FavoriteEntityViewHolderDelegate$initSubscribers$3.INSTANCE, 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
        C8486a c8486a2 = this.disposables;
        InterfaceC8487b subscribe2 = this.clickSubject.debounce(500L, TimeUnit.MILLISECONDS).observeOn(C8125a.a()).subscribe(new d(new FavoriteEntityViewHolderDelegate$initSubscribers$4(this), 9), new e(FavoriteEntityViewHolderDelegate$initSubscribers$5.INSTANCE, 12));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(c8486a2, subscribe2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initSubscribers$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFavoriteUpdateClicker(FavoriteEntity entity) {
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new h(this.favoriteEntityInteractor.updateFavoriteEntity(MapperKt.toShort(entity)).g(C8125a.a()), new b(new FavoriteEntityViewHolderDelegate$onFavoriteUpdateClicker$1(this), 13)).h(new Hs.c(new FavoriteEntityViewHolderDelegate$onFavoriteUpdateClicker$2(entity, this), 15), new Hs.d(new FavoriteEntityViewHolderDelegate$onFavoriteUpdateClicker$3(this), 13));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revertAndreBindViewState() {
        FavoriteEntity favoriteEntity;
        FavoriteEntity favoriteEntity2 = this.currentFavoriteEntity;
        if (favoriteEntity2 != null) {
            favoriteEntity = FavoriteEntity.copy$default(favoriteEntity2, null, 0L, !favoriteEntity2.isFavorite(), null, null, 27, null);
            FavoriteButtonView favoriteButtonView = this.favButton;
            if (favoriteButtonView != null) {
                bindFavoriteOrGone(favoriteButtonView, favoriteEntity, this.actionHandler);
            }
        } else {
            favoriteEntity = null;
        }
        this.currentFavoriteEntity = favoriteEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRestriction(RestrictionModel model) {
        RestrictionModelKt.show(model, this.composerReferences);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate
    public void attachFavButtonView(@NotNull FavoriteButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favButton = button;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l20.c] */
    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate
    public void bindFavoriteEntityButton(@NotNull FavoriteButtonView button, FavoriteEntity entity, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.currentFavoriteEntity = entity;
        this.favButton = button;
        ?? boundedData = holder.getBoundedData();
        this.widgetId = boundedData != 0 ? Long.valueOf(boundedData.getId()) : null;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(this.composerReferences, holder).onComposerAction(new FavoriteEntityViewHolderDelegate$bindFavoriteEntityButton$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        bindFavoriteOrGone(button, entity, buildHandler);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityDelegate
    public void detachFavButtonView() {
        this.favButton = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposables.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        initSubscribers();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposables.d();
    }
}
