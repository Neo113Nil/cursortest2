package nm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: nm0.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8607B extends AbstractC7737t implements Function1<Unit, AbstractC7971a<Unit>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8609D f77380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f77381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8607B(C8609D c8609d, ReviewInfo reviewInfo) {
        super(1);
        this.f77380b = c8609d;
        this.f77381c = reviewInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC7971a<Unit> invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        C8609D c8609d = this.f77380b;
        c8609d.getClass();
        C8606A source = new C8606A(c8609d, this.f77381c);
        Intrinsics.checkNotNullParameter(source, "source");
        return new lm0.b(source);
    }
}
