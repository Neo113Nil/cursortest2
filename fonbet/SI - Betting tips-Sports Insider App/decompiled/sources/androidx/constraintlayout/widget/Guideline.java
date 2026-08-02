package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1053a;

    public Guideline(Context context) {
        super(context);
        this.f1053a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z5) {
        this.f1053a = z5;
    }

    public void setGuidelineBegin(int i5) {
        d dVar = (d) getLayoutParams();
        if (this.f1053a && dVar.f1069a == i5) {
            return;
        }
        dVar.f1069a = i5;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i5) {
        d dVar = (d) getLayoutParams();
        if (this.f1053a && dVar.f1071b == i5) {
            return;
        }
        dVar.f1071b = i5;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f6) {
        d dVar = (d) getLayoutParams();
        if (this.f1053a && dVar.f1073c == f6) {
            return;
        }
        dVar.f1073c = f6;
        setLayoutParams(dVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1053a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
    }
}
