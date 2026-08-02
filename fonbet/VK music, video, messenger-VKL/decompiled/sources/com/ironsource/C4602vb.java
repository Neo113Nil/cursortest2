package com.ironsource;

import android.content.Context;
import android.view.Choreographer;
import com.ironsource.C4602vb;
import com.ironsource.Ve;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.d7n;
import xsna.hc3;
import xsna.izs;
import xsna.j5g;

/* renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4602vb {
    private final C4546s9 a = new C4546s9();

    /* renamed from: com.ironsource.vb$a */
    public static final class a extends AbstractRunnableC4408ke {
        final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            this.b.run();
        }
    }

    /* renamed from: com.ironsource.vb$b */
    public static final class b extends Lambda implements izs<Map.Entry<? extends String, ? extends Boolean>, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, Boolean> entry) {
            return entry.getKey() + "=" + entry.getValue().booleanValue();
        }
    }

    public final void a(Runnable runnable) {
        a(this, new hc3(14, this, runnable), 0L, 2, null);
    }

    public final void b(Runnable runnable) {
        a(this, new d7n(7, this, runnable), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4602vb c4602vb, Runnable runnable) {
        c4602vb.a.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C4602vb c4602vb, final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: xsna.kgz0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C4602vb.a(C4602vb.this, runnable, j);
            }
        });
    }

    public final void c(Runnable runnable) {
        this.a.a(runnable);
    }

    public final void d(Runnable runnable) {
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4602vb c4602vb, Runnable runnable, long j) {
        c4602vb.a(runnable);
    }

    public final C4498pe b(C4498pe c4498pe) {
        return c4498pe.c() == 2080 ? new C4498pe(c4498pe.c(), "serverResponseIsNotValid") : c4498pe;
    }

    public static /* synthetic */ void a(C4602vb c4602vb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c4602vb.a(runnable, j);
    }

    public final void a(Runnable runnable, long j) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j);
    }

    public final void b(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str2);
        jSONObject.put("mediationAdUnitId", str);
        jSONObject.put("isMultipleAdUnits", 1);
        If.a(EnumC4650y5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void a(Context context) {
        C4511q9.a.a(context.getApplicationContext());
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormatArr) {
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormatArr) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final void b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        If.a(EnumC4650y5.SET_COPPA, jSONObject);
    }

    public final boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        return If.a(adapterBaseInterface, aVar, str);
    }

    public static /* synthetic */ void a(C4602vb c4602vb, long j, Ve.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c4602vb.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, Ve.a aVar, long j2, JSONObject jSONObject) {
        try {
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j);
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(aVar.b(), j2));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        If.a(EnumC4650y5.SDK_INIT_SUCCESS, jSONObject);
    }

    public final C4498pe a(C4498pe c4498pe) {
        int c = c4498pe.c();
        if (c != 2070) {
            return c != 2110 ? c4498pe : new C4498pe(c4498pe.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C4498pe(c4498pe.c(), "noServerResponse");
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C4602vb c4602vb, C4498pe c4498pe, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c4602vb.a(c4498pe, j, jSONObject);
    }

    public final void a(C4498pe c4498pe, long j, JSONObject jSONObject) {
        try {
            jSONObject.put("errorCode", c4498pe.c());
            jSONObject.put("reason", c4498pe.d());
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        If.a(EnumC4650y5.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(String str, LevelPlay.AdFormat adFormat, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str2);
        jSONObject.put("placement", str);
        jSONObject.put(Wa.f, adFormat.getValue());
        jSONObject.put("adf", If.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        If.a(EnumC4650y5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str2);
        jSONObject.put("mediationAdUnitId", str);
        jSONObject.put("isMultipleAdUnits", 1);
        If.a(EnumC4650y5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(Map<String, Boolean> map) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, j5g.g0(map.entrySet(), ";", null, null, 0, b.a, 30));
        If.a(EnumC4650y5.GDPR_CONSENTS, jSONObject);
    }

    public final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        If.a(EnumC4650y5.SET_CCPA, jSONObject);
    }
}
