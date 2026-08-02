package ru.ozon.app.android.returns.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.ui.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class OpenCloudWidgetBinding implements a {

    @NonNull
    public final IconView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View textTav;

    private OpenCloudWidgetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.iconIv = iconView;
        this.textTav = textAtomV2View;
    }

    @NonNull
    public static OpenCloudWidgetBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.textTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new OpenCloudWidgetBinding((ConstraintLayout) view, iconView, textAtomV2View);
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
