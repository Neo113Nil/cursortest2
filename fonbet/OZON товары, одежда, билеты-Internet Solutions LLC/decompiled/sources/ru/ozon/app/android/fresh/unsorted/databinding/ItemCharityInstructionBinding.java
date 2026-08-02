package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class ItemCharityInstructionBinding implements a {

    @NonNull
    public final ButtonV3View buttonAddress;

    @NonNull
    public final TextAtomV2View orderTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    private ItemCharityInstructionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.buttonAddress = buttonV3View;
        this.orderTv = textAtomV2View;
        this.subtitleTv = textAtomV2View2;
        this.titleTv = textAtomV2View3;
    }

    @NonNull
    public static ItemCharityInstructionBinding bind(@NonNull View view) {
        int i11 = R$id.buttonAddress;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.orderTv;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.subtitleTv;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.titleTv;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        return new ItemCharityInstructionBinding((ConstraintLayout) view, buttonV3View, textAtomV2View, textAtomV2View2, textAtomV2View3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemCharityInstructionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_charity_instruction, viewGroup, false);
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
