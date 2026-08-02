package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetSearchResultHeaderBinding implements a {

    @NonNull
    public final TextView categoryTitleTv;

    @NonNull
    public final TextView didYouMeanTv;

    @NonNull
    public final FavoriteButtonView entityFavoriteButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout searchResultsHeaderWidgetView;

    @NonNull
    public final AppCompatImageView shareIv;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetSearchResultHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FavoriteButtonView favoriteButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.categoryTitleTv = textView;
        this.didYouMeanTv = textView2;
        this.entityFavoriteButton = favoriteButtonView;
        this.searchResultsHeaderWidgetView = constraintLayout2;
        this.shareIv = appCompatImageView;
        this.subtitleTv = textView3;
        this.titleTv = textView4;
    }

    @NonNull
    public static WidgetSearchResultHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.categoryTitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.didYouMeanTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.entityFavoriteButton;
                FavoriteButtonView favoriteButtonView = (FavoriteButtonView) C2548q.d(i11, view);
                if (favoriteButtonView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.shareIv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.subtitleTv;
                        TextView textView3 = (TextView) C2548q.d(i11, view);
                        if (textView3 != null) {
                            i11 = R$id.titleTv;
                            TextView textView4 = (TextView) C2548q.d(i11, view);
                            if (textView4 != null) {
                                return new WidgetSearchResultHeaderBinding(constraintLayout, textView, textView2, favoriteButtonView, constraintLayout, appCompatImageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
