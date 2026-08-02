package ru.ozon.uni.android.uikit.view.atoms.price;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"isVisible", "", "Landroid/view/View;", "widthIfVisible", "", "heightIfVisible", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceWithPointsViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int heightIfVisible(View view) {
        if (view.getVisibility() == 0) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int widthIfVisible(View view) {
        if (view.getVisibility() == 0) {
            return view.getMeasuredWidth();
        }
        return 0;
    }
}
