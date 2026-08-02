package com.vk.profilelist.impl.fragments;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.user.UserProfile;
import com.vk.profile.core.content.profilelist.fragments.AbsUserListFragment;
import com.vkontakte.android.R;
import xsna.ac;
import xsna.bpn0;
import xsna.cgq0;
import xsna.ekq0;
import xsna.eyd0;
import xsna.o0r0;
import xsna.xwk;
import xsna.z1h0;

/* compiled from: AbsProfileListTabFragment.kt */
/* loaded from: classes5.dex */
public abstract class AbsProfileListTabFragment extends AbsUserListFragment {
    public static final /* synthetic */ int P0 = 0;
    public final bpn0 O0 = new bpn0(new ac(this, 0));

    @Override // com.vk.profile.core.content.profilelist.fragments.AbsUserListFragment
    public final ekq0 Mo(ViewGroup viewGroup) {
        return Po() ? new cgq0(viewGroup) : new ekq0(viewGroup, R.layout.user_item, false, false);
    }

    @Override // com.vk.profile.core.content.profilelist.fragments.AbsUserListFragment
    public final void No(UserProfile userProfile) {
        FragmentActivity activity = getActivity();
        if (activity == null || userProfile == null) {
            return;
        }
        xwk.e().m(activity, userProfile.c, new o0r0.a(false, "clips", userProfile.J, null, null, null, null, false, false, false, false, null, null, null, 65529));
    }

    public final eyd0 Oo() {
        z1h0 parentFragment = getParentFragment();
        if (parentFragment instanceof eyd0) {
            return (eyd0) parentFragment;
        }
        return null;
    }

    public final boolean Po() {
        return ((Boolean) this.O0.getValue()).booleanValue();
    }
}
