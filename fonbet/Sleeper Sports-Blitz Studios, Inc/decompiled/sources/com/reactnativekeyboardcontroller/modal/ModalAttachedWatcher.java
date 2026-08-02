package com.reactnativekeyboardcontroller.modal;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.views.modal.ReactModalHostView;
import com.facebook.react.views.view.ReactViewGroup;
import com.reactnativekeyboardcontroller.extensions.ReactContextKt;
import com.reactnativekeyboardcontroller.extensions.ViewGroupKt;
import com.reactnativekeyboardcontroller.listeners.KeyboardAnimationCallback;
import com.reactnativekeyboardcontroller.listeners.KeyboardAnimationCallbackConfig;
import com.reactnativekeyboardcontroller.log.Logger;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalAttachedWatcher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/reactnativekeyboardcontroller/modal/ModalAttachedWatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", ViewHierarchyConstants.VIEW_KEY, "Lcom/facebook/react/views/view/ReactViewGroup;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallbackConfig;", "callback", "Lkotlin/Function0;", "Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", "<init>", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallbackConfig;Lkotlin/jvm/functions/Function0;)V", "uiManager", "Lcom/facebook/react/bridge/UIManager;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "onEventDispatch", "", "event", "Lcom/facebook/react/uimanager/events/Event;", "enable", "disable", "Companion", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModalAttachedWatcher implements EventDispatcherListener {
    private static final String MODAL_SHOW_EVENT = "topShow";
    private Function0<KeyboardAnimationCallback> callback;
    private final KeyboardAnimationCallbackConfig config;
    private final EventDispatcher eventDispatcher;
    private final ThemedReactContext reactContext;
    private final UIManager uiManager;
    private final ReactViewGroup view;

    public ModalAttachedWatcher(ReactViewGroup view, ThemedReactContext reactContext, KeyboardAnimationCallbackConfig config, Function0<KeyboardAnimationCallback> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.view = view;
        this.reactContext = reactContext;
        this.config = config;
        this.callback = callback;
        this.uiManager = ReactContextKt.getUiManager(reactContext);
        this.eventDispatcher = ReactContextKt.getEventDispatcher(reactContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onEventDispatch(Event<?> event) {
        String str;
        ReactModalHostView reactModalHostView;
        boolean z;
        View decorView;
        View resolveView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event.internal_getEventNameCompat(), "topShow")) {
            return;
        }
        View view = null;
        try {
            UIManager uIManager = this.uiManager;
            resolveView = uIManager != null ? uIManager.resolveView(event.getViewTag()) : null;
        } catch (Exception e) {
            Logger logger = Logger.INSTANCE;
            str = ModalAttachedWatcherKt.TAG;
            logger.w(str, "Can not resolve view for Modal#" + event.getViewTag(), e);
        }
        if (resolveView instanceof ReactModalHostView) {
            reactModalHostView = (ReactModalHostView) resolveView;
            if (reactModalHostView != null) {
                return;
            }
            ComponentDialog dialog = reactModalHostView.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                view = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                final ReactViewGroup reactViewGroup = new ReactViewGroup(this.reactContext);
                reactViewGroup.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                ViewGroup viewGroup2 = viewGroup;
                final KeyboardAnimationCallback keyboardAnimationCallback = new KeyboardAnimationCallback(this.view, viewGroup2, this.reactContext, this.config);
                ReactViewGroup reactViewGroup2 = reactViewGroup;
                viewGroup.addView(reactViewGroup2);
                z = ModalAttachedWatcherKt.areEventsComingFromOwnWindow;
                if (z) {
                    KeyboardAnimationCallback invoke = this.callback.invoke();
                    if (invoke != null) {
                        invoke.suspend(true);
                    }
                    ViewCompat.setWindowInsetsAnimationCallback(viewGroup2, keyboardAnimationCallback);
                    ViewCompat.setOnApplyWindowInsetsListener(reactViewGroup2, keyboardAnimationCallback);
                    this.view.post(new Runnable() { // from class: com.reactnativekeyboardcontroller.modal.ModalAttachedWatcher$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ModalAttachedWatcher.onEventDispatch$lambda$1(KeyboardAnimationCallback.this);
                        }
                    });
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.reactnativekeyboardcontroller.modal.ModalAttachedWatcher$$ExternalSyntheticLambda2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ModalAttachedWatcher.onEventDispatch$lambda$3(KeyboardAnimationCallback.this, reactViewGroup, this, dialogInterface);
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                    return;
                }
                return;
            }
            return;
        }
        reactModalHostView = null;
        if (reactModalHostView != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEventDispatch$lambda$1(KeyboardAnimationCallback keyboardAnimationCallback) {
        keyboardAnimationCallback.syncKeyboardPosition(Double.valueOf(0.0d), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEventDispatch$lambda$3(KeyboardAnimationCallback keyboardAnimationCallback, ReactViewGroup reactViewGroup, final ModalAttachedWatcher modalAttachedWatcher, DialogInterface dialogInterface) {
        KeyboardAnimationCallback.syncKeyboardPosition$default(keyboardAnimationCallback, null, null, 3, null);
        keyboardAnimationCallback.destroy();
        ViewGroupKt.removeSelf(reactViewGroup);
        modalAttachedWatcher.view.post(new Runnable() { // from class: com.reactnativekeyboardcontroller.modal.ModalAttachedWatcher$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ModalAttachedWatcher.onEventDispatch$lambda$3$lambda$2(ModalAttachedWatcher.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEventDispatch$lambda$3$lambda$2(ModalAttachedWatcher modalAttachedWatcher) {
        KeyboardAnimationCallback invoke = modalAttachedWatcher.callback.invoke();
        if (invoke != null) {
            invoke.suspend(false);
        }
    }

    public final void enable() {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.addListener(this);
        }
    }

    public final void disable() {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.removeListener(this);
        }
    }
}
