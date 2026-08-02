package ru.ozon.android.messenger.framework.presentation.common.notification;

import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<NotificationDTO, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NotificationLayoutManager f90780b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f90781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(NotificationLayoutManager notificationLayoutManager, r rVar) {
        super(1);
        this.f90780b = notificationLayoutManager;
        this.f90781c = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NotificationDTO notificationDTO) {
        NotificationDTO notification = notificationDTO;
        Intrinsics.checkNotNullParameter(notification, "notification");
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, this.f90780b, notification, this.f90781c, null, 8, null).show();
        return Unit.f71690a;
    }
}
