package com.vk.prefui.fragments;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.R$styleable;
import androidx.preference.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.prefui.views.ColorPreference;
import com.vkontakte.android.R;
import xsna.b640;
import xsna.idr0;
import xsna.m7g;
import xsna.s1p;

/* loaded from: classes5.dex */
public abstract class PreferenceFragmentCompat extends FragmentImpl implements e.b, e.c, e.a {
    public androidx.preference.e N;
    public RecyclerView O;
    public boolean P;
    public boolean Q;
    public ContextThemeWrapper R;
    public int S = R.layout.preference_list_fragment;
    public final a T = new a();
    public final b U = new b();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat.this.bindPreferences();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.O;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public interface c {
        boolean a();
    }

    public interface d {
        boolean a();
    }

    public interface e {
        boolean a();
    }

    public static class f extends Fragment implements DialogPreference.a {
        public PreferenceFragmentCompat h;

        @Override // androidx.preference.DialogPreference.a
        public final Preference findPreference(CharSequence charSequence) {
            PreferenceFragmentCompat preferenceFragmentCompat = this.h;
            if (preferenceFragmentCompat == null) {
                return null;
            }
            return preferenceFragmentCompat.findPreference(charSequence);
        }
    }

    @SuppressLint({"PrivateResource"})
    public PreferenceFragmentCompat() {
    }

    @SuppressLint({"RestrictedApi"})
    public final void addPreferencesFromResource(int i) {
        androidx.preference.e eVar = this.N;
        if (eVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        PreferenceScreen c2 = eVar.c(this.R, i, eVar.g);
        androidx.preference.e eVar2 = this.N;
        PreferenceScreen preferenceScreen = eVar2.g;
        if (c2 != preferenceScreen) {
            if (preferenceScreen != null) {
                preferenceScreen.u();
            }
            eVar2.g = c2;
            this.P = true;
            if (this.Q) {
                a aVar = this.T;
                if (aVar.hasMessages(1)) {
                    return;
                }
                aVar.obtainMessage(1).sendToTarget();
            }
        }
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = this.N.g;
        if (preferenceScreen != null) {
            this.O.setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.q();
        }
        onBindPreferences();
    }

    public final Preference findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        androidx.preference.e eVar = this.N;
        if (eVar == null || (preferenceScreen = eVar.g) == null) {
            return null;
        }
        return preferenceScreen.P(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onActivityCreated(bundle);
        if (this.P) {
            bindPreferences();
        }
        this.Q = true;
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen = this.N.g) == null) {
            return;
        }
        preferenceScreen.b(bundle2);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i <= 0) {
            throw new IllegalStateException("Must specify preferenceTheme in theme");
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.R = contextThemeWrapper;
        androidx.preference.e eVar = new androidx.preference.e(contextThemeWrapper);
        this.N = eVar;
        eVar.j = this;
        if (getArguments() != null) {
            getArguments().getString("android.support.v7.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
    }

    @SuppressLint({"RestrictedApi"})
    public RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new androidx.preference.c(preferenceScreen);
    }

    public RecyclerView.o onCreateLayoutManager() {
        getActivity();
        return new LinearLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.R.obtainStyledAttributes(null, R$styleable.h, R.attr.preferenceFragmentStyle, 0);
        this.S = obtainStyledAttributes.getResourceId(0, this.S);
        obtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), typedValue.resourceId));
        View inflate = cloneInContext.inflate(this.S, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
        recyclerView.setLayoutManager(onCreateLayoutManager());
        this.O = recyclerView;
        viewGroup2.addView(recyclerView);
        this.T.post(this.U);
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.O = null;
        b bVar = this.U;
        a aVar = this.T;
        aVar.removeCallbacks(bVar);
        aVar.removeMessages(1);
        super.onDestroyView();
    }

    @Override // androidx.preference.e.a
    public final void onDisplayPreferenceDialog(Preference preference) {
        androidx.fragment.app.d idr0Var;
        if ((getActivity() instanceof c ? ((c) getActivity()).a() : false) || getActivity().getFragmentManager().findFragmentByTag("android.support.v7.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof ColorPreference) {
            String str = preference.n;
            idr0Var = new m7g();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            idr0Var.setArguments(bundle);
        } else if (preference instanceof EditTextPreference) {
            String str2 = preference.n;
            idr0Var = new s1p();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            idr0Var.setArguments(bundle2);
        } else if (preference instanceof MultiSelectListPreference) {
            String str3 = preference.n;
            idr0Var = new b640();
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", str3);
            idr0Var.setArguments(bundle3);
        } else {
            if (!(preference instanceof ListPreference)) {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            String str4 = preference.n;
            idr0Var = new idr0();
            Bundle bundle4 = new Bundle(1);
            bundle4.putString("key", str4);
            idr0Var.setArguments(bundle4);
        }
        f fVar = (f) getActivity().getSupportFragmentManager().H("targetHack");
        if (fVar == null) {
            fVar = new f();
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(0, fVar, "targetHack", 1);
            aVar.k(true);
        }
        fVar.h = this;
        idr0Var.setTargetFragment(fVar, 0);
        idr0Var.Td(getActivity().getSupportFragmentManager(), "android.support.v7.preference.PreferenceFragment.DIALOG");
    }

    @Override // androidx.preference.e.b
    public final void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (getActivity() instanceof e) {
            ((e) getActivity()).a();
        }
    }

    @Override // androidx.preference.e.c
    public final boolean onPreferenceTreeClick(Preference preference) {
        if (preference.p == null || !(getActivity() instanceof d)) {
            return false;
        }
        return ((d) getActivity()).a();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.N.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.preference.e eVar = this.N;
        eVar.h = this;
        eVar.i = this;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        androidx.preference.e eVar = this.N;
        eVar.h = null;
        eVar.i = null;
    }

    public void onBindPreferences() {
    }
}
