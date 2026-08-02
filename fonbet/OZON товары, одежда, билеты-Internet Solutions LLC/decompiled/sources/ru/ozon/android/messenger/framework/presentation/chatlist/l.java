package ru.ozon.android.messenger.framework.presentation.chatlist;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C9513d;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function0<C9513d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f90507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(k kVar) {
        super(0);
        this.f90507b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9513d invoke() {
        ru.ozon.android.messenger.framework.core.d dVar;
        ru.ozon.android.messenger.framework.logger.b bVar;
        ru.ozon.android.messenger.framework.presentation.common.view.recycler.l lVar;
        k kVar = this.f90507b;
        dVar = kVar.f90496e;
        bVar = kVar.f90494c;
        lVar = kVar.f90499h;
        return new C9513d(dVar, bVar, lVar);
    }
}
