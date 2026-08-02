package ru.ozon.id.nativeauth.sso2;

import Sc.InterfaceC4008j;
import We.L;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f97452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L f97453c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f97454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, L l11, t tVar) {
        super(0);
        this.f97452b = rVar;
        this.f97453c = l11;
        this.f97454d = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f97452b.f97463i;
        return ((ob0.B) interfaceC4008j.getValue()).q(this.f97453c, this.f97454d);
    }
}
