package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class c6 extends j5 {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f17825b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17826c;

    public c6(n5 n5Var, Comparator comparator) {
        super(n5Var);
        this.f17825b = comparator;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean e() {
        this.f17826c = true;
        return false;
    }
}
