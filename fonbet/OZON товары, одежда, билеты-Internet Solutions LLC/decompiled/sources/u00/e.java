package u00;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class e extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1 f99698b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f99699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function1 function1, List list) {
        super(1);
        this.f99698b = function1;
        this.f99699c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.f99698b.invoke(this.f99699c.get(num.intValue()));
    }
}
