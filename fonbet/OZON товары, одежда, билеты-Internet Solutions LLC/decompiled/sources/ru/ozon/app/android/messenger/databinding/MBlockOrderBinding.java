package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.utils.view.LabeledIconView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MBlockOrderBinding implements a {

    @NonNull
    public final LabeledIconView orderLabeledIcon;

    @NonNull
    public final ProductMediaView orderProductMedia;

    @NonNull
    public final ConstraintLayout orderRoot;

    @NonNull
    public final TextView orderSendTime;

    @NonNull
    public final AppCompatImageView orderStatus;

    @NonNull
    public final TextAtomV2View orderSubtitle;

    @NonNull
    public final TextAtomV2View orderTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private MBlockOrderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LabeledIconView labeledIconView, @NonNull ProductMediaView productMediaView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.orderLabeledIcon = labeledIconView;
        this.orderProductMedia = productMediaView;
        this.orderRoot = constraintLayout2;
        this.orderSendTime = textView;
        this.orderStatus = appCompatImageView;
        this.orderSubtitle = textAtomV2View;
        this.orderTitle = textAtomV2View2;
    }

    @NonNull
    public static MBlockOrderBinding bind(@NonNull View view) {
        int i11 = R$id.orderLabeledIcon;
        LabeledIconView labeledIconView = (LabeledIconView) C2548q.d(i11, view);
        if (labeledIconView != null) {
            i11 = R$id.orderProductMedia;
            ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
            if (productMediaView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.orderSendTime;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.orderStatus;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.orderSubtitle;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.orderTitle;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new MBlockOrderBinding(constraintLayout, labeledIconView, productMediaView, constraintLayout, textView, appCompatImageView, textAtomV2View, textAtomV2View2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockOrderBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_order, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
