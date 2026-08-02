package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import Nc.C3667a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorRepo;", "", "<init>", "()V", "LNc/a;", "", "kotlin.jvm.PlatformType", "refreshSubject", "LNc/a;", "getRefreshSubject", "()LNc/a;", "shouldRefresh", "Z", "getShouldRefresh", "()Z", "setShouldRefresh", "(Z)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsSelectorRepo {
    public static final int $stable;

    @NotNull
    public static final NotificationsSettingsSelectorRepo INSTANCE = new NotificationsSettingsSelectorRepo();

    @NotNull
    private static final C3667a<Boolean> refreshSubject;
    private static boolean shouldRefresh;

    static {
        C3667a<Boolean> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        refreshSubject = d11;
        $stable = 8;
    }

    private NotificationsSettingsSelectorRepo() {
    }

    @NotNull
    public final C3667a<Boolean> getRefreshSubject() {
        return refreshSubject;
    }

    public final boolean getShouldRefresh() {
        return shouldRefresh;
    }

    public final void setShouldRefresh(boolean z11) {
        shouldRefresh = z11;
    }
}
