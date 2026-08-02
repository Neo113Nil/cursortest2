package com.vk.catalog2.common.ui.mvp.holder.header.toolbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ExpandableVkSearchView;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockMyAudiosSectionOptions;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a8j0;
import xsna.a960;
import xsna.avj0;
import xsna.b25;
import xsna.b8g;
import xsna.b9s0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c24;
import xsna.c98;
import xsna.dhr0;
import xsna.dko;
import xsna.e4;
import xsna.eda;
import xsna.ehm0;
import xsna.emh0;
import xsna.epx;
import xsna.f4m;
import xsna.g8n0;
import xsna.gko;
import xsna.gzs;
import xsna.h2h0;
import xsna.i0b0;
import xsna.ika;
import xsna.izs;
import xsna.j5g;
import xsna.j630;
import xsna.j990;
import xsna.jai;
import xsna.jgz;
import xsna.jsk;
import xsna.k3p0;
import xsna.krv0;
import xsna.l3p0;
import xsna.lfr;
import xsna.ltb0;
import xsna.m3p0;
import xsna.m84;
import xsna.nda;
import xsna.o25;
import xsna.odc0;
import xsna.oq;
import xsna.pvh0;
import xsna.q3a;
import xsna.qyn0;
import xsna.qzl0;
import xsna.rl3;
import xsna.rrv0;
import xsna.ryc;
import xsna.s3p0;
import xsna.s3q0;
import xsna.s7p0;
import xsna.sha;
import xsna.snx;
import xsna.sxh0;
import xsna.t7p0;
import xsna.tho0;
import xsna.tlo0;
import xsna.tq;
import xsna.txh0;
import xsna.u2y;
import xsna.uho0;
import xsna.vlw;
import xsna.vpn0;
import xsna.wmd0;
import xsna.wrl0;
import xsna.zra;

/* compiled from: ToolbarRedesignVh.kt */
/* loaded from: classes16.dex */
public final class ToolbarRedesignVh implements TopBarVh {
    public final m3p0 A;
    public final bpn0 B;
    public final bpn0 C;
    public final nda b;
    public final q3a c;
    public final String d;
    public final int e;
    public final boolean f;
    public final eda g;
    public final boolean h;
    public final c24 i;
    public final izs<Long, s3q0> j;
    public final sha k;
    public final gzs<s3q0> l;
    public final String m;
    public Object n;
    public final sxh0 o;
    public final bpn0 p;
    public final bpn0 q;
    public VkTopBar r;
    public a s;
    public ViewGroup t;
    public VkContextMenu u;
    public UIBlockList v;
    public boolean w;
    public ExpandableVkSearchView x;
    public final odc0 y;
    public final bpn0 z;

    /* compiled from: ToolbarRedesignVh.kt */
    public static final class a {
        public final VkTopBar.c a;
        public final VkTopBar.Middle b;
        public final t7p0 c;

