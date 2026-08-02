package com.logrocket.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w f6756b = new w(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f6757a;

    public n0(p pVar) {
        Charset charset = d0.f6681a;
        if (pVar == null) {
            throw new NullPointerException("output");
        }
        this.f6757a = pVar;
        pVar.f6775c = this;
    }

    public void a(j jVar) {
        if (!jVar.h()) {
            if (!(jVar instanceof f1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + jVar.getClass());
            }
            f1 f1Var = (f1) jVar;
            a(f1Var.f6692e);
            a(f1Var.f6693f);
            return;
        }
        int binarySearch = Arrays.binarySearch(f1.f6690i, jVar.size());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int q = f1.q(binarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f6757a;
        if (arrayDeque.isEmpty() || ((j) arrayDeque.peek()).size() >= q) {
            arrayDeque.push(jVar);
            return;
        }
        int q3 = f1.q(binarySearch);
        j jVar2 = (j) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((j) arrayDeque.peek()).size() < q3) {
            jVar2 = new f1((j) arrayDeque.pop(), jVar2);
        }
        f1 f1Var2 = new f1(jVar2, jVar);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(f1.f6690i, f1Var2.f6691d);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((j) arrayDeque.peek()).size() >= f1.q(binarySearch2 + 1)) {
                break;
            } else {
                f1Var2 = new f1((j) arrayDeque.pop(), f1Var2);
            }
        }
        arrayDeque.push(f1Var2);
    }

    public void b(int i5, j jVar) {
        ((p) this.f6757a).y(i5, jVar);
    }

    public void c(int i5, Object obj, g1 g1Var) {
        p pVar = (p) this.f6757a;
        pVar.K(i5, 3);
        g1Var.g((a) obj, pVar.f6775c);
        pVar.K(i5, 4);
    }

    public n0(int i5) {
        s0 s0Var;
        switch (i5) {
            case 2:
                this.f6757a = new ArrayDeque();
                break;
            default:
                try {
                    s0Var = (s0) Class.forName("com.logrocket.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    s0Var = f6756b;
                }
                s0[] s0VarArr = {w.f6812b, s0Var};
                m0 m0Var = new m0();
                m0Var.f6749a = s0VarArr;
                Charset charset = d0.f6681a;
                this.f6757a = m0Var;
                break;
        }
    }
}
