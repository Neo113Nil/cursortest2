package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes2.dex */
public final class WidgetProfileHeaderBinding implements a {

    @NonNull
    public final Guideline endGuideline;

    @NonNull
    public final View leftClickArea;

    @NonNull
    public final TextAtomV2View leftCountBlockNumber;

    @NonNull
    public final TextAtomV2View leftCountBlockTitle;

    @NonNull
    public final View middleClickArea;

    @NonNull
    public final TextAtomV2View middleCountBlockNumber;

    @NonNull
    public final TextAtomV2View middleCountBlockTitle;

    @NonNull
    public final ConstraintLayout profileHeader;

    @NonNull
    public final IconView profileIcon;

    @NonNull
    public final View rightClickArea;

    @NonNull
    public final TextAtomV2View rightCountBlockNumber;

    @NonNull
    public final TextAtomV2View rightCountBlockTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconButtonV3View settingsBtn;

    @NonNull
    public final IconButtonV3View shareBtn;

    @NonNull
    public final ButtonV3View subscribeButton;

    private WidgetProfileHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull View view2, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4, @NonNull ConstraintLayout constraintLayout2, @NonNull IconView iconView, @NonNull View view3, @NonNull TextAtomV2View textAtomV2View5, @NonNull TextAtomV2View textAtomV2View6, @NonNull IconButtonV3View iconButtonV3View, @NonNull IconButtonV3View iconButtonV3View2, @NonNull ButtonV3View buttonV3View) {
        this.rootView = constraintLayout;
        this.endGuideline = guideline;
        this.leftClickArea = view;
        this.leftCountBlockNumber = textAtomV2View;
        this.leftCountBlockTitle = textAtomV2View2;
        this.middleClickArea = view2;
        this.middleCountBlockNumber = textAtomV2View3;
        this.middleCountBlockTitle = textAtomV2View4;
        this.profileHeader = constraintLayout2;
        this.profileIcon = iconView;
        this.rightClickArea = view3;
        this.rightCountBlockNumber = textAtomV2View5;
        this.rightCountBlockTitle = textAtomV2View6;
        this.settingsBtn = iconButtonV3View;
        this.shareBtn = iconButtonV3View2;
        this.subscribeButton = buttonV3View;
    }

    @NonNull
    public static WidgetProfileHeaderBinding bind(@NonNull View view) {
        View d11;
        View d12;
        View d13;
        int i11 = R$id.endGuideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null && (d11 = C2548q.d((i11 = R$id.leftClickArea), view)) != null) {
            i11 = R$id.leftCountBlockNumber;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.leftCountBlockTitle;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null && (d12 = C2548q.d((i11 = R$id.middleClickArea), view)) != null) {
                    i11 = R$id.middleCountBlockNumber;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        i11 = R$id.middleCountBlockTitle;
                        TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View4 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.profileIcon;
                            IconView iconView = (IconView) C2548q.d(i11, view);
                            if (iconView != null && (d13 = C2548q.d((i11 = R$id.rightClickArea), view)) != null) {
                                i11 = R$id.rightCountBlockNumber;
                                TextAtomV2View textAtomV2View5 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View5 != null) {
                                    i11 = R$id.rightCountBlockTitle;
                                    TextAtomV2View textAtomV2View6 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View6 != null) {
                                        i11 = R$id.settingsBtn;
                                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                                        if (iconButtonV3View != null) {
                                            i11 = R$id.shareBtn;
                                            IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                                            if (iconButtonV3View2 != null) {
                                                i11 = R$id.subscribeButton;
                                                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                                                if (buttonV3View != null) {
                                                    return new WidgetProfileHeaderBinding(constraintLayout, guideline, d11, textAtomV2View, textAtomV2View2, d12, textAtomV2View3, textAtomV2View4, constraintLayout, iconView, d13, textAtomV2View5, textAtomV2View6, iconButtonV3View, iconButtonV3View2, buttonV3View);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
