package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gd implements InterfaceC0031al {

    /* renamed from: a, reason: collision with root package name */
    public final int f12261a;

    public Gd(int i5) {
        this.f12261a = i5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0031al
    public final boolean a(@NotNull String str) {
        return this.f12261a != Process.myPid();
    }
}
