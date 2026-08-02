package ru.ozon.android.messenger.blocks.showTextButton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f86393b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86394c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<a, Unit> f86395d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f86396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(k kVar, ru.ozon.android.messenger.framework.core.d dVar, Function1 function1, int i11) {
        super(2);
        this.f86393b = kVar;
        this.f86394c = dVar;
        this.f86395d = function1;
        this.f86396e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f86396e | 1);
        Function1<a, Unit> function1 = this.f86395d;
        i.a(this.f86393b, this.f86394c, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
