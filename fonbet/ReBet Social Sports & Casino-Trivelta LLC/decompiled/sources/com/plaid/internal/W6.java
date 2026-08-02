package com.plaid.internal;

import Ph.AbstractC1459k;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2", f = "SentryCrashApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSentryCrashApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryCrashApi.kt\ncom/plaid/internal/core/crashreporting/internal/implementation/api/SentryCrashApi$sendCrashes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 SentryCrashApi.kt\ncom/plaid/internal/core/crashreporting/internal/implementation/api/SentryCrashApi$sendCrashes$2\n*L\n56#1:68,2\n*E\n"})
/* loaded from: classes3.dex */
public final class W6 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<Crash> f39745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f39746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X6 f39747d;

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2$1$1", f = "SentryCrashApi.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f39748a;

        /* renamed from: b, reason: collision with root package name */
        public int f39749b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f39750c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ X6 f39751d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Crash f39752e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, X6 x62, Crash crash, Continuation continuation) {
            super(2, continuation);
            this.f39750c = arrayList;
            this.f39751d = x62;
            this.f39752e = crash;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f39750c, this.f39751d, this.f39752e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39749b;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList2 = this.f39750c;
                Object value = this.f39751d.f39775b.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                Z6 z62 = (Z6) value;
                String a10 = this.f39751d.a();
                CrashApiOptions crashApiOptions = this.f39751d.f39776c;
                if (crashApiOptions == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                    crashApiOptions = null;
                }
                String apiKey = crashApiOptions.getApiKey();
                Crash crash = this.f39752e;
                this.f39748a = arrayList2;
                this.f39749b = 1;
                Object a11 = z62.a(a10, apiKey, crash, this);
                if (a11 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList = arrayList2;
                obj = a11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f39748a;
                ResultKt.throwOnFailure(obj);
            }
            arrayList.add(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(List list, ArrayList arrayList, X6 x62, Continuation continuation) {
        super(2, continuation);
        this.f39745b = list;
        this.f39746c = arrayList;
        this.f39747d = x62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        W6 w62 = new W6(this.f39745b, this.f39746c, this.f39747d, continuation);
        w62.f39744a = obj;
        return w62;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((W6) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Ph.P p10 = (Ph.P) this.f39744a;
        List<Crash> list = this.f39745b;
        ArrayList arrayList = this.f39746c;
        X6 x62 = this.f39747d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC1459k.d(p10, null, null, new a(arrayList, x62, (Crash) it.next(), null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
