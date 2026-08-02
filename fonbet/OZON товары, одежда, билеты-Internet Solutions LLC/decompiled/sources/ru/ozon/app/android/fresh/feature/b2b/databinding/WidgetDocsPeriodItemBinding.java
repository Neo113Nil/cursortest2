package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDocsPeriodItemBinding implements a {

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomV2View title;

    private WidgetDocsPeriodItemBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.separator = view;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetDocsPeriodItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
            i11 = R$id.title;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetDocsPeriodItemBinding((LinearLayout) view, recyclerView, d11, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetDocsPeriodItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_docs_period_item, viewGroup, false);
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
