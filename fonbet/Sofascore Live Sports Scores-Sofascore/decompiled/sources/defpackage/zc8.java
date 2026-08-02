package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zc8 implements xgf {
    public final AtomicReference a;
    public final int b;

    public zc8(AtomicReference atomicReference, int i) {
        this.a = atomicReference;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ed8 ed8Var) {
        bd8 bd8Var;
        ad8 ad8Var = new ad8(ed8Var);
        ed8Var.b(ad8Var);
        loop0: while (true) {
            bd8 bd8Var2 = (bd8) this.a.get();
            if (bd8Var2 == null || bd8Var2.h()) {
                bd8 bd8Var3 = new bd8(this.a, this.b);
                AtomicReference atomicReference = this.a;
                while (!atomicReference.compareAndSet(bd8Var2, bd8Var3)) {
                    if (atomicReference.get() != bd8Var2) {
                        break;
                    }
                }
                bd8Var = bd8Var3;
            } else {
                bd8Var = bd8Var2;
            }
            AtomicReference atomicReference2 = bd8Var.c;
            while (true) {
                ad8[] ad8VarArr = (ad8[]) atomicReference2.get();
                if (ad8VarArr != bd8.j) {
                    int length = ad8VarArr.length;
                    ad8[] ad8VarArr2 = new ad8[length + 1];
                    System.arraycopy(ad8VarArr, 0, ad8VarArr2, 0, length);
                    ad8VarArr2[length] = ad8Var;
                    while (!atomicReference2.compareAndSet(ad8VarArr, ad8VarArr2)) {
                        if (atomicReference2.get() != ad8VarArr) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        if (ad8Var.get() == Long.MIN_VALUE) {
            bd8Var.i(ad8Var);
        } else {
            ad8Var.b = bd8Var;
        }
        bd8Var.g();
    }
}
