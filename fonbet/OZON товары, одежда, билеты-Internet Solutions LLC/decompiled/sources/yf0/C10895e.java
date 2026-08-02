package yf0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yf0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C10895e extends AbstractC7737t implements Function0<wf0.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10896f f106593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10895e(C10896f c10896f) {
        super(0);
        this.f106593b = c10896f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final wf0.d invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f106593b.f106596c;
        return new wf0.d(interfaceC4008j);
    }
}
