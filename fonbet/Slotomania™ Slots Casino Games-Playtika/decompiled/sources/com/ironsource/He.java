package com.ironsource;

import android.content.Context;
import com.ironsource.P3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class He {
    private final Oe a;
    private final C2750y1 b;
    private final F9 c;
    private final C2441ge d;
    private final T9 e;

    public He() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(Context context, Se serverResponse) {
        P3.c.C0182c m;
        JSONObject u;
        String c;
        P3.c.C0182c m2;
        String q;
        Boolean t;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        P3.c g = serverResponse.d().g();
        this.a.a(context, InterfaceC2738x7.a, (g == null || (t = g.t()) == null) ? true : t.booleanValue());
        P3.c g2 = serverResponse.d().g();
        if (g2 != null && (m2 = g2.m()) != null && (q = m2.q()) != null) {
            this.b.a(q);
            this.c.a(q);
            this.d.a(q);
        }
        P3.b f = serverResponse.d().f();
        if (f != null && (c = f.c()) != null) {
            this.e.b(c);
        }
        P3.c g3 = serverResponse.d().g();
        if (g3 == null || (m = g3.m()) == null || (u = m.u()) == null) {
            return;
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(u.toString());
        JSONObject optJSONObject = jsonObjectInit.optJSONObject("events");
        if (optJSONObject != null) {
            Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(\"events\")");
            jsonObjectInit.remove("events");
            Map<String, String> b = IronSourceUtils.b(optJSONObject);
            this.b.b(b);
            this.c.b(b);
            this.d.b(b);
        }
        Map<String, String> b2 = IronSourceUtils.b(jsonObjectInit);
        this.b.a(b2);
        this.c.a(b2);
        this.d.a(b2);
    }

    public He(Oe sharedPreferences, C2750y1 appEventsManager, F9 interstitialEventsManager, C2441ge rewardedVideoEventsManager, T9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        Intrinsics.checkNotNullParameter(interstitialEventsManager, "interstitialEventsManager");
        Intrinsics.checkNotNullParameter(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.a = sharedPreferences;
        this.b = appEventsManager;
        this.c = interstitialEventsManager;
        this.d = rewardedVideoEventsManager;
        this.e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ He(Oe oe, C2750y1 c2750y1, F9 f9, C2441ge c2441ge, T9 t9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oe, c2750y1, f9, c2441ge, (i & 16) != 0 ? new T9() : t9);
        oe = (i & 1) != 0 ? new Ne() : oe;
        c2750y1 = (i & 2) != 0 ? Jb.u.d().q() : c2750y1;
        if ((i & 4) != 0) {
            f9 = F9.i();
            Intrinsics.checkNotNullExpressionValue(f9, "getInstance()");
        }
        if ((i & 8) != 0) {
            c2441ge = C2441ge.i();
            Intrinsics.checkNotNullExpressionValue(c2441ge, "getInstance()");
        }
    }
}
