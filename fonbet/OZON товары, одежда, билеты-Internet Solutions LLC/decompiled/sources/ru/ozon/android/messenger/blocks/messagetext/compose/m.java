package ru.ozon.android.messenger.blocks.messagetext.compose;

import Bl0.C2652m;
import K1.C3422b;
import K1.T;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85850b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3422b f85851c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f85852d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T f85853e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9915y f85854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(androidx.compose.ui.e eVar, C3422b c3422b, long j11, T t2, C9915y c9915y, int i11) {
        super(2);
        this.f85850b = eVar;
        this.f85851c = c3422b;
        this.f85852d = j11;
        this.f85853e = t2;
        this.f85854f = c9915y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1794049);
        long j11 = this.f85852d;
        T t2 = this.f85853e;
        n.a(this.f85850b, this.f85851c, j11, t2, this.f85854f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
