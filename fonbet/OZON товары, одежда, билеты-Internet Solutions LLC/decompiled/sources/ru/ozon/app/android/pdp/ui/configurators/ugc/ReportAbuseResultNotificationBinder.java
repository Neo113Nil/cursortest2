package ru.ozon.app.android.pdp.ui.configurators.ugc;

import Sc.o;
import a00.C4911f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.R$string;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "refs", "Landroidx/lifecycle/J;", "owner", "<init>", "(Lru/ozon/app/android/composer/ConfiguratorReferences;Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResult;", "result", "", "showNotification", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResult;)V", "", "withRefresh", "setupFragmentResultListener", "(Z)V", "clearFragmentResultListener", "()V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "Landroidx/lifecycle/J;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReportAbuseResultNotificationBinder {

    @NotNull
    private final J owner;
    private final ConfiguratorReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReportAbuseResult.values().length];
            try {
                iArr[ReportAbuseResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReportAbuseResult.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReportAbuseResult.UNKNOWN_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReportAbuseResultNotificationBinder(ConfiguratorReferences configuratorReferences, @NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.refs = configuratorReferences;
        this.owner = owner;
    }

    public static /* synthetic */ void setupFragmentResultListener$default(ReportAbuseResultNotificationBinder reportAbuseResultNotificationBinder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        reportAbuseResultNotificationBinder.setupFragmentResultListener(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(ReportAbuseResult result) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        ViewGroup rootView;
        NotificationDTO createFailedToSendNotification;
        NotificationDTO notificationDTO;
        ConfiguratorReferences configuratorReferences = this.refs;
        if (configuratorReferences == null || (ownerContainer = configuratorReferences.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        int i11 = result == null ? -1 : WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                notificationDTO = new NotificationDTO(StringProvider.getString(R$string.abuse_report_success), null, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 478, null);
                NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO, c11, null, 8, null).show();
            } else {
                if (i11 == 2) {
                    Context context = c11.getContext();
                    createFailedToSendNotification = NotificationBarHelperKt.createNetworkErrorNotificationDTO(context != null && AppTypeResolver.INSTANCE.isSelect(context));
                    notificationDTO = createFailedToSendNotification;
                    NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO, c11, null, 8, null).show();
                }
                if (i11 != 3) {
                    throw new o();
                }
            }
        }
        createFailedToSendNotification = NotificationsKt.createFailedToSendNotification();
        notificationDTO = createFailedToSendNotification;
        NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO, c11, null, 8, null).show();
    }

    public final void clearFragmentResultListener() {
        C4911f ownerContainer;
        r a11;
        G supportFragmentManager;
        ConfiguratorReferences configuratorReferences = this.refs;
        if (configuratorReferences == null || (ownerContainer = configuratorReferences.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.s("report_abuse_report_key");
    }

    public final void setupFragmentResultListener(boolean withRefresh) {
        C10727i.c(K.a(this.owner), null, null, new ReportAbuseResultNotificationBinder$setupFragmentResultListener$1(this, withRefresh, null), 3);
    }
}
