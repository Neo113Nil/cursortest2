package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MRateMessengerBlockBinding implements a {

    @NonNull
    public final LinearLayout contentLl;

    @NonNull
    public final TextAtomView descriptionTextAtom;

    @NonNull
    public final TextInputEditText messageEditText;

    @NonNull
    public final TextInputLayout messageTextInputLayout;

    @NonNull
    public final TextAtomView rateQuestionTextAtom;

    @NonNull
    public final LabelRatingView ratingBar;

    @NonNull
    public final RecyclerView reasonsRecyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomView titleTextAtom;

    private MRateMessengerBlockBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextAtomView textAtomView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextAtomView textAtomView2, @NonNull LabelRatingView labelRatingView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView3) {
        this.rootView = linearLayout;
        this.contentLl = linearLayout2;
        this.descriptionTextAtom = textAtomView;
        this.messageEditText = textInputEditText;
        this.messageTextInputLayout = textInputLayout;
        this.rateQuestionTextAtom = textAtomView2;
        this.ratingBar = labelRatingView;
        this.reasonsRecyclerView = recyclerView;
        this.titleTextAtom = textAtomView3;
    }

    @NonNull
    public static MRateMessengerBlockBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.descriptionTextAtom;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.messageEditText;
            TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
            if (textInputEditText != null) {
                i11 = R$id.messageTextInputLayout;
                TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                if (textInputLayout != null) {
                    i11 = R$id.rateQuestionTextAtom;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.ratingBar;
                        LabelRatingView labelRatingView = (LabelRatingView) C2548q.d(i11, view);
                        if (labelRatingView != null) {
                            i11 = R$id.reasonsRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView != null) {
                                i11 = R$id.titleTextAtom;
                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView3 != null) {
                                    return new MRateMessengerBlockBinding(linearLayout, linearLayout, textAtomView, textInputEditText, textInputLayout, textAtomView2, labelRatingView, recyclerView, textAtomView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MRateMessengerBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_rate_messenger_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
