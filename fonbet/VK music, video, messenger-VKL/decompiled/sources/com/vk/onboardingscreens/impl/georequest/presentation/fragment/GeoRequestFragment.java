package com.vk.onboardingscreens.impl.georequest.presentation.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import xsna.c63;
import xsna.iid0;
import xsna.kai;
import xsna.vds;
import xsna.y2;

/* compiled from: GeoRequestFragment.kt */
/* loaded from: classes.dex */
public final class GeoRequestFragment extends FragmentImpl implements vds {
    public static final /* synthetic */ int O = 0;
    public final a N = new a(this);

    /* compiled from: GeoRequestFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c63.b {
        public a(GeoRequestFragment geoRequestFragment) {
        }

        @Override // xsna.c63.b
        public final void u() {
            GeoRequestFragment.eo(SchemeStat$TypeRegistrationItem.EventType.SCREEN_BLUR);
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            GeoRequestFragment.eo(SchemeStat$TypeRegistrationItem.EventType.SCREEN_FOCUS);
        }
    }

    public static void eo(SchemeStat$TypeRegistrationItem.EventType eventType) {
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.REGISTRATION_GEO, SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeRegistrationItem(eventType, null, null, null, null, null, null, null, null, null, null, null, 4094, null), 3)).q();
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(-1784348556, new y2(this, 3)));
        c63 c63Var = c63.a;
        c63.a(this.N);
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c63 c63Var = c63.a;
        c63.c(this.N);
    }
}
