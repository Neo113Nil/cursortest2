package ru.ozon.app.android.network.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "", "isLimitAdTrackingEnabled", "", "getAdvertisingId", "", "getDisplayedLanguage", "isRailwayMockServiceEnabled", "isOzonQA", "pageViewId", "previousPageName", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NetworkHeadersDependencies {
    @NotNull
    String getAdvertisingId();

    String getDisplayedLanguage();

    boolean isLimitAdTrackingEnabled();

    boolean isOzonQA();

    boolean isRailwayMockServiceEnabled();

    String pageViewId();

    String previousPageName();
}
