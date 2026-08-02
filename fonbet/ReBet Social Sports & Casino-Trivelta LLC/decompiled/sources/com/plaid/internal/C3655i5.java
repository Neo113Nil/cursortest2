package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3655i5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f40678a;

    public C3655i5(@NotNull File rootDirectory, @NotNull String directory) {
        Intrinsics.checkNotNullParameter(rootDirectory, "rootDirectory");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f40678a = new File(rootDirectory, directory);
    }

    @Nullable
    public final Object a(@NotNull SuspendLambda suspendLambda) {
        return AbstractC1455i.g(C1452g0.b(), new C3619e5(this, null), suspendLambda);
    }

    @Nullable
    public final Object a(@NotNull String str, @NotNull SuspendLambda suspendLambda) {
        Object g10 = AbstractC1455i.g(C1452g0.b(), new C3637g5(this, str, null), suspendLambda);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }
}
