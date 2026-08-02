package ob0;

import androidx.lifecycle.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes3.dex */
final class o extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f77972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar) {
        super(1);
        this.f77972b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            q qVar = this.f77972b;
            C10727i.c(K.a(qVar), null, null, new n(qVar, str2, null), 3);
        }
        return Unit.f71690a;
    }
}
