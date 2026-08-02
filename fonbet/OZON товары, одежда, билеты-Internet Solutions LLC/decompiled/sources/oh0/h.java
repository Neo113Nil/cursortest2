package oh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<Unit, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f78352b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f78353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, int i11) {
        super(1);
        this.f78352b = jVar;
        this.f78353c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        b bVar;
        bVar = this.f78352b.f78358c;
        ((c) bVar).d(this.f78353c);
        return Unit.f71690a;
    }
}
