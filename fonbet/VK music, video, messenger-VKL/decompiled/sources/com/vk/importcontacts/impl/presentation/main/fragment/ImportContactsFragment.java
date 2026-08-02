package com.vk.importcontacts.impl.presentation.main.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.aa70;
import xsna.bzj;
import xsna.eeu0;
import xsna.h7u0;
import xsna.kai;
import xsna.m2h;
import xsna.msy;
import xsna.nv;
import xsna.o25;
import xsna.vds;
import xsna.vi0;
import xsna.w8i;

/* compiled from: ImportContactsFragment.kt */
/* loaded from: classes.dex */
public final class ImportContactsFragment extends FragmentImpl implements w8i, vds {
    public static final /* synthetic */ int Q = 0;
    public boolean N;
    public final Object O;
    public final Object P;

    public ImportContactsFragment() {
        bzj bzjVar = new bzj(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.O = msy.a(lazyThreadSafetyMode, bzjVar);
        this.P = msy.a(lazyThreadSafetyMode, new vi0(23));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Mf(-2, null);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 111 && i2 == -1) {
            Mf(-1, null);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.N = Preference.h(requireContext(), 0, "push_request_prefs").getBoolean(String.valueOf(o25.a().c().b), false);
        } catch (RuntimeException e) {
            L.f("ImportContactsFragment", "Failed to restore push dialog presence from shared prefs", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(565258941, new m2h(this, 3)));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("push_dialog_presented", this.N);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context B = B();
        if (B == null || Build.VERSION.SDK_INT < 33 || this.N) {
            return;
        }
        PermissionHelper.a.getClass();
        if (PermissionHelper.b(B, PermissionHelper.b)) {
            return;
        }
        this.N = true;
        try {
            UserId c = o25.a().c();
            SharedPreferences.Editor edit = Preference.h(requireContext(), 0, "push_request_prefs").edit();
            edit.putBoolean(String.valueOf(c.b), true);
            edit.commit();
        } catch (RuntimeException e) {
            L.f("ImportContactsFragment", "Failed to save push dialog presence from shared prefs", e);
        }
        (d.R() ? new h7u0.a(requireContext()) : new eeu0.a(requireContext())).a(false).B(R.string.import_contacts_dialog_push_title).q(R.string.import_contacts_dialog_push_message).setPositiveButton(R.string.import_contacts_dialog_button_text, new nv(this, 5)).m();
        ((aa70) this.P.getValue()).getClass();
        SharedPreferences.Editor edit2 = Preference.f("notification_gdpr_dialog").edit();
        edit2.putBoolean("dialog_already_shown", true);
        edit2.apply();
    }
}
