package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view;

import android.content.Context;
import androidx.vectordrawable.graphics.drawable.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.R$drawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/vectordrawable/graphics/drawable/e;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "()Landroidx/vectordrawable/graphics/drawable/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class EnableNotificationsView$bxFillMaxDrawable$2 extends AbstractC7737t implements Function0<e> {
    final /* synthetic */ Context $context;
    final /* synthetic */ EnableNotificationsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnableNotificationsView$bxFillMaxDrawable$2(EnableNotificationsView enableNotificationsView, Context context) {
        super(0);
        this.this$0 = enableNotificationsView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final e invoke() {
        return e.a(this.this$0.getResources(), R$drawable.ic_fill_max, this.$context.getTheme());
    }
}
