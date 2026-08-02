package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.app.android.orderdetails.R$layout;

/* loaded from: classes13.dex */
public final class BottomSheetContactCourierBinding implements a {

    @NonNull
    public final LinearLayout bottomSheetContactCourier;

    @NonNull
    public final TextView contactCourierCancelTv;

    @NonNull
    public final View courierPhoneDivider;

    @NonNull
    public final TextView courierPhoneTv;

    @NonNull
    public final View descriptionDivider;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    private final LinearLayout rootView;

    private BottomSheetContactCourierBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull View view2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.bottomSheetContactCourier = linearLayout2;
        this.contactCourierCancelTv = textView;
        this.courierPhoneDivider = view;
        this.courierPhoneTv = textView2;
        this.descriptionDivider = view2;
        this.descriptionTv = textView3;
    }

    @NonNull
    public static BottomSheetContactCourierBinding bind(@NonNull View view) {
        View d11;
        View d12;
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.contactCourierCancelTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null && (d11 = C2548q.d((i11 = R$id.courierPhoneDivider), view)) != null) {
            i11 = R$id.courierPhoneTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null && (d12 = C2548q.d((i11 = R$id.descriptionDivider), view)) != null) {
                i11 = R$id.descriptionTv;
                TextView textView3 = (TextView) C2548q.d(i11, view);
                if (textView3 != null) {
                    return new BottomSheetContactCourierBinding(linearLayout, linearLayout, textView, d11, textView2, d12, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static BottomSheetContactCourierBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.bottom_sheet_contact_courier, viewGroup, false);
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
