package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetCompanyCardBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final ButtonView button;

    @NonNull
    public final CellView email;

    @NonNull
    public final UncontainedButtonView linkButton;

    @NonNull
    public final VerticalAtomsLayout options;

    @NonNull
    public final LinearLayout optionsBlock;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetCompanyCardBinding(@NonNull LinearLayout linearLayout, @NonNull BadgeView badgeView, @NonNull ButtonView buttonView, @NonNull CellView cellView, @NonNull UncontainedButtonView uncontainedButtonView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull LinearLayout linearLayout2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.badge = badgeView;
        this.button = buttonView;
        this.email = cellView;
        this.linkButton = uncontainedButtonView;
        this.options = verticalAtomsLayout;
        this.optionsBlock = linearLayout2;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetCompanyCardBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.button;
            ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
            if (buttonView != null) {
                i11 = R$id.email;
                CellView cellView = (CellView) C2548q.d(i11, view);
                if (cellView != null) {
                    i11 = R$id.linkButton;
                    UncontainedButtonView uncontainedButtonView = (UncontainedButtonView) C2548q.d(i11, view);
                    if (uncontainedButtonView != null) {
                        i11 = R$id.options;
                        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                        if (verticalAtomsLayout != null) {
                            i11 = R$id.optionsBlock;
                            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                            if (linearLayout != null) {
                                i11 = R$id.title;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    return new WidgetCompanyCardBinding((LinearLayout) view, badgeView, buttonView, cellView, uncontainedButtonView, verticalAtomsLayout, linearLayout, textAtomV2View);
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
