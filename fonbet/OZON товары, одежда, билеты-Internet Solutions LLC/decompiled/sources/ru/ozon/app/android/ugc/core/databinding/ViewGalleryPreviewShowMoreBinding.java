package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class ViewGalleryPreviewShowMoreBinding implements a {

    @NonNull
    public final AppCompatImageView iconIv;

    @NonNull
    public final FrameLayout mainIv;

    @NonNull
    public final StatusableMediaPreviewView photoPv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomV2View showMoreTav;

    private ViewGalleryPreviewShowMoreBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout2, @NonNull StatusableMediaPreviewView statusableMediaPreviewView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = frameLayout;
        this.iconIv = appCompatImageView;
        this.mainIv = frameLayout2;
        this.photoPv = statusableMediaPreviewView;
        this.showMoreTav = textAtomV2View;
    }

    @NonNull
    public static ViewGalleryPreviewShowMoreBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i11 = R$id.photoPv;
            StatusableMediaPreviewView statusableMediaPreviewView = (StatusableMediaPreviewView) C2548q.d(i11, view);
            if (statusableMediaPreviewView != null) {
                i11 = R$id.showMoreTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new ViewGalleryPreviewShowMoreBinding(frameLayout, appCompatImageView, frameLayout, statusableMediaPreviewView, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
