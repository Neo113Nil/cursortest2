package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes10.dex */
final class x0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89696b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f89697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(0);
        this.f89696b = c9414c0;
        this.f89697c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9414c0 c9414c0 = this.f89696b;
        C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new w0(c9414c0, this.f89697c, null), 3);
        return Unit.f71690a;
    }
}