        public a() {
            this(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.vk.core.view.components.topbar.VkTopBar$Middle] */
        public static a a(a aVar, VkTopBar.c cVar, VkTopBar.Middle.Text text, t7p0 t7p0Var, int i) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            VkTopBar.Middle.Text text2 = text;
            if ((i & 2) != 0) {
                text2 = aVar.b;
            }
            if ((i & 4) != 0) {
                t7p0Var = aVar.c;
            }
            aVar.getClass();
            return new a(cVar, text2, t7p0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            VkTopBar.c cVar = this.a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            VkTopBar.Middle middle = this.b;
            return this.c.hashCode() + ((hashCode + (middle != null ? middle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "TopBarState(before=" + this.a + ", title=" + this.b + ", menuState=" + this.c + ')';
        }

        public a(VkTopBar.c cVar, VkTopBar.Middle middle, t7p0 t7p0Var) {
            this.a = cVar;
            this.b = middle;
            this.c = t7p0Var;
        }

        public /* synthetic */ a(int i) {
            this(null, null, new t7p0(0));
        }
    }

    /* compiled from: ToolbarRedesignVh.kt */
    public static final class b extends VkTopBar {
        public final boolean J;

        public b(Context context, boolean z) {
            super(context, null, 6, 0);
            this.J = z;
        }

        @Override // xsna.rpo0
        public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
            aVar.K(-37614981);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-37614981, i, -1, "com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh.VkTopBarTheme.Theme (ToolbarRedesignVh.kt:274)");
            }
            rrv0.e(this.J, null, null, null, null, null, jaiVar, aVar, (i << 18) & 3670016, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    public ToolbarRedesignVh(nda ndaVar, q3a q3aVar, String str, int i, boolean z, eda edaVar, izs izsVar, b9s0.h hVar, gzs gzsVar, String str2, txh0 txh0Var, int i2) {
        String str3 = (i2 & 4) != 0 ? null : str;
        boolean z2 = (i2 & 16) != 0 ? true : z;
        eda edaVar2 = (i2 & 128) != 0 ? null : edaVar;
        c24 c24Var = new c24(0);
        izs izsVar2 = (i2 & 8192) != 0 ? null : izsVar;
        b9s0.h hVar2 = (i2 & 16384) != 0 ? null : hVar;
        gzs gzsVar2 = (65536 & i2) != 0 ? null : gzsVar;
        int i3 = 0;
        boolean z3 = (131072 & i2) == 0;
        String str4 = (262144 & i2) != 0 ? null : str2;
        txh0 txh0Var2 = (i2 & 4194304) != 0 ? null : txh0Var;
        this.b = ndaVar;
        this.c = q3aVar;
        this.d = str3;
        this.e = i;
        this.f = z2;
        this.g = edaVar2;
        this.h = true;
        this.i = c24Var;
        this.j = izsVar2;
        this.k = hVar2;
        this.l = gzsVar2;
        this.m = str4;
        this.n = null;
        this.o = txh0Var2;
        this.p = new bpn0(new a8j0(6));
        this.q = new bpn0(new ltb0(7));
        this.s = new a(i3);
        this.y = new odc0(this, 21);
        this.z = new bpn0(new wrl0(this, 8));
        this.A = new m3p0(z3, new pvh0(this, 10), new i0b0(this, 21), new ehm0(this, 4), new emh0(this, 9), new vpn0(this, 3), new g8n0(this, 4), txh0Var2, new ika(this, 1));
        this.B = new bpn0(new uho0(this, 1));
        this.C = new bpn0(new avj0(this, 10));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        dhr0.a.getClass();
        dhr0.X(this);
        VkContextMenu vkContextMenu = this.u;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.u = null;
        m3p0 m3p0Var = this.A;
        c cVar = m3p0Var.k;
        if (cVar != null) {
            cVar.dispose();
        }
        m3p0Var.k = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0113, code lost:
    
        if (r6 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String str;
        VkTopBar.Middle.Text.Title title;
        tlo0 tlo0Var;
        boolean z;
        boolean z2 = uIBlock instanceof UIBlockCatalog;
        m3p0 m3p0Var = this.A;
        if (z2) {
            ArrayList<UIBlockAction> arrayList = ((UIBlockCatalog) uIBlock).F;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof UIBlockActionSearchMode) {
                    arrayList2.add(obj);
                }
            }
            m3p0Var.a((UIBlockActionSearchMode) j5g.a0(arrayList2));
            for (UIBlockAction uIBlockAction : arrayList) {
                if (uIBlockAction instanceof UIBlockMyAudiosSectionOptions) {
                    c().i(true);
                } else if (uIBlockAction instanceof UIBlockDownloadAll) {
                    c().e(true, Boolean.valueOf(((UIBlockDownloadAll) uIBlockAction).z), null);
                } else if (uIBlockAction instanceof UIBlockActionSearchMode) {
                    h((UIBlockActionSearchMode) uIBlockAction);
                }
            }
            return;
        }
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            UIBlockActionSearchMode uIBlockActionSearchMode = uIBlockList.I;
            m3p0Var.a(uIBlockActionSearchMode);
            this.v = uIBlockList;
            e().a(uIBlockList);
            UIBlockActionGoToOwner uIBlockActionGoToOwner = uIBlockList.D;
            if (uIBlockActionGoToOwner == null) {
                this.i.getClass();
                if (!Boolean.FALSE.booleanValue()) {
                    g(a.a(this.s, null, null, null, 6));
                }
            } else {
                String Sb = uIBlockActionGoToOwner.Sb();
                if (Sb != null) {
                    s3p0 e = e();
                    e.e.invoke(a.a(((ToolbarRedesignVh) e.d.c).s, new VkTopBar.c.a(new snx(new snx.b.c(new vlw(Sb, null), null, null, 14)), new m84(18, this, uIBlockActionGoToOwner), null, null, null, 28), null, null, 6));
                }
                VkTopBar.Middle middle = this.s.b;
                VkTopBar.Middle.Text text = middle instanceof VkTopBar.Middle.Text ? (VkTopBar.Middle.Text) middle : null;
                CharSequence a2 = (text == null || (title = text.a) == null || (tlo0Var = title.a) == null) ? null : tlo0Var.a(b());
                UserProfile userProfile = uIBlockActionGoToOwner.z;
                if (userProfile == null || (str = userProfile.e) == null) {
                    Group group = uIBlockActionGoToOwner.A;
                    str = group != null ? group.d : null;
                }
                if (str != null) {
                    a2 = str;
                }
                e().d(a2.toString(), e().c(uIBlockList));
            }
            d(this.w);
            k3p0 c = c();
            if (((Boolean) this.p.getValue()).booleanValue() && uIBlockList.y.size() == 1) {
                ArrayList<UIBlock> arrayList3 = uIBlockList.y;
                if (arrayList3 == null || !arrayList3.isEmpty()) {
                    Iterator<T> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        CatalogViewType catalogViewType = ((UIBlock) it.next()).d;
                        catalogViewType.getClass();
                        switch (CatalogViewType.b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                        }
                    }
                }
                z = false;
                c.d(z);
                h(uIBlockActionSearchMode);
                k3p0 c2 = c();
                UIBlockDownloadAll uIBlockDownloadAll = uIBlockList.P;
                c2.e(uIBlockDownloadAll != null, uIBlockDownloadAll != null ? Boolean.valueOf(uIBlockDownloadAll.z) : null, null);
            }
            if (uIBlockList.E != null) {
                z = true;
                c.d(z);
                h(uIBlockActionSearchMode);
                k3p0 c22 = c();
                UIBlockDownloadAll uIBlockDownloadAll2 = uIBlockList.P;
                c22.e(uIBlockDownloadAll2 != null, uIBlockDownloadAll2 != null ? Boolean.valueOf(uIBlockDownloadAll2.z) : null, null);
            }
            z = false;
            c.d(z);
            h(uIBlockActionSearchMode);
            k3p0 c222 = c();
            UIBlockDownloadAll uIBlockDownloadAll22 = uIBlockList.P;
            c222.e(uIBlockDownloadAll22 != null, uIBlockDownloadAll22 != null ? Boolean.valueOf(uIBlockDownloadAll22.z) : null, null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void R9(TopBarVh.a aVar) {
        this.n = aVar;
    }

    public final void a() {
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
        String str;
        UIBlockList uIBlockList = this.v;
        if (uIBlockList == null || (uIBlockActionEnterEditMode = uIBlockList.C) == null || (str = uIBlockActionEnterEditMode.b) == null) {
            return;
        }
        this.c.b(new zra(EditorMode.EXIT_EDITOR_MODE_DISCARD, str), true);
        d(!this.w);
        s3q0 s3q0Var = s3q0.a;
        s3q0 s3q0Var2 = s3q0.a;
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final boolean a0() {
        if (!this.w) {
            return false;
        }
        a();
        return true;
    }

    public final Context b() {
        VkTopBar vkTopBar = this.r;
        Context context = vkTopBar != null ? vkTopBar.getContext() : null;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final k3p0 c() {
        return (k3p0) this.z.getValue();
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        UIBlockList uIBlockList = this.v;
        if (uIBlockList == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = uIBlockList.C != null;
        if (z && z3) {
            z2 = true;
        }
        this.w = z2;
        s3p0 e = e();
        a aVar = ((ToolbarRedesignVh) e.d.c).s;
        VkTopBar.Middle middle = aVar.b;
        VkTopBar.Middle.Text text = middle instanceof VkTopBar.Middle.Text ? (VkTopBar.Middle.Text) middle : null;
        if (text != null) {
            e.e.invoke(a.a(aVar, null, VkTopBar.Middle.Text.a(text, VkTopBar.Middle.Text.Title.a(text.a, null, e.c(((ToolbarRedesignVh) e.b.c).v) ? new VkTopBar.Middle.Text.Title.a.C0870a(null) : null, 27)), null, 5));
        }
        j();
        c().f(z3);
        k3p0 c = c();
        boolean z4 = this.w;
        t7p0 t7p0Var = (t7p0) c.g.invoke();
        s7p0 s7p0Var = t7p0Var.e;
        c.h(t7p0.a(t7p0Var, null, null, null, null, s7p0Var != null ? new s7p0(s7p0Var.a, s7p0Var.b, !z4, s7p0Var.d, s7p0Var.e) : null, null, 47));
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void dm(String str) {
        m3p0 m3p0Var = this.A;
        if (str == null) {
            m3p0Var.getClass();
            return;
        }
        m3p0.a aVar = m3p0Var.j;
        if (aVar.b) {
            int length = str.length();
            m3p0.a a2 = m3p0.a.a(aVar, null, false, new tho0(str, jgz.c(length, length), 4), false, 11);
            m3p0Var.j = a2;
            m3p0Var.e.invoke(a2);
            m3p0Var.l.onNext(str);
        }
    }

    public final s3p0 e() {
        return (s3p0) this.C.getValue();
    }

    public final void g(a aVar) {
        this.s = aVar;
        VkTopBar vkTopBar = this.r;
        if (vkTopBar == null) {
            return;
        }
        vkTopBar.setBefore(aVar.a);
        VkTopBar.Middle middle = aVar.b;
        if (middle != null) {
            vkTopBar.setMiddle(middle);
        }
        k3p0 c = c();
        t7p0 t7p0Var = aVar.c;
        c.getClass();
        List I = rl3.I(new s7p0[]{t7p0Var.a, t7p0Var.e, t7p0Var.d, t7p0Var.c, t7p0Var.b, t7p0Var.f});
        s7p0 s7p0Var = (s7p0) j5g.b0(0, I);
        VkTopBar.a.d dVar = null;
        if (s7p0Var != null) {
            s7p0 s7p0Var2 = (s7p0) j5g.b0(1, I);
            s7p0 s7p0Var3 = (s7p0) j5g.b0(2, I);
            dko dkoVar = s7p0Var.a;
            tlo0.h d = oq.d(tlo0.Companion, s7p0Var.b);
            gzs<s3q0> gzsVar = s7p0Var.c ? s7p0Var.d : null;
            Integer num = s7p0Var.e;
            dVar = new VkTopBar.a.d(new VkTopBar.a.c.f(dkoVar, d, gzsVar, null, num != null ? new b8g(dhr0.Y(num.intValue(), null)) : null, null, 40), s7p0Var3 != null ? c.a(s7p0Var3) : null, s7p0Var2 != null ? c.a(s7p0Var2) : null);
        }
        vkTopBar.setAfter(dVar);
    }

    public final void h(UIBlockActionSearchMode uIBlockActionSearchMode) {
        if (uIBlockActionSearchMode == null || !epx.f(uIBlockActionSearchMode.z, "owner_videos")) {
            this.A.a(uIBlockActionSearchMode);
            return;
        }
        VkTopBar vkTopBar = this.r;
        if (vkTopBar == null || this.j == null || this.x != null) {
            return;
        }
        vkTopBar.setPadding(0, 0, 0, 0);
        ExpandableVkSearchView expandableVkSearchView = new ExpandableVkSearchView(vkTopBar.getContext());
        this.x = expandableVkSearchView;
        ViewGroup viewGroup = this.t;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.addView(expandableVkSearchView);
        ExpandableVkSearchView expandableVkSearchView2 = this.x;
        Object layoutParams = expandableVkSearchView2 != null ? expandableVkSearchView2.getLayoutParams() : null;
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
            ((ViewGroup.MarginLayoutParams) bVar).height = -2;
            bVar.t = 0;
            bVar.v = 0;
            bVar.i = 0;
            ExpandableVkSearchView expandableVkSearchView3 = this.x;
            if (expandableVkSearchView3 != null) {
                expandableVkSearchView3.setLayoutParams(bVar);
            }
        }
        ExpandableVkSearchView expandableVkSearchView4 = this.x;
        if (expandableVkSearchView4 != null) {
            String str = this.m;
            if (str == null) {
                str = b().getString(R.string.video_author_search_hint);
            }
            expandableVkSearchView4.setHint(str);
        }
        ExpandableVkSearchView expandableVkSearchView5 = this.x;
        if (expandableVkSearchView5 != null) {
            expandableVkSearchView5.n5(new jsk(this, 12), vkTopBar);
        }
        ExpandableVkSearchView expandableVkSearchView6 = this.x;
        if (expandableVkSearchView6 != null) {
            expandableVkSearchView6.post(new ryc(this, 12));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void hide() {
        VkTopBar vkTopBar = this.r;
        if (vkTopBar != null) {
            f4m.j(vkTopBar);
        }
    }

    public final void j() {
        Pair pair;
        VkTopBar.c fVar;
        a aVar = this.s;
        l3p0 l3p0Var = (l3p0) this.B.getValue();
        boolean z = this.w;
        if (l3p0Var.b.invoke().booleanValue()) {
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            String str = ((b25) bpn0Var.getValue()).o().c;
            if (str != null) {
                fVar = new VkTopBar.c.a(new snx(new snx.b.c(new vlw(str, null), null, null, 14)), null, null, null, null, 20);
                g(a.a(aVar, fVar, null, null, 6));
            }
            fVar = null;
            g(a.a(aVar, fVar, null, null, 6));
        }
        if ((((Boolean) l3p0Var.c.invoke()).booleanValue() || z) && l3p0Var.a) {
            if (z) {
                pair = new Pair(Integer.valueOf(R.drawable.vk_icon_cancel_outline_28), Integer.valueOf(R.string.accessibility_cancel));
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(Integer.valueOf(R.drawable.vk_icon_arrow_left_outline_28), Integer.valueOf(R.string.accessibility_toolbar_return_back));
            }
            fVar = new VkTopBar.c.f(new gko(((Number) pair.d()).intValue()), tq.h(tlo0.Companion, ((Number) pair.g()).intValue()), l3p0Var.d, new b8g(dhr0.Y(R.attr.vk_ui_icon_accent_themed, null)), null, 40);
            g(a.a(aVar, fVar, null, null, 6));
        }
        fVar = null;
        g(a.a(aVar, fVar, null, null, 6));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int indexOfChild;
        View inflate = layoutInflater.inflate(this.e, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        boolean c = dhr0.a.c(null);
        if (c) {
            b bVar = new b(vkTopBar.getContext(), c);
            ViewParent parent = vkTopBar.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null && (indexOfChild = viewGroup2.indexOfChild(vkTopBar)) != -1) {
                bVar.setId(vkTopBar.getId());
                bVar.setLayoutParams(vkTopBar.getLayoutParams());
                bVar.setBackground(vkTopBar.getBackground());
                bVar.setContentDescription(vkTopBar.getContentDescription());
                bVar.setImportantForAccessibility(vkTopBar.getImportantForAccessibility());
                bVar.setPaddingRelative(vkTopBar.getPaddingStart(), vkTopBar.getPaddingTop(), vkTopBar.getPaddingEnd(), vkTopBar.getPaddingBottom());
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(bVar, indexOfChild);
                vkTopBar = bVar;
            }
        }
        vkTopBar.setOnClickListener(new c98(this, 1));
        this.r = vkTopBar;
        this.t = (ViewGroup) inflate.findViewById(R.id.content);
        m3p0 m3p0Var = this.A;
        c cVar = m3p0Var.k;
        if (cVar != null) {
            cVar.dispose();
        }
        m3p0Var.k = m3p0Var.l.y(500L, TimeUnit.MILLISECONDS).U(new j630(new qyn0(1), 19)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a960(new qzl0(m3p0Var, 9), 24), new j990(new h2h0(7), 11));
        j();
        c().f(false);
        c().d(false);
        c().i(false);
        c().g(false);
        c().e(false, Boolean.FALSE, null);
        a aVar = this.s;
        String str = this.d;
        if (str == null) {
            str = "";
        }
        g(a.a(aVar, null, new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14), null, 5));
        dhr0.f(this);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<CatalogFilterData> list;
        if (view.getId() != R.id.toolbar) {
            this.i.getClass();
            this.b.c(false);
            return;
        }
        UIBlockList uIBlockList = this.v;
        if (uIBlockList == null) {
            return;
        }
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockList.B;
        if (this.h && uIBlockActionShowFilters != null && (list = uIBlockActionShowFilters.A) != null) {
            List<CatalogFilterData> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((CatalogFilterData) it.next()).e) {
                        VkTopBar vkTopBar = this.r;
                        if (vkTopBar == null || list == null) {
                            return;
                        }
                        u2y u2yVar = new u2y(this, view, uIBlockList, 2);
                        ListDataSet listDataSet = new ListDataSet();
                        listDataSet.setItems(list);
                        lfr lfrVar = new lfr(listDataSet, u2yVar);
                        lfrVar.setItems(list);
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        vkTopBar.getContext();
                        e.b bVar = new e.b(vkTopBar, null, null, l, 6);
                        bVar.w = R.layout.ds_internal_context_menu_item;
                        bVar.l = lfrVar;
                        VkContextMenu j = bVar.j();
                        this.u = j;
                        j.e(new wmd0(this, 11));
                        return;
                    }
                }
            }
        }
        gzs<s3q0> gzsVar = this.l;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        j();
        c().f(this.s.c.b != null);
        c().d(this.s.c.c != null);
        c().i(this.s.c.d != null);
        c().g(this.s.c.e != null);
        k3p0 c = c();
        s7p0 s7p0Var = this.s.c.f;
        c.e(s7p0Var != null, null, s7p0Var != null ? s7p0Var.a : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void setTitle(tlo0 tlo0Var) {
        e().d(tlo0.b.a((tlo0.f) tlo0Var, b()).toString(), false);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void show() {
        VkTopBar vkTopBar = this.r;
        if (vkTopBar != null) {
            vkTopBar.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void tc(boolean z) {
        ExpandableVkSearchView expandableVkSearchView;
        ExpandableVkSearchView expandableVkSearchView2 = this.x;
        if (expandableVkSearchView2 == null || !bwt0.K(expandableVkSearchView2) || (expandableVkSearchView = this.x) == null) {
            return;
        }
        expandableVkSearchView.setExpandedWithAnimation(z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
