package u5;

import We.C;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: u5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9963b extends AbstractC7737t implements Function0<C> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9964c f100297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9963b(C9964c c9964c) {
        super(0);
        this.f100297b = c9964c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C invoke() {
        String c11 = this.f100297b.d().c("Content-Type");
        if (c11 == null) {
            return null;
        }
        C.f33536g.getClass();
        return C.a.b(c11);
    }
}
