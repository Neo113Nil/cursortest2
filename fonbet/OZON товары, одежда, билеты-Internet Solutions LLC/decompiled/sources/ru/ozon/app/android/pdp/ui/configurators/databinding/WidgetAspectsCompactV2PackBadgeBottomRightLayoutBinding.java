package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2PackBadgeBottomRightLayoutBinding implements a {

    @NonNull
    public final BadgeView badgeV;

    @NonNull
    public final LinearLayout infoFl;

    @NonNull
    private final VariantConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetAspectsCompactV2PackBadgeBottomRightLayoutBinding(@NonNull VariantConstraintLayout variantConstraintLayout, @NonNull BadgeView badgeView, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = variantConstraintLayout;
        this.badgeV = badgeView;
        this.infoFl = linearLayout;
        this.subtitleTav = textAtomV2View;
        this.titleTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetAspectsCompactV2PackBadgeBottomRightLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.badgeV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.infoFl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.subtitleTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.titleTav;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetAspectsCompactV2PackBadgeBottomRightLayoutBinding((VariantConstraintLayout) view, badgeView, linearLayout, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public VariantConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
