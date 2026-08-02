package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;

/* loaded from: classes3.dex */
public final class FinVerticalRowViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final NoScrollRecycler verticalRowRecycler;

    private FinVerticalRowViewBinding(@NonNull View view, @NonNull NoScrollRecycler noScrollRecycler) {
        this.rootView = view;
        this.verticalRowRecycler = noScrollRecycler;
    }

    @NonNull
    public static FinVerticalRowViewBinding bind(@NonNull View view) {
        NoScrollRecycler noScrollRecycler = (NoScrollRecycler) C2548q.d(R.id.vertical_row_recycler, view);
        if (noScrollRecycler != null) {
            return new FinVerticalRowViewBinding(view, noScrollRecycler);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.vertical_row_recycler)));
    }

    @NonNull
    public static FinVerticalRowViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_vertical_row_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
