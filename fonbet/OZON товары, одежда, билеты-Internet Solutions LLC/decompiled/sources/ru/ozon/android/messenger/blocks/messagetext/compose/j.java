package ru.ozon.android.messenger.blocks.messagetext.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.navigation.action.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f85840b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        ru.ozon.android.messenger.framework.navigation.action.a action = aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        this.f85840b.c().q(action);
        return Unit.f71690a;
    }
}
