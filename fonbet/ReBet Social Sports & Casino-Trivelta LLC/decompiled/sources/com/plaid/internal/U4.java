package com.plaid.internal;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readNoLoadingUi$2", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class U4 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f39666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(W4 w42, Continuation<? super U4> continuation) {
        super(2, continuation);
        this.f39666a = w42;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new U4(this.f39666a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Boolean> continuation) {
        return new U4(this.f39666a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        H5 h52 = this.f39666a.f39740a;
        h52.getClass();
        Intrinsics.checkNotNullParameter("plaid_no_loading_ui", "fileName");
        File parentDirectory = h52.f39274a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(parentDirectory, "getFilesDir(...)");
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter("plaid_no_loading_ui", "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, "plaid_no_loading_ui");
        if (!file.exists()) {
            file.createNewFile();
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(FilesKt.readText$default(file, null, 1, null), "true"));
    }
}
