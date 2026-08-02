package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a70;
import defpackage.aq8;
import defpackage.bq8;
import defpackage.cq8;
import defpackage.lnb;
import defpackage.no8;
import defpackage.xo8;
import defpackage.yjf;
import defpackage.zp8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n implements LayoutInflater.Factory2 {
    public final s a;

    public n(s sVar) {
        this.a = sVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        u g;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        s sVar = this.a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, sVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yjf.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = Fragment.class.isAssignableFrom(xo8.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment E = resourceId != -1 ? sVar.E(resourceId) : null;
                    if (E == null && string != null) {
                        E = sVar.F(string);
                    }
                    if (E == null && id != -1) {
                        E = sVar.E(id);
                    }
                    if (E == null) {
                        xo8 M = sVar.M();
                        context.getClassLoader();
                        E = M.a(attributeValue);
                        E.mFromLayout = true;
                        E.mFragmentId = resourceId != 0 ? resourceId : id;
                        E.mContainerId = id;
                        E.mTag = string;
                        E.mInLayout = true;
                        E.mFragmentManager = sVar;
                        no8 no8Var = sVar.x;
                        E.mHost = no8Var;
                        E.onInflate(no8Var.b, attributeSet, E.mSavedFragmentState);
                        g = sVar.a(E);
                        if (s.O(2)) {
                            E.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (E.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        E.mInLayout = true;
                        E.mFragmentManager = sVar;
                        no8 no8Var2 = sVar.x;
                        E.mHost = no8Var2;
                        E.onInflate(no8Var2.b, attributeSet, E.mSavedFragmentState);
                        g = sVar.g(E);
                        if (s.O(2)) {
                            E.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    aq8 aq8Var = bq8.a;
                    cq8 cq8Var = new cq8(E, viewGroup);
                    bq8.c(cq8Var);
                    aq8 a = bq8.a(E);
                    if (a.a.contains(zp8.d) && bq8.e(a, E.getClass(), cq8.class)) {
                        bq8.b(a, cq8Var);
                    }
                    E.mContainer = viewGroup;
                    g.i();
                    g.h();
                    View view2 = E.mView;
                    if (view2 == null) {
                        a70.r(lnb.o("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (E.mView.getTag() == null) {
                        E.mView.setTag(string);
                    }
                    E.mView.addOnAttachStateChangeListener(new m(this, g));
                    return E.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
