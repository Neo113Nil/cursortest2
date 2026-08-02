package com.vk.catalog2.common.ui.mvp.holder.video;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.view.disableable.DisableableViewPager;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.a3a;
import xsna.a5a;
import xsna.aq0;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.kea;
import xsna.qoy;
import xsna.s3q0;
import xsna.sba;
import xsna.u4a;
import xsna.u4q0;
import xsna.wia;
import xsna.wzs;
import xsna.zik0;

/* compiled from: VideoViewPagerVh.kt */
/* loaded from: classes16.dex */
public final class VideoViewPagerVh extends ViewPagerVh {
    public a z;

    /* compiled from: VideoViewPagerVh.kt */
    public static final class a {
        public final u4a a;
        public final List<UIBlock> b;
        public final boolean c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u4a u4aVar, List<? extends UIBlock> list, boolean z, boolean z2) {
            this.a = u4aVar;
            this.b = list;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoPagerConfig(params=");
            sb.append(this.a);
            sb.append(", tabs=");
            sb.append(this.b);
            sb.append(", isCrossfadeEnabled=");
            sb.append(this.c);
            sb.append(", hasPinnedTab=");
            return q0.a(sb, this.d, ')');
        }
    }

    public VideoViewPagerVh(u4a u4aVar, wia wiaVar, RecyclerView.t tVar, VideoCatalogRootVh videoCatalogRootVh, a5a a5aVar, int i) {
        super(u4aVar, false, new aq0(10), false, (i & 128) != 0 ? null : videoCatalogRootVh, (i & 64) != 0 ? null : tVar, null, wiaVar, (i & 256) != 0 ? null : a5aVar, null, 608);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(2:10|11)|(11:13|(1:15)(1:71)|16|(1:18)(1:70)|19|20|(4:22|(1:24)(1:66)|25|(5:27|28|(1:30)|31|(3:63|64|65)(2:34|(2:36|(4:38|(3:41|(3:43|(2:45|(2:47|48)(1:(2:51|52)(1:53)))(1:54)|49)(3:55|56|57)|39)|59|60)(1:61))(1:62))))|68|(0)(0)|25|(0))|73|(0)(0)|16|(0)(0)|19|20|(0)|68|(0)(0)|25|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:20:0x003b, B:22:0x003f), top: B:19:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x002e  */
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(u4a u4aVar, List<? extends UIBlock> list, wzs<? super String, ? super kea, s3q0> wzsVar, boolean z, boolean z2) {
        boolean z3;
        DisableableViewPager disableableViewPager;
        PagerAdapter adapter;
        UIBlockList uIBlockList;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        UIBlockList uIBlockList2;
        UIBlock uIBlock2;
        a aVar = new a(u4aVar, list, z, z2);
        a aVar2 = this.z;
        int i = 0;
        if (aVar2 != null && z == aVar2.c && u4aVar.equals(aVar2.a) && z2 == aVar2.d) {
            try {
                uIBlock2 = (UIBlock) j5g.a0(list);
            } catch (Throwable unused) {
            }
            if (uIBlock2 instanceof UIBlockList) {
                uIBlockList = (UIBlockList) uIBlock2;
                arrayList = uIBlockList == null ? uIBlockList.y : null;
                List<UIBlock> list2 = aVar2.b;
                uIBlock = list2 == null ? (UIBlock) j5g.a0(list2) : null;
                if (uIBlock instanceof UIBlockList) {
                    uIBlockList2 = (UIBlockList) uIBlock;
                    if (epx.f(arrayList, uIBlockList2 != null ? uIBlockList2.y : null)) {
                        z3 = false;
                        this.z = aVar;
                        disableableViewPager = this.o;
                        if (disableableViewPager == null) {
                            disableableViewPager = null;
                        }
                        adapter = disableableViewPager.getAdapter();
                        if (adapter != null || z3) {
                            super.c(u4aVar, list, wzsVar, z, z2);
                        }
                        if (adapter instanceof sba) {
                            sba sbaVar = (sba) adapter;
                            sbaVar.q = list;
                            sbaVar.notifyDataSetChanged();
                            if (wzsVar != null) {
                                SparseArray<CatalogViewHolder> sparseArray = sbaVar.r;
                                for (Object obj : list) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    UIBlock uIBlock3 = (UIBlock) obj;
                                    if (sparseArray.size() > i) {
                                        u4q0 u4q0Var = zik0.a;
                                        CatalogViewHolder catalogViewHolder = sparseArray.get(i);
                                        if (catalogViewHolder instanceof a3a) {
                                            ((a3a) catalogViewHolder).h(uIBlock3, wzsVar);
                                        } else if (catalogViewHolder != null) {
                                            catalogViewHolder.N6(uIBlock3);
                                        }
                                    }
                                    i = i2;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                uIBlockList2 = null;
                if (epx.f(arrayList, uIBlockList2 != null ? uIBlockList2.y : null)) {
                }
            }
            uIBlockList = null;
            if (uIBlockList == null) {
            }
            List<UIBlock> list22 = aVar2.b;
            if (list22 == null) {
            }
            if (uIBlock instanceof UIBlockList) {
            }
            uIBlockList2 = null;
            if (epx.f(arrayList, uIBlockList2 != null ? uIBlockList2.y : null)) {
            }
        }
        z3 = true;
        this.z = aVar;
        disableableViewPager = this.o;
        if (disableableViewPager == null) {
        }
        adapter = disableableViewPager.getAdapter();
        if (adapter != null) {
        }
        super.c(u4aVar, list, wzsVar, z, z2);
    }
}
