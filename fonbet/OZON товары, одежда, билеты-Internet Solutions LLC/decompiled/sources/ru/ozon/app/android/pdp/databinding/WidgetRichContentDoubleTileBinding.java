package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class WidgetRichContentDoubleTileBinding implements a {

    @NonNull
    public final Guideline layoutG;

    @NonNull
    public final WidgetRichContentTileBinding leftTileLL;

    @NonNull
    public final View leftV;

    @NonNull
    public final WidgetRichContentTileBinding rightTileLL;

    @NonNull
    public final View rightV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetRichContentDoubleTileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull WidgetRichContentTileBinding widgetRichContentTileBinding, @NonNull View view, @NonNull WidgetRichContentTileBinding widgetRichContentTileBinding2, @NonNull View view2) {
        this.rootView = constraintLayout;
        this.layoutG = guideline;
        this.leftTileLL = widgetRichContentTileBinding;
        this.leftV = view;
        this.rightTileLL = widgetRichContentTileBinding2;
        this.rightV = view2;
    }

    @NonNull
    public static WidgetRichContentDoubleTileBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.layoutG;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null && (d11 = C2548q.d((i11 = R$id.leftTileLL), view)) != null) {
            WidgetRichContentTileBinding bind = WidgetRichContentTileBinding.bind(d11);
            i11 = R$id.leftV;
            View d13 = C2548q.d(i11, view);
            if (d13 != null && (d12 = C2548q.d((i11 = R$id.rightTileLL), view)) != null) {
                WidgetRichContentTileBinding bind2 = WidgetRichContentTileBinding.bind(d12);
                i11 = R$id.rightV;
                View d14 = C2548q.d(i11, view);
                if (d14 != null) {
                    return new WidgetRichContentDoubleTileBinding((ConstraintLayout) view, guideline, bind, d13, bind2, d14);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetRichContentDoubleTileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_rich_content_double_tile, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
