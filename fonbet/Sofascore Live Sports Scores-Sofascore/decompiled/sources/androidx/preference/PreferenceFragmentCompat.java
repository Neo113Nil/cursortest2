package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.sofascore.results.R;
import defpackage.a5f;
import defpackage.a70;
import defpackage.b5f;
import defpackage.gl0;
import defpackage.jjf;
import defpackage.kac;
import defpackage.v4f;
import defpackage.y4f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends Fragment {
    public a5f b;
    public RecyclerView c;
    public boolean d;
    public boolean e;
    public final v4f a = new v4f(this);
    public int f = R.layout.preference_list_fragment;
    public final gl0 g = new gl0(this, Looper.getMainLooper(), 12);
    public final kac h = new kac(this, 8);

    public final Preference j(String str) {
        PreferenceScreen preferenceScreen;
        a5f a5fVar = this.b;
        if (a5fVar == null || (preferenceScreen = (PreferenceScreen) a5fVar.g) == null) {
            return null;
        }
        return preferenceScreen.z(str);
    }

    public l k(PreferenceScreen preferenceScreen) {
        return new y4f(preferenceScreen);
    }

    public abstract void l(String str);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        a5f a5fVar = new a5f(requireContext());
        this.b = a5fVar;
        a5fVar.j = this;
        l(getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, jjf.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f = obtainStyledAttributes.getResourceId(0, this.f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            a70.r("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAccessibilityDelegateCompat(new b5f(recyclerView));
        }
        this.c = recyclerView;
        v4f v4fVar = this.a;
        recyclerView.addItemDecoration(v4fVar);
        if (drawable != null) {
            v4fVar.getClass();
            v4fVar.b = drawable.getIntrinsicHeight();
        } else {
            v4fVar.b = 0;
        }
        v4fVar.a = drawable;
        PreferenceFragmentCompat preferenceFragmentCompat = v4fVar.d;
        preferenceFragmentCompat.c.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            v4fVar.b = dimensionPixelSize;
            preferenceFragmentCompat.c.invalidateItemDecorations();
        }
        v4fVar.c = z;
        if (this.c.getParent() == null) {
            viewGroup2.addView(this.c);
        }
        this.g.post(this.h);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        kac kacVar = this.h;
        gl0 gl0Var = this.g;
        gl0Var.removeCallbacks(kacVar);
        gl0Var.removeMessages(1);
        if (this.d) {
            this.c.setAdapter(null);
            PreferenceScreen preferenceScreen = (PreferenceScreen) this.b.g;
            if (preferenceScreen != null) {
                preferenceScreen.m();
            }
        }
        this.c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.b.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        a5f a5fVar = this.b;
        a5fVar.h = this;
        a5fVar.i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        a5f a5fVar = this.b;
        a5fVar.h = null;
        a5fVar.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = (PreferenceScreen) this.b.g) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.d && (preferenceScreen = (PreferenceScreen) this.b.g) != null) {
            this.c.setAdapter(k(preferenceScreen));
            preferenceScreen.i();
        }
        this.e = true;
    }
}
