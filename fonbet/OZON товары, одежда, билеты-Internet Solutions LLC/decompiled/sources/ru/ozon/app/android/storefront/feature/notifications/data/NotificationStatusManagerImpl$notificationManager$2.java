package ru.ozon.app.android.storefront.feature.notifications.data;

import android.app.Application;
import androidx.core.app.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/app/n;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "()Landroidx/core/app/n;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class NotificationStatusManagerImpl$notificationManager$2 extends AbstractC7737t implements Function0<n> {
    final /* synthetic */ NotificationStatusManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationStatusManagerImpl$notificationManager$2(NotificationStatusManagerImpl notificationStatusManagerImpl) {
        super(0);
        this.this$0 = notificationStatusManagerImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final n invoke() {
        Application application;
        application = this.this$0.application;
        return n.e(application);
    }
}
