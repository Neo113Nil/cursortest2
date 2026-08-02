package jh;

import hh.g;
import java.util.Iterator;
import kh.q;
import kh.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18542e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, String str) {
        super(str);
        this.f18543f = rVar;
    }

    @Override // jh.a
    public final long a() {
        q connection;
        switch (this.f18542e) {
            case 0:
                ((Function0) this.f18543f).invoke();
                return -1L;
            default:
                r rVar = (r) this.f18543f;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - rVar.f19169a) + 1;
                Iterator it = rVar.f19172d.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                long j6 = LongCompanionObject.MAX_VALUE;
                int i5 = 0;
                int i10 = 0;
                q qVar = null;
                q qVar2 = null;
                while (it.hasNext()) {
                    q qVar3 = (q) it.next();
                    Intrinsics.checkNotNull(qVar3);
                    synchronized (qVar3) {
                        if (rVar.a(qVar3, nanoTime) > 0) {
                            i10++;
                        } else {
                            long j10 = j6;
                            long j11 = qVar3.q;
                            if (j11 < j) {
                                qVar = qVar3;
                                j = j11;
                            }
                            i5++;
                            if (j11 < j10) {
                                qVar2 = qVar3;
                                j6 = j11;
                            } else {
                                j6 = j10;
                            }
                        }
                        Unit unit = Unit.f19194a;
                    }
                }
                long j12 = j6;
                if (qVar != null) {
                    connection = qVar;
                } else if (i5 > 5) {
                    connection = qVar2;
                    j = j12;
                } else {
                    j = -1;
                    connection = null;
                }
                if (connection == null) {
                    if (qVar2 != null) {
                        return (j12 + rVar.f19169a) - nanoTime;
                    }
                    if (i10 > 0) {
                        return rVar.f19169a;
                    }
                    return -1L;
                }
                synchronized (connection) {
                    if (connection.f19168p.isEmpty() && connection.q == j) {
                        connection.j = true;
                        rVar.f19172d.remove(connection);
                        g.c(connection.f19158e);
                        Intrinsics.checkNotNullParameter(connection, "connection");
                        if (rVar.f19172d.isEmpty()) {
                            rVar.f19170b.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Function0 function0) {
        super(str);
        this.f18543f = function0;
    }
}
