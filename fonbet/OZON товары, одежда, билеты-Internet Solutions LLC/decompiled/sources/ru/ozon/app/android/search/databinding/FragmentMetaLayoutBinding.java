package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;

/* loaded from: classes13.dex */
public final class FragmentMetaLayoutBinding implements a {

    @NonNull
    public final ImageView metaCloseIv;

    @NonNull
    public final TextView metaDescriptionTv;

    @NonNull
    public final ImageView metaIv;

    @NonNull
    private final NestedScrollView rootView;

    private FragmentMetaLayoutBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2) {
        this.rootView = nestedScrollView;
        this.metaCloseIv = imageView;
        this.metaDescriptionTv = textView;
        this.metaIv = imageView2;
    }

    @NonNull
    public static FragmentMetaLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.metaCloseIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.metaDescriptionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.metaIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    return new FragmentMetaLayoutBinding((NestedScrollView) view, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentMetaLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_meta_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
