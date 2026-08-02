package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation;

import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/shapes/RoundRectShape;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UniversalObjectScrollWidgetViewHolder$topRoundedShape$2 extends AbstractC7737t implements Function0<RoundRectShape> {
    final /* synthetic */ UniversalObjectScrollWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalObjectScrollWidgetViewHolder$topRoundedShape$2(UniversalObjectScrollWidgetViewHolder universalObjectScrollWidgetViewHolder) {
        super(0);
        this.this$0 = universalObjectScrollWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RoundRectShape invoke() {
        float f7;
        float f11;
        float f12;
        float f13;
        f7 = this.this$0.radius;
        f11 = this.this$0.radius;
        f12 = this.this$0.radius;
        f13 = this.this$0.radius;
        return new RoundRectShape(new float[]{f7, f11, f12, f13, 0.0f, 0.0f, 0.0f, 0.0f}, null, null);
    }
}
