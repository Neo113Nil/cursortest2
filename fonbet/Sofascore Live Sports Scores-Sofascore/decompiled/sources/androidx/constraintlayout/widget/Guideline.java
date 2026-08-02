package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.tl3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        tl3 tl3Var = (tl3) getLayoutParams();
        if (this.a && tl3Var.a == i) {
            return;
        }
        tl3Var.a = i;
        setLayoutParams(tl3Var);
    }

    public void setGuidelineEnd(int i) {
        tl3 tl3Var = (tl3) getLayoutParams();
        if (this.a && tl3Var.b == i) {
            return;
        }
        tl3Var.b = i;
        setLayoutParams(tl3Var);
    }

    public void setGuidelinePercent(float f) {
        tl3 tl3Var = (tl3) getLayoutParams();
        if (this.a && tl3Var.c == f) {
            return;
        }
        tl3Var.c = f;
        setLayoutParams(tl3Var);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
