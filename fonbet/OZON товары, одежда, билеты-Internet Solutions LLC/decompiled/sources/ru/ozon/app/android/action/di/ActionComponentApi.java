package ru.ozon.app.android.action.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.analytics.ActionUsageAnalytics;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/action/di/ActionComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionRepository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "getActionAnalyticDelegate", "()Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "getActionUsageAnalytics", "()Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ActionComponentApi extends InterfaceC6958a {
    @NotNull
    ActionAnalyticDelegate getActionAnalyticDelegate();

    @NotNull
    ActionV2Repository getActionRepository();

    @NotNull
    ActionSheetEventHandler getActionSheetEventHandler();

    @NotNull
    ActionUsageAnalytics getActionUsageAnalytics();
}
