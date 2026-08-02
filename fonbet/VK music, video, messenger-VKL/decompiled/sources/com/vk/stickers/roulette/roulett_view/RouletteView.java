package com.vk.stickers.roulette.roulett_view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.s;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.schedulers.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.random.Random;
import xsna.an10;
import xsna.b630;
import xsna.b790;
import xsna.bpn0;
import xsna.c5g;
import xsna.d3m;
import xsna.hg1;
import xsna.iah0;
import xsna.ir;
import xsna.izs;
import xsna.jng0;
import xsna.k9x;
import xsna.lc6;
import xsna.lng0;
import xsna.nng0;
import xsna.ong0;
import xsna.qus;
import xsna.rng0;
import xsna.s3q0;
import xsna.svz;
import xsna.swe0;
import xsna.u5d0;
import xsna.w9k0;
import xsna.z43;
import xsna.zuw;

/* compiled from: RouletteView.kt */
/* loaded from: classes6.dex */
public final class RouletteView extends FrameLayout implements ong0 {
    public static final /* synthetic */ int k = 0;
    public izs<? super Integer, s3q0> b;
    public nng0 c;
    public final ArrayList d;
    public final jng0 e;
    public boolean f;
    public final RecyclerView g;
    public final LinearLayoutManager h;
    public final w i;
    public final w9k0 j;

    public RouletteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new svz(23);
        this.d = new ArrayList();
        this.e = new jng0(context);
        this.f = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.h = linearLayoutManager;
        w wVar = new w();
        this.i = wVar;
        this.j = new w9k0(wVar, new qus(this));
        setPresenter((nng0) new rng0(this));
        View.inflate(context, R.layout.view_infinite_rotation, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        this.g = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        wVar.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(new zuw(getPresenter()));
        linearLayoutManager.scrollToPosition(swe0.n(new k9x(100, 200, 1), Random.b));
        setRecyclerViewScrollEnabled(false);
    }

    private final List<Integer> getVisibleItemsPositions() {
        LinearLayoutManager linearLayoutManager = this.h;
        return c5g.v(Collections.singletonList(new k9x(linearLayoutManager.v(), linearLayoutManager.x(), 1)));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setRecyclerViewScrollEnabled(final boolean z) {
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.kng0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = RouletteView.k;
                return !z;
            }
        });
    }

    public final void b() {
        Iterator<Integer> it = getVisibleItemsPositions().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue != getCurrentPosition()) {
                RecyclerView.e0 findViewHolderForAdapterPosition = this.g.findViewHolderForAdapterPosition(intValue);
                b790 b790Var = findViewHolderForAdapterPosition instanceof b790 ? (b790) findViewHolderForAdapterPosition : null;
                if (b790Var != null) {
                    int i = b790.o;
                    b790Var.itemView.animate().alpha(1.0f).setDuration(3000L);
                }
            }
        }
    }

    public final void c(int i) {
        Iterator<Integer> it = getVisibleItemsPositions().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue != i) {
                RecyclerView.e0 findViewHolderForAdapterPosition = this.g.findViewHolderForAdapterPosition(intValue);
                b790 b790Var = findViewHolderForAdapterPosition instanceof b790 ? (b790) findViewHolderForAdapterPosition : null;
                if (b790Var != null) {
                    int i2 = b790.o;
                    b790Var.itemView.animate().alpha(0.3f).setDuration(600L);
                }
            }
        }
    }

    public final int d(float f, int i) {
        w wVar = this.i;
        LinearLayoutManager linearLayoutManager = this.h;
        View findSnapView = wVar.findSnapView(linearLayoutManager);
        if (findSnapView == null) {
            return 0;
        }
        int position = linearLayoutManager.getPosition(findSnapView);
        int width = findSnapView.getWidth();
        int b = ir.b(i, position, width, wVar.calculateDistanceToFinalSnap(linearLayoutManager, findSnapView)[0]);
        int b2 = an10.b((f * width) / 2);
        return swe0.n(new k9x(b2 * (-1), b2, 1), Random.b) + b;
    }

    public final void f(int i) {
        this.g.removeOnScrollListener(this.j);
        final lng0 lng0Var = new lng0(this, i);
        final int d = d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
        if (d != 0) {
            postDelayed(new Runnable() { // from class: xsna.mng0
                @Override // java.lang.Runnable
                public final void run() {
                    RouletteView.this.g.smoothScrollBy(d, 0);
                    lng0Var.invoke();
                }
            }, 1000L);
        } else {
            lng0Var.invoke();
        }
    }

    @Override // xsna.ong0
    public int getCurrentPosition() {
        w wVar = this.i;
        LinearLayoutManager linearLayoutManager = this.h;
        View findSnapView = wVar.findSnapView(linearLayoutManager);
        return (findSnapView != null ? Integer.valueOf(linearLayoutManager.getPosition(findSnapView)) : null).intValue();
    }

    public final RecyclerView getRecyclerView() {
        return this.g;
    }

    public final void h(StickerStockItem stickerStockItem) {
        bpn0 bpn0Var = u5d0.a;
        String a = u5d0.a.a(stickerStockItem, iah0.a(94));
        hg1.b(this, new s(new v(new lc6(a, 3)).q(a.b()), new b630(new z43(a, 4), 10)).subscribe());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<Integer> it = getVisibleItemsPositions().iterator();
        while (it.hasNext()) {
            RecyclerView.e0 findViewHolderForAdapterPosition = this.g.findViewHolderForAdapterPosition(it.next().intValue());
            b790 b790Var = findViewHolderForAdapterPosition instanceof b790 ? (b790) findViewHolderForAdapterPosition : null;
            if (b790Var != null) {
                d3m.b(b790Var.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                d3m.b(b790Var.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            }
        }
        nng0 presenter = getPresenter();
        if (presenter != null) {
            presenter.onDestroy();
        }
        jng0 jng0Var = this.e;
        jng0Var.b.set(true);
        jng0Var.e.quitSafely();
    }

    public void setData(List<StickerStockItem> list) {
        nng0 presenter = getPresenter();
        if (presenter != null) {
            presenter.setItems(list);
        }
    }

    public final void setMuted(boolean z) {
        this.f = z;
    }

    @Override // xsna.dc6
    public nng0 getPresenter() {
        return this.c;
    }

    @Override // xsna.dc6
    public void setPresenter(nng0 nng0Var) {
        this.c = nng0Var;
    }
}
