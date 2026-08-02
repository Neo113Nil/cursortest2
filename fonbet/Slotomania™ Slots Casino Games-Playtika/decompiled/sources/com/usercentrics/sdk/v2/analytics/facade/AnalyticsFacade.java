package com.usercentrics.sdk.v2.analytics.facade;

import com.safedk.android.analytics.events.CrashEvent;
import com.usercentrics.sdk.UsercentricsAnalyticsEventType;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.analytics.api.IAnalyticsApi;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import com.usercentrics.sdk.v2.settings.service.ISettingsService;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsFacade.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/usercentrics/sdk/v2/analytics/facade/AnalyticsFacade;", "Lcom/usercentrics/sdk/v2/analytics/facade/IAnalyticsFacade;", "analyticsApi", "Lcom/usercentrics/sdk/v2/analytics/api/IAnalyticsApi;", "settingsService", "Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "(Lcom/usercentrics/sdk/v2/analytics/api/IAnalyticsApi;Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;Lcom/usercentrics/sdk/log/UsercentricsLogger;)V", CrashEvent.e, "", "eventType", "Lcom/usercentrics/sdk/UsercentricsAnalyticsEventType;", "settingsId", "", "abTestingVariant", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnalyticsFacade implements IAnalyticsFacade {
    private final IAnalyticsApi analyticsApi;
    private final Dispatcher dispatcher;
    private final UsercentricsLogger logger;
    private final ISettingsService settingsService;

    public AnalyticsFacade(IAnalyticsApi analyticsApi, ISettingsService settingsService, Dispatcher dispatcher, UsercentricsLogger logger) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(settingsService, "settingsService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.analyticsApi = analyticsApi;
        this.settingsService = settingsService;
        this.dispatcher = dispatcher;
        this.logger = logger;
    }

    @Override // com.usercentrics.sdk.v2.analytics.facade.IAnalyticsFacade
    public void report(UsercentricsAnalyticsEventType eventType, String settingsId, String abTestingVariant) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(settingsId, "settingsId");
        this.dispatcher.dispatch(new AnalyticsFacade$report$1(this, eventType, settingsId, abTestingVariant, null)).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.v2.analytics.facade.AnalyticsFacade$report$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                UsercentricsLogger usercentricsLogger;
                Intrinsics.checkNotNullParameter(it, "it");
                usercentricsLogger = AnalyticsFacade.this.logger;
                usercentricsLogger.error("Request failed", it);
            }
        });
    }
}
