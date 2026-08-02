package ru.ozon.uni.android.uikit.common.gradient;

import Sc.InterfaceC3999a;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/uikit/common/gradient/OzGradientAccent3;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "<init>", "()V", "getColorResources", "", "getOrientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OzGradientAccent3 extends OzGradient {
    public OzGradientAccent3() {
        super("ozgradientaccent3", null);
    }

    @Override // ru.ozon.uni.android.uikit.common.gradient.OzGradient
    @NotNull
    protected int[] getColorResources() {
        return new int[]{R$attr.oz_semantic_gradient_accent_3_start_color, R$attr.oz_semantic_gradient_accent_3_end_color};
    }

    @Override // ru.ozon.uni.android.uikit.common.gradient.OzGradient
    @NotNull
    public GradientDrawable.Orientation getOrientation() {
        return GradientDrawable.Orientation.TL_BR;
    }
}
