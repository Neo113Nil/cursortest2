package io.sentry;

import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7125b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f67758a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.F f67759b;

    /* renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.g0 f67760c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f67761d;

    /* renamed from: e, reason: collision with root package name */
    private final String f67762e;

    /* renamed from: f, reason: collision with root package name */
    private String f67763f;

    public C7125b(@NotNull byte[] bArr, @NotNull String str, String str2, String str3) {
        this.f67758a = bArr;
        this.f67759b = null;
        this.f67760c = null;
        this.f67761d = str;
        this.f67762e = str2;
        this.f67763f = str3;
    }

    @NotNull
    public static C7125b a(@NotNull io.sentry.android.core.g0 g0Var) {
        return new C7125b(g0Var);
    }

    @NotNull
    public static C7125b b(byte[] bArr) {
        return new C7125b(bArr, "thread-dump.txt", "text/plain", "event.attachment");
    }

    @NotNull
    public static C7125b c(io.sentry.protocol.F f7) {
        return new C7125b(f7);
    }

    public final String d() {
        return this.f67763f;
    }

    public final Callable<byte[]> e() {
        return this.f67760c;
    }

    public final byte[] f() {
        return this.f67758a;
    }

    public final String g() {
        return this.f67762e;
    }

    @NotNull
    public final String h() {
        return this.f67761d;
    }

    public final InterfaceC7220x0 i() {
        return this.f67759b;
    }

    public C7125b(@NotNull io.sentry.protocol.F f7) {
        this.f67758a = null;
        this.f67759b = f7;
        this.f67760c = null;
        this.f67761d = "view-hierarchy.json";
        this.f67762e = "application/json";
        this.f67763f = "event.view_hierarchy";
    }

    public C7125b(@NotNull io.sentry.android.core.g0 g0Var) {
        this.f67758a = null;
        this.f67759b = null;
        this.f67760c = g0Var;
        this.f67761d = "screenshot.png";
        this.f67762e = "image/png";
        this.f67763f = "event.attachment";
    }
}
