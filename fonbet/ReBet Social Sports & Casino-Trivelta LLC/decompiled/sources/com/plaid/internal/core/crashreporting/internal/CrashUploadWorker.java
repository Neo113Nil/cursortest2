package com.plaid.internal.core.crashreporting.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.gson.Gson;
import com.plaid.internal.C3560b0;
import com.plaid.internal.C3605d0;
import com.plaid.internal.C3614e0;
import com.plaid.internal.C3641h0;
import com.plaid.internal.C3650i0;
import com.plaid.internal.C3655i5;
import com.plaid.internal.E5;
import com.plaid.internal.W;
import com.plaid.internal.X6;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/CrashUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrashUploadWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final E5 f39854a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gson f39855b;

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker", f = "CrashUploadWorker.kt", i = {}, l = {35}, m = "doWork", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f39856a;

        /* renamed from: c, reason: collision with root package name */
        public int f39858c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39856a = obj;
            this.f39858c |= Integer.MIN_VALUE;
            return CrashUploadWorker.this.doWork(this);
        }
    }

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$doWork$2", f = "CrashUploadWorker.kt", i = {1}, l = {36, 39, 40}, m = "invokeSuspend", n = {"batchEvents"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<P, Continuation<? super c.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public List f39859a;

        /* renamed from: b, reason: collision with root package name */
        public int f39860b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3641h0 f39861c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ X6 f39862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3641h0 c3641h0, X6 x62, Continuation continuation) {
            super(2, continuation);
            this.f39861c = c3641h0;
            this.f39862d = x62;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f39861c, this.f39862d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation<? super c.a> continuation) {
            return new b(this.f39861c, this.f39862d, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        
            if (r7.a(r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        
            if (r7 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39860b;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3641h0 c3641h0 = this.f39861c;
                this.f39860b = 1;
                obj = AbstractC1455i.g(C1452g0.b(), new C3614e0(c3641h0, null), this);
            } else if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return c.a.c();
                }
                list = this.f39859a;
                ResultKt.throwOnFailure(obj);
                X6 x62 = this.f39862d;
                this.f39859a = null;
                this.f39860b = 3;
            }
            list = (List) obj;
            C3641h0 c3641h02 = this.f39861c;
            this.f39859a = list;
            this.f39860b = 2;
            Object g10 = AbstractC1455i.g(C1452g0.b(), new C3605d0(c3641h02, null), this);
            if (g10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                g10 = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashUploadWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f39854a = E5.f39229c.a(null);
        this.f39855b = new Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(@NotNull Continuation<? super c.a> continuation) {
        a aVar;
        int i10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f39858c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f39858c = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f39856a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f39858c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.work.b inputData = getInputData();
                    Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                    X6 a10 = new W(this.f39854a).a(inputData.d("crashesApiClass"));
                    CrashApiOptions crashApiOptions = (CrashApiOptions) this.f39855b.m(inputData.d("crashOptions"), CrashApiOptions.class);
                    if (crashApiOptions == null) {
                        throw new IllegalArgumentException("No crash options provided");
                    }
                    Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
                    a10.f39776c = crashApiOptions;
                    Context application = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(application, "getApplicationContext(...)");
                    Context applicationContext = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    androidx.work.b inputData2 = getInputData();
                    Intrinsics.checkNotNullExpressionValue(inputData2, "getInputData(...)");
                    CrashApiOptions crashApiOptions2 = (CrashApiOptions) this.f39855b.m(inputData2.d("crashOptions"), CrashApiOptions.class);
                    if (crashApiOptions2 == null) {
                        throw new IllegalArgumentException("No crash options provided");
                    }
                    C3560b0 crashReportFactory = new C3560b0(applicationContext, crashApiOptions2, C3650i0.f40665a);
                    Intrinsics.checkNotNullParameter(application, "application");
                    Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
                    File filesDir = application.getFilesDir();
                    Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                    C3641h0 c3641h0 = new C3641h0(new C3655i5(filesDir, "plaid-sdk/crashes"), crashReportFactory);
                    L b10 = C1452g0.b();
                    b bVar = new b(c3641h0, a10, null);
                    aVar.f39858c = 1;
                    obj = AbstractC1455i.g(b10, bVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f39856a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f39858c;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
