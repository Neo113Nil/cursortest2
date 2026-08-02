package ru.ozon.id.nativeauth.sso2;

import Sc.InterfaceC4008j;
import We.L;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.id.nativeauth.sso2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9547a extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9549c f97368b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L f97369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9547a(C9549c c9549c, L l11) {
        super(0);
        this.f97368b = c9549c;
        this.f97369c = l11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f97368b.f97378g;
        return ((ob0.B) interfaceC4008j.getValue()).k(this.f97369c);
    }
}
