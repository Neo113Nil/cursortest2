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
import ah.C2020l;
import ah.C2023o;
import ah.C2027t;
import bh.C2422a;
import com.evervault.sdk.HttpConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.twilio.voice.EventKeys;
import ei.AbstractC4212b;
import ei.C4214d;
import ei.v;
import hh.AbstractC4509b;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.Constants;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/evervault/sdk/core/HttpRequest;", "", "Lcom/evervault/sdk/HttpConfig;", "config", "<init>", "(Lcom/evervault/sdk/HttpConfig;)V", "", "token", EventKeys.PAYLOAD, "executeDecryptWithToken", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", EventKeys.DATA, "decryptWithToken", "Lcom/evervault/sdk/HttpConfig;", "LPh/X;", "activeTask", "LPh/X;", "LNg/a;", "httpClient", "LNg/a;", "Lei/b;", "json", "Lei/b;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\ncom/evervault/sdk/core/HttpRequest\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 4 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,76:1\n343#2:77\n233#2:78\n109#2,2:96\n22#2:98\n16#3,4:79\n21#3,10:86\n17#4,3:83\n*S KotlinDebug\n*F\n+ 1 HttpRequest.kt\ncom/evervault/sdk/core/HttpRequest\n*L\n59#1:77\n59#1:78\n59#1:96,2\n59#1:98\n60#1:79,4\n60#1:86,10\n60#1:83,3\n*E\n"})
/* loaded from: classes2.dex */
public final class HttpRequest {

    @Nullable
    private X activeTask;

    @NotNull
    private HttpConfig config;

    @NotNull
    private a httpClient;

    @NotNull
    private final AbstractC4212b json;

