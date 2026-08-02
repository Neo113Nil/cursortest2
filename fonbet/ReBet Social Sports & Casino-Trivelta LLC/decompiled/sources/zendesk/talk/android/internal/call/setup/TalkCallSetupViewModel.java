package zendesk.talk.android.internal.call.setup;

import Dj.p;
import Dj.q;
import Ph.AbstractC1459k;
import Ph.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.N;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.flow.y;
import lb.C5444x;
import zendesk.talk.android.internal.call.setup.c;
import zendesk.talk.android.internal.call.setup.e;
import zendesk.talk.android.internal.call.setup.f;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019*\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019*\b\u0012\u0004\u0012\u00020\u001d0\u0019H\u0002¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020&0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\n088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010,R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00104R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00104R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00198\u0006¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u0010FR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u0002020\u00198\u0006¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010F¨\u0006K"}, d2 = {"Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", "Landroidx/lifecycle/Q;", "Lzendesk/talk/android/internal/call/setup/d;", "stateProcessor", "LDj/q;", "talk", "<init>", "(Lzendesk/talk/android/internal/call/setup/d;LDj/q;)V", "", "digitalLine", "", "q", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", X9.m.f13664a, "()V", "n", com.bumptech.glide.gifdecoder.e.f29601m, "o", "l", "j", "k", "LDj/p;", "recordingConsentAnswer", "p", "(LDj/p;)V", "Lkotlinx/coroutines/flow/f;", "LDj/e;", com.google.android.material.shape.i.f35755A, "(Ljava/lang/String;)Lkotlinx/coroutines/flow/f;", "Lzendesk/talk/android/internal/call/setup/c;", "f", "(Lkotlinx/coroutines/flow/f;)Lkotlinx/coroutines/flow/f;", "r", "s", "Lzendesk/talk/android/internal/call/setup/d;", "t", "LDj/q;", "Lkotlinx/coroutines/flow/x;", "Lzendesk/talk/android/internal/call/setup/e;", "u", "Lkotlinx/coroutines/flow/x;", "viewActions", "Lkotlinx/coroutines/flow/y;", "v", "Lkotlinx/coroutines/flow/y;", "stateFlow", "Lkotlinx/coroutines/flow/C;", "w", "Lkotlinx/coroutines/flow/C;", "viewActionsFlow", "Lzendesk/talk/android/internal/call/setup/f;", C5444x.f55808b, "Lkotlinx/coroutines/flow/f;", "requestPermissions", "y", "neverAskAgainPermissions", "LRh/j;", "z", "LRh/j;", "reloadPermissions", "A", "reloadLineStatus", "", "B", "permissionsData", "Lzendesk/talk/android/internal/call/setup/c$c;", "C", "loadingState", "D", C4527h.f48087o, "()Lkotlinx/coroutines/flow/f;", "state", "E", "g", "effects", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTalkCallSetupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TalkCallSetupViewModel.kt\nzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,164:1\n32#2:165\n17#2:166\n19#2:170\n49#2:171\n51#2:175\n32#2:176\n17#2:177\n19#2:181\n49#2:182\n51#2:186\n49#2:188\n51#2:192\n49#2:193\n51#2:197\n46#3:167\n51#3:169\n46#3:172\n51#3:174\n46#3:178\n51#3:180\n46#3:183\n51#3:185\n46#3:189\n51#3:191\n46#3:194\n51#3:196\n105#4:168\n105#4:173\n105#4:179\n105#4:184\n105#4:190\n105#4:195\n189#5:187\n189#5:198\n*S KotlinDebug\n*F\n+ 1 TalkCallSetupViewModel.kt\nzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel\n*L\n40#1:165\n40#1:166\n40#1:170\n41#1:171\n41#1:175\n44#1:176\n44#1:177\n44#1:181\n45#1:182\n45#1:186\n61#1:188\n61#1:192\n117#1:193\n117#1:197\n40#1:167\n40#1:169\n41#1:172\n41#1:174\n44#1:178\n44#1:180\n45#1:183\n45#1:185\n61#1:189\n61#1:191\n117#1:194\n117#1:196\n40#1:168\n41#1:173\n44#1:179\n45#1:184\n61#1:190\n117#1:195\n57#1:187\n124#1:198\n*E\n"})
/* loaded from: classes5.dex */
public final class TalkCallSetupViewModel extends Q {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final y reloadLineStatus;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC5321f permissionsData;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC5321f loadingState;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC5321f state;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC5321f effects;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final zendesk.talk.android.internal.call.setup.d stateProcessor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q talk;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final x viewActions;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final y stateFlow;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final C viewActionsFlow;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC5321f requestPermissions;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC5321f neverAskAgainPermissions;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final Rh.j reloadPermissions;

