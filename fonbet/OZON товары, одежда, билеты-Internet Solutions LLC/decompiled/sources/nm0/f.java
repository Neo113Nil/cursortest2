package nm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes4.dex */
public final class f extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i11) {
        super(0);
        this.f77396b = i11;
        this.f77397c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f77396b) {
            case 0:
                C8613c c8613c = (C8613c) this.f77397c;
                return new u((r) c8613c.f77391d.getValue(), (Al0.a) c8613c.f77392e.getValue());
            default:
                Unit unit = Unit.f71690a;
                ((lm0.e) this.f77397c).b(unit);
                return unit;
        }
    }
}
