package com.vk.debug.ui.user;

import android.os.Bundle;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vk.web.view.marker.di.WebViewMarkerComponent;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ajx0;
import xsna.bk1;
import xsna.et;
import xsna.fpf0;
import xsna.h7;
import xsna.j7;
import xsna.l7;
import xsna.m7m;
import xsna.o25;
import xsna.pa;
import xsna.qo9;
import xsna.w11;

/* compiled from: DebugUserSettingsFragment.kt */
/* loaded from: classes17.dex */
public final class DebugUserSettingsFragment extends MaterialPreferenceFragment {
    public static final /* synthetic */ int l0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.preference.Preference] */
    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Preference findPreference;
        boolean z;
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_debug_user);
        Preference findPreference2 = findPreference("__dbg_log_to_file");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (L.q()) {
            findPreference2.F(false);
            findPreference2.I("Уже включено");
        } else {
            findPreference2.g = new bk1(ref$ObjectRef, 12);
        }
        Preference findPreference3 = findPreference("__dbg_webview");
        if (findPreference3 != null) {
            findPreference3.f = new w11(11);
        }
        if (!o25.a().b()) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("logging");
            ?? preference = new Preference(this.R);
            preference.J("Файлы с логами");
            preference.g = new l7(this, 17);
            preferenceCategory.O(preference);
            if (!L.q()) {
                L.a.getClass();
                if (L.z() != null) {
                    z = true;
                    preference.F(z);
                    ref$ObjectRef.element = preference;
                }
            }
            z = false;
            preference.F(z);
            ref$ObjectRef.element = preference;
        }
        if (b.A.a(ClipsFeatures.CLIP_CREATE_SESSION_DATA_COLLECTOR) && (findPreference = findPreference("__dbg_log_clip_create")) != null) {
            findPreference.K(true);
            findPreference.g = new h7(this, 16);
        }
        findPreference("clearTrustedHash").g = new qo9(1, ((TrustedHashComponent) m7m.d(this).a(fpf0.a(TrustedHashComponent.class))).c(), this);
        findPreference("clearWebViewCache").g = new j7(this, 20);
        findPreference("clearStickersCache").g = new et(10);
        ajx0 m7 = ((WebViewMarkerComponent) m7m.d(this).mo408a(fpf0.a(WebViewMarkerComponent.class))).m7();
        Preference findPreference4 = findPreference("showWebViewMarker");
        CheckBoxPreference checkBoxPreference = findPreference4 instanceof CheckBoxPreference ? (CheckBoxPreference) findPreference4 : null;
        if (checkBoxPreference != null) {
            checkBoxPreference.K(BuildInfo.p());
        }
        if (checkBoxPreference != null) {
            checkBoxPreference.O(m7.isEnabled());
        }
        if (checkBoxPreference != null) {
            checkBoxPreference.f = new pa(m7, 14);
        }
        findPreference("other").K(checkBoxPreference != null ? checkBoxPreference.z : false);
    }
}
