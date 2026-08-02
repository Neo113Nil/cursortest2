package com.vk.video.profile.presentation.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.blk;
import xsna.fnj;
import xsna.iah0;
import xsna.igu;
import xsna.l9t0;
import xsna.nr2;
import xsna.tdj0;

/* compiled from: VideoProfileCatalogSkeletonView.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCatalogSkeletonView extends FrameLayout {
    public final l9t0 b;

    /* compiled from: VideoProfileCatalogSkeletonView.kt */
    public static final class a extends RecyclerView.Adapter<d> {
        public final LayoutInflater c;
        public final int d;
        public final int e;

        public a(LayoutInflater layoutInflater, int i, int i2) {
            this.c = layoutInflater;
            this.d = i;
            this.e = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onBindViewHolder(d dVar, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new d(this.c.inflate(this.d, viewGroup, false));
        }
    }

    /* compiled from: VideoProfileCatalogSkeletonView.kt */
    public final class b extends RecyclerView.n {
        public final int b;
        public final int c;

        public b() {
            l9t0 l9t0Var = VideoProfileCatalogSkeletonView.this.b;
            this.b = iah0.a(l9t0Var.e() ? 12 : 6);
            this.c = iah0.a(l9t0Var.e() ? 0 : 6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (recyclerView.getAdapter() == null || childAdapterPosition == -1) {
                super.getItemOffsets(rect, view, recyclerView, a0Var);
                return;
            }
            boolean e = VideoProfileCatalogSkeletonView.this.b.e();
            int i = this.b;
            if (e) {
                if (childAdapterPosition == 0 || childAdapterPosition == 1) {
                    rect.top = i;
                }
            } else if (childAdapterPosition == 0) {
                rect.top = i;
            }
            rect.bottom = this.c;
        }
    }

    /* compiled from: VideoProfileCatalogSkeletonView.kt */
    public final class c extends RecyclerView.n {
        public final int b;
        public final int c;

        public c(VideoProfileCatalogSkeletonView videoProfileCatalogSkeletonView) {
            l9t0 l9t0Var = videoProfileCatalogSkeletonView.b;
            this.b = iah0.a(l9t0Var.e() ? 32 : 20);
            this.c = iah0.a(l9t0Var.e() ? 16 : 24);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (recyclerView.getAdapter() == null || childAdapterPosition == -1) {
                super.getItemOffsets(rect, view, recyclerView, a0Var);
                return;
            }
            if (childAdapterPosition == 0) {
                rect.left = this.b;
            }
            rect.right = this.c;
        }
    }

    /* compiled from: VideoProfileCatalogSkeletonView.kt */
    public static final class d extends RecyclerView.e0 {
    }

    public VideoProfileCatalogSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public VideoProfileCatalogSkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        HashSet hashSet = iah0.a;
        l9t0 l9t0Var = fnj.d(context) ? nr2.d : blk.d;
        this.b = l9t0Var;
        View.inflate(context, l9t0Var.w(), this);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.catalog_shimmer_container);
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.b(tdj0.a(shimmerFrameLayout.getContext()));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tabs_recycler_view);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.catalog_recycler_view);
        LayoutInflater from = LayoutInflater.from(context);
        recyclerView.setAdapter(new a(from, l9t0Var.A(), 4));
        recyclerView.addItemDecoration(new c(this));
        recyclerView.setHasFixedSize(true);
        if (l9t0Var.e()) {
            int a2 = iah0.a(16);
            recyclerView2.addItemDecoration(new igu(2, a2, a2));
            recyclerView2.getContext();
            recyclerView2.setLayoutManager(new GridLayoutManager(2));
        }
        recyclerView2.setAdapter(new a(from, l9t0Var.d(), 10));
        recyclerView2.addItemDecoration(new b());
        recyclerView2.setHasFixedSize(true);
    }
}
