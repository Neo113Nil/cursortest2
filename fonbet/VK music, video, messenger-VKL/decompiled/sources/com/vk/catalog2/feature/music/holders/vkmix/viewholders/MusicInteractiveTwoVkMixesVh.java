package com.vk.catalog2.feature.music.holders.vkmix.viewholders;

import android.animation.Animator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aud;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cis0;
import xsna.cpo0;
import xsna.cvs;
import xsna.fnj;
import xsna.gzs;
import xsna.iah0;
import xsna.j4v0;
import xsna.jjx;
import xsna.k4v0;
import xsna.l4v0;
import xsna.omn0;
import xsna.qdj0;
import xsna.r80;
import xsna.rmn0;
import xsna.teh0;
import xsna.tvj;
import xsna.u2b0;
import xsna.vuv0;
import xsna.vyq0;
import xsna.wln0;
import xsna.wnn0;
import xsna.yiq;
import xsna.zaf0;
import xsna.ziq;

/* compiled from: MusicInteractiveTwoVkMixesVh.kt */
/* loaded from: classes16.dex */
public final class MusicInteractiveTwoVkMixesVh extends MusicBaseVkMixInteractiveVh {
    public final b5a q;
    public ShimmerFrameLayout r;
    public final wln0 s;
    public final vuv0 t;
    public final vuv0 u;

