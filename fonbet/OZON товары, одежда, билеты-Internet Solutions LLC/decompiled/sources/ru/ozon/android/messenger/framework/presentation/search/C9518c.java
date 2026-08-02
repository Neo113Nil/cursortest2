package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9518c extends AbstractC7737t implements Function1<ru.ozon.android.messenger.blocks.chat.search.i, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9516a f91635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9518c(C9516a c9516a) {
        super(1);
        this.f91635b = c9516a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.android.messenger.blocks.chat.search.i iVar) {
        ru.ozon.android.messenger.blocks.chat.search.i data = iVar;
        Intrinsics.checkNotNullParameter(data, "data");
        C9516a.u(this.f91635b).S0(data);
        return Unit.f71690a;
    }
}
