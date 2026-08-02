package com.vk.stories.design.view.stickers.selection;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.StickersRecyclerView;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stories.model.GifItem;
import com.vk.log.L;
import com.vk.stickers.bridge.GiftData;
import com.vk.stories.design.view.stickers.StickersTabsAndIndicatorFrameLayout;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.afi0;
import xsna.anj;
import xsna.asu0;
import xsna.b8z;
import xsna.bfi0;
import xsna.bwt0;
import xsna.bzt;
import xsna.cp50;
import xsna.ctq;
import xsna.dhr0;
import xsna.e43;
import xsna.e9f0;
import xsna.fpf0;
import xsna.g2v;
import xsna.gdl0;
import xsna.gzn;
import xsna.hf8;
import xsna.i7l0;
import xsna.iah0;
import xsna.idi0;
import xsna.ifi0;
import xsna.ify;
import xsna.iu1;
import xsna.izt0;
import xsna.j8w0;
import xsna.k170;
import xsna.k2y;
import xsna.k7m;
import xsna.kcl0;
import xsna.kim0;
import xsna.l8g;
import xsna.m7m;
import xsna.mh40;
import xsna.mvc0;
import xsna.nm60;
import xsna.o25;
import xsna.pf40;
import xsna.qs2;
import xsna.rop;
import xsna.rt10;
import xsna.sei0;
import xsna.t6g0;
import xsna.tei0;
import xsna.tia0;
import xsna.uei0;
import xsna.ut30;
import xsna.w1l0;
import xsna.x8l0;
import xsna.xcp;
import xsna.ycp;
import xsna.yqd0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class SelectionStickerView extends CoordinatorLayout {
    public static final /* synthetic */ int n0 = 0;
    public boolean A;
    public final int B;
    public final int C;
    public final int D;
    public int E;
    public boolean F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public final ArrayList<StickerItem> J;
    public final ArrayList<StickerItem> K;
    public final ArrayList<StickerStockItem> L;
    public final ArrayList<StickerStockItem> M;
    public final VkBottomSheetBehavior<ViewGroup> N;
    public final ViewGroup O;
    public final ycp P;
    public final gdl0 Q;
    public final x8l0 R;
    public final ViewPager S;
    public final View T;
    public final FrameLayout U;
    public final View V;
    public final uei0 W;
    public final b a0;
    public boolean b0;
    public Set<WebStickerType> c0;

    @NonNull
    public final OpenFrom d0;

    @Nullable
    public kim0 e0;

    @Nullable
    public ifi0 f0;

    @Nullable
    public io.reactivex.rxjava3.disposables.c g0;

    @Nullable
    public io.reactivex.rxjava3.disposables.c h0;

    @Nullable
    public final afi0 i0;
    public final RecyclerView.t j0;

    @NonNull
    public final kcl0 k0;
    public final io.reactivex.rxjava3.subjects.f<Boolean> l0;
    public boolean m0;
    public final a z;

    public enum OpenFrom {
        STORY("story"),
        EDIT("edit"),
        CLIPS("clips");

        public final String serverName;

        OpenFrom(String str) {
            this.serverName = str;
        }
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            SelectionStickerView.this.J0();
        }
    }

    public class b implements i7l0 {
        public b() {
        }

        @Override // xsna.i7l0
        public final void a(@NonNull Context context, @NonNull StickerStockItem stickerStockItem) {
            SelectionStickerView.this.R.a().s(context, stickerStockItem, GiftData.d, null, stickerStockItem.i ? "story_create_style_selector" : "story_style_selector", null, new yqd0(this, 6));
        }
    }

    public class c extends RecyclerView.t {
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        public c(float f, float f2) {
            this.b = f;
            this.c = f2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            afi0 afi0Var = SelectionStickerView.this.i0;
            if (afi0Var == null || i != 1) {
                return;
            }
            afi0Var.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            float f;
            super.onScrolled(recyclerView, i, i2);
            float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            float f2 = this.b;
            SelectionStickerView selectionStickerView = SelectionStickerView.this;
            if (computeVerticalScrollOffset < f2) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                float f3 = this.c;
                if (computeVerticalScrollOffset > f3) {
                    if (i2 > 0) {
                        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = selectionStickerView.N;
                        if (vkBottomSheetBehavior.i != 3) {
                            vkBottomSheetBehavior.J(3);
                        }
                    }
                    f = 1.0f;
                } else {
                    f = computeVerticalScrollOffset / (f3 - f2);
                }
            }
            selectionStickerView.V.setAlpha(f);
        }
    }

    public class d implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ boolean b;

        public d(boolean z) {
            this.b = z;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            SelectionStickerView selectionStickerView = SelectionStickerView.this;
            selectionStickerView.O.getViewTreeObserver().removeOnPreDrawListener(this);
            selectionStickerView.postDelayed(new com.vk.stories.design.view.stickers.selection.b(selectionStickerView, this.b ? 3 : 4), 100L);
            return false;
        }
    }

    public class e extends VkBottomSheetBehavior.a {
        public int b;
        public boolean a = true;
        public boolean c = false;
        public final int[] d = new int[2];
        public boolean e = false;

        public e() {
            this.b = SelectionStickerView.this.N.i;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void i(@NonNull View view, float f) {
            afi0 afi0Var;
            SelectionStickerView selectionStickerView = SelectionStickerView.this;
            int height = selectionStickerView.U.getHeight();
            if (height > 0) {
                FrameLayout frameLayout = selectionStickerView.U;
                int[] iArr = this.d;
                frameLayout.getLocationOnScreen(iArr);
                int i = iArr[1];
                selectionStickerView.O.getLocationOnScreen(iArr);
                int i2 = i - iArr[1];
                if (i2 >= height) {
                    selectionStickerView.U.setAlpha(1.0f);
                } else {
                    selectionStickerView.U.setAlpha(Math.max(i2 / height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (afi0Var = selectionStickerView.i0) == null || this.c) {
                    return;
                }
                afi0Var.c();
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void j(int i, @NonNull View view) {
            if (i == 1) {
                this.e = true;
            }
            SelectionStickerView selectionStickerView = SelectionStickerView.this;
            selectionStickerView.requestLayout();
            this.c = i == 2;
            if (i == 5) {
                if (this.e) {
                    selectionStickerView.W.g();
                }
                int i2 = this.b;
                if ((i2 == 4 || i2 == 2 || i2 == 3) && this.a) {
                    selectionStickerView.W.close();
                }
                this.e = false;
            }
            if (i == 3 || i == 4) {
                this.e = false;
                this.b = i;
            }
        }
    }

    public class f extends izt0 {

        @Nullable
        public Object b;

        public class a extends GridLayoutManager.c {
            public final /* synthetic */ w1l0 d;
            public final /* synthetic */ GridLayoutManager e;

            public a(w1l0 w1l0Var, GridLayoutManager gridLayoutManager) {
                this.d = w1l0Var;
                this.e = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int c(int i) {
                this.d.getClass();
                if (i == 0) {
                    return this.e.s;
                }
                return 1;
            }
        }

        public f() {
        }

        @Override // xsna.izt0
        public final View b(int i, ViewPager viewPager) {
            SelectionStickerView selectionStickerView = SelectionStickerView.this;
            ArrayList<StickerStockItem> arrayList = selectionStickerView.L;
            ArrayList<StickerItem> arrayList2 = selectionStickerView.J;
            ArrayList<StickerItem> arrayList3 = selectionStickerView.K;
            int i2 = SelectionStickerView.n0;
            if (i == 0) {
                return selectionStickerView.P;
            }
            boolean z = selectionStickerView.I;
            if (z && i == 1) {
                if (selectionStickerView.f0 == null) {
                    selectionStickerView.e0 = new kim0(new nm60(this, 19), ((StoriesComponent) ((k7m) m7m.c(selectionStickerView)).a(fpf0.a(StoriesComponent.class))).t7(), selectionStickerView.W, selectionStickerView.d0);
                    ifi0 ifi0Var = new ifi0(selectionStickerView, new ut30(selectionStickerView, 16), selectionStickerView.e0, new t(new sei0()).U(new mvc0(new tei0(selectionStickerView.c0, selectionStickerView.m0), 2)));
                    selectionStickerView.f0 = ifi0Var;
                    selectionStickerView.y0(ifi0Var.getMReceiver());
                    ifi0 ifi0Var2 = selectionStickerView.f0;
                    io.reactivex.rxjava3.disposables.c cVar = ifi0Var2.j;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    t6g0 t6g0Var = t6g0.b;
                    ifi0Var2.j = t6g0.d().G().subscribe(new cp50(new k170(ifi0Var2, 24), 12));
                }
                return selectionStickerView.f0;
            }
            int i3 = z ? 2 : 1;
            boolean z2 = selectionStickerView.H;
            if (z2) {
                i3++;
            }
            if (selectionStickerView.F && i == i3) {
                return new j8w0(viewPager.getContext(), selectionStickerView.W);
            }
            int i4 = z ? 2 : 1;
            if (z2 && i == i4) {
                return new idi0(viewPager.getContext(), selectionStickerView.W, selectionStickerView.d0, selectionStickerView.i0);
            }
            StickersRecyclerView stickersRecyclerView = new StickersRecyclerView(viewPager.getContext());
            GridLayoutManager w0 = selectionStickerView.w0(stickersRecyclerView);
            int i5 = selectionStickerView.I ? 2 : 1;
            if (selectionStickerView.H) {
                i5++;
            }
            if (selectionStickerView.F) {
                i5++;
            }
            if (!arrayList3.isEmpty()) {
                i5++;
            }
            if (!arrayList2.isEmpty() && i == i5) {
                e9f0 e9f0Var = new e9f0(selectionStickerView.W);
                e9f0Var.submitList(new ArrayList(arrayList2));
                stickersRecyclerView.setAdapter(e9f0Var);
                return stickersRecyclerView;
            }
            int i6 = selectionStickerView.I ? 2 : 1;
            if (selectionStickerView.H) {
                i6++;
            }
            if (selectionStickerView.F) {
                i6++;
            }
            if (!arrayList3.isEmpty() && i == i6) {
                ctq ctqVar = new ctq(selectionStickerView.W);
                ctqVar.submitList(new ArrayList(arrayList3));
                stickersRecyclerView.setAdapter(ctqVar);
                return stickersRecyclerView;
            }
            int i7 = (((((i - 1) - (selectionStickerView.I ? 1 : 0)) - (!arrayList2.isEmpty() ? 1 : 0)) - (!arrayList3.isEmpty() ? 1 : 0)) - (selectionStickerView.H ? 1 : 0)) - (selectionStickerView.F ? 1 : 0);
            w1l0 w1l0Var = new w1l0(selectionStickerView.W, selectionStickerView.a0, i7 < arrayList.size() ? arrayList.get(i7) : selectionStickerView.M.get(i7 - arrayList.size()));
            w0.x = new a(w1l0Var, w0);
            stickersRecyclerView.setAdapter(w1l0Var);
            return stickersRecyclerView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            SelectionStickerView selectionStickerView = SelectionStickerView.this;
            return selectionStickerView.M.size() + selectionStickerView.L.size() + (!selectionStickerView.J.isEmpty() ? 1 : 0) + 1 + (selectionStickerView.I ? 1 : 0) + (selectionStickerView.F ? 1 : 0) + (!selectionStickerView.K.isEmpty() ? 1 : 0) + (selectionStickerView.H ? 1 : 0);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NonNull Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
            Object obj2 = this.b;
            if (obj2 != obj) {
                if (obj2 instanceof idi0) {
                    ((idi0) obj2).setTabActive(false);
                }
                this.b = obj;
                if (obj instanceof idi0) {
                    ((idi0) obj).setTabActive(true);
                }
            }
        }
    }

    public SelectionStickerView(Context context, @NonNull OpenFrom openFrom, boolean z, uei0 uei0Var, boolean z2, boolean z3) {
        super(z3 ? bwt0.u(context) : context, null);
        this.z = new a();
        this.A = true;
        int a2 = iah0.a(13);
        this.B = a2;
        this.C = Math.round(e43.a.getResources().getDimension(R.dimen.story_editor_stickers_recycler_left_right_space));
        this.D = iah0.a(12);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new ArrayList<>();
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.R = g2v.d();
        this.a0 = new b();
        this.c0 = Collections.EMPTY_SET;
        this.i0 = null;
        this.j0 = getScrollListener();
        t6g0 t6g0Var = t6g0.b;
        this.k0 = t6g0.d();
        this.l0 = new io.reactivex.rxjava3.subjects.f<>();
        this.m0 = false;
        LayoutInflater.from(getContext()).inflate(R.layout.picker_layout_emoji_panel, this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);
        this.S = viewPager;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_tabs_container);
        this.U = frameLayout;
        View findViewById = findViewById(R.id.empty_click_view);
        this.T = findViewById;
        findViewById.setBackgroundColor(l8g.f(0.4f, e43.a.getColor(R.color.vk_black)));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.O = viewGroup;
        this.V = findViewById(R.id.view_header_separator);
        viewGroup.setBackgroundColor(dhr0.Y(R.attr.vk_ui_background_modal, getContext()));
        this.W = uei0Var;
        this.d0 = openFrom;
        this.G = z2;
        VkBottomSheetBehavior<ViewGroup> F = VkBottomSheetBehavior.F(viewGroup);
        this.N = F;
        afi0 afi0Var = new afi0(this, frameLayout, viewPager, openFrom, uei0Var, new pf40(this, 17));
        this.i0 = afi0Var;
        F.h = true;
        ycp ycpVar = new ycp(getContext());
        this.P = ycpVar;
        ycpVar.setClipToPadding(false);
        getContext();
        ycpVar.setLayoutManager(new GridLayoutManager(5));
        ycpVar.setAdapter(new xcp(uei0Var));
        float f2 = 8;
        ycpVar.setPadding(iah0.a(f2), a2, iah0.a(f2), 0);
        gdl0 gdl0Var = new gdl0(getContext(), z2);
        this.Q = gdl0Var;
        gdl0Var.setPadding(0, 0, 0, 0);
        gdl0Var.setDelegate(new mh40(this, 11));
        frameLayout.addView(gdl0Var, new FrameLayout.LayoutParams(-1, iah0.a(48)));
        frameLayout.addView(new VkDivider(getContext(), null, 6, 0), new FrameLayout.LayoutParams(-1, iah0.a(0.5f)));
        viewPager.setAdapter(new f());
        viewPager.addOnPageChangeListener(new com.vk.stories.design.view.stickers.selection.a(this));
        afi0Var.m = z;
        afi0Var.d();
        int i = ify.a;
        ify.a(new bfi0(this));
    }

    @NonNull
    private RecyclerView.t getScrollListener() {
        return new c(iah0.a(1), iah0.a(3));
    }

    public final void J0() {
        int i;
        VmojiAvatar vmojiAvatar;
        ArrayList<StickerStockItem> arrayList = this.M;
        arrayList.clear();
        gdl0 gdl0Var = this.Q;
        StickersTabsAndIndicatorFrameLayout stickersTabsAndIndicatorFrameLayout = gdl0Var.b;
        for (int tabsCount = stickersTabsAndIndicatorFrameLayout.getTabsCount() - 1; -1 < tabsCount; tabsCount--) {
            stickersTabsAndIndicatorFrameLayout.b.removeViewAt(tabsCount);
        }
        gdl0Var.g = 0;
        if (this.G) {
            gdl0Var.b(R.drawable.vk_icon_storefront_outline_28, 0);
        }
        gdl0Var.b(R.drawable.vk_icon_smile_outline_28, 1);
        StickerItem[] stickerItemArr = tia0.s;
        boolean z = stickerItemArr != null && stickerItemArr.length > 0;
        this.I = z;
        if (z) {
            i = 2;
            gdl0Var.b(R.drawable.vk_icon_sticker_smile_outline_28, 2);
        } else {
            i = 1;
        }
        if (this.H) {
            i++;
            gdl0Var.b(R.drawable.vk_icon_gif_outline_28, 7);
        }
        kcl0 kcl0Var = this.k0;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(kcl0Var.f0());
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(kcl0Var.U());
        VmojiAvatarModel p = kcl0Var.p();
        this.F = p == null && kcl0Var.Y0();
        ArrayList<StickerStockItem> arrayList2 = this.L;
        arrayList2.clear();
        if (p != null && p.b.Cb()) {
            Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                StickerStockItem stickerStockItem = (StickerStockItem) it.next();
                if (stickerStockItem.Q && (vmojiAvatar = stickerStockItem.H) != null && vmojiAvatar.Cb()) {
                    arrayList2.add(stickerStockItem);
                }
            }
        }
        if (this.F) {
            gdl0Var.b(R.drawable.vk_icon_vmoji_outline_28, 5);
            i++;
        }
        List<StickerItem> c0 = kcl0Var.c0();
        ArrayList<StickerItem> arrayList3 = this.K;
        arrayList3.clear();
        arrayList3.addAll(c0);
        if (!c0.isEmpty()) {
            gdl0Var.b(R.drawable.vk_icon_favorite_outline_28, 3);
            i++;
        }
        List<StickerItem> i2 = kcl0Var.i();
        ArrayList<StickerItem> arrayList4 = this.J;
        arrayList4.clear();
        arrayList4.addAll(i2);
        if (i2.size() > 0) {
            gdl0Var.b(R.drawable.vk_icon_clock_outline_28, 4);
            i++;
        }
        if (!arrayList2.isEmpty()) {
            gdl0Var.d(arrayList2);
            i += arrayList2.size();
        }
        arrayList.clear();
        arrayList.addAll(copyOnWriteArrayList);
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            StickerStockItem stickerStockItem2 = (StickerStockItem) it2.next();
            if (!stickerStockItem2.Q) {
                gdl0Var.c(stickerStockItem2);
                i++;
            }
        }
        this.E = i;
        if (o25.a().b()) {
            gdl0Var.b(R.drawable.vk_icon_settings_28, 6);
        }
        ViewPager viewPager = this.S;
        viewPager.getAdapter().notifyDataSetChanged();
        this.Q.e(this.S.getCurrentItem());
        if (this.A) {
            viewPager.setCurrentItem(1, false);
        }
        this.A = false;
    }

    public Set<WebStickerType> getPermittedStickers() {
        return this.c0;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void hide() {
        animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new b8z(this, 1)).setDuration(100L).start();
        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = this.N;
        VkBottomSheetBehavior.a aVar = vkBottomSheetBehavior.q;
        if (aVar instanceof e) {
            ((e) aVar).a = false;
        }
        vkBottomSheetBehavior.J(5);
        afi0 afi0Var = this.i0;
        if (afi0Var != null) {
            afi0Var.c();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y0(this.z);
        kcl0 kcl0Var = this.k0;
        this.g0 = kcl0Var.x0().subscribe(new rt10(this, 14));
        this.h0 = kcl0Var.G().subscribe(new k2y(this, 14));
        if (!this.b0) {
            J0();
            this.b0 = true;
        }
        afi0 afi0Var = this.i0;
        if (afi0Var != null) {
            afi0Var.h();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getContext().unregisterReceiver(this.z);
        } catch (Throwable th) {
            L.g("Can't unregister sticker reveiver", th);
        }
        ifi0 ifi0Var = this.f0;
        if (ifi0Var != null) {
            try {
                getContext().unregisterReceiver(ifi0Var.getMReceiver());
            } catch (Throwable th2) {
                L.g("Can't unregister sticker reveiver", th2);
            }
            ifi0 ifi0Var2 = this.f0;
            io.reactivex.rxjava3.disposables.c cVar = ifi0Var2.i;
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = ifi0Var2.j;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.g0;
        if (cVar3 != null) {
            cVar3.dispose();
            this.g0 = null;
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.h0;
        if (cVar4 != null) {
            cVar4.dispose();
            this.h0 = null;
        }
        afi0 afi0Var = this.i0;
        if (afi0Var != null) {
            afi0Var.i();
        }
    }

    public void setPermittedClickableStickers(Set<WebStickerType> set) {
        kim0 kim0Var;
        Set<WebStickerType> set2 = this.c0;
        this.c0 = set;
        if (getParent() == null || set2.equals(this.c0)) {
            return;
        }
        boolean contains = this.c0.contains(WebStickerType.GIF);
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures) && (kim0Var = this.e0) != null && kim0Var.getItemCount() > 0) {
            this.e0.notifyItemChanged(0);
        }
        boolean z = this.H != contains;
        this.H = contains;
        if (z) {
            J0();
        } else {
            this.S.getAdapter().notifyDataSetChanged();
        }
    }

    public void setShowReactionOnboarding(boolean z) {
        this.m0 = z;
    }

    public void setTopPadding(int i) {
        int i2 = i + this.B;
        ycp ycpVar = this.P;
        int i3 = this.C;
        ycpVar.setPadding(i3, i2, i3, 0);
        int i4 = 0;
        while (true) {
            ViewPager viewPager = this.S;
            if (i4 >= viewPager.getChildCount()) {
                return;
            }
            View childAt = viewPager.getChildAt(i4);
            if (childAt instanceof RecyclerView) {
                childAt.setPadding(i3, i2, i3, 0);
            }
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        if (((xsna.ifi0) r6).h.v() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (((androidx.recyclerview.widget.LinearLayoutManager) r6).v() != 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void show() {
        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = this.N;
        int i = vkBottomSheetBehavior.c;
        int bottom = getBottom() - getTop();
        boolean z = true;
        afi0 afi0Var = this.i0;
        if (afi0Var == null || !afi0Var.e()) {
            PagerAdapter adapter = this.S.getAdapter();
            if (adapter instanceof f) {
                Object obj = ((f) adapter).b;
                if (!(obj instanceof ifi0)) {
                    RecyclerView.o layoutManager = obj instanceof RecyclerView ? ((RecyclerView) obj).getLayoutManager() : null;
                    if (layoutManager instanceof LinearLayoutManager) {
                    }
                }
            }
            z = false;
        }
        vkBottomSheetBehavior.q = null;
        vkBottomSheetBehavior.K(5);
        if (!z) {
            this.V.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i == 0 || bottom == 0) {
            vkBottomSheetBehavior.I(Math.round(iah0.u() * 0.85f));
            this.O.getViewTreeObserver().addOnPreDrawListener(new d(z));
        } else {
            postDelayed(new com.vk.stories.design.view.stickers.selection.b(this, z ? 3 : 4), 100L);
        }
        if (afi0Var != null) {
            bzt bztVar = afi0Var.t;
            q<List<GifItem>> b2 = bztVar.b.b();
            asu0 asu0Var = asu0.a;
            bztVar.c.b(b2.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new iu1(new rop(bztVar, 7), 19), new qs2(new gzn(7), 18)));
        }
    }

    public final GridLayoutManager w0(StickersRecyclerView stickersRecyclerView) {
        if (stickersRecyclerView == null) {
            return null;
        }
        stickersRecyclerView.setHasFixedSize(true);
        stickersRecyclerView.setVerticalScrollBarEnabled(true);
        stickersRecyclerView.setClipToPadding(false);
        int i = this.D;
        stickersRecyclerView.setPadding(i, 0, i, 0);
        this.S.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        stickersRecyclerView.setLayoutManager(gridLayoutManager);
        stickersRecyclerView.addOnScrollListener(this.j0);
        return gridLayoutManager;
    }

    public final void y0(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.STICKERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.STICKERS_RELOADED");
        intentFilter.addAction("com.vkontakte.android.STICKERS_NUM_NEW_ITEMS");
        anj.d(getContext(), broadcastReceiver, intentFilter, hf8.a, 4);
    }
}
