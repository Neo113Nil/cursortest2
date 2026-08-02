package ru.ozon.android.messenger.blocks.chatlistheader.search;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.chatlistheader.f;

/* loaded from: classes10.dex */
final class F extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84783b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f.c.a f84784c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<f.b> f84785d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f84786e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f84787f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84788g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84789h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84790i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f84791j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function1<f.b, Unit> f84792k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f84793l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(androidx.compose.ui.e eVar, f.c.a aVar, List list, boolean z11, boolean z12, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, int i11) {
        super(2);
        this.f84783b = eVar;
        this.f84784c = aVar;
        this.f84785d = list;
        this.f84786e = z11;
        this.f84787f = z12;
        this.f84788g = function0;
        this.f84789h = function02;
        this.f84790i = function03;
        this.f84791j = function1;
        this.f84792k = function12;
        this.f84793l = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84793l | 1);
        Function0<Unit> function0 = this.f84789h;
        Function0<Unit> function02 = this.f84790i;
        G.a(this.f84783b, this.f84784c, this.f84785d, this.f84786e, this.f84787f, this.f84788g, function0, function02, this.f84791j, this.f84792k, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
