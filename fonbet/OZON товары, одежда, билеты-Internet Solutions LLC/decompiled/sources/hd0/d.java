package hd0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ob0.B;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f65326b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Long f65327c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Long f65328d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f65329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar, Long l11, Long l12, boolean z11) {
        super(0);
        this.f65326b = bVar;
        this.f65327c = l11;
        this.f65328d = l12;
        this.f65329e = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f65326b.f65308e;
        return ((B) interfaceC4008j.getValue()).u(this.f65327c, this.f65328d, this.f65329e);
    }
}
