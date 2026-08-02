package com.vk.im.settings.appearance;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.view.settings.RadioSettingsViewGroup;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.im.ui.themes.AccentColor;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import com.vk.im.ui.views.settings.LabelSettingsView;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.movika.sdk.base.observable.w;
import com.vkontakte.android.R;
import defpackage.n;
import defpackage.q0;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.single.v;
import xsna.asu0;
import xsna.bf2;
import xsna.bny;
import xsna.cew;
import xsna.cn70;
import xsna.dhr0;
import xsna.e43;
import xsna.h5;
import xsna.hz;
import xsna.io1;
import xsna.jjc;
import xsna.jpv;
import xsna.jz;
import xsna.mb;
import xsna.nc3;
import xsna.nyo0;
import xsna.nz;
import xsna.ob;
import xsna.ohl;
import xsna.oyo0;
import xsna.oz50;
import xsna.pc3;
import xsna.ps2;
import xsna.pvo0;
import xsna.qoy;
import xsna.qu;
import xsna.rc3;
import xsna.tc3;
import xsna.too0;
import xsna.uc3;
import xsna.vd1;
import xsna.vi;
import xsna.vl1;
import xsna.vzb;
import xsna.yb;
import xsna.yga0;

/* compiled from: AppearanceSettingsWithBackgroundsFragment.kt */
/* loaded from: classes2.dex */
public final class AppearanceSettingsWithBackgroundsFragment extends ImFragment implements too0 {
    public static final /* synthetic */ int b0 = 0;
    public CheckableLabelSettingsView Q;
    public CheckableLabelSettingsView R;
    public CheckableLabelSettingsView S;
    public CheckableLabelSettingsView T;
    public SwitchSettingsView U;
    public LabelSettingsView V;
    public SwitchSettingsView W;
    public TextView X;
    public CheckableLabelSettingsView Z;
    public final cew P = cew.b;
    public final Handler Y = new Handler(Looper.getMainLooper());
    public io.reactivex.rxjava3.disposables.c a0 = EmptyDisposable.INSTANCE;

    /* compiled from: AppearanceSettingsWithBackgroundsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(AppearanceSettingsWithBackgroundsFragment.class, null, null);
        }
    }

    /* compiled from: AppearanceSettingsWithBackgroundsFragment.kt */
    public static final class b extends ohl {
        @Override // xsna.ohl, android.text.style.ClickableSpan
        public final void onClick(View view) {
            view.getContext().startActivity(new Intent("android.settings.DISPLAY_SETTINGS"));
        }
    }

