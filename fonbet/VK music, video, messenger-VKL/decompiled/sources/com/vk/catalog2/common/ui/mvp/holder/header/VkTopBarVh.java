package com.vk.catalog2.common.ui.mvp.holder.header;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockMyAudiosSectionOptions;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.akd0;
import xsna.b8g;
import xsna.beq;
import xsna.bpn0;
import xsna.bx0;
import xsna.c98;
import xsna.dhr0;
import xsna.dko;
import xsna.dtv0;
import xsna.ed5;
import xsna.eda;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.g2u0;
import xsna.g4a;
import xsna.gko;
import xsna.gzs;
import xsna.h7p0;
import xsna.h7u0;
import xsna.hvr0;
import xsna.i7p0;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.krv0;
import xsna.lfr;
import xsna.nbt0;
import xsna.nda;
import xsna.nid0;
import xsna.o25;
import xsna.oq;
import xsna.oz4;
import xsna.puv0;
import xsna.q3a;
import xsna.qoy;
import xsna.rl3;
import xsna.s200;
import xsna.s3q0;
import xsna.sf3;
import xsna.sha;
import xsna.snx;
import xsna.tfm0;
import xsna.tlo0;
import xsna.tq;
import xsna.u6k;
import xsna.urd0;
import xsna.vlw;
import xsna.w7p0;
import xsna.x4q;
import xsna.yei0;
import xsna.yfi0;
import xsna.yo40;
import xsna.yo80;

/* compiled from: VkTopBarVh.kt */
/* loaded from: classes16.dex */
public final class VkTopBarVh implements TopBarVh {
    public final nda b;
    public final q3a c;
    public final h7p0 d;
    public final w7p0 e;
    public final tlo0 f;
    public final int g;
    public final eda h;
    public final sha i;
    public Object j;
    public final g4a k;
    public final izs<String, s3q0> l;
    public final bpn0 m;
    public VkTopBar n;
    public e o;
    public VkContextMenu p;
    public UIBlockList q;
    public boolean r;
    public final tfm0 s;

    /* compiled from: VkTopBarVh.kt */
    public static final class a {
        public static final boolean a(UIBlockList uIBlockList) {
            UIBlockActionShowFilters uIBlockActionShowFilters;
            List<CatalogFilterData> list;
            if (uIBlockList == null || (uIBlockActionShowFilters = uIBlockList.B) == null || (list = uIBlockActionShowFilters.A) == null) {
                return false;
            }
            List<CatalogFilterData> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((CatalogFilterData) it.next()).e) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: VkTopBarVh.kt */
    public static final class b extends beq {
    }

    /* compiled from: VkTopBarVh.kt */
    public static final class c {
        public final dko a;
        public final String b;
        public final boolean c;
        public final gzs<s3q0> d;
        public final Integer e;
        public final SemanticsConfiguration f;
        public final boolean g;

        public c() {
            throw null;
        }

        public /* synthetic */ c(dko dkoVar, String str, gzs gzsVar, Integer num, SemanticsConfiguration semanticsConfiguration) {
            this(dkoVar, str, true, gzsVar, num, semanticsConfiguration, false);
        }

        public static c a(c cVar, boolean z, boolean z2, int i) {
            dko dkoVar = cVar.a;
            String str = cVar.b;
            if ((i & 4) != 0) {
                z = cVar.c;
            }
            boolean z3 = z;
            gzs<s3q0> gzsVar = cVar.d;
            Integer num = cVar.e;
            SemanticsConfiguration semanticsConfiguration = cVar.f;
            if ((i & 64) != 0) {
                z2 = cVar.g;
            }
            cVar.getClass();
            return new c(dkoVar, str, z3, gzsVar, num, semanticsConfiguration, z2);
        }

