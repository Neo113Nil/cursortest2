package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yl0.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C10925j extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10920e<Object> f106783b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f106784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10925j(InterfaceC10920e<Object> interfaceC10920e, Object obj) {
        super(0);
        this.f106783b = interfaceC10920e;
        this.f106784c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f106783b.onSuccess(this.f106784c);
        return Unit.f71690a;
    }
}
