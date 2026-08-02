package com.vk.attachpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.iah0;
import xsna.jk90;
import xsna.pd90;
import xsna.s4t;

/* loaded from: classes15.dex */
public class GalleryRecyclerView extends VkRecyclerPaginatedView {
    public static final /* synthetic */ int W = 0;
    public int O;
    public RecyclerView.n P;
    public RecyclerView.n Q;
    public int R;
    public int S;
    public GalleryGridSpanStyle T;
    public GalleryHeaderButtonStyle U;
    public s4t V;

    public class a extends GridLayoutManager.c {
        public final /* synthetic */ int d;

        public a(int i) {
            this.d = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            int i2 = GalleryRecyclerView.W;
            GalleryRecyclerView galleryRecyclerView = GalleryRecyclerView.this;
            PhotoSmallAdapter photoSmallAdapter = (PhotoSmallAdapter) galleryRecyclerView.z.c;
            Object c = photoSmallAdapter.c.c(i);
            if ((photoSmallAdapter.m || photoSmallAdapter.n || photoSmallAdapter.q) && (c instanceof PhotoSmallAdapter.a)) {
                if (galleryRecyclerView.U != GalleryHeaderButtonStyle.FULL_ROW) {
                    return 1;
                }
            } else if (!PermissionHelper.o(photoSmallAdapter.k.b) || !(c instanceof jk90)) {
                return 1;
            }
            return this.d;
        }
    }

    public GalleryRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = iah0.a(4);
        this.R = R.dimen.picker_item_size_image;
        this.S = 3;
    }

    private void setRoundingItemDecorator(RecyclerView.n nVar) {
        RecyclerView.n nVar2 = this.Q;
        if (nVar2 != null) {
            this.x.removeItemDecoration(nVar2);
            this.Q = null;
        }
        if (nVar != null) {
            this.Q = nVar;
            this.x.addItemDecoration(nVar);
        }
    }

    private void setSpacingItemDecorator(RecyclerView.n nVar) {
        RecyclerView.n nVar2 = this.P;
        if (nVar2 != null) {
            this.x.removeItemDecoration(nVar2);
            this.P = null;
        }
        if (nVar != null) {
            this.P = nVar;
            this.x.addItemDecoration(nVar);
        }
    }

    public int getColumnWidthResId() {
        return this.R;
    }

    public int getSpanCount() {
        return this.S;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        z();
    }

    public void setColumnWidthResId(int i) {
        this.R = i;
        z();
    }

    public void setDividerSize(int i) {
        if (this.O != i) {
            this.O = i;
            x();
        }
    }

    public void setSpanCount(int i) {
        this.S = i;
        z();
    }

    public final void x() {
        pd90 pd90Var = this.z;
        if (pd90Var == null || pd90Var.c == 0 || this.x.getLayoutManager() == null || !(this.x.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        int i = ((GridLayoutManager) this.x.getLayoutManager()).s;
        Iterator it = ((ListDataSet) ((PhotoSmallAdapter) this.z.c).c).d.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if ((next instanceof MediaStoreEntry) || (next instanceof com.vk.attachpicker.adapter.a)) {
                break;
            } else {
                i2++;
            }
        }
        s4t s4tVar = this.V;
        if (s4tVar != null) {
            setSpacingItemDecorator(s4tVar.a(i, this.O, i2));
            setRoundingItemDecorator(this.V.b(i, i2, getContext()));
        }
    }

    public final void z() {
        int max;
        if (this.T == GalleryGridSpanStyle.EXACT_COUNT) {
            max = this.S;
        } else {
            int dimension = (int) getResources().getDimension(this.R);
            if (dimension <= 0) {
                return;
            } else {
                max = Math.max(1, iah0.z(getContext()) / dimension);
            }
        }
        if (this.x.getLayoutManager() == null || !(this.x.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.x.getLayoutManager();
        gridLayoutManager.setSpanCount(max);
        gridLayoutManager.x = new a(max);
        x();
    }
}
