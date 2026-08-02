package com.swmansion.reanimated.keyboard;

import androidx.core.view.F0;
import com.facebook.react.uimanager.PixelUtil;

/* loaded from: classes4.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = F0.p.b();
    private static final int SYSTEM_BAR_TYPE_MASK = F0.p.g();
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i10 = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i10;
        if (i10 == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i10 = this.mActiveTransitionCounter;
        if (i10 > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i10 + 1;
    }

    public void updateHeight(F0 f02, boolean z10) {
        int dIPFromPixel = (int) PixelUtil.toDIPFromPixel(Math.max(0, f02.f(CONTENT_TYPE_MASK).f19101d - (z10 ? 0 : f02.f(SYSTEM_BAR_TYPE_MASK).f19101d)));
        if (dIPFromPixel > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = dIPFromPixel;
        }
    }
}
