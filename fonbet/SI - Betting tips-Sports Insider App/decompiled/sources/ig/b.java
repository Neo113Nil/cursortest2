package ig;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public d[] f11240a;

    /* renamed from: b, reason: collision with root package name */
    public int f11241b;

    /* renamed from: c, reason: collision with root package name */
    public int f11242c;

    /* renamed from: d, reason: collision with root package name */
    public z f11243d;

    public final d e() {
        d dVar;
        z zVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f11240a;
                if (dVarArr == null) {
                    dVarArr = g();
                    this.f11240a = dVarArr;
                } else if (this.f11241b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f11240a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i5 = this.f11242c;
                do {
                    dVar = dVarArr[i5];
                    if (dVar == null) {
                        dVar = f();
                        dVarArr[i5] = dVar;
                    }
                    i5++;
                    if (i5 >= dVarArr.length) {
                        i5 = 0;
                    }
                    Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f11242c = i5;
                this.f11241b++;
                zVar = this.f11243d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zVar != null) {
            zVar.w(1);
        }
        return dVar;
    }

    public abstract d f();

    public abstract d[] g();

    public final void h(d dVar) {
        z zVar;
        int i5;
        Continuation[] b10;
        synchronized (this) {
            try {
                int i10 = this.f11241b - 1;
                this.f11241b = i10;
                zVar = this.f11243d;
                if (i10 == 0) {
                    this.f11242c = 0;
                }
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : b10) {
            if (continuation != null) {
                gf.o oVar = gf.q.f10031a;
                continuation.resumeWith(Unit.f19194a);
            }
        }
        if (zVar != null) {
            zVar.w(-1);
        }
    }

    public final z i() {
        z zVar;
        synchronized (this) {
            zVar = this.f11243d;
            if (zVar == null) {
                int i5 = this.f11241b;
                zVar = new z(1, Integer.MAX_VALUE, gg.a.f10049b);
                zVar.b(Integer.valueOf(i5));
                this.f11243d = zVar;
            }
        }
        return zVar;
    }
}
