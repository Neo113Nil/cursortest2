package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.alert.a;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.q0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9442q0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89668b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89669c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a.C1470a f89670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9442q0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, a.C1470a c1470a) {
        super(0);
        this.f89668b = c9414c0;
        this.f89669c = aVar;
        this.f89670d = c1470a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9414c0 c9414c0 = this.f89668b;
        C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C9440p0(c9414c0, this.f89669c, this.f89670d, null), 3);
        return Unit.f71690a;
    }
}
