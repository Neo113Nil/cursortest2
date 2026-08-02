package ru.ozon.uni.android.notificationbar;

import Gk0.a;
import Gk0.c;
import Sc.o;
import Xc.b;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;
import ru.ozon.uni.android.atom.notification.view.deprecated.NotificationView;
import ru.ozon.uni.android.atom.notification.view.deprecated.NotificationWithIconView;
import ru.ozon.uni.android.notificationbar.handler.DismissibleActionHandler;
import ru.ozon.uni.android.notificationbar.view.NotificationBarContainerView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.v3.holders.notification.NotificationHolderKt;
import ru.ozon.uni.atoms.v3.holders.notification.deprecated.NotificationWithIconHolderKt;
import ru.ozon.uni.atoms.v3.holders.notification.deprecated.NotificationWithoutIconHolderKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0002IL\b\u0007\u0018\u0000 V2\u00020\u0001:\u0004VWXYBI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b#\u0010!J\u000f\u0010&\u001a\u00020\u000eH\u0000¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0013J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010!J\u001d\u0010,\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*H\u0002¢\u0006\u0004\b.\u0010-J%\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0002052\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010AR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00170O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010U\u001a\u00020R*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBar;", "", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;", "containerView", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "model", "", "duration", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "defaultActionHandler", "<init>", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/lang/Long;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "show", "()V", "dismiss", "turnOffDismissOnAction", "()Lru/ozon/uni/android/notificationbar/NotificationBar;", "Lru/ozon/uni/android/notificationbar/NotificationBar$Callback;", "callback", "addCallback", "(Lru/ozon/uni/android/notificationbar/NotificationBar$Callback;)V", "removeCallback", "requestShow$uni_release", "requestShow", "Lru/ozon/uni/android/notificationbar/NotificationBar$DismissReason;", "reason", "requestDismiss$uni_release", "(Lru/ozon/uni/android/notificationbar/NotificationBar$DismissReason;)V", "requestDismiss", "hideView$uni_release", "hideView", "showView$uni_release", "showView", "dispatchDismiss", "onViewShown", "onViewHidden", "Lkotlin/Function0;", "onAnimationEnd", "animateSlideIn", "(Lkotlin/jvm/functions/Function0;)V", "animateSlideOut", "Lru/ozon/uni/android/notificationbar/NotificationBar$Direction;", "direction", "animateSlideOutHorizontal", "(Lru/ozon/uni/android/notificationbar/NotificationBar$Direction;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "notificationView", "", "getOffScreenTranslationY", "(Landroid/view/View;)F", "getOffScreenTranslationX", "(Lru/ozon/uni/android/notificationbar/NotificationBar$Direction;)F", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/lang/Long;", "getDuration$uni_release", "()Ljava/lang/Long;", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function1;", "Landroid/view/animation/DecelerateInterpolator;", "interpolator", "Landroid/view/animation/DecelerateInterpolator;", "Lru/ozon/uni/android/notificationbar/handler/DismissibleActionHandler;", "dismissibleActionHandler", "Lru/ozon/uni/android/notificationbar/handler/DismissibleActionHandler;", "actionHandler", "ru/ozon/uni/android/notificationbar/NotificationBar$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/uni/android/notificationbar/NotificationBar$lifecycleObserver$1;", "ru/ozon/uni/android/notificationbar/NotificationBar$onAttachStateChangeListener$1", "onAttachStateChangeListener", "Lru/ozon/uni/android/notificationbar/NotificationBar$onAttachStateChangeListener$1;", "", "callbacks", "Ljava/util/List;", "", "getNotificationViewHeight", "(Landroid/view/View;)I", "notificationViewHeight", "Companion", "DismissReason", "Callback", "Direction", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBar {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final Long INDEFINITE_DURATION_SEC = null;

    @NotNull
    private static NotificationConfig config;

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private List<Callback> callbacks;

    @NotNull
    private final NotificationBarContainerView containerView;
    private final Function1<AtomAction, Unit> defaultActionHandler;

    @NotNull
    private final DismissibleActionHandler dismissibleActionHandler;
    private final Long duration;

    @NotNull
    private final DecelerateInterpolator interpolator;

    @NotNull
    private final NotificationLayoutManager layoutManager;

    @NotNull
    private final NotificationBar$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final NotificationModelWrapper model;

    @NotNull
    private final NotificationBar$onAttachStateChangeListener$1 onAttachStateChangeListener;
    public static final int $stable = 8;

    @NotNull
    private static final Direction SLIDE_IN_DIRECTION = Direction.DOWN;

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper(), new a());

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBar$Callback;", "", "onShown", "", "notificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "onDismissed", "reason", "Lru/ozon/uni/android/notificationbar/NotificationBar$DismissReason;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Callback {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onDismissed(@NotNull Callback callback, @NotNull NotificationBar notificationBar, @NotNull DismissReason reason) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
            }

            public static void onShown(@NotNull Callback callback, @NotNull NotificationBar notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            }
        }

        void onDismissed(@NotNull NotificationBar notificationBar, @NotNull DismissReason reason);

        void onShown(@NotNull NotificationBar notificationBar);
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBar$Companion;", "", "<init>", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "model", "", "duration", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)Ljava/lang/Long;", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "make", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/android/notificationbar/NotificationBar;", "Lru/ozon/uni/android/notificationbar/NotificationConfig;", "config", "Lru/ozon/uni/android/notificationbar/NotificationConfig;", "getConfig", "()Lru/ozon/uni/android/notificationbar/NotificationConfig;", "setConfig", "(Lru/ozon/uni/android/notificationbar/NotificationConfig;)V", "getConfig$annotations", "SLIDE_ANIMATION_DURATION_MS", "J", "Lru/ozon/uni/android/notificationbar/NotificationBar$Direction;", "SLIDE_IN_DIRECTION", "Lru/ozon/uni/android/notificationbar/NotificationBar$Direction;", "", "DEFAULT_DURATION_SEC", "I", "INDEFINITE_DURATION_SEC", "Ljava/lang/Long;", "MSG_SHOW", "MSG_DISMISS", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Long duration(NotificationModelWrapper model) {
            if (getConfig().getIsIndefinite()) {
                return NotificationBar.INDEFINITE_DURATION_SEC;
            }
            if (model instanceof NotificationAtom) {
                if (((NotificationAtom) model).getSeconds() != null) {
                    return Long.valueOf(r3.intValue());
                }
                return null;
            }
            if (!(model instanceof NotificationDTO)) {
                return NotificationBar.INDEFINITE_DURATION_SEC;
            }
            Integer autoHideDelay = ((NotificationDTO) model).getAutoHideDelay();
            int intValue = autoHideDelay != null ? autoHideDelay.intValue() : 5;
            return intValue <= 0 ? NotificationBar.INDEFINITE_DURATION_SEC : Long.valueOf(intValue);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NotificationBar make$default(Companion companion, NotificationLayoutManager notificationLayoutManager, NotificationModelWrapper notificationModelWrapper, J j11, Function1 function1, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                function1 = null;
            }
            return companion.make(notificationLayoutManager, notificationModelWrapper, j11, function1);
        }

        @NotNull
        public final NotificationConfig getConfig() {
            return NotificationBar.config;
        }

        @NotNull
        public final NotificationBar make(@NotNull NotificationLayoutManager layoutManager, @NotNull NotificationModelWrapper model, @NotNull J lifecycleOwner, Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            View inflate = LayoutInflater.from(layoutManager.getParent().getContext()).inflate(R$layout.notification_bar_uni, layoutManager.getParent(), false);
            Intrinsics.g(inflate, "null cannot be cast to non-null type ru.ozon.uni.android.notificationbar.view.NotificationBarContainerView");
            NotificationBarContainerView notificationBarContainerView = (NotificationBarContainerView) inflate;
            Long duration = duration(model);
            return new NotificationBar(layoutManager, notificationBarContainerView, model, duration != null ? Long.valueOf(duration.longValue() * 1000) : null, lifecycleOwner, actionHandler, null);
        }

        public final void setConfig(@NotNull NotificationConfig notificationConfig) {
            Intrinsics.checkNotNullParameter(notificationConfig, "<set-?>");
            NotificationBar.config = notificationConfig;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBar$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "LEFT", "RIGHT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Direction {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction UP = new Direction("UP", 0);
        public static final Direction DOWN = new Direction("DOWN", 1);
        public static final Direction LEFT = new Direction("LEFT", 2);
        public static final Direction RIGHT = new Direction("RIGHT", 3);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{UP, DOWN, LEFT, RIGHT};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Direction(String str, int i11) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBar$DismissReason;", "", "<init>", "(Ljava/lang/String;I)V", "SWIPE", "ACTION", "TIMEOUT", "MANUAL", "CONSECUTIVE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissReason {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ DismissReason[] $VALUES;
        public static final DismissReason SWIPE = new DismissReason("SWIPE", 0);
        public static final DismissReason ACTION = new DismissReason("ACTION", 1);
        public static final DismissReason TIMEOUT = new DismissReason("TIMEOUT", 2);
        public static final DismissReason MANUAL = new DismissReason("MANUAL", 3);
        public static final DismissReason CONSECUTIVE = new DismissReason("CONSECUTIVE", 4);

        private static final /* synthetic */ DismissReason[] $values() {
            return new DismissReason[]{SWIPE, ACTION, TIMEOUT, MANUAL, CONSECUTIVE};
        }

        static {
            DismissReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DismissReason(String str, int i11) {
        }

        @NotNull
        public static Xc.a<DismissReason> getEntries() {
            return $ENTRIES;
        }

        public static DismissReason valueOf(String str) {
            return (DismissReason) Enum.valueOf(DismissReason.class, str);
        }

        public static DismissReason[] values() {
            return (DismissReason[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NotificationBarContainerView.DismissDirection.values().length];
            try {
                iArr[NotificationBarContainerView.DismissDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationBarContainerView.DismissDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationBarContainerView.DismissDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Direction.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Direction.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        config = new NotificationConfig(false, 1, defaultConstructorMarker);
    }

    public /* synthetic */ NotificationBar(NotificationLayoutManager notificationLayoutManager, NotificationBarContainerView notificationBarContainerView, NotificationModelWrapper notificationModelWrapper, Long l11, J j11, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationLayoutManager, notificationBarContainerView, notificationModelWrapper, l11, j11, function1);
    }

    private final void animateSlideIn(final Function0<Unit> onAnimationEnd) {
        NotificationBarContainerView notificationBarContainerView = this.containerView;
        if (!notificationBarContainerView.isLaidOut() || notificationBarContainerView.isLayoutRequested()) {
            notificationBarContainerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.uni.android.notificationbar.NotificationBar$animateSlideIn$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    view.setTranslationY(NotificationBar.this.getOffScreenTranslationY(view));
                    view.setAlpha(0.0f);
                    view.animate().translationY(NotificationBar.this.containerView.getOriginalTranslationY()).alpha(1.0f).setDuration(200L).setInterpolator(NotificationBar.this.interpolator).setListener(new SimpleAnimatorListener(null, new NotificationBar$animateSlideIn$1$1$1(onAnimationEnd), null, null, 13, null)).start();
                }
            });
            return;
        }
        notificationBarContainerView.setTranslationY(getOffScreenTranslationY(notificationBarContainerView));
        notificationBarContainerView.setAlpha(0.0f);
        notificationBarContainerView.animate().translationY(this.containerView.getOriginalTranslationY()).alpha(1.0f).setDuration(200L).setInterpolator(this.interpolator).setListener(new SimpleAnimatorListener(null, new NotificationBar$animateSlideIn$1$1$1(onAnimationEnd), null, null, 13, null)).start();
    }

    private final void animateSlideOut(Function0<Unit> onAnimationEnd) {
        NotificationBarContainerView notificationBarContainerView = this.containerView;
        notificationBarContainerView.animate().translationY(getOffScreenTranslationY(notificationBarContainerView)).alpha(0.0f).setDuration(200L).setInterpolator(this.interpolator).setListener(new SimpleAnimatorListener(null, new NotificationBar$animateSlideOut$1$1(onAnimationEnd), null, null, 13, null)).start();
    }

    private final void animateSlideOutHorizontal(Direction direction, Function0<Unit> onAnimationEnd) {
        NotificationBarContainerView notificationBarContainerView = this.containerView;
        notificationBarContainerView.animate().translationX(getOffScreenTranslationX(direction)).alpha(0.0f).setDuration(200L).setInterpolator(this.interpolator).setListener(new SimpleAnimatorListener(null, new NotificationBar$animateSlideOutHorizontal$1$1(onAnimationEnd), null, null, 13, null)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchDismiss(DismissReason reason) {
        NotificationBarManager.INSTANCE.dismiss(this, reason);
    }

    private final int getNotificationViewHeight(View view) {
        if (view instanceof NotificationBarView) {
            return -2;
        }
        return UiExtKt.toPx(56);
    }

    private final float getOffScreenTranslationX(Direction direction) {
        float width = this.containerView.getWidth();
        int i11 = WhenMappings.$EnumSwitchMapping$1[direction.ordinal()];
        if (i11 == 3) {
            return -width;
        }
        if (i11 != 4) {
            return 0.0f;
        }
        return width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getOffScreenTranslationY(View notificationView) {
        ViewGroup.LayoutParams layoutParams = notificationView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = 0;
        if (marginLayoutParams != null) {
            int i12 = WhenMappings.$EnumSwitchMapping$1[SLIDE_IN_DIRECTION.ordinal()];
            if (i12 == 1) {
                i11 = marginLayoutParams.bottomMargin;
            } else if (i12 == 2) {
                i11 = marginLayoutParams.topMargin;
            }
        }
        float height = notificationView.getHeight() + i11;
        int i13 = WhenMappings.$EnumSwitchMapping$1[SLIDE_IN_DIRECTION.ordinal()];
        if (i13 == 1) {
            return height;
        }
        if (i13 != 2) {
            return 0.0f;
        }
        return -height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean handler$lambda$19(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i11 = message.what;
        if (i11 == 0) {
            Object obj = message.obj;
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.uni.android.notificationbar.NotificationBar");
            ((NotificationBar) obj).showView$uni_release();
            return true;
        }
        if (i11 != 1) {
            return false;
        }
        Object obj2 = message.obj;
        Intrinsics.g(obj2, "null cannot be cast to non-null type ru.ozon.uni.android.notificationbar.NotificationBar");
        ((NotificationBar) obj2).hideView$uni_release((DismissReason) DismissReason.getEntries().get(message.arg1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets lambda$2$lambda$1(View v11, WindowInsets insets) {
        int systemWindowInsetTop;
        int statusBars;
        Insets insets2;
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (Build.VERSION.SDK_INT >= 30) {
            statusBars = WindowInsets.Type.statusBars();
            insets2 = insets.getInsets(statusBars);
            systemWindowInsetTop = insets2.top;
        } else {
            systemWindowInsetTop = insets.getSystemWindowInsetTop();
        }
        marginLayoutParams.topMargin = systemWindowInsetTop;
        v11.setLayoutParams(marginLayoutParams);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewHidden(DismissReason reason) {
        NotificationBarManager.INSTANCE.onDismissed$uni_release(this);
        Iterator it = C7714v.z0(this.callbacks).iterator();
        while (it.hasNext()) {
            ((Callback) it.next()).onDismissed(this, reason);
        }
        this.layoutManager.remove(this.containerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewShown() {
        NotificationBarManager.INSTANCE.onShown$uni_release(this);
        Iterator it = C7714v.z0(this.callbacks).iterator();
        while (it.hasNext()) {
            ((Callback) it.next()).onShown(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showView$lambda$10$lambda$9(NotificationBar notificationBar, NotificationBarContainerView.DismissDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i11 == 1) {
            notificationBar.dispatchDismiss(DismissReason.SWIPE);
        } else if (i11 == 2) {
            notificationBar.animateSlideOutHorizontal(Direction.LEFT, new NotificationBar$showView$1$1$1(notificationBar));
        } else {
            if (i11 != 3) {
                throw new o();
            }
            notificationBar.animateSlideOutHorizontal(Direction.RIGHT, new NotificationBar$showView$1$1$2(notificationBar));
        }
    }

    public final void addCallback(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    public final void dismiss() {
        dispatchDismiss(DismissReason.MANUAL);
    }

    /* renamed from: getDuration$uni_release, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    public final void hideView$uni_release(@NotNull DismissReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.lifecycleOwner.getLifecycle().e(this.lifecycleObserver);
        animateSlideOut(new NotificationBar$hideView$1(this, reason));
    }

    public final void removeCallback(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    public final void requestDismiss$uni_release(@NotNull DismissReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Handler handler2 = handler;
        handler2.dispatchMessage(handler2.obtainMessage(1, reason.ordinal(), 0, this));
    }

    public final void requestShow$uni_release() {
        Handler handler2 = handler;
        handler2.dispatchMessage(handler2.obtainMessage(0, this));
    }

    public final void show() {
        NotificationBarManager.INSTANCE.show(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showView$uni_release() {
        NotificationBarView notificationBarView;
        this.lifecycleOwner.getLifecycle().a(this.lifecycleObserver);
        NotificationModelWrapper notificationModelWrapper = this.model;
        if (notificationModelWrapper instanceof NotificationAtom.Notification) {
            Context context = this.containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            NotificationView notificationView = new NotificationView(context, null, 0, 6, null);
            NotificationWithoutIconHolderKt.bind(notificationView, (NotificationAtom.Notification) this.model, this.actionHandler);
            notificationBarView = notificationView;
        } else if (notificationModelWrapper instanceof NotificationAtom.NotificationWithIcon) {
            Context context2 = this.containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            NotificationWithIconView notificationWithIconView = new NotificationWithIconView(context2, null, 0, 6, null);
            NotificationWithIconHolderKt.bind(notificationWithIconView, (NotificationAtom.NotificationWithIcon) this.model, this.actionHandler);
            notificationBarView = notificationWithIconView;
        } else {
            if (!(notificationModelWrapper instanceof NotificationDTO)) {
                return;
            }
            Context context3 = this.containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            NotificationBarView notificationBarView2 = new NotificationBarView(context3, null, 0, 6, null);
            NotificationHolderKt.bind(notificationBarView2, (NotificationDTO) this.model, this.actionHandler);
            notificationBarView2.setOnCloseListener(new NotificationBar$showView$view$3$1(this));
            notificationBarView = notificationBarView2;
        }
        NotificationBarContainerView notificationBarContainerView = this.containerView;
        notificationBarContainerView.addView(notificationBarView, -1, getNotificationViewHeight(notificationBarView));
        notificationBarContainerView.setDismissCallback$uni_release(new Gk0.b(this));
        if (this.containerView.getParent() == null) {
            this.layoutManager.layout(this.containerView);
        }
        animateSlideIn(new NotificationBar$showView$2(this));
    }

    @NotNull
    public final NotificationBar turnOffDismissOnAction() {
        Function1<AtomAction, Unit> function1 = this.defaultActionHandler;
        if (function1 != null) {
            this.actionHandler = function1;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ru.ozon.uni.android.notificationbar.NotificationBar$lifecycleObserver$1] */
    private NotificationBar(NotificationLayoutManager notificationLayoutManager, NotificationBarContainerView notificationBarContainerView, NotificationModelWrapper notificationModelWrapper, Long l11, J j11, Function1<? super AtomAction, Unit> function1) {
        this.layoutManager = notificationLayoutManager;
        this.containerView = notificationBarContainerView;
        this.model = notificationModelWrapper;
        this.duration = l11;
        this.lifecycleOwner = j11;
        this.defaultActionHandler = function1;
        this.interpolator = new DecelerateInterpolator();
        DismissibleActionHandler dismissibleActionHandler = new DismissibleActionHandler(this, function1);
        this.dismissibleActionHandler = dismissibleActionHandler;
        this.actionHandler = dismissibleActionHandler;
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.uni.android.notificationbar.NotificationBar$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                NotificationBar.this.dismiss();
            }
        };
        NotificationBar$onAttachStateChangeListener$1 notificationBar$onAttachStateChangeListener$1 = new NotificationBar$onAttachStateChangeListener$1(this);
        this.onAttachStateChangeListener = notificationBar$onAttachStateChangeListener$1;
        this.callbacks = new ArrayList();
        notificationBarContainerView.addOnAttachStateChangeListener(notificationBar$onAttachStateChangeListener$1);
        notificationBarContainerView.setFitsSystemWindows(true);
        notificationBarContainerView.setOnApplyWindowInsetsListener(new c());
    }
}
