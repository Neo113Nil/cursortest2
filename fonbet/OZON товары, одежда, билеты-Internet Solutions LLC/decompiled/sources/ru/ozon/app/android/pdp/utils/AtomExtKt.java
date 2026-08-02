package ru.ozon.app.android.pdp.utils;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000\u001a\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\b"}, d2 = {"getMeasuredHeightWithCustomWidth", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "context", "Landroid/content/Context;", "horizontalPaddings", "", "getMeasuredWidth", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AtomExtKt {
    public static final int getMeasuredHeightWithCustomWidth(@NotNull TextDTO textDTO, @NotNull Context context, @NotNull List<Integer> horizontalPaddings) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
        textAtomV2View.measure(View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - C7714v.J0(horizontalPaddings), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textAtomV2View.getMeasuredHeight();
    }

    public static final int getMeasuredWidth(@NotNull TextDTO textDTO, @NotNull Context context, @NotNull List<Integer> horizontalPaddings) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
        textAtomV2View.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int J02 = context.getResources().getDisplayMetrics().widthPixels - C7714v.J0(horizontalPaddings);
        return textAtomV2View.getMeasuredWidth() > J02 ? J02 : textAtomV2View.getMeasuredWidth();
    }
}
