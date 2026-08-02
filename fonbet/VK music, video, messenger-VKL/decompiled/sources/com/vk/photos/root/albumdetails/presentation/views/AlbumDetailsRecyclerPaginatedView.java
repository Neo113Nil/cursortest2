package com.vk.photos.root.albumdetails.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.aq2;
import xsna.bga0;
import xsna.ee;
import xsna.gxp;
import xsna.whp;

/* compiled from: AlbumDetailsRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class AlbumDetailsRecyclerPaginatedView extends aq2 {
    public static final /* synthetic */ int U = 0;
    public final ArrayList T;

    /* compiled from: AlbumDetailsRecyclerPaginatedView.kt */
    public final class a implements c.i {
        public a() {
        }

        @Override // com.vk.lists.c.i
        public final boolean I() {
            Iterator it = AlbumDetailsRecyclerPaginatedView.this.T.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((RecyclerView.Adapter) it.next()).getItemCount();
            }
            return i == 0;
        }

        @Override // com.vk.lists.c.i
        public final void clear() {
            int i = AlbumDetailsRecyclerPaginatedView.U;
            AlbumDetailsRecyclerPaginatedView.this.z.c.clear();
        }
    }

    public AlbumDetailsRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.T = new ArrayList();
    }

    @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView, com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return LayoutInflater.from(context).inflate(R.layout.album_details_empty_view, (ViewGroup) this, false);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        bga0 bga0Var = new bga0(context, attributeSet, 4);
        bga0Var.setErrorText(context.getString(R.string.album_details_loading_error));
        return bga0Var;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void n(Context context, AttributeSet attributeSet, int i) {
        super.n(context, attributeSet, i);
        removeView(this.d);
        addView(this.d);
        removeView(this.c);
        addView(this.c);
        this.e.setVisibility(0);
    }

    @Override // com.vk.lists.RecyclerPaginatedView
    public final c.i v() {
        return new a();
    }

    public final void x() {
        super.f0();
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void e0() {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void f0() {
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void g0() {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void qg(whp whpVar) {
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void r(Throwable th) {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
    }
}
