package ru.ozon.android.messenger.framework.presentation.chatlist;

import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s;
import ru.ozon.app.android.messenger.databinding.MFragmentChatListBinding;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f90552a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.common.view.recycler.h f90553b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f90554c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f90555d;

    public t(Pc.a aVar, ru.ozon.android.messenger.framework.presentation.common.view.recycler.h hVar, Jb.f fVar, Jb.f fVar2) {
        this.f90552a = aVar;
        this.f90553b = hVar;
        this.f90554c = fVar;
        this.f90555d = fVar2;
    }

    public final k a(ru.ozon.android.messenger.framework.core.d dVar, A a11, InterfaceC9506s interfaceC9506s, ru.ozon.android.messenger.framework.presentation.common.view.recycler.p pVar, MFragmentChatListBinding mFragmentChatListBinding) {
        return new k(this.f90552a.get(), (ru.ozon.android.messenger.framework.presentation.common.view.recycler.g) this.f90553b.get(), (ru.ozon.android.messenger.framework.logger.b) this.f90554c.get(), interfaceC9506s, pVar, dVar, mFragmentChatListBinding, (ru.ozon.android.messenger.framework.analytics.i) this.f90555d.get(), a11);
    }
}
