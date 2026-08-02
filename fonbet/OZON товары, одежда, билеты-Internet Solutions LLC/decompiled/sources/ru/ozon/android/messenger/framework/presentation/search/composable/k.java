package ru.ozon.android.messenger.framework.presentation.search.composable;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chat.search.i, Unit> f91673b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chat.search.i f91674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(Function1 function1, ru.ozon.android.messenger.blocks.chat.search.i iVar) {
        super(0);
        this.f91673b = function1;
        this.f91674c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f91673b.invoke(this.f91674c);
        return Unit.f71690a;
    }
}
