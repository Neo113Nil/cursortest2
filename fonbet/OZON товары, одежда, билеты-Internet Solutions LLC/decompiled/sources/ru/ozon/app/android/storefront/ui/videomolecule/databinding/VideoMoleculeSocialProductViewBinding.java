package ru.ozon.app.android.storefront.ui.videomolecule.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.socialporduct.VideoMoleculeSocialProductListView;

/* loaded from: classes2.dex */
public final class VideoMoleculeSocialProductViewBinding implements a {

    @NonNull
    private final VideoMoleculeSocialProductListView rootView;

    @NonNull
    public final VideoMoleculeSocialProductListView socialProductListView;

    private VideoMoleculeSocialProductViewBinding(@NonNull VideoMoleculeSocialProductListView videoMoleculeSocialProductListView, @NonNull VideoMoleculeSocialProductListView videoMoleculeSocialProductListView2) {
        this.rootView = videoMoleculeSocialProductListView;
        this.socialProductListView = videoMoleculeSocialProductListView2;
    }

    @NonNull
    public static VideoMoleculeSocialProductViewBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VideoMoleculeSocialProductListView videoMoleculeSocialProductListView = (VideoMoleculeSocialProductListView) view;
        return new VideoMoleculeSocialProductViewBinding(videoMoleculeSocialProductListView, videoMoleculeSocialProductListView);
    }

    @Override // X4.a
    @NonNull
    public VideoMoleculeSocialProductListView getRoot() {
        return this.rootView;
    }
}
