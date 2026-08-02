package ru.ozon.app.android.uikit.view.atoms.cells;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"updateDisclosureView", "", "Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell;", "isHidden", "", "tintColor", "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisclosureCellKt {
    public static final void updateDisclosureView(@NotNull DisclosureCell disclosureCell, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(disclosureCell, "<this>");
        disclosureCell.hideDisclosure(z11);
        if (str == null) {
            str = DisclosureCell.INSTANCE.getDEFAULT_DISCLOSURE_TINT_COLOR();
        }
        disclosureCell.setDisclosureTintColor(str);
    }
}
