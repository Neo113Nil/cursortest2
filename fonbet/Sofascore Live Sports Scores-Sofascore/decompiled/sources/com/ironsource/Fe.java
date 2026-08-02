package com.ironsource;

import android.content.Context;
import com.ironsource.M3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fe {

    @NotNull
    private final Me a;

    @NotNull
    private final C4369w1 b;

    @NotNull
    private final F9 c;

    @NotNull
    private final C4078fe d;

    @NotNull
    private final T9 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Fe(Me me, C4369w1 c4369w1, F9 f9, C4078fe c4078fe, T9 t9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(me, c4369w1, f9, c4078fe, (i & 16) != 0 ? new T9() : t9);
        me = (i & 1) != 0 ? new Le() : me;
        c4369w1 = (i & 2) != 0 ? Ib.v.d().q() : c4369w1;
        if ((i & 4) != 0) {
            f9 = F9.i();
            f9.getClass();
        }
        if ((i & 8) != 0) {
            c4078fe = C4078fe.i();
            c4078fe.getClass();
        }
    }

    public final void a(@NotNull Context context, @NotNull Qe qe) {
        M3.c.C0189c m;
        JSONObject u;
        String c;
        M3.c.C0189c m2;
        String q;
        Boolean t;
        context.getClass();
        qe.getClass();
        M3.c g = qe.d().g();
        this.a.a(context, InterfaceC4339u7.a, (g == null || (t = g.t()) == null) ? true : t.booleanValue());
        M3.c g2 = qe.d().g();
        if (g2 != null && (m2 = g2.m()) != null && (q = m2.q()) != null) {
            this.b.a(q);
            this.c.a(q);
            this.d.a(q);
        }
        M3.b f = qe.d().f();
        if (f != null && (c = f.c()) != null) {
            this.e.b(c);
        }
        M3.c g3 = qe.d().g();
        if (g3 == null || (m = g3.m()) == null || (u = m.u()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(u.toString());
        JSONObject optJSONObject = jSONObject.optJSONObject("events");
        if (optJSONObject != null) {
            jSONObject.remove("events");
            Map<String, String> b = IronSourceUtils.b(optJSONObject);
            this.b.b(b);
            this.c.b(b);
            this.d.b(b);
        }
        Map<String, String> b2 = IronSourceUtils.b(jSONObject);
        this.b.a(b2);
        this.c.a(b2);
        this.d.a(b2);
    }

    public Fe(@NotNull Me me, @NotNull C4369w1 c4369w1, @NotNull F9 f9, @NotNull C4078fe c4078fe, @NotNull T9 t9) {
        me.getClass();
        c4369w1.getClass();
        f9.getClass();
        c4078fe.getClass();
        t9.getClass();
        this.a = me;
        this.b = c4369w1;
        this.c = f9;
        this.d = c4078fe;
        this.e = t9;
    }

    public Fe() {
        this(null, null, null, null, null, 31, null);
    }
}
