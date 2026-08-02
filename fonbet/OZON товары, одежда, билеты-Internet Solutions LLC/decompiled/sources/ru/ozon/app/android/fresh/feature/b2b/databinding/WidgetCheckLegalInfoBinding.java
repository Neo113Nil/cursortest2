package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetCheckLegalInfoBinding implements a {

    @NonNull
    public final BannerEdoCompactBinding bannerEdoCompact;

    @NonNull
    public final ButtonV3View checkLegalInfoBtn;

    @NonNull
    public final CellView checkLegalInfoCompanyCell;

    @NonNull
    public final TextAtomV2View checkLegalInfoKppDescription;

    @NonNull
    public final TextFieldCellView checkLegalInfoKppInputLayout;

    @NonNull
    public final TextAtomV2View checkLegalInfoKppTitle;

    @NonNull
    private final LinearLayout rootView;

    private WidgetCheckLegalInfoBinding(@NonNull LinearLayout linearLayout, @NonNull BannerEdoCompactBinding bannerEdoCompactBinding, @NonNull ButtonV3View buttonV3View, @NonNull CellView cellView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextFieldCellView textFieldCellView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.bannerEdoCompact = bannerEdoCompactBinding;
        this.checkLegalInfoBtn = buttonV3View;
        this.checkLegalInfoCompanyCell = cellView;
        this.checkLegalInfoKppDescription = textAtomV2View;
        this.checkLegalInfoKppInputLayout = textFieldCellView;
        this.checkLegalInfoKppTitle = textAtomV2View2;
    }

    @NonNull
    public static WidgetCheckLegalInfoBinding bind(@NonNull View view) {
        int i11 = R$id.bannerEdoCompact;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            BannerEdoCompactBinding bind = BannerEdoCompactBinding.bind(d11);
            i11 = R$id.checkLegalInfoBtn;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.checkLegalInfoCompanyCell;
                CellView cellView = (CellView) C2548q.d(i11, view);
                if (cellView != null) {
                    i11 = R$id.checkLegalInfoKppDescription;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.checkLegalInfoKppInputLayout;
                        TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
                        if (textFieldCellView != null) {
                            i11 = R$id.checkLegalInfoKppTitle;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new WidgetCheckLegalInfoBinding((LinearLayout) view, bind, buttonV3View, cellView, textAtomV2View, textFieldCellView, textAtomV2View2);
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
