package com.vk.preview.presentation.view;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.nu0;
import xsna.qcy;
import xsna.t4d0;
import xsna.u4t;

/* compiled from: GalleryPickerPreviewView.kt */
/* loaded from: classes5.dex */
public final class b extends LinearLayout implements GalleryPickerPreview {
    public t4d0 b;
    public final u4t c;

    /* compiled from: GalleryPickerPreviewView.kt */
    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (recyclerView.getChildLayoutPosition(view) != 0) {
                rect.left = cn70.b(8);
            }
        }
    }

    public b(ContextWrapper contextWrapper) {
        super(contextWrapper, null, 0);
        View.inflate(contextWrapper, R.layout.gallery_picker_preview_view, this);
        setOrientation(1);
        setGravity(17);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.gallery_picker_preview_background, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_images_preview);
        u4t u4tVar = new u4t(new nu0(this, 22));
        this.c = u4tVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(u4tVar);
        recyclerView.addItemDecoration(new a());
        recyclerView.setItemAnimator(null);
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public GalleryPickerPreview.State getState() {
        return null;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setPreviewListener(t4d0 t4d0Var) {
        this.b = t4d0Var;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void z4(List<? extends MediaStoreEntry> list) {
        this.c.submitList(list);
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void s3(GalleryPickerPreview.State state) {
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setInitialState(GalleryPickerInitialData galleryPickerInitialData) {
    }
}
