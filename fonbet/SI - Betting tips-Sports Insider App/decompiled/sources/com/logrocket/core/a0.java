package com.logrocket.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f6404a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f6405b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0[] f6406c;

    static {
        a0 a0Var = new a0("MOBILE", 0);
        f6404a = a0Var;
        a0 a0Var2 = new a0("WIFI", 1);
        f6405b = a0Var2;
        f6406c = new a0[]{a0Var, a0Var2};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f6406c.clone();
    }
}
