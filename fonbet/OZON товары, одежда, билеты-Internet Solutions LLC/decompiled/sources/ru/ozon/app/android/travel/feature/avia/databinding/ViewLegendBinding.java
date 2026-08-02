package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewLegendBinding implements a {

    @NonNull
    public final BadgeView legendBadgeView;

    @NonNull
    public final AppCompatImageView legendIconImageView;

    @NonNull
    public final FlexboxLayout legendSeatTypeContainer;

    @NonNull
    public final TextAtomView legendTitleTextView;

    @NonNull
    private final View rootView;

    private ViewLegendBinding(@NonNull View view, @NonNull BadgeView badgeView, @NonNull AppCompatImageView appCompatImageView, @NonNull FlexboxLayout flexboxLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.legendBadgeView = badgeView;
        this.legendIconImageView = appCompatImageView;
        this.legendSeatTypeContainer = flexboxLayout;
        this.legendTitleTextView = textAtomView;
    }

    @NonNull
    public static ViewLegendBinding bind(@NonNull View view) {
        int i11 = R$id.legendBadgeView;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.legendIconImageView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.legendSeatTypeContainer;
                FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
                if (flexboxLayout != null) {
                    i11 = R$id.legendTitleTextView;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new ViewLegendBinding(view, badgeView, appCompatImageView, flexboxLayout, textAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewLegendBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_legend, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
