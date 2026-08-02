package com.evervault.sdk.core;

import Ng.a;
import Ng.b;
import Ng.d;
import Ph.Q;
import Ph.X;
import Tg.d;
import Tg.e;
import Wg.j;
import Xg.c;
import Xg.g;
import ah.C2023o;
import ah.C2027t;
import com.evervault.sdk.core.keys.CageKey;
import com.twilio.voice.EventKeys;
import ei.AbstractC4212b;
import ei.C4214d;
import ei.v;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/evervault/sdk/core/HttpKeysLoader;", "", "", EventKeys.URL, "<init>", "(Ljava/lang/String;)V", "Lcom/evervault/sdk/core/keys/CageKey;", "fetchKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKeys", "Ljava/lang/String;", "LPh/X;", "activeTask", "LPh/X;", "cachedKey", "Lcom/evervault/sdk/core/keys/CageKey;", "LNg/a;", "httpClient", "LNg/a;", "Lei/b;", "json", "Lei/b;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpKeysLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpKeysLoader.kt\ncom/evervault/sdk/core/HttpKeysLoader\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt$get$4\n+ 4 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,80:1\n329#2,4:81\n225#2:85\n99#2,2:87\n22#2:89\n331#3:86\n96#4:90\n*S KotlinDebug\n*F\n+ 1 HttpKeysLoader.kt\ncom/evervault/sdk/core/HttpKeysLoader\n*L\n59#1:81,4\n59#1:85\n59#1:87,2\n59#1:89\n59#1:86\n66#1:90\n*E\n"})
/* loaded from: classes2.dex */
public final class HttpKeysLoader {

    @Nullable
    private X activeTask;

    @Nullable
    private CageKey cachedKey;

    @NotNull
    private final a httpClient;

    @NotNull
    private final AbstractC4212b json;

    @NotNull
    private final String url;

