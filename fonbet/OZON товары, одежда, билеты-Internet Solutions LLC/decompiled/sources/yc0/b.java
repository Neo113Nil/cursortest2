package yc0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function0<Map<String, String>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f106551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(Function1<? super Map<String, String>, Unit> function1) {
        super(0);
        this.f106551b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f106551b.invoke(linkedHashMap);
        return linkedHashMap;
    }
}
