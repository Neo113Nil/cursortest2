package com.vk.newsfeed.impl.postmodal.reactions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.VkSecondaryTabLayout;
import com.vk.core.view.components.tabs.d;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.Cnew;
import xsna.a230;
import xsna.ao50;
import xsna.b230;
import xsna.bwt0;
import xsna.ccr0;
import xsna.dhr0;
import xsna.epx;
import xsna.f4m;
import xsna.g88;
import xsna.gko;
import xsna.gm50;
import xsna.i130;
import xsna.j130;
import xsna.j4x;
import xsna.j5g;
import xsna.km50;
import xsna.l130;
import xsna.l7s;
import xsna.m130;
import xsna.m1k;
import xsna.mk50;
import xsna.msy;
import xsna.n130;
import xsna.o3w;
import xsna.oz50;
import xsna.pnv;
import xsna.q030;
import xsna.qcl;
import xsna.r130;
import xsna.r9k;
import xsna.tlo0;
import xsna.tq;
import xsna.tst;
import xsna.usn0;
import xsna.vk50;
import xsna.w8i;
import xsna.wsn0;
import xsna.xn50;
import xsna.xyp0;
import xsna.y130;
import xsna.yhu;
import xsna.z130;
import xsna.z1h0;

/* compiled from: ModalPostReactionsFragment.kt */
/* loaded from: classes4.dex */
public final class ModalPostReactionsFragment extends MviImplFragment<l130, b230, j130> implements TabLayout.d, w8i, i130, wsn0, g88 {
    public static final /* synthetic */ int f0 = 0;
    public CoordinatorLayout Q;
    public VkSecondaryTabLayout R;
    public ViewPager S;
    public ProgressBar T;
    public ViewGroup U;
    public ViewGroup V;
    public View W;
    public z130 X;
    public String Z;
    public String a0;
    public q030 e0;
    public final xyp0 Y = new xyp0(this);
    public boolean b0 = true;
    public final b c0 = new b();
    public final Object d0 = msy.a(LazyThreadSafetyMode.NONE, new Cnew(this, 6));

