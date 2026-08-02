package com.vk.catalog2.common.ui.mvp.holder.header;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.header.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.search.ModernSearchView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j2;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.aer0;
import xsna.asp;
import xsna.asu0;
import xsna.bpn0;
import xsna.d750;
import xsna.d8t0;
import xsna.dml;
import xsna.duh0;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fiu0;
import xsna.fpf0;
import xsna.frp0;
import xsna.fyi0;
import xsna.gko;
import xsna.grp0;
import xsna.gzs;
import xsna.hsv0;
import xsna.izs;
import xsna.j5g;
import xsna.jgz;
import xsna.l140;
import xsna.mhy;
import xsna.n5j0;
import xsna.nuv0;
import xsna.o25;
import xsna.oan0;
import xsna.oq;
import xsna.ou4;
import xsna.ox80;
import xsna.qcy;
import xsna.qoy;
import xsna.quz;
import xsna.s3q0;
import xsna.snx;
import xsna.sxh0;
import xsna.t3v;
import xsna.t970;
import xsna.tdm;
import xsna.tho0;
import xsna.tlo0;
import xsna.tq;
import xsna.txh0;
import xsna.vlw;
import xsna.wzs;
import xsna.xim0;
import xsna.yjs0;
import xsna.zrp;

/* compiled from: VkTopBarSearchQueryVh.kt */
/* loaded from: classes16.dex */
public final class VkTopBarSearchQueryVh implements VkCatalogSearchQueryViewHolder {
    public static final /* synthetic */ qcy<Object>[] s;
    public final int b;
    public final duh0 c;
    public final grp0 d;
    public final txh0 e;
    public final VkTopBar.m f;
    public final VkTopBar.j g;
    public final gzs<Boolean> h;
    public final boolean i;
    public final IconOrder j;
    public final bpn0 k;
    public VkTopBar l;
    public View m;
    public boolean n;
    public io.reactivex.rxjava3.disposables.c o;
    public final io.reactivex.rxjava3.subjects.d<String> p;
    public final tdm q;
    public b r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final class IconOrder {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconOrder[] $VALUES;
        public static final IconOrder OptionalThirdSearch;
        public static final IconOrder ThirdSearchOptional;

        static {
            IconOrder iconOrder = new IconOrder("ThirdSearchOptional", 0);
            ThirdSearchOptional = iconOrder;
            IconOrder iconOrder2 = new IconOrder("OptionalThirdSearch", 1);
            OptionalThirdSearch = iconOrder2;
            IconOrder[] iconOrderArr = {iconOrder, iconOrder2};
            $VALUES = iconOrderArr;
            $ENTRIES = new asp(iconOrderArr);
        }

        public IconOrder() {
            throw null;
        }

        public static IconOrder valueOf(String str) {
            return (IconOrder) Enum.valueOf(IconOrder.class, str);
        }

        public static IconOrder[] values() {
            return (IconOrder[]) $VALUES.clone();
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final class a {
        public final boolean a;
        public final a.b b;
        public final hsv0 c;
        public final boolean d;
        public final com.vk.catalog2.common.ui.mvp.holder.header.a e;
        public final gzs<s3q0> f;
        public final boolean g;
        public final com.vk.catalog2.common.ui.mvp.holder.header.a h;

        /* compiled from: VkTopBarSearchQueryVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0503a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IconOrder.values().length];
                try {
                    iArr[IconOrder.ThirdSearchOptional.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IconOrder.OptionalThirdSearch.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(boolean z, a.b bVar, hsv0 hsv0Var, boolean z2, com.vk.catalog2.common.ui.mvp.holder.header.a aVar, gzs gzsVar, boolean z3, com.vk.catalog2.common.ui.mvp.holder.header.a aVar2) {
            this.a = z;
            this.b = bVar;
            this.c = hsv0Var;
            this.d = z2;
            this.e = aVar;
            this.f = gzsVar;
            this.g = z3;
            this.h = aVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v8, types: [com.vk.catalog2.common.ui.mvp.holder.header.a] */
        /* JADX WARN: Type inference failed for: r13v2, types: [com.vk.catalog2.common.ui.mvp.holder.header.a] */
        public static a a(a aVar, boolean z, a.b bVar, boolean z2, a.b bVar2, gzs gzsVar, boolean z3, a.C0504a c0504a, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            boolean z4 = z;
            if ((i & 2) != 0) {
                bVar = aVar.b;
            }
            a.b bVar3 = bVar;
            hsv0 hsv0Var = aVar.c;
            aVar.getClass();
            aVar.getClass();
            aVar.getClass();
            if ((i & 64) != 0) {
                z2 = aVar.d;
            }
            boolean z5 = z2;
            a.b bVar4 = bVar2;
            if ((i & 128) != 0) {
                bVar4 = aVar.e;
            }
            a.b bVar5 = bVar4;
            if ((i & 256) != 0) {
                gzsVar = aVar.f;
            }
            gzs gzsVar2 = gzsVar;
            if ((i & 512) != 0) {
                z3 = aVar.g;
            }
            boolean z6 = z3;
            a.C0504a c0504a2 = (i & 1024) != 0 ? aVar.h : c0504a;
            aVar.getClass();
            aVar.getClass();
            return new a(z4, bVar3, hsv0Var, z5, bVar5, gzsVar2, z6, c0504a2);
        }

        public static com.vk.catalog2.common.ui.mvp.holder.header.a b(com.vk.catalog2.common.ui.mvp.holder.header.a aVar, gzs gzsVar) {
            if (aVar instanceof a.C0504a) {
                return aVar;
            }
            if (aVar instanceof a.b) {
                return a.b.a((a.b) aVar, null, null, null, gzsVar, 63);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 29791, false), 31, this.d);
            com.vk.catalog2.common.ui.mvp.holder.header.a aVar = this.e;
            int hashCode = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.f;
            int b2 = qoy.b((hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31, 31, this.g);
            com.vk.catalog2.common.ui.mvp.holder.header.a aVar2 = this.h;
            return (b2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return "TopBarMenuState(showSearch=" + this.a + ", search=" + this.b + ", searchOnClick=" + this.c + ", showRightBtn=false, rightBtn=null, rightBtnOnClick=null, showThird=" + this.d + ", third=" + this.e + ", thirdOnClick=" + this.f + ", showOptional=" + this.g + ", optional=" + this.h + ", optionOnClick=null)";
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final class b {
        public final VkTopBar.b a;
        public final boolean b;
        public final VkTopBar.c c;
        public final boolean d;
        public final VkTopBar.Middle.Text e;
        public final boolean f;
        public final VkTopBar.Middle.d g;
        public final boolean h;
        public final VkTopBar.Middle.d.a.b i;
        public final a j;

        public b(VkTopBar.b bVar, boolean z, VkTopBar.c cVar, boolean z2, VkTopBar.Middle.Text text, boolean z3, VkTopBar.Middle.d dVar, boolean z4, VkTopBar.Middle.d.a.b bVar2, a aVar) {
            this.a = bVar;
            this.b = z;
            this.c = cVar;
            this.d = z2;
            this.e = text;
            this.f = z3;
            this.g = dVar;
            this.h = z4;
            this.i = bVar2;
            this.j = aVar;
        }

        public static b a(b bVar, boolean z, VkTopBar.c cVar, boolean z2, VkTopBar.Middle.Text text, boolean z3, VkTopBar.Middle.d dVar, boolean z4, VkTopBar.Middle.d.a.b bVar2, a aVar, int i) {
            boolean z5 = z;
            VkTopBar.b bVar3 = bVar.a;
            if ((i & 2) != 0) {
                z5 = bVar.b;
            }
            if ((i & 4) != 0) {
                cVar = bVar.c;
            }
            if ((i & 8) != 0) {
                z2 = bVar.d;
            }
            if ((i & 16) != 0) {
                text = bVar.e;
            }
            if ((i & 32) != 0) {
                z3 = bVar.f;
            }
            if ((i & 64) != 0) {
                dVar = bVar.g;
            }
            if ((i & 128) != 0) {
                z4 = bVar.h;
            }
            if ((i & 256) != 0) {
                bVar2 = bVar.i;
            }
            if ((i & 512) != 0) {
                aVar = bVar.j;
            }
            a aVar2 = aVar;
            bVar.getClass();
            VkTopBar.Middle.d.a.b bVar4 = bVar2;
            boolean z6 = z4;
            VkTopBar.Middle.d dVar2 = dVar;
            boolean z7 = z3;
            VkTopBar.Middle.Text text2 = text;
            boolean z8 = z2;
            return new b(bVar3, z5, cVar, z8, text2, z7, dVar2, z6, bVar4, aVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && this.h == bVar.h && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            VkTopBar.c cVar = this.c;
            int b2 = qoy.b((this.e.hashCode() + qoy.b((b + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.d)) * 31, 31, this.f);
            VkTopBar.Middle.d dVar = this.g;
            int b3 = qoy.b((b2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.h);
            VkTopBar.Middle.d.a.b bVar = this.i;
            return this.j.hashCode() + ((b3 + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "TopBarState(backButton=" + this.a + ", showBackBtn=" + this.b + ", navigationButton=" + this.c + ", showNavigationButton=" + this.d + ", title=" + this.e + ", showTitle=" + this.f + ", search=" + this.g + ", showSearch=" + this.h + ", filter=" + this.i + ", menuState=" + this.j + ')';
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, String> {
        @Override // xsna.izs
        public final String invoke(String str) {
            return ((frp0) this.receiver).a(str);
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((sxh0) this.receiver).f();
            return s3q0.a;
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((sxh0) this.receiver).a();
            return s3q0.a;
        }
    }

    /* compiled from: VkTopBarSearchQueryVh.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((sxh0) this.receiver).b();
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VkTopBarSearchQueryVh.class, "topBarHint", "getTopBarHint()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        s = new qcy[]{mutablePropertyReference1Impl};
    }

    public VkTopBarSearchQueryVh() {
        throw null;
    }

    public VkTopBarSearchQueryVh(int i, dml dmlVar, grp0 grp0Var, txh0 txh0Var, VkTopBar.m mVar, VkTopBar.j jVar, gzs gzsVar, long j, IconOrder iconOrder, int i2) {
        VkTopBar.m mVar2 = (i2 & 16) != 0 ? VkTopBar.m.a.a : mVar;
        VkTopBar.j jVar2 = (i2 & 32) != 0 ? VkTopBar.j.a.a : jVar;
        gzs fiu0Var = (i2 & 64) != 0 ? new fiu0(1) : gzsVar;
        boolean z = (i2 & 128) == 0;
        IconOrder iconOrder2 = (i2 & 512) != 0 ? IconOrder.ThirdSearchOptional : iconOrder;
        this.b = i;
        this.c = dmlVar;
        this.d = grp0Var;
        this.e = txh0Var;
        this.f = mVar2;
        this.g = jVar2;
        this.h = fiu0Var;
        this.i = z;
        this.j = iconOrder2;
        this.k = new bpn0(new t970(22));
        this.n = true;
        this.p = io.reactivex.rxjava3.subjects.d.N0();
        this.q = new tdm(new d8t0(this, 7), new xim0(this, 16));
        VkTopBar.b bVar = new VkTopBar.b(new com.vk.catalog2.common.ui.mvp.holder.header.b(0, txh0Var, sxh0.class, "backIconClick", "backIconClick()Z", 8), tq.h(tlo0.Companion, R.string.music_talkback_go_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new t3v(27), 3), 12);
        VkTopBar.Middle.Text text = new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.h(""), new com.vk.catalog2.common.ui.mvp.holder.header.c(0, txh0Var, sxh0.class, "titleClick", "titleClick()V", 0), null, null, com.vk.core.compose.component.semantics.b.a(null, new oan0(11), 3), 12), null, null, null, 14);
        gko gkoVar = new gko(R.drawable.vk_icon_search_outline_28);
        Context context = e43.a;
        this.r = new b(bVar, false, null, false, text, false, null, false, null, new a(true, new a.b(gkoVar, (context == null ? null : context).getString(R.string.search), null, com.vk.core.compose.component.semantics.b.a(null, new nuv0(0), 3), 88), new hsv0(this, 1), true, null, null, true, null));
    }

    public static VkTopBar.a.b b(com.vk.catalog2.common.ui.mvp.holder.header.a aVar) {
        if (aVar instanceof a.C0504a) {
            return new VkTopBar.a.b.C0876a(((a.C0504a) aVar).a);
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        return new VkTopBar.a.b.C0877b(bVar.a, oq.d(tlo0.Companion, bVar.b), bVar.c ? bVar.g : null, bVar.e, bVar.d, bVar.f);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Fb() {
        VkTopBar vkTopBar = this.l;
        if (vkTopBar == null) {
            return;
        }
        mhy.j(vkTopBar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Kf(gzs<s3q0> gzsVar) {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, false, null, gzsVar, false, null, 3839), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Km(long j) {
        VkTopBar vkTopBar = this.l;
        if (vkTopBar == null) {
            return;
        }
        if (j > 0) {
            vkTopBar.postDelayed(new ou4(vkTopBar, 12), j);
        } else {
            mhy.d(vkTopBar);
        }
        b bVar = this.r;
        VkTopBar.Middle.d dVar = bVar.g;
        h(b.a(bVar, false, null, false, null, false, dVar != null ? VkTopBar.Middle.d.a(dVar, null, null, false, null, 4091) : null, false, null, null, 959));
        VkTopBar vkTopBar2 = this.l;
        if (vkTopBar2 != null) {
            vkTopBar2.clearFocus();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = null;
        this.m = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void Ll() {
        h(b.a(this.r, false, null, false, null, false, null, false, null, null, 831));
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = null;
        this.p.onNext("");
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ml(int i, int i2) {
        gko gkoVar = new gko(i);
        b bVar = this.r;
        a aVar = bVar.j;
        Context context = e43.a;
        VkTopBar.l lVar = null;
        if (context == null) {
            context = null;
        }
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(aVar, false, null, true, new a.b(gkoVar, context.getString(i2), lVar, com.vk.core.compose.component.semantics.b.a(null, new fyi0(11), 3), 72), null, false, null, 3903), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void N2() {
        h(b.a(this.r, true, null, false, null, false, null, false, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void P1(String str) {
        this.q.setValue(this, s[0], str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ta() {
        b bVar = this.r;
        VkTopBar.Middle.d dVar = bVar.g;
        h(b.a(bVar, false, null, false, null, false, dVar != null ? VkTopBar.Middle.d.a(dVar, null, null, true, null, 4091) : null, false, null, null, 959));
        VkTopBar vkTopBar = this.l;
        if (vkTopBar != null) {
            vkTopBar.requestFocus();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void Tk() {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, true, null, false, null, null, false, null, 4094), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    public final io.reactivex.rxjava3.disposables.c a(io.reactivex.rxjava3.subjects.d<String> dVar, long j, wzs<? super String, ? super SearchInputMethod, s3q0> wzsVar) {
        dVar.getClass();
        q U = new j2(dVar).U(new n5j0(new c(1, this.d, frp0.class, "trim", "trim(Ljava/lang/String;)Ljava/lang/String;", 0), 10));
        if (j > 0) {
            U = U.z(j, TimeUnit.MILLISECONDS, asu0.a.c());
        }
        return U.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new d750(new aer0(wzsVar, 5), 29), new ox80(new l140(28), 17));
    }

    public final void c() {
        h(b.a(this.r, false, null, false, null, false, null, false, null, null, 1015));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final Boolean c9() {
        VkTopBar vkTopBar = this.l;
        VkTopBar.Middle middle = vkTopBar != null ? vkTopBar.getMiddle() : null;
        VkTopBar.Middle.d dVar = middle instanceof VkTopBar.Middle.d ? (VkTopBar.Middle.d) middle : null;
        if (dVar != null) {
            return Boolean.valueOf(dVar.c);
        }
        return null;
    }

    public final void d() {
        h(b.a(this.r, false, null, false, null, false, null, false, null, null, 991));
    }

    public final void e(LottieAnimationView lottieAnimationView) {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, false, null, null, true, new a.C0504a(lottieAnimationView), 2559), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void en() {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, true, null, null, false, null, 4031), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void fi() {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, false, null, null, false, null, 4094), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    public final void g(boolean z, boolean z2) {
        h(b.a(this.r, false, null, false, null, false, null, false, z ? new VkTopBar.Middle.d.a.b(new d(0, this.e, sxh0.class, "paramIconClick", "paramIconClick()V", 0)) : null, null, 767));
    }

    public final void h(b bVar) {
        this.r = bVar;
        n(bVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void hc() {
        h(b.a(this.r, false, null, false, null, true, null, false, null, null, 991));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        View view = this.m;
        if (view != null) {
            f4m.j(view);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final String i() {
        String P0 = this.p.P0();
        return P0 == null ? "" : P0;
    }

    public final void j(Integer num) {
        boolean z = num != null;
        if (this.n == z) {
            return;
        }
        VkTopBar vkTopBar = this.l;
        if (vkTopBar != null) {
            vkTopBar.setInitialMode(z ? com.vk.core.view.components.topbar.d.a : VkTopBar.j.a.a);
        }
        n(this.r);
        this.n = z;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void j5() {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, false, null, null, this.i, null, 3583), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    public final void k(snx snxVar) {
        snx snxVar2;
        if (snxVar == null) {
            String str = o25.a().o().c;
            snx snxVar3 = str == null ? null : new snx(new snx.b.c(new vlw(str, null), null, null, 14));
            if (snxVar3 == null) {
                return;
            } else {
                snxVar2 = snxVar3;
            }
        } else {
            snxVar2 = snxVar;
        }
        b bVar = this.r;
        txh0 txh0Var = this.e;
        h(b.a(bVar, false, new VkTopBar.c.a(snxVar2, new e(0, txh0Var, sxh0.class, "drawerIconClick", "drawerIconClick()V", 0), null, new f(0, txh0Var, sxh0.class, "drawerIconLongClick", "drawerIconLongClick()V", 0), com.vk.core.compose.component.semantics.b.a(null, new quz(28), 3), 4), false, null, false, null, false, null, null, 1019));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void k3() {
        b bVar = this.r;
        VkTopBar.Middle.d dVar = bVar.g;
        h(b.a(bVar, false, null, false, null, false, dVar != null ? VkTopBar.Middle.d.a(dVar, null, new tho0("", jgz.c(0, 0), 4), false, null, 4093) : null, false, null, null, 959));
        this.p.onNext("");
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pds_catalog_vk_top_bar_search_query_view, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.search);
        vkTopBar.setTransitionHeaderColor(this.f);
        vkTopBar.setInitialMode(this.g);
        this.l = vkTopBar;
        this.m = inflate;
        if (this.i) {
            f4m.r(0, inflate);
        }
        if (this.h.invoke().booleanValue()) {
            k(null);
        }
        return inflate;
    }

    public final void l() {
        h(b.a(this.r, false, null, true, null, false, null, false, null, null, 1015));
    }

    public final void m() {
        h(b.a(this.r, false, null, false, null, false, null, true, null, null, 895));
    }

    public final void n(b bVar) {
        VkTopBar.c cVar;
        int i;
        int i2;
        a.b bVar2;
        VkTopBar.a.c fVar;
        int i3;
        int i4;
        a.b bVar3;
        VkTopBar vkTopBar = this.l;
        if (vkTopBar == null) {
            return;
        }
        VkTopBar.a.d dVar = null;
        vkTopBar.setBack(bVar.b ? bVar.a : null);
        if (bVar.b || (cVar = bVar.c) == null || !bVar.d) {
            cVar = null;
        }
        vkTopBar.setBefore(cVar);
        VkTopBar.Middle.d dVar2 = bVar.g;
        if (dVar2 != null && bVar.h) {
            vkTopBar.setMiddle(VkTopBar.Middle.d.a(dVar2, null, null, false, this.r.i, 3583));
        } else if (bVar.f) {
            vkTopBar.setMiddle(bVar.e);
        }
        a aVar = bVar.j;
        aVar.getClass();
        gzs<s3q0> gzsVar = aVar.f;
        com.vk.catalog2.common.ui.mvp.holder.header.a aVar2 = aVar.e;
        boolean z = aVar.d;
        com.vk.catalog2.common.ui.mvp.holder.header.a aVar3 = aVar.h;
        boolean z2 = aVar.g;
        hsv0 hsv0Var = aVar.c;
        boolean z3 = aVar.a;
        ArrayList arrayList = new ArrayList();
        int i5 = a.C0503a.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i5 == 1) {
            com.vk.catalog2.common.ui.mvp.holder.header.a b2 = (!z2 || aVar3 == null) ? null : a.b(aVar3, null);
            if (b2 != null) {
                arrayList.add(b2);
            }
            com.vk.catalog2.common.ui.mvp.holder.header.a b3 = (!z || aVar2 == null) ? null : a.b(aVar2, gzsVar);
            if (b3 != null) {
                arrayList.add(b3);
            }
            if (z3) {
                a.b bVar4 = aVar.b;
                i = 1;
                i2 = 2;
                bVar2 = a.b.a(bVar4, null, null, null, hsv0Var, 63);
            } else {
                i = 1;
                i2 = 2;
                bVar2 = null;
            }
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (z3) {
                a.b bVar5 = aVar.b;
                i4 = 1;
                i3 = 2;
                bVar3 = a.b.a(bVar5, null, null, null, hsv0Var, 63);
            } else {
                i3 = 2;
                i4 = 1;
                bVar3 = null;
            }
            if (bVar3 != null) {
                arrayList.add(bVar3);
            }
            com.vk.catalog2.common.ui.mvp.holder.header.a b4 = (!z2 || aVar3 == null) ? null : a.b(aVar3, null);
            if (b4 != null) {
                arrayList.add(b4);
            }
            com.vk.catalog2.common.ui.mvp.holder.header.a b5 = (!z || aVar2 == null) ? null : a.b(aVar2, gzsVar);
            if (b5 != null) {
                arrayList.add(b5);
            }
            i = i4;
            i2 = i3;
        }
        if (!arrayList.isEmpty()) {
            com.vk.catalog2.common.ui.mvp.holder.header.a aVar4 = (com.vk.catalog2.common.ui.mvp.holder.header.a) arrayList.get(0);
            if (aVar4 instanceof a.C0504a) {
                fVar = new VkTopBar.a.c.d(((a.C0504a) aVar4).a);
            } else {
                if (!(aVar4 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b bVar6 = (a.b) aVar4;
                fVar = new VkTopBar.a.c.f(bVar6.a, oq.d(tlo0.Companion, bVar6.b), bVar6.c ? bVar6.g : null, bVar6.e, bVar6.d, bVar6.f);
            }
            com.vk.catalog2.common.ui.mvp.holder.header.a aVar5 = (com.vk.catalog2.common.ui.mvp.holder.header.a) j5g.b0(i, arrayList);
            VkTopBar.a.b b6 = aVar5 != null ? b(aVar5) : null;
            com.vk.catalog2.common.ui.mvp.holder.header.a aVar6 = (com.vk.catalog2.common.ui.mvp.holder.header.a) j5g.b0(i2, arrayList);
            dVar = new VkTopBar.a.d(fVar, b6, aVar6 != null ? b(aVar6) : null);
        }
        vkTopBar.setAfter(dVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final ModernSearchView pi() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void r9() {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, false, null, null, false, null, 4031), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void setEnabled(boolean z) {
        VkTopBar vkTopBar = this.l;
        if (vkTopBar != null) {
            vkTopBar.setEnabled(z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void sj(String str) {
        b bVar = this.r;
        VkTopBar.Middle.Text.Title title = bVar.e.a;
        tlo0.Companion.getClass();
        h(b.a(bVar, false, null, false, new VkTopBar.Middle.Text(VkTopBar.Middle.Text.Title.a(title, new tlo0.h(str), null, 30), null, null, com.vk.core.compose.component.semantics.b.a(null, new yjs0(5), 3), 6), false, null, false, null, null, 1007));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder
    public final void xi() {
        b bVar = this.r;
        h(b.a(bVar, false, null, false, null, false, null, false, null, a.a(bVar.j, false, null, false, null, null, false, null, 3583), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void y8() {
        h(b.a(this.r, false, null, false, null, false, null, false, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void zf(String str, boolean z) {
        if (str.equals(i())) {
            return;
        }
        VkTopBar.Middle.d dVar = null;
        io.reactivex.rxjava3.subjects.d<String> dVar2 = this.p;
        if (z) {
            Pair<Long, wzs<String, SearchInputMethod, s3q0>> c3 = this.c.c3();
            long longValue = c3.d().longValue();
            wzs<String, SearchInputMethod, s3q0> g = c3.g();
            io.reactivex.rxjava3.disposables.c cVar = this.o;
            if (cVar != null) {
                cVar.dispose();
            }
            b bVar = this.r;
            VkTopBar.Middle.d dVar3 = bVar.g;
            if (dVar3 != null) {
                int length = str.length();
                dVar = VkTopBar.Middle.d.a(dVar3, null, new tho0(str, jgz.c(length, length), 4), false, null, 4093);
            }
            h(b.a(bVar, false, null, false, null, false, dVar, false, null, null, 959));
            dVar2.onNext(str);
            this.o = a(dVar2, longValue, g);
        } else {
            b bVar2 = this.r;
            VkTopBar.Middle.d dVar4 = bVar2.g;
            if (dVar4 != null) {
                int length2 = str.length();
                dVar = VkTopBar.Middle.d.a(dVar4, null, new tho0(str, jgz.c(length2, length2), 4), false, null, 4093);
            }
            h(b.a(bVar2, false, null, false, null, false, dVar, false, null, null, 959));
            dVar2.onNext(str);
        }
        Km(0L);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void K6(boolean z) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void om(boolean z) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
