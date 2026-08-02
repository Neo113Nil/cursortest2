package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cabinet.R$id;
import ru.ozon.app.android.cabinet.R$layout;

/* loaded from: classes11.dex */
public final class SelectGenderBottomSheetDialogBinding implements a {

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final TextView genderFemaleTv;

    @NonNull
    public final TextView genderMaleTv;

    @NonNull
    public final TextView genderTitleTv;

    @NonNull
    private final LinearLayout rootView;

    private SelectGenderBottomSheetDialogBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.cancelTv = textView;
        this.genderFemaleTv = textView2;
        this.genderMaleTv = textView3;
        this.genderTitleTv = textView4;
    }

    @NonNull
    public static SelectGenderBottomSheetDialogBinding bind(@NonNull View view) {
        int i11 = R$id.cancelTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.genderFemaleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.genderMaleTv;
                TextView textView3 = (TextView) C2548q.d(i11, view);
                if (textView3 != null) {
                    i11 = R$id.genderTitleTv;
                    TextView textView4 = (TextView) C2548q.d(i11, view);
                    if (textView4 != null) {
                        return new SelectGenderBottomSheetDialogBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SelectGenderBottomSheetDialogBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.select_gender_bottom_sheet_dialog, viewGroup, false);
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
