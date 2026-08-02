package com.vk.debug.ui.dev;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.X3;
import com.vk.api.internal.debug.FakeApiErrorTypes;
import com.vk.core.apps.BuildInfo;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.googleump.api.di.GoogleUMPComponent;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.log.L;
import com.vk.movika.sdk.base.hooks.k;
import com.vk.movika.sdk.base.model.n;
import com.vk.overlaymenu.di.OverlayMenuComponent;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import com.vk.pushes.PushComponent;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.toggle.features.CoreFeatures;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import defpackage.k0;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import xsna.a1w;
import xsna.a3l;
import xsna.a3r0;
import xsna.a4l;
import xsna.a5l;
import xsna.aa6;
import xsna.ai3;
import xsna.asu0;
import xsna.at;
import xsna.b3l;
import xsna.b4l;
import xsna.b8;
import xsna.b9;
import xsna.bg7;
import xsna.bk1;
import xsna.bt;
import xsna.c4l;
import xsna.c8;
import xsna.ca6;
import xsna.cvk;
import xsna.d3l;
import xsna.dg1;
import xsna.dky;
import xsna.do3;
import xsna.e05;
import xsna.e10;
import xsna.e40;
import xsna.e4l;
import xsna.e7;
import xsna.e8;
import xsna.eeu0;
import xsna.epx;
import xsna.eq;
import xsna.er;
import xsna.erj;
import xsna.f4l;
import xsna.ft0;
import xsna.g4l;
import xsna.g7;
import xsna.gp;
import xsna.gv;
import xsna.h7;
import xsna.h7u0;
import xsna.h8;
import xsna.hq;
import xsna.iah0;
import xsna.itg0;
import xsna.iw3;
import xsna.j22;
import xsna.j4l;
import xsna.j6i;
import xsna.j7;
import xsna.jh;
import xsna.jq;
import xsna.ju1;
import xsna.k4l;
import xsna.k7;
import xsna.k840;
import xsna.kb;
import xsna.kf3;
import xsna.kn6;
import xsna.l4;
import xsna.l4l;
import xsna.l7;
import xsna.l8;
import xsna.lh3;
import xsna.lhg;
import xsna.lp0;
import xsna.lq;
import xsna.m4l;
import xsna.m6r0;
import xsna.m7m;
import xsna.mj1;
import xsna.mm6;
import xsna.mq;
import xsna.n4l;
import xsna.n7;
import xsna.nb;
import xsna.np1;
import xsna.nq;
import xsna.ntl;
import xsna.nu0;
import xsna.nz;
import xsna.o25;
import xsna.o2l;
import xsna.o40;
import xsna.o4l;
import xsna.o7;
import xsna.od6;
import xsna.oq;
import xsna.p11;
import xsna.p4l;
import xsna.pb;
import xsna.pi0;
import xsna.pj4;
import xsna.ps2;
import xsna.q1w;
import xsna.q40;
import xsna.q6r0;
import xsna.q7;
import xsna.qa;
import xsna.qb9;
import xsna.qj4;
import xsna.qno0;
import xsna.qq;
import xsna.r11;
import xsna.r3l;
import xsna.rj4;
import xsna.rt0;
import xsna.rx0;
import xsna.s11;
import xsna.s41;
import xsna.sf3;
import xsna.sj4;
import xsna.sq;
import xsna.t11;
import xsna.t34;
import xsna.tef0;
import xsna.tf3;
import xsna.tr;
import xsna.tt0;
import xsna.u11;
import xsna.u3l;
import xsna.uef0;
import xsna.uek;
import xsna.uf3;
import xsna.up;
import xsna.ur;
import xsna.ux0;
import xsna.v34;
import xsna.vff;
import xsna.vj0;
import xsna.vp;
import xsna.vr;
import xsna.vx6;
import xsna.w290;
import xsna.w63;
import xsna.w8i;
import xsna.wjy;
import xsna.wr;
import xsna.x34;
import xsna.xao0;
import xsna.xl0;
import xsna.xr;
import xsna.y4l;
import xsna.y7;
import xsna.yh1;
import xsna.yi2;
import xsna.yq;
import xsna.z4l;
import xsna.z7;
import xsna.z8;
import xsna.zak0;
import xsna.zn;

/* loaded from: classes17.dex */
public class DebugDevSettingsFragment extends MaterialPreferenceFragment implements w8i {
    public static final String[] t0 = {"apiHost", "oauthHost", X3.s, "vkUiHostUri", "spaUri", "awayPhpDomain", "forceOverrideDomain"};
    public boolean l0 = false;
    public boolean m0 = false;
    public boolean n0 = false;
    public final a1w o0;
    public androidx.appcompat.app.d p0;
    public final HashSet q0;
    public final HashSet r0;
    public final io.reactivex.rxjava3.disposables.b s0;

    public static class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public DebugDevSettingsFragment() {
        a1w a1wVar = q1w.a;
        this.o0 = a1wVar == null ? null : a1wVar;
        new Handler(Looper.getMainLooper());
        this.q0 = new HashSet();
        this.r0 = new HashSet();
        this.s0 = new io.reactivex.rxjava3.disposables.b();
    }

    public static void jo() {
        cvk.w("Изменения вступят в силу после перезапуска приложения!", false);
    }

    public final void ho() {
        if (!com.vk.toggle.b.A.a(CoreFeatures.OVERLAY_MENU)) {
            io("overlay_menu");
            return;
        }
        if (!q6r0.f().B()) {
            io("overlay_menu");
            return;
        }
        w290 Z5 = ((OverlayMenuComponent) j6i.b(m7m.f(this), OverlayMenuComponent.class)).Z5();
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("__dbg_is_enabled");
        if (checkBoxPreference != null) {
            checkBoxPreference.O(Z5.getConfig().getEnabled());
            checkBoxPreference.f = new erj(this, Z5);
        }
        findPreference("__dbg_restore_button_position").g = new yi2(Z5, 15);
    }

    public final void io(String str) {
        PreferenceCategory preferenceCategory;
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("preferences_debug");
        if (preferenceScreen == null || (preferenceCategory = (PreferenceCategory) findPreference(str)) == null) {
            return;
        }
        preferenceScreen.R(preferenceCategory);
    }

    public final void ko() {
        u3l u3lVar = new u3l();
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(kn());
        c.h0("Настройки изменены");
        c.a.f = "Настройки будут применены при следующем запуске";
        c.d0("OK", u3lVar);
        c.X("Kill app", u3lVar);
        c.m();
    }

