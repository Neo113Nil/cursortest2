package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class S3 implements T3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3792y<String, Object> f39621a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final I3 f39622b;

    public S3(WorkflowDatabase database) {
        C3554a4 cache = new C3554a4();
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f39621a = cache;
        this.f39622b = database.a();
    }

    @Override // com.plaid.internal.T3
    @Nullable
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull ContinuationImpl continuationImpl) {
        Object a10 = this.f39621a.a(str2);
        String str3 = a10 instanceof String ? (String) a10 : null;
        return str3 == null ? this.f39622b.a(str, str2, continuationImpl) : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.T3
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ContinuationImpl continuationImpl) {
        R3 r32;
        int i10;
        S3 s32;
        if (continuationImpl instanceof R3) {
            r32 = (R3) continuationImpl;
            int i11 = r32.f39588f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r32.f39588f = i11 - Integer.MIN_VALUE;
                Object obj = r32.f39586d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = r32.f39588f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    I3 i32 = this.f39622b;
                    r32.f39583a = this;
                    r32.f39584b = str2;
                    r32.f39585c = str3;
                    r32.f39588f = 1;
                    if (i32.a(str, str2, str3, r32) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    s32 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = r32.f39585c;
                    str2 = r32.f39584b;
                    s32 = r32.f39583a;
                    ResultKt.throwOnFailure(obj);
                }
                s32.f39621a.a(str2, str3);
                return Unit.INSTANCE;
            }
        }
        r32 = new R3(this, continuationImpl);
        Object obj2 = r32.f39586d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = r32.f39588f;
        if (i10 != 0) {
        }
        s32.f39621a.a(str2, str3);
        return Unit.INSTANCE;
    }

    @Override // com.plaid.internal.T3
    @Nullable
    public final Object a(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        this.f39621a.clear();
        Object a10 = this.f39622b.a(str, continuationImpl);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
