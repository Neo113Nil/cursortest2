package p2;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.i;

/* loaded from: classes8.dex */
public final class c extends androidx.constraintlayout.widget.b implements MotionLayout.i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f80024a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f80025b;

    public final boolean a() {
        return this.f80025b;
    }

    public final boolean b() {
        return this.f80024a;
    }

    @Override // androidx.constraintlayout.widget.b
    protected final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f41856m);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 1) {
                    this.f80024a = obtainStyledAttributes.getBoolean(index, this.f80024a);
                } else if (index == 0) {
                    this.f80025b = obtainStyledAttributes.getBoolean(index, this.f80025b);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
