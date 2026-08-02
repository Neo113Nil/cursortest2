package ru.ozon.app.android.common.progressive_molecula.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.progressive_molecula.R$id;
import ru.ozon.app.android.common.progressive_molecula.R$layout;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveBadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class ViewProgressiveTextBinding implements a {

    @NonNull
    public final ProgressiveBadgeView badge;

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final IconView icon;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomV2View text;

    private ViewProgressiveTextBinding(@NonNull View view, @NonNull ProgressiveBadgeView progressiveBadgeView, @NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = view;
        this.badge = progressiveBadgeView;
        this.container = constraintLayout;
        this.icon = iconView;
        this.text = textAtomV2View;
    }

    @NonNull
    public static ViewProgressiveTextBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        ProgressiveBadgeView progressiveBadgeView = (ProgressiveBadgeView) C2548q.d(i11, view);
        if (progressiveBadgeView != null) {
            i11 = R$id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.icon;
                IconView iconView = (IconView) C2548q.d(i11, view);
                if (iconView != null) {
                    i11 = R$id.text;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new ViewProgressiveTextBinding(view, progressiveBadgeView, constraintLayout, iconView, textAtomV2View);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewProgressiveTextBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_progressive_text, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
