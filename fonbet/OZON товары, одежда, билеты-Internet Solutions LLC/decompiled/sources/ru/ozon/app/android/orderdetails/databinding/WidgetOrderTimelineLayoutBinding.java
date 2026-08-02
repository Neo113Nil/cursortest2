package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes13.dex */
public final class WidgetOrderTimelineLayoutBinding implements a {

    @NonNull
    public final AppCompatTextView addressTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View statusDotV;

    @NonNull
    public final View statusLineV;

    @NonNull
    public final AppCompatTextView statusSubtitleTv;

    @NonNull
    public final TextAtomView statusTitleTv;

    private WidgetOrderTimelineLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull View view, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView2, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.addressTv = appCompatTextView;
        this.statusDotV = view;
        this.statusLineV = view2;
        this.statusSubtitleTv = appCompatTextView2;
        this.statusTitleTv = textAtomView;
    }

    @NonNull
    public static WidgetOrderTimelineLayoutBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.addressTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null && (d11 = C2548q.d((i11 = R$id.statusDotV), view)) != null && (d12 = C2548q.d((i11 = R$id.statusLineV), view)) != null) {
            i11 = R$id.statusSubtitleTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.statusTitleTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetOrderTimelineLayoutBinding((LinearLayout) view, appCompatTextView, d11, d12, appCompatTextView2, textAtomView);
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
