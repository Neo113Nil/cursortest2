package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9469g extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9467e f90253b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9469g(C9467e c9467e, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        super(0);
        this.f90253b = c9467e;
        this.f90254c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9467e c9467e = this.f90253b;
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9468f(null, this.f90254c, c9467e), 3);
        return Unit.f71690a;
    }
}
