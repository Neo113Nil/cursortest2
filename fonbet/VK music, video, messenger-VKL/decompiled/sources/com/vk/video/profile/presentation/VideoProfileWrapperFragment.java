package com.vk.video.profile.presentation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.VideoProfileWrapperFragment;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Pair;
import xsna.b0u0;
import xsna.bfl;
import xsna.d6s0;
import xsna.dhr0;
import xsna.fnj;
import xsna.iah0;
import xsna.iut0;
import xsna.kes;
import xsna.krv0;
import xsna.nds;
import xsna.oz50;
import xsna.qah0;
import xsna.s200;
import xsna.sds;
import xsna.tds;
import xsna.u080;
import xsna.uds;
import xsna.yfb;
import xsna.z720;

/* compiled from: VideoProfileWrapperFragment.kt */
/* loaded from: classes6.dex */
public final class VideoProfileWrapperFragment extends FragmentImpl implements tds, sds, uds, kes, nds {
    public static final /* synthetic */ int O = 0;
    public final /* synthetic */ bfl N = new bfl();

    /* compiled from: VideoProfileWrapperFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.tds
    public final ColorStateList Oc() {
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        FragmentActivity activity = getActivity();
        Object v = activity != null ? s200.v(activity) : null;
        d6s0 d6s0Var = v instanceof d6s0 ? (d6s0) v : null;
        return new ColorStateList(iArr, new int[]{d6s0Var != null ? d6s0Var.a() : 0, d6s0Var != null ? d6s0Var.b() : 0});
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // xsna.kes
    public final boolean Xf() {
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        return fnj.d(requireContext);
    }

    @Override // xsna.sds
    public final int getBottomMargin() {
        return 0;
    }

    @Override // xsna.tds
    public final z720.a gf() {
        return this.N.gf();
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(com.vkontakte.android.R.attr.vk_ui_background_modal);
    }

    @Override // xsna.woo0
    public final int o7() {
        return dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_background_content);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(com.vkontakte.android.R.layout.vk_video_profile_wrapper, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Fragment H = getChildFragmentManager().H("profile-old");
        VideoProfileFragmentOld videoProfileFragmentOld = H instanceof VideoProfileFragmentOld ? (VideoProfileFragmentOld) H : null;
        if (videoProfileFragmentOld != null) {
            videoProfileFragmentOld.l0 = null;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Fragment H = getChildFragmentManager().H("profile-old");
        VideoProfileFragmentOld videoProfileFragmentOld = H instanceof VideoProfileFragmentOld ? (VideoProfileFragmentOld) H : null;
        if (videoProfileFragmentOld != null) {
            videoProfileFragmentOld.l0 = new qah0(this, 19);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            Bundle requireArguments = requireArguments();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable("user_id_key", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable("user_id_key");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            UserId userId = (UserId) parcelable;
            if (userId == null) {
                userId = UserId.d;
            }
            VideoProfileFragmentOld.a aVar = new VideoProfileFragmentOld.a(VideoProfileFragmentOld.class, null, null);
            int i = VideoProfileFragmentOld.p0;
            Pair pair = new Pair("VideoProfileFragment.user_id", userId);
            Pair pair2 = new Pair("VideoProfileFragment.is_navigation_back_button_visible", Boolean.TRUE);
            Pair pair3 = new Pair("VideoProfileFragment.search_stats_logging_info", null);
            Pair pair4 = new Pair("VideoProfileFragment.catalog_url", null);
            Boolean bool = Boolean.FALSE;
            aVar.j.putAll(yfb.b(pair, pair2, pair3, pair4, new Pair("VideoProfileFragment.is_own_channel", bool), new Pair("open_notify_settings", bool), new Pair("VideoProfileFragment.track_code", null)));
            FragmentImpl f = aVar.f();
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
            aVar2.g(com.vkontakte.android.R.id.profile_wrapper_container, f, "profile-old");
            aVar2.k(false);
        }
        u080 u080Var = new u080() { // from class: xsna.r9t0
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                int i2 = VideoProfileWrapperFragment.O;
                h4x j = bqx0Var.a.j(130);
                awt0.x(view, j.a, 0, j.c, 0, 2);
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, u080Var);
    }

    @Override // xsna.tds
    public final int qc() {
        return dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_background_content);
    }
}
