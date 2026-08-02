package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashContextTypeAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSentryCrashApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryCrashApi.kt\ncom/plaid/internal/core/crashreporting/internal/implementation/api/SentryCrashApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n766#2:68\n857#2,2:69\n*S KotlinDebug\n*F\n+ 1 SentryCrashApi.kt\ncom/plaid/internal/core/crashreporting/internal/implementation/api/SentryCrashApi\n*L\n62#1:68\n62#1:69,2\n*E\n"})
/* loaded from: classes3.dex */
public final class X6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final E5 f39774a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f39775b;

    /* renamed from: c, reason: collision with root package name */
    public CrashApiOptions f39776c;

    public static final class a extends Lambda implements Function0<Z6> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z6 invoke() {
            E5 e52 = X6.this.f39774a;
            CrashApiOptions crashApiOptions = X6.this.f39776c;
            if (crashApiOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                crashApiOptions = null;
            }
            return (Z6) e52.a("https://analytics.plaid.com/sentry/api/" + crashApiOptions.getProjectId() + "/", new G5(new com.google.gson.d().i("yyyy-MM-dd'T'HH:mm:ss").f(CrashContext.class, new CrashContextTypeAdapter()).b(), 2)).create(Z6.class);
        }
    }

    public X6(@NotNull E5 retrofitFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        this.f39774a = retrofitFactory;
        this.f39775b = LazyKt.lazy(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Crash crash, @NotNull ContinuationImpl continuationImpl) {
        U6 u62;
        int i10;
        if (continuationImpl instanceof U6) {
            u62 = (U6) continuationImpl;
            int i11 = u62.f39671c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u62.f39671c = i11 - Integer.MIN_VALUE;
                Object obj = u62.f39669a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = u62.f39671c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object value = this.f39775b.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    Z6 z62 = (Z6) value;
                    String a10 = a();
                    CrashApiOptions crashApiOptions = this.f39776c;
                    if (crashApiOptions == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                        crashApiOptions = null;
                    }
                    String apiKey = crashApiOptions.getApiKey();
                    u62.f39671c = 1;
                    obj = z62.a(a10, apiKey, crash, u62);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(!((AbstractC3654i4) obj).a());
            }
        }
        u62 = new U6(this, continuationImpl);
        Object obj2 = u62.f39669a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = u62.f39671c;
        if (i10 != 0) {
        }
        return Boxing.boxBoolean(!((AbstractC3654i4) obj2).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull List list, @NotNull ContinuationImpl continuationImpl) {
        V6 v62;
        int i10;
        ArrayList arrayList;
        if (continuationImpl instanceof V6) {
            v62 = (V6) continuationImpl;
            int i11 = v62.f39724d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v62.f39724d = i11 - Integer.MIN_VALUE;
                Object obj = v62.f39722b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = v62.f39724d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    Ph.L b10 = C1452g0.b();
                    W6 w62 = new W6(list, arrayList2, this, null);
                    v62.f39721a = arrayList2;
                    v62.f39724d = 1;
                    if (AbstractC1455i.g(b10, w62, v62) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = arrayList2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = v62.f39721a;
                    ResultKt.throwOnFailure(obj);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((AbstractC3654i4) obj2).a()) {
                        arrayList3.add(obj2);
                    }
                }
                return Boxing.boxBoolean(!CollectionsKt.any(arrayList3));
            }
        }
        v62 = new V6(this, continuationImpl);
        Object obj3 = v62.f39722b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = v62.f39724d;
        if (i10 != 0) {
        }
        ArrayList arrayList32 = new ArrayList();
        while (r7.hasNext()) {
        }
        return Boxing.boxBoolean(!CollectionsKt.any(arrayList32));
    }

    public final String a() {
        CrashApiOptions crashApiOptions = this.f39776c;
        if (crashApiOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
            crashApiOptions = null;
        }
        return "Sentry sentry_version=6,sentry_key=" + crashApiOptions.getApiKey();
    }
}
