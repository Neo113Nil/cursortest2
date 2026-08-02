package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.C3397ei;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ei, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3397ei extends C3320bi {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3397ei(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        super(gestureDetectorOnGestureListenerC3889xi);
        this.b = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.b;
        if (gestureDetectorOnGestureListenerC3889xi.S == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3889xi.T;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.b;
        gestureDetectorOnGestureListenerC3889xi2.T = null;
        View view = gestureDetectorOnGestureListenerC3889xi2.S;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.b.S;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.b.S);
            }
            this.b.S = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        view.getClass();
        customViewCallback.getClass();
        if (this.b.u.get() != null) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.b;
            gestureDetectorOnGestureListenerC3889xi.S = view;
            gestureDetectorOnGestureListenerC3889xi.T = customViewCallback;
            view.setOnTouchListener(new defpackage.ab(8));
            Activity activity = (Activity) this.b.u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.b.S;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.b.S, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.b.S;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.b;
            View view4 = gestureDetectorOnGestureListenerC3889xi2.S;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: s8m
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i, KeyEvent keyEvent) {
                    return C3397ei.a(GestureDetectorOnGestureListenerC3889xi.this, this, view5, i, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, C3397ei c3397ei, View view, int i, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x9 != null) {
            String str = GestureDetectorOnGestureListenerC3889xi.i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "Back pressed when HTML5 video is playing.");
        }
        c3397ei.a();
        return true;
    }
}
