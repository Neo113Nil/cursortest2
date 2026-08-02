package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class E extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C1469p c1469p) {
        super(1);
        this.f26403d = c1469p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f26403d.resumeWith(Result.m147constructorimpl(Result.m146boximpl(((Result) obj).getValue())));
        return Unit.INSTANCE;
    }
}
