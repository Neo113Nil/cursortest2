package zendesk.talk.android.internal.call.service;

import Dj.p;
import Ej.s;
import Fj.C1155a;
import Fj.InterfaceC1157c;
import Lj.a;
import Ph.P;
import Xj.g;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.AbstractServiceC2198x;
import com.bumptech.glide.gifdecoder.e;
import com.google.android.material.shape.i;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import zendesk.talk.android.internal.call.a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 92\u00020\u0001:\u0002:\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J)\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u000605R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lzendesk/talk/android/internal/call/service/TalkCallService;", "Landroidx/lifecycle/x;", "<init>", "()V", "", "onCreate", "onDestroy", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "LLj/b;", com.google.crypto.tink.integration.android.b.f37029b, "LLj/b;", "l", "()LLj/b;", "setTalkCallNotification", "(LLj/b;)V", "talkCallNotification", "LLj/a;", "c", "LLj/a;", "j", "()LLj/a;", "setPendingIntentFactory", "(LLj/a;)V", "pendingIntentFactory", "LKj/b;", W9.d.f13160a, "LKj/b;", "k", "()LKj/b;", "setTalkCallInteractor", "(LKj/b;)V", "talkCallInteractor", "LFj/a;", e.f29601m, "LFj/a;", i.f35755A, "()LFj/a;", "setActiveCallChecker", "(LFj/a;)V", "activeCallChecker", "", "f", "Z", "callOngoing", "Lzendesk/talk/android/internal/call/service/TalkCallService$b;", "g", "Lzendesk/talk/android/internal/call/service/TalkCallService$b;", "receiver", C4527h.f48087o, "a", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TalkCallService extends AbstractServiceC2198x {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static InterfaceC1157c f68785i;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Lj.b talkCallNotification;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a pendingIntentFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Kj.b talkCallInteractor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public C1155a activeCallChecker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean callOngoing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final b receiver = new b();

    /* renamed from: zendesk.talk.android.internal.call.service.TalkCallService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1157c c() {
            InterfaceC1157c interfaceC1157c = TalkCallService.f68785i;
            if (interfaceC1157c != null) {
                return interfaceC1157c;
            }
            InterfaceC1157c create = s.f3210e.b().a().create();
            TalkCallService.f68785i = create;
            return create;
        }

        public final String d(Intent intent) {
            String stringExtra = intent.getStringExtra("talk_sdk_android_digital_line");
            Intrinsics.checkNotNull(stringExtra);
            return stringExtra;
        }

        public final p e(Intent intent) {
            return (p) g.b(intent, "talk_sdk_android_recording_answer");
        }

        public final Intent f(Context context, String digitalLine, p pVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
            Intent putExtra = new Intent(context, (Class<?>) TalkCallService.class).putExtra("talk_sdk_android_digital_line", digitalLine).putExtra("talk_sdk_android_recording_answer", pVar);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        public Companion() {
        }
    }

    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TalkCallService.this.k().n();
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68793n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ PendingIntent f68795p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ PendingIntent f68796q;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TalkCallService f68797a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingIntent f68798b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PendingIntent f68799c;

            public a(TalkCallService talkCallService, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                this.f68797a = talkCallService;
                this.f68798b = pendingIntent;
                this.f68799c = pendingIntent2;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(zendesk.talk.android.internal.call.a aVar, Continuation continuation) {
                boolean z10 = aVar instanceof a.AbstractC0988a;
                if (!z10) {
                    this.f68797a.l().f(this.f68798b, aVar, 100, this.f68799c);
                }
                if (z10) {
                    this.f68797a.callOngoing = false;
                    this.f68797a.i().b(false);
                    this.f68797a.stopForeground(true);
                    this.f68797a.stopSelf();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PendingIntent pendingIntent, PendingIntent pendingIntent2, Continuation continuation) {
            super(2, continuation);
            this.f68795p = pendingIntent;
            this.f68796q = pendingIntent2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallService.this.new c(this.f68795p, this.f68796q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68793n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f r10 = TalkCallService.this.k().r();
                a aVar = new a(TalkCallService.this, this.f68795p, this.f68796q);
                this.f68793n = 1;
                if (r10.collect(aVar, this) == coroutine_suspended) {
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

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68800n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f68802p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f68803q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, p pVar, Continuation continuation) {
            super(2, continuation);
            this.f68802p = str;
            this.f68803q = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallService.this.new d(this.f68802p, this.f68803q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68800n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f t10 = TalkCallService.this.k().t(this.f68802p, this.f68803q);
                this.f68800n = 1;
                if (AbstractC5323h.g(t10, this) == coroutine_suspended) {
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

    public final C1155a i() {
        C1155a c1155a = this.activeCallChecker;
        if (c1155a != null) {
            return c1155a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activeCallChecker");
        return null;
    }

    public final Lj.a j() {
        Lj.a aVar = this.pendingIntentFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pendingIntentFactory");
        return null;
    }

    public final Kj.b k() {
        Kj.b bVar = this.talkCallInteractor;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("talkCallInteractor");
        return null;
    }

    public final Lj.b l() {
        Lj.b bVar = this.talkCallNotification;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("talkCallNotification");
        return null;
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public void onCreate() {
        INSTANCE.c().b(this);
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.receiver, new IntentFilter("zendesk.talk.android.internal.call.action.FINISH"), 4);
        } else {
            registerReceiver(this.receiver, new IntentFilter("zendesk.talk.android.internal.call.action.FINISH"));
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.receiver);
        f68785i = null;
        super.onDestroy();
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (intent == null) {
            Tj.a.a("Call service started with null intent. Abort!");
            return 2;
        }
        if (this.callOngoing) {
            return 2;
        }
        this.callOngoing = true;
        i().b(true);
        Companion companion = INSTANCE;
        String d10 = companion.d(intent);
        p e10 = companion.e(intent);
        PendingIntent a10 = j().a(d10, e10);
        PendingIntent b10 = j().b("zendesk.talk.android.internal.call.action.FINISH");
        startForeground(100, l().a(a10, b10));
        AbstractC2194t.a(this).b(new c(a10, b10, null));
        AbstractC2194t.a(this).b(new d(d10, e10, null));
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        k().n();
        stopForeground(true);
        stopSelf();
        super.onTaskRemoved(rootIntent);
    }
}
