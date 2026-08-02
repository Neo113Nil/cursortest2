package io.sentry;

import com.sports.insider.data.repository.room.live.LiveTable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t4 extends h4 implements c2 {

    /* renamed from: p, reason: collision with root package name */
    public Date f17092p;
    public io.sentry.protocol.n q;

    /* renamed from: r, reason: collision with root package name */
    public String f17093r;

    /* renamed from: s, reason: collision with root package name */
    public com.android.billingclient.api.m f17094s;

    /* renamed from: t, reason: collision with root package name */
    public com.android.billingclient.api.m f17095t;

    /* renamed from: u, reason: collision with root package name */
    public b5 f17096u;

    /* renamed from: v, reason: collision with root package name */
    public String f17097v;

    /* renamed from: w, reason: collision with root package name */
    public List f17098w;

    /* renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f17099x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractMap f17100y;

    public t4(Throwable th2) {
        this();
        this.j = th2;
    }

    public final io.sentry.protocol.u c() {
        Boolean bool;
        com.android.billingclient.api.m mVar = this.f17095t;
        if (mVar == null) {
            return null;
        }
        Iterator it = mVar.f4046a.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.u uVar = (io.sentry.protocol.u) it.next();
            io.sentry.protocol.m mVar2 = uVar.f16920f;
            if (mVar2 != null && (bool = mVar2.f16858d) != null && !bool.booleanValue()) {
                return uVar;
            }
        }
        return null;
    }

    public final boolean d() {
        com.android.billingclient.api.m mVar = this.f17095t;
        return (mVar == null || mVar.f4046a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("timestamp");
        aVar.H(iLogger, this.f17092p);
        if (this.q != null) {
            aVar.u(LiveTable.messageColumn);
            aVar.H(iLogger, this.q);
        }
        if (this.f17093r != null) {
            aVar.u("logger");
            aVar.K(this.f17093r);
        }
        com.android.billingclient.api.m mVar = this.f17094s;
        if (mVar != null && !mVar.f4046a.isEmpty()) {
            aVar.u("threads");
            aVar.j();
            aVar.u("values");
            aVar.H(iLogger, this.f17094s.f4046a);
            aVar.o();
        }
        com.android.billingclient.api.m mVar2 = this.f17095t;
        if (mVar2 != null && !mVar2.f4046a.isEmpty()) {
            aVar.u("exception");
            aVar.j();
            aVar.u("values");
            aVar.H(iLogger, this.f17095t.f4046a);
            aVar.o();
        }
        if (this.f17096u != null) {
            aVar.u("level");
            aVar.H(iLogger, this.f17096u);
        }
        if (this.f17097v != null) {
            aVar.u("transaction");
            aVar.K(this.f17097v);
        }
        if (this.f17098w != null) {
            aVar.u("fingerprint");
            aVar.H(iLogger, this.f17098w);
        }
        if (this.f17100y != null) {
            aVar.u("modules");
            aVar.H(iLogger, this.f17100y);
        }
        h8.b.z(this, aVar, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f17099x;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f17099x, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t4() {
        super(r0);
        io.sentry.protocol.v vVar = new io.sentry.protocol.v();
        Date n9 = com.google.android.play.core.appupdate.b.n();
        this.f17092p = n9;
    }
}
