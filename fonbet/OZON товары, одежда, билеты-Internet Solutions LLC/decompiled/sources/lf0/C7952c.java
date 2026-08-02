package lf0;

import B4.T;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC8141c;
import nf0.C8591a;

/* renamed from: lf0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7952c extends AbstractC7737t implements Function1<T, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7951b f73295b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC8141c.i f73296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7952c(C7951b c7951b, InterfaceC8141c.i iVar) {
        super(1);
        this.f73295b = c7951b;
        this.f73296c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(T t2) {
        T navigate = t2;
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        this.f73296c.b().invoke(new C8591a());
        this.f73295b.getClass();
        navigate.d(false);
        navigate.e(false);
        return Unit.f71690a;
    }
}
