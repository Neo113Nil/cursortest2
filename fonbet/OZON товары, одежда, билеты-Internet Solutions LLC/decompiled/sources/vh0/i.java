package vh0;

import fh0.C6568c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6568c f102950b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Zg0.h f102951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C6568c c6568c, Zg0.h hVar) {
        super(0);
        this.f102950b = c6568c;
        this.f102951c = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return Sh.b.c("notified thread summary for thread ", this.f102950b.s(), " in channel ", this.f102951c.b());
    }
}
