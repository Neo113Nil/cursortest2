package com.ironsource;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes13.dex */
public final class Ig {
    public static final boolean a(View view, Rect rect) {
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
