package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class blf extends ConstraintLayout {
    public final t4f a;
    public int b;
    public final qzb c;

    public blf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        qzb qzbVar = new qzb();
        this.c = qzbVar;
        qzbVar.setShapeAppearanceModel(qzbVar.b.a.e(new lwf(0.5f)));
        this.c.t(ColorStateList.valueOf(-1));
        setBackground(this.c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.J, R.attr.materialClockStyle, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.a = new t4f(this, 2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            t4f t4fVar = this.a;
            handler.removeCallbacks(t4fVar);
            handler.post(t4fVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            t4f t4fVar = this.a;
            handler.removeCallbacks(t4fVar);
            handler.post(t4fVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.c.t(ColorStateList.valueOf(i));
    }
}
