package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class ItemDeleteAccountDescriptionConditionBinding implements a {

    @NonNull
    public final SingleAtom actionSA;

    @NonNull
    public final SingleAtom descriptionSA;

    @NonNull
    private final LinearLayout rootView;

    private ItemDeleteAccountDescriptionConditionBinding(@NonNull LinearLayout linearLayout, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = linearLayout;
        this.actionSA = singleAtom;
        this.descriptionSA = singleAtom2;
    }

    @NonNull
    public static ItemDeleteAccountDescriptionConditionBinding bind(@NonNull View view) {
        int i11 = R$id.actionSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.descriptionSA;
            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom2 != null) {
                return new ItemDeleteAccountDescriptionConditionBinding((LinearLayout) view, singleAtom, singleAtom2);
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
