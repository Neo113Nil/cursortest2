package hd0;

import We.L;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ob0.B;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f65348b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L f65349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, L l11) {
        super(0);
        this.f65348b = eVar;
        this.f65349c = l11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((B) this.f65348b.f65337h.getValue()).t(this.f65349c, null);
    }
}
