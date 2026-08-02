package com.reactnativekeyboardcontroller.views;

import com.reactnativekeyboardcontroller.listeners.KeyboardAnimationCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EdgeToEdgeReactViewGroup.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class EdgeToEdgeReactViewGroup$modalAttachedWatcher$1 extends FunctionReferenceImpl implements Function0<KeyboardAnimationCallback> {
    EdgeToEdgeReactViewGroup$modalAttachedWatcher$1(Object obj) {
        super(0, obj, EdgeToEdgeReactViewGroup.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final KeyboardAnimationCallback invoke() {
        KeyboardAnimationCallback callback;
        callback = ((EdgeToEdgeReactViewGroup) this.receiver).getCallback();
        return callback;
    }
}
