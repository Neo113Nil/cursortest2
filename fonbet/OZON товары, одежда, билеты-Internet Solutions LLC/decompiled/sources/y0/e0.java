package y0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class e0 extends AbstractC7737t implements Function0<C10795b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f105805b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f105806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(int i11, Function0 function0) {
        super(0);
        this.f105805b = i11;
        this.f105806c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10795b invoke() {
        return new C10795b(this.f105805b, 0.0f, this.f105806c);
    }
}
