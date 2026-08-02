package com.google.firebase.sessions;

import android.util.Log;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import ru.ok.android.api.json.JsonToken;
import xsna.b6l;
import xsna.eti0;
import xsna.fvk;
import xsna.lsr;
import xsna.myc0;
import xsna.nh50;
import xsna.qkr;
import xsna.s3q0;
import xsna.spj;
import xsna.uyc0;
import xsna.wv5;
import xsna.wzs;
import xsna.xyc0;
import xsna.yvj;
import xsna.yzs;
import xsna.zvj;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes.dex */
public final class SessionDatastoreImpl implements eti0 {
    public final kotlin.coroutines.d a;
    public final fvk<uyc0> b;
    public final AtomicReference<qkr> c = new AtomicReference<>();
    public final SessionDatastoreImpl$special$$inlined$map$1 d;

    /* compiled from: SessionDatastore.kt */
    @b6l(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {84}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: SessionDatastore.kt */
        /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$a$a, reason: collision with other inner class name */
        public static final class C0145a<T> implements lsr {
            public final /* synthetic */ SessionDatastoreImpl b;

            public C0145a(SessionDatastoreImpl sessionDatastoreImpl) {
                this.b = sessionDatastoreImpl;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.c.set((qkr) obj);
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return SessionDatastoreImpl.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                SessionDatastoreImpl$special$$inlined$map$1 sessionDatastoreImpl$special$$inlined$map$1 = sessionDatastoreImpl.d;
                C0145a c0145a = new C0145a(sessionDatastoreImpl);
                this.label = 1;
                if (sessionDatastoreImpl$special$$inlined$map$1.collect(c0145a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    public static final class b {
        public static final uyc0.a<String> a = new uyc0.a<>("session_id");
    }

    /* compiled from: SessionDatastore.kt */
    @b6l(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<lsr<? super uyc0>, Throwable, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // xsna.yzs
        public final Object invoke(lsr<? super uyc0> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
            c cVar = new c(3, spjVar);
            cVar.L$0 = lsrVar;
            cVar.L$1 = th;
            return cVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lsr lsrVar = (lsr) this.L$0;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
                nh50 nh50Var = new nh50(true, 1);
                this.L$0 = null;
                this.label = 1;
                if (lsrVar.emit(nh50Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @b6l(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {JsonToken.BEGIN_ARRAY}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $sessionId;
        int label;

        /* compiled from: SessionDatastore.kt */
        @b6l(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<nh50, spj<? super s3q0>, Object> {
            final /* synthetic */ String $sessionId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$sessionId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$sessionId, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(nh50 nh50Var, spj<? super s3q0> spjVar) {
                return ((a) create(nh50Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((nh50) this.L$0).d(b.a, this.$sessionId);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$sessionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return SessionDatastoreImpl.this.new d(this.$sessionId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    fvk<uyc0> fvkVar = SessionDatastoreImpl.this.b;
                    a aVar = new a(this.$sessionId, null);
                    this.label = 1;
                    if (fvkVar.a(new xyc0(aVar, null), this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
            } catch (IOException e) {
                e.toString();
            }
            return s3q0.a;
        }
    }

    public SessionDatastoreImpl(@wv5 kotlin.coroutines.d dVar, fvk<uyc0> fvkVar) {
        this.a = dVar;
        this.b = fvkVar;
        this.d = new SessionDatastoreImpl$special$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(fvkVar.getData(), new c(3, null)), this);
        myc0.h(zvj.a(dVar), null, null, new a(null), 3);
    }

    @Override // xsna.eti0
    public final void a(String str) {
        myc0.h(zvj.a(this.a), null, null, new d(str, null), 3);
    }

    @Override // xsna.eti0
    public final String b() {
        qkr qkrVar = this.c.get();
        if (qkrVar != null) {
            return qkrVar.a;
        }
        return null;
    }
}
