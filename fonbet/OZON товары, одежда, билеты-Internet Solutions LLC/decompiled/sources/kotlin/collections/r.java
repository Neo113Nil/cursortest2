package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C7721c;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class r implements Sequence<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object[] f71757a;

    public r(Object[] objArr) {
        this.f71757a = objArr;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return C7721c.a(this.f71757a);
    }
}