    /* compiled from: MusicInteractiveTwoVkMixesVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<String> {
        @Override // xsna.gzs
        public final String invoke() {
            return ((MusicInteractiveTwoVkMixesVh) this.receiver).c();
        }
    }

    public MusicInteractiveTwoVkMixesVh(u2b0 u2b0Var, l4v0 l4v0Var, zaf0 zaf0Var, b5a b5aVar) {
        super(u2b0Var, R.layout.catalog_music_vk_mix_interactive, zaf0Var, l4v0Var, b5aVar);
        this.q = b5aVar;
        wln0 wln0Var = new wln0();
        this.s = wln0Var;
        vuv0 vuv0Var = new vuv0(wln0Var, l4v0Var, this.k);
        this.t = vuv0Var;
        this.u = vuv0Var;
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        ShimmerFrameLayout shimmerFrameLayout = this.r;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        Shimmer.a f = ((Shimmer.a) ((Shimmer.a) new Shimmer.a().c(true).i()).g(0.5f).e(9000L).d()).f(iah0.a(360));
        f.a.q = new qdj0();
        shimmerFrameLayout.b(f.a());
        ShimmerFrameLayout shimmerFrameLayout2 = this.r;
        (shimmerFrameLayout2 != null ? shimmerFrameLayout2 : null).c();
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh, com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final UiBlockInteractiveVkMix b() {
        return this.k.a();
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh, com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void d() {
        super.d();
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            tvj tvjVar = new tvj(this, 29);
            Context context = viewGroup.getContext();
            if (context == null) {
                return;
            }
            viewGroup.setOnTouchListener(new teh0(new GestureDetector(context, new omn0(tvjVar, context, new jjx(this, 13)).c)));
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    /* renamed from: m */
    public final UiBlockInteractiveVkMix b() {
        return this.k.a();
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    public final j4v0 n() {
        return this.u;
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    public final void o() {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        a aVar = new a(0, this, MusicInteractiveTwoVkMixesVh.class, "getTitle", "getTitle()Ljava/lang/String;", 0);
        cvs cvsVar = new cvs(this, 22);
        vuv0 vuv0Var = this.u;
        vuv0Var.j = viewGroup;
        TextView textView = (TextView) bwt0.p(viewGroup, R.id.title_first, null, null, 6);
        TextView textView2 = (TextView) bwt0.p(viewGroup, R.id.description_first, null, null, 6);
        TextView textView3 = (TextView) bwt0.p(viewGroup, R.id.title_second, null, null, 6);
        TextView textView4 = (TextView) bwt0.p(viewGroup, R.id.description_second, null, null, 6);
        vuv0Var.e = new wnn0(textView, textView3, null, new cpo0(6, vuv0Var, aVar), cvsVar, 4);
        vuv0Var.f = new wnn0(textView2, textView4, new wln0.a(40L, 5), new vyq0(vuv0Var, 11), null, 16);
        vuv0Var.k = new wnn0((TextView) bwt0.p(viewGroup, R.id.text_swipe_action_first, null, null, 6), (TextView) bwt0.p(viewGroup, R.id.text_swipe_action_second, null, null, 6), new wln0.a(120L, 5), new cis0(4, viewGroup, vuv0Var), null, 16);
        vuv0Var.g = (VkButton) bwt0.p(viewGroup, R.id.button_settings_first, null, null, 6);
        vuv0Var.h = (VkButton) bwt0.p(viewGroup, R.id.button_settings_second, null, null, 6);
        vuv0Var.d.e(viewGroup);
        vuv0Var.i = (MusicRoundPlayView) bwt0.p(viewGroup, R.id.play_view, null, null, 6);
        Guideline guideline = (Guideline) bwt0.p(viewGroup, R.id.guideline_swipe_action_top, null, null, 6);
        Guideline guideline2 = (Guideline) bwt0.p(viewGroup, R.id.guideline_swipe_action_bottom, null, null, 6);
        Context context = viewGroup.getContext();
        HashSet hashSet = iah0.a;
        int a2 = fnj.a(context) / 2;
        guideline.setGuidelineEnd(iah0.a(68) + a2);
        guideline2.setGuidelineEnd(iah0.a(44) + a2);
        MusicRoundPlayView musicRoundPlayView = vuv0Var.i;
        vuv0Var.l = new yiq<>(musicRoundPlayView != null ? musicRoundPlayView : null, false, vuv0Var.b, vuv0Var.c, new wln0.a(0L, 3));
        this.r = (ShimmerFrameLayout) bwt0.p(viewGroup, R.id.shimmer, null, null, 6);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh
    public final void p(boolean z) {
        u(1, z, false);
    }

    public final void u(int i, boolean z, boolean z2) {
        UiBlockInteractiveVkMix a2;
        r80 a3;
        ShimmerFrameLayout shimmerFrameLayout = this.r;
        rmn0 rmn0Var = null;
        rmn0Var = null;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.c();
        if (z2) {
            Collection<Animator> values = this.s.a.c.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (Animator animator : values) {
                    if (animator != null && animator.isStarted()) {
                        return;
                    }
                    if (animator != null && animator.isRunning()) {
                        return;
                    }
                }
            }
        }
        l4v0 l4v0Var = this.i;
        boolean z3 = (l4v0Var == null || (a3 = l4v0Var.a()) == null || ((String) a3.a).length() != 0) ? false : true;
        if (z) {
            t(z2);
        }
        if (!z2) {
            s(z3);
            return;
        }
        vuv0 vuv0Var = this.t;
        k4v0 k4v0Var = vuv0Var.d;
        wln0 wln0Var = vuv0Var.a;
        yiq<MusicRoundPlayView> yiqVar = vuv0Var.l;
        if (yiqVar == null) {
            yiqVar = null;
        }
        wln0Var.a(yiqVar);
        yiq<VkButton> yiqVar2 = k4v0Var.e;
        if (yiqVar2 == null) {
            yiqVar2 = null;
        }
        wln0Var.a(yiqVar2);
        yiq<VkButton> yiqVar3 = k4v0Var.d;
        if (yiqVar3 == null) {
            yiqVar3 = null;
        }
        wln0Var.a(yiqVar3);
        wnn0 wnn0Var = vuv0Var.e;
        if (wnn0Var == null) {
            wnn0Var = null;
        }
        wln0Var.a(wnn0Var);
        wnn0 wnn0Var2 = vuv0Var.k;
        if (wnn0Var2 == null) {
            wnn0Var2 = null;
        }
        wln0Var.a(wnn0Var2);
        wnn0 wnn0Var3 = vuv0Var.f;
        if (wnn0Var3 == null) {
            wnn0Var3 = null;
        }
        wln0Var.a(wnn0Var3);
        aud audVar = vuv0Var.c;
        if (audVar.b() && (a2 = audVar.a()) != null && a2.B) {
            VkButton vkButton = vuv0Var.g;
            rmn0Var = new yiq(vkButton != null ? vkButton : null, false, vuv0Var.b, vuv0Var.c, new wln0.a(120L, 1));
        } else {
            List list = (List) audVar.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((UiBlockInteractiveVkMix) it.next()).B) {
                        List list2 = (List) audVar.b;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((UiBlockInteractiveVkMix) it2.next()).B) {
                                    VkButton vkButton2 = vuv0Var.g;
                                    VkButton vkButton3 = vkButton2 != null ? vkButton2 : null;
                                    UiBlockInteractiveVkMix a4 = audVar.a();
                                    rmn0Var = new ziq(vkButton3, a4 != null && a4.B, new wln0.a(120L, 1));
                                }
                            }
                        }
                    }
                }
            }
            VkButton vkButton4 = vuv0Var.g;
            VkButton vkButton5 = vkButton4 != null ? vkButton4 : null;
            VkButton vkButton6 = vuv0Var.h;
            rmn0Var = new wnn0(vkButton5, vkButton6 != null ? vkButton6 : null, new wln0.a(120L, 1), null, null, 24);
        }
        if (rmn0Var != null) {
            wln0Var.a(rmn0Var);
        }
        ArrayList arrayList = wln0Var.b;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((rmn0) it3.next()).a(i);
        }
        arrayList.clear();
        l4v0 l4v0Var2 = vuv0Var.b;
        if (l4v0Var2 != null) {
            l4v0Var2.c.onNext(Boolean.valueOf(i == 2));
        }
        UiBlockInteractiveVkMix a5 = this.k.a();
        if (a5 != null) {
            this.q.a(new cfp0(a5, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.PlayAll)));
        }
    }
}
