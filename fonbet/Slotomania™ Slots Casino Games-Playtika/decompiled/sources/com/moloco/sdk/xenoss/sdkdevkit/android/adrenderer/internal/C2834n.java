package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2834n implements InterfaceC2833m {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i a;
    public final com.moloco.sdk.internal.error.b b;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.DECLoaderImpl", f = "DECLoader.kt", i = {0, 0, 0, 0}, l = {31}, m = "load", n = {"this", "decToLoad", "mtid", "appIconUri"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n$a */
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return C2834n.this.a(null, null, this);
        }
    }

    public C2834n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.a = mediaCacheRepository;
        this.b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC2833m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(C2829i c2829i, String str, Continuation<? super C2829i> continuation) {
        a aVar;
        int i;
        String d;
        C2829i c2829i2;
        String str2;
        C2834n c2834n;
        i.a aVar2;
        C2829i c2829i3;
        String str3 = str;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                Object obj = aVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C2830j n = c2829i.n();
                    if (n == null || (d = n.d()) == null) {
                        this.b.a(C2835o.b, str3 != null ? new com.moloco.sdk.internal.error.a(str3) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                        C2835o.b("can't precache DEC: appIconUri is null");
                        return c2829i;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar = this.a;
                    aVar.a = this;
                    aVar.b = c2829i;
                    aVar.c = str3;
                    aVar.d = d;
                    aVar.g = 1;
                    Object a2 = iVar.a(d, aVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c2829i2 = c2829i;
                    str2 = d;
                    obj = a2;
                    c2834n = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) aVar.d;
                    str3 = (String) aVar.c;
                    C2829i c2829i4 = (C2829i) aVar.b;
                    c2834n = (C2834n) aVar.a;
                    ResultKt.throwOnFailure(obj);
                    c2829i2 = c2829i4;
                }
                aVar2 = (i.a) obj;
                if (aVar2 instanceof i.a.b) {
                    c2834n.b.a(C2835o.a, str3 != null ? new com.moloco.sdk.internal.error.a(str3) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                    C2835o.b("dec loading error: " + aVar2 + ": `Not found` for " + str2);
                    c2829i3 = null;
                } else {
                    c2829i3 = C2829i.a(c2829i2, null, null, null, null, null, null, null, new C2830j(c2829i2.n().f(), ((i.a.b) aVar2).a().getAbsolutePath(), c2829i2.n().e()), null, 383, null);
                }
                return c2829i3 != null ? c2829i2 : c2829i3;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.g;
        if (i != 0) {
        }
        aVar2 = (i.a) obj2;
        if (aVar2 instanceof i.a.b) {
        }
        if (c2829i3 != null) {
        }
    }
}
