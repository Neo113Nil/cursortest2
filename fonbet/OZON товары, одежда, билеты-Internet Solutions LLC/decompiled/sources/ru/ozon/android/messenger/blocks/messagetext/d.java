package ru.ozon.android.messenger.blocks.messagetext;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.navigation.action.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f85855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar) {
        super(1);
        this.f85855b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        ru.ozon.android.messenger.framework.navigation.action.a action = aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        b.u(this.f85855b).W(action);
        return Unit.f71690a;
    }
}
