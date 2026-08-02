package com.vk.clips.entrypoints.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.bwt0;
import xsna.cb;
import xsna.g60;
import xsna.p3t;
import xsna.pds;
import xsna.rl3;
import xsna.yrn0;
import xsna.z1h0;

/* compiled from: ClipsEntryPointsFragment.kt */
/* loaded from: classes16.dex */
public final class b extends ViewPager2.g {
    public final /* synthetic */ ClipsEntryPointsFragment d;
    public final /* synthetic */ ClipsEntryPointsFragment.b e;
    public final /* synthetic */ yrn0 f;

    public b(ClipsEntryPointsFragment clipsEntryPointsFragment, ClipsEntryPointsFragment.b bVar, yrn0 yrn0Var) {
        this.d = clipsEntryPointsFragment;
        this.e = bVar;
        this.f = yrn0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        LinearLayout t9;
        ClipsEntryPointsFragment.b bVar = this.e;
        FrameLayout frameLayout = bVar.b;
        ClipsEntryPointsFragment clipsEntryPointsFragment = this.d;
        if (i == 0) {
            int i2 = ClipsEntryPointsFragment.i0;
            p3t io2 = clipsEntryPointsFragment.io();
            if (io2 == null || (t9 = io2.t9()) == null) {
                return;
            }
            for (View view : awt0.d((LinearLayout) rl3.L(awt0.d(t9)))) {
                if (view instanceof VkText) {
                    VkText vkText = (VkText) view;
                    clipsEntryPointsFragment.f0 = vkText;
                    if (vkText != null) {
                        bwt0.i0(vkText, new g60(clipsEntryPointsFragment, 29));
                    }
                }
            }
            frameLayout.removeAllViews();
            frameLayout.addView(t9);
        } else if (i == 1) {
            int i3 = ClipsEntryPointsFragment.i0;
            frameLayout.removeAllViews();
            ClipsEntryPointsFragment.fo(clipsEntryPointsFragment, bVar, clipsEntryPointsFragment.ko().getString(R.string.clips_entry_point_drafts));
        } else if (i == 2) {
            int i4 = ClipsEntryPointsFragment.i0;
            frameLayout.removeAllViews();
            ClipsEntryPointsFragment.fo(clipsEntryPointsFragment, bVar, clipsEntryPointsFragment.ko().getString(R.string.clips_entry_point_templates));
        } else if (i == 3) {
            int i5 = ClipsEntryPointsFragment.i0;
            frameLayout.removeAllViews();
            ClipsEntryPointsFragment.fo(clipsEntryPointsFragment, bVar, clipsEntryPointsFragment.ko().getString(R.string.clips_entry_point_trends));
            clipsEntryPointsFragment.lo();
        }
        int i6 = clipsEntryPointsFragment.a0;
        pds pdsVar = clipsEntryPointsFragment.Z;
        z1h0 F0 = this.f.F0(i);
        pds pdsVar2 = F0 instanceof pds ? (pds) F0 : null;
        clipsEntryPointsFragment.Z = pdsVar2;
        clipsEntryPointsFragment.a0 = i;
        if (i6 != i) {
            if (pdsVar != null) {
                pdsVar.J0();
            }
            if (pdsVar2 != null) {
                pdsVar2.i5(new cb(pdsVar2, 16));
            }
        }
    }
}
