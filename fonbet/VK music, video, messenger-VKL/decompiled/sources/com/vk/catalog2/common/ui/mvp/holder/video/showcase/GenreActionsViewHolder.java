package com.vk.catalog2.common.ui.mvp.holder.video.showcase;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.b9s0;
import xsna.c5g;
import xsna.cp10;
import xsna.cri;
import xsna.dhr0;
import xsna.dt1;
import xsna.e43;
import xsna.epx;
import xsna.fwu0;
import xsna.g06;
import xsna.gzs;
import xsna.h06;
import xsna.hr80;
import xsna.j5g;
import xsna.ja8;
import xsna.jai;
import xsna.k9q0;
import xsna.kqu0;
import xsna.l5g;
import xsna.lpg0;
import xsna.n34;
import xsna.ojc;
import xsna.q630;
import xsna.qri;
import xsna.r18;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.u4a;
import xsna.uog0;
import xsna.vjw;
import xsna.vog0;
import xsna.wlb0;
import xsna.yqv0;

/* compiled from: GenreActionsViewHolder.kt */
/* loaded from: classes16.dex */
public final class GenreActionsViewHolder implements CatalogViewHolder {
    public final b9s0 b;
    public final u4a c;
    public final lpg0 d;
    public final SnapshotStateList<a> e = new SnapshotStateList<>();

    /* compiled from: GenreActionsViewHolder.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final UIBlockActionOpenSection c;

        public a(String str, String str2, UIBlockActionOpenSection uIBlockActionOpenSection) {
            this.a = str;
            this.b = str2;
            this.c = uIBlockActionOpenSection;
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "Action(title=" + this.a + ", imageUrl=" + this.b + ", block=" + this.c + ')';
        }
    }

    public GenreActionsViewHolder(b9s0 b9s0Var, u4a u4aVar, lpg0 lpg0Var) {
        this.b = b9s0Var;
        this.c = u4aVar;
        this.d = lpg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ?? l;
        ArrayList arrayList;
        ImageSize imageSize;
        ArrayList arrayList2;
        if (uIBlock instanceof UIBlockButtons) {
            SnapshotStateList<a> snapshotStateList = this.e;
            snapshotStateList.clear();
            ArrayList<UIBlock> arrayList3 = ((UIBlockButtons) uIBlock).y;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (obj instanceof UIBlockActionOpenSection) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) it.next();
                String str = uIBlockActionOpenSection.C;
                Image image = uIBlockActionOpenSection.F;
                if (!epx.f(str, OpenSectionViewStyle.ButtonStyle.SQUARE_THEMED.h())) {
                    String str2 = (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) ? null : imageSize.d.d;
                    l = e43.l(str2, str2);
                } else if (image == null || (arrayList2 = image.b) == null) {
                    l = EmptyList.b;
                } else {
                    l = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        l.add(((ImageSize) it2.next()).d.d);
                    }
                }
                String str3 = (String) l.get(0);
                String str4 = (String) l.get(1);
                String str5 = uIBlockActionOpenSection.z;
                if (!dhr0.M()) {
                    str3 = str4;
                }
                arrayList5.add(new a(str5, str3, uIBlockActionOpenSection));
            }
            snapshotStateList.addAll(arrayList5);
        }
    }

    public final void a(a aVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-156989302);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(-156989302, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder.ActionItem (GenreActionsViewHolder.kt:110)");
            }
            float f = kqu0.v;
            uog0 b = vog0.b(f);
            float f2 = this.c.b.c ? 163 : 128;
            q630.a aVar3 = q630.a.a;
            q630 c = ojc.c(r18.a((float) 0.5d, wlb0.h(M).p().d, rte0.d(txj0.q(aVar3, f2), vog0.b(f)), b), false, null, null, gzsVar, 15);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            vjw.a(fwu0.l(aVar.b, null, null, null, M, 0, 62), null, txj0.f(hr80.m(aVar3, l5g.c(14, wlb0.h(M).getImage().b, 0.6f), e.a), 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            yqv0.c(aVar.a, s200.E(txj0.f(aVar3, 1.0f), kqu0.w, kqu0.t), wlb0.h(M).getText().c, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).h0, M, 0, 0, 8184);
            M = M;
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new h06(i, 3, this, aVar, gzsVar);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        composeView.setContent(new jai(1297669922, new g06(4, this, composeView), true));
        return composeView;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
