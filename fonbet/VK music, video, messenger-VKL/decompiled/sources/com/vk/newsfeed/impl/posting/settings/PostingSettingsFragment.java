package com.vk.newsfeed.impl.posting.settings;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.view.settings.SettingsSwitchView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.fnj;
import xsna.gz80;
import xsna.hd60;
import xsna.hpc0;
import xsna.iah0;
import xsna.ies;
import xsna.krv0;
import xsna.lva0;
import xsna.m6r0;
import xsna.nds;
import xsna.p90;
import xsna.ptj;
import xsna.su80;
import xsna.xlc0;

/* compiled from: PostingSettingsFragment.kt */
/* loaded from: classes4.dex */
public final class PostingSettingsFragment extends BaseMvpFragment<Object> implements View.OnClickListener, ies, nds {
    public static final int d0 = iah0.a(8);
    public xlc0 T;
    public SettingsSwitchView U;
    public SettingsSwitchView V;
    public SettingsSwitchView W;
    public SettingsSwitchView X;
    public View Y;
    public View Z;
    public TextView a0;
    public View b0;
    public final a c0 = new a();

    /* compiled from: PostingSettingsFragment.kt */
    public static final class a implements hpc0 {
        @Override // xsna.hpc0
        public final boolean a() {
            return hd60.a().a().e(m6r0.t);
        }

        @Override // xsna.hpc0
        public final boolean b() {
            return hd60.a().a().e(m6r0.s);
        }
    }

    public static void jo(SettingsSwitchView settingsSwitchView) {
        if (settingsSwitchView != null) {
            settingsSwitchView.setPadding(settingsSwitchView.getPaddingLeft(), settingsSwitchView.getPaddingTop(), d0, settingsSwitchView.getPaddingBottom());
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final Object io() {
        return this.T;
    }

    public final void ko(boolean z) {
        View view = this.Y;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    public final void lo(String str) {
        TextView textView = this.a0;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void mo(boolean z) {
        View view = this.Z;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PostingSettingsFragment postingSettingsFragment;
        View view2;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.posting_settings_close_button) {
            this.T.b();
            return;
        }
        if ((valueOf != null && valueOf.intValue() == R.id.posting_settings_set_source_layout) || (valueOf != null && valueOf.intValue() == R.id.postings_settings_set_source_subtitle)) {
            xlc0 xlc0Var = this.T;
            ptj ptjVar = xlc0Var.e;
            FragmentActivity activity = xlc0Var.b.getActivity();
            if (activity != null) {
                ptjVar.a(activity, null);
                TextView textView = ptjVar.d;
                if (textView != null) {
                    textView.setEnabled(false);
                    return;
                }
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.posting_settings_source_menu || (view2 = (postingSettingsFragment = this.T.b).b0) == null) {
            return;
        }
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view2.getContext();
        e.b bVar = new e.b(view2, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        VkContextMenu.c.c(bVar, R.string.fave_tags_change, null, false, null, new lva0(postingSettingsFragment, 5), 30);
        VkContextMenu.c.c(bVar, R.string.delete, null, false, null, new su80(postingSettingsFragment, 10), 30);
        bVar.j();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.T = new xlc0(this, this.c0, getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_posting_settings, viewGroup, false);
        SettingsSwitchView settingsSwitchView = (SettingsSwitchView) viewGroup2.findViewById(R.id.posting_settings_facebook);
        jo(settingsSwitchView);
        this.U = settingsSwitchView;
        SettingsSwitchView settingsSwitchView2 = (SettingsSwitchView) viewGroup2.findViewById(R.id.posting_settings_twitter);
        jo(settingsSwitchView2);
        this.V = settingsSwitchView2;
        SettingsSwitchView settingsSwitchView3 = (SettingsSwitchView) viewGroup2.findViewById(R.id.posting_settings_comments_closing);
        jo(settingsSwitchView3);
        this.W = settingsSwitchView3;
        SettingsSwitchView settingsSwitchView4 = (SettingsSwitchView) viewGroup2.findViewById(R.id.posting_settings_disable_notifications);
        jo(settingsSwitchView4);
        this.X = settingsSwitchView4;
        View findViewById = viewGroup2.findViewById(R.id.posting_settings_set_source_layout);
        findViewById.setOnClickListener(this);
        this.Y = findViewById;
        View findViewById2 = viewGroup2.findViewById(R.id.posting_settings_source_layout);
        findViewById2.setOnClickListener(this);
        this.Z = findViewById2;
        this.a0 = (TextView) viewGroup2.findViewById(R.id.posting_setting_source_link_text);
        View findViewById3 = viewGroup2.findViewById(R.id.posting_settings_source_menu);
        findViewById3.setOnClickListener(this);
        this.b0 = findViewById3;
        TextView textView = (TextView) viewGroup2.findViewById(R.id.postings_settings_set_source_subtitle);
        textView.setText(textView.getContext().getString(R.string.posting_settings_set_source_description));
        viewGroup2.findViewById(R.id.posting_settings_close_button).setOnClickListener(this);
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.b0 = null;
        this.a0 = null;
        this.Z = null;
        this.Y = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || !gz80.a(23) || fnj.d(activity)) {
            return;
        }
        p90.b(activity, krv0.l(R.attr.vk_ui_background_modal), false);
    }
}
