package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ru.ozon.app.android.atoms.R$id;

/* loaded from: classes11.dex */
public final class AtomCellToggleBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final SwitchMaterial toggleS;

    private AtomCellToggleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SwitchMaterial switchMaterial) {
        this.rootView = constraintLayout;
        this.subtitleTv = textView;
        this.titleTv = textView2;
        this.toggleS = switchMaterial;
    }

    @NonNull
    public static AtomCellToggleBinding bind(@NonNull View view) {
        int i11 = R$id.subtitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.titleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.toggleS;
                SwitchMaterial switchMaterial = (SwitchMaterial) C2548q.d(i11, view);
                if (switchMaterial != null) {
                    return new AtomCellToggleBinding((ConstraintLayout) view, textView, textView2, switchMaterial);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
