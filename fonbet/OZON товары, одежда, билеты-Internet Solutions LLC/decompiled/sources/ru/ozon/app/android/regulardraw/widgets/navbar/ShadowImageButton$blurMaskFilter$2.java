package ru.ozon.app.android.regulardraw.widgets.navbar;

import android.graphics.BlurMaskFilter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/BlurMaskFilter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ShadowImageButton$blurMaskFilter$2 extends AbstractC7737t implements Function0<BlurMaskFilter> {
    public static final ShadowImageButton$blurMaskFilter$2 INSTANCE = new ShadowImageButton$blurMaskFilter$2();

    ShadowImageButton$blurMaskFilter$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BlurMaskFilter invoke() {
        ShadowImageButton.Companion companion;
        companion = ShadowImageButton.Companion;
        return new BlurMaskFilter(companion.getShadowBlurRadius(), BlurMaskFilter.Blur.NORMAL);
    }
}
