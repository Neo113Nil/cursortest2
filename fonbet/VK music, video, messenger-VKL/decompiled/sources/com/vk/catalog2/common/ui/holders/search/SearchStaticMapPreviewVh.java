package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.search.dto.ui.UIBlockGroupsMapPreview;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bnc0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c98;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.hyk0;
import xsna.iah0;
import xsna.m3a;
import xsna.mo3;
import xsna.oqh0;
import xsna.pdw;
import xsna.v100;
import xsna.xyh0;
import xsna.yyh0;
import xsna.zyh0;

/* compiled from: SearchStaticMapPreviewVh.kt */
/* loaded from: classes16.dex */
public final class SearchStaticMapPreviewVh implements CatalogViewHolder, hyk0.c {
    public final m3a b;
    public final hyk0 c;
    public hyk0.b d;
    public View e;
    public FrameLayout f;
    public VkSkeleton g;
    public View h;
    public UIBlockGroupsMapPreview i;
    public boolean k;
    public final ThemableShimmer o;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();
    public int l = -1;
    public final bpn0 m = new bpn0(new v100(this, 28));
    public final bpn0 n = new bpn0(new oqh0(this, 1));

    public SearchStaticMapPreviewVh(m3a m3aVar, hyk0 hyk0Var) {
        this.b = m3aVar;
        this.c = hyk0Var;
        Context context = e43.a;
        this.o = new ThemableShimmer.a(context == null ? null : context).a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.e = null;
        this.d = null;
        this.k = false;
        this.j.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        hyk0.b bVar;
        GeoStaticPreviewInput.Item item;
        if (uIBlock instanceof UIBlockGroupsMapPreview) {
            UIBlockGroupsMapPreview uIBlockGroupsMapPreview = (UIBlockGroupsMapPreview) uIBlock;
            this.i = uIBlockGroupsMapPreview;
            List<UIBlockGroupsMapPreview.PreviewGroupItem> list = uIBlockGroupsMapPreview.y;
            View view = this.e;
            if (view == null || (bVar = this.d) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (UIBlockGroupsMapPreview.PreviewGroupItem previewGroupItem : list) {
                Group group = previewGroupItem.b;
                GroupCatalogItem groupCatalogItem = previewGroupItem.c;
                double d = groupCatalogItem.i;
                double d2 = groupCatalogItem.h;
                if (Double.isNaN(d) || Double.isNaN(d2)) {
                    item = null;
                } else {
                    Serializer.c<GroupCatalogItem> cVar = GroupCatalogItem.CREATOR;
                    long j = groupCatalogItem.b;
                    float f = (float) d2;
                    float f2 = (float) groupCatalogItem.i;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append('_');
                    sb.append(f);
                    sb.append('_');
                    sb.append(f2);
                    String sb2 = sb.toString();
                    String str = group.d;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    double d3 = groupCatalogItem.h;
                    double d4 = groupCatalogItem.i;
                    double d5 = groupCatalogItem.j;
                    Double valueOf = !Double.isNaN(d5) ? Double.valueOf(d5) : null;
                    item = new GeoStaticPreviewInput.Item(sb2, str2, d3, d4, valueOf != null ? valueOf.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, group.e);
                }
                if (item != null) {
                    arrayList.add(item);
                }
            }
            boolean c = dhr0.a.c(view.getContext());
            bVar.setInput(new GeoStaticPreviewInput(0, 0, 0, null, false, !c, false, arrayList, !c ? (IconDrawConfig) this.m.getValue() : (IconDrawConfig) this.n.getValue(), 0, 0, false, false, 7775, null));
            View view2 = this.h;
            if (view2 != null) {
                bwt0.p0(view2, this.k);
            }
        }
    }

    @Override // xsna.hyk0.c
    public final void a(String str) {
        L.l("onStaticPreviewFailure ".concat(str));
    }

    @Override // xsna.hyk0.c
    public final void b() {
        this.k = true;
        View view = this.h;
        if (view != null) {
            bwt0.p0(view, true);
        }
        this.o.c();
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeView(this.g);
        }
        this.g = null;
    }

    public final void c() {
        UIBlockGroupsMapPreview uIBlockGroupsMapPreview;
        hyk0.b bVar;
        if (!this.k || (uIBlockGroupsMapPreview = this.i) == null || (bVar = this.d) == null) {
            return;
        }
        this.b.j(new xyh0(uIBlockGroupsMapPreview.y, bVar.a()));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_search_static_map_preview, viewGroup, false);
        this.e = inflate;
        Context context = inflate.getContext();
        e3m.a aVar = e3m.a;
        this.l = context.getColor(R.color.vk_purple);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.map_view_stub_container);
        if (frameLayout != null) {
            VkSkeleton vkSkeleton = new VkSkeleton(frameLayout.getContext(), null, 0, 14, 0);
            vkSkeleton.setArea(new a.C0863a(frameLayout));
            vkSkeleton.setShimmer(this.o);
            bwt0.d(vkSkeleton, iah0.a(10), (r4 & 2) != 0, (r4 & 4) != 0);
            this.g = vkSkeleton;
            frameLayout.addView(vkSkeleton);
            ViewStub viewStub = (ViewStub) frameLayout.findViewById(R.id.map_view_stub);
            boolean c = dhr0.a.c(frameLayout.getContext());
            hyk0.b a = this.c.a(frameLayout.getContext(), new GeoStaticPreviewInput(0, 0, 0, null, false, !c, false, EmptyList.b, !c ? (IconDrawConfig) this.m.getValue() : (IconDrawConfig) this.n.getValue(), 0, 0, false, false, 7775, null), this);
            new zyh0(this, SearchStaticMapPreviewVh.class, "mapViewWrapper", "getMapViewWrapper()Lcom/vk/geo/api/StaticPreviewFactory$PreviewWrapper;", 0).set(a);
            View geoStaticPreview = a.getGeoStaticPreview();
            geoStaticPreview.setId(viewStub.getId());
            geoStaticPreview.setContentDescription(frameLayout.getContext().getString(R.string.search_catalog_accessibility_open_map));
            geoStaticPreview.setOnClickListener(new c98(this, 11));
            int indexOfChild = frameLayout.indexOfChild(viewStub);
            frameLayout.removeViewInLayout(viewStub);
            frameLayout.addView(geoStaticPreview, indexOfChild, viewStub.getLayoutParams());
        } else {
            frameLayout = null;
        }
        this.f = frameLayout;
        this.h = bwt0.p(inflate, R.id.expand_button, new mo3(this, 15), null, 4);
        this.j.b(((f) this.b.b).b0(yyh0.class).subscribe(new pdw(new bnc0(this, 7), 22)));
        return inflate;
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
