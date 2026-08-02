package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import xsna.brm0;
import xsna.gzs;
import xsna.j5g;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Od {
    private final C7 a;
    private final gzs<Long> b;
    private final I7 c;
    private final Executor d;

    public /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Long> {
        public static final a a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            Od.this.a(exc.getMessage());
        }

        public void onResult(Object obj) {
            Od.this.c();
        }
    }

    public Od() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    private final void d() {
        this.a.a(new C4632x5(EnumC4650y5.REGISTER_TRIGGER, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    public final void c(Context context) {
        d();
        try {
            MeasurementManager a2 = C4412l0.a(context);
            if (a2 == null) {
                a("could not obtain measurement manager");
            } else {
                a2.registerTrigger(a(context), this.d, a());
            }
        } catch (Exception e) {
            a(e.getMessage());
            C4452n4.d().a(e);
        }
    }

    public Od(C7 c7, gzs<Long> gzsVar, I7 i7, Executor executor) {
        this.a = c7;
        this.b = gzsVar;
        this.c = i7;
        this.d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> c = C4440ma.b().c();
        List<String> list = c != null ? c.get(com.ironsource.mediationsdk.metadata.a.b) : null;
        String str = list != null ? (String) j5g.Y(list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        InterfaceC4652y7 a2 = this.c.a();
        String a3 = IronSourceUtils.a(context);
        return new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter(EndpointParameters.Name.OS_VERSION, Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(O6.X0, a2.I(context)).appendQueryParameter(O6.M0, a2.z(context)).appendQueryParameter("auid", a2.e(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(O6.j0, String.valueOf(C4412l0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(this.b.invoke().longValue())).appendQueryParameter(X3.j.x, a2.d(context)).appendQueryParameter("deviceCarrier", a2.v(context)).appendQueryParameter("connectionType", a3).appendQueryParameter("wifi", String.valueOf(brm0.w(a3, "wifi", true))).build();
    }

    public /* synthetic */ Od(C7 c7, gzs gzsVar, I7 i7, Executor executor, int i, zcl zclVar) {
        this((i & 1) != 0 ? Kb.u.d().q() : c7, (i & 2) != 0 ? a.a : gzsVar, (i & 4) != 0 ? Kb.u.d() : i7, (i & 8) != 0 ? Executors.newSingleThreadExecutor() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.a.a(new C4632x5(EnumC4650y5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(new C4632x5(EnumC4650y5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
