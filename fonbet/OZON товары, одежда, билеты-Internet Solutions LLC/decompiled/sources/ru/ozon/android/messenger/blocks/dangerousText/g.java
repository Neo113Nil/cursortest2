package ru.ozon.android.messenger.blocks.dangerousText;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<Tg.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f85006b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f85007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, f fVar) {
        super(1);
        this.f85006b = fVar;
        this.f85007c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Tg.b bVar) {
        Tg.b action = bVar;
        Intrinsics.checkNotNullParameter(action, "action");
        f.c(this.f85007c, this.f85006b);
        return Unit.f71690a;
    }
}
