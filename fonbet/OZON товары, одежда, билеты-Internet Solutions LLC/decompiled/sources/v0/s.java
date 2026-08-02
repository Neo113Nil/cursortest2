package v0;

import S0.A1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import x0.a0;

/* loaded from: classes.dex */
final class s extends AbstractC7737t implements Function0<p> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A1<C10173m> f101562b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I f101563c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.lazy.a f101564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(A1<C10173m> a12, I i11, androidx.compose.foundation.lazy.a aVar) {
        super(0);
        this.f101562b = a12;
        this.f101563c = i11;
        this.f101564d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final p invoke() {
        C10173m value = this.f101562b.getValue();
        I i11 = this.f101563c;
        return new p(i11, value, this.f101564d, new a0(i11.v(), value));
    }
}
