package ru.ozon.app.android.orderdetails.notificationbarrestriction.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.data.NotificationBarRestrictionDTO;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.presentation.NotificationBarRestrictionVI;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/data/NotificationBarRestrictionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/presentation/NotificationBarRestrictionVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVi", "(Lru/ozon/app/android/orderdetails/notificationbarrestriction/data/NotificationBarRestrictionDTO;J)Lru/ozon/app/android/orderdetails/notificationbarrestriction/presentation/NotificationBarRestrictionVI;", "state", "info", "invoke", "(Lru/ozon/app/android/orderdetails/notificationbarrestriction/data/NotificationBarRestrictionDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationBarRestrictionMapper implements Function2<NotificationBarRestrictionDTO, d, List<? extends NotificationBarRestrictionVI>> {
    private final NotificationBarRestrictionVI toVi(NotificationBarRestrictionDTO notificationBarRestrictionDTO, long j11) {
        return new NotificationBarRestrictionVI(j11, notificationBarRestrictionDTO.getNotification(), false, 4, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NotificationBarRestrictionVI> invoke(@NotNull NotificationBarRestrictionDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVi(state, info.d().hashCode()));
    }
}
