package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import defpackage.au3;
import defpackage.bu3;
import defpackage.f1d;
import defpackage.gdi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "getDiagnosticEventBatchRequest", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "diagnosticRequestPolicy", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;Lau3;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;)V", "", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lf1d;", "", "isRunning", "Lf1d;", "Lku3;", "scope", "Lku3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagnosticEventObserver {

    @NotNull
    private final BackgroundWorker backgroundWorker;

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final GetRequestPolicy diagnosticRequestPolicy;

    @NotNull
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final f1d isRunning;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final UniversalRequestDataSource universalRequestDataSource;

    @NotNull
    private final UniversalRequestEventSender universalRequestEventSender;

    public DiagnosticEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, @NotNull au3 au3Var, @NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull UniversalRequestDataSource universalRequestDataSource, @NotNull BackgroundWorker backgroundWorker, @NotNull UniversalRequestEventSender universalRequestEventSender, @NotNull GetRequestPolicy getRequestPolicy) {
        getUniversalRequestForPayLoad.getClass();
        getDiagnosticEventBatchRequest.getClass();
        au3Var.getClass();
        diagnosticEventRepository.getClass();
        universalRequestDataSource.getClass();
        backgroundWorker.getClass();
        universalRequestEventSender.getClass();
        getRequestPolicy.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.diagnosticRequestPolicy = getRequestPolicy;
        this.isRunning = gdi.a(Boolean.FALSE);
        this.scope = s9a.c(au3Var.plus(new DiagnosticEventObserver$special$$inlined$CoroutineExceptionHandler$1(bu3.a)));
    }

    @Nullable
    public final Object invoke(@NotNull rq3<? super Unit> rq3Var) {
        Object R = xw3.R(this.scope.getCoroutineContext(), new DiagnosticEventObserver$invoke$2(this, null), rq3Var);
        return R == lu3.a ? R : Unit.a;
    }
}
