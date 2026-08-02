package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements Sequence<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f71932a;

    public p(Iterator it) {
        this.f71932a = it;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return this.f71932a;
    }
}
