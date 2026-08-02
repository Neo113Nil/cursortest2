package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.cachapa.expandablelayout.ExpandableLayout;
import ru.ozon.app.android.pdp.ui.configurators.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonCharateristicsGroupBinding implements a {

    @NonNull
    public final RecyclerView characteristicsRV;

    @NonNull
    public final ImageView dropDownIconIV;

    @NonNull
    public final ExpandableLayout expandableLayout;

    @NonNull
    public final ConstraintLayout groupsCL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTV;

    private PdpWidgetComparisonCharateristicsGroupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull ExpandableLayout expandableLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.characteristicsRV = recyclerView;
        this.dropDownIconIV = imageView;
        this.expandableLayout = expandableLayout;
        this.groupsCL = constraintLayout2;
        this.titleTV = textView;
    }

    @NonNull
    public static PdpWidgetComparisonCharateristicsGroupBinding bind(@NonNull View view) {
        int i11 = R$id.characteristicsRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.dropDownIconIV;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.expandableLayout;
                ExpandableLayout expandableLayout = (ExpandableLayout) C2548q.d(i11, view);
                if (expandableLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.titleTV;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new PdpWidgetComparisonCharateristicsGroupBinding(constraintLayout, recyclerView, imageView, expandableLayout, constraintLayout, textView);
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
