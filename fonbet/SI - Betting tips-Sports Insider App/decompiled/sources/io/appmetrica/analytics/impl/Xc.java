package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xc extends D2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f13185b;

    public Xc(@NotNull String str, @NotNull InterfaceC0538ul interfaceC0538ul) {
        super(interfaceC0538ul);
        this.f13185b = str;
    }

    @Override // io.appmetrica.analytics.impl.D2
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.f13185b;
    }
}
