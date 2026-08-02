package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class T4 {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f12902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12903b = "[ComponentMigrationToV113]";

    public T4(X4 x42) {
        this.f12902a = x42;
    }

    @NotNull
    public final X4 a() {
        return this.f12902a;
    }

    @NotNull
    public final String b() {
        return this.f12903b;
    }

    public abstract boolean b(int i5);

    public abstract void c();

    public final void a(int i5) {
        if (b(i5)) {
            c();
        }
    }
}