    public HttpKeysLoader(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.httpClient = d.a(new Function1<b, Unit>() { // from class: com.evervault.sdk.core.HttpKeysLoader$httpClient$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
                invoke2(bVar);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull b HttpClient) {
                Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
                e.b(HttpClient, new Function1<d.a, Unit>() { // from class: com.evervault.sdk.core.HttpKeysLoader$httpClient$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(d.a aVar) {
                        invoke2(aVar);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull d.a defaultRequest) {
                        Intrinsics.checkNotNullParameter(defaultRequest, "$this$defaultRequest");
                        j.a(defaultRequest, C2023o.f16113a.h(), "application/json");
                    }
                });
            }
        });
        this.json = v.b(null, new Function1<C4214d, Unit>() { // from class: com.evervault.sdk.core.HttpKeysLoader$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                invoke2(c4214d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C4214d Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e(true);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchKeys(Continuation<? super CageKey> continuation) {
        HttpKeysLoader$fetchKeys$1 httpKeysLoader$fetchKeys$1;
        int i10;
        HttpKeysLoader httpKeysLoader;
        c cVar;
        c cVar2;
        HttpKeysLoader httpKeysLoader2;
        if (continuation instanceof HttpKeysLoader$fetchKeys$1) {
            httpKeysLoader$fetchKeys$1 = (HttpKeysLoader$fetchKeys$1) continuation;
            int i11 = httpKeysLoader$fetchKeys$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                httpKeysLoader$fetchKeys$1.label = i11 - Integer.MIN_VALUE;
                Object obj = httpKeysLoader$fetchKeys$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = httpKeysLoader$fetchKeys$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = this.httpClient;
                    String str = this.url;
                    Wg.c cVar3 = new Wg.c();
                    Wg.e.c(cVar3, str);
                    cVar3.n(C2027t.f16165b.a());
                    g gVar = new g(cVar3, aVar);
                    httpKeysLoader$fetchKeys$1.L$0 = this;
                    httpKeysLoader$fetchKeys$1.label = 1;
                    obj = gVar.c(httpKeysLoader$fetchKeys$1);
                    if (obj != coroutine_suspended) {
                        httpKeysLoader = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = (c) httpKeysLoader$fetchKeys$1.L$1;
                    httpKeysLoader2 = (HttpKeysLoader) httpKeysLoader$fetchKeys$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    AbstractC4212b abstractC4212b = httpKeysLoader2.json;
                    abstractC4212b.a();
                    CageKeyBody cageKeyBody = (CageKeyBody) abstractC4212b.d(CageKeyBody.INSTANCE.serializer(), (String) obj);
                    return new CageKey(cageKeyBody.getEcdhP256Key(), cageKeyBody.getEcdhP256KeyUncompressed(), Intrinsics.areEqual(cVar2.a().get("X-Evervault-Inputs-Debug-Mode"), "true"));
                }
                httpKeysLoader = (HttpKeysLoader) httpKeysLoader$fetchKeys$1.L$0;
                ResultKt.throwOnFailure(obj);
                cVar = (c) obj;
                if (Intrinsics.areEqual(cVar.f(), ah.v.f16209c.A())) {
                    throw new Error("Failed to fetch keys. Status code: " + cVar.f());
                }
                httpKeysLoader$fetchKeys$1.L$0 = httpKeysLoader;
                httpKeysLoader$fetchKeys$1.L$1 = cVar;
                httpKeysLoader$fetchKeys$1.label = 2;
                Object b10 = Xg.e.b(cVar, null, httpKeysLoader$fetchKeys$1, 1, null);
                if (b10 != coroutine_suspended) {
                    cVar2 = cVar;
                    obj = b10;
                    httpKeysLoader2 = httpKeysLoader;
                    AbstractC4212b abstractC4212b2 = httpKeysLoader2.json;
                    abstractC4212b2.a();
                    CageKeyBody cageKeyBody2 = (CageKeyBody) abstractC4212b2.d(CageKeyBody.INSTANCE.serializer(), (String) obj);
                    return new CageKey(cageKeyBody2.getEcdhP256Key(), cageKeyBody2.getEcdhP256KeyUncompressed(), Intrinsics.areEqual(cVar2.a().get("X-Evervault-Inputs-Debug-Mode"), "true"));
                }
                return coroutine_suspended;
            }
        }
        httpKeysLoader$fetchKeys$1 = new HttpKeysLoader$fetchKeys$1(this, continuation);
        Object obj2 = httpKeysLoader$fetchKeys$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = httpKeysLoader$fetchKeys$1.label;
        if (i10 != 0) {
        }
        cVar = (c) obj2;
        if (Intrinsics.areEqual(cVar.f(), ah.v.f16209c.A())) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadKeys(@NotNull Continuation<? super CageKey> continuation) {
        HttpKeysLoader$loadKeys$1 httpKeysLoader$loadKeys$1;
        int i10;
        HttpKeysLoader httpKeysLoader;
        if (continuation instanceof HttpKeysLoader$loadKeys$1) {
            httpKeysLoader$loadKeys$1 = (HttpKeysLoader$loadKeys$1) continuation;
            int i11 = httpKeysLoader$loadKeys$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                httpKeysLoader$loadKeys$1.label = i11 - Integer.MIN_VALUE;
                Object obj = httpKeysLoader$loadKeys$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = httpKeysLoader$loadKeys$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    X x10 = this.activeTask;
                    if (x10 != null) {
                        httpKeysLoader$loadKeys$1.label = 1;
                        Object await = x10.await(httpKeysLoader$loadKeys$1);
                        if (await != coroutine_suspended) {
                            return await;
                        }
                    } else {
                        HttpKeysLoader$loadKeys$task$1 httpKeysLoader$loadKeys$task$1 = new HttpKeysLoader$loadKeys$task$1(this, null);
                        httpKeysLoader$loadKeys$1.L$0 = this;
                        httpKeysLoader$loadKeys$1.label = 2;
                        obj = Q.g(httpKeysLoader$loadKeys$task$1, httpKeysLoader$loadKeys$1);
                        if (obj != coroutine_suspended) {
                            httpKeysLoader = this;
                        }
                    }
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                httpKeysLoader = (HttpKeysLoader) httpKeysLoader$loadKeys$1.L$0;
                ResultKt.throwOnFailure(obj);
                X x11 = (X) obj;
                httpKeysLoader.activeTask = x11;
                httpKeysLoader$loadKeys$1.L$0 = null;
                httpKeysLoader$loadKeys$1.label = 3;
                Object await2 = x11.await(httpKeysLoader$loadKeys$1);
                return await2 != coroutine_suspended ? coroutine_suspended : await2;
            }
        }
        httpKeysLoader$loadKeys$1 = new HttpKeysLoader$loadKeys$1(this, continuation);
        Object obj2 = httpKeysLoader$loadKeys$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = httpKeysLoader$loadKeys$1.label;
        if (i10 != 0) {
        }
        X x112 = (X) obj2;
        httpKeysLoader.activeTask = x112;
        httpKeysLoader$loadKeys$1.L$0 = null;
        httpKeysLoader$loadKeys$1.label = 3;
        Object await22 = x112.await(httpKeysLoader$loadKeys$1);
        if (await22 != coroutine_suspended2) {
        }
    }
}
