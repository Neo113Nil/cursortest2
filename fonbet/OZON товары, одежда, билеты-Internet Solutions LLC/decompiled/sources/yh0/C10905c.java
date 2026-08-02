package yh0;

import fh0.C6568c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yh0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10905c extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6568c f106653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10905c(C6568c c6568c) {
        super(0);
        this.f106653b = c6568c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return Ej.b.a(this.f106653b.n(), "Push notification wasn't shown, because notification with the same id had already been shown. Id: ");
    }
}
