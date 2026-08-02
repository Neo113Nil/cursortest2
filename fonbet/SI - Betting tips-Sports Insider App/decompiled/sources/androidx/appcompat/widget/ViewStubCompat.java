package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f672a;

    /* renamed from: b, reason: collision with root package name */
    public int f673b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f674c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f675d;

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f672a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.C, 0, 0);
        this.f673b = obtainStyledAttributes.getResourceId(2, -1);
        this.f672a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f672a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f675d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f672a, viewGroup, false);
        int i5 = this.f673b;
        if (i5 != -1) {
            inflate.setId(i5);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f674c = new WeakReference(inflate);
        return inflate;
    }

    public int getInflatedId() {
        return this.f673b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f675d;
    }

    public int getLayoutResource() {
        return this.f672a;
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i5) {
        this.f673b = i5;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f675d = layoutInflater;
    }

    public void setLayoutResource(int i5) {
        this.f672a = i5;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        WeakReference weakReference = this.f674c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i5);
            return;
        }
        super.setVisibility(i5);
        if (i5 == 0 || i5 == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(s4 s4Var) {
    }
}
