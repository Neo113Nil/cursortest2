package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetRichContentBulletListItemBinding implements a {

    @NonNull
    public final View listBulletV;

    @NonNull
    public final TextAtomV2View listTextTAV;

    @NonNull
    public final TextAtomV2View listTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetRichContentBulletListItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.listBulletV = view;
        this.listTextTAV = textAtomV2View;
        this.listTitleTAV = textAtomV2View2;
    }

    @NonNull
    public static WidgetRichContentBulletListItemBinding bind(@NonNull View view) {
        int i11 = R$id.listBulletV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.listTextTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.listTitleTAV;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new WidgetRichContentBulletListItemBinding((ConstraintLayout) view, d11, textAtomV2View, textAtomV2View2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetRichContentBulletListItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_rich_content_bullet_list_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
