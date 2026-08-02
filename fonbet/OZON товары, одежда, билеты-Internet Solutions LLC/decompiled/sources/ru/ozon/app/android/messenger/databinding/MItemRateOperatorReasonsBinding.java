package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.controls.tag.TagButtonView;

/* loaded from: classes12.dex */
public final class MItemRateOperatorReasonsBinding implements a {

    @NonNull
    public final TagButtonView rateReasonButton;

    @NonNull
    private final TagButtonView rootView;

    private MItemRateOperatorReasonsBinding(@NonNull TagButtonView tagButtonView, @NonNull TagButtonView tagButtonView2) {
        this.rootView = tagButtonView;
        this.rateReasonButton = tagButtonView2;
    }

    @NonNull
    public static MItemRateOperatorReasonsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TagButtonView tagButtonView = (TagButtonView) view;
        return new MItemRateOperatorReasonsBinding(tagButtonView, tagButtonView);
    }

    @NonNull
    public static MItemRateOperatorReasonsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_item_rate_operator_reasons, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TagButtonView getConstraintLayout() {
        return this.rootView;
    }
}
