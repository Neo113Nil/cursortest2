package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.sofascore.results.R;
import defpackage.da;
import defpackage.dad;
import defpackage.p9;
import defpackage.x9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends p9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.d = i;
        this.e = viewGroup;
    }

    @Override // defpackage.p9
    public final void d(View view, da daVar) {
        int i = this.d;
        ViewGroup viewGroup = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                daVar.s(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) viewGroup).c.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).h.get(intValue - 1));
                }
                daVar.m(dad.w(0, 1, intValue, 1, view.isSelected()));
                accessibilityNodeInfo2.setClickable(true);
                daVar.b(x9.e);
                break;
        }
    }

    @Override // defpackage.p9
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.e;
                ClockHandView clockHandView = clockFaceView.d;
                Rect rect = clockFaceView.e;
                if (i != 16) {
                    break;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(rect);
                    float centerX = rect.centerX();
                    float centerY = rect.centerY();
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
