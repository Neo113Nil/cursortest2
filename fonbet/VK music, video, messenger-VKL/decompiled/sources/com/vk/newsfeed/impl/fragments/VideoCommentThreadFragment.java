package com.vk.newsfeed.impl.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.afg;
import xsna.b25;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.fae;
import xsna.fxc0;
import xsna.g3f0;
import xsna.hvr0;
import xsna.iah0;
import xsna.ics0;
import xsna.jcf0;
import xsna.jes;
import xsna.k1;
import xsna.m3a;
import xsna.m3g0;
import xsna.msy;
import xsna.nds;
import xsna.nid0;
import xsna.o25;
import xsna.od6;
import xsna.oz50;
import xsna.sbs0;
import xsna.t11;
import xsna.u3g0;
import xsna.uds;
import xsna.vdg;
import xsna.x1e0;
import xsna.xbs0;
import xsna.xh5;
import xsna.yg5;
import xsna.yrn;
import xsna.z2f0;
import xsna.z4d0;

/* compiled from: VideoCommentThreadFragment.kt */
/* loaded from: classes4.dex */
public final class VideoCommentThreadFragment extends CommentThreadFragment implements jes, uds, nds {
    public static final /* synthetic */ int B0 = 0;
    public final xbs0 A0;
    public sbs0 z0;

    /* compiled from: VideoCommentThreadFragment.kt */
    public static final class a extends oz50 {
    }

