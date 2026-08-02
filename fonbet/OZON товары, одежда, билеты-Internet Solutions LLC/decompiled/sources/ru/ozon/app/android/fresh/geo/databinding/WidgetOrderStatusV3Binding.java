package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.SegmentedCircleProgressIndicator;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetOrderStatusV3Binding implements a {

    @NonNull
    public final SegmentedCircleProgressIndicator circleProgressIndicator;

    @NonNull
    public final TextAtomV2View minSubtitle;

    @NonNull
    public final TextAtomV2View minTitle;

    @NonNull
    public final IconView progressIcon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTextTvTv;

    @NonNull
    public final TextAtomV2View titleTextTv;

    private WidgetOrderStatusV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull SegmentedCircleProgressIndicator segmentedCircleProgressIndicator, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4) {
        this.rootView = constraintLayout;
        this.circleProgressIndicator = segmentedCircleProgressIndicator;
        this.minSubtitle = textAtomV2View;
        this.minTitle = textAtomV2View2;
        this.progressIcon = iconView;
        this.subtitleTextTvTv = textAtomV2View3;
        this.titleTextTv = textAtomV2View4;
    }

    @NonNull
    public static WidgetOrderStatusV3Binding bind(@NonNull View view) {
        int i11 = R$id.circleProgressIndicator;
        SegmentedCircleProgressIndicator segmentedCircleProgressIndicator = (SegmentedCircleProgressIndicator) C2548q.d(i11, view);
        if (segmentedCircleProgressIndicator != null) {
            i11 = R$id.minSubtitle;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.minTitle;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.progressIcon;
                    IconView iconView = (IconView) C2548q.d(i11, view);
                    if (iconView != null) {
                        i11 = R$id.subtitleTextTvTv;
                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View3 != null) {
                            i11 = R$id.titleTextTv;
                            TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View4 != null) {
                                return new WidgetOrderStatusV3Binding((ConstraintLayout) view, segmentedCircleProgressIndicator, textAtomV2View, textAtomV2View2, iconView, textAtomV2View3, textAtomV2View4);
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
