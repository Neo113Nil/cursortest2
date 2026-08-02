package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetNewQuestionFormBinding implements a {

    @NonNull
    public final SingleAtom anonymousSa;

    @NonNull
    public final ConstraintLayout contentFl;

    @NonNull
    public final Barrier headerB;

    @NonNull
    public final TextInputEditText inputEt;

    @NonNull
    public final TextInputLayout inputMtil;

    @NonNull
    public final SingleAtom policyRulesSa;

    @NonNull
    public final ImageView productIv;

    @NonNull
    public final TextAtomV2View productTav;

    @NonNull
    public final ContentLoadingProgressBar progressPb;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final Barrier secondHeaderB;

    @NonNull
    public final Group secondHeaderGroup;

    @NonNull
    public final ImageView secondHeaderProductIv;

    @NonNull
    public final TextAtomV2View secondHeaderProductTav;

    @NonNull
    public final View separatorV;

    @NonNull
    public final SingleAtom submitSa;

    private WidgetNewQuestionFormBinding(@NonNull NestedScrollView nestedScrollView, @NonNull SingleAtom singleAtom, @NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull SingleAtom singleAtom2, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View, @NonNull ContentLoadingProgressBar contentLoadingProgressBar, @NonNull Barrier barrier2, @NonNull Group group, @NonNull ImageView imageView2, @NonNull TextAtomV2View textAtomV2View2, @NonNull View view, @NonNull SingleAtom singleAtom3) {
        this.rootView = nestedScrollView;
        this.anonymousSa = singleAtom;
        this.contentFl = constraintLayout;
        this.headerB = barrier;
        this.inputEt = textInputEditText;
        this.inputMtil = textInputLayout;
        this.policyRulesSa = singleAtom2;
        this.productIv = imageView;
        this.productTav = textAtomV2View;
        this.progressPb = contentLoadingProgressBar;
        this.secondHeaderB = barrier2;
        this.secondHeaderGroup = group;
        this.secondHeaderProductIv = imageView2;
        this.secondHeaderProductTav = textAtomV2View2;
        this.separatorV = view;
        this.submitSa = singleAtom3;
    }

    @NonNull
    public static WidgetNewQuestionFormBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.anonymousSa;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.contentFl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.headerB;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.inputEt;
                    TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
                    if (textInputEditText != null) {
                        i11 = R$id.inputMtil;
                        TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                        if (textInputLayout != null) {
                            i11 = R$id.policyRulesSa;
                            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                            if (singleAtom2 != null) {
                                i11 = R$id.productIv;
                                ImageView imageView = (ImageView) C2548q.d(i11, view);
                                if (imageView != null) {
                                    i11 = R$id.productTav;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View != null) {
                                        i11 = R$id.progressPb;
                                        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) C2548q.d(i11, view);
                                        if (contentLoadingProgressBar != null) {
                                            i11 = R$id.secondHeaderB;
                                            Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                            if (barrier2 != null) {
                                                i11 = R$id.secondHeaderGroup;
                                                Group group = (Group) C2548q.d(i11, view);
                                                if (group != null) {
                                                    i11 = R$id.secondHeaderProductIv;
                                                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                                    if (imageView2 != null) {
                                                        i11 = R$id.secondHeaderProductTav;
                                                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                                        if (textAtomV2View2 != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                                                            i11 = R$id.submitSa;
                                                            SingleAtom singleAtom3 = (SingleAtom) C2548q.d(i11, view);
                                                            if (singleAtom3 != null) {
                                                                return new WidgetNewQuestionFormBinding((NestedScrollView) view, singleAtom, constraintLayout, barrier, textInputEditText, textInputLayout, singleAtom2, imageView, textAtomV2View, contentLoadingProgressBar, barrier2, group, imageView2, textAtomV2View2, d11, singleAtom3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public NestedScrollView getConstraintLayout() {
        return this.rootView;
    }
}
