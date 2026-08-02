package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159fk implements X6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13749a = "service_main.db";

    /* renamed from: b, reason: collision with root package name */
    public final String f13750b = "metrica_data.db";

    @Override // io.appmetrica.analytics.impl.X6
    @NotNull
    public final String a() {
        return this.f13750b;
    }

    @Override // io.appmetrica.analytics.impl.X6
    @NotNull
    public final String b() {
        return this.f13749a;
    }
}
