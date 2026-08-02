package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetAddressEditDetailBinding implements a {

    @NonNull
    public final RecyclerView addressRv;

    @NonNull
    public final VerticalAtomsLayout addressVAL;

    @NonNull
    public final FrameAtomsLayout buttonFAL;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAddressEditDetailBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull FrameAtomsLayout frameAtomsLayout) {
        this.rootView = linearLayout;
        this.addressRv = recyclerView;
        this.addressVAL = verticalAtomsLayout;
        this.buttonFAL = frameAtomsLayout;
    }

    @NonNull
    public static WidgetAddressEditDetailBinding bind(@NonNull View view) {
        int i11 = R$id.addressRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.addressVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.buttonFAL;
                FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
                if (frameAtomsLayout != null) {
                    return new WidgetAddressEditDetailBinding((LinearLayout) view, recyclerView, verticalAtomsLayout, frameAtomsLayout);
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
