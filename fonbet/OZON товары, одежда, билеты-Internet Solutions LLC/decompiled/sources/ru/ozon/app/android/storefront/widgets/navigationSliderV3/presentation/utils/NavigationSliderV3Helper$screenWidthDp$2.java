package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.utils;

import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderV3Helper$screenWidthDp$2 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ NavigationSliderV3Helper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3Helper$screenWidthDp$2(NavigationSliderV3Helper navigationSliderV3Helper) {
        super(0);
        this.this$0 = navigationSliderV3Helper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        displayMetrics = this.this$0.getDisplayMetrics();
        float f7 = displayMetrics.widthPixels;
        displayMetrics2 = this.this$0.getDisplayMetrics();
        return Float.valueOf(f7 / displayMetrics2.density);
    }
}
