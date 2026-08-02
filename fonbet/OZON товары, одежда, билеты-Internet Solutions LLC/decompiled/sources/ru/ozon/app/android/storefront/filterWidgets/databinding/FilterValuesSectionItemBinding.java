package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class FilterValuesSectionItemBinding implements a {

    @NonNull
    public final TextView letterTv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout sectionItemContainer;

    private FilterValuesSectionItemBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.letterTv = textView;
        this.sectionItemContainer = frameLayout2;
    }

    @NonNull
    public static FilterValuesSectionItemBinding bind(@NonNull View view) {
        int i11 = R$id.letterTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new FilterValuesSectionItemBinding(frameLayout, textView, frameLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
