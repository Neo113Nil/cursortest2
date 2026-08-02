package ru.ozon.app.android.courieronmap.presentation.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CourierInfoViewV1$callCourierBtn$2 extends AbstractC7737t implements Function0<LargeButtonView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierInfoViewV1$callCourierBtn$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LargeButtonView invoke() {
        LargeButtonView largeButtonView = new LargeButtonView(this.$context, null, 0, 0, 14, null);
        largeButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.setMargins(0, 0, 0, CourierInfoViewV1.INSTANCE.getMARGIN_16());
        largeButtonView.setLayoutParams(bVar);
        return largeButtonView;
    }
}
