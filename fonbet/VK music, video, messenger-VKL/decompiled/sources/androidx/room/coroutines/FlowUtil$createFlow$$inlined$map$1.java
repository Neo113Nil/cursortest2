package androidx.room.coroutines;

import androidx.room.RoomDatabase;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.izs;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.u370;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class FlowUtil$createFlow$$inlined$map$1 implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ RoomDatabase c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ izs e;

    /* compiled from: Emitters.kt */
    /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;
        public final /* synthetic */ RoomDatabase c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ izs e;

        /* compiled from: Emitters.kt */
        @b6l(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
        /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(spj spjVar) {
                super(spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(lsr lsrVar, RoomDatabase roomDatabase, boolean z, izs izsVar) {
            this.b = lsrVar;
            this.c = roomDatabase;
            this.d = z;
            this.e = izsVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            if (r7.emit(r8, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (r8 == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, spj spjVar) {
            AnonymousClass1 anonymousClass1;
            int i;
            lsr lsrVar;
            if (spjVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) spjVar;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        lsr lsrVar2 = this.b;
                        anonymousClass1.L$0 = lsrVar2;
                        anonymousClass1.label = 1;
                        obj2 = u370.g(this.c, anonymousClass1, this.e, true, this.d);
                        lsrVar = lsrVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj2);
                            return s3q0.a;
                        }
                        lsr lsrVar3 = (lsr) anonymousClass1.L$0;
                        kotlin.a.a(obj2);
                        lsrVar = lsrVar3;
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }
            anonymousClass1 = new AnonymousClass1(spjVar);
            Object obj22 = anonymousClass1.result;
            Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = anonymousClass1.label;
            if (i != 0) {
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 2;
        }
    }

    public FlowUtil$createFlow$$inlined$map$1(ksr ksrVar, RoomDatabase roomDatabase, boolean z, izs izsVar) {
        this.b = ksrVar;
        this.c = roomDatabase;
        this.d = z;
        this.e = izsVar;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar, this.c, this.d, this.e), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
