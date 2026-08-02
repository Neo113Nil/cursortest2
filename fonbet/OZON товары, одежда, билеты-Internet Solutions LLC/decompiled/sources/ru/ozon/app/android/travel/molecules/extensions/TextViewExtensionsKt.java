package ru.ozon.app.android.travel.molecules.extensions;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00020\u0006\"\u00020\u0004¨\u0006\u0007"}, d2 = {"setColorForCompoundDrawables", "", "Landroid/widget/TextView;", "color", "", "indexesOfDrawables", "", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextViewExtensionsKt {
    public static final void setColorForCompoundDrawables(@NotNull TextView textView, int i11, @NotNull int... indexesOfDrawables) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(indexesOfDrawables, "indexesOfDrawables");
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        for (int i12 : indexesOfDrawables) {
            Drawable drawable = compoundDrawables[i12];
            if (drawable != null) {
                drawable.setTint(i11);
            }
        }
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }
}
