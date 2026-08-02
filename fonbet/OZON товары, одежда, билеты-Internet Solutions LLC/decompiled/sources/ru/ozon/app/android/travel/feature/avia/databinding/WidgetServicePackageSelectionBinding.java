package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes8.dex */
public final class WidgetServicePackageSelectionBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout servicePackageSelectionCellsVAL;

    @NonNull
    public final TextAtomV2View servicePackageSelectionDescriptionTAV;

    @NonNull
    public final FlexboxLayout servicePackageSelectionTabsFL;

    @NonNull
    public final TextAtomV2View servicePackageSelectionTitleTAV;

    private WidgetServicePackageSelectionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull FlexboxLayout flexboxLayout, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.servicePackageSelectionCellsVAL = verticalAtomsLayout;
        this.servicePackageSelectionDescriptionTAV = textAtomV2View;
        this.servicePackageSelectionTabsFL = flexboxLayout;
        this.servicePackageSelectionTitleTAV = textAtomV2View2;
    }

    @NonNull
    public static WidgetServicePackageSelectionBinding bind(@NonNull View view) {
        int i11 = R$id.servicePackageSelectionCellsVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.servicePackageSelectionDescriptionTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.servicePackageSelectionTabsFL;
                FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
                if (flexboxLayout != null) {
                    i11 = R$id.servicePackageSelectionTitleTAV;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetServicePackageSelectionBinding((ConstraintLayout) view, verticalAtomsLayout, textAtomV2View, flexboxLayout, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
