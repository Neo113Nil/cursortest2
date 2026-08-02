package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color.AspectColorVariantView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonCharateristicsGroupColumnItemBinding implements a {

    @NonNull
    public final SingleAtom atomSA;

    @NonNull
    public final AspectColorVariantView colorACVV;

    @NonNull
    public final LinearLayout columnLL;

    @NonNull
    public final ImageView imageIV;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView textTV;

    private PdpWidgetComparisonCharateristicsGroupColumnItemBinding(@NonNull LinearLayout linearLayout, @NonNull SingleAtom singleAtom, @NonNull AspectColorVariantView aspectColorVariantView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.atomSA = singleAtom;
        this.colorACVV = aspectColorVariantView;
        this.columnLL = linearLayout2;
        this.imageIV = imageView;
        this.textTV = textView;
    }

    @NonNull
    public static PdpWidgetComparisonCharateristicsGroupColumnItemBinding bind(@NonNull View view) {
        int i11 = R$id.atomSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.colorACVV;
            AspectColorVariantView aspectColorVariantView = (AspectColorVariantView) C2548q.d(i11, view);
            if (aspectColorVariantView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R$id.imageIV;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.textTV;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new PdpWidgetComparisonCharateristicsGroupColumnItemBinding(linearLayout, singleAtom, aspectColorVariantView, linearLayout, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
