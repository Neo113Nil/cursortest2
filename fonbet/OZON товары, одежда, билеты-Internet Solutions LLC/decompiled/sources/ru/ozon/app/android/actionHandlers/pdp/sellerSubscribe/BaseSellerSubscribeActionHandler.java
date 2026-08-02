package ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.InterfaceC4008j;
import Sc.s;
import Wc.a;
import android.view.View;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.domain.actionHandlers.R$string;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.core.UniColors;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000 22\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\u00020\u000f2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001cH&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0018¨\u00063"}, d2 = {"Lru/ozon/app/android/actionHandlers/pdp/sellerSubscribe/BaseSellerSubscribeActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lxe/B0;", "observeActions", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lxe/B0;", "", "releaseStateListenerJob", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getErrorDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "sellerId", "updateEvent", "(Ll10/b;Ljava/lang/String;)V", "getErrorNotificationTitle", "()Ljava/lang/String;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "authStateListenerJob", "Lxe/B0;", "", "isAuthenticatedInitially", "Z", "errorNotificationDTO$delegate", "LSc/j;", "getErrorNotificationDTO", "errorNotificationDTO", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSellerSubscribeActionHandler extends CustomActionHandler {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 authStateListenerJob;

    @NotNull
    private final AuthStateStorage authStateStorage;

    /* renamed from: errorNotificationDTO$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorNotificationDTO;
    private final boolean isAuthenticatedInitially;

    public BaseSellerSubscribeActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull AuthStateStorage authStateStorage) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        this.actionV2Repository = actionV2Repository;
        this.authStateStorage = authStateStorage;
        this.isAuthenticatedInitially = authStateStorage.isAuthenticated();
        this.errorNotificationDTO = LazyUtilsKt.unsafeLazy(new BaseSellerSubscribeActionHandler$errorNotificationDTO$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationAtom.NotificationWithIcon getErrorDefaultNotificationDTO() {
        return new NotificationAtom.NotificationWithIcon("ic_m_book_not_available_filled", UniColors.GRAPHIC_NEGATIVE_PRIMARY.getToken(), UniColors.BG_NEGATIVE_SECONDARY_INVERTED.getToken(), 3, getErrorNotificationTitle(), StringProvider.getString(R$string.seller_try_again_android), NotificationAtom.Position.POSITION_ABOVE_TABBAR, null, Boolean.FALSE, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationAtom.NotificationWithIcon getErrorNotificationDTO() {
        return (NotificationAtom.NotificationWithIcon) this.errorNotificationDTO.getValue();
    }

    private final B0 observeActions(AtomAction action, CustomActionHandler.HandlerReferences handlerRefs) {
        if (this.isAuthenticatedInitially) {
            return null;
        }
        final InterfaceC2395h a11 = n.a(this.authStateStorage.getAuthState());
        return C2399j.C(new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$observeActions$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$observeActions$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$observeActions$$inlined$filter$1$2", f = "BaseSellerSubscribeActionHandler.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$observeActions$$inlined$filter$1$2$1, reason: invalid class name */
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
                                Boolean bool = (Boolean) obj;
                                Intrinsics.f(bool);
                                if (bool.booleanValue()) {
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
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new BaseSellerSubscribeActionHandler$observeActions$2(this, action, handlerRefs, null)), K.a(handlerRefs.getRefs().getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseStateListenerJob() {
        B0 b02;
        B0 b03 = this.authStateListenerJob;
        if (b03 != null && b03.isActive() && (b02 = this.authStateListenerJob) != null) {
            b02.j(null);
        }
        this.authStateListenerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationModelWrapper notification, CustomActionHandler.HandlerReferences handlerRefs) {
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, handlerRefs.getRefs().getContainer().g(), this.actionHandler).show();
    }

    @NotNull
    public abstract String getErrorNotificationTitle();

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        releaseStateListenerJob();
        if (!this.authStateStorage.isAuthenticated()) {
            this.authStateListenerJob = observeActions(action, handlerRefs);
            ComposerNavigator navigator = handlerRefs.getRefs().getNavigator();
            String uri = LinkGenerator.INSTANCE.auth().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
            return;
        }
        if (action instanceof AtomAction.ComposerAction) {
            if (this.actionHandler == null) {
                this.actionHandler = new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new BaseSellerSubscribeActionHandler$processAction$1(handlerRefs), new BaseSellerSubscribeActionHandler$processAction$2(handlerRefs)).buildHandler();
            }
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            Map<String, String> params = composerAction.getParams();
            if (params == null || (str = params.get("sellerId")) == null) {
                str = "";
            }
            String str3 = str;
            Map<String, String> params2 = composerAction.getParams();
            C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new BaseSellerSubscribeActionHandler$processAction$3(this, handlerRefs, str3, action, (params2 == null || (str2 = params2.get("isNotNotification")) == null) ? null : h.t0(str2), null), 3);
        }
    }

    public abstract void updateEvent(@NotNull InterfaceC7851b controller, @NotNull String sellerId);
}
