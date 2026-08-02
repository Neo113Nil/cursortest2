package ob0;

import We.L;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class C extends AbstractC7737t implements Function1<Map<String, Object>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f77903b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L f77904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(B b11, L l11) {
        super(1);
        this.f77903b = b11;
        this.f77904c = l11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        Map<String, Object> createAction = map;
        Intrinsics.checkNotNullParameter(createAction, "$this$createAction");
        B b11 = this.f77903b;
        B.h(b11, createAction, "custom_dimension5", B.g(b11, this.f77904c));
        return Unit.f71690a;
    }
}
