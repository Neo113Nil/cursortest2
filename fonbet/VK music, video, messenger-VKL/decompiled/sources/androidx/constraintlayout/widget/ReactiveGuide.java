package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class ReactiveGuide extends View implements d.a {
    public int b;
    public boolean c;
    public int d;
    public boolean e;

    public ReactiveGuide(Context context) {
        super(context);
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.e = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.b = obtainStyledAttributes.getResourceId(index, this.b);
                } else if (index == 0) {
                    this.c = obtainStyledAttributes.getBoolean(index, this.c);
                } else if (index == 2) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                } else if (index == 1) {
                    this.e = obtainStyledAttributes.getBoolean(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.b != -1) {
            ConstraintLayout.getSharedValues().a(this.b, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.d;
    }

    public int getAttributeId() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.c = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.d = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference<d.a>> hashSet;
        d sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.b;
        if (i2 != -1 && (hashSet = sharedValues.a.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<d.a>> it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference<d.a> next = it.next();
                d.a aVar = next.get();
                if (aVar == null || aVar == this) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.b = i;
        if (i != -1) {
            sharedValues.a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.c = f;
        setLayoutParams(bVar);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.e = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.e = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.e = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
