package com.vk.preview.presentation.view;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a8f;
import xsna.awt0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.e43;
import xsna.g9f;
import xsna.gzs;
import xsna.m33;
import xsna.p8f;
import xsna.rx0;
import xsna.s3q0;
import xsna.t4d0;
import xsna.t6;

/* compiled from: ClipsTemplatesPickerPreviewView.kt */
/* loaded from: classes5.dex */
public final class a extends ConstraintLayout implements GalleryPickerPreview {
    public gzs<s3q0> A;
    public final View t;
    public final View u;
    public final ImageView v;
    public t4d0 w;
    public GalleryPickerInitialData x;
    public final p8f y;
    public final LinearLayoutManager z;

    /* compiled from: ClipsTemplatesPickerPreviewView.kt */
    /* renamed from: com.vk.preview.presentation.view.a$a, reason: collision with other inner class name */
    public static final class C1550a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (recyclerView.getChildLayoutPosition(view) != 0) {
                rect.left = cn70.b(8);
            }
        }
    }

    public a(ContextWrapper contextWrapper) {
        super(contextWrapper, null, 0);
        View.inflate(contextWrapper, R.layout.clips_templates_gallery_picker_preview_view, this);
        setBackground(m33.a(R.drawable.clips_templates_gallery_picker_preview_background, contextWrapper));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_images_preview);
        this.t = findViewById(R.id.clips_template_picker_recycler_left_shadow);
        this.u = findViewById(R.id.clips_template_picker_recycler_right_shadow);
        this.v = (ImageView) findViewById(R.id.action);
        p8f p8fVar = new p8f(new rx0(this, 12));
        this.y = p8fVar;
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.z = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(p8fVar);
        recyclerView.addItemDecoration(new C1550a());
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new g9f(this));
        bwt0.i0(findViewById(R.id.action), new t6(this, 22));
    }

    public static ArrayList P4(GalleryPickerInitialData galleryPickerInitialData, List list) {
        List<Integer> list2 = galleryPickerInitialData.b;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            MediaStoreEntry mediaStoreEntry = null;
            if (i < 0) {
                e43.t();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            if (list.size() > i) {
                mediaStoreEntry = (MediaStoreEntry) list.get(i);
            }
            arrayList.add(new a8f(i, mediaStoreEntry, intValue));
            i = i2;
        }
        return arrayList;
    }

    private final void setAcceptButtonEnabled(boolean z) {
        this.v.setAlpha(z ? 1.0f : 0.32f);
    }

    public final void Q4() {
        LinearLayoutManager linearLayoutManager = this.z;
        awt0.v(this.u, linearLayoutManager.w() < this.y.getItemCount() - 1);
        awt0.v(this.t, linearLayoutManager.s() > 0);
    }

    public final gzs<s3q0> getOnAction() {
        return this.A;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public GalleryPickerPreview.State getState() {
        return null;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setInitialState(GalleryPickerInitialData galleryPickerInitialData) {
        this.x = galleryPickerInitialData;
        if (galleryPickerInitialData != null) {
            EmptyList emptyList = EmptyList.b;
            this.y.submitList(P4(galleryPickerInitialData, emptyList));
            emptyList.isEmpty();
            setAcceptButtonEnabled(false);
        }
        Q4();
    }

    public final void setOnAction(gzs<s3q0> gzsVar) {
        this.A = gzsVar;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setPreviewListener(t4d0 t4d0Var) {
        this.w = t4d0Var;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void z4(List<? extends MediaStoreEntry> list) {
        GalleryPickerInitialData galleryPickerInitialData = this.x;
        if (galleryPickerInitialData != null) {
            this.y.submitList(P4(galleryPickerInitialData, list));
            setAcceptButtonEnabled(!list.isEmpty());
        }
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void s3(GalleryPickerPreview.State state) {
    }
}
