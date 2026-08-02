package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.i0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9426i0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89619b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89620c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d.f f89621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9426i0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, d.f fVar) {
        super(0);
        this.f89619b = c9414c0;
        this.f89620c = aVar;
        this.f89621d = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9414c0 c9414c0 = this.f89619b;
        C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C9424h0(c9414c0, this.f89620c, this.f89621d, null), 3);
        return Unit.f71690a;
    }
}
