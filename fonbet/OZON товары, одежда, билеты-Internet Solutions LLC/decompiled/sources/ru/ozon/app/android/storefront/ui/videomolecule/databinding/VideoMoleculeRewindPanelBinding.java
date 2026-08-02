package ru.ozon.app.android.storefront.ui.videomolecule.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.R$layout;

/* loaded from: classes2.dex */
public final class VideoMoleculeRewindPanelBinding implements a {

    @NonNull
    public final ImageView dot;

    @NonNull
    public final TextView rewindTime;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView totalTime;

    private VideoMoleculeRewindPanelBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.dot = imageView;
        this.rewindTime = textView;
        this.totalTime = textView2;
    }

    @NonNull
    public static VideoMoleculeRewindPanelBinding bind(@NonNull View view) {
        int i11 = R$id.dot;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.rewindTime;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.totalTime;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new VideoMoleculeRewindPanelBinding(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static VideoMoleculeRewindPanelBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.video_molecule_rewind_panel, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
