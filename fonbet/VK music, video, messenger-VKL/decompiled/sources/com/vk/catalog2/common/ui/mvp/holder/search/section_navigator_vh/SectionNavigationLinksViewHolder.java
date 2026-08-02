package com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a9s0;
import xsna.b5a;
import xsna.b9s0;
import xsna.c5g;
import xsna.cfp0;
import xsna.dhr0;
import xsna.izs;
import xsna.j5g;
import xsna.jai;
import xsna.nda;
import xsna.q3a;
import xsna.s3q0;
import xsna.w61;
import xsna.wh50;
import xsna.xvh0;
import xsna.zak0;

/* compiled from: SectionNavigationLinksViewHolder.kt */
/* loaded from: classes16.dex */
public final class SectionNavigationLinksViewHolder implements CatalogViewHolder {
    public final b9s0 b;
    public final nda c;
    public final q3a d;
    public final b5a e;
    public final SearchStatInfoProvider f;
    public final wh50 g = k.b(null);
    public UIBlock h;
    public Context i;

    /* compiled from: SectionNavigationLinksViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<b.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b.a aVar) {
            b.a aVar2 = aVar;
            SectionNavigationLinksViewHolder sectionNavigationLinksViewHolder = (SectionNavigationLinksViewHolder) this.receiver;
            b5a b5aVar = sectionNavigationLinksViewHolder.e;
            UIBlock uIBlock = sectionNavigationLinksViewHolder.h;
            if (uIBlock == null) {
                uIBlock = null;
            }
            b5aVar.a(new cfp0(uIBlock, new xvh0(aVar2.c)));
            sectionNavigationLinksViewHolder.d.b(new a9s0(aVar2.b), true);
            return s3q0.a;
        }
    }

    /* compiled from: SectionNavigationLinksViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<b.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b.a aVar) {
            b.a aVar2 = aVar;
            SectionNavigationLinksViewHolder sectionNavigationLinksViewHolder = (SectionNavigationLinksViewHolder) this.receiver;
            b5a b5aVar = sectionNavigationLinksViewHolder.e;
            UIBlock uIBlock = sectionNavigationLinksViewHolder.h;
            if (uIBlock == null) {
                uIBlock = null;
            }
            b5aVar.a(new cfp0(uIBlock, new xvh0(aVar2.c)));
            SearchStatInfoProvider searchStatInfoProvider = sectionNavigationLinksViewHolder.f;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CATALOG_ITEM;
            String str = aVar2.c;
            if (str == null) {
                str = "";
            }
            SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, str, true);
            nda ndaVar = sectionNavigationLinksViewHolder.c;
            Context context = sectionNavigationLinksViewHolder.i;
            nda.e(ndaVar, context != null ? context : null, sectionNavigationLinksViewHolder.b, aVar2.b, aVar2.a, null, b, null, PsExtractor.AUDIO_STREAM);
            return s3q0.a;
        }
    }

    public SectionNavigationLinksViewHolder(b9s0 b9s0Var, nda ndaVar, q3a q3aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = b9s0Var;
        this.c = ndaVar;
        this.d = q3aVar;
        this.e = b5aVar;
        this.f = searchStatInfoProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionOpenSection uIBlockActionOpenSection;
        ?? r5;
        ArrayList arrayList;
        if (uIBlock instanceof UIBlockButtons) {
            this.h = uIBlock;
            ArrayList<UIBlock> arrayList2 = ((UIBlockButtons) uIBlock).y;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof UIBlockActionOpenSection) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.isEmpty() || (uIBlockActionOpenSection = (UIBlockActionOpenSection) j5g.a0(arrayList3)) == null) {
                return;
            }
            String str = uIBlockActionOpenSection.z;
            String str2 = uIBlockActionOpenSection.A;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            Image image = uIBlockActionOpenSection.F;
            if (image == null || (arrayList = image.b) == null) {
                r5 = EmptyList.b;
            } else {
                r5 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r5.add(((ImageSize) it.next()).d.d);
                }
            }
            String str4 = (String) r5.get(0);
            String str5 = (String) r5.get(1);
            if (!dhr0.M()) {
                str4 = str5;
            }
            b.a aVar = new b.a(uIBlockActionOpenSection.z, uIBlockActionOpenSection.B, uIBlockActionOpenSection.G);
            List<UIBlockActionOpenSection> S = j5g.S(arrayList3, 1);
            ArrayList arrayList4 = new ArrayList(c5g.u(S, 10));
            for (UIBlockActionOpenSection uIBlockActionOpenSection2 : S) {
                arrayList4.add(new b.a(uIBlockActionOpenSection2.z, uIBlockActionOpenSection2.B, uIBlockActionOpenSection2.G));
            }
            ((zak0) this.g).setValue(new com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b(str, str3, str4, aVar, arrayList4));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i = layoutInflater.getContext();
        Context context = this.i;
        if (context == null) {
            context = null;
        }
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new jai(2060206904, new w61(this, 13), true));
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
