package ru.ozon.android.messenger.blocks.chatlistheader.search;

import Bl0.C2652m;
import Q1.K;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class w extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84863b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K f84864c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f84865d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextDTO f84866e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84867f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84868g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f84869h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(androidx.compose.ui.e eVar, K k11, boolean z11, TextDTO textDTO, Function1 function1, Function0 function0, int i11) {
        super(2);
        this.f84863b = eVar;
        this.f84864c = k11;
        this.f84865d = z11;
        this.f84866e = textDTO;
        this.f84867f = function1;
        this.f84868g = function0;
        this.f84869h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84869h | 1);
        boolean z11 = this.f84865d;
        TextDTO textDTO = this.f84866e;
        x.b(this.f84863b, this.f84864c, z11, textDTO, this.f84867f, this.f84868g, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
