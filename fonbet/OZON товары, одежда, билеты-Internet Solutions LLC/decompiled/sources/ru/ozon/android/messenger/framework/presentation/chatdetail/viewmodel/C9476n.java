package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.app.android.messenger.R$color;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9476n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9467e f90303b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9476n(C9467e c9467e, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        super(0);
        this.f90303b = c9467e;
        this.f90304c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
        C9467e c9467e = this.f90303b;
        aVar = c9467e.f90220p;
        aVar.w(true, new m.a(Integer.valueOf(R$color.transparent)));
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9475m(null, this.f90304c, c9467e), 3);
        return Unit.f71690a;
    }
}
