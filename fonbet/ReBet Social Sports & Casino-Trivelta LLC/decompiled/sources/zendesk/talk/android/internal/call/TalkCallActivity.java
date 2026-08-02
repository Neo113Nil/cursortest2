package zendesk.talk.android.internal.call;

import Dj.a;
import Dj.k;
import Dj.l;
import Dj.p;
import Fj.C1162h;
import Fj.H;
import Ph.P;
import X9.m;
import Xj.g;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.M;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.U;
import com.google.android.material.shape.i;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import l0.AbstractC5338c;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import zendesk.talk.android.internal.call.TalkCallActivity;
import zendesk.talk.android.internal.call.TalkCallViewModel;
import zendesk.talk.android.internal.call.a;
import zendesk.talk.android.internal.call.service.TalkCallService;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u0003R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lzendesk/talk/android/internal/call/TalkCallActivity;", "Lm/c;", "<init>", "()V", "Lzendesk/talk/android/internal/call/a;", "state", "", "T", "(Lzendesk/talk/android/internal/call/a;)V", "Lzendesk/talk/android/internal/call/a$a;", "ended", "U", "(Lzendesk/talk/android/internal/call/a$a;)V", "b0", "Landroid/view/View;", "anchor", "Z", "(Landroid/view/View;)V", "Y", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onBackPressed", "onDestroy", "Lzendesk/talk/android/internal/call/TalkCallView;", "f", "Lzendesk/talk/android/internal/call/TalkCallView;", "callView", "LFj/H;", "g", "LFj/H;", "S", "()LFj/H;", "setViewModelFactory$talk_android_release", "(LFj/H;)V", "viewModelFactory", "LFj/h;", C4527h.f48087o, "LFj/h;", "Q", "()LFj/h;", "setTimeFormatter$talk_android_release", "(LFj/h;)V", "timeFormatter", "Lzendesk/talk/android/internal/call/TalkCallViewModel;", i.f35755A, "Lkotlin/Lazy;", "R", "()Lzendesk/talk/android/internal/call/TalkCallViewModel;", "viewModel", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "finishHandler", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "finishRunnable", "LGj/p;", "l", "P", "()LGj/p;", "adapter", m.f13664a, "a", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TalkCallActivity extends AbstractActivityC5481c {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TalkCallView callView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public H viewModelFactory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public C1162h timeFormatter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: Fj.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TalkCallViewModel d02;
            d02 = TalkCallActivity.d0(TalkCallActivity.this);
            return d02;
        }
    });

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Handler finishHandler = new Handler();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Runnable finishRunnable = new Runnable() { // from class: Fj.j
        @Override // java.lang.Runnable
        public final void run() {
            TalkCallActivity.O(TalkCallActivity.this);
        }
    };

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Lazy adapter = LazyKt.lazy(new Function0() { // from class: Fj.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Gj.p M10;
            M10 = TalkCallActivity.M(TalkCallActivity.this);
            return M10;
        }
    });

    /* renamed from: zendesk.talk.android.internal.call.TalkCallActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(Intent intent) {
            String stringExtra = intent.getStringExtra("talk_sdk_android_digital_line");
            Intrinsics.checkNotNull(stringExtra);
            return stringExtra;
        }

        public final p d(Intent intent) {
            return (p) g.b(intent, "talk_sdk_android_recording_answer");
        }

        public final Intent e(Context context, String digitalLine, p pVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
            Intent putExtra = new Intent(context, (Class<?>) TalkCallActivity.class).putExtra("talk_sdk_android_digital_line", digitalLine).putExtra("talk_sdk_android_recording_answer", pVar);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        public Companion() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68716n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TalkCallActivity f68718a;

            public a(TalkCallActivity talkCallActivity) {
                this.f68718a = talkCallActivity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(zendesk.talk.android.internal.call.a aVar, Continuation continuation) {
                this.f68718a.T(aVar);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68716n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f f10 = TalkCallActivity.this.R().f();
                a aVar = new a(TalkCallActivity.this);
                this.f68716n = 1;
                if (f10.collect(aVar, this) == coroutine_suspended) {
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

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68719n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TalkCallActivity f68721a;

            public a(TalkCallActivity talkCallActivity) {
                this.f68721a = talkCallActivity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                Object obj;
                this.f68721a.P().g(list);
                List list2 = list;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Dj.a) obj).b()) {
                        break;
                    }
                }
                Dj.a aVar = (Dj.a) obj;
                boolean z10 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((Dj.a) it2.next()) instanceof a.C0059a) {
                            z10 = true;
                            break;
                        }
                    }
                }
                TalkCallView talkCallView = this.f68721a.callView;
                if (talkCallView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callView");
                    talkCallView = null;
                }
                talkCallView.M(aVar != null ? aVar.a() : null, z10);
                return Unit.INSTANCE;
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68719n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f e10 = TalkCallActivity.this.R().e();
                a aVar = new a(TalkCallActivity.this);
                this.f68719n = 1;
                if (e10.collect(aVar, this) == coroutine_suspended) {
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

    public static final Gj.p M(TalkCallActivity talkCallActivity) {
        return new Gj.p(talkCallActivity, new ArrayList());
    }

    public static final void O(TalkCallActivity talkCallActivity) {
        talkCallActivity.finish();
    }

    public static final void V(TalkCallActivity talkCallActivity, View view) {
        talkCallActivity.R().d();
    }

    public static final void W(TalkCallActivity talkCallActivity, View view) {
        talkCallActivity.R().o();
    }

    public static final void X(TalkCallActivity talkCallActivity, View view) {
        if (!talkCallActivity.R().j()) {
            talkCallActivity.R().n();
        } else {
            Intrinsics.checkNotNull(view);
            talkCallActivity.Z(view);
        }
    }

    public static final void a0(TalkCallActivity talkCallActivity, M m10, AdapterView adapterView, View view, int i10, long j10) {
        if (i10 < talkCallActivity.P().getCount()) {
            Object item = talkCallActivity.P().getItem(i10);
            Intrinsics.checkNotNull(item);
            talkCallActivity.R().b(((Dj.a) item).a());
        }
        m10.dismiss();
    }

    public static final void c0(TalkCallActivity talkCallActivity, DialogInterface dialogInterface, int i10) {
        talkCallActivity.finish();
    }

    public static final TalkCallViewModel d0(TalkCallActivity talkCallActivity) {
        return (TalkCallViewModel) new U(talkCallActivity, talkCallActivity.S()).a(TalkCallViewModel.class);
    }

    public final Gj.p P() {
        return (Gj.p) this.adapter.getValue();
    }

    public final C1162h Q() {
        C1162h c1162h = this.timeFormatter;
        if (c1162h != null) {
            return c1162h;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timeFormatter");
        return null;
    }

    public final TalkCallViewModel R() {
        return (TalkCallViewModel) this.viewModel.getValue();
    }

    public final H S() {
        H h10 = this.viewModelFactory;
        if (h10 != null) {
            return h10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void T(a state) {
        TalkCallView talkCallView = this.callView;
        TalkCallView talkCallView2 = null;
        if (talkCallView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView = null;
        }
        talkCallView.setMuted(state.b());
        boolean z10 = state instanceof a.AbstractC0988a;
        if (!z10 && state.a() != null) {
            TalkCallView talkCallView3 = this.callView;
            if (talkCallView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callView");
                talkCallView3 = null;
            }
            talkCallView3.I();
        }
        TalkCallView talkCallView4 = this.callView;
        if (talkCallView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView4 = null;
        }
        talkCallView4.setTitle(zendesk.talk.android.internal.call.c.c(state));
        TalkCallView talkCallView5 = this.callView;
        if (talkCallView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView5 = null;
        }
        talkCallView5.setLoading(state instanceof a.d);
        if (state instanceof a.c) {
            TalkCallView talkCallView6 = this.callView;
            if (talkCallView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callView");
            } else {
                talkCallView2 = talkCallView6;
            }
            talkCallView2.setCallTimerText(Q().a(((a.c) state).c()));
        }
        if (z10) {
            U((a.AbstractC0988a) state);
        }
    }

    public final void U(a.AbstractC0988a ended) {
        TalkCallView talkCallView = this.callView;
        TalkCallView talkCallView2 = null;
        if (talkCallView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView = null;
        }
        talkCallView.setLoading(false);
        TalkCallView talkCallView3 = this.callView;
        if (talkCallView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
        } else {
            talkCallView2 = talkCallView3;
        }
        talkCallView2.K();
        if (ended instanceof a.AbstractC0988a.C0989a) {
            b0();
        } else {
            if (isFinishing()) {
                return;
            }
            this.finishHandler.postDelayed(this.finishRunnable, 2000L);
        }
    }

    public final void Y() {
        boolean z10 = AbstractC5338c.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0;
        if (Build.VERSION.SDK_INT < 33 || z10) {
            return;
        }
        requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 9832);
    }

    public final void Z(View anchor) {
        final M m10 = new M(this);
        m10.l(P());
        m10.G(-2);
        m10.B(anchor);
        m10.Q(getResources().getDimensionPixelOffset(Dj.i.f2837c));
        m10.K(new AdapterView.OnItemClickListener() { // from class: Fj.p
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                TalkCallActivity.a0(TalkCallActivity.this, m10, adapterView, view, i10, j10);
            }
        });
        m10.show();
    }

    public final void b0() {
        new a.C0340a(this).o(Dj.m.f2880e).f(Dj.m.f2878c).setPositiveButton(Dj.m.f2879d, new DialogInterface.OnClickListener() { // from class: Fj.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                TalkCallActivity.c0(TalkCallActivity.this, dialogInterface, i10);
            }
        }).b(false).p();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        TalkCallService.INSTANCE.c().a(this);
        super.onCreate(savedInstanceState);
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.k();
        }
        setContentView(l.f2867a);
        TalkCallView talkCallView = (TalkCallView) findViewById(k.f2857i);
        this.callView = talkCallView;
        if (talkCallView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView = null;
        }
        talkCallView.setOnEndCallListener(new View.OnClickListener() { // from class: Fj.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TalkCallActivity.V(TalkCallActivity.this, view);
            }
        });
        TalkCallView talkCallView2 = this.callView;
        if (talkCallView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView2 = null;
        }
        talkCallView2.setOnMuteCallListener(new View.OnClickListener() { // from class: Fj.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TalkCallActivity.W(TalkCallActivity.this, view);
            }
        });
        TalkCallView talkCallView3 = this.callView;
        if (talkCallView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callView");
            talkCallView3 = null;
        }
        talkCallView3.setOnChangeAudioListener(new View.OnClickListener() { // from class: Fj.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TalkCallActivity.X(TalkCallActivity.this, view);
            }
        });
        Y();
        AbstractC2194t.a(this).e(new b(null));
        AbstractC2194t.a(this).c(new c(null));
        TalkCallViewModel R10 = R();
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String c10 = companion.c(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        if (R10.h(c10, companion.d(intent2), savedInstanceState != null)) {
            return;
        }
        finish();
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        this.finishHandler.removeCallbacks(this.finishRunnable);
        super.onDestroy();
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onStart() {
        super.onStart();
        R().l();
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onStop() {
        super.onStop();
        R().m();
    }
}
