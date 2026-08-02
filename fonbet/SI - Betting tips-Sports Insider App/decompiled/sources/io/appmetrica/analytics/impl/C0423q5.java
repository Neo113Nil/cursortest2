package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423q5 implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final String f14502a;

    public C0423q5(@NotNull String str) {
        this.f14502a = str;
    }

    @NotNull
    public final C0423q5 a(@NotNull String str) {
        return new C0423q5(str);
    }

    @NotNull
    public final String b() {
        return this.f14502a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0423q5) && Intrinsics.areEqual(this.f14502a, ((C0423q5) obj).f14502a);
    }

    public final int hashCode() {
        return this.f14502a.hashCode();
    }

    @NotNull
    public final String toString() {
        return d9.e.k(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.f14502a, ')');
    }

    public static C0423q5 a(C0423q5 c0423q5, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0423q5.f14502a;
        }
        c0423q5.getClass();
        return new C0423q5(str);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    @NotNull
    public final String a() {
        return this.f14502a;
    }
}
