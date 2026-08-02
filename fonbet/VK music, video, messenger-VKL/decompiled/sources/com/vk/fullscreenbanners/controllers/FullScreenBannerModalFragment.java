package com.vk.fullscreenbanners.controllers;

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.fullscreenbanners.api.dto.FullScreenBanner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.UUID;
import xsna.fnu0;
import xsna.kwu0;
import xsna.lwu0;
import xsna.mzp0;
import xsna.op5;
import xsna.pvs;
import xsna.qvs;
import xsna.rzp0;

/* compiled from: FullScreenBannerModalFragment.kt */
/* loaded from: classes16.dex */
public final class FullScreenBannerModalFragment extends CustomisableBottomSheetFragment<qvs> {
    public static final /* synthetic */ int T = 0;

    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment
    public final qvs eo() {
        FullScreenBanner fullScreenBanner;
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (fullScreenBanner = (FullScreenBanner) arguments.getParcelable("banner_arg")) == null) {
            throw new IllegalStateException("Null banner!");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("fullscreen_banner_session_uuid")) == null) {
            str = "";
        }
        mzp0 mzp0Var = null;
        if (str.length() == 0) {
            str = null;
        }
        UUID fromString = str != null ? UUID.fromString(str) : null;
        Context requireContext = requireContext();
        int i = kwu0.g;
        fnu0 fnu0Var = new fnu0(fullScreenBanner);
        op5 op5Var = new op5(0);
        lwu0 lwu0Var = new lwu0();
        lwu0Var.a = -10;
        pvs pvsVar = new pvs(fullScreenBanner, fnu0Var, op5Var, lwu0Var);
        if (fromString != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0Var = rzp0.e(fromString);
        }
        return new qvs(requireContext, pvsVar, mzp0Var);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        FullScreenBanner fullScreenBanner;
        Bundle arguments = getArguments();
        if (arguments == null || (fullScreenBanner = (FullScreenBanner) arguments.getParcelable("banner_arg")) == null) {
            return;
        }
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_FULLSCREEN_BANNER;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.AUDIO_FULLSCREEN_BANNER, Long.valueOf(fullScreenBanner.b), null, null, fullScreenBanner.c, null, 44, null);
    }
}
