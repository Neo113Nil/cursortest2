package com.vk.newsfeed.impl.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.bottomsheet.internal.b;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetTreeCommentsFragment;
import com.vk.newsfeed.impl.views.NoSwipePaginatedView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b2c0;
import xsna.b7s0;
import xsna.bjc;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c9c0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.fae;
import xsna.fnj;
import xsna.g3f0;
import xsna.gcs0;
import xsna.h88;
import xsna.iah0;
import xsna.ics0;
import xsna.k0m0;
import xsna.lfg;
import xsna.msy;
import xsna.pvh0;
import xsna.rp1;
import xsna.sbs0;
import xsna.t11;
import xsna.u3g0;
import xsna.us90;
import xsna.v5t0;
import xsna.vdg;
import xsna.wrl0;
import xsna.xh5;
import xsna.yg5;
import xsna.z2f0;

/* compiled from: VideoBottomSheetTreeCommentsFragment.kt */
/* loaded from: classes4.dex */
public final class VideoBottomSheetTreeCommentsFragment extends VideoBottomSheetCommentsFragment {
    public static final /* synthetic */ int l1 = 0;
    public sbs0 h1;
    public final b7s0 i1 = new View.OnLayoutChangeListener() { // from class: xsna.b7s0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int height;
            int i9 = VideoBottomSheetTreeCommentsFragment.l1;
            boolean s = iah0.s(view.getContext());
            VideoBottomSheetTreeCommentsFragment videoBottomSheetTreeCommentsFragment = VideoBottomSheetTreeCommentsFragment.this;
            if (s) {
                height = fnj.a(videoBottomSheetTreeCommentsFragment.mo2getContext());
            } else {
                height = (int) ((1.0f - (!iah0.s(view.getContext()) ? 1.0f : 0.75f)) * view.getHeight());
            }
            RecyclerPaginatedView recyclerPaginatedView = videoBottomSheetTreeCommentsFragment.W;
            if (recyclerPaginatedView != null) {
                f4m.q(height, recyclerPaginatedView);
            }
        }
    };
    public final Object j1;
    public final v5t0 k1;

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.b7s0] */
    public VideoBottomSheetTreeCommentsFragment() {
        k0m0 k0m0Var = new k0m0(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, k0m0Var);
        v5t0 v5t0Var = new v5t0(this, this.J);
        b2c0 b2c0Var = new b2c0(v5t0Var.G, this.y0);
        b2c0Var.n = new PostViewFragment.b();
        b2c0Var.m = this.z0;
        this.s0 = b2c0Var;
        Lazy a = msy.a(lazyThreadSafetyMode, new wrl0(this, 13));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new pvh0(this, 15));
        gcs0 gcs0Var = new gcs0(new ics0(a2), new fae(a2), a, this, v5t0Var, null);
        v5t0Var.H = gcs0Var;
        this.t0 = new vdg(gcs0Var, gcs0Var.K, new g3f0((z2f0) null, 3), this.A0);
        this.C0 = gcs0Var;
        this.S = gcs0Var;
        this.k1 = v5t0Var;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void Ae() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.suppressLayout(true);
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment, com.vk.newsfeed.impl.fragments.PostViewFragment
    public final c9c0 Co() {
        return this.k1;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Df() {
        sbs0 sbs0Var;
        if (t11.d()) {
            Context requireContext = requireContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(requireContext) || !iah0.s(requireContext()) || (sbs0Var = this.h1) == null) {
                return;
            }
            sbs0Var.c();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Jo() {
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        lfgVar.o8();
        lfg lfgVar2 = this.C0;
        if (lfgVar2 == null) {
            lfgVar2 = null;
        }
        lfgVar2.p8(R.attr.vk_ui_text_accent);
        lfg lfgVar3 = this.C0;
        if (lfgVar3 == null) {
            lfgVar3 = null;
        }
        dhr0.a.getClass();
        lfgVar3.m8(e3m.f(R.attr.vk_ui_text_secondary, dhr0.s()));
        lfg lfgVar4 = this.C0;
        (lfgVar4 != null ? lfgVar4 : null).l8(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final void Ko(RecyclerPaginatedView recyclerPaginatedView) {
        super.Ko(recyclerPaginatedView);
        NoSwipePaginatedView noSwipePaginatedView = recyclerPaginatedView instanceof NoSwipePaginatedView ? (NoSwipePaginatedView) recyclerPaginatedView : null;
        if (noSwipePaginatedView != null) {
            noSwipePaginatedView.setTitleTextSize((int) iah0.y(21));
        }
        if (noSwipePaginatedView != null) {
            noSwipePaginatedView.setTitleTranslationX(iah0.a(56));
        }
        if (noSwipePaginatedView != null) {
            noSwipePaginatedView.setIconMarginVertical(iah0.a(4));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final b Mo() {
        us90 us90Var = new us90(requireContext(), BottomSheetCommentsFragment.f1);
        h88 h88Var = (h88) this.c1.getValue();
        return h88Var != null ? h88Var.c(requireContext(), us90Var) : us90Var;
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final View.OnLayoutChangeListener Qo() {
        return this.i1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final ColorDrawable So() {
        return (ColorDrawable) this.j1.getValue();
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final void To() {
        yg5 yg5Var;
        VideoFile A;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null || (A = yg5Var.A()) == null) {
            return;
        }
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_VIDEO;
        }
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, A.r(), null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick(MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick.Event.COMMENTS_TO_FULLSCREEN), 2)).q();
    }

    @Override // com.vk.newsfeed.impl.fragments.VideoBottomSheetCommentsFragment, com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final void Uo() {
        super.Uo();
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            dhr0.a.getClass();
            ColorDrawable colorDrawable = new ColorDrawable(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                writeBar.setBackground(colorDrawable);
            }
            int ceil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 52);
            EditText editText = u3g0Var.f;
            if (editText != null) {
                editText.setMinHeight(ceil);
            }
            EditText editText2 = u3g0Var.f;
            if (editText2 != null) {
                editText2.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
            }
            int f = e3m.f(R.attr.vk_ui_text_primary, dhr0.s());
            EditText editText3 = u3g0Var.f;
            if (editText3 != null) {
                editText3.setTextColor(f);
            }
            int f2 = e3m.f(R.attr.vk_ui_text_subhead, dhr0.s());
            EditText editText4 = u3g0Var.f;
            if (editText4 != null) {
                editText4.setHintTextColor(f2);
            }
            float f3 = 12;
            int a = iah0.a(f3);
            EditText editText5 = u3g0Var.f;
            if (editText5 != null) {
                f4m.x(a, editText5);
            }
            int ceil2 = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 28);
            ImageView imageView = u3g0Var.g;
            if (imageView != null) {
                bwt0.c0(ceil2, imageView);
            }
            ImageView imageView2 = u3g0Var.g;
            if (imageView2 != null) {
                bwt0.r0(ceil2, imageView2);
            }
            ImageView imageView3 = u3g0Var.g;
            if (imageView3 != null) {
                imageView3.setPadding(0, 0, 0, 0);
            }
            int a2 = iah0.a(16);
            int a3 = iah0.a(f3);
            int a4 = iah0.a(4);
            int a5 = iah0.a(f3);
            ImageView imageView4 = u3g0Var.g;
            if (imageView4 != null) {
                bwt0.e0(imageView4, a2, a3, a4, a5);
            }
            u3g0Var.C(e3m.f(R.attr.vk_ui_icon_secondary, dhr0.s()));
            WriteBar writeBar2 = u3g0Var.e;
            if (writeBar2 != null) {
                writeBar2.setWriteBarDividerVisible(true);
            }
            int f4 = e3m.f(R.attr.vk_ui_separator_primary, dhr0.s());
            WriteBar writeBar3 = u3g0Var.e;
            if (writeBar3 != null) {
                writeBar3.setWriteBarDividerColor(f4);
            }
            WriteBar writeBar4 = u3g0Var.e;
            if (writeBar4 != null) {
                writeBar4.setWriteBarDividerMarginHorizontal(0);
            }
            if (t11.d()) {
                View view = u3g0Var.i;
                f4m.s(iah0.a(f3), view);
                this.h1 = new sbs0(view, new rp1(26, u3g0Var, view));
            }
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_NO_VIDEO_COMMENT_ATTACH;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                u3g0Var.l();
            }
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void le() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.suppressLayout(false);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void s2() {
        sbs0 sbs0Var;
        if (!t11.d() || (sbs0Var = this.h1) == null) {
            return;
        }
        sbs0Var.b();
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            dhr0.a.getClass();
            window.setNavigationBarColor(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
        }
        return yn;
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final void Lo(RecyclerPaginatedView recyclerPaginatedView) {
    }
}
