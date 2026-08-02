package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.geo.R$id;

/* loaded from: classes12.dex */
public final class WidgetAddressEditDetailV2Binding implements a {

    @NonNull
    public final RecyclerView addressRv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAddressEditDetailV2Binding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.addressRv = recyclerView;
    }

    @NonNull
    public static WidgetAddressEditDetailV2Binding bind(@NonNull View view) {
        int i11 = R$id.addressRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetAddressEditDetailV2Binding((LinearLayout) view, recyclerView);
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
