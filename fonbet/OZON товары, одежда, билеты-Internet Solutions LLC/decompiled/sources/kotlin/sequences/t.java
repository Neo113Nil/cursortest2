package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class t extends AbstractC7737t implements Function1<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Object> f71936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Function0<Object> function0) {
        super(1);
        this.f71936b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f71936b.invoke();
    }
}
