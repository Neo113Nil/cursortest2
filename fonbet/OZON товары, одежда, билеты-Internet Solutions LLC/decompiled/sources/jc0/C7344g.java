package jc0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jc0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7344g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f69713a = new ArrayList();

    public final void a(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f69713a.add(listener);
    }

    public final void b(@NotNull String otpResponseToken) {
        Intrinsics.checkNotNullParameter(otpResponseToken, "otpResponseToken");
        Function1 function1 = (Function1) C7714v.Z(this.f69713a);
        if (function1 != null) {
            function1.invoke(otpResponseToken);
        }
    }

    public final void c(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f69713a.remove(listener);
    }
}
