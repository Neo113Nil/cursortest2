package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yl0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10929n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10920e<Object> f106790b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f106791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10929n(InterfaceC10920e<Object> interfaceC10920e, Object obj) {
        super(0);
        this.f106790b = interfaceC10920e;
        this.f106791c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f106790b.onSuccess(this.f106791c);
        return Unit.f71690a;
    }
}
