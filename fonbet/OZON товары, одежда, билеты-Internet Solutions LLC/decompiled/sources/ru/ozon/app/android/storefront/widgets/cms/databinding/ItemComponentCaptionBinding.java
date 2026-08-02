package ru.ozon.app.android.storefront.widgets.cms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.widgets.cms.R$id;

/* loaded from: classes2.dex */
public final class ItemComponentCaptionBinding implements a {

    @NonNull
    public final TextView captionSubtitle;

    @NonNull
    public final TextView captionTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemComponentCaptionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.captionSubtitle = textView;
        this.captionTitle = textView2;
    }

    @NonNull
    public static ItemComponentCaptionBinding bind(@NonNull View view) {
        int i11 = R$id.caption_subtitle;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.caption_title;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new ItemComponentCaptionBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
