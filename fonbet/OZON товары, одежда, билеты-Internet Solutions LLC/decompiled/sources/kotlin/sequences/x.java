package kotlin.sequences;

import gd.InterfaceC6712a;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class x implements Iterable<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Sequence f71938a;

    public x(Sequence sequence) {
        this.f71938a = sequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f71938a.iterator();
    }
}
