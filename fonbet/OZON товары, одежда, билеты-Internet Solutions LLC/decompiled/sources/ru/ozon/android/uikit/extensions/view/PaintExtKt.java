package ru.ozon.android.uikit.extensions.view;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"getBaseline", "", "Landroid/graphics/Paint;", RichContentDTO.ALIGN_CENTER, "getTextHeight", "design-system_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaintExtKt {
    public static final float getBaseline(@NotNull Paint paint, float f7) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return f7 - ((paint.ascent() + paint.descent()) / 2);
    }

    public static final float getTextHeight(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.descent() - paint.ascent();
    }
}
