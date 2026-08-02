package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9487z extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9467e f90396b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9487z(C9467e c9467e, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        super(0);
        this.f90396b = c9467e;
        this.f90397c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        xe.B0 b02;
        C9467e c9467e = this.f90396b;
        b02 = c9467e.f90231v0;
        if (b02 == null || !b02.isActive()) {
            c9467e.f90231v0 = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9486y(null, this.f90397c, c9467e), 3);
        }
        return Unit.f71690a;
    }
}
