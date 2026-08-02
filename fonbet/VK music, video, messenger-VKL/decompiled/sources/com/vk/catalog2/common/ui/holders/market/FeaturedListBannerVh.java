package com.vk.catalog2.common.ui.holders.market;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockStaticLinksBanner;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.bwt0;
import xsna.epx;
import xsna.g5g;
import xsna.h6g;
import xsna.svb0;
import xsna.tbh;

/* compiled from: FeaturedListBannerVh.kt */
/* loaded from: classes16.dex */
public final class FeaturedListBannerVh implements CatalogViewHolder {
    public b b;
    public LinearLayout c;

    /* compiled from: FeaturedListBannerVh.kt */
    public static final class a {
        public final View a;
        public final TextView b;
        public final VKImageView c;

        public a(LayoutInflater layoutInflater) {
            View inflate = layoutInflater.inflate(R.layout.catalog_featured_list_banner_item, (ViewGroup) null, false);
            this.a = inflate;
            this.b = (TextView) inflate.findViewById(R.id.title);
            this.c = (VKImageView) inflate.findViewById(R.id.image);
        }
    }

    /* compiled from: FeaturedListBannerVh.kt */
    public static final class b implements svb0<a> {
        public final tbh a;
        public final LinkedList<a> b = new LinkedList<>();
        public final LinkedList<a> c = new LinkedList<>();

        /* JADX WARN: Multi-variable type inference failed */
        public b(tbh tbhVar) {
            this.a = tbhVar;
            for (int i = 0; i < 3; i++) {
                this.b.push(this.a.invoke());
            }
        }

        @Override // xsna.svb0
        public final boolean a(a aVar) {
            a aVar2 = aVar;
            boolean remove = this.c.remove(aVar2);
            if (remove) {
                this.b.push(aVar2);
            }
            return remove;
        }

        public final void b(LinearLayout linearLayout) {
            Object obj;
            int i = 0;
            while (true) {
                if (!(i < linearLayout.getChildCount())) {
                    linearLayout.removeAllViewsInLayout();
                    return;
                }
                int i2 = i + 1;
                View childAt = linearLayout.getChildAt(i);
                LinkedList<a> linkedList = this.c;
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((a) obj).a, childAt)) {
                            break;
                        }
                    }
                }
                a aVar = (a) obj;
                if (aVar != null && linkedList.remove(aVar)) {
                    this.b.push(aVar);
                }
                i = i2;
            }
        }

        @Override // xsna.svb0
        public final a c() {
            a aVar = (a) g5g.H(this.b);
            if (aVar == null) {
                aVar = (a) this.a.invoke();
            }
            this.c.push(aVar);
            return aVar;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        b bVar = this.b;
        if (bVar == null) {
            bVar = null;
        }
        LinearLayout linearLayout = this.c;
        bVar.b(linearLayout != null ? linearLayout : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        CatalogLink catalogLink;
        if (uIBlock instanceof UIBlockStaticLinksBanner) {
            b bVar = this.b;
            if (bVar == null) {
                bVar = null;
            }
            LinearLayout linearLayout = this.c;
            if (linearLayout == null) {
                linearLayout = null;
            }
            bVar.b(linearLayout);
            Iterator<UIBlockLink> it = ((UIBlockStaticLinksBanner) uIBlock).y.iterator();
            while (it.hasNext()) {
                UIBlockLink next = it.next();
                b bVar2 = this.b;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                a aVar = (a) g5g.H(bVar2.b);
                if (aVar == null) {
                    aVar = (a) bVar2.a.invoke();
                }
                bVar2.c.push(aVar);
                aVar.b.setText((next == null || (catalogLink = next.y) == null) ? null : catalogLink.c);
                bwt0.S(aVar.c, new h6g(next, 16));
                LinearLayout linearLayout2 = this.c;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                linearLayout2.addView(aVar.a);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = new b(new tbh(layoutInflater, 14));
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.catalog_featured_list_banner, viewGroup, false);
        this.c = linearLayout;
        if (linearLayout == null) {
            return null;
        }
        return linearLayout;
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
