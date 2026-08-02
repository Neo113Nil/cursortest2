package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/sequences/Sequence;", "it", "", "a", "(Lkotlin/sequences/Sequence;)Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function1<Sequence<Object>, Iterator<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final q f71933b = new q(1);

    q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke(Sequence<Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }
}
