package d2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.L, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6035L extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6035L(C6034K c6034k) {
        super(0);
        this.f61027b = c6034k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C6034K c6034k = this.f61027b;
        B1.B a11 = C6034K.a(c6034k);
        if (a11 == null || !a11.I()) {
            a11 = null;
        }
        return Boolean.valueOf((a11 == null || c6034k.e() == null) ? false : true);
    }
}
