package ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core.EnableNotificationsSnackbarMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/di/EnableNotificationsSnackbarWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/core/EnableNotificationsSnackbarMapper;", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/core/EnableNotificationsSnackbarMapper;", "mapper", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EnableNotificationsSnackbarWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/di/EnableNotificationsSnackbarWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/di/EnableNotificationsSnackbarWidgetComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/di/EnableNotificationsSnackbarWidgetComponent;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final EnableNotificationsSnackbarWidgetComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new EnableNotificationsSnackbarWidgetComponent(storage) { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di.EnableNotificationsSnackbarWidgetComponent$Companion$create$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;

                {
                    this.mapper = k.b(new EnableNotificationsSnackbarWidgetComponent$Companion$create$1$mapper$2(storage));
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di.EnableNotificationsSnackbarWidgetComponent
                public EnableNotificationsSnackbarMapper getMapper() {
                    return (EnableNotificationsSnackbarMapper) this.mapper.getValue();
                }
            };
        }
    }

    @NotNull
    EnableNotificationsSnackbarMapper getMapper();
}
