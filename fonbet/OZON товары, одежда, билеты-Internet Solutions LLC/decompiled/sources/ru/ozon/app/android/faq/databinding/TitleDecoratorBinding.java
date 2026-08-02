package ru.ozon.app.android.faq.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.faq.R$id;
import ru.ozon.app.android.faq.R$layout;

/* loaded from: classes12.dex */
public final class TitleDecoratorBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private TitleDecoratorBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static TitleDecoratorBinding bind(@NonNull View view) {
        int i11 = R$id.titleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new TitleDecoratorBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static TitleDecoratorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.title_decorator, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
