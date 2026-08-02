package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ig implements Kl {

    /* renamed from: a, reason: collision with root package name */
    public final Am f12384a;

    public Ig(@NonNull Am am) {
        this.f12384a = am;
    }

    @Override // io.appmetrica.analytics.impl.Kl
    public final void a() {
        NetworkTask c2 = this.f12384a.c();
        if (c2 != null) {
            C0353na.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c2);
        }
    }
}
