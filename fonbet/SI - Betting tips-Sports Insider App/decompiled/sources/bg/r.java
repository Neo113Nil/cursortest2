package bg;

import androidx.core.view.g0;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3224b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f3225c;

    public r(Sequence sequence, Function1 transformer, int i5) {
        this.f3223a = i5;
        switch (i5) {
            case 1:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                this.f3224b = sequence;
                this.f3225c = transformer;
                break;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(transformer, "predicate");
                this.f3224b = sequence;
                this.f3225c = transformer;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3223a) {
            case 0:
                return new f(this);
            case 1:
                return new g0(this);
            default:
                return new h(this);
        }
    }

    public r(Function0 getInitialValue, Function1 getNextValue) {
        this.f3223a = 2;
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f3224b = getInitialValue;
        this.f3225c = getNextValue;
    }
}
