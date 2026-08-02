package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.core.util.CatalogOnOutsideTouchState;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a3a;
import xsna.a5a;
import xsna.aq0;
import xsna.ayn0;
import xsna.b06;
import xsna.c63;
import xsna.c7t0;
import xsna.cfp0;
import xsna.cus0;
import xsna.d80;
import xsna.epx;
import xsna.g380;
import xsna.gzs;
import xsna.hha;
import xsna.ho8;
import xsna.i3q0;
import xsna.izs;
import xsna.j5g;
import xsna.kea;
import xsna.kzt0;
import xsna.l4v0;
import xsna.m00;
import xsna.mzt0;
import xsna.ncb;
import xsna.nvs;
import xsna.ozt0;
import xsna.pzt0;
import xsna.rda;
import xsna.s3q0;
import xsna.sba;
import xsna.u4a;
import xsna.wia;
import xsna.wzs;

/* compiled from: ViewPagerVh.kt */
/* loaded from: classes16.dex */
public class ViewPagerVh implements ResumableViewHolder, rda, g380, hha, a3a {
    public final u4a b;
    public final boolean c;
    public final gzs<Boolean> d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final mzt0 h;
    public final RecyclerView.t i;
    public final wzs<Integer, View, s3q0> j;
    public final wia k;
    public final a5a l;
    public final c7t0 m;
    public UIBlockCatalog n;
    public DisableableViewPager o;
    public String p;
    public String q;
    public final nvs r;
    public sba s;
    public izs<? super sba, s3q0> t;
    public Integer u;
    public boolean v;
    public ozt0 w;
    public io.reactivex.rxjava3.disposables.c x;
    public boolean y;

    /* compiled from: ViewPagerVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            ((DisableableViewPager) this.receiver).setTouchEnabled(bool.booleanValue());
            return s3q0.a;
        }
    }

    /* compiled from: ViewPagerVh.kt */
    public static final class b extends ViewPager.m {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            ViewPagerVh viewPagerVh = ViewPagerVh.this;
            if (i == 0) {
                sba sbaVar = viewPagerVh.s;
                if (sbaVar != null) {
                    CatalogOnOutsideTouchState catalogOnOutsideTouchState = CatalogOnOutsideTouchState.IDLE;
                    DisableableViewPager disableableViewPager = viewPagerVh.o;
                    sbaVar.e(catalogOnOutsideTouchState, (disableableViewPager != null ? disableableViewPager : null).getCurrentItem());
                    return;
                }
                return;
            }
            sba sbaVar2 = viewPagerVh.s;
            if (sbaVar2 != null) {
                CatalogOnOutsideTouchState catalogOnOutsideTouchState2 = CatalogOnOutsideTouchState.TOUCHING;
                DisableableViewPager disableableViewPager2 = viewPagerVh.o;
                sbaVar2.e(catalogOnOutsideTouchState2, (disableableViewPager2 != null ? disableableViewPager2 : null).getCurrentItem());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            UIBlock uIBlock;
            ViewPagerVh viewPagerVh = ViewPagerVh.this;
            Integer num = viewPagerVh.u;
            boolean z = viewPagerVh.y;
            UIBlockCatalog uIBlockCatalog = viewPagerVh.n;
            if (uIBlockCatalog != null) {
                ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
                UIBlock uIBlock2 = (UIBlock) j5g.b0(num != null ? num.intValue() : 0, arrayList);
                if (uIBlock2 != null && (uIBlock = (UIBlock) j5g.b0(i, arrayList)) != null) {
                    viewPagerVh.b.b.f.a(new cfp0(uIBlock, new kzt0(uIBlock2, uIBlock, z, i)));
                }
            }
            viewPagerVh.y = false;
            viewPagerVh.u = Integer.valueOf(i);
            sba sbaVar = viewPagerVh.s;
            if (sbaVar != null) {
                sbaVar.b(i);
            }
            viewPagerVh.j(i);
        }
    }

