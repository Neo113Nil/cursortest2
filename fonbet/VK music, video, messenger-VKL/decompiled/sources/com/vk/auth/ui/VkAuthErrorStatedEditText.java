package com.vk.auth.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.hnj;
import xsna.jcu0;

/* compiled from: VkAuthErrorStatedEditText.kt */
/* loaded from: classes.dex */
public class VkAuthErrorStatedEditText extends jcu0 {
    public static final int[] d = {R.attr.state_error};
    public boolean c;

    public VkAuthErrorStatedEditText(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (!this.c) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        View.mergeDrawableStates(onCreateDrawableState, d);
        return onCreateDrawableState;
    }

    public final void setErrorState(boolean z) {
        if (this.c != z) {
            this.c = z;
            refreshDrawableState();
        }
    }
}
