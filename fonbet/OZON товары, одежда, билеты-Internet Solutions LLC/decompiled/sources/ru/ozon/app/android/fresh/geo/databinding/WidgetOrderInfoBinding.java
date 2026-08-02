package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetOrderInfoBinding implements a {

    @NonNull
    public final BadgeView headerButton;

    @NonNull
    public final ConstraintLayout orderInfoWidgetId;

    @NonNull
    public final RecyclerView orderProducts;

    @NonNull
    public final TextAtomV2View rightHeaderText;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private WidgetOrderInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.headerButton = badgeView;
        this.orderInfoWidgetId = constraintLayout2;
        this.orderProducts = recyclerView;
        this.rightHeaderText = textAtomV2View;
        this.subtitle = textAtomV2View2;
        this.title = textAtomV2View3;
    }

    @NonNull
    public static WidgetOrderInfoBinding bind(@NonNull View view) {
        int i11 = R$id.headerButton;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.orderProducts;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.rightHeaderText;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.subtitle;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.title;
                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View3 != null) {
                            return new WidgetOrderInfoBinding(constraintLayout, badgeView, constraintLayout, recyclerView, textAtomV2View, textAtomV2View2, textAtomV2View3);
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
