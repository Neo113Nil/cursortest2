package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;

/* loaded from: classes12.dex */
public final class WidgetAddLegalInnMobileLegalItemBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetAddLegalInnMobileLegalItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetAddLegalInnMobileLegalItemBinding bind(@NonNull View view) {
        int i11 = R$id.titleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new WidgetAddLegalInnMobileLegalItemBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
