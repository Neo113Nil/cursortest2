package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.ConnectionResult;
import io.appmetrica.analytics.impl.ap;
import io.sentry.ILogger;
import io.sentry.SpotlightIntegration;
import io.sentry.a5;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d1;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.e5;
import io.sentry.g1;
import io.sentry.g3;
import io.sentry.h4;
import io.sentry.i1;
import io.sentry.i4;
import io.sentry.i5;
import io.sentry.j3;
import io.sentry.k1;
import io.sentry.k2;
import io.sentry.k6;
import io.sentry.l6;
import io.sentry.m1;
import io.sentry.m4;
import io.sentry.n5;
import io.sentry.n6;
import io.sentry.o3;
import io.sentry.o4;
import io.sentry.o5;
import io.sentry.p4;
import io.sentry.q6;
import io.sentry.r4;
import io.sentry.s4;
import io.sentry.t4;
import io.sentry.t6;
import io.sentry.v6;
import io.sentry.z0;
import io.sentry.z2;
import io.sentry.z4;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 implements g6.d, d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4115a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4116b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4117c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4118d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4119e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4120f;

    public x0(Context context, x xVar, l1.a aVar) {
        this.f4116b = context;
        this.f4117c = xVar;
        this.f4118d = aVar;
        this.f4119e = new w0(this, true);
        this.f4120f = new w0(this, false);
    }

    public static ArrayList s(io.sentry.h0 h0Var) {
        ArrayList arrayList = new ArrayList(h0Var.f16446b);
        io.sentry.a aVar = h0Var.f16448d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        io.sentry.a aVar2 = h0Var.f16449e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        io.sentry.a aVar3 = h0Var.f16450f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        return arrayList;
    }

    public void A(boolean z5) {
        w0 w0Var = (w0) this.f4119e;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f4115a = z5;
        w0 w0Var2 = (w0) this.f4120f;
        Context context = (Context) this.f4116b;
        w0Var2.a(context, intentFilter2);
        if (this.f4115a) {
            w0Var.b(context, intentFilter);
        } else {
            w0Var.a(context, intentFilter);
        }
    }

    @Override // io.sentry.d1
    public void a(boolean z5) {
        long shutdownTimeoutMillis;
        b6 b6Var = (b6) this.f4116b;
        b6Var.getLogger().h(b5.INFO, "Closing SentryClient.", new Object[0]);
        if (z5) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = b6Var.getShutdownTimeoutMillis();
            } catch (IOException e7) {
                b6Var.getLogger().e(b5.WARNING, "Failed to close the connection to the Sentry Server.", e7);
            }
        }
        b(shutdownTimeoutMillis);
        ((io.sentry.logger.b) this.f4119e).a(z5);
        ((io.sentry.metrics.a) this.f4120f).a(z5);
        ((io.sentry.transport.g) this.f4117c).a(z5);
        for (io.sentry.c0 c0Var : b6Var.getEventProcessors()) {
            if (c0Var instanceof Closeable) {
                try {
                    ((Closeable) c0Var).close();
                } catch (IOException e9) {
                    b6Var.getLogger().h(b5.WARNING, "Failed to close the event processor {}.", c0Var, e9);
                }
            }
        }
        this.f4115a = false;
    }

    @Override // io.sentry.d1
    public void b(long j) {
        ((io.sentry.logger.b) this.f4119e).b(j);
        ((io.sentry.metrics.a) this.f4120f).b(j);
        ((io.sentry.transport.g) this.f4117c).b(j);
    }

    @Override // io.sentry.d1
    public void c(l6 l6Var, io.sentry.h0 h0Var) {
        b6 b6Var = (b6) this.f4116b;
        y4.a.C(l6Var, "Session is required.");
        String str = l6Var.f16621m;
        if (str == null || str.isEmpty()) {
            b6Var.getLogger().h(b5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            g1 serializer = b6Var.getSerializer();
            io.sentry.protocol.t sdkVersion = b6Var.getSdkVersion();
            y4.a.C(serializer, "Serializer is required.");
            l(new l1.a((io.sentry.protocol.v) null, sdkVersion, r4.d(serializer, l6Var)), h0Var);
        } catch (IOException e7) {
            b6Var.getLogger().e(b5.ERROR, "Failed to capture session.", e7);
        }
    }

    @Override // io.sentry.d1
    public e5.j d() {
        return ((io.sentry.transport.g) this.f4117c).d();
    }

    @Override // io.sentry.d1
    public boolean e() {
        return ((io.sentry.transport.g) this.f4117c).e();
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.v f(d6 d6Var, z0 z0Var, io.sentry.h0 h0Var) {
        b6 b6Var = (b6) this.f4116b;
        if (y(d6Var, h0Var)) {
            io.sentry.protocol.p pVar = d6Var.f16458d;
            io.sentry.protocol.c cVar = d6Var.f16456b;
            if (pVar == null) {
                d6Var.f16458d = z0Var.s();
            }
            if (d6Var.f16463i == null) {
                d6Var.f16463i = z0Var.getUser();
            }
            if (d6Var.f16459e == null) {
                d6Var.f16459e = new HashMap(new HashMap(z0Var.D()));
            } else {
                for (Map.Entry entry : z0Var.D().entrySet()) {
                    if (!d6Var.f16459e.containsKey(entry.getKey())) {
                        d6Var.f16459e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.c(z0Var.H()).f16754a.entrySet()) {
                if (!cVar.a(entry2.getKey())) {
                    cVar.k(entry2.getValue(), (String) entry2.getKey());
                }
            }
            i1 i5 = z0Var.i();
            if (cVar.i() == null) {
                if (i5 == null) {
                    cVar.v(v6.b(z0Var.y()));
                } else {
                    cVar.v(i5.v());
                }
            }
        }
        b6Var.getLogger().h(b5.DEBUG, "Capturing session replay: %s", d6Var.f16455a);
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        io.sentry.protocol.v vVar2 = d6Var.f16455a;
        if (vVar2 != null) {
            vVar = vVar2;
        }
        Iterator<io.sentry.c0> it = b6Var.getEventProcessors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 next = it.next();
            try {
                d6Var = next.c(d6Var, h0Var);
            } catch (Throwable th2) {
                b6Var.getLogger().b(b5.ERROR, th2, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (d6Var == null) {
                b6Var.getLogger().h(b5.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.EVENT_PROCESSOR, io.sentry.l.Replay);
                break;
            }
        }
        if (d6Var != null) {
            b6Var.getBeforeSendReplay();
        }
        if (d6Var == null) {
            return io.sentry.protocol.v.f16922b;
        }
        try {
            l1.a r5 = r(d6Var, h0Var.f16451g, t(z0Var, h0Var, d6Var, null), io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint")));
            h0Var.a();
            ((io.sentry.transport.g) this.f4117c).L(r5, h0Var);
            return vVar;
        } catch (IOException e7) {
            b6Var.getLogger().b(b5.WARNING, e7, "Capturing event %s failed.", vVar);
            return io.sentry.protocol.v.f16922b;
        }
    }

    @Override // g6.d
    public void g(ConnectionResult connectionResult) {
        ((e6.e) this.f4120f).f8705n.post(new g8.a(15, this, connectionResult, false));
    }

    @Override // io.sentry.d1
    public void h(d5 d5Var, z0 z0Var) {
        d5 v5;
        b6 b6Var = (b6) this.f4116b;
        d5 v10 = v(d5Var, z0Var.O());
        if (v10 == null || (v5 = v(v10, b6Var.getEventProcessors())) == null) {
            return;
        }
        b6Var.getLogs().getClass();
        ((io.sentry.logger.b) this.f4119e).d(v5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        r1.getLogger().h(io.sentry.b5.DEBUG, "Transaction was dropped as transaction name %s is ignored", r15.f16770p);
        r0 = r1.getClientReportRecorder();
        r2 = io.sentry.clientreport.e.EVENT_PROCESSOR;
        r0.b(r2, io.sentry.l.Transaction);
        r1.getClientReportRecorder().l(r2, io.sentry.l.Span, r15.f16772s.size() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        return io.sentry.protocol.v.f16922b;
     */
    @Override // io.sentry.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io.sentry.protocol.v i(io.sentry.protocol.e0 e0Var, t6 t6Var, z0 z0Var, io.sentry.h0 h0Var, j3 j3Var) {
        Pattern pattern;
        b6 b6Var = (b6) this.f4116b;
        io.sentry.h0 h0Var2 = h0Var == null ? new io.sentry.h0() : h0Var;
        if (y(e0Var, h0Var2)) {
            h0Var2.f16446b.addAll(z0Var.F());
        }
        b6Var.getLogger().h(b5.DEBUG, "Capturing transaction: %s", e0Var.f16455a);
        List<io.sentry.f0> ignoredTransactions = b6Var.getIgnoredTransactions();
        String str = e0Var.f16770p;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<io.sentry.f0> it = ignoredTransactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<io.sentry.f0> it2 = ignoredTransactions.iterator();
                    while (it2.hasNext()) {
                        try {
                            pattern = it2.next().f16392b;
                        } catch (Throwable unused) {
                        }
                        if (pattern == null ? false : pattern.matcher(str).matches()) {
                        }
                    }
                } else if (it.next().f16391a.equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        io.sentry.protocol.v vVar2 = e0Var.f16455a;
        if (vVar2 == null) {
            vVar2 = vVar;
        }
        if (y(e0Var, h0Var2)) {
            n(e0Var, z0Var);
            e0Var = w(e0Var, h0Var2, z0Var.O());
            if (e0Var == null) {
                b6Var.getLogger().h(b5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (e0Var != null) {
            e0Var = w(e0Var, h0Var2, b6Var.getEventProcessors());
        }
        io.sentry.protocol.e0 e0Var2 = e0Var;
        if (e0Var2 == null) {
            b6Var.getLogger().h(b5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return vVar;
        }
        ArrayList arrayList = e0Var2.f16772s;
        int size = arrayList.size();
        b6Var.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i5 = size - size2;
            b6Var.getLogger().h(b5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i5));
            b6Var.getClientReportRecorder().l(io.sentry.clientreport.e.BEFORE_SEND, io.sentry.l.Span, i5);
        }
        try {
            ArrayList s8 = s(h0Var2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = s8.iterator();
            while (it3.hasNext()) {
                ((io.sentry.a) it3.next()).getClass();
            }
            l1.a o3 = o(e0Var2, arrayList2, null, t6Var, j3Var);
            h0Var2.a();
            return o3 != null ? x(o3, h0Var2) : vVar2;
        } catch (io.sentry.exception.b | IOException e7) {
            b6Var.getLogger().b(b5.WARNING, e7, "Capturing transaction %s failed.", vVar2);
            return io.sentry.protocol.v.f16922b;
        }
    }

    @Override // io.sentry.d1
    public boolean isEnabled() {
        return this.f4115a;
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.v j(String str, b5 b5Var, z0 z0Var) {
        t4 t4Var = new t4();
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.f16865a = str;
        t4Var.q = nVar;
        t4Var.f17096u = b5Var;
        return m(t4Var, z0Var, null);
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.v k(g3 g3Var) {
        y4.a.C(g3Var, "profileChunk is required.");
        b6 b6Var = (b6) this.f4116b;
        b6Var.getLogger().h(b5.DEBUG, "Capturing profile chunk: %s", g3Var.f16427c);
        io.sentry.protocol.v vVar = g3Var.f16427c;
        io.sentry.protocol.d a7 = io.sentry.protocol.d.a(g3Var.f16425a, b6Var);
        if (a7 != null) {
            g3Var.f16425a = a7;
        }
        try {
            return x(new l1.a(new m4(vVar, b6Var.getSdkVersion(), null), Collections.singletonList(r4.c(g3Var, b6Var.getSerializer(), b6Var.getProfilerConverter()))), null);
        } catch (io.sentry.exception.b | IOException e7) {
            b6Var.getLogger().b(b5.WARNING, e7, "Capturing profile chunk %s failed.", vVar);
            return io.sentry.protocol.v.f16922b;
        }
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.v l(l1.a aVar, io.sentry.h0 h0Var) {
        try {
            h0Var.a();
            return x(aVar, h0Var);
        } catch (IOException e7) {
            ((b6) this.f4116b).getLogger().e(b5.ERROR, "Failed to capture envelope.", e7);
            return io.sentry.protocol.v.f16922b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0343, code lost:
    
        if ((r2.c() != null) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02d4, code lost:
    
        if (r0.f16616g != r5) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02e5, code lost:
    
        if (r0.f16612c.get() <= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r8.getLogger().h(io.sentry.b5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", r0.q);
        r8.getClientReportRecorder().b(io.sentry.clientreport.e.EVENT_PROCESSOR, io.sentry.l.Error);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        return io.sentry.protocol.v.f16922b;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0365 A[Catch: b -> 0x036b, IOException -> 0x036d, TryCatch #4 {b -> 0x036b, IOException -> 0x036d, blocks: (B:177:0x035b, B:153:0x035f, B:155:0x0365, B:156:0x0370, B:158:0x037b), top: B:176:0x035b }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x037b A[Catch: b -> 0x036b, IOException -> 0x036d, TRY_LEAVE, TryCatch #4 {b -> 0x036b, IOException -> 0x036d, blocks: (B:177:0x035b, B:153:0x035f, B:155:0x0365, B:156:0x0370, B:158:0x037b), top: B:176:0x035b }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028a  */
    @Override // io.sentry.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io.sentry.protocol.v m(t4 t4Var, z0 z0Var, io.sentry.h0 h0Var) {
        l6 l6Var;
        l6 l6Var2;
        boolean z5;
        String str;
        k1 n9;
        Object b10;
        l1.a o3;
        io.sentry.protocol.v vVar;
        io.sentry.protocol.h j;
        t4 t4Var2 = t4Var;
        b6 b6Var = (b6) this.f4116b;
        io.sentry.h0 h0Var2 = h0Var == null ? new io.sentry.h0() : h0Var;
        if (y(t4Var2, h0Var2) && z0Var != null) {
            h0Var2.f16446b.addAll(z0Var.F());
        }
        ILogger logger = b6Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "Capturing event: %s", t4Var2.f16455a);
        Throwable a7 = t4Var2.a();
        if (a7 != null && b6Var.getIgnoredExceptionsForType().contains(a7.getClass())) {
            b6Var.getLogger().h(b5Var, "Event was dropped as the exception %s is ignored", a7.getClass());
            b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.EVENT_PROCESSOR, io.sentry.l.Error);
            return io.sentry.protocol.v.f16922b;
        }
        List<io.sentry.f0> ignoredErrors = b6Var.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.n nVar = t4Var2.q;
            if (nVar != null) {
                String str2 = nVar.f16866b;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = nVar.f16865a;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable a10 = t4Var2.a();
            if (a10 != null) {
                hashSet.add(a10.toString());
            }
            Iterator<io.sentry.f0> it = ignoredErrors.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (hashSet.contains(it.next().f16391a)) {
                        break;
                    }
                } else {
                    for (io.sentry.f0 f0Var : ignoredErrors) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            Pattern pattern = f0Var.f16392b;
                            if (pattern == null ? false : pattern.matcher(str4).matches()) {
                            }
                        }
                    }
                }
            }
        }
        if (y(t4Var2, h0Var2)) {
            if (z0Var != null) {
                n(t4Var, z0Var);
                String str5 = t4Var2.f17097v;
                io.sentry.protocol.c cVar = t4Var2.f16456b;
                if (str5 == null) {
                    t4Var2.f17097v = z0Var.P();
                }
                if (t4Var2.f17098w == null) {
                    List N = z0Var.N();
                    t4Var2.f17098w = N != null ? new ArrayList(N) : null;
                }
                if (z0Var.x() != null) {
                    t4Var2.f17096u = z0Var.x();
                }
                i1 i5 = z0Var.i();
                if (cVar.i() == null) {
                    if (i5 == null) {
                        cVar.v(v6.b(z0Var.y()));
                    } else {
                        cVar.v(i5.v());
                    }
                }
                if (cVar.f() == null && (j = z0Var.j()) != null) {
                    cVar.p(j);
                }
                t4Var2 = u(t4Var2, h0Var2, z0Var.O());
            }
            if (t4Var2 == null) {
                b6Var.getLogger().h(b5.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.v.f16922b;
            }
        }
        t4 u10 = u(t4Var2, h0Var2, b6Var.getEventProcessors());
        if (u10 != null) {
            o5 beforeSend = b6Var.getBeforeSend();
            if (beforeSend != null) {
                try {
                    u10 = ((com.google.firebase.messaging.k) beforeSend).b(u10, h0Var2);
                } catch (Throwable th2) {
                    b6Var.getLogger().e(b5.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                    u10 = null;
                }
            }
            if (u10 == null) {
                b6Var.getLogger().h(b5.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.BEFORE_SEND, io.sentry.l.Error);
            }
        }
        t4 t4Var3 = u10;
        if (t4Var3 != null) {
            try {
                if (b6Var.isEnableEventSizeLimiting() && !h8.b.u(t4Var3, b6Var)) {
                    b6Var.getLogger().h(b5.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", t4Var3.f16455a, Long.valueOf(b6.MAX_EVENT_SIZE_BYTES));
                    b6Var.getOnOversizedEvent();
                    List list = t4Var3.f16466m;
                    if (list != null && !list.isEmpty()) {
                        t4Var3.f16466m = null;
                        b6Var.getLogger().h(b5.DEBUG, "Removed breadcrumbs to reduce size of event %s", t4Var3.f16455a);
                    }
                    if (!h8.b.u(t4Var3, b6Var)) {
                        h8.b.D(t4Var3, b6Var);
                        if (!h8.b.u(t4Var3, b6Var)) {
                            b6Var.getLogger().h(b5.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", t4Var3.f16455a);
                        }
                    }
                }
            } catch (Throwable th3) {
                b6Var.getLogger().e(b5.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th3);
            }
        }
        if (t4Var3 == null) {
            return io.sentry.protocol.v.f16922b;
        }
        l6 z7 = z0Var != null ? z0Var.z(new ap(12)) : null;
        if (z7 != null) {
            if (z7.f16616g != k6.Ok) {
                l6Var2 = null;
                io.sentry.util.i a11 = b6Var.getSampleRate() == null ? null : io.sentry.util.j.a();
                if (b6Var.getSampleRate() != null && a11 != null && b6Var.getSampleRate().doubleValue() < a11.c()) {
                    b6Var.getLogger().h(b5.DEBUG, "Event %s was dropped due to sampling decision.", t4Var3.f16455a);
                    b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.SAMPLE_RATE, io.sentry.l.Error);
                    t4Var3 = null;
                }
                if (l6Var2 != null) {
                    if (z7 != null) {
                        k6 k6Var = l6Var2.f16616g;
                        k6 k6Var2 = k6.Crashed;
                        if (k6Var == k6Var2) {
                        }
                        if (l6Var2.f16612c.get() > 0) {
                        }
                    }
                    z5 = true;
                    if (t4Var3 != null && !z5) {
                        b6Var.getLogger().h(b5.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
                        return io.sentry.protocol.v.f16922b;
                    }
                    io.sentry.protocol.v vVar2 = (t4Var3 != null || (vVar = t4Var3.f16455a) == null) ? io.sentry.protocol.v.f16922b : vVar;
                    boolean isInstance = io.sentry.hints.b.class.isInstance(h0Var2.b("sentry:typeCheckHint"));
                    boolean z10 = (io.sentry.hints.d.class.isInstance(h0Var2.b("sentry:typeCheckHint")) || io.sentry.android.core.r0.class.isInstance(h0Var2.b("sentry:typeCheckHint"))) ? false : true;
                    if (t4Var3 != null && !isInstance && !z10) {
                        if (!t4Var3.d()) {
                        }
                        b6Var.getReplayController().n(Boolean.valueOf(t4Var3.c() == null));
                    }
                    if (t4Var3 == null) {
                        try {
                            str = t4Var3.f17097v;
                        } catch (io.sentry.exception.b e7) {
                            e = e7;
                            b6Var.getLogger().b(b5.WARNING, e, "Capturing event %s failed.", vVar2);
                            vVar2 = io.sentry.protocol.v.f16922b;
                            if (z0Var != null) {
                            }
                            return vVar2;
                        } catch (IOException e9) {
                            e = e9;
                            b6Var.getLogger().b(b5.WARNING, e, "Capturing event %s failed.", vVar2);
                            vVar2 = io.sentry.protocol.v.f16922b;
                            if (z0Var != null) {
                            }
                            return vVar2;
                        }
                    } else {
                        str = null;
                    }
                    o3 = o(t4Var3, t4Var3 == null ? s(h0Var2) : null, l6Var2, t(z0Var, h0Var2, t4Var3, str), null);
                    h0Var2.a();
                    if (o3 != null) {
                        vVar2 = x(o3, h0Var2);
                    }
                    if (z0Var != null && (n9 = z0Var.n()) != null && io.sentry.hints.l.class.isInstance(h0Var2.b("sentry:typeCheckHint"))) {
                        b10 = h0Var2.b("sentry:typeCheckHint");
                        if (b10 instanceof io.sentry.hints.c) {
                            n9.e(q6.ABORTED, false, null);
                        } else {
                            ((io.sentry.hints.c) b10).g(n9.q());
                            n9.e(q6.ABORTED, false, h0Var2);
                        }
                    }
                    return vVar2;
                }
                z5 = false;
                if (t4Var3 != null) {
                }
                if (t4Var3 != null) {
                }
                boolean isInstance2 = io.sentry.hints.b.class.isInstance(h0Var2.b("sentry:typeCheckHint"));
                if (io.sentry.hints.d.class.isInstance(h0Var2.b("sentry:typeCheckHint"))) {
                }
                if (t4Var3 != null) {
                    if (!t4Var3.d()) {
                    }
                    b6Var.getReplayController().n(Boolean.valueOf(t4Var3.c() == null));
                }
                if (t4Var3 == null) {
                }
                o3 = o(t4Var3, t4Var3 == null ? s(h0Var2) : null, l6Var2, t(z0Var, h0Var2, t4Var3, str), null);
                h0Var2.a();
                if (o3 != null) {
                }
                if (z0Var != null) {
                    b10 = h0Var2.b("sentry:typeCheckHint");
                    if (b10 instanceof io.sentry.hints.c) {
                    }
                }
                return vVar2;
            }
        }
        if (k2.x.D(h0Var2)) {
            if (z0Var != null) {
                l6Var = z0Var.z(new androidx.transition.i(this, t4Var3, h0Var2, 4));
                l6Var2 = l6Var;
                if (b6Var.getSampleRate() == null) {
                }
                if (b6Var.getSampleRate() != null) {
                    b6Var.getLogger().h(b5.DEBUG, "Event %s was dropped due to sampling decision.", t4Var3.f16455a);
                    b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.SAMPLE_RATE, io.sentry.l.Error);
                    t4Var3 = null;
                }
                if (l6Var2 != null) {
                }
                z5 = false;
                if (t4Var3 != null) {
                }
                if (t4Var3 != null) {
                }
                boolean isInstance22 = io.sentry.hints.b.class.isInstance(h0Var2.b("sentry:typeCheckHint"));
                if (io.sentry.hints.d.class.isInstance(h0Var2.b("sentry:typeCheckHint"))) {
                }
                if (t4Var3 != null) {
                }
                if (t4Var3 == null) {
                }
                o3 = o(t4Var3, t4Var3 == null ? s(h0Var2) : null, l6Var2, t(z0Var, h0Var2, t4Var3, str), null);
                h0Var2.a();
                if (o3 != null) {
                }
                if (z0Var != null) {
                }
                return vVar2;
            }
            b6Var.getLogger().h(b5.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        l6Var = null;
        l6Var2 = l6Var;
        if (b6Var.getSampleRate() == null) {
        }
        if (b6Var.getSampleRate() != null) {
        }
        if (l6Var2 != null) {
        }
        z5 = false;
        if (t4Var3 != null) {
        }
        if (t4Var3 != null) {
        }
        boolean isInstance222 = io.sentry.hints.b.class.isInstance(h0Var2.b("sentry:typeCheckHint"));
        if (io.sentry.hints.d.class.isInstance(h0Var2.b("sentry:typeCheckHint"))) {
        }
        if (t4Var3 != null) {
        }
        if (t4Var3 == null) {
        }
        o3 = o(t4Var3, t4Var3 == null ? s(h0Var2) : null, l6Var2, t(z0Var, h0Var2, t4Var3, str), null);
        h0Var2.a();
        if (o3 != null) {
        }
        if (z0Var != null) {
        }
        return vVar2;
    }

    public void n(h4 h4Var, z0 z0Var) {
        if (z0Var != null) {
            if (h4Var.f16458d == null) {
                h4Var.f16458d = z0Var.s();
            }
            if (h4Var.f16463i == null) {
                h4Var.f16463i = z0Var.getUser();
            }
            if (h4Var.f16459e == null) {
                h4Var.f16459e = new HashMap(new HashMap(z0Var.D()));
            } else {
                for (Map.Entry entry : z0Var.D().entrySet()) {
                    if (!h4Var.f16459e.containsKey(entry.getKey())) {
                        h4Var.f16459e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (h4Var.f16466m == null) {
                h4Var.f16466m = new ArrayList(new ArrayList(z0Var.w()));
            } else {
                Queue w10 = z0Var.w();
                List list = h4Var.f16466m;
                if (list != null && !w10.isEmpty()) {
                    list.addAll(w10);
                    Collections.sort(list, (i4) this.f4118d);
                }
            }
            if (h4Var.f16468o == null) {
                h4Var.f16468o = new HashMap(new HashMap(z0Var.getExtras()));
            } else {
                for (Map.Entry entry2 : z0Var.getExtras().entrySet()) {
                    if (!h4Var.f16468o.containsKey(entry2.getKey())) {
                        h4Var.f16468o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVar = h4Var.f16456b;
            for (Map.Entry entry3 : new io.sentry.protocol.c(z0Var.H()).f16754a.entrySet()) {
                if (!cVar.a(entry3.getKey())) {
                    cVar.k(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public l1.a o(h4 h4Var, ArrayList arrayList, l6 l6Var, t6 t6Var, j3 j3Var) {
        io.sentry.protocol.v vVar;
        b6 b6Var = (b6) this.f4116b;
        ArrayList arrayList2 = new ArrayList();
        int i5 = 2;
        int i10 = 10;
        if (h4Var != null) {
            g1 serializer = b6Var.getSerializer();
            Charset charset = r4.f16984d;
            y4.a.C(serializer, "ISerializer is required.");
            d7.e eVar = new d7.e(i10, new com.google.firebase.messaging.i(i5, serializer, h4Var));
            arrayList2.add(new r4(new s4(a5.resolve(h4Var), new o4(eVar, 6), "application/json", null, null), new o4(eVar, 8)));
            vVar = h4Var.f16455a;
        } else {
            vVar = null;
        }
        if (l6Var != null) {
            arrayList2.add(r4.d(b6Var.getSerializer(), l6Var));
        }
        if (j3Var != null) {
            long maxTraceFileSize = b6Var.getMaxTraceFileSize();
            g1 serializer2 = b6Var.getSerializer();
            Charset charset2 = r4.f16984d;
            File file = j3Var.f16539a;
            d7.e eVar2 = new d7.e(i10, new p4(file, maxTraceFileSize, j3Var, serializer2));
            arrayList2.add(new r4(new s4(a5.Profile, new o4(eVar2, 4), "application-json", file.getName(), null), new o4(eVar2, 5)));
            if (vVar == null) {
                vVar = new io.sentry.protocol.v(j3Var.f16559w);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.sentry.a aVar = (io.sentry.a) it.next();
                g1 serializer3 = b6Var.getSerializer();
                ILogger logger = b6Var.getLogger();
                long maxAttachmentSize = b6Var.getMaxAttachmentSize();
                Charset charset3 = r4.f16984d;
                d7.e eVar3 = new d7.e(i10, new p4(aVar, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new r4(new s4(a5.Attachment, new o4(eVar3, i5), aVar.f15436e, aVar.f15435d, aVar.f15437f), new o4(eVar3, 3)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new l1.a(new m4(vVar, b6Var.getSdkVersion(), t6Var), arrayList2);
    }

    public l1.a p(e5 e5Var) {
        ArrayList arrayList = new ArrayList();
        b6 b6Var = (b6) this.f4116b;
        g1 serializer = b6Var.getSerializer();
        Charset charset = r4.f16984d;
        y4.a.C(serializer, "ISerializer is required.");
        d7.e eVar = new d7.e(10, new com.google.firebase.messaging.i(5, serializer, e5Var));
        arrayList.add(new r4(new s4(a5.Log, new o4(eVar, 16), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(e5Var.f16381a.size())), new o4(eVar, 17)));
        return new l1.a(new m4(null, b6Var.getSdkVersion(), null), arrayList);
    }

    public l1.a q(i5 i5Var) {
        ArrayList arrayList = new ArrayList();
        b6 b6Var = (b6) this.f4116b;
        g1 serializer = b6Var.getSerializer();
        Charset charset = r4.f16984d;
        y4.a.C(serializer, "ISerializer is required.");
        d7.e eVar = new d7.e(10, new com.google.firebase.messaging.i(6, serializer, i5Var));
        arrayList.add(new r4(new s4(a5.TraceMetric, new o4(eVar, 0), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(i5Var.f16489a.size())), new o4(eVar, 1)));
        return new l1.a(new m4(null, b6Var.getSdkVersion(), null), arrayList);
    }

    public l1.a r(final d6 d6Var, final o3 o3Var, t6 t6Var, final boolean z5) {
        ArrayList arrayList = new ArrayList();
        b6 b6Var = (b6) this.f4116b;
        final g1 serializer = b6Var.getSerializer();
        final ILogger logger = b6Var.getLogger();
        Charset charset = r4.f16984d;
        final File file = d6Var.f16320p;
        d7.e eVar = new d7.e(10, new Callable() { // from class: io.sentry.q4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g1 g1Var = g1.this;
                d6 d6Var2 = d6Var;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z7 = z5;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f16984d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            g1Var.a(d6Var2, bufferedWriter);
                            linkedHashMap.put(a5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            o3 o3Var2 = o3Var;
                            if (o3Var2 != null) {
                                g1Var.a(o3Var2, bufferedWriter);
                                linkedHashMap.put(a5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] v5 = io.sentry.config.a.v(10485760L, file2.getPath());
                                if (v5.length > 0) {
                                    linkedHashMap.put(a5.ReplayVideo.getItemType(), v5);
                                }
                            }
                            byte[] j = r4.j(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z7) {
                                    return j;
                                }
                            }
                            return j;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        iLogger.e(b5.ERROR, "Could not serialize replay recording", th2);
                        if (file2 == null) {
                            return null;
                        }
                        if (z7) {
                            io.sentry.config.a.g(file2.getParentFile());
                            return null;
                        }
                        file2.delete();
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z7) {
                                io.sentry.config.a.g(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new r4(new s4(a5.ReplayVideo, new o4(eVar, 11), null, null, null), new o4(eVar, 12)));
        return new l1.a(new m4(d6Var.f16455a, b6Var.getSessionReplay().f16409k, t6Var), arrayList);
    }

    public t6 t(z0 z0Var, io.sentry.h0 h0Var, h4 h4Var, String str) {
        b6 b6Var = (b6) this.f4116b;
        if (io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            if (h4Var != null) {
                io.sentry.c cVar = new io.sentry.c(b6Var.getLogger());
                io.sentry.protocol.c cVar2 = h4Var.f16456b;
                n6 i5 = cVar2.i();
                cVar.d("sentry-trace_id", i5 != null ? i5.f16667a.toString() : null);
                cVar.d("sentry-public_key", b6Var.retrieveParsedDsn().f17267b);
                cVar.d("sentry-release", h4Var.f16460f);
                cVar.d("sentry-environment", h4Var.f16461g);
                cVar.d("sentry-transaction", str);
                if (cVar.f16223f) {
                    cVar.f16220c = null;
                }
                cVar.d("sentry-sampled", null);
                if (cVar.f16223f) {
                    cVar.f16221d = null;
                }
                Object c2 = cVar2.c("replay_id");
                if (c2 != null && !c2.toString().equals(io.sentry.protocol.v.f16922b.toString())) {
                    cVar.d("sentry-replay_id", c2.toString());
                    cVar2.f16754a.remove("replay_id");
                }
                cVar.f16223f = false;
                return cVar.f();
            }
        } else if (z0Var != null) {
            k1 n9 = z0Var.n();
            return n9 != null ? n9.b() : ((io.sentry.c) z0Var.I(new com.google.firebase.messaging.g(17, z0Var, b6Var)).f366d).f();
        }
        return null;
    }

    public t4 u(t4 t4Var, io.sentry.h0 h0Var, List list) {
        b6 b6Var = (b6) this.f4116b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 c0Var = (io.sentry.c0) it.next();
            try {
                boolean z5 = c0Var instanceof io.sentry.android.core.j0;
                boolean isInstance = io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint"));
                if (isInstance && z5) {
                    ((io.sentry.android.core.j0) c0Var).k(t4Var, h0Var);
                } else if (!isInstance && !z5) {
                    t4Var = c0Var.k(t4Var, h0Var);
                }
            } catch (Throwable th2) {
                b6Var.getLogger().b(b5.ERROR, th2, "An exception occurred while processing event by processor: %s", c0Var.getClass().getName());
            }
            if (t4Var == null) {
                b6Var.getLogger().h(b5.DEBUG, "Event was dropped by a processor: %s", c0Var.getClass().getName());
                b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.EVENT_PROCESSOR, io.sentry.l.Error);
                break;
            }
        }
        return t4Var;
    }

    public d5 v(d5 d5Var, List list) {
        b6 b6Var = (b6) this.f4116b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 c0Var = (io.sentry.c0) it.next();
            try {
                d5Var = c0Var.r(d5Var);
            } catch (Throwable th2) {
                b6Var.getLogger().b(b5.ERROR, th2, "An exception occurred while processing log event by processor: %s", c0Var.getClass().getName());
            }
            if (d5Var == null) {
                b6Var.getLogger().h(b5.DEBUG, "Log event was dropped by a processor: %s", c0Var.getClass().getName());
                b6Var.getClientReportRecorder().b(io.sentry.clientreport.e.EVENT_PROCESSOR, io.sentry.l.LogItem);
                break;
            }
        }
        return d5Var;
    }

    public io.sentry.protocol.e0 w(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var, List list) {
        b6 b6Var = (b6) this.f4116b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 c0Var = (io.sentry.c0) it.next();
            int size = e0Var.f16772s.size();
            try {
                e0Var = c0Var.n(e0Var, h0Var);
            } catch (Throwable th2) {
                b6Var.getLogger().b(b5.ERROR, th2, "An exception occurred while processing transaction by processor: %s", c0Var.getClass().getName());
            }
            int size2 = e0Var == null ? 0 : e0Var.f16772s.size();
            if (e0Var == null) {
                b6Var.getLogger().h(b5.DEBUG, "Transaction was dropped by a processor: %s", c0Var.getClass().getName());
                io.sentry.clientreport.g clientReportRecorder = b6Var.getClientReportRecorder();
                io.sentry.clientreport.e eVar = io.sentry.clientreport.e.EVENT_PROCESSOR;
                clientReportRecorder.b(eVar, io.sentry.l.Transaction);
                b6Var.getClientReportRecorder().l(eVar, io.sentry.l.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i5 = size - size2;
                b6Var.getLogger().h(b5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i5), c0Var.getClass().getName());
                b6Var.getClientReportRecorder().l(io.sentry.clientreport.e.EVENT_PROCESSOR, io.sentry.l.Span, i5);
            }
        }
        return e0Var;
    }

    public io.sentry.protocol.v x(l1.a aVar, io.sentry.h0 h0Var) {
        io.sentry.transport.g gVar = (io.sentry.transport.g) this.f4117c;
        b6 b6Var = (b6) this.f4116b;
        n5 beforeEnvelopeCallback = b6Var.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f15426c.submit(new androidx.appcompat.app.t(21, spotlightIntegration, aVar));
                } catch (RejectedExecutionException e7) {
                    spotlightIntegration.f15425b.e(b5.WARNING, "Spotlight envelope submission rejected.", e7);
                }
            } catch (Throwable th2) {
                b6Var.getLogger().e(b5.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        z4.d().c(b6Var.getLogger());
        if (h0Var == null) {
            gVar.a0(aVar);
        } else {
            gVar.L(aVar, h0Var);
        }
        io.sentry.protocol.v vVar = ((m4) aVar.f19314b).f16641a;
        return vVar != null ? vVar : io.sentry.protocol.v.f16922b;
    }

    public boolean y(h4 h4Var, io.sentry.h0 h0Var) {
        if (k2.x.D(h0Var)) {
            return true;
        }
        ((b6) this.f4116b).getLogger().h(b5.DEBUG, "Event was cached so not applying scope: %s", h4Var.f16455a);
        return false;
    }

    public void z(ConnectionResult connectionResult) {
        e6.p pVar = (e6.p) ((e6.e) this.f4120f).j.get((e6.a) this.f4117c);
        if (pVar != null) {
            pVar.m(connectionResult);
        }
    }

    public x0(e6.e eVar, d6.c cVar, e6.a aVar) {
        Objects.requireNonNull(eVar);
        this.f4120f = eVar;
        this.f4118d = null;
        this.f4119e = null;
        this.f4115a = false;
        this.f4116b = cVar;
        this.f4117c = aVar;
    }

    public x0(b6 b6Var) {
        this.f4118d = new i4();
        this.f4116b = b6Var;
        this.f4115a = true;
        m1 transportFactory = b6Var.getTransportFactory();
        if (transportFactory instanceof z2) {
            transportFactory = new k2();
            b6Var.setTransportFactory(transportFactory);
        }
        io.sentry.z retrieveParsedDsn = b6Var.retrieveParsedDsn();
        String sentryClientName = b6Var.getSentryClientName();
        URI uri = retrieveParsedDsn.f17268c;
        String uri2 = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = retrieveParsedDsn.f17267b;
        String str2 = retrieveParsedDsn.f17266a;
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(sentryClientName);
        sb2.append(",sentry_key=");
        sb2.append(str);
        sb2.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String sb3 = sb2.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put("X-Sentry-Auth", sb3);
        this.f4117c = transportFactory.j(b6Var, new io.sentry.internal.debugmeta.c(uri2, hashMap));
        if (b6Var.getLogs().f17101a) {
            this.f4119e = b6Var.getLogs().f17102b.c(b6Var, this);
        } else {
            this.f4119e = io.sentry.logger.e.f16634b;
        }
        if (b6Var.getMetrics().f17151a) {
            this.f4120f = b6Var.getMetrics().f17152b.mo103c(b6Var, this);
        } else {
            this.f4120f = io.sentry.metrics.c.f16657a;
        }
    }
}
