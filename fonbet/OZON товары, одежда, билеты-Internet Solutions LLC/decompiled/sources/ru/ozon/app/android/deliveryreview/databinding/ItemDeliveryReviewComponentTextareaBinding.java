package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea.view.BulletedTextListView;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentTextareaBinding implements a {

    @NonNull
    public final TextAtomV2View headerTV;

    @NonNull
    public final BulletedTextListView informersBTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextInputEditText textareaEt;

    @NonNull
    public final MobilizationTextInputLayout textareaTil;

    @NonNull
    public final TextView titleTv;

    private ItemDeliveryReviewComponentTextareaBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull BulletedTextListView bulletedTextListView, @NonNull TextInputEditText textInputEditText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.headerTV = textAtomV2View;
        this.informersBTv = bulletedTextListView;
        this.textareaEt = textInputEditText;
        this.textareaTil = mobilizationTextInputLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentTextareaBinding bind(@NonNull View view) {
        int i11 = R$id.headerTV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.informersBTv;
            BulletedTextListView bulletedTextListView = (BulletedTextListView) C2548q.d(i11, view);
            if (bulletedTextListView != null) {
                i11 = R$id.textareaEt;
                TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
                if (textInputEditText != null) {
                    i11 = R$id.textareaTil;
                    MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                    if (mobilizationTextInputLayout != null) {
                        i11 = R$id.titleTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new ItemDeliveryReviewComponentTextareaBinding((LinearLayout) view, textAtomV2View, bulletedTextListView, textInputEditText, mobilizationTextInputLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentTextareaBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_textarea, viewGroup, false);
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
