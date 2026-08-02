package dc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: dc0.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6150N extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<AtomAction, Unit> f61512b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6149M f61513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C6150N(Function1<? super AtomAction, Unit> function1, C6149M c6149m) {
        super(1);
        this.f61512b = function1;
        this.f61513c = c6149m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction atomAction2 = atomAction;
        Intrinsics.checkNotNullParameter(atomAction2, "atomAction");
        this.f61512b.invoke(atomAction2);
        this.f61513c.f61506c = null;
        return Unit.f71690a;
    }
}
