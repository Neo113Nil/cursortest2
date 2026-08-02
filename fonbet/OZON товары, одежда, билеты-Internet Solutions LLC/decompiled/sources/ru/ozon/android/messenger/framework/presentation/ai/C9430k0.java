package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.k0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9430k0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89630b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9430k0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        super(0);
        this.f89630b = c9414c0;
        this.f89631c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9414c0 c9414c0 = this.f89630b;
        if (c9414c0.N0().b().getValue().booleanValue()) {
            c9414c0.N0().a();
            C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C9428j0(c9414c0, this.f89631c, null), 3);
        }
        return Unit.f71690a;
    }
}
