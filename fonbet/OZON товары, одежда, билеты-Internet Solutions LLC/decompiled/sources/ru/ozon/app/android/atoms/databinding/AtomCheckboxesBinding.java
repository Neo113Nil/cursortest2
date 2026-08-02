package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class AtomCheckboxesBinding implements a {

    @NonNull
    public final Space contentEndSpace;

    @NonNull
    public final Space contentStartSpace;

    @NonNull
    public final Space contentTopSpace;

    @NonNull
    public final VerticalAtomsLayout itemsVAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    @NonNull
    public final TextView titleTv;

    private AtomCheckboxesBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull View view, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.contentEndSpace = space;
        this.contentStartSpace = space2;
        this.contentTopSpace = space3;
        this.itemsVAL = verticalAtomsLayout;
        this.separatorV = view;
        this.titleTv = textView;
    }

    @NonNull
    public static AtomCheckboxesBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.contentEndSpace;
        Space space = (Space) C2548q.d(i11, view);
        if (space != null) {
            i11 = R$id.contentStartSpace;
            Space space2 = (Space) C2548q.d(i11, view);
            if (space2 != null) {
                i11 = R$id.contentTopSpace;
                Space space3 = (Space) C2548q.d(i11, view);
                if (space3 != null) {
                    i11 = R$id.itemsVAL;
                    VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                    if (verticalAtomsLayout != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                        i11 = R$id.titleTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new AtomCheckboxesBinding((ConstraintLayout) view, space, space2, space3, verticalAtomsLayout, d11, textView);
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
