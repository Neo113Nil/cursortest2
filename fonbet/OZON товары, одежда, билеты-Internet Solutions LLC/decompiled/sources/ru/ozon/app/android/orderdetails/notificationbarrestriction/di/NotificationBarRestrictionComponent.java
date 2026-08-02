package ru.ozon.app.android.orderdetails.notificationbarrestriction.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.core.NotificationBarRestrictionMapper;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orderdetails/notificationbarrestriction/di/NotificationBarRestrictionComponent;", "Lhi/a;", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionMapper;", "getMapper", "()Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionMapper;", "mapper", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NotificationBarRestrictionComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/orderdetails/notificationbarrestriction/di/NotificationBarRestrictionComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/di/NotificationBarRestrictionComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/orderdetails/notificationbarrestriction/di/NotificationBarRestrictionComponent;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final NotificationBarRestrictionComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new NotificationBarRestrictionComponent() { // from class: ru.ozon.app.android.orderdetails.notificationbarrestriction.di.NotificationBarRestrictionComponent$Companion$create$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(NotificationBarRestrictionComponent$Companion$create$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.orderdetails.notificationbarrestriction.di.NotificationBarRestrictionComponent
                public NotificationBarRestrictionMapper getMapper() {
                    return (NotificationBarRestrictionMapper) this.mapper.getValue();
                }
            };
        }
    }

    @NotNull
    NotificationBarRestrictionMapper getMapper();
}
