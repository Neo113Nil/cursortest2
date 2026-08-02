package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.R$styleable;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import xsna.fbs;
import xsna.zr;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public final class g implements LayoutInflater.Factory2 {
    public final FragmentManager b;

    public g(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public final View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public final View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        j i;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.b;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = Fragment.class.isAssignableFrom(f.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment G = resourceId != -1 ? fragmentManager.G(resourceId) : null;
                    if (G == null && string != null) {
                        G = fragmentManager.H(string);
                    }
                    if (G == null && id != -1) {
                        G = fragmentManager.G(id);
                    }
                    if (G == null) {
                        f N = fragmentManager.N();
                        context.getClassLoader();
                        G = N.a(attributeValue);
                        G.mFromLayout = true;
                        G.mFragmentId = resourceId != 0 ? resourceId : id;
                        G.mContainerId = id;
                        G.mTag = string;
                        G.mInLayout = true;
                        G.mFragmentManager = fragmentManager;
                        fbs<?> fbsVar = fragmentManager.w;
                        G.mHost = fbsVar;
                        G.onInflate((Context) fbsVar.c, attributeSet, G.mSavedFragmentState);
                        i = fragmentManager.a(G);
                        if (FragmentManager.P(2)) {
                            G.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (G.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        G.mInLayout = true;
                        G.mFragmentManager = fragmentManager;
                        fbs<?> fbsVar2 = fragmentManager.w;
                        G.mHost = fbsVar2;
                        G.onInflate((Context) fbsVar2.c, attributeSet, G.mSavedFragmentState);
                        i = fragmentManager.i(G);
                        if (FragmentManager.P(2)) {
                            G.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    FragmentStrictMode.a aVar = FragmentStrictMode.a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(G, viewGroup);
                    FragmentStrictMode.c(fragmentTagUsageViolation);
                    FragmentStrictMode.a a2 = FragmentStrictMode.a(G);
                    if (a2.a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.e(a2, G.getClass(), FragmentTagUsageViolation.class)) {
                        FragmentStrictMode.b(a2, fragmentTagUsageViolation);
                    }
                    G.mContainer = viewGroup;
                    i.i();
                    i.h();
                    View view2 = G.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(zr.a("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (G.mView.getTag() == null) {
                        G.mView.setTag(string);
                    }
                    G.mView.addOnAttachStateChangeListener(new a(i));
                    return G.mView;
                }
            }
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes12.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ j b;

        public a(j jVar) {
            this.b = jVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            j jVar = this.b;
            Fragment fragment = jVar.c;
            jVar.i();
            SpecialEffectsController.i((ViewGroup) fragment.mView.getParent(), g.this.b).h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
