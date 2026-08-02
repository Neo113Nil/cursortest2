package com.vk.attachpicker.stickers.selection.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.jgu;
import xsna.vif0;
import xsna.zoj0;

/* compiled from: GifSearchSkeletonView.kt */
/* loaded from: classes15.dex */
public final class GifSearchSkeletonView extends LinearLayout {
    public final TextView b;
    public final RecyclerView c;
    public final TextView d;
    public final a e;
    public final a f;

    /* compiled from: GifSearchSkeletonView.kt */
    public static final class a extends zoj0<Object, vif0<Object>> {
        public final Context e;

        /* compiled from: GifSearchSkeletonView.kt */
        /* renamed from: com.vk.attachpicker.stickers.selection.views.GifSearchSkeletonView$a$a, reason: collision with other inner class name */
        public static final class C0394a extends vif0<Object> {
            public final ShimmerFrameLayout n;

            public C0394a(Context context) {
                super(R.layout.gif_item_skeleton, context);
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.gif_skeleton_shimmer);
                this.n = shimmerFrameLayout;
                ((VKImageView) this.itemView.findViewById(R.id.iv_gif_skeleton)).setAspectRatio(1.0f);
                shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
            }

            @Override // xsna.vif0
            public final void i6(Object obj) {
                this.n.c();
            }
        }

        public a(Context context) {
            this.e = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ((vif0) e0Var).V5(this.c.c(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C0394a(this.e);
        }
    }

    public GifSearchSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a(int i, boolean z) {
        f4m.t(z ? 0 : cn70.b(-8), this);
        bwt0.p0(this.b, z && i > 0);
        bwt0.p0(this.c, z && i > 0);
        if (z && i > 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new Object());
            }
            this.e.setItems(arrayList);
        }
        int b = cn70.b(i > 0 ? 3 : 9);
        TextView textView = this.d;
        f4m.t(b, textView);
        bwt0.p0(textView, z);
        ArrayList arrayList2 = new ArrayList(30);
        for (int i3 = 0; i3 < 30; i3++) {
            arrayList2.add(new Object());
        }
        this.f.setItems(arrayList2);
    }

    public GifSearchSkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, R.layout.gif_skeleton_view, this);
        setPadding(cn70.b(4), 0, cn70.b(4), 0);
        this.b = (TextView) findViewById(R.id.recent_title);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recent_gifs);
        this.c = recyclerView;
        this.d = (TextView) findViewById(R.id.popular_title);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.all_gifs);
        a aVar = new a(context);
        this.e = aVar;
        a aVar2 = new a(context);
        this.f = aVar2;
        jgu jguVar = new jgu(3, cn70.b(16), true, 0);
        setOrientation(1);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new GifSearchSkeletonView$1$1(3));
        recyclerView.addItemDecoration(jguVar);
        recyclerView2.setAdapter(aVar2);
        recyclerView2.setLayoutManager(new GifSearchSkeletonView$2$1(3));
        recyclerView2.addItemDecoration(jguVar);
    }
}
