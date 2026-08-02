package qb;

import ac.d;
import android.os.Build;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.domain.workers.WorkerCheckSubscribe;
import e3.f;
import e3.j;
import e3.l0;
import e3.y;
import eg.z;
import f3.x;
import io.appmetrica.analytics.AppMetrica;
import j$.time.Instant;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.h;
import mf.i;
import rb.e;
import rc.b0;
import s7.s;
import za.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22083b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f22087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fb.b bVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f22086e = bVar;
        this.f22084c = str;
        this.f22085d = str2;
        this.f22087f = str3;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22083b) {
            case 0:
                return new a((fb.b) this.f22086e, this.f22084c, this.f22085d, (String) this.f22087f, continuation);
            case 1:
                return new a((b0) this.f22086e, this.f22084c, (Exception) this.f22087f, this.f22085d, continuation);
            default:
                return new a(this.f22084c, this.f22085d, (String) this.f22087f, (s) this.f22086e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22083b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        long j;
        int i5 = this.f22083b;
        Serializable serializable = this.f22087f;
        final String msg = this.f22084c;
        final String mime = this.f22085d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                final String content = (String) serializable;
                e eVar = fb.b.P0().f22382a;
                if (msg != null && mime != null && content != null) {
                    final int epochSecond = (int) Instant.now().getEpochSecond();
                    j = ((Number) x.n0(eVar.f22378a, false, true, new Function1() { // from class: rb.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i10 = epochSecond;
                            s2.a _connection = (s2.a) obj2;
                            Intrinsics.checkNotNullParameter(_connection, "_connection");
                            s2.c r02 = _connection.r0("INSERT INTO support_table (dateCreate, text, mime, content, sendDate, \n        dateUpdate, operatorName, remoteId, readDate, stateRead, type) \n        VALUES (?, ?, ?, ?, 0, ?, null, 0, 0, 0, 0)\n    ");
                            long j6 = i10;
                            try {
                                r02.f(1, j6);
                                String str = msg;
                                if (str == null) {
                                    r02.h(2);
                                } else {
                                    r02.B(2, str);
                                }
                                String str2 = mime;
                                if (str2 == null) {
                                    r02.h(3);
                                } else {
                                    r02.B(3, str2);
                                }
                                String str3 = content;
                                if (str3 == null) {
                                    r02.h(4);
                                } else {
                                    r02.B(4, str3);
                                }
                                r02.f(5, j6);
                                r02.n0();
                                long p10 = io.sentry.config.a.p(_connection);
                                r02.close();
                                return Long.valueOf(p10);
                            } catch (Throwable th2) {
                                r02.close();
                                throw th2;
                            }
                        }
                    })).longValue();
                } else if (msg == null && mime != null && content != null) {
                    int epochSecond2 = (int) Instant.now().getEpochSecond();
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(mime, "mime");
                    Intrinsics.checkNotNullParameter(content, "content");
                    j = ((Number) x.n0(eVar.f22378a, false, true, new pb.a(epochSecond2, mime, content, 5))).longValue();
                } else if (msg != null && mime == null && content == null) {
                    int epochSecond3 = (int) Instant.now().getEpochSecond();
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    j = ((Number) x.n0(eVar.f22378a, false, true, new h(epochSecond3, msg, 4))).longValue();
                } else {
                    j = -1;
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                Exception exc = (Exception) serializable;
                b0.a((b0) this.f22086e).getClass();
                ((d) k.a()).getClass();
                if (mime == null) {
                    mime = exc.getMessage();
                }
                AppMetrica.reportError(msg, mime, exc);
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    String str = "WorkerCheckSubscribe" + msg + mime;
                    y yVar = y.f8572a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    y networkType = y.f8573b;
                    Intrinsics.checkNotNullParameter(networkType, "networkType");
                    f fVar = new f(new n3.i(null), networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet) : g0.f19206a);
                    Pair[] pairArr = {new Pair(PurchaseSubsTable.skuColumn, msg), new Pair("purchaseToken", mime), new Pair("subscriptionId", (String) serializable)};
                    e3.i iVar = new e3.i(0);
                    for (int i10 = 0; i10 < 3; i10++) {
                        Pair pair = pairArr[i10];
                        iVar.e(pair.f19193b, (String) pair.f19192a);
                    }
                    j c2 = iVar.c();
                    Intrinsics.checkNotNullParameter(WorkerCheckSubscribe.class, "workerClass");
                    l0 f6 = new e3.z(WorkerCheckSubscribe.class).f(fVar);
                    ((e3.z) f6).h(c2);
                    e3.a aVar4 = e3.a.f8471a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    break;
                } catch (Exception unused) {
                    return Unit.f19194a;
                }
        }
        return Unit.f19194a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, s sVar, Continuation continuation) {
        super(2, continuation);
        this.f22084c = str;
        this.f22085d = str2;
        this.f22087f = str3;
        this.f22086e = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0 b0Var, String str, Exception exc, String str2, Continuation continuation) {
        super(2, continuation);
        this.f22086e = b0Var;
        this.f22084c = str;
        this.f22087f = exc;
        this.f22085d = str2;
    }
}
