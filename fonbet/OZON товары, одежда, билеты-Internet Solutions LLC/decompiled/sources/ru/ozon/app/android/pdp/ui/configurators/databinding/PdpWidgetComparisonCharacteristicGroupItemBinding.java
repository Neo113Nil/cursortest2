package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonCharacteristicGroupItemBinding implements a {

    @NonNull
    public final TextView groupSubtitleTV;

    @NonNull
    public final PdpWidgetComparisonCharateristicsGroupColumnItemBinding leftColumn;

    @NonNull
    public final PdpWidgetComparisonCharateristicsGroupColumnItemBinding rightColumn;

    @NonNull
    private final LinearLayout rootView;

    private PdpWidgetComparisonCharacteristicGroupItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull PdpWidgetComparisonCharateristicsGroupColumnItemBinding pdpWidgetComparisonCharateristicsGroupColumnItemBinding, @NonNull PdpWidgetComparisonCharateristicsGroupColumnItemBinding pdpWidgetComparisonCharateristicsGroupColumnItemBinding2) {
        this.rootView = linearLayout;
        this.groupSubtitleTV = textView;
        this.leftColumn = pdpWidgetComparisonCharateristicsGroupColumnItemBinding;
        this.rightColumn = pdpWidgetComparisonCharateristicsGroupColumnItemBinding2;
    }

    @NonNull
    public static PdpWidgetComparisonCharacteristicGroupItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.groupSubtitleTV;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null && (d11 = C2548q.d((i11 = R$id.leftColumn), view)) != null) {
            PdpWidgetComparisonCharateristicsGroupColumnItemBinding bind = PdpWidgetComparisonCharateristicsGroupColumnItemBinding.bind(d11);
            int i12 = R$id.rightColumn;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new PdpWidgetComparisonCharacteristicGroupItemBinding((LinearLayout) view, textView, bind, PdpWidgetComparisonCharateristicsGroupColumnItemBinding.bind(d12));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetComparisonCharacteristicGroupItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_comparison_characteristic_group_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
