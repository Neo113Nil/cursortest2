package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import v0.I;

/* loaded from: classes10.dex */
final class y extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f91281b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f91282c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f91283d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f91284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(I i11, u uVar, int i12, int i13) {
        super(2);
        this.f91281b = i11;
        this.f91282c = uVar;
        this.f91283d = i12;
        this.f91284e = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f91284e | 1);
        int i11 = this.f91283d;
        z.a(this.f91281b, this.f91282c, i11, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
