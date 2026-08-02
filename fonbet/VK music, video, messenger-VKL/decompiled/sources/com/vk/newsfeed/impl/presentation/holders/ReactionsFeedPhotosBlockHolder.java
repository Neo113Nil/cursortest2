package com.vk.newsfeed.impl.presentation.holders;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import xsna.b140;
import xsna.b5f0;
import xsna.bwt0;
import xsna.iah0;
import xsna.mfa0;
import xsna.rp6;
import xsna.t980;
import xsna.xpg0;

/* compiled from: ReactionsFeedPhotosBlockHolder.kt */
/* loaded from: classes4.dex */
public final class ReactionsFeedPhotosBlockHolder extends rp6<b5f0, NewsEntry> {
    public static final int G = iah0.a(3);
    public static final int H = iah0.a(16);
    public final View E;
    public final mfa0 F;

    /* compiled from: ReactionsFeedPhotosBlockHolder.kt */
    /* renamed from: com.vk.newsfeed.impl.presentation.holders.ReactionsFeedPhotosBlockHolder$2, reason: invalid class name */
    public static final class AnonymousClass2 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return true;
        }
    }

    /* compiled from: ReactionsFeedPhotosBlockHolder.kt */
    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (xpg0.b()) {
                int i = ReactionsFeedPhotosBlockHolder.G;
                rect.right = ReactionsFeedPhotosBlockHolder.G;
            } else {
                int i2 = ReactionsFeedPhotosBlockHolder.G;
                rect.left = ReactionsFeedPhotosBlockHolder.G;
            }
        }
    }

    public ReactionsFeedPhotosBlockHolder(ViewGroup viewGroup) {
        super(R.layout.holder_reactions_feed_photos_block, viewGroup);
        this.D = t980.a;
        View findViewById = this.itemView.findViewById(R.id.photo_likes_show_all);
        this.E = findViewById;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.photos_like_recycler_view);
        mfa0 mfa0Var = new mfa0();
        this.F = mfa0Var;
        bwt0.i0(findViewById, new b140(this, 13));
        this.itemView.getContext();
        recyclerView.setLayoutManager(new AnonymousClass2(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        int i = G;
        int i2 = H;
        recyclerView.setPaddingRelative(i2, 0, i2 - i, 0);
        recyclerView.addItemDecoration(new a());
        recyclerView.setAdapter(mfa0Var);
    }

    @Override // xsna.rp6
    public final void R6(b5f0 b5f0Var) {
        this.F.setItems(b5f0Var.h);
    }
}
