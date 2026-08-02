package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.utils;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getMeasuredWidth", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "context", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceActionExtKt {
    public static final int getMeasuredWidth(@NotNull TextDTO textDTO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
        textAtomV2View.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textAtomV2View.getMeasuredWidth();
    }
}
