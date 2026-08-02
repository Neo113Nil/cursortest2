package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetDeleteAccountDescriptionBinding implements a {

    @NonNull
    public final SingleAtom annotationSA;

    @NonNull
    public final RecyclerView conditionRV;

    @NonNull
    public final TextInputEditText reasonEt;

    @NonNull
    public final TextInputLayout reasonTil;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SingleAtom submitSA;

    @NonNull
    public final TextAtomView titleConditionTAV;

    @NonNull
    public final TextAtomView titleReasonTAV;

    private WidgetDeleteAccountDescriptionBinding(@NonNull LinearLayout linearLayout, @NonNull SingleAtom singleAtom, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull SingleAtom singleAtom2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.annotationSA = singleAtom;
        this.conditionRV = recyclerView;
        this.reasonEt = textInputEditText;
        this.reasonTil = textInputLayout;
        this.submitSA = singleAtom2;
        this.titleConditionTAV = textAtomView;
        this.titleReasonTAV = textAtomView2;
    }

    @NonNull
    public static WidgetDeleteAccountDescriptionBinding bind(@NonNull View view) {
        int i11 = R$id.annotationSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.conditionRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.reasonEt;
                TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
                if (textInputEditText != null) {
                    i11 = R$id.reasonTil;
                    TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                    if (textInputLayout != null) {
                        i11 = R$id.submitSA;
                        SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                        if (singleAtom2 != null) {
                            i11 = R$id.titleConditionTAV;
                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView != null) {
                                i11 = R$id.titleReasonTAV;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    return new WidgetDeleteAccountDescriptionBinding((LinearLayout) view, singleAtom, recyclerView, textInputEditText, textInputLayout, singleAtom2, textAtomView, textAtomView2);
                                }
                            }
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
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
