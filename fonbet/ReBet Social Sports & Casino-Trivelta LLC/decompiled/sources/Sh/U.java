package Sh;

import Ph.Y0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f10779a;

    /* renamed from: b, reason: collision with root package name */
    public int f10780b;

    @NotNull
    private final Y0[] elements;

    @NotNull
    private final Object[] values;

    public U(CoroutineContext coroutineContext, int i10) {
        this.f10779a = coroutineContext;
        this.values = new Object[i10];
        this.elements = new Y0[i10];
    }

    public final void a(Y0 y02, Object obj) {
        Object[] objArr = this.values;
        int i10 = this.f10780b;
        objArr[i10] = obj;
        Y0[] y0Arr = this.elements;
        this.f10780b = i10 + 1;
        Intrinsics.checkNotNull(y02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        y0Arr[i10] = y02;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            Y0 y02 = this.elements[length];
            Intrinsics.checkNotNull(y02);
            y02.z0(coroutineContext, this.values[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