        public final boolean equals(Object obj) {
            boolean f;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!epx.f(this.a, cVar.a) || !epx.f(this.b, cVar.b) || this.c != cVar.c || !epx.f(this.d, cVar.d) || !epx.f(this.e, cVar.e)) {
                return false;
            }
            SemanticsConfiguration semanticsConfiguration = cVar.f;
            SemanticsConfiguration semanticsConfiguration2 = this.f;
            if (semanticsConfiguration2 == null) {
                if (semanticsConfiguration == null) {
                    f = true;
                }
                f = false;
            } else {
                if (semanticsConfiguration != null) {
                    f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                }
                f = false;
            }
            return f && this.g == cVar.g;
        }

        public final int hashCode() {
            int a = sf3.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            Integer num = this.e;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            SemanticsConfiguration semanticsConfiguration = this.f;
            return Boolean.hashCode(this.g) + ((hashCode + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopBarMenuItem(drawable=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            sb.append(this.b);
            sb.append(", enabled=");
            sb.append(this.c);
            sb.append(", onClick=");
            sb.append(this.d);
            sb.append(", tint=");
            sb.append(this.e);
            sb.append(", semanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.f;
            sb.append((Object) (semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration)));
            sb.append(", hidden=");
            return q0.a(sb, this.g, ')');
        }

        public c(dko dkoVar, String str, boolean z, gzs gzsVar, Integer num, SemanticsConfiguration semanticsConfiguration, boolean z2) {
            this.a = dkoVar;
            this.b = str;
            this.c = z;
            this.d = gzsVar;
            this.e = num;
            this.f = semanticsConfiguration;
            this.g = z2;
        }
    }

    /* compiled from: VkTopBarVh.kt */
    public static final class d {
        public final c a;
        public final c b;
        public final c c;
        public final c d;
        public final c e;

        public d() {
            this(0);
        }

        public static d a(d dVar, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, int i) {
            if ((i & 1) != 0) {
                cVar = dVar.a;
            }
            c cVar6 = cVar;
            if ((i & 2) != 0) {
                cVar2 = dVar.b;
            }
            c cVar7 = cVar2;
            if ((i & 4) != 0) {
                cVar3 = dVar.c;
            }
            c cVar8 = cVar3;
            if ((i & 8) != 0) {
                cVar4 = dVar.d;
            }
            c cVar9 = cVar4;
            dVar.getClass();
            if ((i & 32) != 0) {
                cVar5 = dVar.e;
            }
            dVar.getClass();
            return new d(cVar6, cVar7, cVar8, cVar9, cVar5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            c cVar = this.a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            c cVar2 = this.b;
            int hashCode2 = (hashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            c cVar3 = this.c;
            int hashCode3 = (hashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            c cVar4 = this.d;
            int hashCode4 = (hashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 961;
            c cVar5 = this.e;
            return hashCode4 + (cVar5 != null ? cVar5.hashCode() : 0);
        }

        public final String toString() {
            return "TopBarMenuState(edit=" + this.a + ", clear=" + this.b + ", options=" + this.c + ", filters=" + this.d + ", spinner=null, downloadAll=" + this.e + ')';
        }

        public /* synthetic */ d(int i) {
            this(null, null, null, null, null);
        }

        public d(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
            this.a = cVar;
            this.b = cVar2;
            this.c = cVar3;
            this.d = cVar4;
            this.e = cVar5;
        }
    }

    /* compiled from: VkTopBarVh.kt */
    public static final class e {
        public final VkTopBar.c a;
        public final VkTopBar.Middle b;
        public final d c;

        public e() {
            this(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.vk.core.view.components.topbar.VkTopBar$Middle] */
        public static e a(e eVar, VkTopBar.c cVar, VkTopBar.Middle.Text text, d dVar, int i) {
            if ((i & 1) != 0) {
                cVar = eVar.a;
            }
            VkTopBar.Middle.Text text2 = text;
            if ((i & 2) != 0) {
                text2 = eVar.b;
            }
            if ((i & 4) != 0) {
                dVar = eVar.c;
            }
            eVar.getClass();
            return new e(cVar, text2, dVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
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

        public e(VkTopBar.c cVar, VkTopBar.Middle middle, d dVar) {
            this.a = cVar;
            this.b = middle;
            this.c = dVar;
        }

        public /* synthetic */ e(int i) {
            this(null, null, new d(0));
        }
    }

    public VkTopBarVh(nda ndaVar, q3a q3aVar, i7p0 i7p0Var, w7p0 w7p0Var, tlo0 tlo0Var, eda edaVar, yo40 yo40Var, u6k u6kVar, int i) {
        i7p0 i7p0Var2 = (i & 4) != 0 ? new i7p0(null, null, null, null, 15) : i7p0Var;
        w7p0 w7p0Var2 = (i & 8) != 0 ? new w7p0(false, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) : w7p0Var;
        tlo0 tlo0Var2 = (i & 16) != 0 ? null : tlo0Var;
        int i2 = (i & 32) != 0 ? R.layout.pds_catalog_vk_top_bar : R.layout.catalog_toolbar_friends_vktopbar;
        eda edaVar2 = (i & 128) != 0 ? null : edaVar;
        yo40 yo40Var2 = (i & 1024) != 0 ? null : yo40Var;
        u6k u6kVar2 = (i & 2048) != 0 ? null : u6kVar;
        this.b = ndaVar;
        this.c = q3aVar;
        this.d = i7p0Var2;
        this.e = w7p0Var2;
        this.f = tlo0Var2;
        this.g = i2;
        this.h = edaVar2;
        this.i = null;
        this.j = null;
        this.k = yo40Var2;
        this.l = u6kVar2;
        this.m = new bpn0(new yo80(18));
        this.o = new e(0);
        this.s = new tfm0(this, 26);
    }

    public static VkTopBar.a.b.C0877b c(c cVar) {
        return new VkTopBar.a.b.C0877b(cVar.a, oq.d(tlo0.Companion, cVar.b), cVar.c ? cVar.d : null, null, null, cVar.f, 24);
    }

    public static c e(int i, Context context, int i2, Integer num, SemanticsConfiguration semanticsConfiguration, gzs gzsVar) {
        return new c(new gko(i), context.getString(i2), gzsVar, num, semanticsConfiguration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        dhr0.a.getClass();
        dhr0.X(this);
        VkContextMenu vkContextMenu = this.p;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        UIBlockDownloadAll uIBlockDownloadAll;
        String Sb;
        String str;
        VkTopBar.Middle.Text.Title title;
        tlo0 tlo0Var;
        String str2;
        List<CatalogFilterData> list;
        Object obj;
        if (uIBlock instanceof UIBlockCatalog) {
            for (UIBlockAction uIBlockAction : ((UIBlockCatalog) uIBlock).F) {
                if (uIBlockAction instanceof UIBlockMyAudiosSectionOptions) {
                    n(true);
                } else if (uIBlockAction instanceof UIBlockDownloadAll) {
                    j(true, Boolean.valueOf(((UIBlockDownloadAll) uIBlockAction).z), null);
                }
            }
            return;
        }
        if (!(uIBlock instanceof UIBlockList)) {
            return;
        }
        UIBlockList uIBlockList = (UIBlockList) uIBlock;
        UIBlockActionGoToOwner uIBlockActionGoToOwner = uIBlockList.D;
        String str3 = uIBlockList.z;
        boolean a2 = a.a(uIBlockList);
        boolean z = false;
        tlo0 tlo0Var2 = this.f;
        w7p0 w7p0Var = this.e;
        if (!a2) {
            if (w7p0Var.c) {
                l(false);
            }
            if (tlo0Var2 != null) {
                o(tlo0Var2, null);
            } else if (str3 != null) {
                tlo0.Companion.getClass();
                o(new tlo0.h(str3), null);
            }
        } else if (w7p0Var.c) {
            l(true);
            if (w7p0Var.d) {
                if (tlo0Var2 == null) {
                    tlo0.a aVar = tlo0.Companion;
                    if (str3 == null) {
                        str3 = "";
                    }
                    tlo0Var2 = oq.d(aVar, str3);
                }
                o(tlo0Var2, null);
            }
        } else {
            UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockList.B;
            if (uIBlockActionShowFilters != null && (list = uIBlockActionShowFilters.A) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((CatalogFilterData) obj).e) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
                if (catalogFilterData != null) {
                    str2 = catalogFilterData.c;
                    if (str2 != null) {
                        VkTopBar.Middle.Text.Title.a.C0870a c0870a = w7p0Var.b ? new VkTopBar.Middle.Text.Title.a.C0870a(null) : null;
                        tlo0.Companion.getClass();
                        o(new tlo0.h(str2), c0870a);
                    }
                }
            }
            str2 = null;
            if (str2 != null) {
            }
        }
        if (uIBlockActionGoToOwner != null && (Sb = uIBlockActionGoToOwner.Sb()) != null) {
            VkTopBar vkTopBar = this.n;
            VkTopBar.Middle middle = vkTopBar != null ? vkTopBar.getMiddle() : null;
            VkTopBar.Middle.Text text = middle instanceof VkTopBar.Middle.Text ? (VkTopBar.Middle.Text) middle : null;
            CharSequence a3 = (text == null || (title = text.a) == null || (tlo0Var = title.a) == null) ? null : tlo0Var.a(b());
            UserProfile userProfile = uIBlockActionGoToOwner.z;
            if (userProfile == null || (str = userProfile.e) == null) {
                Group group = uIBlockActionGoToOwner.A;
                str = group != null ? group.d : null;
            }
            if (str != null) {
                a3 = str;
            }
            if (a3 != null) {
                g(e.a(this.o, new VkTopBar.c.a(new snx(new snx.b.c(new vlw(Sb, null), null, null, 14)), new bx0(this.d), null, null, null, 28), null, null, 6));
                tlo0.a aVar2 = tlo0.Companion;
                String obj2 = a3.toString();
                aVar2.getClass();
                o(new tlo0.h(obj2), null);
            }
        }
        this.q = uIBlockList;
        d(this.r);
        if (((Boolean) this.m.getValue()).booleanValue() && uIBlockList.y.size() == 1) {
            ArrayList<UIBlock> arrayList = uIBlockList.y;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    CatalogViewType catalogViewType = ((UIBlock) it2.next()).d;
                    catalogViewType.getClass();
                    switch (CatalogViewType.b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    }
                }
            }
            h(z);
            uIBlockDownloadAll = uIBlockList.P;
            if (uIBlockDownloadAll == null) {
                j(true, Boolean.valueOf(uIBlockDownloadAll.z), null);
                return;
            }
            return;
        }
        if (uIBlockList.E != null) {
            z = true;
        }
        h(z);
        uIBlockDownloadAll = uIBlockList.P;
        if (uIBlockDownloadAll == null) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void R9(TopBarVh.a aVar) {
        this.j = aVar;
    }

    public final void a() {
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
        String str;
        UIBlockList uIBlockList = this.q;
        if (uIBlockList == null || (uIBlockActionEnterEditMode = uIBlockList.C) == null || (str = uIBlockActionEnterEditMode.b) == null) {
            return;
        }
        puv0 puv0Var = new puv0(0, this, str);
        g4a g4aVar = this.k;
        h7u0.a a2 = g4aVar != null ? g4aVar.a(b(), puv0Var) : null;
        if (a2 == null || a2.m() == null) {
            puv0Var.invoke();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final boolean a0() {
        if (!this.r) {
            return false;
        }
        a();
        return true;
    }

    public final Context b() {
        VkTopBar vkTopBar = this.n;
        Context context = vkTopBar != null ? vkTopBar.getContext() : null;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        UIBlockList uIBlockList = this.q;
        if (uIBlockList == null) {
            return;
        }
        boolean z2 = uIBlockList.C != null;
        boolean z3 = z && z2;
        this.r = z3;
        boolean z4 = !z3;
        w7p0 w7p0Var = this.e;
        if (w7p0Var.b != z4) {
            w7p0Var.b = z4;
            e eVar = this.o;
            VkTopBar.Middle middle = eVar.b;
            VkTopBar.Middle.Text text = middle instanceof VkTopBar.Middle.Text ? (VkTopBar.Middle.Text) middle : null;
            if (text != null) {
                g(e.a(eVar, null, VkTopBar.Middle.Text.a(text, VkTopBar.Middle.Text.Title.a(text.a, null, (z3 || !a.a(uIBlockList) || w7p0Var.c) ? null : new VkTopBar.Middle.Text.Title.a.C0870a(null), 27)), null, 5));
            }
        }
        m();
        k(z2);
        e eVar2 = this.o;
        d dVar = eVar2.c;
        c cVar = dVar.c;
        if (cVar != null) {
            g(e.a(eVar2, null, null, d.a(dVar, null, null, c.a(cVar, false, this.r, 63), null, null, 59), 3));
        }
        boolean z5 = this.r;
        e eVar3 = this.o;
        d dVar2 = eVar3.c;
        c cVar2 = dVar2.d;
        g(e.a(eVar3, null, null, d.a(dVar2, null, null, null, cVar2 != null ? c.a(cVar2, !z5, false, 123) : null, null, 55), 3));
    }

    public final void g(e eVar) {
        this.o = eVar;
        VkTopBar vkTopBar = this.n;
        if (vkTopBar == null) {
            return;
        }
        vkTopBar.setBefore(eVar.a);
        VkTopBar.Middle middle = eVar.b;
        if (middle != null) {
            vkTopBar.setMiddle(middle);
        }
        d dVar = eVar.c;
        dVar.getClass();
        List I = rl3.I(new c[]{dVar.d, dVar.c, dVar.b, dVar.a, dVar.e});
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (!((c) obj).g) {
                arrayList.add(obj);
            }
        }
        c cVar = (c) j5g.b0(0, arrayList);
        c cVar2 = (c) j5g.b0(2, arrayList);
        c cVar3 = (c) j5g.b0(1, arrayList);
        VkTopBar.a.d dVar2 = null;
        dVar2 = null;
        if (!arrayList.isEmpty() && cVar != null) {
            dko dkoVar = cVar.a;
            tlo0.h d2 = oq.d(tlo0.Companion, cVar.b);
            gzs<s3q0> gzsVar = cVar.c ? cVar.d : null;
            Integer num = cVar.e;
            dVar2 = new VkTopBar.a.d(new VkTopBar.a.c.f(dkoVar, d2, gzsVar, null, num != null ? new b8g(dhr0.t.c(num.intValue())) : null, cVar.f, 8), cVar2 != null ? c(cVar2) : null, cVar3 != null ? c(cVar3) : null);
        }
        vkTopBar.setAfter(dVar2);
    }

    public final void h(boolean z) {
        c cVar;
        int i = BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed;
        e eVar = this.o;
        d dVar = eVar.c;
        if (z) {
            Context b2 = b();
            Integer valueOf = Integer.valueOf(i);
            this.e.getClass();
            cVar = e(R.drawable.vk_icon_delete_outline_28, b2, R.string.accessibility_clear, valueOf, null, new nbt0(this, 1));
        } else {
            cVar = null;
        }
        g(e.a(eVar, null, null, d.a(dVar, null, cVar, null, null, null, 61), 3));
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void hide() {
        VkTopBar vkTopBar = this.n;
        if (vkTopBar != null) {
            f4m.j(vkTopBar);
        }
    }

    public final void j(boolean z, Boolean bool, dko dkoVar) {
        c cVar;
        int i = epx.f(bool, Boolean.TRUE) ? R.drawable.vk_icon_download_cancel_outline_28 : R.drawable.vk_icon_download_outline_28;
        e eVar = this.o;
        d dVar = eVar.c;
        if (z) {
            if (dkoVar == null) {
                dkoVar = new gko(i);
            }
            String string = b().getString(R.string.download);
            yei0 yei0Var = new yei0(this, 26);
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent);
            this.e.getClass();
            cVar = new c(dkoVar, string, yei0Var, valueOf, null);
        } else {
            cVar = null;
        }
        g(e.a(eVar, null, null, d.a(dVar, null, null, null, null, cVar, 31), 3));
    }

    public final void k(boolean z) {
        boolean z2 = this.r;
        int i = z2 ? R.drawable.vk_icon_done_outline_28 : R.drawable.vk_icon_edit_outline_28;
        int i2 = z2 ? R.string.accessibility_save : R.string.accessibility_edit_list;
        int i3 = BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed;
        boolean z3 = this.r;
        w7p0 w7p0Var = this.e;
        SemanticsConfiguration semanticsConfiguration = z3 ? w7p0Var.i : w7p0Var.h;
        e eVar = this.o;
        g(e.a(eVar, null, null, d.a(eVar.c, z ? e(i, b(), i2, Integer.valueOf(i3), semanticsConfiguration, new dtv0(this, 1)) : null, null, null, null, null, 62), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.g, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.top_bar);
        vkTopBar.setOnClickListener(new c98(this, 1));
        this.n = vkTopBar;
        m();
        k(false);
        h(false);
        n(false);
        l(false);
        j(false, Boolean.FALSE, null);
        e eVar = this.o;
        tlo0 tlo0Var = this.f;
        if (tlo0Var == null) {
            tlo0Var = oq.d(tlo0.Companion, "");
        }
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        g(e.a(eVar, null, new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0Var, null, null, null, null, 30), cVar, objArr, this.e.f, 6), null, 5));
        dhr0.f(this);
        return inflate;
    }

    public final void l(boolean z) {
        int i = BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed;
        e eVar = this.o;
        g(e.a(eVar, null, null, d.a(eVar.c, null, null, null, z ? e(R.drawable.vk_icon_sort_outline_28, b(), R.string.accessibility_actions, Integer.valueOf(i), this.e.k, new akd0(this, 28)) : null, null, 55), 3));
    }

    public final void m() {
        VkTopBar.c.f fVar;
        Activity c2;
        w7p0 w7p0Var = this.e;
        if (w7p0Var.e.invoke().booleanValue()) {
            String str = o25.a().o().c;
            if (str == null) {
                return;
            }
            e eVar = this.o;
            snx snxVar = new snx(new snx.b.c(new vlw(str, null), null, null, 14));
            h7p0 h7p0Var = this.d;
            g(e.a(eVar, new VkTopBar.c.a(snxVar, new x4q(h7p0Var, 2), null, new oz4(h7p0Var, 4), null, 20), null, null, 6));
            return;
        }
        boolean z = this.r;
        int i = z ? R.drawable.vk_icon_cancel_outline_28 : R.drawable.vk_icon_arrow_left_outline_28;
        int i2 = z ? R.string.accessibility_cancel : R.string.accessibility_toolbar_return_back;
        VkTopBar vkTopBar = this.n;
        boolean z2 = true;
        if (vkTopBar == null || (c2 = g2u0.c(vkTopBar)) == null || s200.v(c2) == null) {
            Context b2 = b();
            HashSet hashSet = iah0.a;
            if (fnj.d(b2)) {
                z2 = false;
            }
        } else {
            Context b3 = b();
            HashSet hashSet2 = iah0.a;
            z2 = true ^ fnj.d(b3);
        }
        if ((z2 || this.r) && w7p0Var.a) {
            fVar = new VkTopBar.c.f(new gko(i), tq.h(tlo0.Companion, i2), this.s, null, this.r ? w7p0Var.j : w7p0Var.g, 24);
        } else {
            fVar = null;
        }
        g(e.a(this.o, fVar, null, null, 6));
    }

    public final void n(boolean z) {
        c cVar = this.o.c.c;
        boolean z2 = cVar != null ? cVar.g : false;
        int i = BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed;
        e eVar = this.o;
        g(e.a(eVar, null, null, d.a(eVar.c, null, null, z ? c.a(e(R.drawable.vk_icon_more_vertical_28, b(), R.string.accessibility_actions, Integer.valueOf(i), this.e.l, new hvr0(this, 19)), false, z2, 63) : null, null, null, 59), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.vk.core.view.components.topbar.VkTopBar$Middle$Text$Title$a] */
    public final void o(tlo0 tlo0Var, VkTopBar.Middle.Text.Title.a.C0870a c0870a) {
        VkTopBar.Middle.Text.Title.a.C0870a c0870a2;
        VkTopBar.Middle.Text.Title title;
        e eVar = this.o;
        VkTopBar.Middle.Text.Title.a.C0870a c0870a3 = c0870a;
        if (c0870a == null) {
            VkTopBar.Middle middle = eVar.b;
            VkTopBar.Middle.Text text = middle instanceof VkTopBar.Middle.Text ? (VkTopBar.Middle.Text) middle : null;
            if (text == null || (title = text.a) == null) {
                c0870a2 = null;
                g(e.a(eVar, null, new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0Var, null, c0870a2, null, null, 26), null, false ? 1 : 0, this.e.f, 6), null, 5));
            }
            c0870a3 = title.c;
        }
        c0870a2 = c0870a3;
        g(e.a(eVar, null, new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0Var, null, c0870a2, null, null, 26), null, false ? 1 : 0, this.e.f, 6), null, 5));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionShowFilters uIBlockActionShowFilters;
        List<CatalogFilterData> list;
        int id = view.getId();
        h7p0 h7p0Var = this.d;
        w7p0 w7p0Var = this.e;
        if (id != R.id.top_bar) {
            if (w7p0Var.e.invoke().booleanValue()) {
                h7p0Var.a();
                return;
            } else {
                this.b.c(false);
                return;
            }
        }
        UIBlockList uIBlockList = this.q;
        if (uIBlockList == null) {
            return;
        }
        if (!w7p0Var.b || !a.a(uIBlockList) || w7p0Var.c) {
            h7p0Var.d();
            return;
        }
        VkTopBar vkTopBar = this.n;
        if (vkTopBar == null || (uIBlockActionShowFilters = uIBlockList.B) == null || (list = uIBlockActionShowFilters.A) == null) {
            return;
        }
        ed5 ed5Var = new ed5(this, view, uIBlockList, 6);
        ListDataSet listDataSet = new ListDataSet();
        listDataSet.setItems(list);
        lfr lfrVar = new lfr(listDataSet, ed5Var);
        lfrVar.setItems(list);
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        vkTopBar.getContext();
        e.b bVar = new e.b(vkTopBar, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.l = lfrVar;
        VkContextMenu j = bVar.j();
        this.p = j;
        j.e(new nid0(this, 28));
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        m();
        k(this.o.c.a != null);
        h(this.o.c.b != null);
        n(this.o.c.c != null);
        l(this.o.c.d != null);
        c cVar = this.o.c.e;
        j(cVar != null, null, cVar != null ? cVar.a : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void setTitle(tlo0 tlo0Var) {
        o(tlo0Var, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void show() {
        VkTopBar vkTopBar = this.n;
        if (vkTopBar != null) {
            vkTopBar.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void dm(String str) {
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void tc(boolean z) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
