package lf0;

import B4.T;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC8141c;
import nf0.C8591a;

/* renamed from: lf0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7953d extends AbstractC7737t implements Function1<T, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7951b f73297b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC8141c.d f73298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7953d(C7951b c7951b, InterfaceC8141c.d dVar) {
        super(1);
        this.f73297b = c7951b;
        this.f73298c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(T t2) {
        T navOptions = t2;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        this.f73298c.b().invoke(new C8591a());
        this.f73297b.getClass();
        navOptions.d(false);
        navOptions.e(false);
        return Unit.f71690a;
    }
}