    public VideoCommentThreadFragment() {
        nid0 nid0Var = new nid0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        xbs0 xbs0Var = new xbs0(new ics0(msy.a(lazyThreadSafetyMode, nid0Var)), new fae(msy.a(lazyThreadSafetyMode, new x1e0(this, 25))), msy.a(lazyThreadSafetyMode, new jcf0(this, 18)), this, null);
        this.q0 = new vdg(xbs0Var, xbs0Var.K, new g3f0((z2f0) null, 3), new m3a(3));
        this.S = xbs0Var;
        this.A0 = xbs0Var;
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final u3g0 Ao() {
        u3g0 u3g0Var = new u3g0(ko());
        xbs0 xbs0Var = this.A0;
        if (xbs0Var != null) {
            m3g0 m3g0Var = new m3g0(xbs0Var, u3g0Var, this.Z);
            xbs0Var.S = m3g0Var;
            u3g0Var.c = m3g0Var;
        }
        u3g0Var.v();
        ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            u3g0Var.u(viewGroup);
        }
        return u3g0Var;
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final int Bo() {
        return R.drawable.vk_video_comments_thread_divider;
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final afg Co() {
        return this.A0;
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final int Do() {
        return R.string.comment_only_replies;
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final void Eo() {
        yo();
        View view = getView();
        AppBarShadowView appBarShadowView = view != null ? (AppBarShadowView) view.findViewById(R.id.separatorTop) : null;
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(false);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final void Fo(yrn yrnVar) {
        if (t11.d()) {
            yrnVar.j = iah0.a(16.0f);
        } else {
            yrnVar.j = iah0.a(6.0f);
        }
        yrnVar.l(iah0.a(12.0f), iah0.a(6.0f), iah0.a(12.0f), iah0.a(6.0f));
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final void Go(RecyclerView recyclerView) {
        recyclerView.setPadding(0, 0, 0, 0);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        dhr0.a.getClass();
        return e3m.f(R.attr.vk_ui_background_content, dhr0.s());
    }

    @Override // xsna.woo0
    public final int o7() {
        dhr0.a.getClass();
        return e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s());
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        dhr0.a.getClass();
        Context s = dhr0.s();
        View view = getView();
        if (view != null) {
            view.post(new od6(7, this, s));
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u3g0 u3g0Var;
        EditText editText;
        View view2;
        u3g0 u3g0Var2;
        super.onViewCreated(view, bundle);
        xbs0 xbs0Var = this.A0;
        if (xbs0Var != null) {
            xbs0Var.o8();
        }
        if (xbs0Var != null) {
            xbs0Var.p8(R.attr.vk_ui_text_secondary);
        }
        if (xbs0Var != null) {
            dhr0.a.getClass();
            xbs0Var.m8(e3m.f(R.attr.vk_ui_text_secondary, dhr0.s()));
        }
        int i = R.attr.vk_ui_background_tertiary;
        if (xbs0Var != null) {
            dhr0.a.getClass();
            xbs0Var.l8(e3m.f(R.attr.vk_ui_background_tertiary, dhr0.s()));
        }
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.getClass();
        Context s = dhr0.s();
        View view3 = getView();
        if (view3 != null) {
            view3.post(new od6(7, this, s));
        }
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("arg_can_comment") : false;
        u3g0 u3g0Var3 = this.X;
        if (u3g0Var3 != null) {
            u3g0Var3.d = new z4d0(this, 28);
        }
        if (u3g0Var3 != null) {
            u3g0Var3.E(new k1(this, 16));
        }
        if (!z && (u3g0Var2 = this.X) != null) {
            u3g0Var2.c(requireContext().getString(R.string.disable_comment_video_text));
        }
        if (t11.d()) {
            u3g0 u3g0Var4 = this.X;
            if (u3g0Var4 != null && (view2 = u3g0Var4.i) != null) {
                f4m.x(iah0.a(12), view2);
            }
            u3g0 u3g0Var5 = this.X;
            if (u3g0Var5 != null && (editText = u3g0Var5.f) != null) {
                editText.setTextSize(2, 16.0f);
            }
        }
        u3g0 u3g0Var6 = this.X;
        if (u3g0Var6 != null) {
            int ceil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 52);
            EditText editText2 = u3g0Var6.f;
            if (editText2 != null) {
                editText2.setMinHeight(ceil);
            }
            EditText editText3 = u3g0Var6.f;
            if (editText3 != null) {
                editText3.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
            }
            dhr0Var.getClass();
            int f = e3m.f(R.attr.vk_ui_text_primary, dhr0.s());
            EditText editText4 = u3g0Var6.f;
            if (editText4 != null) {
                editText4.setTextColor(f);
            }
            int f2 = e3m.f(R.attr.vk_ui_text_subhead, dhr0.s());
            EditText editText5 = u3g0Var6.f;
            if (editText5 != null) {
                editText5.setHintTextColor(f2);
            }
            float f3 = 12;
            int a2 = iah0.a(f3);
            EditText editText6 = u3g0Var6.f;
            if (editText6 != null) {
                f4m.x(a2, editText6);
            }
            int ceil2 = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 28);
            ImageView imageView = u3g0Var6.g;
            if (imageView != null) {
                bwt0.c0(ceil2, imageView);
            }
            ImageView imageView2 = u3g0Var6.g;
            if (imageView2 != null) {
                bwt0.r0(ceil2, imageView2);
            }
            ImageView imageView3 = u3g0Var6.g;
            if (imageView3 != null) {
                imageView3.setPadding(0, 0, 0, 0);
            }
            int a3 = iah0.a(16);
            int a4 = iah0.a(f3);
            int a5 = iah0.a(4);
            int a6 = iah0.a(f3);
            ImageView imageView4 = u3g0Var6.g;
            if (imageView4 != null) {
                bwt0.e0(imageView4, a3, a4, a5, a6);
            }
            u3g0Var6.C(e3m.f(R.attr.vk_ui_icon_secondary, dhr0.s()));
            if (!fxc0.B().J().W()) {
                i = R.attr.vk_ui_separator_primary;
            }
            ColorDrawable colorDrawable = new ColorDrawable(e3m.f(i, dhr0.s()));
            WriteBar writeBar = u3g0Var6.e;
            if (writeBar != null) {
                writeBar.setBackground(colorDrawable);
            }
        }
        if (!t11.d() || (u3g0Var = this.X) == null) {
            return;
        }
        this.z0 = new sbs0(u3g0Var.i, new hvr0(u3g0Var, 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final Context qn() {
        dhr0.a.getClass();
        return dhr0.s();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void s2() {
        sbs0 sbs0Var;
        if (!t11.d() || (sbs0Var = this.z0) == null) {
            return;
        }
        sbs0Var.b();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final boolean t2() {
        b25 a2 = o25.a();
        requireContext();
        a2.getClass();
        return true;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void ua(boolean z) {
        WriteBar writeBar;
        if (!z) {
            u3g0 u3g0Var = this.X;
            if (u3g0Var != null) {
                u3g0Var.c(requireContext().getString(R.string.disable_comment_video_text));
                return;
            }
            return;
        }
        u3g0 u3g0Var2 = this.X;
        if (u3g0Var2 == null || (writeBar = u3g0Var2.e) == null) {
            return;
        }
        writeBar.n0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        yg5 yg5Var;
        VideoFile A;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_VIDEO;
        bpn0 bpn0Var = b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null || (A = yg5Var.A()) == null) {
            return;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, A.r(), null, 40, null);
    }

    @Override // com.vk.newsfeed.impl.fragments.CommentThreadFragment
    public final yrn zo(Drawable drawable) {
        return new yrn(iah0.a(1.0f), iah0.a(1.0f), drawable, drawable);
    }
}
