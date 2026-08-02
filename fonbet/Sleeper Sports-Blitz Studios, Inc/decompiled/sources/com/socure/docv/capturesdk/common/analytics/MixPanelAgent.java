package com.socure.docv.capturesdk.common.analytics;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.socure.docv.capturesdk.BuildConfig;
import com.socure.docv.capturesdk.common.network.repository.MixPanelRepository;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: MixPanelAgent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J!\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fH\u0000¢\u0006\u0002\b\u0010J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016JA\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00170\u0016\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "Lcom/socure/docv/capturesdk/common/analytics/AnalyticsAgent;", "repository", "Lcom/socure/docv/capturesdk/common/network/repository/MixPanelRepository;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "(Lcom/socure/docv/capturesdk/common/network/repository/MixPanelRepository;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", Session.JsonKeys.ATTRS, "", "", "job", "Lkotlinx/coroutines/Job;", "addLateAttrs", "", "lateAttrs", "", "addLateAttrs$capturesdk_productionRelease", "cancel", "message", "sendEvent", "eventName", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "updateParams", "params", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MixPanelAgent implements AnalyticsAgent {
    private final Map<String, String> attrs;
    private final CoroutineExceptionHandler exceptionHandler;
    private Job job;
    private final MixPanelRepository repository;

    public MixPanelAgent(MixPanelRepository repository, CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.exceptionHandler = coroutineExceptionHandler;
        int i = Build.VERSION.SDK_INT;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.attrs = MapsKt.mutableMapOf(TuplesKt.to(AnalyticsConstantsKt.KEY_TOKEN, BuildConfig.MIX_PANEL_TOKEN), TuplesKt.to("device_model", Build.MODEL), TuplesKt.to(AnalyticsConstantsKt.KEY_DEVICE_OEM, Build.MANUFACTURER), TuplesKt.to(AnalyticsConstantsKt.KEY_DEVICE_OS, "Android " + i), TuplesKt.to(AnalyticsConstantsKt.KEY_SCREEN_SIZE, displayMetrics.widthPixels + "x" + displayMetrics.heightPixels), TuplesKt.to(AnalyticsConstantsKt.KEY_BUILD_NUMBER, BuildConfig.SDK_VERSION), TuplesKt.to("sdk_version", BuildConfig.SDK_VERSION), TuplesKt.to(AnalyticsConstantsKt.KEY_KOTLIN_VERSION, KotlinVersion.CURRENT.toString()), TuplesKt.to(AnalyticsConstantsKt.KEY_CLIENT, "native_android"), TuplesKt.to(AnalyticsConstantsKt.KEY_REFERRED_BY, "Android"), TuplesKt.to(AnalyticsConstantsKt.KEY_DISTINCT_ID, Utils.INSTANCE.randomString$capturesdk_productionRelease(16)), TuplesKt.to("source", ConstantsKt.getSOURCE_PLATFORM().getPlatformName()), TuplesKt.to(AnalyticsConstantsKt.KEY_VERIFICATION_LEVEL, "1"));
    }

    public final void addLateAttrs$capturesdk_productionRelease(Map<String, String> lateAttrs) {
        Intrinsics.checkNotNullParameter(lateAttrs, "lateAttrs");
        this.attrs.putAll(lateAttrs);
    }

    @Override // com.socure.docv.capturesdk.common.analytics.AnalyticsAgent
    public void sendEvent(String eventName, Pair<String, String>... args) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        if (SessionManager.INSTANCE.isMixPanelEnabled()) {
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CoroutineExceptionHandler coroutineExceptionHandler = this.exceptionHandler;
            if (coroutineExceptionHandler != null) {
                io2 = io2.plus(coroutineExceptionHandler);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(io2)), null, null, new MixPanelAgent$sendEvent$1(eventName, this, args, null), 3, null);
            this.job = launch$default;
        }
    }

    @Override // com.socure.docv.capturesdk.common.analytics.AnalyticsAgent
    public void cancel(String message) {
        Job job;
        Job job2 = this.job;
        if (job2 == null || !job2.isActive() || (job = this.job) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    @Override // com.socure.docv.capturesdk.common.analytics.AnalyticsAgent
    public void updateParams(Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList(params.size());
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (Intrinsics.areEqual(key, AnalyticsConstantsKt.KEY_DISTINCT_ID)) {
                if (!TextUtils.isEmpty(value)) {
                    this.attrs.put(key, value);
                }
            } else {
                this.attrs.put(key, value);
            }
            arrayList.add(Unit.INSTANCE);
        }
    }
}
