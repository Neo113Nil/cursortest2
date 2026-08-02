package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class HeaderViewBinding implements a {

    @NonNull
    public final TextView headerViewTitle;

    @NonNull
    private final View rootView;

    private HeaderViewBinding(@NonNull View view, @NonNull TextView textView) {
        this.rootView = view;
        this.headerViewTitle = textView;
    }

    @NonNull
    public static HeaderViewBinding bind(@NonNull View view) {
        TextView textView = (TextView) C2548q.d(R.id.header_view_title, view);
        if (textView != null) {
            return new HeaderViewBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.header_view_title)));
    }

    @NonNull
    public static HeaderViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.header_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
