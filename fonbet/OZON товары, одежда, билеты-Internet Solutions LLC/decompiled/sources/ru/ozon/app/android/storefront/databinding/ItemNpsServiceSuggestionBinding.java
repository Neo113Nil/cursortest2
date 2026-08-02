package ru.ozon.app.android.storefront.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class ItemNpsServiceSuggestionBinding implements a {

    @NonNull
    public final AppCompatImageView imageServiceCard;

    @NonNull
    private final AppCompatImageView rootView;

    private ItemNpsServiceSuggestionBinding(@NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = appCompatImageView;
        this.imageServiceCard = appCompatImageView2;
    }

    @NonNull
    public static ItemNpsServiceSuggestionBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new ItemNpsServiceSuggestionBinding(appCompatImageView, appCompatImageView);
    }

    @Override // X4.a
    @NonNull
    public AppCompatImageView getRoot() {
        return this.rootView;
    }
}
