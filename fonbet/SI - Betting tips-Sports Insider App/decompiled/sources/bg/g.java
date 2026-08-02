package bg;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final r f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3210b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f3211c;

    public g(r sequence, boolean z5, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f3209a = sequence;
        this.f3210b = z5;
        this.f3211c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }
}
