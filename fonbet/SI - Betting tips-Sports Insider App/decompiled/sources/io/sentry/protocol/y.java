package io.sentry.protocol;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import io.sentry.m6;
import io.sentry.n6;
import io.sentry.p6;
import io.sentry.q6;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f16931a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f16932b;

    /* renamed from: c, reason: collision with root package name */
    public final v f16933c;

    /* renamed from: d, reason: collision with root package name */
    public final p6 f16934d;

    /* renamed from: e, reason: collision with root package name */
    public final p6 f16935e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16936f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16937g;

    /* renamed from: h, reason: collision with root package name */
    public final q6 f16938h;

    /* renamed from: i, reason: collision with root package name */
    public final String f16939i;
    public final Map j;

    /* renamed from: k, reason: collision with root package name */
    public Map f16940k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f16941l;

    /* renamed from: m, reason: collision with root package name */
    public ConcurrentHashMap f16942m;

    public y(Double d10, Double d11, v vVar, p6 p6Var, p6 p6Var2, String str, String str2, q6 q6Var, String str3, Map map, Map map2, Map map3) {
        this.f16931a = d10;
        this.f16932b = d11;
        this.f16933c = vVar;
        this.f16934d = p6Var;
        this.f16935e = p6Var2;
        this.f16936f = str;
        this.f16937g = str2;
        this.f16938h = q6Var;
        this.f16939i = str3;
        this.j = map;
        this.f16941l = map2;
        this.f16940k = map3;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("start_timestamp");
        BigDecimal valueOf = BigDecimal.valueOf(this.f16931a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        aVar.H(iLogger, valueOf.setScale(6, roundingMode));
        Double d10 = this.f16932b;
        if (d10 != null) {
            aVar.u("timestamp");
            aVar.H(iLogger, BigDecimal.valueOf(d10.doubleValue()).setScale(6, roundingMode));
        }
        aVar.u("trace_id");
        aVar.H(iLogger, this.f16933c);
        aVar.u("span_id");
        aVar.H(iLogger, this.f16934d);
        p6 p6Var = this.f16935e;
        if (p6Var != null) {
            aVar.u("parent_span_id");
            aVar.H(iLogger, p6Var);
        }
        aVar.u("op");
        aVar.K(this.f16936f);
        String str = this.f16937g;
        if (str != null) {
            aVar.u("description");
            aVar.K(str);
        }
        q6 q6Var = this.f16938h;
        if (q6Var != null) {
            aVar.u(PredictionTable.statusColumn);
            aVar.H(iLogger, q6Var);
        }
        String str2 = this.f16939i;
        if (str2 != null) {
            aVar.u("origin");
            aVar.H(iLogger, str2);
        }
        Map map = this.j;
        if (!map.isEmpty()) {
            aVar.u("tags");
            aVar.H(iLogger, map);
        }
        if (this.f16940k != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f16940k);
        }
        Map map2 = this.f16941l;
        if (!map2.isEmpty()) {
            aVar.u("measurements");
            aVar.H(iLogger, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.f16942m;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16942m, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }

    public y(m6 m6Var) {
        ConcurrentHashMap concurrentHashMap = m6Var.f16655k;
        n6 n6Var = m6Var.f16648c;
        this.f16937g = n6Var.f16672f;
        this.f16936f = n6Var.f16671e;
        this.f16934d = n6Var.f16668b;
        this.f16935e = n6Var.f16669c;
        this.f16933c = n6Var.f16667a;
        this.f16938h = n6Var.f16673g;
        this.f16939i = n6Var.f16675i;
        ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A(n6Var.f16674h);
        this.j = A == null ? new ConcurrentHashMap() : A;
        ConcurrentHashMap A2 = com.google.android.play.core.appupdate.b.A(m6Var.f16656l);
        this.f16941l = A2 == null ? new ConcurrentHashMap() : A2;
        this.f16932b = m6Var.f16647b == null ? null : Double.valueOf(m6Var.f16646a.c(r2) / 1.0E9d);
        this.f16931a = Double.valueOf(m6Var.f16646a.d() / 1.0E9d);
        this.f16940k = concurrentHashMap;
        n6Var.f16679n.j();
    }
}
