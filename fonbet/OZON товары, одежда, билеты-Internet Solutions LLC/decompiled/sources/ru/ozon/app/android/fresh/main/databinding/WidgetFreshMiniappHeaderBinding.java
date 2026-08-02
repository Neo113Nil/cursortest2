package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetFreshMiniappHeaderBinding implements a {

    @NonNull
    public final IconView addressDownIcon;

    @NonNull
    public final TextAtomV2View addressTitle;

    @NonNull
    public final View dotView;

    @NonNull
    public final ConstraintLayout miniappHeaderRootContainer;

    @NonNull
    public final IconView miniappIcon;

    @NonNull
    public final TextAtomV2View miniappTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconView timeDeliveryIcon;

    @NonNull
    public final TextAtomV2View timeDeliveryTitle;

    private WidgetFreshMiniappHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull IconView iconView2, @NonNull TextAtomV2View textAtomV2View2, @NonNull IconView iconView3, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.addressDownIcon = iconView;
        this.addressTitle = textAtomV2View;
        this.dotView = view;
        this.miniappHeaderRootContainer = constraintLayout2;
        this.miniappIcon = iconView2;
        this.miniappTitle = textAtomV2View2;
        this.timeDeliveryIcon = iconView3;
        this.timeDeliveryTitle = textAtomV2View3;
    }

    @NonNull
    public static WidgetFreshMiniappHeaderBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.addressDownIcon;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.addressTitle;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.dotView), view)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.miniappIcon;
                IconView iconView2 = (IconView) C2548q.d(i11, view);
                if (iconView2 != null) {
                    i11 = R$id.miniappTitle;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.timeDeliveryIcon;
                        IconView iconView3 = (IconView) C2548q.d(i11, view);
                        if (iconView3 != null) {
                            i11 = R$id.timeDeliveryTitle;
                            TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View3 != null) {
                                return new WidgetFreshMiniappHeaderBinding(constraintLayout, iconView, textAtomV2View, d11, constraintLayout, iconView2, textAtomV2View2, iconView3, textAtomV2View3);
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
