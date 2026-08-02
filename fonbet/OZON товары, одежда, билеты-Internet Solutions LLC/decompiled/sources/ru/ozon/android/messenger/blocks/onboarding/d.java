package ru.ozon.android.messenger.blocks.onboarding;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f85949b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f85950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar, e eVar) {
        super(0);
        this.f85949b = eVar;
        this.f85950c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.core.d dVar;
        dVar = this.f85949b.f85951a;
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(this.f85950c.c()));
        return Unit.f71690a;
    }
}
