package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetConsigneeItemBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final IconButtonV3View iconButton;

    @NonNull
    public final TextAtomV2View name;

    @NonNull
    public final TextAtomV2View requisites;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    private WidgetConsigneeItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull View view) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.iconButton = iconButtonV3View;
        this.name = textAtomV2View;
        this.requisites = textAtomV2View2;
        this.separator = view;
    }

    @NonNull
    public static WidgetConsigneeItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.iconButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.name;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.requisites;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                        return new WidgetConsigneeItemBinding((ConstraintLayout) view, badgeView, iconButtonV3View, textAtomV2View, textAtomV2View2, d11);
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