    public final void lo(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Preference[] preferenceArr = {findPreference("__dbg_call_webrtc_sdp_filtering"), findPreference("__dbg_call_webrtc_sdp_video_codecs"), findPreference("__dbg_call_webrtc_sdp_audio_codecs")};
        for (int i = 0; i < 3; i++) {
            Preference preference = preferenceArr[i];
            if (preference != null) {
                preference.F(booleanValue);
            }
        }
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        VkBuildAppStore vkBuildAppStore;
        Lazy lazy;
        dky.a aVar;
        KnetExecutorType knetExecutorType;
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_debug_developer);
        this.n0 = BuildInfo.h();
        o2l.a.getClass();
        this.l0 = o2l.f();
        this.m0 = TextUtils.equals((String) q6r0.f().a(m6r0.q), "app_developer");
        int i2 = 17;
        int i3 = 7;
        int i4 = 8;
        final int i5 = 0;
        if (this.l0 || q6r0.f().B() || !BuildInfo.m()) {
            Preference findPreference = findPreference("__removeInternalPrefix");
            if (findPreference != null) {
                findPreference.f = new eq(i4);
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = t0;
            for (int i6 = 0; i6 < 7; i6++) {
                arrayList.add(findPreference(strArr[i6]));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Preference preference = (Preference) it.next();
                preference.g = new c4l(this, preference);
            }
            Preference findPreference2 = findPreference("mockApiResponses");
            if (findPreference2 != null) {
                findPreference2.g = new pi0(this, i2);
            }
        } else {
            io("domains");
        }
        final int i7 = 1;
        boolean z = this.l0 || this.m0;
        Preference findPreference3 = findPreference("__dbg_log_method_tracing");
        if (findPreference3 != null) {
            findPreference3.K(z);
        }
        boolean z2 = o25.a().i().O;
        Preference findPreference4 = findPreference("__dbg_nav_drawer_bug_tracker");
        if (findPreference4 != null) {
            findPreference4.K(z2);
        }
        sf3 sf3Var = new sf3(6);
        Preference findPreference5 = findPreference("__dbg_nav_drawer_bug_tracker");
        if (findPreference5 != null) {
            findPreference5.f = sf3Var;
        }
        Preference findPreference6 = findPreference("__dbg_nav_drawer_debug_menu");
        if (findPreference6 != null) {
            findPreference6.f = sf3Var;
        }
        Preference findPreference7 = findPreference("__dbg_log_to_file");
        if (L.q()) {
            findPreference7.F(false);
            findPreference7.I("Уже включено");
        } else {
            findPreference7.g = new sf3(i3);
        }
        Preference findPreference8 = findPreference("__dbg_force_send");
        int i8 = 9;
        if (findPreference8 != null) {
            findPreference8.f = new vr(i8);
        }
        Preference findPreference9 = findPreference("__dbg_force_send_firebase");
        int i9 = 12;
        if (findPreference9 != null) {
            findPreference9.f = new wr(i9);
        }
        Preference findPreference10 = findPreference("__dbg_webview");
        if (findPreference10 != null) {
            findPreference10.f = new xr(i9);
        }
        Preference findPreference11 = findPreference("__dbg_network_stat_force");
        int i10 = 10;
        if (findPreference11 != null) {
            findPreference11.F(BuildInfo.h());
            findPreference11.f = new io.reactivex.rxjava3.processors.b(this, i10);
        }
        Preference findPreference12 = findPreference("__dbg_view_post_time_overlay");
        int i11 = 16;
        if (findPreference12 != null) {
            findPreference12.f = new xl0(this, i11);
        }
        Preference findPreference13 = findPreference("__dbg_view_post_time_info");
        int i12 = 11;
        if (findPreference13 != null) {
            findPreference13.f = new io.reactivex.rxjava3.subjects.c(this, i12);
        }
        Preference findPreference14 = findPreference("__dbg_post_visualize_by_mrc");
        if (findPreference14 != null) {
            findPreference14.f = new a3l(this);
        }
        Preference findPreference15 = findPreference("__dbg_allow_requests_breakpoints");
        if (findPreference15 != null) {
            findPreference15.f = new p11(this, i8);
        }
        Preference findPreference16 = findPreference("__dbg_mem_leak");
        if (findPreference16 != null) {
            findPreference16.f = new r11(this, i8);
        }
        Preference findPreference17 = findPreference("__dbg_log_native_exceptions");
        if (findPreference17 != null) {
            findPreference17.f = new s11(i4);
        }
        Preference findPreference18 = findPreference("__dbg_api_max_length");
        if (findPreference18 != null) {
            o2l.a.getClass();
            int i13 = com.vk.core.preference.Preference.j().getInt("__dbg_api_max_length", 0);
            findPreference18.I(i13 < 1 ? "Без ограничений" : Integer.toString(i13));
            findPreference18.g = new Preference.c(this) { // from class: xsna.c3l
                public final /* synthetic */ DebugDevSettingsFragment c;

                {
                    this.c = this;
                }

                @Override // androidx.preference.Preference.c
                public final boolean eh(Preference preference2) {
                    int i14 = i7;
                    DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                    switch (i14) {
                        case 0:
                            String[] strArr2 = DebugDevSettingsFragment.t0;
                            l7m f = m7m.f(debugDevSettingsFragment);
                            ((VkHealthPermissionsComponent) j6i.b(f, VkHealthPermissionsComponent.class)).Wb().j(debugDevSettingsFragment.requireContext(), RequestedMiniApp.VK_STEPS, null, new defpackage.m(12, debugDevSettingsFragment, ((VkStepsComponent) j6i.b(f, VkStepsComponent.class)).l3()));
                            break;
                        default:
                            String[] strArr3 = DebugDevSettingsFragment.t0;
                            eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.mo2getContext()));
                            c2801a.b = "Установить максимальную длину ответа API";
                            c2801a.d = "После установленного количества символов ответ будет обрезан!";
                            c2801a.s = new zh3(debugDevSettingsFragment);
                            c2801a.c(R.string.debug_api_version_button_reset, new dv4(debugDevSettingsFragment, 5), true);
                            c2801a.g();
                            break;
                    }
                    return true;
                }
            };
        }
        boolean z3 = this.l0 || this.m0;
        Preference findPreference19 = findPreference("__dbg_webview");
        if (findPreference19 != null) {
            findPreference19.K(z3);
        }
        Preference findPreference20 = findPreference("__dbg_api_cycle_calls");
        if (findPreference20 != null) {
            findPreference20.g = new t11(this, i12);
        }
        Preference findPreference21 = findPreference("__dbg_log_eruda_mini_app");
        int i14 = 15;
        if (findPreference21 != null) {
            findPreference21.f = new u11(i14);
        }
        Preference findPreference22 = findPreference("__dbg_log_onevideo_dev_env");
        if (findPreference22 != null) {
            findPreference22.K(this.l0);
            findPreference22.f = new tr(this, i8);
        }
        Preference findPreference23 = findPreference("__dbg_log_clip_create");
        if (findPreference23 != null) {
            findPreference23.g = new Preference.c(this) { // from class: xsna.z2l
                public final /* synthetic */ DebugDevSettingsFragment c;

                {
                    this.c = this;
                }

                @Override // androidx.preference.Preference.c
                public final boolean eh(Preference preference2) {
                    int i15 = i5;
                    DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                    switch (i15) {
                        case 0:
                            String[] strArr2 = DebugDevSettingsFragment.t0;
                            ArrayList<String> arrayList2 = hti0.a;
                            hti0.b(debugDevSettingsFragment.requireContext());
                            break;
                        default:
                            String[] strArr3 = DebugDevSettingsFragment.t0;
                            debugDevSettingsFragment.ko();
                            break;
                    }
                    return true;
                }
            };
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("catalog");
        int i15 = 14;
        if (preferenceCategory != null) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("__dbg_catalog_ignore_unknown");
            if (BuildInfo.h()) {
                checkBoxPreference.f = new com.vk.movika.sdk.android.defaultplayer.interactive.c(i10);
                Preference preference2 = new Preference(this.R);
                preference2.J(preference2.b.getString(R.string.catalog_dbg_menu_open_sandbox_catalog));
                preference2.g = new e40(this, i10);
                preferenceCategory.O(preference2);
                Preference preference3 = new Preference(this.R);
                preference3.J(preference3.b.getString(R.string.catalog_dbg_menu_open_sandbox_catalog_in_alert_dialog));
                preference3.g = new o40(this, i15);
                preferenceCategory.O(preference3);
            } else {
                preferenceCategory.R(checkBoxPreference);
            }
        }
        if (BuildInfo.h()) {
            Preference findPreference24 = findPreference("__dbg_websocket_incoming_message");
            if (findPreference24 != null) {
                findPreference24.g = new qa(this, i2);
            }
            Preference findPreference25 = findPreference("__dbg_websocket_outgoing_message");
            if (findPreference25 != null) {
                findPreference25.g = new Preference.c(this) { // from class: xsna.e3l
                    public final /* synthetic */ DebugDevSettingsFragment c;

                    {
                        this.c = this;
                    }

                    @Override // androidx.preference.Preference.c
                    public final boolean eh(Preference preference4) {
                        int i16 = i5;
                        DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                        switch (i16) {
                            case 0:
                                String[] strArr2 = DebugDevSettingsFragment.t0;
                                ((ntl) new bzb0(debugDevSettingsFragment.requireContext()).b.getValue()).a(new ntl.a(10, "{\"action\":\"subscribe_to_channels\",\"payload\":{\"channels\":{\"-228078782\":9,\"-227936146\":1556},\"user\":9686709}}", null, "", ""), new nfj(debugDevSettingsFragment, 3));
                                break;
                            default:
                                String[] strArr3 = DebugDevSettingsFragment.t0;
                                TrustedHashComponent trustedHashComponent = (TrustedHashComponent) j6i.b(m7m.f(debugDevSettingsFragment), TrustedHashComponent.class);
                                asu0.a.getClass();
                                asu0.n().execute(new m52(trustedHashComponent, 2));
                                break;
                        }
                        return true;
                    }
                };
            }
        }
        int i16 = 13;
        int i17 = 20;
        if (((PreferenceCategory) findPreference("music")) != null && BuildInfo.h()) {
            Preference findPreference26 = findPreference("__dbg_music_ad_slot_id");
            if (findPreference26 != null) {
                o2l.a.getClass();
                int i18 = com.vk.core.preference.Preference.j().getInt("__dbg_music_ad_slot_id", 0);
                findPreference26.I(i18 == 0 ? "Slot id" : lhg.a(i18, ""));
                findPreference26.g = new z7(this, i17);
            }
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("__dbg_music_debug_advertisement");
            checkBoxPreference2.f = new hq(i8);
            checkBoxPreference2.O(checkBoxPreference2.n());
            Preference findPreference27 = findPreference("__dbg_music_ad_banner_test_slot_id");
            if (findPreference26 != null) {
                o2l.a.getClass();
                int i19 = com.vk.core.preference.Preference.j().getInt("__dbg_music_ad_banner_test_slot_id", 0);
                findPreference27.I(i19 == 0 ? "Slot id" : lhg.a(i19, ""));
                findPreference27.g = new b8(this, 18);
            }
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference("__dbg_music_debug_advertisement_player_banner");
            checkBoxPreference3.f = new jq(i9);
            o2l.a.getClass();
            checkBoxPreference3.O(o2l.b("__dbg_music_debug_advertisement_player_banner", false));
            CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) findPreference("__dbg_music_debug_player_logging");
            checkBoxPreference4.f = new lq(i9);
            checkBoxPreference4.O(k840.b.C3169b.a);
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) findPreference("__dbg_music_debug_short_sleep_time");
            checkBoxPreference5.f = new mq(i16);
            checkBoxPreference5.O(k840.b.c.a);
            CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) findPreference("__dbg_music_debug_update_downloaded_music_restrictions_short_time");
            checkBoxPreference6.f = new l4(i16);
            checkBoxPreference6.O(k840.b.e.a);
            CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) findPreference("__dbg_music_debug_sync_offline_configs_short_time");
            checkBoxPreference7.f = new nq(i4);
            checkBoxPreference7.O(k840.b.d.a);
            CheckBoxPreference checkBoxPreference8 = (CheckBoxPreference) findPreference("__dbg_music_debug_headphone_notification_short_time");
            checkBoxPreference8.f = new oq(i8);
            k840.b.a.a = checkBoxPreference8.n();
            Preference findPreference28 = findPreference("__dbg_music_debug_clear_background_restriction_times");
            if (findPreference28 != null) {
                findPreference28.I("Ограничений за сутки: " + k840.a.c.b());
                findPreference28.g = new lh3(findPreference28, i8);
            }
        }
        findPreference("clearTrustedHash").g = new Preference.c(this) { // from class: xsna.e3l
            public final /* synthetic */ DebugDevSettingsFragment c;

            {
                this.c = this;
            }

            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference4) {
                int i162 = i7;
                DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                switch (i162) {
                    case 0:
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        ((ntl) new bzb0(debugDevSettingsFragment.requireContext()).b.getValue()).a(new ntl.a(10, "{\"action\":\"subscribe_to_channels\",\"payload\":{\"channels\":{\"-228078782\":9,\"-227936146\":1556},\"user\":9686709}}", null, "", ""), new nfj(debugDevSettingsFragment, 3));
                        break;
                    default:
                        String[] strArr3 = DebugDevSettingsFragment.t0;
                        TrustedHashComponent trustedHashComponent = (TrustedHashComponent) j6i.b(m7m.f(debugDevSettingsFragment), TrustedHashComponent.class);
                        asu0.a.getClass();
                        asu0.n().execute(new m52(trustedHashComponent, 2));
                        break;
                }
                return true;
            }
        };
        findPreference("clearWebViewCache").g = new Preference.c(this) { // from class: xsna.f3l
            public final /* synthetic */ DebugDevSettingsFragment c;

            {
                this.c = this;
            }

            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference4) {
                int i20 = i7;
                DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                switch (i20) {
                    case 0:
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        Context context = e43.a;
                        bg7.g.getClass();
                        io.reactivex.rxjava3.core.x a2 = bg7.b.a(context);
                        asu0 asu0Var = asu0.a;
                        debugDevSettingsFragment.s0.b(a2.q(asu0Var.c()).m(asu0Var.d()).subscribe(new gr(10)));
                        break;
                    default:
                        String[] strArr3 = DebugDevSettingsFragment.t0;
                        debugDevSettingsFragment.getClass();
                        new WebView(debugDevSettingsFragment.getActivity()).clearCache(true);
                        break;
                }
                return true;
            }
        };
        findPreference("clearStickersCache").g = new y4l();
        findPreference("clearСommunitiesCache").g = new z4l();
        findPreference("clearSuperAppMenuCache").g = new a5l();
        findPreference("__dbg_terminate").g = new up(this, i4);
        findPreference("__dbg_copy_firebase_token").g = new vp(i10);
        findPreference("clearBlockstore").g = new Preference.c(this) { // from class: xsna.f3l
            public final /* synthetic */ DebugDevSettingsFragment c;

            {
                this.c = this;
            }

            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference4) {
                int i20 = i5;
                DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                switch (i20) {
                    case 0:
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        Context context = e43.a;
                        bg7.g.getClass();
                        io.reactivex.rxjava3.core.x a2 = bg7.b.a(context);
                        asu0 asu0Var = asu0.a;
                        debugDevSettingsFragment.s0.b(a2.q(asu0Var.c()).m(asu0Var.d()).subscribe(new gr(10)));
                        break;
                    default:
                        String[] strArr3 = DebugDevSettingsFragment.t0;
                        debugDevSettingsFragment.getClass();
                        new WebView(debugDevSettingsFragment.getActivity()).clearCache(true);
                        break;
                }
                return true;
            }
        };
        findPreference("__dbg_re_register_firebase").g = new Preference.c(this) { // from class: xsna.g3l
            public final /* synthetic */ DebugDevSettingsFragment c;

            {
                this.c = this;
            }

            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference4) {
                int i20 = i5;
                final DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                switch (i20) {
                    case 0:
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        m6r0 f = q6r0.f();
                        r55 r55Var = r55.a;
                        f35.a(e43.a);
                        f.v();
                        uev0 sc = ((PushComponent) j6i.b(m7m.d(debugDevSettingsFragment), PushComponent.class)).sc();
                        sc.b(f.k(), new fn4(9));
                        cvk.w("Регистрация Firebase отменена", false);
                        com.vk.core.preference.Preference.h(e43.a, 0, "gcm").edit().clear().apply();
                        i0q0.d(1000L, new g0(sc, 10));
                        break;
                    default:
                        String[] strArr3 = DebugDevSettingsFragment.t0;
                        o2l.a.getClass();
                        final int i21 = com.vk.core.preference.Preference.j().getInt("__dbg_video_ad_slot_id", 0);
                        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
                        c2801a.b = "Video ad slot id";
                        c2801a.s = new wzs(debugDevSettingsFragment, i21) { // from class: xsna.s3l
                            public final /* synthetic */ int b;

                            {
                                this.b = i21;
                            }

                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                EditText editText = (EditText) obj;
                                TextView textView = (TextView) obj2;
                                String[] strArr4 = DebugDevSettingsFragment.t0;
                                editText.setInputType(2);
                                editText.setHint("Slot id");
                                int i22 = this.b;
                                editText.setText(i22 != 0 ? lhg.a(i22, "") : "");
                                editText.addTextChangedListener(new c5l(textView));
                                return null;
                            }
                        };
                        c2801a.c(R.string.ok, new u61(debugDevSettingsFragment, 3), true);
                        c2801a.g();
                        break;
                }
                return true;
            }
        };
        int i20 = 19;
        if (this.l0) {
            findPreference("__dbg_test_bday").g = new mm6(this, i14);
            findPreference("__dbg_test_validation").g = new pb(this, i11);
            findPreference("__dbg_test_captcha").g = new iw3(this, i8);
            findPreference("__dbg_test_crash").g = new yq(i10);
            findPreference("__dbg_test_anr").g = new j(i9);
            CheckBoxPreference checkBoxPreference9 = (CheckBoxPreference) findPreference("__dbg_test_soloader");
            NativeLibLoader.a.getClass();
            checkBoxPreference9.O(com.vk.core.preference.Preference.j().getBoolean("had_problems_with_system_load", false));
            checkBoxPreference9.f = new nz(this, i14);
            findPreference("__dbg_spa_uri").f = new dg1(this, i14);
            findPreference("__dbg_image_loading").g = new pj4(this, 17);
            findPreference("__dgb_push_friend_request_redesign").g = new z8(this, 11);
            findPreference("__dbg_test_im_serializer_error").g = new qj4(this, i8);
            findPreference("__dbg_test_im_sql_error").g = new e8(this, i11);
            findPreference("__dbg_test_im_cycle_cmd_invocation").g = new nu0(this, 17);
            findPreference("__dbg_test_im_engine_start_failure").g = new h8(this, i14);
            findPreference("__dbg_test_network_images_stat").g = new lh3(this, i10);
            findPreference("__dbg_test_on_low_memory").g = new kb(this, 24);
            findPreference("__dbg_test_oom").g = new jh(11);
            findPreference("__dbg_multicc_delete_vk_account").g = new qq(this, i4);
            findPreference("__dbg_vkid_copy_utility_tokens").g = new ju1(this, i20);
            findPreference("__dbg_click_timeout_enabled").f = new sq(i4);
            findPreference("__dbg_start_cpu_intensive_task_service").g = new gv(this, i14);
            findPreference("__dbg_vkid_suspicious_auth_test").g = new kf3(this, i14);
        }
        Preference findPreference29 = findPreference("__dbg_network_executor");
        if (findPreference29 != null) {
            wjy.a.getClass();
            wjy.a aVar2 = wjy.c;
            if (aVar2 == null || (aVar = aVar2.h) == null || (knetExecutorType = (KnetExecutorType) aVar.invoke()) == null) {
                throw new IllegalStateException("#init() not called!");
            }
            findPreference29.I(knetExecutorType.getId());
            findPreference29.g = new q40(this, i9);
        }
        Preference findPreference30 = findPreference("__dbg_network_clear_internal_state");
        if (findPreference30 != null) {
            findPreference30.g = new lp0(this, i11);
        }
        wjy wjyVar = wjy.a;
        wjyVar.getClass();
        uek b = wjy.b();
        Preference findPreference31 = findPreference("__dbg_network_netlog_write");
        if (findPreference31 != null) {
            if (b.a()) {
                findPreference31.J("Network: NetLog: start");
            } else {
                findPreference31.J("Network: NetLog: stop");
            }
            findPreference31.f = new vff(this, b);
        }
        Preference findPreference32 = findPreference("__dbg_network_netlog_clear");
        if (findPreference32 != null) {
            findPreference32.g = new r3l(this);
        }
        Preference findPreference33 = findPreference("__dbg_network_netlog_send");
        if (findPreference33 != null) {
            findPreference33.g = new np1(this, i16);
        }
        Preference findPreference34 = findPreference("__dbg_network_net_store");
        if (findPreference34 != null) {
            findPreference34.g = new ft0(this, 21);
        }
        Preference findPreference35 = findPreference("__dbg_network_disable_zstd_msgpack_quic");
        if (findPreference35 != null) {
            findPreference35.g = new a3l(this);
        }
        Preference findPreference36 = findPreference("__dbg_test_xowner_allowed_methods");
        if (findPreference36 != null) {
            findPreference36.g = new ux0(this, 20);
        }
        Preference findPreference37 = findPreference("__dbg_test_xowner_disable_allowed_methods");
        if (findPreference37 != null) {
            findPreference37.g = new b3l(this);
        }
        Preference findPreference38 = findPreference("__dbg_network_fake_safety_net");
        if (findPreference38 != null) {
            findPreference38.g = new ai3(this, i11);
        }
        Preference findPreference39 = findPreference("__dbg_network_fake_push_token");
        if (findPreference39 != null) {
            findPreference39.g = new k(this, i20);
        }
        Preference findPreference40 = findPreference("__dbg_msg_pack_disabled");
        if (findPreference40 != null) {
            findPreference40.g = new s41(this, 14);
        }
        Preference findPreference41 = findPreference("__dbg_network_tools");
        if (findPreference41 != null) {
            findPreference41.g = new mj1(this, i14);
        }
        Preference findPreference42 = findPreference("__dbg_knet_detailed_log");
        if (findPreference42 != null) {
            findPreference42.f = new vx6(this, i8);
        }
        Preference findPreference43 = findPreference("__dbg_flipper_layout_plugin_enabled");
        if (findPreference43 != null) {
            findPreference43.g = new e05(this, i11);
        }
        Preference findPreference44 = findPreference("__dbg_ignore_perf_score_session_timeout");
        if (findPreference44 != null) {
            findPreference44.g = new Preference.c(this) { // from class: xsna.z2l
                public final /* synthetic */ DebugDevSettingsFragment c;

                {
                    this.c = this;
                }

                @Override // androidx.preference.Preference.c
                public final boolean eh(Preference preference22) {
                    int i152 = i7;
                    DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                    switch (i152) {
                        case 0:
                            String[] strArr2 = DebugDevSettingsFragment.t0;
                            ArrayList<String> arrayList2 = hti0.a;
                            hti0.b(debugDevSettingsFragment.requireContext());
                            break;
                        default:
                            String[] strArr3 = DebugDevSettingsFragment.t0;
                            debugDevSettingsFragment.ko();
                            break;
                    }
                    return true;
                }
            };
        }
        DevicePerformanceInfo a2 = DevicePerformanceInfo.a.a();
        Preference findPreference45 = findPreference("__dbg_perf_class_disk");
        String str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (findPreference45 != null) {
            findPreference45.J(a2 != null ? a2.b.name() : GrsBaseInfo.CountryCodeSource.UNKNOWN);
        }
        Preference findPreference46 = findPreference("__dbg_perf_class_memory");
        if (findPreference46 != null) {
            findPreference46.J(a2 != null ? a2.e.name() : GrsBaseInfo.CountryCodeSource.UNKNOWN);
        }
        Preference findPreference47 = findPreference("__dbg_perf_class_cpu");
        if (findPreference47 != null) {
            findPreference47.J(a2 != null ? a2.a.name() : GrsBaseInfo.CountryCodeSource.UNKNOWN);
        }
        Preference findPreference48 = findPreference("__dbg_perf_class_overall");
        if (findPreference48 != null) {
            if (a2 != null) {
                str2 = a2.d.name();
            }
            findPreference48.J(str2);
        }
        wjyVar.getClass();
        uek b2 = wjy.b();
        asu0.a.getClass();
        asu0.n().submit(new od6(i7, this, b2));
        Object[] objArr = {Pair.create("Default", NetworkClient.ClientType.CLIENT_DEFAULT), Pair.create("API", NetworkClient.ClientType.CLIENT_API), Pair.create("Web", NetworkClient.ClientType.CLIENT_WEB), Pair.create("Image Loader", NetworkClient.ClientType.CLIENT_IMAGE_LOADER), Pair.create("Player", NetworkClient.ClientType.CLIENT_PLAYER), Pair.create("Player downloader", NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER), Pair.create("SSE", NetworkClient.ClientType.CLIENT_SSE), Pair.create("Offline Music Downloader", NetworkClient.ClientType.CLIENT_OFFLINE_MUSIC_DOWNLOADER), Pair.create("WebSocket", NetworkClient.ClientType.WEB_SOCKET)};
        ArrayList arrayList2 = new ArrayList(9);
        for (int i21 = 0; i21 < 9; i21++) {
            Object obj = objArr[i21];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList2);
        final String[] strArr2 = (String[]) unmodifiableList.stream().map(new j4l()).toArray(new k4l());
        final MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) findPreference("__dbg_network_fail_on_request");
        multiSelectListPreference.W = (CharSequence[]) unmodifiableList.stream().map(new l4l()).toArray(new m4l());
        multiSelectListPreference.X = strArr2;
        Object[] objArr2 = {Pair.create("Socket timeout", FakeNetworkConditions.SOCKET_TIMEOUT), Pair.create("Server error (404)", FakeNetworkConditions.SERVER_ERROR), Pair.create("Sleep at every request", FakeNetworkConditions.SLOW_NETWORK)};
        ArrayList arrayList3 = new ArrayList(3);
        int i22 = 0;
        for (int i23 = 3; i22 < i23; i23 = 3) {
            Object obj2 = objArr2[i22];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
            i22++;
        }
        List unmodifiableList2 = Collections.unmodifiableList(arrayList3);
        final String[] strArr3 = (String[]) unmodifiableList2.stream().map(new n4l()).toArray(new o4l());
        final MultiSelectListPreference multiSelectListPreference2 = (MultiSelectListPreference) findPreference("__dbg_fake_network_conditions_to_fail_with");
        multiSelectListPreference2.W = (CharSequence[]) unmodifiableList2.stream().map(new qb9(1)).toArray(new p4l());
        multiSelectListPreference2.X = strArr3;
        Object[] objArr3 = {Pair.create("Too many requests (6)", FakeApiErrorTypes.API_ERROR_BACKOFF_API_CODE_6), Pair.create("Rate limit reached (29)", FakeApiErrorTypes.API_ERROR_BACKOFF_API_CODE_29)};
        ArrayList arrayList4 = new ArrayList(2);
        int i24 = 0;
        for (int i25 = 2; i24 < i25; i25 = 2) {
            Object obj3 = objArr3[i24];
            Objects.requireNonNull(obj3);
            arrayList4.add(obj3);
            i24++;
        }
        List unmodifiableList3 = Collections.unmodifiableList(arrayList4);
        final String[] strArr4 = (String[]) unmodifiableList3.stream().map(new e4l()).toArray(new kn6(1));
        final MultiSelectListPreference multiSelectListPreference3 = (MultiSelectListPreference) findPreference("__dbg_network_fail_api_errors_to_fail_with");
        multiSelectListPreference3.W = (CharSequence[]) unmodifiableList3.stream().map(new f4l(0)).toArray(new g4l());
        multiSelectListPreference3.X = strArr4;
        int i26 = 10;
        int i27 = 20;
        int i28 = 11;
        findPreference("__dbg_network_fail_on_request_mark_all").g = new Preference.c() { // from class: xsna.h4l
            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference4) {
                String[] strArr5 = DebugDevSettingsFragment.t0;
                ((CheckBoxPreference) DebugDevSettingsFragment.this.findPreference("__dbg_network_fail_on_request_knet")).O(true);
                String[] strArr6 = strArr2;
                HashSet hashSet = new HashSet(strArr6.length);
                for (String str3 : strArr6) {
                    Objects.requireNonNull(str3);
                    if (!hashSet.add(str3)) {
                        throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
                    }
                }
                multiSelectListPreference.O(Collections.unmodifiableSet(hashSet));
                String[] strArr7 = strArr3;
                HashSet hashSet2 = new HashSet(strArr7.length);
                for (String str4 : strArr7) {
                    Objects.requireNonNull(str4);
                    if (!hashSet2.add(str4)) {
                        throw new IllegalArgumentException("duplicate element: " + ((Object) str4));
                    }
                }
                multiSelectListPreference2.O(Collections.unmodifiableSet(hashSet2));
                String[] strArr8 = strArr4;
                HashSet hashSet3 = new HashSet(strArr8.length);
                for (String str5 : strArr8) {
                    Objects.requireNonNull(str5);
                    if (!hashSet3.add(str5)) {
                        throw new IllegalArgumentException("duplicate element: " + ((Object) str5));
                    }
                }
                multiSelectListPreference3.O(Collections.unmodifiableSet(hashSet3));
                return true;
            }
        };
        findPreference("__dbg_network_fail_on_request_reset_all").g = new Preference.c() { // from class: xsna.i4l
            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference4) {
                String[] strArr5 = DebugDevSettingsFragment.t0;
                DebugDevSettingsFragment debugDevSettingsFragment = DebugDevSettingsFragment.this;
                ((CheckBoxPreference) debugDevSettingsFragment.findPreference("__dbg_network_fail_on_request_knet")).O(false);
                ((EditTextPreference) debugDevSettingsFragment.findPreference("__dbg_network_fail_on_request_sleep_timeout")).O("0");
                Set<String> set = Collections.EMPTY_SET;
                multiSelectListPreference.O(set);
                multiSelectListPreference2.O(set);
                multiSelectListPreference3.O(set);
                return true;
            }
        };
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) findPreference("bugtracker");
        if (preferenceCategory2 != null) {
            o2l.a.getClass();
            if (!o2l.d() || !BuildInfo.f()) {
                preferenceCategory2.K(false);
            }
        }
        Preference findPreference49 = findPreference("__dbg_app_versions_list");
        if (findPreference49 != null) {
            findPreference49.g = new ps2(this, i14);
        }
        Preference findPreference50 = findPreference("__dbg_drop_bugtracker_token");
        if (findPreference50 != null) {
            findPreference50.g = new l8(this, i27);
        }
        Preference findPreference51 = findPreference("__dbg_voip_call_assessment_dialog");
        if (findPreference51 != null) {
            findPreference51.g = new e10(this, i20);
        }
        Preference findPreference52 = findPreference("__dbg_voip_v2_test");
        if (findPreference52 != null) {
            findPreference52.f = new gp(i26);
        }
        Preference findPreference53 = findPreference("__dbg_voip_ok_test_domain");
        if (findPreference53 != null) {
            findPreference53.l().registerOnSharedPreferenceChangeListener(new a4l());
        }
        findPreference("__dbg_clear_voip_ok_state").g = new tf3(6);
        findPreference("__dbg_voip_libwebrtc_native_sigsegv").g = new uf3(4);
        Preference findPreference54 = findPreference("__dbg_voip_call_effects_dynamic_debug_enabled_");
        Preference findPreference55 = findPreference("__dbg_call_effects_dynamic_debug_err_resp_enabled_");
        if (findPreference54 != null && findPreference55 != null) {
            o2l.a.getClass();
            findPreference55.F(o2l.b("__dbg_dyn_gesture_detection_enabled_", false));
            findPreference54.f = new q7(findPreference55, i14);
        }
        Preference findPreference56 = findPreference("__dbg_call_webrtc_sdp_munging");
        if (findPreference56 != null) {
            findPreference56.f = new b3l(this);
            o2l.a.getClass();
            lo(Boolean.valueOf(o2l.b("__dbg_call_webrtc_sdp_munging", false)));
        }
        Preference findPreference57 = findPreference("__dbg_log_method_tracing");
        if (findPreference57 != null) {
            findPreference57.f = new ur(i28);
        }
        Preference findPreference58 = findPreference("__dbg_dyn_masks_enabled_");
        Preference findPreference59 = findPreference("__dbg_dyn_masks_err_resp_enabled_");
        if (findPreference58 != null && findPreference59 != null) {
            o2l.a.getClass();
            findPreference59.F(o2l.b("__dbg_dyn_masks_enabled_", false));
            findPreference58.f = new bk1(findPreference59, i28);
        }
        Preference findPreference60 = findPreference("__dbg_dyn_gesture_detection_enabled_");
        Preference findPreference61 = findPreference("__dbg_dyn_gesture_detection_err_resp_enabled_");
        if (findPreference60 != null && findPreference61 != null) {
            o2l.a.getClass();
            findPreference61.F(o2l.b("__dbg_dyn_gesture_detection_enabled_", false));
            findPreference60.f = new y7(findPreference61, i14);
        }
        Preference findPreference62 = findPreference("__dbg_dyn_filters_enabled_");
        Preference findPreference63 = findPreference("__dbg_dyn_filters_err_resp_enabled_");
        if (findPreference62 != null && findPreference63 != null) {
            o2l.a.getClass();
            findPreference63.F(o2l.b("__dbg_dyn_filters_enabled_", false));
            findPreference62.f = new tt0(findPreference63, 16);
        }
        Preference findPreference64 = findPreference("__dbg_nav_stat_view_enabled_");
        if (findPreference64 != null) {
            i = 12;
            findPreference64.g = new t34(this, i);
        } else {
            i = 12;
        }
        Preference findPreference65 = findPreference("__dbg_stat_navi_enabled_");
        if (findPreference65 != null) {
            findPreference65.g = new do3(this, i);
        }
        Preference findPreference66 = findPreference("__dbg_stat_app_starts_daily_check_");
        if (findPreference66 != null) {
            findPreference66.g = new v34(this, 8);
        }
        Preference findPreference67 = findPreference("__dbg_proxy_enable");
        boolean h = BuildInfo.h();
        if (findPreference67 != null) {
            findPreference67.f = new s11(7);
        }
        Preference findPreference68 = findPreference("__dbg_rx_crash");
        if (findPreference68 != null) {
            findPreference68.g = new g7(this, 16);
        }
        Preference findPreference69 = findPreference("__dbg_allow_iar_with_crashes");
        if (findPreference69 != null) {
            findPreference69.f = new at(this, i);
        }
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) findPreference("others");
        if (this.l0) {
            CheckBoxPreference checkBoxPreference10 = new CheckBoxPreference(this.R);
            checkBoxPreference10.J("Использовать анонимный токен");
            checkBoxPreference10.H("__dbg_use_anonymous_token");
            Boolean bool = Boolean.TRUE;
            checkBoxPreference10.w = bool;
            checkBoxPreference10.f = new r3l(this);
            preferenceCategory3.O(checkBoxPreference10);
            o2l.a.getClass();
            if (o2l.d() && BuildInfo.f()) {
                CheckBoxPreference checkBoxPreference11 = new CheckBoxPreference(this.R);
                checkBoxPreference11.J("Включить маркер версий");
                checkBoxPreference11.H("__dbg_screenshot_marker_new");
                checkBoxPreference11.w = bool;
                checkBoxPreference11.f = new zn(i28);
                preferenceCategory3.O(checkBoxPreference11);
            }
            Preference preference4 = new Preference(this.R);
            preference4.H("__dbg_help_hints");
            preference4.J(getString(R.string.debug_hints));
            preference4.g = new rx0(this, 17);
            preferenceCategory3.O(preference4);
            if (h) {
                Preference preference5 = new Preference(this.R);
                preference5.H("__dbg_copy_components");
                preference5.J(getString(R.string.components_title));
                preference5.g = new yh1(this, 13);
                preferenceCategory3.O(preference5);
                Preference preference6 = new Preference(this.R);
                preference6.H("__dbg_vk_onboarding");
                preference6.J(getString(R.string.debug_vk_onboarding));
                preference6.g = new x34(this, i28);
                preferenceCategory3.O(preference6);
            }
        }
        findPreference("__dbg_reset_accessibility_send_status").g = new bt(8);
        findPreference("__dbg_force_rebirth").g = new j7(this, i20);
        if (BuildInfo.h()) {
            Preference preference7 = new Preference(this.R);
            preference7.H("__dbg_app_store");
            preference7.J("Магазин приложений");
            o2l.a.getClass();
            VkBuildAppStore.a aVar3 = VkBuildAppStore.Companion;
            str = "";
            String c = o2l.c("__dbg_app_store", str);
            aVar3.getClass();
            VkBuildAppStore[] values = VkBuildAppStore.values();
            int length = values.length;
            int i29 = 0;
            while (true) {
                if (i29 >= length) {
                    vkBuildAppStore = null;
                    break;
                }
                vkBuildAppStore = values[i29];
                if (epx.f(vkBuildAppStore.i(), c)) {
                    break;
                } else {
                    i29++;
                }
            }
            if (vkBuildAppStore == null) {
                lazy = VkBuildAppStore.DEFAULT$delegate;
                vkBuildAppStore = (VkBuildAppStore) lazy.getValue();
            }
            preference7.I(vkBuildAppStore.i());
            preference7.g = new h7(this, i14);
            preferenceCategory3.O(preference7);
        } else {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            str = "";
        }
        Preference preference8 = new Preference(this.R);
        preference8.J("Тригер ошибки file not found у fresco");
        preference8.g = new er(i);
        preferenceCategory3.O(preference8);
        CheckBoxPreference checkBoxPreference12 = new CheckBoxPreference(this.R);
        checkBoxPreference12.J("Моментальная отправка ContentProvider метрик");
        checkBoxPreference12.H("__dbg_ignore_content_provider_session_timeout");
        checkBoxPreference12.w = Boolean.FALSE;
        checkBoxPreference12.f = new d3l(this);
        preferenceCategory3.O(checkBoxPreference12);
        findPreference("__dbg_simulate_web_crash").g = new k7(this, 13);
        findPreference("__dbg_simulate_fcm_error").g = new l7(this, 16);
        findPreference("__dbg_fetch_vk_workout_data").g = new rt0(this, i28);
        findPreference("__dbg_fetch_vk_workout_data_no_cache").g = new n7(this, i27);
        findPreference("__dbg_fetch_vk_workout_data_in_bg").g = new o7(this, i);
        findPreference("__dbg_fetch_vk_run_data_in_bg").g = new Preference.c(this) { // from class: xsna.c3l
            public final /* synthetic */ DebugDevSettingsFragment c;

            {
                this.c = this;
            }

            @Override // androidx.preference.Preference.c
            public final boolean eh(Preference preference22) {
                int i142 = i5;
                DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                switch (i142) {
                    case 0:
                        String[] strArr22 = DebugDevSettingsFragment.t0;
                        l7m f = m7m.f(debugDevSettingsFragment);
                        ((VkHealthPermissionsComponent) j6i.b(f, VkHealthPermissionsComponent.class)).Wb().j(debugDevSettingsFragment.requireContext(), RequestedMiniApp.VK_STEPS, null, new defpackage.m(12, debugDevSettingsFragment, ((VkStepsComponent) j6i.b(f, VkStepsComponent.class)).l3()));
                        break;
                    default:
                        String[] strArr32 = DebugDevSettingsFragment.t0;
                        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.mo2getContext()));
                        c2801a.b = "Установить максимальную длину ответа API";
                        c2801a.d = "После установленного количества символов ответ будет обрезан!";
                        c2801a.s = new zh3(debugDevSettingsFragment);
                        c2801a.c(R.string.debug_api_version_button_reset, new dv4(debugDevSettingsFragment, 5), true);
                        c2801a.g();
                        break;
                }
                return true;
            }
        };
        findPreference("__dbg_force_reload_vk_workout_widget").g = new d3l(this);
        findPreference("__dbg_force_update_vk_workout_widget_config").g = new e7(this, i27);
        String[] strArr5 = {"__dbg_use_alfa_id_test_domain", "__dbg_use_esia_test_domain"};
        for (int i30 = 0; i30 < 2; i30++) {
            Preference findPreference70 = findPreference(strArr5[i30]);
            if (findPreference70 != null) {
                findPreference70.K(h);
            }
        }
        Preference findPreference71 = findPreference("__dbg_file_manager");
        if (findPreference71 != null) {
            findPreference71.g = new bk1(this, 10);
        }
        CheckBoxPreference checkBoxPreference13 = (CheckBoxPreference) findPreference("__dbg_fresco_debug_overlay");
        o2l.a.getClass();
        checkBoxPreference13.O(o2l.b("__dbg_fresco_debug_overlay", false));
        checkBoxPreference13.f = new c8(this, 10);
        CheckBoxPreference checkBoxPreference14 = (CheckBoxPreference) findPreference("__dbg_thumbhash_debug_enabled_");
        checkBoxPreference14.O(o2l.b("__dbg_thumbhash_debug_enabled_", false));
        checkBoxPreference14.f = new nb(this, i);
        CheckBoxPreference checkBoxPreference15 = (CheckBoxPreference) findPreference("__dbg_recompose_highlighter");
        CheckBoxPreference checkBoxPreference16 = (CheckBoxPreference) findPreference("__dbg_recompose_logger");
        CheckBoxPreference checkBoxPreference17 = (CheckBoxPreference) findPreference("__dbg_compose_test_tag_drawing");
        checkBoxPreference15.O(((Boolean) ((zak0) tef0.a).getValue()).booleanValue());
        int i31 = 7;
        checkBoxPreference15.f = new n(i31);
        checkBoxPreference16.O(((Boolean) ((zak0) uef0.a).getValue()).booleanValue());
        checkBoxPreference16.f = new eq(i31);
        checkBoxPreference17.O(((Boolean) ((zak0) xao0.a).getValue()).booleanValue());
        checkBoxPreference17.f = new com.vk.movika.sdk.base.model.history.b(8);
        findPreference("__dbg_vk_ui_components").g = new y7(this, 14);
        Preference findPreference72 = findPreference("__dbg_video_ad_slot_id");
        if (findPreference72 != null) {
            int i32 = com.vk.core.preference.Preference.j().getInt("__dbg_video_ad_slot_id", 0);
            findPreference72.I(i32 != 0 ? lhg.a(i32, str) : "Slot id");
            final int i33 = 1;
            findPreference72.g = new Preference.c(this) { // from class: xsna.g3l
                public final /* synthetic */ DebugDevSettingsFragment c;

                {
                    this.c = this;
                }

                @Override // androidx.preference.Preference.c
                public final boolean eh(Preference preference42) {
                    int i202 = i33;
                    final DebugDevSettingsFragment debugDevSettingsFragment = this.c;
                    switch (i202) {
                        case 0:
                            String[] strArr22 = DebugDevSettingsFragment.t0;
                            m6r0 f = q6r0.f();
                            r55 r55Var = r55.a;
                            f35.a(e43.a);
                            f.v();
                            uev0 sc = ((PushComponent) j6i.b(m7m.d(debugDevSettingsFragment), PushComponent.class)).sc();
                            sc.b(f.k(), new fn4(9));
                            cvk.w("Регистрация Firebase отменена", false);
                            com.vk.core.preference.Preference.h(e43.a, 0, "gcm").edit().clear().apply();
                            i0q0.d(1000L, new g0(sc, 10));
                            break;
                        default:
                            String[] strArr32 = DebugDevSettingsFragment.t0;
                            o2l.a.getClass();
                            final int i212 = com.vk.core.preference.Preference.j().getInt("__dbg_video_ad_slot_id", 0);
                            eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
                            c2801a.b = "Video ad slot id";
                            c2801a.s = new wzs(debugDevSettingsFragment, i212) { // from class: xsna.s3l
                                public final /* synthetic */ int b;

                                {
                                    this.b = i212;
                                }

                                @Override // xsna.wzs
                                public final Object invoke(Object obj4, Object obj22) {
                                    EditText editText = (EditText) obj4;
                                    TextView textView = (TextView) obj22;
                                    String[] strArr42 = DebugDevSettingsFragment.t0;
                                    editText.setInputType(2);
                                    editText.setHint("Slot id");
                                    int i222 = this.b;
                                    editText.setText(i222 != 0 ? lhg.a(i222, "") : "");
                                    editText.addTextChangedListener(new c5l(textView));
                                    return null;
                                }
                            };
                            c2801a.c(R.string.ok, new u61(debugDevSettingsFragment, 3), true);
                            c2801a.g();
                            break;
                    }
                    return true;
                }
            };
        }
        Preference findPreference73 = findPreference("__dbg_video_ad_creative_type");
        if (findPreference73 != null) {
            String c2 = o2l.c("__dbg_video_ad_creative_type", str);
            int length2 = c2.length();
            while (true) {
                if (i5 >= length2) {
                    c2 = "creativeType";
                    break;
                }
                int codePointAt = c2.codePointAt(i5);
                if (!Character.isWhitespace(codePointAt)) {
                    break;
                } else {
                    i5 += Character.charCount(codePointAt);
                }
            }
            findPreference73.I(c2);
            findPreference73.g = new aa6(this, i);
        }
        Preference findPreference74 = findPreference("__dbg_video_choose_urls");
        if (findPreference74 != null) {
            findPreference74.g = new ca6(this, i28);
        }
        Preference findPreference75 = findPreference("__dbg_apply_spaces_chat");
        if (findPreference75 != null) {
            o2l.a.getClass();
            long j = BuildInfo.h() ? com.vk.core.preference.Preference.j().getLong("__dbg_apply_spaces_chat", 0L) : 0L;
            findPreference75.I(j == 0 ? "Peer id" : k0.a(j, str));
            findPreference75.g = new b9(this, i);
        }
        Preference findPreference76 = findPreference("__dbg_lp_sync_start_delay_ms");
        if (findPreference76 != null) {
            o2l.a.getClass();
            long j2 = BuildInfo.h() ? com.vk.core.preference.Preference.j().getLong("__dbg_lp_sync_start_delay_ms", 0L) : 0L;
            findPreference76.I(j2 == 0 ? "Delay (ms)" : k0.a(j2, str));
            findPreference76.g = new rj4(this, 9);
        }
        Preference findPreference77 = findPreference("__dbg_increment_phase");
        if (findPreference77 != null) {
            findPreference77.g = new sj4(this, i28);
        }
        Preference findPreference78 = findPreference("__dbg_messenger_user_life_time");
        if (findPreference78 != null) {
            findPreference78.g = new vj0(this, 14);
        }
        findPreference("__dbg_reset_google_ump_consent").g = new b4l(this, ((GoogleUMPComponent) j6i.b(m7m.f(this), GoogleUMPComponent.class)).P4());
        findPreference("__dbg_anonym_id").g = new kb((ClipboardManager) requireContext().getSystemService(ClipboardManager.class), 23);
        ho();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.s0.dispose();
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RoundedSearchView roundedSearchView = new RoundedSearchView(mo2getContext(), null, 6);
        ViewGroup viewGroup = (ViewGroup) this.O.getParent();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f = 8;
        marginLayoutParams.setMargins(iah0.a(f), iah0.a(f), iah0.a(f), 0);
        viewGroup.addView(roundedSearchView, marginLayoutParams);
        roundedSearchView.setFocusable(true);
        roundedSearchView.setFocusableInTouchMode(true);
        itg0.c(new qno0(roundedSearchView.d).subscribe(new j22(this, 22)), this);
        roundedSearchView.getViewTreeObserver().addOnPreDrawListener(new a3r0(roundedSearchView, new w63(4, this, roundedSearchView)));
    }
}
