package ru.ozon.app.android.scanit.scanit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.NonComposerPageViewAnalyticsHelper;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItAnalyticsImpl;", "Lru/ozon/app/android/scanit/scanit/ScanItAnalytics;", "analyticsHelper", "Lru/ozon/app/android/analytics/modules/NonComposerPageViewAnalyticsHelper;", "<init>", "(Lru/ozon/app/android/analytics/modules/NonComposerPageViewAnalyticsHelper;)V", "barcodeScanView", "", "Companion", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScanItAnalyticsImpl implements ScanItAnalytics {

    @NotNull
    private final NonComposerPageViewAnalyticsHelper analyticsHelper;

    public ScanItAnalyticsImpl(@NotNull NonComposerPageViewAnalyticsHelper analyticsHelper) {
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        this.analyticsHelper = analyticsHelper;
    }

    @Override // ru.ozon.app.android.scanit.scanit.ScanItAnalytics
    public void barcodeScanView() {
        this.analyticsHelper.pageView(new Rg.a("barcodeScan", "", null, null, null, null, null, null, null, null, null, 4092), false);
    }
}
