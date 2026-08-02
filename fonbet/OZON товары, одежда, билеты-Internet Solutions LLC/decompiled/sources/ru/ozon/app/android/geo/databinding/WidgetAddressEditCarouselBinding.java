package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class WidgetAddressEditCarouselBinding implements a {

    @NonNull
    public final VerticalAtomsLayout atomsLayoutVAL;

    @NonNull
    public final SingleAtom moreOptionsBtn;

    @NonNull
    public final RecyclerView optionsRv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAddressEditCarouselBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull SingleAtom singleAtom, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.atomsLayoutVAL = verticalAtomsLayout;
        this.moreOptionsBtn = singleAtom;
        this.optionsRv = recyclerView;
    }

    @NonNull
    public static WidgetAddressEditCarouselBinding bind(@NonNull View view) {
        int i11 = R$id.atomsLayoutVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.moreOptionsBtn;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.optionsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    return new WidgetAddressEditCarouselBinding((LinearLayout) view, verticalAtomsLayout, singleAtom, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
