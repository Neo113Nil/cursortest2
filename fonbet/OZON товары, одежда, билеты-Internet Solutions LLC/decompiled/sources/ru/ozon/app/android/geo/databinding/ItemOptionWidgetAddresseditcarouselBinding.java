package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.options.CellWithBadgeView;

/* loaded from: classes12.dex */
public final class ItemOptionWidgetAddresseditcarouselBinding implements a {

    @NonNull
    public final CellWithBadgeView cellView;

    @NonNull
    public final View clickHandle;

    @NonNull
    public final HorizontalAtomsLayout labelsHAL;

    @NonNull
    public final HorizontalScrollView labelsNSV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemOptionWidgetAddresseditcarouselBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellWithBadgeView cellWithBadgeView, @NonNull View view, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull HorizontalScrollView horizontalScrollView) {
        this.rootView = constraintLayout;
        this.cellView = cellWithBadgeView;
        this.clickHandle = view;
        this.labelsHAL = horizontalAtomsLayout;
        this.labelsNSV = horizontalScrollView;
    }

    @NonNull
    public static ItemOptionWidgetAddresseditcarouselBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.cellView;
        CellWithBadgeView cellWithBadgeView = (CellWithBadgeView) C2548q.d(i11, view);
        if (cellWithBadgeView != null && (d11 = C2548q.d((i11 = R$id.clickHandle), view)) != null) {
            i11 = R$id.labelsHAL;
            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout != null) {
                i11 = R$id.labelsNSV;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C2548q.d(i11, view);
                if (horizontalScrollView != null) {
                    return new ItemOptionWidgetAddresseditcarouselBinding((ConstraintLayout) view, cellWithBadgeView, d11, horizontalAtomsLayout, horizontalScrollView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOptionWidgetAddresseditcarouselBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_option_widget_addresseditcarousel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
