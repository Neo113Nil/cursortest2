package h3;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import ed.C6345a;
import f3.AbstractC6409a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6789b implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C6789b f64735a = new C6789b();

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull kotlin.reflect.d<T> modelClass, @NotNull AbstractC6409a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) C6790c.a(C6345a.b(modelClass));
    }
}
