package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3528f extends AbstractC3527e {
    public C3528f(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC3527e, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
