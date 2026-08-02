package ru.ozon.app.android.debugmenu.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.debugmenu.R$id;
import ru.ozon.app.android.debugmenu.R$layout;

/* loaded from: classes11.dex */
public final class DataLayerLayoutBinding implements a {

    @NonNull
    public final RecyclerView data;

    @NonNull
    public final TextView dataLayerTitleTv;

    @NonNull
    private final LinearLayout rootView;

    private DataLayerLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.data = recyclerView;
        this.dataLayerTitleTv = textView;
    }

    @NonNull
    public static DataLayerLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.data;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.dataLayerTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new DataLayerLayoutBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static DataLayerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DataLayerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.data_layer_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
