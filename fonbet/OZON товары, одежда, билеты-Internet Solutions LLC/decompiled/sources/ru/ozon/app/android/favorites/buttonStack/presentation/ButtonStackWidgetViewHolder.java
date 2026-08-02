package ru.ozon.app.android.favorites.buttonStack.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.o;
import Sc.s;
import Vg.d;
import Wc.a;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00130\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackView;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;", "deleteWishlistViewModel", "<init>", "(Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackView;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "", "sendResultNotificationIfNeeded", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "showError", "()V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;Ll20/d;)V", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackView;", "LVg/d;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonStackWidgetViewHolder extends k<ButtonStackVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonStackView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final DeleteWishlistViewModel deleteWishlistViewModel;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.buttonStack.presentation.ButtonStackWidgetViewHolder$1", f = "ButtonStackWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.buttonStack.presentation.ButtonStackWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<DeleteWishlistViewModel.State, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = ButtonStackWidgetViewHolder.this.new AnonymousClass1(dVar);
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
                ButtonStackWidgetViewHolder.this.references.getController().e(new l.a.C1079a(0L, null, 3));
            } else if (Intrinsics.d(state, DeleteWishlistViewModel.State.Error.INSTANCE)) {
                ButtonStackWidgetViewHolder.this.references.getController().hideLoader();
                ButtonStackWidgetViewHolder.this.showError();
            } else {
                if (!(state instanceof DeleteWishlistViewModel.State.Success)) {
                    throw new o();
                }
                DeleteWishlistViewModel.State.Success success = (DeleteWishlistViewModel.State.Success) state;
                ButtonStackWidgetViewHolder.this.sendResultNotificationIfNeeded(success.getNotification(), success.getPayloads());
                ButtonStackWidgetViewHolder.this.references.getController().hideLoader();
                ButtonStackWidgetViewHolder.this.references.getNavigator().popBackStack();
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeleteWishlistViewModel.State state, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(state, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonStackWidgetViewHolder(@NotNull ButtonStackView containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull DeleteWishlistViewModel deleteWishlistViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(deleteWishlistViewModel, "deleteWishlistViewModel");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.references = references;
        this.deleteWishlistViewModel = deleteWishlistViewModel;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new ButtonStackWidgetViewHolder$actionHandler$1(this)).buildHandler();
        C2399j.C(new C2408n0(deleteWishlistViewModel.getState(), new AnonymousClass1(null)), K.a(references.getContainer().g()));
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "RESULT_REQUEST_KEY", new ButtonStackWidgetViewHolder$2$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendResultNotificationIfNeeded(NotificationModelWrapper notification, Map<String, String> payloads) {
        ComposerExtKt.sendResultToTargetFragment(this.references.getContainer(), 12513, new ButtonStackWidgetViewHolder$sendResultNotificationIfNeeded$1(notification, payloads, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        C4911f container = this.references.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ButtonStackVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler);
    }
}
