package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0630yd extends Xe implements InterfaceC0538ul {
    public AbstractC0630yd(@NotNull Ha ha2, @Nullable String str) {
        super(ha2, str);
    }

    @Nullable
    public final String c(@NotNull String str, @Nullable String str2) {
        return this.f13187a.getString(f(str), str2);
    }

    @NotNull
    public final InterfaceC0538ul d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC0538ul) b(f(str), str2);
    }

    public final boolean e(@NotNull String str) {
        return this.f13187a.a(f(str));
    }

    @NotNull
    public abstract String f(@NotNull String str);

    @NotNull
    public InterfaceC0538ul g(@NotNull String str) {
        return (InterfaceC0538ul) d(f(str));
    }

    public AbstractC0630yd(@NotNull Ha ha2) {
        this(ha2, null);
    }

    @NotNull
    public final InterfaceC0538ul d(@NotNull String str, int i5) {
        return (InterfaceC0538ul) b(f(str), i5);
    }

    public final int c(@NotNull String str, int i5) {
        return this.f13187a.getInt(f(str), i5);
    }

    @NotNull
    public final InterfaceC0538ul d(@NotNull String str, long j) {
        return (InterfaceC0538ul) b(f(str), j);
    }

    @NotNull
    public final InterfaceC0538ul d(@NotNull String str, boolean z5) {
        return (InterfaceC0538ul) b(f(str), z5);
    }

    public final long c(@NotNull String str, long j) {
        return this.f13187a.getLong(f(str), j);
    }

    public final boolean c(@NotNull String str, boolean z5) {
        return this.f13187a.getBoolean(f(str), z5);
    }
}
