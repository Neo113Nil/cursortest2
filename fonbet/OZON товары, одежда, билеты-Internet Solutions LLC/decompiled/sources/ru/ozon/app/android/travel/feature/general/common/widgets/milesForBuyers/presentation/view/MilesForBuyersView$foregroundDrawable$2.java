package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MilesForBuyersView$foregroundDrawable$2 extends AbstractC7737t implements Function0<ShapeDrawableWithBorder> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MilesForBuyersView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MilesForBuyersView$foregroundDrawable$2(Context context, MilesForBuyersView milesForBuyersView) {
        super(0);
        this.$context = context;
        this.this$0 = milesForBuyersView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawableWithBorder invoke() {
        float f7;
        float f11;
        float pxF = ResourceExtKt.toPxF(3, this.$context) / 2;
        f7 = this.this$0.cornerRadii;
        float f12 = f7 - pxF;
        Context context = this.$context;
        Float valueOf = Float.valueOf(pxF);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            f11 = this.this$0.cornerRadii;
            fArr[i11] = f11;
        }
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr2[i12] = f12;
        }
        return new ShapeDrawableWithBorder(context, valueOf, fArr, fArr2);
    }
}
