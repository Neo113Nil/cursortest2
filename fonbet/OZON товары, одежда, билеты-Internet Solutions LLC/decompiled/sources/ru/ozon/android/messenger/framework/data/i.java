package ru.ozon.android.messenger.framework.data;

import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import vj0.C10326a;

/* loaded from: classes10.dex */
public final class i implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87420a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f87421b;

    public i(Jb.f fVar) {
        this.f87421b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f87420a) {
            case 0:
                ru.ozon.android.messenger.framework.core.initialization.d config = (ru.ozon.android.messenger.framework.core.initialization.d) this.f87421b.get();
                ru.ozon.android.messenger.framework.logger.d logger = new ru.ozon.android.messenger.framework.logger.d();
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(logger, "logger");
                return new m(config, logger);
            default:
                InterfaceC6369b tracker = (InterfaceC6369b) this.f87421b.get();
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                return new C10326a(tracker);
        }
    }

    public i(Jb.f fVar, ru.ozon.android.messenger.framework.logger.e eVar) {
        this.f87421b = fVar;
    }
}
