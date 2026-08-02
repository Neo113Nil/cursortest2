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

@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$saveData$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3646h5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3655i5 f40651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3646h5(C3655i5 c3655i5, String str, String str2, Continuation<? super C3646h5> continuation) {
        super(2, continuation);
        this.f40651a = c3655i5;
        this.f40652b = str;
        this.f40653c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3646h5(this.f40651a, this.f40652b, this.f40653c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((C3646h5) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File parentDirectory = this.f40651a.f40678a;
        String fileName = this.f40652b;
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        FilesKt.writeText$default(file, this.f40653c, null, 2, null);
        return Unit.INSTANCE;
    }
}
