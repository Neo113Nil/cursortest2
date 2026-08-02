package ru.ozon.app.android.favorites.buttonStack.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Sc.s;
import Vg.d;
import Wc.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/presentation/OverlayStickyBannerViewHolder;", "Ld20/a;", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Ll10/b;", "controller", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;", "deleteWishlistViewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Ld20/e;LVg/d;Ll10/i;Ll10/b;Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "", "sendResultNotificationIfNeeded", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "showError", "()V", "item", "bind", "(Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;)V", "LVg/d;", "Ll10/i;", "Ll10/b;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OverlayStickyBannerViewHolder extends AbstractC6064a<ButtonStackVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final DeleteWishlistViewModel deleteWishlistViewModel;

    @NotNull
    private final ComposerNavigator navigator;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewHolder$1", f = "OverlayStickyBannerViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<DeleteWishlistViewModel.State, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = OverlayStickyBannerViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            DeleteWishlistViewModel.State state = (DeleteWishlistViewModel.State) this.L$0;
            if (Intrinsics.d(state, DeleteWishlistViewModel.State.Loading.INSTANCE)) {
                OverlayStickyBannerViewHolder.this.controller.e(new l.a.C1079a(0L, null, 3));
            } else if (Intrinsics.d(state, DeleteWishlistViewModel.State.Error.INSTANCE)) {
                OverlayStickyBannerViewHolder.this.controller.hideLoader();
                OverlayStickyBannerViewHolder.this.showError();
            } else {
                if (!(state instanceof DeleteWishlistViewModel.State.Success)) {
                    throw new o();
                }
                DeleteWishlistViewModel.State.Success success = (DeleteWishlistViewModel.State.Success) state;
                OverlayStickyBannerViewHolder.this.sendResultNotificationIfNeeded(success.getNotification(), success.getPayloads());
                OverlayStickyBannerViewHolder.this.controller.hideLoader();
                OverlayStickyBannerViewHolder.this.navigator.popBackStack();
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeleteWishlistViewModel.State state, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(state, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayStickyBannerViewHolder(@NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull InterfaceC7851b controller, @NotNull DeleteWishlistViewModel deleteWishlistViewModel, @NotNull ComposerNavigator navigator) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(deleteWishlistViewModel, "deleteWishlistViewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.container = container;
        this.controller = controller;
        this.deleteWishlistViewModel = deleteWishlistViewModel;
        this.navigator = navigator;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new OverlayStickyBannerViewHolder$actionHandler$1(this)).buildHandler();
        C2399j.C(new C2408n0(deleteWishlistViewModel.getState(), new AnonymousClass1(null)), K.a(container.Q().g()));
        ComponentCallbacksC5392m c11 = container.Q().c();
        if (c11 != null) {
            C5402x.b(c11, "RESULT_REQUEST_KEY", new OverlayStickyBannerViewHolder$2$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendResultNotificationIfNeeded(NotificationModelWrapper notification, Map<String, String> payloads) {
        ComposerExtKt.sendResultToTargetFragment(this.container.Q(), 12513, new OverlayStickyBannerViewHolder$sendResultNotificationIfNeeded$1(notification, payloads, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, this.container.Z(), null, null, null, null, null, this.container.Q().g(), 62, null).show();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonStackVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.favorites.buttonStack.presentation.ButtonStackViewV2");
        ((ButtonStackViewV2) view).bind(item, this.actionHandler);
    }
}
