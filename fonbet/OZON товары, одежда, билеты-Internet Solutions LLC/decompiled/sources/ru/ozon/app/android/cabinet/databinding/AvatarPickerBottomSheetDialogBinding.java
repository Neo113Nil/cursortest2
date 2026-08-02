package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cabinet.R$id;

/* loaded from: classes11.dex */
public final class AvatarPickerBottomSheetDialogBinding implements a {

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final View choosePhotoDivider;

    @NonNull
    public final TextView choosePhotoTv;

    @NonNull
    public final View removePhotoDivider;

    @NonNull
    public final TextView removePhotoTv;

    @NonNull
    private final LinearLayout rootView;

    private AvatarPickerBottomSheetDialogBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull View view2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.cancelTv = textView;
        this.choosePhotoDivider = view;
        this.choosePhotoTv = textView2;
        this.removePhotoDivider = view2;
        this.removePhotoTv = textView3;
    }

    @NonNull
    public static AvatarPickerBottomSheetDialogBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.cancelTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null && (d11 = C2548q.d((i11 = R$id.choosePhotoDivider), view)) != null) {
            i11 = R$id.choosePhotoTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null && (d12 = C2548q.d((i11 = R$id.removePhotoDivider), view)) != null) {
                i11 = R$id.removePhotoTv;
                TextView textView3 = (TextView) C2548q.d(i11, view);
                if (textView3 != null) {
                    return new AvatarPickerBottomSheetDialogBinding((LinearLayout) view, textView, d11, textView2, d12, textView3);
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
