package ru.ozon.app.android.pdpvideomolecule.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.R$layout;

/* loaded from: classes13.dex */
public final class PdpVideoMoleculeReplayBinding implements a {

    @NonNull
    public final FrameLayout replayButton;

    @NonNull
    public final ImageView replayButtonImage;

    @NonNull
    private final View rootView;

    private PdpVideoMoleculeReplayBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.rootView = view;
        this.replayButton = frameLayout;
        this.replayButtonImage = imageView;
    }

    @NonNull
    public static PdpVideoMoleculeReplayBinding bind(@NonNull View view) {
        int i11 = R$id.replayButton;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.replayButtonImage;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new PdpVideoMoleculeReplayBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpVideoMoleculeReplayBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pdp_video_molecule_replay, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
