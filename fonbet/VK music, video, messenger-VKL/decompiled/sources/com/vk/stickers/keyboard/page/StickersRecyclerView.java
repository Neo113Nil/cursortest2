package com.vk.stickers.keyboard.page;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vk.stickers.views.VKStickerImageView;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.List;
import xsna.b8e0;
import xsna.c230;
import xsna.cgy;
import xsna.d120;
import xsna.dcn;
import xsna.dhy;
import xsna.dl70;
import xsna.e3m;
import xsna.g2v;
import xsna.h9l0;
import xsna.hfz;
import xsna.icl0;
import xsna.jh;
import xsna.kgj0;
import xsna.l960;
import xsna.p350;
import xsna.qiy;
import xsna.r7a0;
import xsna.rf6;
import xsna.rsg0;
import xsna.t520;
import xsna.t6g0;
import xsna.tfx;
import xsna.uxb0;
import xsna.vv20;
import xsna.wfy;
import xsna.wjf0;
import xsna.wug0;
import xsna.y4l0;
import xsna.y510;
import xsna.y8l0;
import xsna.yfb;

/* compiled from: StickersRecyclerView.kt */
/* loaded from: classes6.dex */
public final class StickersRecyclerView extends LongtapRecyclerView {
    public static final /* synthetic */ int w = 0;
    public final io.reactivex.rxjava3.disposables.b o;
    public boolean p;
    public int q;
    public boolean r;
    public final c s;
    public y4l0 t;
    public RecyclerView.t u;
    public dcn v;

    /* compiled from: StickersRecyclerView.kt */
    public interface a {
        boolean i(int i);
    }

    /* compiled from: StickersRecyclerView.kt */
    public final class b extends RecyclerView.t {
        public int b = -1;
        public int c = -3;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            StickersRecyclerView stickersRecyclerView = StickersRecyclerView.this;
            int s = ((GridLayoutManager) stickersRecyclerView.getLayoutManager()).s();
            int i4 = StickersRecyclerView.w;
            stickersRecyclerView.g();
            if (s == this.b || s < 0) {
                return;
            }
            com.vk.stickers.keyboard.page.a aVar = (com.vk.stickers.keyboard.page.a) stickersRecyclerView.getAdapter();
            rf6 rf6Var = null;
            if (s < aVar.h.size()) {
                List<? extends hfz> list = aVar.h;
                if (com.vk.stickers.keyboard.page.a.N0() == null || (i3 = s + 1) >= aVar.h.size()) {
                    i3 = s;
                }
                hfz hfzVar = list.get(i3);
                if (hfzVar instanceof rf6) {
                    rf6Var = (rf6) hfzVar;
                }
            }
            if (rf6Var instanceof wfy) {
                return;
            }
            if ((rf6Var instanceof dhy) && ((dhy) rf6Var).c) {
                return;
            }
            int a = rf6Var != null ? rf6Var.a() : 0;
            if (this.c != a) {
                y4l0 y4l0Var = stickersRecyclerView.t;
                if (y4l0Var != null) {
                    y4l0Var.l(a);
                }
                this.c = a;
            }
            this.b = s;
        }
    }

    /* compiled from: StickersRecyclerView.kt */
    public final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            StickersRecyclerView stickersRecyclerView = StickersRecyclerView.this;
            if ((stickersRecyclerView.getAdapter() instanceof a) && ((a) stickersRecyclerView.getAdapter()).i(i)) {
                return stickersRecyclerView.q;
            }
            return 1;
        }
    }

    public StickersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.o = bVar;
        this.p = true;
        setLayoutManager(new GridLayoutManager() { // from class: com.vk.stickers.keyboard.page.StickersRecyclerView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final boolean canScrollVertically() {
                return !StickersRecyclerView.this.j && super.canScrollVertically();
            }
        });
        addOnScrollListener(new b());
        f<icl0> fVar = y8l0.a.a;
        uxb0 uxb0Var = new uxb0(new dl70(17), 5);
        fVar.getClass();
        bVar.b(new i0(fVar, uxb0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new d120(new wug0(this, 8), 17)));
        this.q = 1;
        this.s = new c();
    }

    public final void f() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VKStickerImageView) {
                VKStickerImageView vKStickerImageView = (VKStickerImageView) childAt;
                int[] iArr = {0, 0};
                vKStickerImageView.getLocationOnScreen(iArr);
                int width = vKStickerImageView.getWidth() / 2;
                int i2 = (int) (width * 0.85f);
                int i3 = iArr[0] + width;
                int i4 = width + iArr[1];
                this.v = g2v.d().b().b(e3m.h(getContext()), new Rect(i3 - i2, i4 - i2, i3 + i2, i4 + i2));
                return;
            }
        }
    }

    public final void g() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
        int s = gridLayoutManager.s();
        int w2 = gridLayoutManager.w();
        if (s > w2) {
            return;
        }
        while (true) {
            if (wjf0.a(this, s) instanceof cgy) {
                i();
            }
            if (s == w2) {
                return;
            } else {
                s++;
            }
        }
    }

    public final void i() {
        if (this.p) {
            this.p = false;
            t6g0 t6g0Var = t6g0.b;
            long d0 = t6g0.d().d0();
            long j = 1 + d0;
            if (j >= 2147483647L) {
                return;
            }
            int i = 1;
            tfx tfxVar = new tfx("stickers.markPromoAsViewed", new jh(25), new kgj0(i));
            tfx.o(tfxVar, "promo_id", "vmoji_avatar_suggestion_stickers_keyboard_hint", 0, 0, 12);
            tfx.l(tfxVar, "count", (int) j, 1, 0, 8);
            this.o.b(rsg0.T(yfb.x(tfxVar)).subscribe(new p350(new y510(25), 16), new r7a0(new qiy(d0, i), 8)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f<icl0> fVar = y8l0.a.a;
        l960 l960Var = new l960(new b8e0(this, 8), 8);
        fVar.getClass();
        this.o.b(new i0(fVar, l960Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new t520(new c230(this, 28), 20)));
        this.p = true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dcn dcnVar = this.v;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        this.v = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        boolean z = getContext().getResources().getConfiguration().orientation == 2;
        if (!this.r) {
            int i4 = h9l0.a;
            i3 = h9l0.e;
        } else if (z) {
            int i5 = h9l0.a;
            i3 = h9l0.g;
        } else {
            int i6 = h9l0.a;
            i3 = h9l0.f;
        }
        if (i3 != this.q) {
            this.q = i3;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanCount(i3);
            gridLayoutManager.x = this.s;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        com.vk.stickers.keyboard.page.a aVar = adapter instanceof com.vk.stickers.keyboard.page.a ? (com.vk.stickers.keyboard.page.a) adapter : null;
        if (aVar != null) {
            aVar.s = new vv20(this, 26);
        }
    }

    public final void setAutoSuggest(boolean z) {
        this.r = z;
    }

    public final void setKeyboardListener(y4l0 y4l0Var) {
        this.t = y4l0Var;
    }

    public final void setScrollListener(RecyclerView.t tVar) {
        RecyclerView.t tVar2 = this.u;
        if (tVar2 != null) {
            removeOnScrollListener(tVar2);
        }
        addOnScrollListener(tVar);
        this.u = tVar;
    }
}
