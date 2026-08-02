package Jj;

import Ej.j;
import Jj.d;
import Rh.y;
import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutorService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final TelephonyManager f6186a;

    /* renamed from: b, reason: collision with root package name */
    public final j f6187b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6188c;

    /* renamed from: d, reason: collision with root package name */
    public final Xj.a f6189d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f6190e;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6191n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6192o;

        /* renamed from: Jj.d$a$a, reason: collision with other inner class name */
        public static final class C0132a extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f6194a;

            public C0132a(y yVar) {
                this.f6194a = yVar;
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                Intrinsics.checkNotNullParameter(serviceState, "serviceState");
                if (this.f6194a.p()) {
                    return;
                }
                this.f6194a.h(Boolean.valueOf(serviceState.getState() == 2));
            }
        }

        public static final class b extends PhoneStateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f6195a;

            public b(y yVar) {
                this.f6195a = yVar;
            }

            @Override // android.telephony.PhoneStateListener
            public void onCallStateChanged(int i10, String str) {
                if (this.f6195a.p()) {
                    return;
                }
                this.f6195a.h(Boolean.valueOf(i10 == 2));
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public static final Unit m(d dVar, C0132a c0132a) {
            dVar.f6186a.unregisterTelephonyCallback(Jj.a.a(c0132a));
            return Unit.INSTANCE;
        }

        public static final Unit o(d dVar, b bVar) {
            dVar.f6186a.listen(bVar, 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f6192o = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (Rh.w.a(r7, r4, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        
            if (Rh.w.a(r7, r4, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6191n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                y yVar = (y) this.f6192o;
                if (d.this.f6189d.a()) {
                    final C0132a c0132a = new C0132a(yVar);
                    d.this.f6186a.registerTelephonyCallback(d.this.f6190e, Jj.a.a(c0132a));
                    final d dVar = d.this;
                    Function0 function0 = new Function0() { // from class: Jj.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit m10;
                            m10 = d.a.m(d.this, c0132a);
                            return m10;
                        }
                    };
                    this.f6191n = 1;
                } else {
                    final b bVar = new b(yVar);
                    d.this.f6186a.listen(bVar, 32);
                    final d dVar2 = d.this;
                    Function0 function02 = new Function0() { // from class: Jj.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit o10;
                            o10 = d.a.o(d.this, bVar);
                            return o10;
                        }
                    };
                    this.f6191n = 2;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y yVar, Continuation continuation) {
            return ((a) create(yVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public d(TelephonyManager telephonyManager, j coroutinesDispatchers, Context context, Xj.a buildVersionProvider, ExecutorService executor) {
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buildVersionProvider, "buildVersionProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f6186a = telephonyManager;
        this.f6187b = coroutinesDispatchers;
        this.f6188c = context;
        this.f6189d = buildVersionProvider;
        this.f6190e = executor;
    }

    public final InterfaceC5321f d() {
        return (this.f6186a == null || !Xj.c.h(this.f6188c)) ? AbstractC5323h.z(Boolean.FALSE) : AbstractC5323h.k(AbstractC5323h.i(AbstractC5323h.B(AbstractC5323h.e(new a(null)), this.f6187b.a())));
    }
}
