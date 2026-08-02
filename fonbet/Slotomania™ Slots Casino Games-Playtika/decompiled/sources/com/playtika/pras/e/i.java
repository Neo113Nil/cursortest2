package com.playtika.pras.e;

import android.content.Context;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class i extends WebView {
    public boolean a;

    public i(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.a && editorInfo != null) {
            editorInfo.imeOptions = (editorInfo.imeOptions & (-8)) | 6;
        }
        return onCreateInputConnection;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        requestDisallowInterceptTouchEvent(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setDoneButtonKeyboardMode(boolean z) {
        this.a = z;
    }
}
