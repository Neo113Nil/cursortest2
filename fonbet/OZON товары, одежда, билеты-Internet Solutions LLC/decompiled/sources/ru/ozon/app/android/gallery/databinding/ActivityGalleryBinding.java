package ru.ozon.app.android.gallery.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.gallery.R$id;
import ru.ozon.app.android.gallery.R$layout;
import ru.ozon.app.android.gallery.view.LockableViewPager;

/* loaded from: classes12.dex */
public final class ActivityGalleryBinding implements a {

    @NonNull
    public final AppCompatImageView closeIv;

    @NonNull
    public final FrameLayout galleryContainer;

    @NonNull
    public final RecyclerView previewRv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LockableViewPager viewPager;

    private ActivityGalleryBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView, @NonNull LockableViewPager lockableViewPager) {
        this.rootView = frameLayout;
        this.closeIv = appCompatImageView;
        this.galleryContainer = frameLayout2;
        this.previewRv = recyclerView;
        this.viewPager = lockableViewPager;
    }

    @NonNull
    public static ActivityGalleryBinding bind(@NonNull View view) {
        int i11 = R$id.closeIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i11 = R$id.previewRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.viewPager;
                LockableViewPager lockableViewPager = (LockableViewPager) C2548q.d(i11, view);
                if (lockableViewPager != null) {
                    return new ActivityGalleryBinding(frameLayout, appCompatImageView, frameLayout, recyclerView, lockableViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityGalleryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGalleryBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_gallery, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