    /* compiled from: AppearanceSettingsWithBackgroundsFragment.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ThemeValues(isAutoThemeEnabled=");
            sb.append(this.a);
            sb.append(", isSystemThemeAvailable=");
            sb.append(this.b);
            sb.append(", isSystemThemeEnabled=");
            sb.append(this.c);
            sb.append(", isLightThemeEnabled=");
            sb.append(this.d);
            sb.append(", isDarkThemeEnabled=");
            return q0.a(sb, this.e, ')');
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        fo();
    }

    public final void eo() {
        SwitchSettingsView switchSettingsView = this.U;
        if (switchSettingsView == null) {
            switchSettingsView = null;
        }
        dhr0 dhr0Var = dhr0.a;
        int i = Build.VERSION.SDK_INT;
        int i2 = 8;
        switchSettingsView.setVisibility(i <= 29 ? 0 : 8);
        SwitchSettingsView switchSettingsView2 = this.U;
        if (switchSettingsView2 == null) {
            switchSettingsView2 = null;
        }
        switchSettingsView2.setChecked(dhr0.R());
        nyo0 nyo0Var = (nyo0) oyo0.a.getValue();
        Context requireContext = requireContext();
        nyo0Var.getClass();
        String n = pvo0.n((int) Preference.m(22L, "THEME_TIMETABLE", "HOUR_START"), (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_START"), requireContext);
        String n2 = pvo0.n((int) Preference.m(8L, "THEME_TIMETABLE", "HOUR_END"), (int) Preference.m(0L, "THEME_TIMETABLE", "MINUTE_END"), requireContext());
        LabelSettingsView labelSettingsView = this.V;
        if (labelSettingsView == null) {
            labelSettingsView = null;
        }
        if (dhr0.R() && i <= 29) {
            i2 = 0;
        }
        labelSettingsView.setVisibility(i2);
        LabelSettingsView labelSettingsView2 = this.V;
        (labelSettingsView2 != null ? labelSettingsView2 : null).setSubtitle(requireContext().getString(R.string.sett_appearance_list_item_timetable_sett_values, n, n2));
    }

    public final void fo() {
        v vVar = new v(new nc3());
        asu0 asu0Var = asu0.a;
        this.N.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new hz(new mb(this, 5), 4), new jz(new ob(2), 1)));
    }

    public final void go() {
        v vVar = new v(new rc3());
        asu0 asu0Var = asu0.a;
        this.N.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new bf2(new h5(this, 8), 1), new io1(new vd1(2), 2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        if (r11 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        if (r11 == null) goto L13;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(BuildInfo.t() ? R.layout.im_settings_appearance_fragment_v2 : R.layout.im_settings_appearance_fragment, viewGroup, false);
        ((ViewGroup) inflate.findViewById(R.id.settings_content)).getPaddingBottom();
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new pc3(this, 0));
        toolbar.setNavigationContentDescription(R.string.accessibility_back);
        this.Q = (CheckableLabelSettingsView) inflate.findViewById(R.id.auto_theme_btn);
        this.R = (CheckableLabelSettingsView) inflate.findViewById(R.id.system_theme_btn);
        this.S = (CheckableLabelSettingsView) inflate.findViewById(R.id.light_theme_btn);
        this.T = (CheckableLabelSettingsView) inflate.findViewById(R.id.dark_theme_btn);
        go();
        CheckableLabelSettingsView checkableLabelSettingsView = this.Q;
        if (!(checkableLabelSettingsView == null ? null : checkableLabelSettingsView).z) {
            checkableLabelSettingsView = this.R;
            if (!(checkableLabelSettingsView == null ? null : checkableLabelSettingsView).z) {
                checkableLabelSettingsView = this.S;
                if (!(checkableLabelSettingsView == null ? null : checkableLabelSettingsView).z) {
                }
            }
        }
        this.Z = checkableLabelSettingsView;
        TextView textView = (TextView) inflate.findViewById(R.id.hint);
        this.X = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.X;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setHighlightColor(dhr0.t.c(R.attr.vk_ui_text_accent));
        fo();
        this.U = (SwitchSettingsView) inflate.findViewById(R.id.time_table_switch);
        this.V = (LabelSettingsView) inflate.findViewById(R.id.time_table_item);
        eo();
        SwitchSettingsView switchSettingsView = this.U;
        if (switchSettingsView == null) {
            switchSettingsView = null;
        }
        switchSettingsView.setOnCheckListener(new nz(this, 3));
        LabelSettingsView labelSettingsView = this.V;
        (labelSettingsView != null ? labelSettingsView : null).setOnClickListener(new yb(this, 2));
        ((nyo0) oyo0.a.getValue()).getClass();
        this.a0 = new q(new yga0(6)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n(new w(this, 4), 3));
        ((RadioSettingsViewGroup) inflate.findViewById(R.id.change_theme_btn_group)).setOnCheckedChangeListener(new tc3(this));
        jjc.g(inflate.findViewById(R.id.vkim_chats_theme_item), new vl1(this, 2));
        SwitchSettingsView switchSettingsView2 = (SwitchSettingsView) inflate.findViewById(R.id.vkim_chats_theme_switch);
        this.P.getClass();
        switchSettingsView2.setChecked(!cew.d());
        switchSettingsView2.setOnCheckListener(new ps2(this, 1));
        this.W = switchSettingsView2;
        View findViewById = inflate.findViewById(R.id.settings_icon_chooser_block);
        View findViewById2 = inflate.findViewById(R.id.settings_icon_chooser_divider);
        TextView textView3 = (TextView) inflate.findViewById(R.id.settings_icon_chooser_header);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.settings_icon_chooser);
        TextView textView4 = (TextView) inflate.findViewById(R.id.settings_icon_shortcut_warning);
        bny.a.getClass();
        if (!bny.b().a(requireContext())) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            textView3.setVisibility(8);
            recyclerView.setVisibility(8);
            textView4.setVisibility(8);
        } else if (!inflate.isLaidOut() || inflate.isLayoutRequested()) {
            inflate.addOnLayoutChangeListener(new uc3(recyclerView, this));
        } else {
            jpv jpvVar = new jpv(recyclerView.getContext());
            IconLayoutManager iconLayoutManager = new IconLayoutManager(jpvVar.c.size() * cn70.b(80), recyclerView.getContext());
            recyclerView.setAdapter(jpvVar);
            recyclerView.setLayoutManager(iconLayoutManager);
            recyclerView.setHasFixedSize(true);
            int width = (recyclerView.getWidth() - cn70.b(80)) / 2;
            if (width < 0) {
                width = 0;
            }
            iconLayoutManager.K(jpvVar.f, width);
        }
        View findViewById3 = inflate.findViewById(R.id.settings_accent_color_selection_block);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
            requireContext();
            RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.settings_accent_color_selector);
            vi viVar = new vi(e43.a(AccentColor.NOT_SET, AccentColor.RED, AccentColor.ORANGE, AccentColor.GREEN, AccentColor.TURQUOISE, AccentColor.VIOLET, AccentColor.BLUE));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            recyclerView2.setAdapter(viVar);
            recyclerView2.setLayoutManager(linearLayoutManager);
            recyclerView2.setHasFixedSize(true);
        }
        View findViewById4 = inflate.findViewById(R.id.settings_chats_list_block);
        if (findViewById4 != null) {
            new vzb(findViewById4);
        }
        if (!BuildInfo.t()) {
            View findViewById5 = inflate.findViewById(R.id.vkim_chats_folders_item);
            findViewById5.setVisibility(0);
            jjc.g(findViewById5, new qu(this, 4));
        }
        return inflate;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Y.removeCallbacksAndMessages(null);
        this.a0.dispose();
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SwitchSettingsView switchSettingsView = this.W;
        if (switchSettingsView != null) {
            this.P.getClass();
            switchSettingsView.setChecked(!cew.d());
        }
    }
}
