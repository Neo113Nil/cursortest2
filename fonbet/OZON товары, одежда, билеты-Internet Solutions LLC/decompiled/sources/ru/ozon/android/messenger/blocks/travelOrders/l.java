package ru.ozon.android.messenger.blocks.travelOrders;

import a1.C4912a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.G;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f86532b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f86533c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<a, Unit> f86534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    l(p pVar, float f7, Function1<? super a, Unit> function1) {
        super(1);
        this.f86532b = pVar;
        this.f86533c = f7;
        this.f86534d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyRow = g10;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        p pVar = this.f86532b;
        List<a> c11 = pVar.c();
        LazyRow.a(((ArrayList) c11).size(), null, new j(i.f86525b, c11), new C4912a(true, -632812321, new k(c11, this.f86533c, pVar, this.f86534d)));
        return Unit.f71690a;
    }
}
