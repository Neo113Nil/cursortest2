package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.android.messenger.blocks.input.views.PastePlainTextInputEditText;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes12.dex */
public final class MFragmentBottomSheetRateOperatorBinding implements a {

    @NonNull
    public final PastePlainTextInputEditText rateCommentMsgEt;

    @NonNull
    public final TextInputLayout rateCommentMsgLayout;

    @NonNull
    public final TextView rateDescriptionTv;

    @NonNull
    public final MBlockAlertBinding rateErrorCl;

    @NonNull
    public final LabelRatingView rateOperatorRatingVrb;

    @NonNull
    public final NestedScrollView rateOperatorSv;

    @NonNull
    public final TextView rateOperatorTitleTv;

    @NonNull
    public final RecyclerView rateReasonsRv;

    @NonNull
    public final LargeButtonView rateSendButton;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View sheetHandle;

    private MFragmentBottomSheetRateOperatorBinding(@NonNull FrameLayout frameLayout, @NonNull PastePlainTextInputEditText pastePlainTextInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull MBlockAlertBinding mBlockAlertBinding, @NonNull LabelRatingView labelRatingView, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull LargeButtonView largeButtonView, @NonNull View view) {
        this.rootView = frameLayout;
        this.rateCommentMsgEt = pastePlainTextInputEditText;
        this.rateCommentMsgLayout = textInputLayout;
        this.rateDescriptionTv = textView;
        this.rateErrorCl = mBlockAlertBinding;
        this.rateOperatorRatingVrb = labelRatingView;
        this.rateOperatorSv = nestedScrollView;
        this.rateOperatorTitleTv = textView2;
        this.rateReasonsRv = recyclerView;
        this.rateSendButton = largeButtonView;
        this.sheetHandle = view;
    }

    @NonNull
    public static MFragmentBottomSheetRateOperatorBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.rate_comment_msg_et;
        PastePlainTextInputEditText pastePlainTextInputEditText = (PastePlainTextInputEditText) C2548q.d(i11, view);
        if (pastePlainTextInputEditText != null) {
            i11 = R$id.rate_comment_msg_layout;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                i11 = R$id.rateDescriptionTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null && (d11 = C2548q.d((i11 = R$id.rateErrorCl), view)) != null) {
                    MBlockAlertBinding bind = MBlockAlertBinding.bind(d11);
                    i11 = R$id.rateOperatorRatingVrb;
                    LabelRatingView labelRatingView = (LabelRatingView) C2548q.d(i11, view);
                    if (labelRatingView != null) {
                        i11 = R$id.rateOperatorSv;
                        NestedScrollView nestedScrollView = (NestedScrollView) C2548q.d(i11, view);
                        if (nestedScrollView != null) {
                            i11 = R$id.rateOperatorTitleTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.rateReasonsRv;
                                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView != null) {
                                    i11 = R$id.rateSendButton;
                                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                                    if (largeButtonView != null && (d12 = C2548q.d((i11 = R$id.sheetHandle), view)) != null) {
                                        return new MFragmentBottomSheetRateOperatorBinding((FrameLayout) view, pastePlainTextInputEditText, textInputLayout, textView, bind, labelRatingView, nestedScrollView, textView2, recyclerView, largeButtonView, d12);
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

    @NonNull
    public static MFragmentBottomSheetRateOperatorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_bottom_sheet_rate_operator, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