    public ViewPagerVh(u4a u4aVar, boolean z, gzs gzsVar, boolean z2, mzt0 mzt0Var, RecyclerView.t tVar, ncb ncbVar, wia wiaVar, a5a a5aVar, c7t0 c7t0Var, int i) {
        z = (i & 2) != 0 ? false : z;
        gzs aq0Var = (i & 4) != 0 ? new aq0(10) : gzsVar;
        boolean z3 = (i & 8) != 0 ? false : z2;
        boolean z4 = (i & 16) == 0;
        mzt0 mzt0Var2 = (i & 128) != 0 ? null : mzt0Var;
        RecyclerView.t tVar2 = (i & 256) != 0 ? null : tVar;
        wzs<Integer, View, s3q0> b06Var = (i & 512) != 0 ? new b06((byte) 0, 8) : ncbVar;
        wia wiaVar2 = (i & 1024) != 0 ? null : wiaVar;
        a5a a5aVar2 = (i & 2048) != 0 ? null : a5aVar;
        c7t0 c7t0Var2 = (i & 4096) == 0 ? c7t0Var : null;
        this.b = u4aVar;
        this.c = z;
        this.d = aq0Var;
        this.e = z3;
        this.f = z4;
        this.g = R.layout.catalog_view_pager_layout;
        this.h = mzt0Var2;
        this.i = tVar2;
        this.j = b06Var;
        this.k = wiaVar2;
        this.l = a5aVar2;
        this.m = c7t0Var2;
        this.r = u4aVar.b.E;
        this.t = new pzt0(0);
        this.v = true;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        sba sbaVar = this.s;
        Integer d = sbaVar != null ? sbaVar.d(str) : null;
        if (d == null) {
            return false;
        }
        this.y = true;
        DisableableViewPager disableableViewPager = this.o;
        (disableableViewPager != null ? disableableViewPager : null).setCurrentItem(d.intValue());
        return true;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.x;
        if (cVar != null) {
            cVar.dispose();
        }
        this.x = null;
        sba sbaVar = this.s;
        if (sbaVar != null) {
            sbaVar.c();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        b(uIBlock, null);
    }

    public final boolean a(String str) {
        Integer d;
        sba sbaVar = this.s;
        if (sbaVar == null || (d = sbaVar.d(str)) == null) {
            return false;
        }
        int intValue = d.intValue();
        DisableableViewPager disableableViewPager = this.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.setCurrentItem(intValue);
        return true;
    }

    public final void b(UIBlock uIBlock, wzs<? super String, ? super kea, s3q0> wzsVar) {
        if (uIBlock instanceof UIBlockCatalog) {
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            this.n = uIBlockCatalog;
            String str = uIBlockCatalog.B;
            String str2 = uIBlockCatalog.D;
            boolean z = str == null || str.length() == 0;
            boolean z2 = !z;
            ArrayList<UIBlock> arrayList = (!this.f || z) ? uIBlockCatalog.A : (ArrayList) uIBlockCatalog.C.getValue();
            Iterator<UIBlock> it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (epx.f(it.next().b, str2)) {
                    break;
                } else {
                    i++;
                }
            }
            int max = Math.max(0, i);
            boolean z3 = !epx.f(str2, this.p) && this.b.b.s.J();
            this.p = str2;
            this.q = uIBlockCatalog.B;
            DisableableViewPager disableableViewPager = this.o;
            DisableableViewPager disableableViewPager2 = disableableViewPager != null ? disableableViewPager : null;
            disableableViewPager2.setOffscreenPageLimit(1);
            ozt0 ozt0Var = new ozt0(this, arrayList, max, wzsVar, z2, disableableViewPager2, z3);
            if (this.d.invoke().booleanValue()) {
                ozt0Var.invoke();
                this.w = null;
            } else {
                this.w = ozt0Var;
            }
            DisableableViewPager disableableViewPager3 = this.o;
            j((disableableViewPager3 != null ? disableableViewPager3 : null).getCurrentItem());
        }
    }

    public void c(u4a u4aVar, List<? extends UIBlock> list, wzs<? super String, ? super kea, s3q0> wzsVar, boolean z, boolean z2) {
        DisableableViewPager disableableViewPager = this.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        m00 m00Var = new m00(this, 7);
        a5a a5aVar = this.l;
        sba sbaVar = new sba(u4aVar, list, wzsVar, z, z2, null, this.h, this.i, m00Var, this.k, a5aVar != null ? new d80(a5aVar) : null, this.m);
        sbaVar.d = this.c;
        this.t.invoke(sbaVar);
        this.s = sbaVar;
        disableableViewPager.setAdapter(sbaVar);
    }