    public static final class a extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f68835n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68836o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ boolean f68837p;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object i(Dj.e eVar, boolean z10, Continuation continuation) {
            a aVar = TalkCallSetupViewModel.this.new a(continuation);
            aVar.f68836o = eVar;
            aVar.f68837p = z10;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Dj.e) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68835n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Dj.e eVar = (Dj.e) this.f68836o;
            return TalkCallSetupViewModel.this.stateProcessor.b(new Mj.a(this.f68837p, eVar));
        }
    }

    public static final class b implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68839a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TalkCallSetupViewModel f68840b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f68841c;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68842a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TalkCallSetupViewModel f68843b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f68844c;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel$b$a$a, reason: collision with other inner class name */
            public static final class C0995a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68845n;

                /* renamed from: o, reason: collision with root package name */
                public int f68846o;

                /* renamed from: p, reason: collision with root package name */
                public Object f68847p;

                public C0995a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68845n = obj;
                    this.f68846o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g, TalkCallSetupViewModel talkCallSetupViewModel, String str) {
                this.f68842a = interfaceC5322g;
                this.f68843b = talkCallSetupViewModel;
                this.f68844c = str;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
            
                if (r7.emit(r8, r0) != r1) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0995a c0995a;
                int i10;
                InterfaceC5322g interfaceC5322g;
                if (continuation instanceof C0995a) {
                    c0995a = (C0995a) continuation;
                    int i11 = c0995a.f68846o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0995a.f68846o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0995a.f68845n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0995a.f68846o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g2 = this.f68842a;
                            q qVar = this.f68843b.talk;
                            String str = this.f68844c;
                            c0995a.f68847p = interfaceC5322g2;
                            c0995a.f68846o = 1;
                            Object a10 = qVar.a(str, c0995a);
                            if (a10 != coroutine_suspended) {
                                obj2 = a10;
                                interfaceC5322g = interfaceC5322g2;
                            }
                            return coroutine_suspended;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        interfaceC5322g = (InterfaceC5322g) c0995a.f68847p;
                        ResultKt.throwOnFailure(obj2);
                        c0995a.f68847p = null;
                        c0995a.f68846o = 2;
                    }
                }
                c0995a = new C0995a(continuation);
                Object obj22 = c0995a.f68845n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0995a.f68846o;
                if (i10 != 0) {
                }
                c0995a.f68847p = null;
                c0995a.f68846o = 2;
            }
        }

        public b(InterfaceC5321f interfaceC5321f, TalkCallSetupViewModel talkCallSetupViewModel, String str) {
            this.f68839a = interfaceC5321f;
            this.f68840b = talkCallSetupViewModel;
            this.f68841c = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68839a.collect(new a(interfaceC5322g, this.f68840b, this.f68841c), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68849n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68850o;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = TalkCallSetupViewModel.this.new c(continuation);
            cVar.f68850o = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((c) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68849n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f68850o;
                Boolean boxBoolean = Boxing.boxBoolean(TalkCallSetupViewModel.this.talk.d());
                this.f68849n = 1;
                if (interfaceC5322g.emit(boxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68852a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68853a;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel$d$a$a, reason: collision with other inner class name */
            public static final class C0996a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68854n;

                /* renamed from: o, reason: collision with root package name */
                public int f68855o;

                public C0996a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68854n = obj;
                    this.f68855o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f68853a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0996a c0996a;
                int i10;
                if (continuation instanceof C0996a) {
                    c0996a = (C0996a) continuation;
                    int i11 = c0996a.f68855o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0996a.f68855o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0996a.f68854n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0996a.f68855o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f68853a;
                            if (obj instanceof e.C1007e) {
                                c0996a.f68855o = 1;
                                if (interfaceC5322g.emit(obj, c0996a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0996a = new C0996a(continuation);
                Object obj22 = c0996a.f68854n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0996a.f68855o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public d(InterfaceC5321f interfaceC5321f) {
            this.f68852a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68852a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class e implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68857a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68858a;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel$e$a$a, reason: collision with other inner class name */
            public static final class C0997a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68859n;

                /* renamed from: o, reason: collision with root package name */
                public int f68860o;

                public C0997a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68859n = obj;
                    this.f68860o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f68858a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0997a c0997a;
                int i10;
                if (continuation instanceof C0997a) {
                    c0997a = (C0997a) continuation;
                    int i11 = c0997a.f68860o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0997a.f68860o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0997a.f68859n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0997a.f68860o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f68858a;
                            if (obj instanceof e.c) {
                                c0997a.f68860o = 1;
                                if (interfaceC5322g.emit(obj, c0997a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0997a = new C0997a(continuation);
                Object obj22 = c0997a.f68859n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0997a.f68860o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public e(InterfaceC5321f interfaceC5321f) {
            this.f68857a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68857a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f68862n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68863o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f68864p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TalkCallSetupViewModel f68865q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Continuation continuation, TalkCallSetupViewModel talkCallSetupViewModel) {
            super(3, continuation);
            this.f68865q = talkCallSetupViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            f fVar = new f(continuation, this.f68865q);
            fVar.f68863o = interfaceC5322g;
            fVar.f68864p = obj;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68862n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f68863o;
                InterfaceC5321f x10 = AbstractC5323h.x(this.f68865q.new c(null));
                this.f68862n = 1;
                if (AbstractC5323h.p(interfaceC5322g, x10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68866a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68867a;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel$g$a$a, reason: collision with other inner class name */
            public static final class C0998a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68868n;

                /* renamed from: o, reason: collision with root package name */
                public int f68869o;

                public C0998a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68868n = obj;
                    this.f68869o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f68867a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0998a c0998a;
                int i10;
                if (continuation instanceof C0998a) {
                    c0998a = (C0998a) continuation;
                    int i11 = c0998a.f68869o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0998a.f68869o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0998a.f68868n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0998a.f68869o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f68867a;
                            f.b bVar = f.b.f68917a;
                            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type zendesk.talk.android.internal.call.setup.TalkCallSetupViewEffect");
                            c0998a.f68869o = 1;
                            if (interfaceC5322g.emit(bVar, c0998a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0998a = new C0998a(continuation);
                Object obj22 = c0998a.f68868n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0998a.f68869o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public g(InterfaceC5321f interfaceC5321f) {
            this.f68866a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68866a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class h implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68871a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68872a;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel$h$a$a, reason: collision with other inner class name */
            public static final class C0999a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68873n;

                /* renamed from: o, reason: collision with root package name */
                public int f68874o;

                public C0999a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68873n = obj;
                    this.f68874o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f68872a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0999a c0999a;
                int i10;
                if (continuation instanceof C0999a) {
                    c0999a = (C0999a) continuation;
                    int i11 = c0999a.f68874o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0999a.f68874o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0999a.f68873n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0999a.f68874o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f68872a;
                            f.a aVar = f.a.f68916a;
                            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type zendesk.talk.android.internal.call.setup.TalkCallSetupViewEffect");
                            c0999a.f68874o = 1;
                            if (interfaceC5322g.emit(aVar, c0999a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0999a = new C0999a(continuation);
                Object obj22 = c0999a.f68873n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0999a.f68874o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public h(InterfaceC5321f interfaceC5321f) {
            this.f68871a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68871a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class i implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68876a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68877a;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel$i$a$a, reason: collision with other inner class name */
            public static final class C1000a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68878n;

                /* renamed from: o, reason: collision with root package name */
                public int f68879o;

                public C1000a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68878n = obj;
                    this.f68879o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f68877a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1000a c1000a;
                int i10;
                if (continuation instanceof C1000a) {
                    c1000a = (C1000a) continuation;
                    int i11 = c1000a.f68879o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1000a.f68879o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c1000a.f68878n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c1000a.f68879o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f68877a;
                            c.C1006c c1006c = c.C1006c.f68907a;
                            c1000a.f68879o = 1;
                            if (interfaceC5322g.emit(c1006c, c1000a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1000a = new C1000a(continuation);
                Object obj22 = c1000a.f68878n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c1000a.f68879o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public i(InterfaceC5321f interfaceC5321f) {
            this.f68876a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68876a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68881n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68882o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ TalkCallSetupViewModel f68883p;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TalkCallSetupViewModel f68884a;

            public a(TalkCallSetupViewModel talkCallSetupViewModel) {
                this.f68884a = talkCallSetupViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(zendesk.talk.android.internal.call.setup.c cVar, Continuation continuation) {
                this.f68884a.stateFlow.setValue(cVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC5321f interfaceC5321f, TalkCallSetupViewModel talkCallSetupViewModel, Continuation continuation) {
            super(2, continuation);
            this.f68882o = interfaceC5321f;
            this.f68883p = talkCallSetupViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f68882o, this.f68883p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68881n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = this.f68882o;
                a aVar = new a(this.f68883p);
                this.f68881n = 1;
                if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68885n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68886o;

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = new k(continuation);
            kVar.f68886o = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((k) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68885n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f68886o;
                c.C1006c c1006c = c.C1006c.f68907a;
                this.f68885n = 1;
                if (interfaceC5322g.emit(c1006c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f68887n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68888o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f68889p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TalkCallSetupViewModel f68890q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Continuation continuation, TalkCallSetupViewModel talkCallSetupViewModel) {
            super(3, continuation);
            this.f68890q = talkCallSetupViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            l lVar = new l(continuation, this.f68890q);
            lVar.f68888o = interfaceC5322g;
            lVar.f68889p = obj;
            return lVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68887n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f68888o;
                InterfaceC5321f J10 = AbstractC5323h.J(this.f68890q.viewActionsFlow, (zendesk.talk.android.internal.call.setup.c) this.f68889p, this.f68890q.new m(null));
                this.f68887n = 1;
                if (AbstractC5323h.p(interfaceC5322g, J10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f68891n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68892o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f68893p;

        public m(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zendesk.talk.android.internal.call.setup.c cVar, zendesk.talk.android.internal.call.setup.e eVar, Continuation continuation) {
            m mVar = TalkCallSetupViewModel.this.new m(continuation);
            mVar.f68892o = cVar;
            mVar.f68893p = eVar;
            return mVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68891n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TalkCallSetupViewModel.this.stateProcessor.c((zendesk.talk.android.internal.call.setup.c) this.f68892o, (zendesk.talk.android.internal.call.setup.e) this.f68893p);
        }
    }

    public TalkCallSetupViewModel(zendesk.talk.android.internal.call.setup.d stateProcessor, q talk) {
        InterfaceC5321f c10;
        Intrinsics.checkNotNullParameter(stateProcessor, "stateProcessor");
        Intrinsics.checkNotNullParameter(talk, "talk");
        this.stateProcessor = stateProcessor;
        this.talk = talk;
        x b10 = E.b(1, 0, null, 6, null);
        this.viewActions = b10;
        y a10 = N.a(c.C1006c.f68907a);
        this.stateFlow = a10;
        C a11 = AbstractC5323h.a(b10);
        this.viewActionsFlow = a11;
        g gVar = new g(new d(a11));
        this.requestPermissions = gVar;
        h hVar = new h(new e(a11));
        this.neverAskAgainPermissions = hVar;
        Rh.j b11 = Rh.m.b(0, null, null, 7, null);
        this.reloadPermissions = b11;
        y a12 = N.a(Unit.INSTANCE);
        this.reloadLineStatus = a12;
        this.permissionsData = AbstractC5323h.O(AbstractC5323h.j(b11), new f(null, this));
        this.loadingState = new i(AbstractC5323h.b(a12));
        this.state = AbstractC5323h.b(a10);
        c10 = s.c(AbstractC5323h.A(gVar, hVar), 0, 1, null);
        this.effects = c10;
    }

    public final void e() {
        this.viewActions.a(e.a.f68910a);
    }

    public final InterfaceC5321f f(InterfaceC5321f interfaceC5321f) {
        return AbstractC5323h.y(interfaceC5321f, this.permissionsData, new a(null));
    }

    /* renamed from: g, reason: from getter */
    public final InterfaceC5321f getEffects() {
        return this.effects;
    }

    /* renamed from: h, reason: from getter */
    public final InterfaceC5321f getState() {
        return this.state;
    }

    public final InterfaceC5321f i(String digitalLine) {
        return new b(AbstractC5323h.b(this.reloadLineStatus), this, digitalLine);
    }

    public final void j() {
        this.viewActions.a(e.b.f68911a);
    }

    public final void k() {
        this.viewActions.a(e.c.f68912a);
    }

    public final void l() {
        this.viewActions.a(e.d.f68913a);
    }

    public final void m() {
        this.reloadPermissions.h(Unit.INSTANCE);
    }

    public final void n() {
        this.reloadLineStatus.a(Unit.INSTANCE);
    }

    public final void o() {
        this.viewActions.a(e.C1007e.f68914a);
    }

    public final void p(p recordingConsentAnswer) {
        Intrinsics.checkNotNullParameter(recordingConsentAnswer, "recordingConsentAnswer");
        this.viewActions.a(new e.f(recordingConsentAnswer));
    }

    public final Object q(String str, Continuation continuation) {
        InterfaceC5321f c10;
        c10 = s.c(AbstractC5323h.A(this.loadingState, r(AbstractC5323h.G(f(i(str)), new k(null)))), 0, 1, null);
        AbstractC1459k.d(S.a(this), null, null, new j(AbstractC5323h.k(c10), this, null), 3, null);
        return Unit.INSTANCE;
    }

    public final InterfaceC5321f r(InterfaceC5321f interfaceC5321f) {
        return AbstractC5323h.O(interfaceC5321f, new l(null, this));
    }
}
