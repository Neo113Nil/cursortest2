package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetReconciliationActsDeclinerBinding implements a {

    @NonNull
    public final SelectFileLayoutBinding clickableAreaAttachFile;

    @NonNull
    public final TextAtomV2View label;

    @NonNull
    public final TextAtomV2View policy;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ButtonV3View submitButton;

    @NonNull
    public final RecyclerView textFieldsRV;

    private WidgetReconciliationActsDeclinerBinding(@NonNull LinearLayout linearLayout, @NonNull SelectFileLayoutBinding selectFileLayoutBinding, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull ButtonV3View buttonV3View, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.clickableAreaAttachFile = selectFileLayoutBinding;
        this.label = textAtomV2View;
        this.policy = textAtomV2View2;
        this.submitButton = buttonV3View;
        this.textFieldsRV = recyclerView;
    }

    @NonNull
    public static WidgetReconciliationActsDeclinerBinding bind(@NonNull View view) {
        int i11 = R$id.clickableAreaAttachFile;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            SelectFileLayoutBinding bind = SelectFileLayoutBinding.bind(d11);
            i11 = R$id.label;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.policy;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.submitButton;
                    ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                    if (buttonV3View != null) {
                        i11 = R$id.textFieldsRV;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            return new WidgetReconciliationActsDeclinerBinding((LinearLayout) view, bind, textAtomV2View, textAtomV2View2, buttonV3View, recyclerView);
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
