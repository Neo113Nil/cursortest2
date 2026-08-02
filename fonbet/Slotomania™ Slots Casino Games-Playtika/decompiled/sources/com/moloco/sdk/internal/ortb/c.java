package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.a;
import com.moloco.sdk.internal.ortb.model.g;
import com.moloco.sdk.internal.scheduling.DispatcherProvider;
import com.moloco.sdk.internal.v;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.Json;

/* loaded from: classes7.dex */
public final class c implements b {
    public final Json a;
    public final DispatcherProvider b;

    @DebugMetadata(c = "com.moloco.sdk.internal.ortb.BidResponseParserImpl$invoke$2", f = "BidResponseParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super v<g, com.moloco.sdk.internal.ortb.a>>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super v<g, com.moloco.sdk.internal.ortb.a>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Json json = c.this.a;
                String str = this.c;
                json.getSerializersModule();
                return new v.b(e.a((g) json.decodeFromString(g.INSTANCE.serializer(), str)));
            } catch (CancellationException e) {
                throw e;
            } catch (MissingFieldException e2) {
                return new v.a(new a.b(e2.getMissingFields()));
            } catch (Exception e3) {
                return new v.a(new a.C0242a(e3));
            }
        }
    }

    public c(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.a = json;
        this.b = com.moloco.sdk.internal.scheduling.b.a();
    }

    @Override // com.moloco.sdk.internal.ortb.b
    public Object a(String str, Continuation<? super v<g, com.moloco.sdk.internal.ortb.a>> continuation) {
        return BuildersKt.withContext(this.b.getIo(), new a(str, null), continuation);
    }
}
