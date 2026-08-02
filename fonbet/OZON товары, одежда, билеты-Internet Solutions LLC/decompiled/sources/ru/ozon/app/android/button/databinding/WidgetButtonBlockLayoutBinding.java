package ru.ozon.app.android.button.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.button.R$layout;

/* loaded from: classes11.dex */
public final class WidgetButtonBlockLayoutBinding implements a {

    @NonNull
    public final RecyclerView buttonsRv;

    @NonNull
    private final RecyclerView rootView;

    private WidgetButtonBlockLayoutBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.buttonsRv = recyclerView2;
    }

    @NonNull
    public static WidgetButtonBlockLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetButtonBlockLayoutBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static WidgetButtonBlockLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_button_block_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
