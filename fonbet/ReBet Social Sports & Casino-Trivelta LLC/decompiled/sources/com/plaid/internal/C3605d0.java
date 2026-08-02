package com.plaid.internal;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$clear$2", f = "CrashStorage.kt", i = {}, l = {47, 47}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCrashStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashStorage.kt\ncom/plaid/internal/core/crashreporting/internal/CrashStorage$clear$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1855#2,2:73\n*S KotlinDebug\n*F\n+ 1 CrashStorage.kt\ncom/plaid/internal/core/crashreporting/internal/CrashStorage$clear$2\n*L\n47#1:73,2\n*E\n"})
/* renamed from: com.plaid.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3605d0 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public C3641h0 f40550a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f40551b;

    /* renamed from: c, reason: collision with root package name */
    public int f40552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3641h0 f40553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3605d0(C3641h0 c3641h0, Continuation<? super C3605d0> continuation) {
        super(2, continuation);
        this.f40553d = c3641h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3605d0(this.f40553d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3605d0(this.f40553d, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        C3641h0 c3641h0;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f40552c;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3641h0 c3641h02 = this.f40553d;
            this.f40552c = 1;
            obj = c3641h02.f40638a.a(this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f40551b;
                c3641h0 = this.f40550a;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C3655i5 c3655i5 = c3641h0.f40638a;
                    this.f40550a = c3641h0;
                    this.f40551b = it;
                    this.f40552c = 2;
                    if (c3655i5.a(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        c3641h0 = this.f40553d;
        it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
