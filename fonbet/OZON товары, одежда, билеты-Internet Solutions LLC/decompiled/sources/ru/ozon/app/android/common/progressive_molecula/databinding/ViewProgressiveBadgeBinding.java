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
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class ViewProgressiveBadgeBinding implements a {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final View progress;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomV2View text;

    private ViewProgressiveBadgeBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull View view2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = view;
        this.container = constraintLayout;
        this.progress = view2;
        this.text = textAtomV2View;
    }

    @NonNull
    public static ViewProgressiveBadgeBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null && (d11 = C2548q.d((i11 = R$id.progress), view)) != null) {
            i11 = R$id.text;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new ViewProgressiveBadgeBinding(view, constraintLayout, d11, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewProgressiveBadgeBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_progressive_badge, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
