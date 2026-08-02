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
public final class WidgetRichContentNumberListItemBinding implements a {

    @NonNull
    public final TextAtomV2View listNumberTAV;

    @NonNull
    public final TextAtomV2View listTextTAV;

    @NonNull
    public final TextAtomV2View listTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetRichContentNumberListItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.listNumberTAV = textAtomV2View;
        this.listTextTAV = textAtomV2View2;
        this.listTitleTAV = textAtomV2View3;
    }

    @NonNull
    public static WidgetRichContentNumberListItemBinding bind(@NonNull View view) {
        int i11 = R$id.listNumberTAV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.listTextTAV;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.listTitleTAV;
                TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View3 != null) {
                    return new WidgetRichContentNumberListItemBinding((ConstraintLayout) view, textAtomV2View, textAtomV2View2, textAtomV2View3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetRichContentNumberListItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_rich_content_number_list_item, viewGroup, false);
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
