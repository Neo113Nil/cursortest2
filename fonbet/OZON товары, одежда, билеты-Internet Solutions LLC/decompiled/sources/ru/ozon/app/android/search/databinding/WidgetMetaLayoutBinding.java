package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetMetaLayoutBinding implements a {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final FavoriteButtonView entityFavoriteButton;

    @NonNull
    public final TextView metaDescriptionTv;

    @NonNull
    public final AppCompatImageView metaIv;

    @NonNull
    public final TextView metaTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatImageView shareIv;

    private WidgetMetaLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull FavoriteButtonView favoriteButtonView, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView2, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.entityFavoriteButton = favoriteButtonView;
        this.metaDescriptionTv = textView;
        this.metaIv = appCompatImageView;
        this.metaTitleTv = textView2;
        this.shareIv = appCompatImageView2;
    }

    @NonNull
    public static WidgetMetaLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.entityFavoriteButton;
            FavoriteButtonView favoriteButtonView = (FavoriteButtonView) C2548q.d(i11, view);
            if (favoriteButtonView != null) {
                i11 = R$id.metaDescriptionTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.metaIv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.metaTitleTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.shareIv;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                            if (appCompatImageView2 != null) {
                                return new WidgetMetaLayoutBinding((ConstraintLayout) view, barrier, favoriteButtonView, textView, appCompatImageView, textView2, appCompatImageView2);
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
