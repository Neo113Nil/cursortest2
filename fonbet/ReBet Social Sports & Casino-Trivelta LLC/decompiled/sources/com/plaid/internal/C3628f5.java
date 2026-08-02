package com.plaid.internal;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$loadData$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3628f5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super String>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3655i5 f40607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3628f5(C3655i5 c3655i5, String str, Continuation<? super C3628f5> continuation) {
        super(2, continuation);
        this.f40607a = c3655i5;
        this.f40608b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3628f5(this.f40607a, this.f40608b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super String> continuation) {
        return new C3628f5(this.f40607a, this.f40608b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File parentDirectory = this.f40607a.f40678a;
        String fileName = this.f40608b;
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        return FilesKt.readText$default(file, null, 1, null);
    }
}
