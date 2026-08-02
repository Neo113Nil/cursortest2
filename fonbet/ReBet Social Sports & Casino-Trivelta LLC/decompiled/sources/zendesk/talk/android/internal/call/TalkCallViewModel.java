package zendesk.talk.android.internal.call;

import Dj.p;
import Fj.C1155a;
import Fj.C1160f;
import Fj.t;
import X9.m;
import androidx.lifecycle.Q;
import com.google.android.material.shape.i;
import i3.C4527h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import zendesk.talk.android.internal.call.a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u000eJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ+\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u001f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00104\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u00108\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00103¨\u00069"}, d2 = {"Lzendesk/talk/android/internal/call/TalkCallViewModel;", "Landroidx/lifecycle/Q;", "LKj/b;", "interactor", "LFj/t;", "talkCallStarter", "LFj/f;", "proximitySensor", "LFj/a;", "activeCallChecker", "<init>", "(LKj/b;LFj/t;LFj/f;LFj/a;)V", "", W9.d.f13160a, "()V", "o", "n", "LDj/b;", "audioOutput", com.google.crypto.tink.integration.android.b.f37029b, "(LDj/b;)V", "", "digitalLine", "LDj/p;", "recordingConsentAnswer", "", "stateRestored", C4527h.f48087o, "(Ljava/lang/String;LDj/p;Z)Z", "l", m.f13664a, "Lkotlinx/coroutines/flow/f;", "", "LDj/a;", "g", "(Lkotlinx/coroutines/flow/f;)Lkotlinx/coroutines/flow/f;", "s", "LKj/b;", "t", "LFj/t;", "u", "LFj/f;", "v", "LFj/a;", "Lzendesk/talk/android/internal/call/a;", "f", "()Lkotlinx/coroutines/flow/f;", "state", com.bumptech.glide.gifdecoder.e.f29601m, "audioDevices", "j", "()Z", "isBluetoothAudioAvailable", i.f35755A, "isAfterFinished", "k", "isNotStarted", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TalkCallViewModel extends Q {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Kj.b interactor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final t talkCallStarter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final C1160f proximitySensor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final C1155a activeCallChecker;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68743n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68744o;

        /* renamed from: zendesk.talk.android.internal.call.TalkCallViewModel$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0987a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Dj.b.values().length];
                try {
                    iArr[Dj.b.f2813a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Dj.b.f2814b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Dj.b.f2815c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = TalkCallViewModel.this.new a(continuation);
            aVar.f68744o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Continuation continuation) {
            return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68743n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = ((List) this.f68744o).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((Dj.a) obj2).b()) {
                    break;
                }
            }
            Dj.a aVar = (Dj.a) obj2;
            Dj.b a10 = aVar != null ? aVar.a() : null;
            int i10 = a10 == null ? -1 : C0987a.$EnumSwitchMapping$0[a10.ordinal()];
            if (i10 != -1) {
                if (i10 == 1) {
                    TalkCallViewModel.this.proximitySensor.b();
                } else if (i10 == 2) {
                    TalkCallViewModel.this.proximitySensor.a();
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TalkCallViewModel.this.proximitySensor.b();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public TalkCallViewModel(Kj.b interactor, t talkCallStarter, C1160f proximitySensor, C1155a activeCallChecker) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(talkCallStarter, "talkCallStarter");
        Intrinsics.checkNotNullParameter(proximitySensor, "proximitySensor");
        Intrinsics.checkNotNullParameter(activeCallChecker, "activeCallChecker");
        this.interactor = interactor;
        this.talkCallStarter = talkCallStarter;
        this.proximitySensor = proximitySensor;
        this.activeCallChecker = activeCallChecker;
    }

    public final void b(Dj.b audioOutput) {
        Intrinsics.checkNotNullParameter(audioOutput, "audioOutput");
        this.interactor.k(audioOutput);
    }

    public final void d() {
        this.interactor.n();
    }

    public final InterfaceC5321f e() {
        return g(this.interactor.p());
    }

    public final InterfaceC5321f f() {
        return this.interactor.r();
    }

    public final InterfaceC5321f g(InterfaceC5321f interfaceC5321f) {
        return AbstractC5323h.F(interfaceC5321f, new a(null));
    }

    public final boolean h(String digitalLine, p recordingConsentAnswer, boolean stateRestored) {
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        if ((stateRestored && !this.activeCallChecker.a()) || i()) {
            return false;
        }
        if (k()) {
            this.talkCallStarter.a(digitalLine, recordingConsentAnswer);
        }
        return true;
    }

    public final boolean i() {
        return this.interactor.q() instanceof a.AbstractC0988a;
    }

    public final boolean j() {
        return this.interactor.s();
    }

    public final boolean k() {
        return (this.interactor.q() instanceof a.d) && this.interactor.q().a() == null;
    }

    public final void l() {
        this.proximitySensor.a();
    }

    public final void m() {
        this.proximitySensor.b();
    }

    public final void n() {
        this.interactor.w();
    }

    public final void o() {
        this.interactor.x();
    }
}
