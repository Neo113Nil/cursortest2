package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f5570a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s1[] f5571b;

    static {
        s1 s1Var = new s1("INSTANCE", 0);
        f5570a = s1Var;
        f5571b = new s1[]{s1Var};
    }

    public static s1[] values() {
        return (s1[]) f5571b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
