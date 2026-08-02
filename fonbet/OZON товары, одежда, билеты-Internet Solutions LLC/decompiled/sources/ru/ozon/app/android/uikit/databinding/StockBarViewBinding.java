package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.view.progress.OzProgressBar;

/* loaded from: classes7.dex */
public final class StockBarViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView stockBarText;

    @NonNull
    public final OzProgressBar stockProgressView;

    private StockBarViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull OzProgressBar ozProgressBar) {
        this.rootView = view;
        this.stockBarText = textView;
        this.stockProgressView = ozProgressBar;
    }

    @NonNull
    public static StockBarViewBinding bind(@NonNull View view) {
        int i11 = R$id.stockBarText;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.stockProgressView;
            OzProgressBar ozProgressBar = (OzProgressBar) C2548q.d(i11, view);
            if (ozProgressBar != null) {
                return new StockBarViewBinding(view, textView, ozProgressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static StockBarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.stock_bar_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
