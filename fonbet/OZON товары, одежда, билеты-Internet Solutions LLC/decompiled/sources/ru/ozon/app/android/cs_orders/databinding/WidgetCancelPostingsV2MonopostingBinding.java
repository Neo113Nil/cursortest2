package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetCancelPostingsV2MonopostingBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    public final BadgeView imageBadgeBv;

    @NonNull
    public final Image imageIv;

    @NonNull
    public final AppCompatTextView infoTv;

    @NonNull
    public final IconView priceUpIcon;

    @NonNull
    public final TextAtomV2View priceUpTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final HorizontalFlexAtomsLayout titleRowFlexAL;

    private WidgetCancelPostingsV2MonopostingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull BadgeView badgeView, @NonNull Image image, @NonNull AppCompatTextView appCompatTextView, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View, @NonNull AppCompatTextView appCompatTextView2, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout) {
        this.rootView = constraintLayout;
        this.checkboxV = view;
        this.imageBadgeBv = badgeView;
        this.imageIv = image;
        this.infoTv = appCompatTextView;
        this.priceUpIcon = iconView;
        this.priceUpTv = textAtomV2View;
        this.subtitleTv = appCompatTextView2;
        this.titleRowFlexAL = horizontalFlexAtomsLayout;
    }

    @NonNull
    public static WidgetCancelPostingsV2MonopostingBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.imageBadgeBv;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.imageIv;
                Image image = (Image) C2548q.d(i11, view);
                if (image != null) {
                    i11 = R$id.infoTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        i11 = R$id.priceUpIcon;
                        IconView iconView = (IconView) C2548q.d(i11, view);
                        if (iconView != null) {
                            i11 = R$id.priceUpTv;
                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View != null) {
                                i11 = R$id.subtitleTv;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView2 != null) {
                                    i11 = R$id.titleRowFlexAL;
                                    HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                                    if (horizontalFlexAtomsLayout != null) {
                                        return new WidgetCancelPostingsV2MonopostingBinding((ConstraintLayout) view, d11, badgeView, image, appCompatTextView, iconView, textAtomV2View, appCompatTextView2, horizontalFlexAtomsLayout);
                                    }
                                }
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
