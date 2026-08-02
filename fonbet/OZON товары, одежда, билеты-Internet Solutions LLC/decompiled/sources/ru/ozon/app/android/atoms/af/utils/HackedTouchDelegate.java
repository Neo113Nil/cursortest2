package ru.ozon.app.android.atoms.af.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes11.dex */
public class HackedTouchDelegate extends TouchDelegate {
    private Rect mBounds;
    private boolean mDelegateTargeted;
    private View mDelegateView;
    private int mSlop;
    private Rect mSlopBounds;

    public HackedTouchDelegate(Rect rect, View view) {
        super(rect, view);
        this.mBounds = rect;
        this.mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.mSlopBounds = rect2;
        int i11 = this.mSlop;
        rect2.inset(-i11, -i11);
        this.mDelegateView = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 2) {
                boolean z12 = this.mDelegateTargeted;
                z11 = z12 ? this.mSlopBounds.contains(x11, y11) : true;
                r5 = z12;
            } else {
                if (action == 3) {
                    boolean z13 = this.mDelegateTargeted;
                    this.mDelegateTargeted = false;
                    r5 = z13;
                    z11 = true;
                }
                z11 = true;
                r5 = false;
            }
        } else if (this.mBounds.contains(x11, y11)) {
            this.mDelegateTargeted = true;
            z11 = true;
        } else {
            this.mDelegateTargeted = false;
            z11 = true;
            r5 = false;
        }
        if (!r5) {
            return false;
        }
        View view = this.mDelegateView;
        if (z11) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f7 = -(this.mSlop * 2);
            motionEvent.setLocation(f7, f7);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