    public final void e(byte[] bArr) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        TabsState tabsState = (TabsState) Serializer.b.a(bArr, TabsState.class.getClassLoader());
        if (tabsState != null) {
            int i = tabsState.b;
            this.u = i > 0 ? Integer.valueOf(i) : null;
            this.p = tabsState.c;
        }
    }

    public final byte[] g() {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Integer num = this.u;
        return Serializer.b.e(new TabsState(num != null ? num.intValue() : -1, this.p));
    }

    @Override // xsna.a3a
    public final void h(UIBlock uIBlock, wzs<? super String, ? super kea, s3q0> wzsVar) {
        b(uIBlock, wzsVar);
    }

    public final void j(int i) {
        String str;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        if (this.v) {
            UIBlockCatalog uIBlockCatalog = this.n;
            if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null || (uIBlock = (UIBlock) j5g.b0(i, arrayList)) == null || (str = uIBlock.b) == null) {
                str = "";
            }
            c63 c63Var = c63.a;
            this.r.b((AppCompatActivity) c63.b(), str);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.g, viewGroup, false);
        DisableableViewPager disableableViewPager = (DisableableViewPager) inflate;
        l4v0 l4v0Var = this.b.b.Q;
        this.x = l4v0Var != null ? l4v0Var.d.subscribe(new i3q0(new a(1, disableableViewPager, DisableableViewPager.class, "setTouchEnabled", "setTouchEnabled(Z)V", 0), 3)) : null;
        disableableViewPager.addOnPageChangeListener(new b());
        this.o = disableableViewPager;
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        sba sbaVar = this.s;
        if (sbaVar != null) {
            SparseArray<ayn0> sparseArray = sbaVar.t;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArray.valueAt(i).b();
            }
            SparseArray<CatalogViewHolder> sparseArray2 = sbaVar.r;
            SparseArray sparseArray3 = new SparseArray();
            int size2 = sparseArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt = sparseArray2.keyAt(i2);
                CatalogViewHolder valueAt = sparseArray2.valueAt(i2);
                g380 g380Var = valueAt instanceof g380 ? (g380) valueAt : null;
                if (g380Var != null) {
                    sparseArray3.put(keyAt, g380Var);
                }
            }
            int size3 = sparseArray3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((g380) sparseArray3.valueAt(i3)).onConfigurationChanged(configuration);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        sba sbaVar = this.s;
        if (sbaVar != null) {
            SparseArray<CatalogViewHolder> sparseArray = sbaVar.r;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArray.keyAt(i);
                CatalogViewHolder valueAt = sparseArray.valueAt(i);
                ResumableViewHolder resumableViewHolder = valueAt instanceof ResumableViewHolder ? (ResumableViewHolder) valueAt : null;
                if (resumableViewHolder != null) {
                    resumableViewHolder.onPause();
                }
            }
        }
        this.v = false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        this.v = true;
        ozt0 ozt0Var = this.w;
        if (ozt0Var != null) {
            ozt0Var.invoke();
        }
        this.w = null;
        sba sbaVar = this.s;
        if (sbaVar != null) {
            CatalogViewHolder catalogViewHolder = sbaVar.r.get(sbaVar.u);
            ResumableViewHolder resumableViewHolder = catalogViewHolder instanceof ResumableViewHolder ? (ResumableViewHolder) catalogViewHolder : null;
            if (resumableViewHolder != null) {
                resumableViewHolder.onResume();
            }
            sbaVar.e.onResume();
        }
    }

    @Override // xsna.rda
    public final void s() {
        sba sbaVar = this.s;
        if (sbaVar != null) {
            sbaVar.s();
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        sba sbaVar = this.s;
        if (sbaVar != null) {
            sbaVar.y(uiTrackingScreen);
        } else {
            this.t = new cus0(uiTrackingScreen, 4);
            uiTrackingScreen.h = false;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        b(uIBlock, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    /* compiled from: ViewPagerVh.kt */
    public static final class TabsState extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<TabsState> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<TabsState> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TabsState a(Serializer serializer) {
                return new TabsState(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TabsState[i];
            }
        }

        public TabsState(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabsState)) {
                return false;
            }
            TabsState tabsState = (TabsState) obj;
            return this.b == tabsState.b && epx.f(this.c, tabsState.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabsState(selectedTab=");
            sb.append(this.b);
            sb.append(", defaultSectionId=");
            return ho8.a(sb, this.c, ')');
        }

        public TabsState(Serializer serializer) {
            this(serializer.u(), serializer.H());
        }
    }

    public void d(View view) {
    }
}
