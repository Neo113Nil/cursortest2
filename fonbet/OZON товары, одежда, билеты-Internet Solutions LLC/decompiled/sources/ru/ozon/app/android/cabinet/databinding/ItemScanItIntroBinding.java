package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.cabinet.R$id;

/* loaded from: classes11.dex */
public final class ItemScanItIntroBinding implements a {

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final ButtonAtom firstButtonBa;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView scanItIntroIv;

    @NonNull
    public final ButtonAtom secondButtonBa;

    @NonNull
    public final TextView titleTv;

    private ItemScanItIntroBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ButtonAtom buttonAtom, @NonNull ImageView imageView, @NonNull ButtonAtom buttonAtom2, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.descriptionTv = textView;
        this.firstButtonBa = buttonAtom;
        this.scanItIntroIv = imageView;
        this.secondButtonBa = buttonAtom2;
        this.titleTv = textView2;
    }

    @NonNull
    public static ItemScanItIntroBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.firstButtonBa;
            ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
            if (buttonAtom != null) {
                i11 = R$id.scanItIntroIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.secondButtonBa;
                    ButtonAtom buttonAtom2 = (ButtonAtom) C2548q.d(i11, view);
                    if (buttonAtom2 != null) {
                        i11 = R$id.titleTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new ItemScanItIntroBinding((ConstraintLayout) view, textView, buttonAtom, imageView, buttonAtom2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
