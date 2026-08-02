package d2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6044b extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DialogC6032I f61036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6044b(DialogC6032I dialogC6032I) {
        super(1);
        this.f61036b = dialogC6032I;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        DialogC6032I dialogC6032I = this.f61036b;
        dialogC6032I.show();
        return new C6043a(dialogC6032I);
    }
}
