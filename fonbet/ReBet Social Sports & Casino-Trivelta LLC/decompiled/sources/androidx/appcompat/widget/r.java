package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import l.AbstractC5335a;

/* loaded from: classes.dex */
public class r extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C2061p f17358a;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54975H);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.f17358a.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        W.a(this, getContext());
        C2061p c2061p = new C2061p(this);
        this.f17358a = c2061p;
        c2061p.c(attributeSet, i10);
    }
}
