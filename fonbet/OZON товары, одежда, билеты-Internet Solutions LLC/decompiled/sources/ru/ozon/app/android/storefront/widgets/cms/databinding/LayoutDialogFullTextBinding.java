package ru.ozon.app.android.storefront.widgets.cms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.storefront.widgets.cms.R$id;

/* loaded from: classes2.dex */
public final class LayoutDialogFullTextBinding implements a {

    @NonNull
    public final ImageView closeDialogIv;

    @NonNull
    public final TextView fullTextTv;

    @NonNull
    private final NestedScrollView rootView;

    private LayoutDialogFullTextBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = nestedScrollView;
        this.closeDialogIv = imageView;
        this.fullTextTv = textView;
    }

    @NonNull
    public static LayoutDialogFullTextBinding bind(@NonNull View view) {
        int i11 = R$id.closeDialogIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.fullTextTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new LayoutDialogFullTextBinding((NestedScrollView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
