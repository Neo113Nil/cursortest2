package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.SegmentedCircleProgressView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ViewOrderTrackingProgressBinding implements a {

    @NonNull
    public final SegmentedCircleProgressView circleProgressIndicator;

    @NonNull
    public final IconView icon;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private ViewOrderTrackingProgressBinding(@NonNull View view, @NonNull SegmentedCircleProgressView segmentedCircleProgressView, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = view;
        this.circleProgressIndicator = segmentedCircleProgressView;
        this.icon = iconView;
        this.subtitle = textAtomV2View;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static ViewOrderTrackingProgressBinding bind(@NonNull View view) {
        int i11 = R$id.circleProgressIndicator;
        SegmentedCircleProgressView segmentedCircleProgressView = (SegmentedCircleProgressView) C2548q.d(i11, view);
        if (segmentedCircleProgressView != null) {
            i11 = R$id.icon;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                i11 = R$id.subtitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new ViewOrderTrackingProgressBinding(view, segmentedCircleProgressView, iconView, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
