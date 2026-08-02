package com.swmansion.reanimated.keyboard;

import androidx.annotation.NonNull;
import androidx.core.view.C2111s0;
import androidx.core.view.F0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class KeyboardAnimationCallback extends C2111s0.b {
    private static final int CONTENT_TYPE_MASK = F0.p.b();
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z10) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z10;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(@NonNull C2111s0 c2111s0) {
        return (c2111s0.c() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // androidx.core.view.C2111s0.b
    public void onEnd(@NonNull C2111s0 c2111s0) {
        if (isKeyboardAnimation(c2111s0)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // androidx.core.view.C2111s0.b
    @NonNull
    public F0 onProgress(@NonNull F0 f02, @NonNull List<C2111s0> list) {
        Iterator<C2111s0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (isKeyboardAnimation(it.next())) {
                this.mKeyboard.updateHeight(f02, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return f02;
    }

    @Override // androidx.core.view.C2111s0.b
    @NonNull
    public C2111s0.a onStart(@NonNull C2111s0 c2111s0, @NonNull C2111s0.a aVar) {
        if (!isKeyboardAnimation(c2111s0)) {
            return aVar;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return super.onStart(c2111s0, aVar);
    }
}
