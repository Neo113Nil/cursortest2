package com.vk.feedlikes.viewholders;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.iah0;
import xsna.kb40;
import xsna.mfa0;
import xsna.vif0;
import xsna.xpg0;

/* compiled from: PhotosLikeHeaderBlockViewHolder.kt */
/* loaded from: classes18.dex */
public final class PhotosLikeHeaderBlockViewHolder extends vif0<List<? extends Photo>> {
    public static final int p = iah0.a(3);
    public static final int q = iah0.a(16);
    public final View n;
    public final mfa0 o;

    /* compiled from: PhotosLikeHeaderBlockViewHolder.kt */
    /* renamed from: com.vk.feedlikes.viewholders.PhotosLikeHeaderBlockViewHolder$2, reason: invalid class name */
    public static final class AnonymousClass2 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return true;
        }
    }

    /* compiled from: PhotosLikeHeaderBlockViewHolder.kt */
    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (xpg0.b()) {
                int i = PhotosLikeHeaderBlockViewHolder.p;
                rect.right = PhotosLikeHeaderBlockViewHolder.p;
            } else {
                int i2 = PhotosLikeHeaderBlockViewHolder.p;
                rect.left = PhotosLikeHeaderBlockViewHolder.p;
            }
        }
    }

    public PhotosLikeHeaderBlockViewHolder(ViewGroup viewGroup) {
        super(viewGroup, R.layout.photos_like_block_header_view_holder, 0);
        View findViewById = this.itemView.findViewById(R.id.photo_likes_show_all);
        this.n = findViewById;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.photos_like_recycler_view);
        mfa0 mfa0Var = new mfa0();
        this.o = mfa0Var;
        bwt0.i0(findViewById, new kb40(this, 9));
        this.itemView.getContext();
        recyclerView.setLayoutManager(new AnonymousClass2(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        int i = p;
        int i2 = q;
        recyclerView.setPaddingRelative(i2, 0, i2 - i, 0);
        recyclerView.addItemDecoration(new a());
        recyclerView.setAdapter(mfa0Var);
    }

    @Override // xsna.vif0
    public final void i6(List<? extends Photo> list) {
        mfa0 mfa0Var = this.o;
        mfa0Var.setItems(list);
        mfa0Var.notifyDataSetChanged();
    }
}
