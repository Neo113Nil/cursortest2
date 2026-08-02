package ru.ozon.app.android.atoms.extensions;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0005\u001a\u0019\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroid/view/View;", "", "isActive", "", "switchBluewaveRectRipple", "(Landroid/view/View;Z)V", "Landroid/widget/FrameLayout;", "switchForegroundBluewaveRoundedRipple", "(Landroid/widget/FrameLayout;Z)V", "switchActive", "switchClickable", "switchForegroundClickable", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ClickableCiewKt {
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

    public static final void switchForegroundBluewaveRoundedRipple(@NotNull FrameLayout frameLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        frameLayout.setForeground(z11 ? a.getDrawable(frameLayout.getContext(), R$drawable.ripple_rect_round_bluewave) : null);
    }

    public static final void switchForegroundClickable(@NotNull FrameLayout frameLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        switchActive(frameLayout, z11);
        switchForegroundBluewaveRoundedRipple(frameLayout, z11);
    }
}
