package qj0;

import cj0.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: qj0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9076f extends AbstractC7737t implements Function0<cj0.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC9075e<?> f82225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9076f(InterfaceC9075e<?> interfaceC9075e) {
        super(0);
        this.f82225b = interfaceC9075e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final cj0.d invoke() {
        return this.f82225b.a() ? d.a.f57203a : d.c.f57205a;
    }
}
