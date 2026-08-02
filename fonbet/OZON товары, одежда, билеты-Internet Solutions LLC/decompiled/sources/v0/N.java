package v0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class N extends AbstractC7737t implements Function0<I> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f101517b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f101518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(int i11, int i12) {
        super(0);
        this.f101517b = i11;
        this.f101518c = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final I invoke() {
        return new I(this.f101517b, this.f101518c);
    }
}
