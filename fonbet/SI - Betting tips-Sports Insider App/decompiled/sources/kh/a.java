package kh;

import androidx.appcompat.app.v0;
import gh.g0;
import gh.o0;
import gh.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19078a = new a();

    @Override // gh.z
    public final o0 a(lh.h chain) {
        lh.f fVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        p pVar = chain.f20089a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (pVar) {
            if (!pVar.f19152p) {
                throw new IllegalStateException("released");
            }
            if (pVar.f19149m || pVar.f19148l || pVar.f19151o || pVar.f19150n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f19194a;
        }
        i iVar = pVar.f19145h;
        Intrinsics.checkNotNull(iVar);
        q a7 = iVar.a();
        g0 client = pVar.f19138a;
        a7.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        v0 v0Var = a7.f19161h;
        nh.q qVar = a7.f19162i;
        if (qVar != null) {
            fVar = new nh.r(client, a7, chain, qVar);
        } else {
            a7.f19158e.setSoTimeout(chain.f20095g);
            Timeout timeout = ((BufferedSource) v0Var.f365c).getTimeout();
            long j = chain.f20095g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j, timeUnit);
            ((BufferedSink) v0Var.f366d).getTimeout().timeout(chain.f20096h, timeUnit);
            fVar = new mh.f(client, a7, v0Var);
        }
        h hVar = new h(pVar, pVar.f19141d, iVar, fVar);
        pVar.f19147k = hVar;
        pVar.f19153r = hVar;
        synchronized (pVar) {
            pVar.f19148l = true;
            pVar.f19149m = true;
        }
        if (pVar.q) {
            throw new IOException("Canceled");
        }
        return lh.h.a(chain, 0, hVar, null, 61).b(chain.f20093e);
    }
}
