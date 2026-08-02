package f3;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6410b implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6413e<?>[] f62497a;

    public C6410b(@NotNull C6413e<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f62497a = initializers;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <VM extends w0> VM create(@NotNull Class<VM> modelClass, @NotNull AbstractC6409a extras) {
        VM vm;
        C6413e c6413e;
        Function1 b11;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        kotlin.reflect.d modelClass2 = N.b(modelClass);
        C6413e<?>[] c6413eArr = this.f62497a;
        C6413e[] initializers = (C6413e[]) Arrays.copyOf(c6413eArr, c6413eArr.length);
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i11 = 0;
        while (true) {
            vm = null;
            if (i11 >= length) {
                c6413e = null;
                break;
            }
            c6413e = initializers[i11];
            if (Intrinsics.d(c6413e.a(), modelClass2)) {
                break;
            }
            i11++;
        }
        if (c6413e != null && (b11 = c6413e.b()) != null) {
            vm = (VM) b11.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        StringBuilder sb2 = new StringBuilder("No initializer set for given class ");
        Intrinsics.checkNotNullParameter(modelClass2, "<this>");
        sb2.append(modelClass2.u());
        throw new IllegalArgumentException(sb2.toString().toString());
    }
}
