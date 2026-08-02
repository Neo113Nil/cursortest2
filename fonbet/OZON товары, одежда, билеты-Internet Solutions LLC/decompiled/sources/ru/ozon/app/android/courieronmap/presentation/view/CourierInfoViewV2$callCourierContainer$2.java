package ru.ozon.app.android.courieronmap.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CourierInfoViewV2$callCourierContainer$2 extends AbstractC7737t implements Function0<FrameLayout> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierInfoViewV2$callCourierContainer$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        FrameLayout frameLayout = new FrameLayout(this.$context);
        Context context = this.$context;
        frameLayout.setId(View.generateViewId());
        frameLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        frameLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        return frameLayout;
    }
}
