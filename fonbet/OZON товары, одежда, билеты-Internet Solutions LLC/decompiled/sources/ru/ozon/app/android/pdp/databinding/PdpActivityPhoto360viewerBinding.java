package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.chrisbanes.photoview.PhotoView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;

/* loaded from: classes13.dex */
public final class PdpActivityPhoto360viewerBinding implements a {

    @NonNull
    public final ImageView closeIv;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final PhotoView imagePv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenStateView;

    @NonNull
    public final TextView zoomDescriptionTv;

    private PdpActivityPhoto360viewerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull PhotoView photoView, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.closeIv = imageView;
        this.descriptionTv = textView;
        this.imagePv = photoView;
        this.screenStateView = screenStateViewWidget;
        this.zoomDescriptionTv = textView2;
    }

    @NonNull
    public static PdpActivityPhoto360viewerBinding bind(@NonNull View view) {
        int i11 = R$id.closeIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.descriptionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.imagePv;
                PhotoView photoView = (PhotoView) C2548q.d(i11, view);
                if (photoView != null) {
                    i11 = R$id.screenStateView;
                    ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                    if (screenStateViewWidget != null) {
                        i11 = R$id.zoomDescriptionTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new PdpActivityPhoto360viewerBinding((ConstraintLayout) view, imageView, textView, photoView, screenStateViewWidget, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpActivityPhoto360viewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PdpActivityPhoto360viewerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_activity_photo360viewer, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
