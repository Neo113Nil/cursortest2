package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a33 extends hoi implements Function2 {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ ct8 B;
    public final /* synthetic */ b98 C;
    public Object[] r;
    public ln2 s;
    public byte[] t;
    public int u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ z88[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a33(rq3 rq3Var, b98 b98Var, ct8 ct8Var, Function0 function0, z88[] z88VarArr) {
        super(2, rq3Var);
        this.z = z88VarArr;
        this.A = function0;
        this.B = ct8Var;
        this.C = b98Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        a33 a33Var = new a33(rq3Var, this.C, this.B, this.A, this.z);
        a33Var.y = obj;
        return a33Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a33) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r15.invoke(r14, r8, r20) == r2) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2 A[LOOP:0: B:18:0x00d2->B:25:0x00f3, LOOP_START, PHI: r3 r14
      0x00d2: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:14:0x00cd, B:25:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r14v6 kotlin.collections.IndexedValue) = (r14v5 kotlin.collections.IndexedValue), (r14v10 kotlin.collections.IndexedValue) binds: [B:14:0x00cd, B:25:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0137 -> B:7:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x013c -> B:9:0x011c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        byte[] bArr;
        byte b;
        Object[] objArr;
        ln2 ln2Var;
        int i;
        Object obj2;
        int i2;
        int i3;
        IndexedValue indexedValue;
        ku3 ku3Var = (ku3) this.y;
        lu3 lu3Var = lu3.a;
        int i4 = this.x;
        ih2 ih2Var = rid.b;
        int i5 = 2;
        byte b2 = 1;
        if (i4 == 0) {
            y6a.M(obj);
            length = this.z.length;
            if (length == 0) {
                return Unit.a;
            }
            Object[] objArr2 = new Object[length];
            mh0.m(0, length, ih2Var, objArr2);
            g62 g = ml4.g(length, 6, null);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            for (int i6 = 0; i6 < length; i6++) {
                xw3.L(ku3Var, null, null, new z23(this.z, i6, atomicInteger, g, (rq3) null, 0), 3);
            }
            bArr = new byte[length];
            b = 0;
            objArr = objArr2;
            ln2Var = g;
            i = length;
            b = (byte) (b + b2);
            this.y = null;
            this.r = objArr;
            this.s = ln2Var;
            this.t = bArr;
            this.u = length;
            this.v = i;
            this.w = b;
            this.x = b2;
            obj2 = ln2Var.g(this);
            if (obj2 != lu3Var) {
            }
            return lu3Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ?? r1 = this.w;
                int i7 = this.v;
                int i8 = this.u;
                byte[] bArr2 = this.t;
                ln2Var = this.s;
                Object[] objArr3 = this.r;
                y6a.M(obj);
                b = r1;
                bArr = bArr2;
                objArr = objArr3;
                i = i7;
                length = i8;
                b2 = 1;
                b = (byte) (b + b2);
                this.y = null;
                this.r = objArr;
                this.s = ln2Var;
                this.t = bArr;
                this.u = length;
                this.v = i;
                this.w = b;
                this.x = b2;
                obj2 = ln2Var.g(this);
                if (obj2 != lu3Var) {
                }
                return lu3Var;
            }
            if (i4 != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r12 = this.w;
            i3 = this.v;
            i2 = this.u;
            byte[] bArr3 = this.t;
            ln2Var = this.s;
            Object[] objArr4 = this.r;
            y6a.M(obj);
            b = r12;
            bArr = bArr3;
            objArr = objArr4;
            int i9 = i2;
            i = i3;
            length = i9;
            i5 = 2;
            b2 = 1;
            b = (byte) (b + b2);
            this.y = null;
            this.r = objArr;
            this.s = ln2Var;
            this.t = bArr;
            this.u = length;
            this.v = i;
            this.w = b;
            this.x = b2;
            obj2 = ln2Var.g(this);
            if (obj2 != lu3Var) {
                int i10 = i;
                i2 = length;
                i3 = i10;
                indexedValue = (IndexedValue) go2.a(obj2);
                if (indexedValue != null) {
                    return Unit.a;
                }
                do {
                    int i11 = indexedValue.a;
                    Object obj3 = objArr[i11];
                    objArr[i11] = indexedValue.b;
                    if (obj3 == ih2Var) {
                        i3--;
                    }
                    if (bArr[i11] == b) {
                        break;
                    }
                    bArr[i11] = b;
                    indexedValue = (IndexedValue) go2.a(ln2Var.o());
                } while (indexedValue != null);
                if (i3 == 0) {
                    Object[] objArr5 = (Object[]) this.A.invoke();
                    b98 b98Var = this.C;
                    ct8 ct8Var = this.B;
                    if (objArr5 == null) {
                        this.y = null;
                        this.r = objArr;
                        this.s = ln2Var;
                        this.t = bArr;
                        this.u = i2;
                        this.v = i3;
                        this.w = b;
                        this.x = i5;
                        if (ct8Var.invoke(b98Var, objArr, this) != lu3Var) {
                            int i12 = i2;
                            i = i3;
                            length = i12;
                        }
                    } else {
                        mh0.i(0, 0, 14, objArr, objArr5);
                        this.y = null;
                        this.r = objArr;
                        this.s = ln2Var;
                        this.t = bArr;
                        this.u = i2;
                        this.v = i3;
                        this.w = b;
                        this.x = 3;
                    }
                } else {
                    int i13 = i2;
                    i = i3;
                    length = i13;
                }
                b2 = 1;
                b = (byte) (b + b2);
                this.y = null;
                this.r = objArr;
                this.s = ln2Var;
                this.t = bArr;
                this.u = length;
                this.v = i;
                this.w = b;
                this.x = b2;
                obj2 = ln2Var.g(this);
                if (obj2 != lu3Var) {
                }
            }
            return lu3Var;
        }
        ?? r13 = this.w;
        i3 = this.v;
        i2 = this.u;
        byte[] bArr4 = this.t;
        ln2Var = this.s;
        Object[] objArr6 = this.r;
        y6a.M(obj);
        obj2 = ((go2) obj).a;
        b = r13;
        bArr = bArr4;
        objArr = objArr6;
        indexedValue = (IndexedValue) go2.a(obj2);
        if (indexedValue != null) {
        }
    }
}
