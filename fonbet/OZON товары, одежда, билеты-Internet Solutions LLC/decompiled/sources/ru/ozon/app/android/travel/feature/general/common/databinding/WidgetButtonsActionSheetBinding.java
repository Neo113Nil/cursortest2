package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes3.dex */
public final class WidgetButtonsActionSheetBinding implements a {

    @NonNull
    public final VerticalAtomsLayout buttonsActionSheetListLayout;

    @NonNull
    public final TextAtomView buttonsActionSheetSubtitleTextView;

    @NonNull
    public final TextAtomView buttonsActionSheetTitleTextView;

    @NonNull
    private final LinearLayout rootView;

    private WidgetButtonsActionSheetBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.buttonsActionSheetListLayout = verticalAtomsLayout;
        this.buttonsActionSheetSubtitleTextView = textAtomView;
        this.buttonsActionSheetTitleTextView = textAtomView2;
    }

    @NonNull
    public static WidgetButtonsActionSheetBinding bind(@NonNull View view) {
        int i11 = R$id.buttonsActionSheetListLayout;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.buttonsActionSheetSubtitleTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.buttonsActionSheetTitleTextView;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new WidgetButtonsActionSheetBinding((LinearLayout) view, verticalAtomsLayout, textAtomView, textAtomView2);
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
