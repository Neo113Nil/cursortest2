package ru.ozon.android.messenger.blocks.chatGroups.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chatGroups.a, Unit> f84668b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chatGroups.a f84669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    a(Function1<? super ru.ozon.android.messenger.blocks.chatGroups.a, Unit> function1, ru.ozon.android.messenger.blocks.chatGroups.a aVar) {
        super(0);
        this.f84668b = function1;
        this.f84669c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84668b.invoke(this.f84669c);
        return Unit.f71690a;
    }
}
