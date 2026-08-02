package bg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements Sequence, d {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f3201a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3202b;

    public c(Sequence sequence, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f3201a = sequence;
        this.f3202b = i5;
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + '.').toString());
    }

    @Override // bg.d
    public final Sequence a(int i5) {
        int i10 = this.f3202b + i5;
        return i10 < 0 ? new c(this, i5) : new c(this.f3201a, i10);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
