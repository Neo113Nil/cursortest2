package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetLegalDocsViewOrderStatusBinding implements a {

    @NonNull
    public final TextAtomV2View orderStateTAV;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView stateDescriptionTV;

    @NonNull
    public final ImageView stateIconIV;

    private WidgetLegalDocsViewOrderStatusBinding(@NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.rootView = view;
        this.orderStateTAV = textAtomV2View;
        this.stateDescriptionTV = textView;
        this.stateIconIV = imageView;
    }

    @NonNull
    public static WidgetLegalDocsViewOrderStatusBinding bind(@NonNull View view) {
        int i11 = R$id.orderStateTAV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.stateDescriptionTV;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.stateIconIV;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    return new WidgetLegalDocsViewOrderStatusBinding(view, textAtomV2View, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetLegalDocsViewOrderStatusBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_legal_docs_view_order_status, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
