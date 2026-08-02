package d2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.J, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6033J extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@NotNull View view, @NotNull Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
