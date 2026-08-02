package com.vk.im.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.timepicker.b;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.im.ui.views.settings.LabelSettingsView;
import com.vkontakte.android.R;
import xsna.d27;
import xsna.isk;
import xsna.jsk;
import xsna.mkc;
import xsna.nyo0;
import xsna.oyo0;
import xsna.oz50;
import xsna.pvo0;
import xsna.u1u0;
import xsna.wzs;

/* compiled from: DarkThemeTimetableFragment.kt */
/* loaded from: classes2.dex */
public final class DarkThemeTimetableFragment extends FragmentImpl {
    public static final /* synthetic */ int Q = 0;
    public LabelSettingsView N;
    public LabelSettingsView O;
    public nyo0 P;

    /* compiled from: DarkThemeTimetableFragment.kt */
    public static final class a extends oz50 {
    }

    public final void eo() {
        LabelSettingsView labelSettingsView = this.N;
        if (labelSettingsView == null) {
            labelSettingsView = null;
        }
        Context requireContext = requireContext();
        nyo0 nyo0Var = this.P;
        if (nyo0Var == null) {
            nyo0Var = null;
        }
        nyo0Var.getClass();
        int m = (int) Preference.m(22L, "THEME_TIMETABLE", "HOUR_START");
        nyo0 nyo0Var2 = this.P;
        if (nyo0Var2 == null) {
            nyo0Var2 = null;
        }
        nyo0Var2.getClass();
        labelSettingsView.setSubtitle(pvo0.n(m, (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_START"), requireContext));
        LabelSettingsView labelSettingsView2 = this.O;
        if (labelSettingsView2 == null) {
            labelSettingsView2 = null;
        }
        Context requireContext2 = requireContext();
        nyo0 nyo0Var3 = this.P;
        if (nyo0Var3 == null) {
            nyo0Var3 = null;
        }
        nyo0Var3.getClass();
        int m2 = (int) Preference.m(8L, "THEME_TIMETABLE", "HOUR_END");
        nyo0 nyo0Var4 = this.P;
        (nyo0Var4 != null ? nyo0Var4 : null).getClass();
        labelSettingsView2.setSubtitle(pvo0.n(m2, (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_END"), requireContext2));
    }

    public final void fo(wzs wzsVar, int i, int i2) {
        FragmentManager supportFragmentManager;
        FragmentActivity kn = kn();
        AppCompatActivity appCompatActivity = kn instanceof AppCompatActivity ? (AppCompatActivity) kn : null;
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
            return;
        }
        b.d dVar = new b.d();
        dVar.d(DateFormat.is24HourFormat(mo2getContext()) ? 1 : 0);
        dVar.b(i);
        dVar.c(i2);
        b a2 = dVar.a();
        a2.Td(supportFragmentManager, b.class.getName());
        a2.x.add(new mkc(1, wzsVar, a2));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P = (nyo0) oyo0.a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_dark_theme_timetable, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
        toolbar.setTitle(getString(R.string.sett_appearance_dark_timetable));
        toolbar.setNavigationOnClickListener(new d27(this, 2));
        this.N = (LabelSettingsView) view.findViewById(R.id.time_table_start_item);
        this.O = (LabelSettingsView) view.findViewById(R.id.time_table_end_item);
        LabelSettingsView labelSettingsView = this.N;
        if (labelSettingsView == null) {
            labelSettingsView = null;
        }
        labelSettingsView.setOnClickListener(new isk(this, 0));
        LabelSettingsView labelSettingsView2 = this.O;
        (labelSettingsView2 != null ? labelSettingsView2 : null).setOnClickListener(new jsk(this, 0));
        eo();
    }
}
