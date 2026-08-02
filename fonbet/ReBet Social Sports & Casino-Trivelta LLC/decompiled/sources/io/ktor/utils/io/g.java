package io.ktor.utils.io;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class g {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49441n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49442o;

        /* renamed from: p, reason: collision with root package name */
        public Object f49443p;

        /* renamed from: q, reason: collision with root package name */
        public long f49444q;

        /* renamed from: r, reason: collision with root package name */
        public long f49445r;

        /* renamed from: s, reason: collision with root package name */
        public int f49446s;

        /* renamed from: t, reason: collision with root package name */
        public int f49447t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f49448u;

        /* renamed from: v, reason: collision with root package name */
        public int f49449v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49448u = obj;
            this.f49449v |= Integer.MIN_VALUE;
            return g.c(null, null, 0L, this);
        }
    }

    public static final Object b(f fVar, i iVar, long j10, Continuation continuation) {
        if (fVar != iVar) {
            return j10 == 0 ? Boxing.boxLong(0L) : ((fVar instanceof io.ktor.utils.io.a) && (iVar instanceof io.ktor.utils.io.a)) ? ((io.ktor.utils.io.a) iVar).J((io.ktor.utils.io.a) fVar, j10, null, continuation) : c(fVar, iVar, j10, continuation);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:37:0x00e6, B:39:0x00ec, B:20:0x008f), top: B:36:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:12:0x0040, B:23:0x00bb, B:25:0x00c4, B:29:0x00ff, B:53:0x0067), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00db -> B:14:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f fVar, i iVar, long j10, Continuation continuation) {
        a aVar;
        int i10;
        i iVar2;
        C5466a c5466a;
        long j11;
        ?? r10;
        long j12;
        f fVar2;
        a aVar2;
        i iVar3;
        f fVar3;
        long j13;
        long j14;
        int i11;
        int intValue;
        long j15;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i12 = aVar.f49449v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    aVar.f49449v = i12 - Integer.MIN_VALUE;
                    Object obj = aVar.f49448u;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f49449v;
                    long j16 = 0;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        j11 = j10;
                        c5466a = (C5466a) C5466a.f55859j.c().V0();
                        r10 = !iVar.l();
                        j12 = 0;
                        fVar2 = fVar;
                        aVar2 = aVar;
                        iVar3 = iVar;
                        j15 = j11 - j12;
                        if (j15 != j16) {
                        }
                    } else if (i10 == 1) {
                        j14 = aVar.f49445r;
                        i11 = aVar.f49446s;
                        j13 = aVar.f49444q;
                        c5466a = (C5466a) aVar.f49443p;
                        iVar2 = (i) aVar.f49442o;
                        fVar3 = (f) aVar.f49441n;
                        ResultKt.throwOnFailure(obj);
                        intValue = ((Number) obj).intValue();
                        if (intValue != -1) {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i13 = aVar.f49447t;
                        j14 = aVar.f49445r;
                        int i14 = aVar.f49446s;
                        long j17 = aVar.f49444q;
                        c5466a = (C5466a) aVar.f49443p;
                        iVar2 = (i) aVar.f49442o;
                        f fVar4 = (f) aVar.f49441n;
                        ResultKt.throwOnFailure(obj);
                        fVar2 = fVar4;
                        int i15 = i14;
                        a aVar3 = aVar;
                        iVar3 = iVar2;
                        long j18 = j14 + i13;
                        if (i15 != 0) {
                            try {
                                if (fVar2.d() == 0) {
                                    iVar3.flush();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                iVar2 = iVar3;
                                try {
                                    iVar2.a(th);
                                    throw th;
                                } finally {
                                    c5466a.B(C5466a.f55859j.c());
                                }
                            }
                        }
                        long j19 = j17;
                        j12 = j18;
                        j11 = j19;
                        aVar2 = aVar3;
                        j16 = 0;
                        r10 = i15;
                        j15 = j11 - j12;
                        if (j15 != j16) {
                            c5466a.s((int) Math.min(c5466a.e(), j15));
                            aVar2.f49441n = fVar2;
                            aVar2.f49442o = iVar3;
                            aVar2.f49443p = c5466a;
                            aVar2.f49444q = j11;
                            aVar2.f49446s = r10;
                            aVar2.f49445r = j12;
                            aVar2.f49449v = 1;
                            Object e10 = fVar2.e(c5466a, aVar2);
                            if (e10 != coroutine_suspended) {
                                iVar2 = iVar3;
                                aVar = aVar2;
                                i11 = r10;
                                fVar3 = fVar2;
                                obj = e10;
                                j13 = j11;
                                j14 = j12;
                                intValue = ((Number) obj).intValue();
                                if (intValue != -1) {
                                    j12 = j14;
                                    return Boxing.boxLong(j12);
                                }
                                aVar.f49441n = fVar3;
                                aVar.f49442o = iVar2;
                                aVar.f49443p = c5466a;
                                aVar.f49444q = j13;
                                aVar.f49446s = i11;
                                aVar.f49445r = j14;
                                aVar.f49447t = intValue;
                                aVar.f49449v = 2;
                                if (iVar2.k(c5466a, aVar) != coroutine_suspended) {
                                    int i16 = i11;
                                    i13 = intValue;
                                    fVar2 = fVar3;
                                    j17 = j13;
                                    i15 = i16;
                                    a aVar32 = aVar;
                                    iVar3 = iVar2;
                                    long j182 = j14 + i13;
                                    if (i15 != 0) {
                                    }
                                    long j192 = j17;
                                    j12 = j182;
                                    j11 = j192;
                                    aVar2 = aVar32;
                                    j16 = 0;
                                    r10 = i15;
                                    j15 = j11 - j12;
                                    if (j15 != j16) {
                                        iVar2 = iVar3;
                                        return Boxing.boxLong(j12);
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                }
            }
            if (i10 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f49448u;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f49449v;
        long j162 = 0;
    }
}
