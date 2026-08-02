package ru.ozon.app.android.abtool;

import B0.A0;
import He.b;
import Ld0.c;
import Od0.a;
import Od0.e;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.D;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import ru.ozon.app.android.abtool.presentation.AbToggleActivity;
import ru.ozon.app.android.abtool.presentation.AbToggleScreenType;
import ru.ozon.app.android.abtool.presentation.debug.ActionType;
import ru.ozon.app.android.abtool.utils.LimbExtKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\f*\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ)\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b#\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/abtool/AbToolDeeplinkHandler;", "", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "config", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;)V", "LLd0/c;", "store", "Landroid/net/Uri;", "deeplink", "Landroid/content/Context;", "activityContext", "LOd0/a;", "handleExternalDeeplinks", "(LLd0/c;Landroid/net/Uri;Landroid/content/Context;)LOd0/a;", "Lru/ozon/app/android/abtool/AbToolImpl;", "fetchWithDeeplinkResult", "(Lru/ozon/app/android/abtool/AbToolImpl;)LOd0/a;", "logFeatureValue", "(Lru/ozon/app/android/abtool/AbToolImpl;Landroid/net/Uri;)LOd0/a;", "", "parameterName", "requiredParameterIsAbsent", "(Ljava/lang/String;)LOd0/a;", "error", "handleWithError", "handleAbVariantsDeeplink", "handleFFValueDeeplink", "LOd0/c;", "", "canHandle", "(LOd0/c;)Z", "LOd0/e$a;", "handleLegacy", "(LLd0/c;Landroid/net/Uri;)LOd0/e$a;", "handle", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolDeeplinkHandler {

    @NotNull
    private final FeatureServiceConfig config;

    public AbToolDeeplinkHandler(@NotNull FeatureServiceConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    private final a fetchWithDeeplinkResult(AbToolImpl abToolImpl) {
        abToolImpl.fetch();
        return new a.C0408a();
    }

    private final a handleAbVariantsDeeplink(c store, Uri deeplink, Context activityContext) {
        ActionType actionType;
        String queryParameter = deeplink.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String queryParameter2 = deeplink.getQueryParameter("delete");
        String queryParameter3 = deeplink.getQueryParameter("replace");
        String str = queryParameter == null ? queryParameter3 == null ? queryParameter2 == null ? "" : queryParameter2 : queryParameter3 : queryParameter;
        if (queryParameter != null && !h.K(queryParameter)) {
            actionType = ActionType.APPEND;
        } else if (queryParameter3 != null && !h.K(queryParameter3)) {
            actionType = ActionType.REPLACE;
        } else {
            if (queryParameter2 == null) {
                return handleWithError("Deeplink handle error. A/B variants are missed");
            }
            actionType = ActionType.REMOVE;
        }
        AbToggleActivity.INSTANCE.startActivity(activityContext == null ? store.c().a() : activityContext, AbToggleScreenType.AB_DEBUG, str, actionType, activityContext != null ? null : 335544320);
        return new a.C0408a();
    }

    private final a handleExternalDeeplinks(c store, Uri deeplink, Context activityContext) {
        return Intrinsics.d(deeplink.getHost(), "abvariants") ? handleAbVariantsDeeplink(store, deeplink, activityContext) : new a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a handleFFValueDeeplink(c store, Uri deeplink, Context activityContext) {
        String queryParameter = deeplink.getQueryParameter("key");
        if (queryParameter == null) {
            return handleWithError("Deeplink handle error. KEY param is missed");
        }
        String queryParameter2 = deeplink.getQueryParameter("service");
        if (queryParameter2 == null) {
            return handleWithError("Deeplink handle error. SERVICE param is missed");
        }
        String queryParameter3 = deeplink.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (queryParameter3 == null) {
            return handleWithError("Deeplink handle error. VALUE param is missed");
        }
        String queryParameter4 = deeplink.getQueryParameter("namespace");
        if (queryParameter4 == null) {
            return handleWithError("Deeplink handle error. NAMESPACE param is missed");
        }
        AbToolImpl abToolImpl = (AbToolImpl) store.e(AbToolBaseApi.class);
        J j11 = activityContext instanceof J ? (J) activityContext : null;
        if (j11 != null) {
            D a11 = K.a(j11);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, b.f10879b, null, new AbToolDeeplinkHandler$handleFFValueDeeplink$1(abToolImpl, queryParameter2, queryParameter, queryParameter3, queryParameter4, null), 2);
        }
        return new a.C0408a();
    }

    private final a handleWithError(String error) {
        AbToolLogger.logError$default(AbToolLogger.INSTANCE, null, error, 1, null);
        return new a.b(error, null);
    }

    private final a logFeatureValue(AbToolImpl abToolImpl, Uri uri) {
        AbToolNamespace fromStringOrDefault;
        String queryParameter = uri.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (queryParameter == null) {
            return requiredParameterIsAbsent(AppMeasurementSdk.ConditionalUserProperty.NAME);
        }
        String queryParameter2 = uri.getQueryParameter("service");
        if (queryParameter2 == null) {
            return requiredParameterIsAbsent("service");
        }
        String queryParameter3 = uri.getQueryParameter("namespace");
        if (queryParameter3 == null || (fromStringOrDefault = AbToolNamespace.INSTANCE.fromStringOrDefault(queryParameter3)) == null) {
            return requiredParameterIsAbsent("namespace");
        }
        FeatureDebugModel featureUiState$abzone_release = abToolImpl.getFeatureUiState$abzone_release(queryParameter, queryParameter2, fromStringOrDefault);
        AbToolLogger.INSTANCE.log("Feature value: " + featureUiState$abzone_release + ". Result value = " + (featureUiState$abzone_release != null ? featureUiState$abzone_release.getFeatureValue(this.config.getIsPlatformOverridesEnabled()) : null));
        return new a.C0408a();
    }

    private final a requiredParameterIsAbsent(String parameterName) {
        String b11 = A0.b("Deeplink handle error. Required parameter ", parameterName, " is absent");
        AbToolLogger.logError$default(AbToolLogger.INSTANCE, null, b11, 1, null);
        return new a.b(b11, null);
    }

    public final boolean canHandle(@NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri a11 = deeplink.a();
        return Intrinsics.d(a11 != null ? a11.getHost() : null, "abtoolSDK");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public final a handle(@NotNull c store, @NotNull Uri deeplink, Context activityContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        AbToolImpl abToolImpl = (AbToolImpl) store.e(AbToolBaseApi.class);
        if (!Intrinsics.d(deeplink.getHost(), "abtoolSDK")) {
            return handleExternalDeeplinks(store, deeplink, activityContext);
        }
        String path = deeplink.getPath();
        if (path != null) {
            switch (path.hashCode()) {
                case -1986953872:
                    if (path.equals("/logFeatureValue")) {
                        return logFeatureValue(abToolImpl, deeplink);
                    }
                    break;
                case -847938798:
                    if (path.equals("/changeFFValue")) {
                        return handleFFValueDeeplink(store, deeplink, activityContext);
                    }
                    break;
                case 1442892779:
                    if (path.equals("/fetch")) {
                        return fetchWithDeeplinkResult(abToolImpl);
                    }
                    break;
                case 1569205534:
                    if (path.equals("/abvariants")) {
                        return handleAbVariantsDeeplink(store, deeplink, activityContext);
                    }
                    break;
            }
        }
        return new a.c();
    }

    @NotNull
    public final e.a handleLegacy(@NotNull c store, @NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return LimbExtKt.toLegacyResult(handle(store, deeplink, null));
    }
}
