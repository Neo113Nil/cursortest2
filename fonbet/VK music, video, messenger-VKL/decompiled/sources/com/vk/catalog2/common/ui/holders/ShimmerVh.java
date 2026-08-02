package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.movika.sdk.base.logic.processor.actions.e;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import xsna.at;
import xsna.b0u0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.iut0;
import xsna.qcy;
import xsna.rvt0;

/* compiled from: ShimmerVh.kt */
/* loaded from: classes16.dex */
public final class ShimmerVh extends ProgressVh {
    public final List<Integer> d;
    public final boolean e;
    public final bpn0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerVh(int i, int i2, boolean z, List list) {
        super(i);
        list = (i2 & 2) != 0 ? EmptyList.b : list;
        EmptyList emptyList = EmptyList.b;
        z = (i2 & 8) != 0 ? false : z;
        this.d = emptyList;
        this.e = z;
        this.f = new bpn0(new e(18, list, this));
    }

    @Override // com.vk.catalog2.common.ui.holders.ProgressVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        Iterator it = ((List) this.f.getValue()).iterator();
        while (it.hasNext()) {
            ((ShimmerFrameLayout) it.next()).c();
        }
        View findViewById = k5.findViewById(R.id.header_container);
        if (findViewById != null) {
            rvt0 rvt0Var = new rvt0();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(findViewById, rvt0Var);
            qcy<Object>[] qcyVarArr = bwt0.a;
            f4m.n((int) k5.getResources().getDimension(R.dimen.catalog_video_header_height_redesign), findViewById);
        }
        if (BuildInfo.s()) {
            TextView textView = (TextView) k5.findViewById(R.id.title);
            if (textView != null) {
                at.d(k5, R.string.video_catalog_header_new, textView);
            }
            ImageView imageView = (ImageView) k5.findViewById(R.id.logo);
            if (imageView != null) {
                f4m.j(imageView);
            }
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) k5.findViewById(R.id.user_icon);
            boolean z = this.e;
            if (shimmerFrameLayout != null) {
                bwt0.p0(shimmerFrameLayout, z);
            }
            if (!z && textView != null) {
                f4m.s(cn70.b(5), textView);
            }
        }
        Iterator<T> it2 = this.d.iterator();
        while (it2.hasNext()) {
            View findViewById2 = k5.findViewById(((Number) it2.next()).intValue());
            if (findViewById2 != null) {
                bwt0.p0(findViewById2, false);
            }
        }
        return k5;
    }
}
