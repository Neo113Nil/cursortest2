package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes4.dex */
public final class ItemPriceCalendarHeaderV3FieldBinding implements a {

    @NonNull
    public final IconButtonV3View priceCalendarHeaderFieldButtonIbv;

    @NonNull
    public final TextAtomV2View priceCalendarHeaderFieldTitleTav;

    @NonNull
    private final AspectView rootView;

    private ItemPriceCalendarHeaderV3FieldBinding(@NonNull AspectView aspectView, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = aspectView;
        this.priceCalendarHeaderFieldButtonIbv = iconButtonV3View;
        this.priceCalendarHeaderFieldTitleTav = textAtomV2View;
    }

    @NonNull
    public static ItemPriceCalendarHeaderV3FieldBinding bind(@NonNull View view) {
        int i11 = R$id.priceCalendarHeaderFieldButtonIbv;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            i11 = R$id.priceCalendarHeaderFieldTitleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new ItemPriceCalendarHeaderV3FieldBinding((AspectView) view, iconButtonV3View, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public AspectView getRoot() {
        return this.rootView;
    }
}
