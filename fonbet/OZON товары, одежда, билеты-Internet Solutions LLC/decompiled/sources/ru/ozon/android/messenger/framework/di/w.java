package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.Y;
import ru.ozon.android.messenger.framework.domain.usecases.Z;

/* loaded from: classes10.dex */
public final class w implements Jb.e<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.a> f88779a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.common.startup.a> f88780b;

    /* renamed from: c, reason: collision with root package name */
    private final Z f88781c;

    public w(m mVar, Pc.a aVar, Pc.a aVar2, Z z11) {
        this.f88779a = aVar;
        this.f88780b = aVar2;
        this.f88781c = z11;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.android.messenger.framework.data.local.a widgetStorageDelegate = this.f88779a.get();
        ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate = this.f88780b.get();
        Y setReadMessagesUseCase = (Y) this.f88781c.get();
        Intrinsics.checkNotNullParameter(widgetStorageDelegate, "widgetStorageDelegate");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(setReadMessagesUseCase, "setReadMessagesUseCase");
        return new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o(widgetStorageDelegate, chatStartupDelegate, setReadMessagesUseCase);
    }
}
