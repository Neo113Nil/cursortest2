package com.google.gson;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f59798d = new e("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final e f59799e = new e("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f59800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59801b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f59802c;

    private e(String str, String str2, boolean z11) {
        Objects.requireNonNull(str, "newline == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f59800a = str;
        this.f59801b = str2;
        this.f59802c = z11;
    }

    public final String a() {
        return this.f59801b;
    }

    public final String b() {
        return this.f59800a;
    }

    public final boolean c() {
        return this.f59802c;
    }

    public final e d(String str) {
        return new e(this.f59800a, str, this.f59802c);
    }
}
