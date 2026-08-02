package ru.ozon.app.android.regulardraw.widgets.navbar;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ShadowImageButton$roundedRectClipPath$2 extends AbstractC7737t implements Function0<Path> {
    final /* synthetic */ ShadowImageButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShadowImageButton$roundedRectClipPath$2(ShadowImageButton shadowImageButton) {
        super(0);
        this.this$0 = shadowImageButton;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Path invoke() {
        RectF rectF;
        ShadowImageButton.Companion companion;
        ShadowImageButton.Companion companion2;
        Path path = new Path();
        rectF = this.this$0.rectF;
        companion = ShadowImageButton.Companion;
        float cornerRadius = companion.getCornerRadius();
        companion2 = ShadowImageButton.Companion;
        path.addRoundRect(rectF, cornerRadius, companion2.getCornerRadius(), Path.Direction.CCW);
        return path;
    }
}
