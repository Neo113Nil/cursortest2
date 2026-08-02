package com.vk.avatarpicker;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.irt;
import xsna.k5t;
import xsna.o010;
import xsna.q4t;
import xsna.too0;
import xsna.yn3;

/* compiled from: PhotoGalleryFragment.kt */
/* loaded from: classes15.dex */
public final class c extends Fragment implements too0 {
    public PhotoGalleryView h;
    public Toolbar i;
    public ContextThemeWrapper j;
    public a k;
    public final b l = new b();

    /* compiled from: PhotoGalleryFragment.kt */
    public interface a {
        void J();

        void v0(q4t q4tVar);
    }

    @Override // xsna.too0
    public final void Ng() {
        ContextThemeWrapper contextThemeWrapper = this.j;
        if (contextThemeWrapper == null) {
            contextThemeWrapper = null;
        }
        contextThemeWrapper.setTheme(dhr0.C().c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.k = context instanceof a ? (a) context : null;
        this.j = new ContextThemeWrapper(context, dhr0.C().c);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = this.j;
        if (contextThemeWrapper == null) {
            contextThemeWrapper = null;
        }
        return layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fragment_photo_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PhotoGalleryView photoGalleryView = (PhotoGalleryView) view.findViewById(R.id.gallery_view);
        if (requireArguments().getBoolean("key_without_gif", false)) {
            photoGalleryView.setEntryFilter(new irt(8));
        }
        this.h = photoGalleryView;
        this.i = (Toolbar) view.findViewById(R.id.toolbar);
        PhotoGalleryView photoGalleryView2 = this.h;
        if (photoGalleryView2 == null) {
            photoGalleryView2 = null;
        }
        photoGalleryView2.setCallback(this.l);
        Toolbar toolbar = this.i;
        (toolbar != null ? toolbar : null).setNavigationOnClickListener(new yn3(this, 15));
    }

    /* compiled from: PhotoGalleryFragment.kt */
    public static final class b implements PhotoGalleryView.a {
        public b() {
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final Rect a() {
            return null;
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final View e(ViewGroup viewGroup) {
            return null;
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final WindowManager.LayoutParams f() {
            return null;
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final PhotoGalleryView.b g() {
            return new PhotoGalleryView.b.C1474b(new o010(c.this, 29));
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void h() {
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void b(int i) {
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void c(PhotoViewer photoViewer) {
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void d(k5t k5tVar) {
        }
    }
}
