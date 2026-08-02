package ru.ozon.uni.atoms.extensions;

import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"switchBluewaveRectRipple", "", "Landroid/view/View;", "isActive", "", "switchActive", "switchClickable", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClickableExtKt {
    public static final void switchActive(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setClickable(z11);
        view.setFocusable(z11);
    }

    public static final void switchBluewaveRectRipple(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(z11 ? a.getDrawable(view.getContext(), R$drawable.ripple_rect_bluewave) : null);
    }

    public static final void switchClickable(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        switchActive(view, z11);
        switchBluewaveRectRipple(view, z11);
    }
}
