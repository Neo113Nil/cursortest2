package ru.ozon.app.android.travel.molecules.view.infoBadge;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.ui.molecules.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class InfoBadgeView$wrapper$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ InfoBadgeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoBadgeView$wrapper$2(Context context, InfoBadgeView infoBadgeView) {
        super(0);
        this.$context = context;
        this.this$0 = infoBadgeView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        ShapeDrawable shapeDrawable;
        View view = new View(this.$context);
        InfoBadgeView infoBadgeView = this.this$0;
        view.setId(R$id.infoBadgeViewWrapper);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        shapeDrawable = infoBadgeView.roundedBackground;
        view.setBackground(shapeDrawable);
        return view;
    }
}
