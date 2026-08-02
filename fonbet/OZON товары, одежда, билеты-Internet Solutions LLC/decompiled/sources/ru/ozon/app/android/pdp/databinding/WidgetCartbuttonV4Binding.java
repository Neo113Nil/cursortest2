package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class WidgetCartbuttonV4Binding implements a {

    @NonNull
    public final ImageView btnIconIv;

    @NonNull
    public final TextView btnSubtitleTv;

    @NonNull
    public final TextView btnTitleTv;

    @NonNull
    private final View rootView;

    private WidgetCartbuttonV4Binding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.btnIconIv = imageView;
        this.btnSubtitleTv = textView;
        this.btnTitleTv = textView2;
    }

    @NonNull
    public static WidgetCartbuttonV4Binding bind(@NonNull View view) {
        int i11 = R$id.btnIconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.btnSubtitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.btnTitleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new WidgetCartbuttonV4Binding(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartbuttonV4Binding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_cartbutton_v4, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