    public HttpRequest(@NotNull HttpConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.httpClient = d.a(new Function1<b, Unit>() { // from class: com.evervault.sdk.core.HttpRequest$httpClient$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
                invoke2(bVar);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull b HttpClient) {
                Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
                e.b(HttpClient, new Function1<d.a, Unit>() { // from class: com.evervault.sdk.core.HttpRequest$httpClient$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(d.a aVar) {
                        invoke2(aVar);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull d.a defaultRequest) {
                        Intrinsics.checkNotNullParameter(defaultRequest, "$this$defaultRequest");
                        C2023o c2023o = C2023o.f16113a;
                        j.a(defaultRequest, c2023o.h(), "application/json");
                        j.a(defaultRequest, c2023o.p(), "Evervault/Kotlin");
                    }
                });
            }
        });
        this.json = v.b(null, new Function1<C4214d, Unit>() { // from class: com.evervault.sdk.core.HttpRequest$json$1
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
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeDecryptWithToken(final String str, Object obj, Continuation<Object> continuation) {
        HttpRequest$executeDecryptWithToken$1 httpRequest$executeDecryptWithToken$1;
        int i10;
        c cVar;
        if (continuation instanceof HttpRequest$executeDecryptWithToken$1) {
            httpRequest$executeDecryptWithToken$1 = (HttpRequest$executeDecryptWithToken$1) continuation;
            int i11 = httpRequest$executeDecryptWithToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                httpRequest$executeDecryptWithToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = httpRequest$executeDecryptWithToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = httpRequest$executeDecryptWithToken$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    String v10 = new Gson().v(obj);
                    a aVar = this.httpClient;
                    String str2 = this.config.getApiUrl() + "/decrypt";
                    Wg.c cVar2 = new Wg.c();
                    Wg.e.c(cVar2, str2);
                    if (v10 == null) {
                        cVar2.j(C2422a.f25189a);
                        KType platformType = Reflection.platformType(Reflection.typeOf(String.class), Reflection.nullableTypeOf(String.class));
                        cVar2.k(AbstractC4509b.b(TypesJVMKt.getJavaType(platformType), Reflection.getOrCreateKotlinClass(String.class), platformType));
                    } else {
                        cVar2.j(v10);
                        KType platformType2 = Reflection.platformType(Reflection.typeOf(String.class), Reflection.nullableTypeOf(String.class));
                        cVar2.k(AbstractC4509b.b(TypesJVMKt.getJavaType(platformType2), Reflection.getOrCreateKotlinClass(String.class), platformType2));
                    }
                    Wg.e.a(cVar2, new Function1<C2020l, Unit>() { // from class: com.evervault.sdk.core.HttpRequest$executeDecryptWithToken$response$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C2020l c2020l) {
                            invoke2(c2020l);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull C2020l headers) {
                            Intrinsics.checkNotNullParameter(headers, "$this$headers");
                            headers.f(Constants.AUTHORIZATION_HEADER, "Token " + str);
                        }
                    });
                    cVar2.n(C2027t.f16165b.c());
                    g gVar = new g(cVar2, aVar);
                    httpRequest$executeDecryptWithToken$1.label = 1;
                    obj2 = gVar.c(httpRequest$executeDecryptWithToken$1);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: com.evervault.sdk.core.HttpRequest$executeDecryptWithToken$type$1
                        }.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<Map<String, Any>>() {}.type");
                        Object n10 = new Gson().n((String) obj2, type);
                        Intrinsics.checkNotNullExpressionValue(n10, "Gson().fromJson(responseBody, type)");
                        return (Map) n10;
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                cVar = (c) obj2;
                if (Intrinsics.areEqual(cVar.f(), ah.v.f16209c.A())) {
                    throw new Error("Failed to decrypt data. Status code: " + cVar.f());
                }
                httpRequest$executeDecryptWithToken$1.label = 2;
                obj2 = Xg.e.b(cVar, null, httpRequest$executeDecryptWithToken$1, 1, null);
            }
        }
        httpRequest$executeDecryptWithToken$1 = new HttpRequest$executeDecryptWithToken$1(this, continuation);
        Object obj22 = httpRequest$executeDecryptWithToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = httpRequest$executeDecryptWithToken$1.label;
        if (i10 != 0) {
        }
        cVar = (c) obj22;
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
    public final Object decryptWithToken(@NotNull String str, @NotNull Object obj, @NotNull Continuation<Object> continuation) {
        HttpRequest$decryptWithToken$1 httpRequest$decryptWithToken$1;
        int i10;
        HttpRequest httpRequest;
        if (continuation instanceof HttpRequest$decryptWithToken$1) {
            httpRequest$decryptWithToken$1 = (HttpRequest$decryptWithToken$1) continuation;
            int i11 = httpRequest$decryptWithToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                httpRequest$decryptWithToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = httpRequest$decryptWithToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = httpRequest$decryptWithToken$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    X x10 = this.activeTask;
                    if (x10 != null) {
                        httpRequest$decryptWithToken$1.label = 1;
                        Object await = x10.await(httpRequest$decryptWithToken$1);
                        if (await != coroutine_suspended) {
                            return await;
                        }
                    } else {
                        HttpRequest$decryptWithToken$task$1 httpRequest$decryptWithToken$task$1 = new HttpRequest$decryptWithToken$task$1(this, str, obj, null);
                        httpRequest$decryptWithToken$1.L$0 = this;
                        httpRequest$decryptWithToken$1.label = 2;
                        obj2 = Q.g(httpRequest$decryptWithToken$task$1, httpRequest$decryptWithToken$1);
                        if (obj2 != coroutine_suspended) {
                            httpRequest = this;
                        }
                    }
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj2);
                    return obj2;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return obj2;
                }
                httpRequest = (HttpRequest) httpRequest$decryptWithToken$1.L$0;
                ResultKt.throwOnFailure(obj2);
                X x11 = (X) obj2;
                httpRequest.activeTask = x11;
                httpRequest$decryptWithToken$1.L$0 = null;
                httpRequest$decryptWithToken$1.label = 3;
                Object await2 = x11.await(httpRequest$decryptWithToken$1);
                return await2 != coroutine_suspended ? coroutine_suspended : await2;
            }
        }
        httpRequest$decryptWithToken$1 = new HttpRequest$decryptWithToken$1(this, continuation);
        Object obj22 = httpRequest$decryptWithToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = httpRequest$decryptWithToken$1.label;
        if (i10 != 0) {
        }
        X x112 = (X) obj22;
        httpRequest.activeTask = x112;
        httpRequest$decryptWithToken$1.L$0 = null;
        httpRequest$decryptWithToken$1.label = 3;
        Object await22 = x112.await(httpRequest$decryptWithToken$1);
        if (await22 != coroutine_suspended2) {
        }
    }
}
