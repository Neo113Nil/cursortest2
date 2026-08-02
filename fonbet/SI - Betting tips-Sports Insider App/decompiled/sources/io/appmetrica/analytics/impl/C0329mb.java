package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329mb implements InterfaceC0031al {
    @Override // io.appmetrica.analytics.impl.InterfaceC0031al
    public final boolean a(@NotNull C0253jb c0253jb) {
        Integer num = c0253jb.f14026f;
        return num == null || num.intValue() != Process.myPid();
    }
}
