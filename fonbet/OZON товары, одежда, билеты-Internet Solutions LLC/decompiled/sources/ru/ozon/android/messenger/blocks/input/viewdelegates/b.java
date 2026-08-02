package ru.ozon.android.messenger.blocks.input.viewdelegates;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<UUID, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f85563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar) {
        super(1);
        this.f85563b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UUID uuid) {
        UUID it = uuid;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f85563b.f85566a.z0(it);
        return Unit.f71690a;
    }
}
