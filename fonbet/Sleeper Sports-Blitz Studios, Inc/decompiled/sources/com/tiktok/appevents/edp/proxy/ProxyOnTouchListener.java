package com.tiktok.appevents.edp.proxy;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
public class ProxyOnTouchListener implements View.OnTouchListener {
    ITouchListener listener;
    View.OnTouchListener originOnTouchListener;

    public ProxyOnTouchListener(ITouchListener listener, View.OnTouchListener originOnTouchListener) {
        this.listener = listener;
        this.originOnTouchListener = originOnTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        View.OnTouchListener onTouchListener = this.originOnTouchListener;
        boolean onTouch = onTouchListener != null ? onTouchListener.onTouch(v, event) : false;
        ITouchListener iTouchListener = this.listener;
        if (iTouchListener != null) {
            iTouchListener.onTouch(v, event);
        }
        return onTouch;
    }
}
