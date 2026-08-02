package ru.ozon.app.android.courieronmap.presentation.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CourierInfoViewV2$callCourierBtn$2 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierInfoViewV2$callCourierBtn$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        ButtonV3View buttonV3View = new ButtonV3View(this.$context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.setMargins(0, 0, 0, CourierInfoViewV1.INSTANCE.getMARGIN_16());
        buttonV3View.setLayoutParams(bVar);
        return buttonV3View;
    }
}
