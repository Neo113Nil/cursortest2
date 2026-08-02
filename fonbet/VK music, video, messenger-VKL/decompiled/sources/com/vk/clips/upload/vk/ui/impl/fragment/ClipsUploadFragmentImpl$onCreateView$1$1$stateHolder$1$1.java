package com.vk.clips.upload.vk.ui.impl.fragment;

import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b6l;
import xsna.gif;
import xsna.gjf;
import xsna.h1m;
import xsna.hjf;
import xsna.hqu0;
import xsna.hua;
import xsna.izs;
import xsna.ksr;
import xsna.lbf;
import xsna.lsr;
import xsna.nm8;
import xsna.qta;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.tci;
import xsna.w0b;
import xsna.whf;
import xsna.yaf;

/* compiled from: ClipsUploadFragmentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 implements whf {
    public final ksr<gif> a;
    public final nm8 b;
    public final hua c;

    /* compiled from: ClipsUploadFragmentImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<lbf, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(lbf lbfVar) {
            ((hjf) this.receiver).b(lbfVar);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsUploadFragmentImpl.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<yaf, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(yaf yafVar) {
            ((qta) this.receiver).f(yafVar);
            return s3q0.a;
        }
    }

    public ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1(final hjf hjfVar, final ClipsUploadFragmentImpl clipsUploadFragmentImpl) {
        final h1m l = tci.l(hjfVar);
        this.a = rsr.q(new ksr<gif>() { // from class: com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ ClipsUploadFragmentImpl c;
                public final /* synthetic */ hjf d;
                public final /* synthetic */ ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 e;

                @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1$special$$inlined$map$1$2", f = "ClipsUploadFragmentImpl.kt", l = {50}, m = "emit")
                /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(lsr lsrVar, ClipsUploadFragmentImpl clipsUploadFragmentImpl, hjf hjfVar, ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1 clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1) {
                    this.b = lsrVar;
                    this.c = clipsUploadFragmentImpl;
                    this.d = hjfVar;
                    this.e = clipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                gif gifVar = (gif) ((gjf) this.c.Y.getValue()).invoke((ClipsUploadState) obj, new ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1.a(1, this.d, hjf.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0), new ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1.b(1, this.e.b, qta.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8));
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (this.b.emit(gifVar, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super gif> lsrVar, spj spjVar) {
                Object collect = h1m.this.collect(new AnonymousClass2(lsrVar, clipsUploadFragmentImpl, hjfVar, this), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, hqu0.a());
        nm8 a2 = w0b.a(-2, null, null, 6);
        this.b = a2;
        this.c = new hua(a2, false);
    }

    @Override // xsna.whf
    public final qta<yaf> b() {
        return this.b;
    }

    @Override // xsna.whf
    public final ksr<gif> getState() {
        return this.a;
    }
}
