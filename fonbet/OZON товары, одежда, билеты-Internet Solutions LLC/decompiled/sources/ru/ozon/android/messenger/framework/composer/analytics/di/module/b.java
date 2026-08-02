package ru.ozon.android.messenger.framework.composer.analytics.di.module;

import Lm0.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b implements UZ.b {
    @Override // UZ.b
    public final void sendEvent(UZ.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a.b bVar = Lm0.a.f17149a;
        bVar.b("Messenger");
        bVar.d("send messenger composer analytics: " + event, new Object[0]);
    }
}
