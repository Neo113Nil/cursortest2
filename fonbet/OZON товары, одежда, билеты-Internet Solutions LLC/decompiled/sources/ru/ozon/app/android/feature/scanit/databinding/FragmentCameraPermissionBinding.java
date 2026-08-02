package ru.ozon.app.android.feature.scanit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.feature.scanit.R$id;
import ru.ozon.app.android.feature.scanit.R$layout;

/* loaded from: classes12.dex */
public final class FragmentCameraPermissionBinding implements a {

    @NonNull
    public final Button buttonB;

    @NonNull
    public final ImageView imageIV;

    @NonNull
    public final TextView messageTV;

    @NonNull
    private final LinearLayout rootView;

    private FragmentCameraPermissionBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.buttonB = button;
        this.imageIV = imageView;
        this.messageTV = textView;
    }

    @NonNull
    public static FragmentCameraPermissionBinding bind(@NonNull View view) {
        int i11 = R$id.buttonB;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            i11 = R$id.imageIV;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.messageTV;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new FragmentCameraPermissionBinding((LinearLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentCameraPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_camera_permission, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
