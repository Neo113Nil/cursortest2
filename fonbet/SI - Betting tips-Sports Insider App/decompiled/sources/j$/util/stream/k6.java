package j$.util.stream;

import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class k6 extends c6 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f17954d;

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f17954d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void end() {
        j$.com.android.tools.r8.a.X(this.f17954d, this.f17825b);
        long size = this.f17954d.size();
        n5 n5Var = this.f17941a;
        n5Var.c(size);
        if (!this.f17826c) {
            ArrayList arrayList = this.f17954d;
            Objects.requireNonNull(n5Var);
            Collection.EL.a(arrayList, new j$.util.p(5, n5Var));
        } else {
            ArrayList arrayList2 = this.f17954d;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = arrayList2.get(i5);
                i5++;
                if (n5Var.e()) {
                    break;
                } else {
                    n5Var.n((n5) obj);
                }
            }
        }
        n5Var.end();
        this.f17954d = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f17954d.add(obj);
    }
}
