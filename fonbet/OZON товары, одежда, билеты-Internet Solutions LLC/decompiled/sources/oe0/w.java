package oe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class w extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f78252b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f78253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(o oVar, y yVar) {
        super(1);
        this.f78252b = oVar;
        this.f78253c = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        y yVar = this.f78253c;
        o oVar = this.f78252b;
        o.c(oVar, new v(oVar, yVar));
        return Unit.f71690a;
    }
}
