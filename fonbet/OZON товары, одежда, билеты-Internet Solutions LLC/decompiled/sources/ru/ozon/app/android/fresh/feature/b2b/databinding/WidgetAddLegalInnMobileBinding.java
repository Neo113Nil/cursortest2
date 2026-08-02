package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;

/* loaded from: classes12.dex */
public final class WidgetAddLegalInnMobileBinding implements a {

    @NonNull
    public final TextView errorTv;

    @NonNull
    public final RecyclerView legalsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SearchView searchSv;

    private WidgetAddLegalInnMobileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull SearchView searchView) {
        this.rootView = constraintLayout;
        this.errorTv = textView;
        this.legalsRv = recyclerView;
        this.searchSv = searchView;
    }

    @NonNull
    public static WidgetAddLegalInnMobileBinding bind(@NonNull View view) {
        int i11 = R$id.errorTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.legalsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.searchSv;
                SearchView searchView = (SearchView) C2548q.d(i11, view);
                if (searchView != null) {
                    return new WidgetAddLegalInnMobileBinding((ConstraintLayout) view, textView, recyclerView, searchView);
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
