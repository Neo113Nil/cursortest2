package com.vk.preview.presentation.view;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.dhr0;
import xsna.qcy;
import xsna.s6a0;
import xsna.t4d0;
import xsna.t6a0;
import xsna.u6a0;
import xsna.zb60;

/* compiled from: PhotoEditorLargePickerPreviewView.kt */
/* loaded from: classes5.dex */
public final class c extends LinearLayout implements GalleryPickerPreview {
    public final RecyclerView b;
    public u6a0 c;
    public t6a0 d;
    public zb60 e;
    public Object f;

    /* compiled from: PhotoEditorLargePickerPreviewView.kt */
    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (recyclerView.getChildLayoutPosition(view) != 0) {
                rect.left = cn70.b(8);
            }
        }
    }

    public c(PhotoVideoAttachActivity photoVideoAttachActivity) {
        super(photoVideoAttachActivity, null, 0);
        View.inflate(photoVideoAttachActivity, R.layout.gallery_picker_large_photo_editor_preview_view, this);
        setOrientation(1);
        setGravity(17);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.gallery_picker_preview_background, this);
        this.b = (RecyclerView) findViewById(R.id.rv_images_preview);
        this.f = EmptyList.b;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public GalleryPickerPreview.State getState() {
        return null;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setPreviewListener(t4d0 t4d0Var) {
        this.c = (u6a0) t4d0Var;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void z4(List<? extends MediaStoreEntry> list) {
        List<? extends MediaStoreEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MediaStoreEntry mediaStoreEntry : list2) {
            zb60 zb60Var = this.e;
            Integer num = null;
            Integer num2 = zb60Var != null ? (Integer) zb60Var.invoke(mediaStoreEntry) : null;
            if (num2 == null || num2.intValue() != -1) {
                num = num2;
            }
            arrayList.add(new s6a0.a(mediaStoreEntry, num));
        }
        this.f = arrayList;
        t6a0 t6a0Var = this.d;
        if (t6a0Var != null) {
            t6a0Var.submitList(arrayList);
        }
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void s3(GalleryPickerPreview.State state) {
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setInitialState(GalleryPickerInitialData galleryPickerInitialData) {
    }
}
