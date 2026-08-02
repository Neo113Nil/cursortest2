package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/IntRange;", "it", "", "a", "(Lkotlin/ranges/IntRange;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class v extends AbstractC7737t implements Function1<IntRange, String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(String str) {
        super(1);
        this.f71979b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return w.n(this.f71979b, it);
    }
}
