package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C2174y implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f20240a;

    /* renamed from: androidx.fragment.app.y$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K f20241a;

        public a(K k10) {
            this.f20241a = k10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f20241a.k();
            this.f20241a.m();
            X.u((ViewGroup) k10.mView.getParent(), LayoutInflaterFactory2C2174y.this.f20240a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C2174y(FragmentManager fragmentManager) {
        this.f20240a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        K B10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f20240a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R0.c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R0.c.f9918a);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R0.c.f9919b, -1);
        String string = obtainStyledAttributes.getString(R0.c.f9920c);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC2172w.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment o02 = resourceId != -1 ? this.f20240a.o0(resourceId) : null;
        if (o02 == null && string != null) {
            o02 = this.f20240a.p0(string);
        }
        if (o02 == null && id2 != -1) {
            o02 = this.f20240a.o0(id2);
        }
        if (o02 == null) {
            o02 = this.f20240a.B0().a(context.getClassLoader(), attributeValue);
            o02.mFromLayout = true;
            o02.mFragmentId = resourceId != 0 ? resourceId : id2;
            o02.mContainerId = id2;
            o02.mTag = string;
            o02.mInLayout = true;
            FragmentManager fragmentManager = this.f20240a;
            o02.mFragmentManager = fragmentManager;
            o02.mHost = fragmentManager.D0();
            o02.onInflate(this.f20240a.D0().f(), attributeSet, o02.mSavedFragmentState);
            B10 = this.f20240a.l(o02);
            if (FragmentManager.Q0(2)) {
                o02.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (o02.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            o02.mInLayout = true;
            FragmentManager fragmentManager2 = this.f20240a;
            o02.mFragmentManager = fragmentManager2;
            o02.mHost = fragmentManager2.D0();
            o02.onInflate(this.f20240a.D0().f(), attributeSet, o02.mSavedFragmentState);
            B10 = this.f20240a.B(o02);
            if (FragmentManager.Q0(2)) {
                o02.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        S0.c.g(o02, viewGroup);
        o02.mContainer = viewGroup;
        B10.m();
        B10.j();
        View view2 = o02.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (o02.mView.getTag() == null) {
            o02.mView.setTag(string);
        }
        o02.mView.addOnAttachStateChangeListener(new a(B10));
        return o02.mView;
    }
}
