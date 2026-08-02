package qb;

import org.jetbrains.annotations.NotNull;

/* renamed from: qb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9017a {

    /* renamed from: a, reason: collision with root package name */
    private final int f81805a;

    /* renamed from: b, reason: collision with root package name */
    private final int f81806b;

    public C9017a(int i11, int i12) {
        this.f81805a = i11;
        this.f81806b = i12;
    }

    public final int a() {
        return this.f81806b;
    }

    public final int b() {
        return this.f81805a;
    }

    @NotNull
    public final String toString() {
        return "uid = " + this.f81805a + ", pid = " + this.f81806b;
    }
}
