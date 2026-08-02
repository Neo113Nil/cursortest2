package com.usercentrics.sdk.ui.components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UCProgressBar.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"style", "", "Landroid/widget/ProgressBar;", "theme", "Lcom/usercentrics/sdk/ui/theme/UCThemeData;", "usercentrics-ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UCProgressBarKt {
    public static final void style(ProgressBar progressBar, UCThemeData theme) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Integer text100 = theme.getColorPalette().getText100();
        if (text100 != null) {
            int intValue = text100.intValue();
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable == null) {
                return;
            }
            indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN));
        }
    }
}
