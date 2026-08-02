package com.vk.prefui.fragments;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.anj;
import xsna.b3m;
import xsna.bwt0;
import xsna.dhr0;
import xsna.fnj;
import xsna.gpu0;
import xsna.h3r;
import xsna.h48;
import xsna.iah0;
import xsna.j6r0;
import xsna.jjv0;
import xsna.nu4;
import xsna.skf0;
import xsna.x9;

/* loaded from: classes5.dex */
public class MaterialPreferenceFragment extends PreferenceFragmentCompat {
    public static final /* synthetic */ int k0 = 0;
    public gpu0 V;
    public int W;
    public Preference c0;
    public int g0;
    public int h0;
    public String X = "";
    public boolean Y = false;
    public boolean Z = false;
    public boolean a0 = false;
    public int b0 = -1;

    @Nullable
    public WeakReference<View> d0 = null;
    public final Handler e0 = new Handler(Looper.getMainLooper());
    public final Object f0 = new Object();
    public final a i0 = new a();
    public final b j0 = new b();

    public static class CenterLayoutManager extends LinearLayoutManager {

        @Nullable
        public b r;

        public static class a extends v {

            @Nullable
            public final Runnable a;

            public a(@NonNull Context context, @Nullable b3m b3mVar) {
                super(context);
                this.a = b3mVar;
            }

            @Override // androidx.recyclerview.widget.v
            public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
                return x9.b(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
            }

            @Override // androidx.recyclerview.widget.v
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
            public final void onStop() {
                super.onStop();
                Runnable runnable = this.a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        public interface b {
        }

        public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
            Context context = recyclerView.getContext();
            b bVar = this.r;
            a aVar = new a(context, bVar != null ? new b3m(bVar, 4) : null);
            aVar.setTargetPosition(i);
            startSmoothScroll(aVar);
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            MaterialPreferenceFragment materialPreferenceFragment = MaterialPreferenceFragment.this;
            RecyclerView recyclerView = materialPreferenceFragment.O;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    int i = MaterialPreferenceFragment.k0;
                    materialPreferenceFragment.kn().getWindow().addFlags(16);
                    materialPreferenceFragment.e0.postDelayed(new h3r(this, layoutManager, recyclerView, 1), 100L);
                }
            }
        }
    }

    public class b implements CenterLayoutManager.b {
        public b() {
        }
    }

    public class c extends skf0 implements jjv0 {
        public c(androidx.preference.c cVar) {
            super(cVar);
            RecyclerView.Adapter<T> adapter = this.c;
            String str = MaterialPreferenceFragment.this.X;
            if (str == null || str.isEmpty()) {
                return;
            }
            for (int i = 0; i < adapter.getItemCount(); i++) {
                Preference z0 = ((androidx.preference.c) adapter).z0(i);
                if (MaterialPreferenceFragment.this.X.equals(z0.n)) {
                    MaterialPreferenceFragment.this.c0 = z0;
                    MaterialPreferenceFragment.this.b0 = i;
                    return;
                }
            }
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            RecyclerView.Adapter<T> adapter = this.c;
            return (i != 0 && (((i >= adapter.getItemCount() || i < 0) ? null : ((androidx.preference.c) adapter).z0(i)) instanceof PreferenceCategory)) ? 1 : 0;
        }

        @Override // xsna.skf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            MaterialPreferenceFragment materialPreferenceFragment = MaterialPreferenceFragment.this;
            Object obj = materialPreferenceFragment.f0;
            Handler handler = materialPreferenceFragment.e0;
            super.onBindViewHolder(e0Var, i);
            View view = e0Var.itemView;
            Preference z0 = ((androidx.preference.c) this.c).z0(i);
            if (z0 != null && materialPreferenceFragment.X.equals(z0.n)) {
                materialPreferenceFragment.d0 = new WeakReference<>(view);
                handler.removeCallbacksAndMessages(obj);
                handler.postAtTime(new nu4(this, 6), obj, SystemClock.uptimeMillis() + 500);
            }
            View findViewById = view.findViewById(R.id.title);
            if (findViewById instanceof TextView) {
                dhr0.a.getClass();
                ((TextView) findViewById).setTextColor(anj.b(com.vkontakte.android.R.color.vk_stateful_primary_color, dhr0.E()));
            }
            View findViewById2 = view.findViewById(R.id.summary);
            if (findViewById2 instanceof TextView) {
                dhr0.a.getClass();
                ((TextView) findViewById2).setTextColor(anj.b(com.vkontakte.android.R.color.vk_stateful_secondary_color, dhr0.E()));
            }
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return iah0.a(4);
        }
    }

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat
    public final void bindPreferences() {
        super.bindPreferences();
        go();
        eo(this.h0);
    }

    public final void eo(int i) {
        this.h0 = i;
        RecyclerView recyclerView = this.O;
        if (recyclerView == null) {
            return;
        }
        h48.a(recyclerView, this.g0, i, 0);
    }

    public final void fo() {
        kn().getWindow().clearFlags(16);
    }

    public final void go() {
        int i;
        if (this.O.getAdapter() instanceof jjv0) {
            this.O.removeItemDecoration(this.V);
            RecyclerView recyclerView = this.O;
            jjv0 jjv0Var = (jjv0) recyclerView.getAdapter();
            Context mo2getContext = mo2getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(mo2getContext)) {
                float max = Math.max(16, (this.W - 924) / 2);
                WeakHashMap weakHashMap = j6r0.a;
                i = iah0.a(max);
            } else {
                i = 0;
            }
            this.O.setPadding(i, 0, i, 0);
            gpu0 gpu0Var = new gpu0(mo2getContext());
            gpu0Var.j = jjv0Var;
            this.V = gpu0Var;
            recyclerView.addItemDecoration(gpu0Var);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.W = getResources().getConfiguration().screenWidthDp;
        FragmentActivity activity = getActivity();
        HashSet hashSet = iah0.a;
        fnj.d(activity);
    }

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat
    public void onBindPreferences() {
        ViewTreeObserver x;
        RecyclerView recyclerView = this.O;
        if (this.b0 < 0 || recyclerView == null || (x = bwt0.x(recyclerView)) == null) {
            return;
        }
        x.addOnGlobalLayoutListener(this.i0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.W = getResources().getConfiguration().screenWidthDp;
        FragmentActivity activity = getActivity();
        HashSet hashSet = iah0.a;
        fnj.d(activity);
        go();
        eo(this.h0);
    }

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.X = getArguments().getString("pref_to_highlight", this.X);
        this.Y = getArguments().getBoolean("hightlight_preference_click");
        boolean containsKey = getArguments().containsKey("highlight_value");
        this.a0 = containsKey;
        if (containsKey) {
            this.Z = getArguments().getBoolean("highlight_value");
        }
    }

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat
    public final RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new c(new androidx.preference.c(preferenceScreen));
    }

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat
    public final RecyclerView.o onCreateLayoutManager() {
        getActivity();
        CenterLayoutManager centerLayoutManager = new CenterLayoutManager();
        centerLayoutManager.r = this.j0;
        return centerLayoutManager;
    }

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver x;
        this.h0 = 0;
        this.g0 = 0;
        super.onDestroyView();
        this.e0.removeCallbacksAndMessages(null);
        RecyclerView recyclerView = this.O;
        if (recyclerView != null && (x = bwt0.x(recyclerView)) != null) {
            x.removeOnGlobalLayoutListener(this.i0);
        }
        this.V = null;
        this.d0 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        fo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        fo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.O.setScrollBarStyle(33554432);
        go();
        this.g0 = this.O.getPaddingBottom();
    }
}
