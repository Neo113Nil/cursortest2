package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class EmptyView$overlayView$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ EmptyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyView$overlayView$2(Context context, EmptyView emptyView) {
        super(0);
        this.$context = context;
        this.this$0 = emptyView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        View view = new View(this.$context);
        view.setId(R$id.selectionEmptyOverlayView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -1);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        view.setLayoutParams(bVar);
        view.setZ(2.0f);
        this.this$0.addView(view);
        return view;
    }
}
