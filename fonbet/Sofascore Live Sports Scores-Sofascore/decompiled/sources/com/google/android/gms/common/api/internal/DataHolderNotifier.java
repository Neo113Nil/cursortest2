package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {
    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void a(Object obj) {
        c();
    }

    public abstract void c();

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void b() {
    }
}
