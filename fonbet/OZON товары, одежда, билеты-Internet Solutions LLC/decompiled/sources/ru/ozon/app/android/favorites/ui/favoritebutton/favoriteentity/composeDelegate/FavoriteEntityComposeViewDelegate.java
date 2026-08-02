package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate;

import Ae.w0;
import He.b;
import Vg.e;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.databinding.FavoriteButtonBinding;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.models.FavoriteEntityVOKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.models.RestrictionModelKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.InterfaceC10756x;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001e\u001a\u00020\r*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u000fJ!\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeViewDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegate;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/ComposeWidgetInfo;", "widgetInfo", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "<init>", "(Landroid/view/View;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/ComposeWidgetInfo;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;LVg/e$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "revertAndReBindViewState", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "entity", "onFavoriteUpdateClicker", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;)V", "initCollectors", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "model", "showRestriction", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindFavoriteOrGone", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lkotlin/jvm/functions/Function1;)V", "buildActionHandler", "()Lkotlin/jvm/functions/Function1;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;)V", "detachFavButtonView", "bindFavoriteEntityButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/ComposeWidgetInfo;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "LVg/e$a;", "Lru/ozon/app/android/favorites/ui/databinding/FavoriteButtonBinding;", "binding", "Lru/ozon/app/android/favorites/ui/databinding/FavoriteButtonBinding;", "currentFavoriteEntity", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "Lkotlin/jvm/functions/Function1;", "favButton", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "Lxe/x;", "job", "Lxe/x;", "Lxe/M;", "scope", "Lxe/M;", "LAe/w0;", "clickFlow", "LAe/w0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteEntityComposeViewDelegate implements DefaultLifecycleObserver, FavoriteEntityComposeDelegate {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final e.a actionHandlerBuilder;

    @NotNull
    private final FavoriteButtonBinding binding;

    @NotNull
    private final w0<FavoriteEntity> clickFlow;
    private FavoriteEntity currentFavoriteEntity;
    private FavoriteButtonView favButton;

    @NotNull
    private final FavoriteEntityInteractor favoriteEntityInteractor;

    @NotNull
    private final InterfaceC10756x job;

    @NotNull
    private final M scope;

    @NotNull
    private final ComposeWidgetInfo widgetInfo;

    public /* synthetic */ FavoriteEntityComposeViewDelegate(View view, ComposeWidgetInfo composeWidgetInfo, FavoriteEntityInteractor favoriteEntityInteractor, e.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, composeWidgetInfo, favoriteEntityInteractor, aVar);
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

    private final Function1<AtomAction, Unit> buildActionHandler() {
        return WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(this.actionHandlerBuilder, new FavoriteEntityComposeViewDelegate$buildActionHandler$1(this)));
    }

    private final void initCollectors() {
        M m11 = this.scope;
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        C10727i.c(m11, bVar, null, new FavoriteEntityComposeViewDelegate$initCollectors$1(this, null), 2);
        C10727i.c(this.scope, bVar, null, new FavoriteEntityComposeViewDelegate$initCollectors$2(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFavoriteUpdateClicker(FavoriteEntity entity) {
        M m11 = this.scope;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(m11, b.f10879b, null, new FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1(this, entity, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revertAndReBindViewState() {
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
        RestrictionModelKt.show(model, this.widgetInfo.getOwnerContainer());
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegate
    public void attachFavButtonView(@NotNull FavoriteButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favButton = button;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegate
    public void bindFavoriteEntityButton(@NotNull FavoriteButtonView button, FavoriteEntity entity) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.currentFavoriteEntity = entity;
        this.favButton = button;
        bindFavoriteOrGone(button, entity, this.actionHandler);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegate
    public void detachFavButtonView() {
        this.favButton = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.job.j(null);
        this.widgetInfo.getLifecycleOwner().getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        initCollectors();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        E0.e(this.job);
    }

    private FavoriteEntityComposeViewDelegate(View containerView, ComposeWidgetInfo widgetInfo, FavoriteEntityInteractor favoriteEntityInteractor, e.a actionHandlerBuilder) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        Intrinsics.checkNotNullParameter(actionHandlerBuilder, "actionHandlerBuilder");
        this.widgetInfo = widgetInfo;
        this.favoriteEntityInteractor = favoriteEntityInteractor;
        this.actionHandlerBuilder = actionHandlerBuilder;
        FavoriteButtonBinding bind = FavoriteButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = buildActionHandler();
        InterfaceC10756x b11 = X0.b();
        this.job = b11;
        this.scope = N.g(K.a(widgetInfo.getLifecycleOwner()), b11);
        this.clickFlow = Ae.E0.b(0, 1, null, 5);
        widgetInfo.getLifecycleOwner().getLifecycle().a(this);
    }
}
