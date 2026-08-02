package ru.ozon.id.nativeauth.sso2;

import Sc.InterfaceC4008j;
import We.L;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f97448b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L f97449c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f97450d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f97451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, L l11, boolean z11, t tVar) {
        super(0);
        this.f97448b = rVar;
        this.f97449c = l11;
        this.f97450d = z11;
        this.f97451e = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f97448b.f97463i;
        return ((ob0.B) interfaceC4008j.getValue()).r(this.f97449c, this.f97450d, this.f97451e);
    }
}
