package jg;

import eg.t0;
import eg.u0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18486b = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public t0[] f18487a;

    public final void a(t0 t0Var) {
        t0Var.e((u0) this);
        t0[] t0VarArr = this.f18487a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18486b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f18487a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            t0VarArr = (t0[]) copyOf;
            this.f18487a = t0VarArr;
        }
        int i5 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i5 + 1);
        t0VarArr[i5] = t0Var;
        t0Var.f9225b = i5;
        d(i5);
    }

    public final void b(t0 t0Var) {
        synchronized (this) {
            if (t0Var.c() != null) {
                c(t0Var.f9225b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t0 c(int i5) {
        Object[] objArr = this.f18487a;
        Intrinsics.checkNotNull(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18486b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i5 < atomicIntegerFieldUpdater.get(this)) {
            e(i5, atomicIntegerFieldUpdater.get(this));
            int i10 = (i5 - 1) / 2;
            if (i5 > 0) {
                t0 t0Var = objArr[i5];
                Intrinsics.checkNotNull(t0Var);
                Object obj = objArr[i10];
                Intrinsics.checkNotNull(obj);
                if (t0Var.compareTo(obj) < 0) {
                    e(i5, i10);
                    d(i10);
                }
            }
            while (true) {
                int i11 = i5 * 2;
                int i12 = i11 + 1;
                if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f18487a;
                Intrinsics.checkNotNull(objArr2);
                int i13 = i11 + 2;
                if (i13 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i13];
                    Intrinsics.checkNotNull(comparable);
                    Object obj2 = objArr2[i12];
                    Intrinsics.checkNotNull(obj2);
                }
                i13 = i12;
                Comparable comparable2 = objArr2[i5];
                Intrinsics.checkNotNull(comparable2);
                Comparable comparable3 = objArr2[i13];
                Intrinsics.checkNotNull(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i5, i13);
                i5 = i13;
            }
        }
        t0 t0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.checkNotNull(t0Var2);
        t0Var2.e(null);
        t0Var2.f9225b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t0Var2;
    }

    public final void d(int i5) {
        while (i5 > 0) {
            t0[] t0VarArr = this.f18487a;
            Intrinsics.checkNotNull(t0VarArr);
            int i10 = (i5 - 1) / 2;
            t0 t0Var = t0VarArr[i10];
            Intrinsics.checkNotNull(t0Var);
            t0 t0Var2 = t0VarArr[i5];
            Intrinsics.checkNotNull(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            e(i5, i10);
            i5 = i10;
        }
    }

    public final void e(int i5, int i10) {
        t0[] t0VarArr = this.f18487a;
        Intrinsics.checkNotNull(t0VarArr);
        t0 t0Var = t0VarArr[i10];
        Intrinsics.checkNotNull(t0Var);
        t0 t0Var2 = t0VarArr[i5];
        Intrinsics.checkNotNull(t0Var2);
        t0VarArr[i5] = t0Var;
        t0VarArr[i10] = t0Var2;
        t0Var.f9225b = i5;
        t0Var2.f9225b = i10;
    }
}
