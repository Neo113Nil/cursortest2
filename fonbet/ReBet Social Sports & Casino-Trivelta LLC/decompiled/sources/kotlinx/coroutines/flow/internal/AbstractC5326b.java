package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.L;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.flow.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5326b {

    /* renamed from: a, reason: collision with root package name */
    public int f54706a;

    /* renamed from: b, reason: collision with root package name */
    public int f54707b;

    /* renamed from: c, reason: collision with root package name */
    public B f54708c;

    @Nullable
    private d[] slots;

    public final d f() {
        d dVar;
        B b10;
        synchronized (this) {
            try {
                d[] dVarArr = this.slots;
                if (dVarArr == null) {
                    dVarArr = j(2);
                    this.slots = dVarArr;
                } else if (this.f54706a >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.slots = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i10 = this.f54707b;
                do {
                    dVar = dVarArr[i10];
                    if (dVar == null) {
                        dVar = i();
                        dVarArr[i10] = dVar;
                    }
                    i10++;
                    if (i10 >= dVarArr.length) {
                        i10 = 0;
                    }
                    Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f54707b = i10;
                this.f54706a++;
                b10 = this.f54708c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 != null) {
            b10.Z(1);
        }
        return dVar;
    }

    public final L g() {
        B b10;
        synchronized (this) {
            b10 = this.f54708c;
            if (b10 == null) {
                b10 = new B(this.f54706a);
                this.f54708c = b10;
            }
        }
        return b10;
    }

    public abstract d i();

    public abstract d[] j(int i10);

    public final void k(d dVar) {
        B b10;
        int i10;
        Continuation[] b11;
        synchronized (this) {
            try {
                int i11 = this.f54706a - 1;
                this.f54706a = i11;
                b10 = this.f54708c;
                if (i11 == 0) {
                    this.f54707b = 0;
                }
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b11 = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : b11) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
            }
        }
        if (b10 != null) {
            b10.Z(-1);
        }
    }

    public final int l() {
        return this.f54706a;
    }

    public final d[] m() {
        return this.slots;
    }
}
