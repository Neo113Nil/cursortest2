package ru.ozon.app.android.travel.molecules.view.travelWidgetSettings;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelWidgetSettingsExtKt$safeUpdateBackground$defaultBackgroundColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ int $defaultBackgroundColorId;
    final /* synthetic */ View $this_safeUpdateBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelWidgetSettingsExtKt$safeUpdateBackground$defaultBackgroundColor$2(View view, int i11) {
        super(0);
        this.$this_safeUpdateBackground = view;
        this.$defaultBackgroundColorId = i11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context context = this.$this_safeUpdateBackground.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(ThemeExtKt.themeColor(context, this.$defaultBackgroundColorId));
    }
}
