package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class f extends AbstractC7737t implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

    /* renamed from: b, reason: collision with root package name */
    public static final f f71770b = new f(2);

    f() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CoroutineContext invoke(CoroutineContext acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        CoroutineContext minusKey = acc.minusKey(element.getKey());
        g gVar = g.f71771a;
        if (minusKey == gVar) {
            return element;
        }
        e.Companion companion = e.INSTANCE;
        e eVar = (e) minusKey.get(companion);
        if (eVar == null) {
            return new c(minusKey, element);
        }
        CoroutineContext minusKey2 = minusKey.minusKey(companion);
        return minusKey2 == gVar ? new c(element, eVar) : new c(new c(minusKey2, element), eVar);
    }
}
