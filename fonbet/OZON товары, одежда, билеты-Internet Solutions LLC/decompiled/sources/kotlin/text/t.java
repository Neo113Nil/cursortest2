package kotlin.text;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class t extends AbstractC7737t implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ char[] f71977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(char[] cArr) {
        super(2);
        this.f71977b = cArr;
    }

    public final Pair<Integer, Integer> a(CharSequence $receiver, int i11) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        int e11 = w.e($receiver, this.f71977b, i11, false);
        if (e11 < 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(e11), 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        return a(charSequence, num.intValue());
    }
}
