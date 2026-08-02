package ru.ozon.app.android.travel.molecules.extensions;

import androidx.lifecycle.P;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroidx/lifecycle/P;", "", "duration", "Lxe/M;", "coroutineScope", "Landroidx/lifecycle/T;", "debounce", "(Landroidx/lifecycle/P;JLxe/M;)Landroidx/lifecycle/T;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LiveDataDebounceExtKt {
    @NotNull
    public static final <T> T<T> debounce(@NotNull P<T> p11, long j11, @NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(p11, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        T<T> t2 = new T<>();
        t2.a(p11, new LiveDataDebounceExtKt$sam$androidx_lifecycle_Observer$0(new LiveDataDebounceExtKt$debounce$1$1(new kotlin.jvm.internal.M(), coroutineScope, j11, t2, p11)));
        return t2;
    }
}
