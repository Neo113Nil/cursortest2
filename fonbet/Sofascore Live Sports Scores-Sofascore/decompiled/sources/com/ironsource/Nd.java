package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.ot8;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nd {

    @NotNull
    private final InterfaceC4411y7 a;

    @NotNull
    private final Function0<Long> b;

    @NotNull
    private final F7 c;

    @NotNull
    private final Executor d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a extends ot8 implements Function0<Long> {
        public static final a a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception exc) {
            exc.getClass();
            Nd.this.a(exc.getMessage());
        }

        public void onResult(@Nullable Object obj) {
            Nd.this.c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Nd(InterfaceC4411y7 interfaceC4411y7, Function0 function0, F7 f7, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4411y7, function0, f7, executor);
        interfaceC4411y7 = (i & 1) != 0 ? Ib.v.d().q() : interfaceC4411y7;
        function0 = (i & 2) != 0 ? a.a : function0;
        f7 = (i & 4) != 0 ? Ib.v.d() : f7;
        if ((i & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            executor.getClass();
        }
    }

    private final Uri a(Context context) {
        InterfaceC4339u7 a2 = this.c.a();
        String a3 = IronSourceUtils.a(context);
        Uri build = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(L6.X0, a2.I(context)).appendQueryParameter(L6.M0, a2.z(context)).appendQueryParameter("auid", a2.e(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(L6.j0, String.valueOf(C4171l0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(((Number) this.b.invoke()).longValue())).appendQueryParameter(U3.j.x, a2.d(context)).appendQueryParameter("deviceCarrier", a2.v(context)).appendQueryParameter("connectionType", a3).appendQueryParameter(Q3.b, String.valueOf(kotlin.text.c.o(a3, Q3.b, true))).build();
        build.getClass();
        return build;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> c = C4181la.b().c();
        List<String> list = c != null ? c.get(com.ironsource.mediationsdk.metadata.a.b) : null;
        String str = list != null ? (String) CollectionsKt.Y(list) : null;
        return str == null ? "" : str;
    }

    private final void d() {
        this.a.a(new C4355v5(EnumC4373w5.REGISTER_TRIGGER, (JSONObject) null));
    }

    public final void c(@NotNull Context context) {
        context.getClass();
        d();
        try {
            MeasurementManager a2 = C4171l0.a(context);
            if (a2 == null) {
                a("could not obtain measurement manager");
            } else {
                a2.registerTrigger(a(context), this.d, a());
            }
        } catch (Exception e) {
            a(e.getMessage());
            C4157k4.d().a(e);
        }
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    public Nd(@NotNull InterfaceC4411y7 interfaceC4411y7, @NotNull Function0<Long> function0, @NotNull F7 f7, @NotNull Executor executor) {
        interfaceC4411y7.getClass();
        function0.getClass();
        f7.getClass();
        executor.getClass();
        this.a = interfaceC4411y7;
        this.b = function0;
        this.c = f7;
        this.d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.a.a(new C4355v5(EnumC4373w5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    public Nd() {
        this(null, null, null, null, 15, null);
    }

    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(new C4355v5(EnumC4373w5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
