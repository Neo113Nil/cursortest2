package ru.ozon.app.android.csma.orderTracking.data;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManagerImpl;", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "Lxe/M;", "scope", "<init>", "(Lxe/M;)V", "", "shortDelay", "", "restartFlow", "(Z)V", "repeatingAnimation", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "tryEmit", "pauseTimer", "()V", "resumeTimer", "restartTimer", "Lxe/M;", "Lxe/B0;", "activeJob", "Lxe/B0;", "isPaused", "Z", "LAe/w0;", "_ticks", "LAe/w0;", "LAe/h;", "ticks", "LAe/h;", "getTicks", "()LAe/h;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeTimerManagerImpl implements BarcodeTimerManager {
    private static final long FIRST_DELAY_BEFORE_ANIMATION;
    private static final long REPEAT_ANIMATION_DURATION;

    @NotNull
    private final w0<Unit> _ticks;

    @NotNull
    private B0 activeJob;
    private boolean isPaused;

    @NotNull
    private final M scope;

    @NotNull
    private final InterfaceC2395h<Unit> ticks;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManagerImpl$1", f = "BarcodeTimerManagerImpl.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER, DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManagerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = BarcodeTimerManagerImpl.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            if (r8.tryEmit(r7) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M m11;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                long j11 = BarcodeTimerManagerImpl.FIRST_DELAY_BEFORE_ANIMATION;
                this.L$0 = m12;
                this.label = 1;
                if (Y.c(j11, this) != aVar) {
                    m11 = m12;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.L$0;
                s.b(obj);
                while (N.f(m11)) {
                    BarcodeTimerManagerImpl barcodeTimerManagerImpl = BarcodeTimerManagerImpl.this;
                    this.L$0 = m11;
                    this.label = 3;
                    if (barcodeTimerManagerImpl.repeatingAnimation(this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
            BarcodeTimerManagerImpl barcodeTimerManagerImpl2 = BarcodeTimerManagerImpl.this;
            this.L$0 = m11;
            this.label = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        EnumC10311b enumC10311b = EnumC10311b.SECONDS;
        FIRST_DELAY_BEFORE_ANIMATION = c.g(5, enumC10311b);
        REPEAT_ANIMATION_DURATION = c.g(30, enumC10311b);
    }

    public BarcodeTimerManagerImpl(@NotNull M scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        C0 b11 = E0.b(0, 0, null, 7);
        this._ticks = b11;
        this.ticks = C2399j.a(b11);
        this.activeJob = C10727i.c(scope, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.tryEmit(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object repeatingAnimation(d<? super Unit> dVar) {
        BarcodeTimerManagerImpl$repeatingAnimation$1 barcodeTimerManagerImpl$repeatingAnimation$1;
        int i11;
        BarcodeTimerManagerImpl barcodeTimerManagerImpl;
        if (dVar instanceof BarcodeTimerManagerImpl$repeatingAnimation$1) {
            barcodeTimerManagerImpl$repeatingAnimation$1 = (BarcodeTimerManagerImpl$repeatingAnimation$1) dVar;
            int i12 = barcodeTimerManagerImpl$repeatingAnimation$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                barcodeTimerManagerImpl$repeatingAnimation$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = barcodeTimerManagerImpl$repeatingAnimation$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = barcodeTimerManagerImpl$repeatingAnimation$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    long j11 = REPEAT_ANIMATION_DURATION;
                    barcodeTimerManagerImpl$repeatingAnimation$1.L$0 = this;
                    barcodeTimerManagerImpl$repeatingAnimation$1.label = 1;
                    if (Y.c(j11, barcodeTimerManagerImpl$repeatingAnimation$1) != aVar) {
                        barcodeTimerManagerImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                barcodeTimerManagerImpl = (BarcodeTimerManagerImpl) barcodeTimerManagerImpl$repeatingAnimation$1.L$0;
                s.b(obj);
                barcodeTimerManagerImpl$repeatingAnimation$1.L$0 = null;
                barcodeTimerManagerImpl$repeatingAnimation$1.label = 2;
            }
        }
        barcodeTimerManagerImpl$repeatingAnimation$1 = new BarcodeTimerManagerImpl$repeatingAnimation$1(this, dVar);
        Object obj2 = barcodeTimerManagerImpl$repeatingAnimation$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = barcodeTimerManagerImpl$repeatingAnimation$1.label;
        if (i11 != 0) {
        }
        barcodeTimerManagerImpl$repeatingAnimation$1.L$0 = null;
        barcodeTimerManagerImpl$repeatingAnimation$1.label = 2;
    }

    private final void restartFlow(boolean shortDelay) {
        this.activeJob.j(null);
        this.activeJob = C10727i.c(this.scope, null, null, new BarcodeTimerManagerImpl$restartFlow$1(shortDelay, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object tryEmit(d<? super Unit> dVar) {
        if (this.isPaused) {
            return Unit.f71690a;
        }
        w0<Unit> w0Var = this._ticks;
        Unit unit = Unit.f71690a;
        Object emit = w0Var.emit(unit, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : unit;
    }

    @Override // ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager
    @NotNull
    public InterfaceC2395h<Unit> getTicks() {
        return this.ticks;
    }

    @Override // ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager
    public void pauseTimer() {
        this.isPaused = true;
    }

    @Override // ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager
    public void restartTimer(boolean shortDelay) {
        this.isPaused = false;
        restartFlow(shortDelay);
    }

    @Override // ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager
    public void resumeTimer() {
        this.isPaused = false;
    }
}
