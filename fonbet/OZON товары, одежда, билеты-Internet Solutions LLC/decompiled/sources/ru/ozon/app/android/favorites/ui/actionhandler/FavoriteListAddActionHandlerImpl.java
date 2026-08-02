package ru.ozon.app.android.favorites.ui.actionhandler;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.delivery.customActionsHandlers.favoritesList.FavoriteListAddActionHandler;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemAdd;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemUpdate;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\n2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteListAddActionHandlerImpl;", "Lru/ozon/app/android/delivery/customActionsHandlers/favoritesList/FavoriteListAddActionHandler;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "wishlistItemsInteractor", "<init>", "(Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;)V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;", "wishlistItemAdd", "", "handleUpdate", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "showNotificationAndDismissIfNeeded", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showError", "(La00/f;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/B0;", "job", "Lxe/B0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteListAddActionHandlerImpl extends FavoriteListAddActionHandler {

    @NotNull
    private final String actionId;
    private B0 job;

    @NotNull
    private final WishlistItemsInteractor wishlistItemsInteractor;

    public FavoriteListAddActionHandlerImpl(@NotNull WishlistItemsInteractor wishlistItemsInteractor) {
        Intrinsics.checkNotNullParameter(wishlistItemsInteractor, "wishlistItemsInteractor");
        this.wishlistItemsInteractor = wishlistItemsInteractor;
        this.actionId = "favoriteListAdd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUpdate(CustomActionHandler.HandlerReferences handlerRefs, WishlistItemAdd wishlistItemAdd) {
        if (wishlistItemAdd instanceof WishlistItemAdd.Success) {
            WishlistItemAdd.Success success = (WishlistItemAdd.Success) wishlistItemAdd;
            showNotificationAndDismissIfNeeded(handlerRefs, success.getNotification(), success.getPayloads());
        } else {
            if (!(wishlistItemAdd instanceof WishlistItemAdd.Failure)) {
                throw new o();
            }
            showError(handlerRefs.getRefs().getContainer());
        }
    }

    private final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    private final void showNotificationAndDismissIfNeeded(CustomActionHandler.HandlerReferences handlerRefs, NotificationModelWrapper notification, Map<String, String> payloads) {
        C4911f container = handlerRefs.getRefs().getContainer();
        ComposerExtKt.sendResultToTargetFragment(container, 12513, new FavoriteListAddActionHandlerImpl$showNotificationAndDismissIfNeeded$1(notification, payloads, handlerRefs));
        ComponentCallbacksC5392m c11 = container.c();
        if ((c11 != null ? c11.getParentFragment() : null) instanceof BottomSheetComposerFragment) {
            handlerRefs.getRefs().getNavigator().popBackStack();
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.ComposerAction composerAction;
        Long extractSkuFromFavoriteAction;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.ComposerAction) && (extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction((composerAction = (AtomAction.ComposerAction) action))) != null) {
            final long longValue = extractSkuFromFavoriteAction.longValue();
            Long extractListIdFromFavoriteAction = ActionHandlersUtilsKt.extractListIdFromFavoriteAction(composerAction);
            if (extractListIdFromFavoriteAction != null) {
                final long longValue2 = extractListIdFromFavoriteAction.longValue();
                C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new FavoriteListAddActionHandlerImpl$processAction$1(this, longValue, longValue2, action, handlerRefs, null), 3);
                B0 b02 = this.job;
                if (b02 != null) {
                    b02.j(null);
                }
                final InterfaceC2395h<WishlistItemUpdate> wishlistItemUpdates = this.wishlistItemsInteractor.getWishlistItemUpdates();
                final InterfaceC2395h<Object> interfaceC2395h = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filterIsInstance$1

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filterIsInstance$1$2", f = "FavoriteListAddActionHandlerImpl.kt", l = {50}, m = "emit")
                        /* renamed from: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends c {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= LinearLayoutManager.INVALID_OFFSET;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                            this.$this_unsafeFlow = interfaceC2397i;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                        @Override // Ae.InterfaceC2397i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, d dVar) {
                            AnonymousClass1 anonymousClass1;
                            int i11;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i12 = anonymousClass1.label;
                                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                    anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                    Object obj2 = anonymousClass1.result;
                                    a aVar = a.COROUTINE_SUSPENDED;
                                    i11 = anonymousClass1.label;
                                    if (i11 != 0) {
                                        s.b(obj2);
                                        InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                        if (obj instanceof WishlistItemAdd) {
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                                return aVar;
                                            }
                                        }
                                    } else {
                                        if (i11 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        s.b(obj2);
                                    }
                                    return Unit.f71690a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(dVar);
                            Object obj22 = anonymousClass1.result;
                            a aVar2 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                            }
                            return Unit.f71690a;
                        }
                    }

                    @Override // Ae.InterfaceC2395h
                    public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                        Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                    }
                };
                this.job = C2399j.C(new C2408n0(new InterfaceC2395h<WishlistItemAdd>() { // from class: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ long $listId$inlined;
                        final /* synthetic */ long $sku$inlined;
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filter$1$2", f = "FavoriteListAddActionHandlerImpl.kt", l = {50}, m = "emit")
                        /* renamed from: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends c {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= LinearLayoutManager.INVALID_OFFSET;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2397i interfaceC2397i, long j11, long j12) {
                            this.$this_unsafeFlow = interfaceC2397i;
                            this.$sku$inlined = j11;
                            this.$listId$inlined = j12;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                        @Override // Ae.InterfaceC2397i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, d dVar) {
                            AnonymousClass1 anonymousClass1;
                            int i11;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i12 = anonymousClass1.label;
                                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                    anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                    Object obj2 = anonymousClass1.result;
                                    a aVar = a.COROUTINE_SUSPENDED;
                                    i11 = anonymousClass1.label;
                                    if (i11 != 0) {
                                        s.b(obj2);
                                        InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                        WishlistItemAdd wishlistItemAdd = (WishlistItemAdd) obj;
                                        Long sku = wishlistItemAdd.getSku();
                                        long j11 = this.$sku$inlined;
                                        if (sku != null && sku.longValue() == j11 && wishlistItemAdd.getId() == this.$listId$inlined) {
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                                return aVar;
                                            }
                                        }
                                    } else {
                                        if (i11 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        s.b(obj2);
                                    }
                                    return Unit.f71690a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(dVar);
                            Object obj22 = anonymousClass1.result;
                            a aVar2 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                            }
                            return Unit.f71690a;
                        }
                    }

                    @Override // Ae.InterfaceC2395h
                    public Object collect(InterfaceC2397i<? super WishlistItemAdd> interfaceC2397i, d dVar) {
                        Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, longValue, longValue2), dVar);
                        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                    }
                }, new FavoriteListAddActionHandlerImpl$processAction$3(this, handlerRefs, null)), K.a(handlerRefs.getRefs().getContainer().g()));
            }
        }
    }
}
