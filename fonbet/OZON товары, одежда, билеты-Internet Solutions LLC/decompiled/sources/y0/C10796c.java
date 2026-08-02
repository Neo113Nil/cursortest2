package y0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10796c extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<Object> f105773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10796c(List<? extends Object> list) {
        super(0);
        this.f105773b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object obj = this.f105773b.get(2);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) obj;
    }
}
