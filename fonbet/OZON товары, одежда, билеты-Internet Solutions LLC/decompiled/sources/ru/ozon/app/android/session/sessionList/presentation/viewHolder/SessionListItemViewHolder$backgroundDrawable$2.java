package ru.ozon.app.android.session.sessionList.presentation.viewHolder;

import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SessionListItemViewHolder$backgroundDrawable$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ SessionListItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionListItemViewHolder$backgroundDrawable$2(SessionListItemViewHolder sessionListItemViewHolder) {
        super(0);
        this.this$0 = sessionListItemViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        ShapeDrawable createBackgroundDrawable;
        createBackgroundDrawable = this.this$0.createBackgroundDrawable();
        return createBackgroundDrawable;
    }
}
