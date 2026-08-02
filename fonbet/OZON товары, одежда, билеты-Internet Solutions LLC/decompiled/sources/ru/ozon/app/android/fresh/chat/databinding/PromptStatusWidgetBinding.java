package ru.ozon.app.android.fresh.chat.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.chat.R$id;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class PromptStatusWidgetBinding implements a {

    @NonNull
    public final IconView iconView;

    @NonNull
    public final IconButtonV3View refreshButton;

    @NonNull
    public final ConstraintLayout rootContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ShimmerFrameLayout shimmerView;

    @NonNull
    public final TextAtomV2View titleView;

    private PromptStatusWidgetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull IconButtonV3View iconButtonV3View, @NonNull ConstraintLayout constraintLayout2, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.iconView = iconView;
        this.refreshButton = iconButtonV3View;
        this.rootContainer = constraintLayout2;
        this.shimmerView = shimmerFrameLayout;
        this.titleView = textAtomV2View;
    }

    @NonNull
    public static PromptStatusWidgetBinding bind(@NonNull View view) {
        int i11 = R$id.iconView;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.refreshButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.shimmerView;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(i11, view);
                if (shimmerFrameLayout != null) {
                    i11 = R$id.titleView;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new PromptStatusWidgetBinding(constraintLayout, iconView, iconButtonV3View, constraintLayout, shimmerFrameLayout, textAtomV2View);
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