    /* compiled from: ModalPostReactionsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ModalPostReactionsFragment.kt */
    public static final class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            List<y130> list;
            TabLayout.g b;
            ccr0 ccr0Var;
            ImageSize Ab;
            ModalPostReactionsFragment modalPostReactionsFragment = ModalPostReactionsFragment.this;
            VkSecondaryTabLayout vkSecondaryTabLayout = modalPostReactionsFragment.R;
            int tabCount = vkSecondaryTabLayout != null ? vkSecondaryTabLayout.getTabCount() : 0;
            int i = 0;
            while (true) {
                if (i >= tabCount) {
                    break;
                }
                VkSecondaryTabLayout vkSecondaryTabLayout2 = modalPostReactionsFragment.R;
                if (vkSecondaryTabLayout2 != null && (b = vkSecondaryTabLayout2.b(i)) != null) {
                    z130 z130Var = modalPostReactionsFragment.X;
                    if (z130Var != null) {
                        int i2 = z130.l;
                        y130 y130Var = (y130) j5g.b0(i, z130Var.k);
                        if (y130Var != null) {
                            Image image = y130Var.g;
                            View view = b.f;
                            d dVar = view instanceof d ? (d) view : null;
                            if (dVar != null) {
                                dVar.setId(y130Var.b);
                                b.k(y130Var.e);
                                b.a = y130Var.a;
                                dVar.setText(y130Var.d);
                                if (image != null) {
                                    ccr0Var = new ccr0(dVar.getContext());
                                    ccr0Var.m = i2;
                                    ccr0Var.n = i2;
                                    ccr0Var.q(dVar);
                                } else {
                                    ccr0Var = null;
                                }
                                Drawable drawable = y130Var.f;
                                if (ccr0Var != null) {
                                    drawable = ccr0Var;
                                }
                                f4m.E(dVar.findViewById(R.id.left_icon), drawable != null);
                                if (drawable != null) {
                                    d.U4(dVar, drawable, false, 6);
                                }
                                if (ccr0Var != null) {
                                    ccr0Var.r((image == null || (Ab = image.Ab(i2, false)) == null) ? null : Ab.d.d);
                                }
                                if (epx.f(b.a, "reposts")) {
                                    dVar.setLeftIconTint(R.attr.vk_ui_icon_medium);
                                } else {
                                    dVar.setLeftIconTint((ColorStateList) null);
                                }
                            }
                        }
                    }
                    if (modalPostReactionsFragment.b0 && modalPostReactionsFragment.fo() == ModalPostDestination.REACTIONS_DONATS && epx.f(b.a, "donats")) {
                        b.j();
                    }
                }
                i++;
            }
            z130 z130Var2 = modalPostReactionsFragment.X;
            if (z130Var2 == null || (list = z130Var2.k) == null || !(!list.isEmpty())) {
                return;
            }
            modalPostReactionsFragment.b0 = false;
        }
    }

    public static void go(ModalPostReactionsFragment modalPostReactionsFragment, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        VkSecondaryTabLayout vkSecondaryTabLayout = modalPostReactionsFragment.R;
        if (vkSecondaryTabLayout != null) {
            vkSecondaryTabLayout.setVisibility(z ? 0 : 8);
        }
        ProgressBar progressBar = modalPostReactionsFragment.T;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 8);
        }
        View view = modalPostReactionsFragment.W;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        ViewGroup viewGroup = modalPostReactionsFragment.V;
        if (viewGroup != null) {
            viewGroup.setVisibility(z3 ? 0 : 8);
        }
        ViewGroup viewGroup2 = modalPostReactionsFragment.U;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_modal_post_reactions);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        b230 b230Var = (b230) ao50Var;
        gm50.a.b(this, b230Var.a, new o3w(this, 14));
        gm50.a.b(this, b230Var.b, new j4x(this, 13));
        gm50.a.b(this, b230Var.c, new yhu(this, 8));
        gm50.a.b(this, b230Var.d, new r9k(this, 28));
    }

    @Override // xsna.i130
    public final void Ri(float f) {
        z130 z130Var = this.X;
        if (z130Var != null) {
            Iterator<FragmentImpl> it = z130Var.i.iterator();
            while (it.hasNext()) {
                f fVar = (FragmentImpl) it.next();
                if (fVar instanceof i130) {
                    ((i130) fVar).Ri(f);
                }
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        if (this.X != null) {
            View view = gVar.f;
            d dVar = view instanceof d ? (d) view : null;
            if (dVar != null) {
                if (epx.f(gVar.a, "reposts")) {
                    dVar.setLeftIconTint(R.attr.vk_ui_icon_primary);
                } else {
                    dVar.setLeftIconTint((ColorStateList) null);
                }
            }
        }
        Object obj = gVar.a;
        this.Z = obj != null ? obj.toString() : fo() == ModalPostDestination.REACTIONS_DONATS ? "donats" : "all";
        if (gVar.a == null && fo() == ModalPostDestination.REACTIONS_DONATS) {
            return;
        }
        this.Y.d();
    }

    public final ModalPostDestination fo() {
        Bundle arguments = getArguments();
        Object obj = null;
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("ModalPostCommonFragment.destination", ModalPostDestination.COMMENTS.ordinal())) : null;
        Iterator<E> it = ModalPostDestination.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int ordinal = ((ModalPostDestination) next).ordinal();
            if (valueOf != null && ordinal == valueOf.intValue()) {
                obj = next;
                break;
            }
        }
        ModalPostDestination modalPostDestination = (ModalPostDestination) obj;
        return modalPostDestination == null ? ModalPostDestination.COMMENTS : modalPostDestination;
    }

    @Override // xsna.g88
    public final void jf(int i) {
        CoordinatorLayout coordinatorLayout = this.Q;
        if (coordinatorLayout != null) {
            bwt0.c0(i, coordinatorLayout);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        z130 z130Var = this.X;
        if (z130Var != null) {
            z130Var.unregisterDataSetObserver(this.c0);
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        l7s l7sVar;
        LayoutInflater cloneInContext;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("ModalPostCommonFragment.isModalReactionsForceDarkTheme", false) : false) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                dhr0.a.getClass();
                l7sVar = new l7s(mo2getContext, dhr0.u().c);
            } else {
                l7sVar = null;
            }
            if (l7sVar != null && (cloneInContext = onGetLayoutInflater.cloneInContext(l7sVar)) != null) {
                return cloneInContext;
            }
        }
        return onGetLayoutInflater;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        Rect C8;
        super.onResume();
        z1h0 parentFragment = getParentFragment();
        pnv pnvVar = parentFragment instanceof pnv ? (pnv) parentFragment : null;
        if (pnvVar == null || (C8 = pnvVar.C8()) == null) {
            return;
        }
        jf(C8.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Q = (CoordinatorLayout) view.findViewById(R.id.modal_post_reactions_content_holder);
        this.R = (VkSecondaryTabLayout) view.findViewById(R.id.modal_post_reactions_tabs);
        this.S = (ViewPager) view.findViewById(R.id.modal_post_reactions_viewpager);
        this.T = (ProgressBar) view.findViewById(R.id.modal_post_reactions_progress_bar);
        this.U = (ViewGroup) view.findViewById(R.id.modal_post_reactions_error_layout);
        this.V = (ViewGroup) view.findViewById(R.id.modal_post_reactions_empty_state_layout);
        this.W = view.findViewById(R.id.modal_post_reactions_divider);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.modal_post_reactions_top_bar);
        Bundle arguments = getArguments();
        vkTopBar.setBefore(new VkTopBar.c.f(new gko((arguments == null || !arguments.getBoolean("key_display_back_button", false)) ? R.drawable.vk_icon_cancel_outline_24 : R.drawable.vk_icon_back_24), tq.h(tlo0.Companion, R.string.close), new m130(this, 0), null, null, 56));
        tlo0.f fVar = new tlo0.f(R.string.post_reactions_modal_title);
        Object[] objArr = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), null, 0 == true ? 1 : 0, objArr, 14));
        bwt0.i0(view.findViewById(R.id.modal_post_reactions_error_button), new m1k(this, 27));
        ViewPager viewPager = this.S;
        if (viewPager == null) {
            return;
        }
        viewPager.setOffscreenPageLimit(1);
        z130 z130Var = new z130(In(), true);
        z130Var.k = EmptyList.b;
        z130Var.d = true;
        viewPager.addOnPageChangeListener(new n130(z130Var));
        z130Var.registerDataSetObserver(this.c0);
        viewPager.setAdapter(z130Var);
        this.X = z130Var;
        VkSecondaryTabLayout vkSecondaryTabLayout = this.R;
        if (vkSecondaryTabLayout == null) {
            return;
        }
        vkSecondaryTabLayout.setTabMode(0);
        vkSecondaryTabLayout.setCustomTabContent(new qcl(this, 29));
        usn0.a(vkSecondaryTabLayout);
        vkSecondaryTabLayout.setupWithViewPager(this.S);
        vkSecondaryTabLayout.f(this);
        vkSecondaryTabLayout.setDividerVisible(false);
    }

    @Override // xsna.wsn0
    public final void qd(int i) {
        xn50.a.c(this, new j130.c(i));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle requireArguments = requireArguments();
        return new l130(new r130(requireArguments, new a230(requireContext())), requireArguments, (tst) this.d0.getValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        String str;
        if (uiTrackingScreen.d != UiTrackingScreen.Companion.DialogType.DIALOG_MODAL_SOURCE || (str = this.a0) == null) {
            str = this.Z;
        }
        String str2 = str;
        uiTrackingScreen.a = epx.f(str2, "reposts") ? MobileOfficialAppsCoreNavStat$EventScreen.POST_REACTIONS_SHARE : epx.f(str2, "donats") ? MobileOfficialAppsCoreNavStat$EventScreen.POST_REACTIONS_DONUT : MobileOfficialAppsCoreNavStat$EventScreen.POST_REACTIONS_LIKE;
        q030 q030Var = this.e0;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, q030Var != null ? q030Var.a : null, q030Var != null ? Long.valueOf(q030Var.b) : null, str2, q030Var != null ? q030Var.c : null, null, 32, null);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        if (gVar != null) {
            if (this.X != null && !gVar.h()) {
                View view = gVar.f;
                d dVar = view instanceof d ? (d) view : null;
                if (dVar != null) {
                    if (epx.f(gVar.a, "reposts")) {
                        dVar.setLeftIconTint(R.attr.vk_ui_icon_medium);
                    } else {
                        dVar.setLeftIconTint((ColorStateList) null);
                    }
                }
            }
            Object obj = gVar.a;
            this.a0 = obj != null ? obj.toString() : null;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
    }
}
