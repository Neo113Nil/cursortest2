package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import Sc.InterfaceC4008j;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/LayerDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ImageAspectV4View$borderForeground$2 extends AbstractC7737t implements Function0<LayerDrawable> {
    final /* synthetic */ ImageAspectV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageAspectV4View$borderForeground$2(ImageAspectV4View imageAspectV4View) {
        super(0);
        this.this$0 = imageAspectV4View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final LayerDrawable invoke() {
        Drawable drawable;
        InterfaceC4008j interfaceC4008j;
        drawable = this.this$0.originalForeground;
        interfaceC4008j = this.this$0.fgDrawable;
        return new LayerDrawable(new Drawable[]{drawable, interfaceC4008j.getValue()});
    }
}
