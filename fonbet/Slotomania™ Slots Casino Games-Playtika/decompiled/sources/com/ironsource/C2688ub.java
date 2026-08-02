package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.C2597p9;
import com.ironsource.Ve;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2688ub {
    private final C2632r9 a = new C2632r9(null, 1, 0 == true ? 1 : 0);

    /* renamed from: com.ironsource.ub$a */
    public static final class a extends AbstractRunnableC2512ke {
        final /* synthetic */ Runnable b;

        a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            this.b.run();
        }
    }

    /* renamed from: com.ironsource.ub$b */
    public static final class b extends AbstractRunnableC2512ke {
        final /* synthetic */ Function0<Unit> b;

        b(Function0<Unit> function0) {
            this.b = function0;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            this.b.invoke();
        }
    }

    /* renamed from: com.ironsource.ub$c */
    static final class c extends Lambda implements Function1<Map.Entry<? extends String, ? extends Boolean>, CharSequence> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, Boolean> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + "=" + entry.getValue().booleanValue();
        }
    }

    public final void a(AbstractRunnableC2512ke safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void b(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2688ub.a(C2688ub.this, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void c(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C2688ub.b(C2688ub.this, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.b(runnable);
    }

    public final void e(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2688ub this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C2688ub this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.ub$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C2688ub.a(C2688ub.this, runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2688ub this$0, Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    public final void b(AbstractRunnableC2512ke safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.a.a(safeRunnable);
    }

    public static /* synthetic */ void a(C2688ub c2688ub, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c2688ub.a(runnable, j);
    }

    public final C2602pe b(C2602pe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C2602pe(error.c(), "serverResponseIsNotValid") : error;
    }

    public final void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j);
    }

    public final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.a(callback);
    }

    public final void a(AbstractRunnableC2512ke safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.a.a(safeRunnable, j);
    }

    public final void b(String adUnitId, int i, String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jsonObjectInit.putOpt("reason", str);
        jsonObjectInit.put("mediationAdUnitId", adUnitId);
        jsonObjectInit.put("isMultipleAdUnits", 1);
        Ff.a(EnumC2754y5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jsonObjectInit);
    }

    public static /* synthetic */ void a(C2688ub c2688ub, AbstractRunnableC2512ke abstractRunnableC2512ke, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c2688ub.a(abstractRunnableC2512ke, j);
    }

    public static /* synthetic */ void a(C2688ub c2688ub, Function0 function0, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c2688ub.a((Function0<Unit>) function0, j);
    }

    public final void a(Function0<Unit> action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        a((AbstractRunnableC2512ke) new b(action), j);
    }

    public final Handler a() {
        return this.a.a();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C2597p9.a aVar = C2597p9.a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final void b(boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Ff.a(EnumC2754y5.SET_COPPA, jsonObjectInit);
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.a adFormat, String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return Ff.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(C2688ub c2688ub, long j, Ve.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        c2688ub.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, Ve.a responseOrigin, long j2, JSONObject data) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put("duration", j);
            String b2 = responseOrigin.b();
            Intrinsics.checkNotNullExpressionValue(b2, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, a(b2, j2));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ff.a(EnumC2754y5.SDK_INIT_SUCCESS, data);
    }

    public final C2602pe a(C2602pe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int c2 = error.c();
        if (c2 != 2070) {
            return c2 != 2110 ? error : new C2602pe(error.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C2602pe(error.c(), "noServerResponse");
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C2688ub c2688ub, C2602pe c2602pe, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        c2688ub.a(c2602pe, j, jSONObject);
    }

    public final void a(C2602pe error, long j, JSONObject data) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put("duration", j);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ff.a(EnumC2754y5.SDK_INIT_FAILED, data);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int i, String str) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jsonObjectInit.putOpt("reason", str);
        jsonObjectInit.put("placement", placementName);
        jsonObjectInit.put(Va.f, adFormat.getValue());
        jsonObjectInit.put("adf", Ff.c(com.unity3d.mediation.a.a(adFormat)));
        jsonObjectInit.put("isMultipleAdUnits", 1);
        Ff.a(EnumC2754y5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jsonObjectInit);
    }

    public final void a(String adUnitId, int i, String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jsonObjectInit.putOpt("reason", str);
        jsonObjectInit.put("mediationAdUnitId", adUnitId);
        jsonObjectInit.put("isMultipleAdUnits", 1);
        Ff.a(EnumC2754y5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jsonObjectInit);
    }

    public final void a(Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, CollectionsKt.joinToString$default(networkConsents.entrySet(), ";", null, null, 0, null, c.a, 30, null));
        Ff.a(EnumC2754y5.GDPR_CONSENTS, jsonObjectInit);
    }

    public final void a(boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Ff.a(EnumC2754y5.SET_CCPA, jsonObjectInit);
    }
}
