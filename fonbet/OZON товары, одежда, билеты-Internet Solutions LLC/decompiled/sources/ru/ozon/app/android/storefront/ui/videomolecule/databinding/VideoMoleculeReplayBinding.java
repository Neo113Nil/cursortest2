package ru.ozon.app.android.storefront.ui.videomolecule.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.R$layout;

/* loaded from: classes2.dex */
public final class VideoMoleculeReplayBinding implements a {

    @NonNull
    public final FrameLayout replayButton;

    @NonNull
    public final ImageView replayButtonImage;

    @NonNull
    private final View rootView;

    private VideoMoleculeReplayBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.rootView = view;
        this.replayButton = frameLayout;
        this.replayButtonImage = imageView;
    }

    @NonNull
    public static VideoMoleculeReplayBinding bind(@NonNull View view) {
        int i11 = R$id.replayButton;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.replayButtonImage;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new VideoMoleculeReplayBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static VideoMoleculeReplayBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.video_molecule_replay, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
