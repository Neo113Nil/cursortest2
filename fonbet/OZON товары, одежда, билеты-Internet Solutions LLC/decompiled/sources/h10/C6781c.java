package h10;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: h10.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6781c extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f64611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6781c(Throwable th2) {
        super(0);
        this.f64611b = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return Nk.a.b("ComposerAlert: ", this.f64611b.getMessage());
    }
}
