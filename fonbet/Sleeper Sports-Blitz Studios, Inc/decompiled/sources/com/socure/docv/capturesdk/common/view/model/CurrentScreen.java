package com.socure.docv.capturesdk.common.view.model;

import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;

/* compiled from: CurrentScreen.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/CurrentScreen;", "", "screenType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getScreenType", "()Ljava/lang/String;", "SELECTOR", "SCANNER_FRONT", "PREVIEW_FRONT", "SCANNER_BACK", "PREVIEW_BACK", "SCANNER_PASSPORT", "PREVIEW_PASSPORT", "SCANNER_SELFIE", "PREVIEW_SELFIE", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CurrentScreen {
    SELECTOR("selector"),
    SCANNER_FRONT("scanner"),
    PREVIEW_FRONT(AnalyticsConstantsKt.PREVIEW_SCREEN),
    SCANNER_BACK("scanner"),
    PREVIEW_BACK(AnalyticsConstantsKt.PREVIEW_SCREEN),
    SCANNER_PASSPORT("scanner"),
    PREVIEW_PASSPORT(AnalyticsConstantsKt.PREVIEW_SCREEN),
    SCANNER_SELFIE("scanner"),
    PREVIEW_SELFIE(AnalyticsConstantsKt.PREVIEW_SCREEN);

    private final String screenType;

    CurrentScreen(String str) {
        this.screenType = str;
    }

    public final String getScreenType() {
        return this.screenType;
    }
}
