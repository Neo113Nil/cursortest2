package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f2098a;

    public v0(j1 j1Var) {
        this.f2098a = j1Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z5;
        p1 g10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        j1 j1Var = this.f2098a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, j1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f20817a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z5 = Fragment.class.isAssignableFrom(b1.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z5 = false;
                }
                if (z5) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragment = resourceId != -1 ? j1Var.D(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = j1Var.E(string);
                    }
                    if (fragment == null && id2 != -1) {
                        fragment = j1Var.D(id2);
                    }
                    if (fragment == null) {
                        b1 I = j1Var.I();
                        context.getClassLoader();
                        fragment = I.a(attributeValue);
                        fragment.mFromLayout = true;
                        fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragment.mContainerId = id2;
                        fragment.mTag = string;
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = j1Var;
                        t0 t0Var = j1Var.f1983w;
                        fragment.mHost = t0Var;
                        fragment.onInflate((Context) t0Var.f2087b, attributeSet, fragment.mSavedFragmentState);
                        g10 = j1Var.a(fragment);
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragment.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = j1Var;
                        t0 t0Var2 = j1Var.f1983w;
                        fragment.mHost = t0Var2;
                        fragment.onInflate((Context) t0Var2.f2087b, attributeSet, fragment.mSavedFragmentState);
                        g10 = j1Var.g(fragment);
                        if (j1.L(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    o1.c cVar = o1.d.f21091a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    o1.e eVar = new o1.e(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
                    o1.d.c(eVar);
                    o1.c a7 = o1.d.a(fragment);
                    if (a7.f21089a.contains(o1.b.f21082d) && o1.d.e(a7, fragment.getClass(), o1.e.class)) {
                        o1.d.b(a7, eVar);
                    }
                    fragment.mContainer = viewGroup;
                    g10.k();
                    g10.j();
                    View view2 = fragment.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(androidx.appcompat.widget.c1.n("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new u0(this, g10));
                    return fragment.mView;
                }
            }
        }
        return null;
    }
}
