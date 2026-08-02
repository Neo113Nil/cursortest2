package zendesk.talk.android.internal.call.setup;

import Dj.m;
import Dj.p;
import Ej.s;
import Mj.o;
import Ph.AbstractC1459k;
import Ph.P;
import Xj.g;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.U;
import com.google.android.material.shape.i;
import i3.C4527h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import m.AbstractActivityC5481c;
import zendesk.talk.android.internal.call.TalkCallActivity;
import zendesk.talk.android.internal.call.setup.TalkCallSetupActivity;
import zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel;
import zendesk.talk.android.internal.call.setup.c;
import zendesk.talk.android.internal.call.setup.f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003R\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lzendesk/talk/android/internal/call/setup/TalkCallSetupActivity;", "Lm/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lzendesk/talk/android/internal/call/setup/c;", "state", "M", "(Lzendesk/talk/android/internal/call/setup/c;)V", "Lzendesk/talk/android/internal/call/setup/f;", "effect", "J", "(Lzendesk/talk/android/internal/call/setup/f;)V", "LDj/p;", "recordingConsentAnswer", "P", "(LDj/p;)V", "O", "LMj/o;", "f", "LMj/o;", "I", "()LMj/o;", "setViewModelFactory$talk_android_release", "(LMj/o;)V", "viewModelFactory", "LQj/a;", "g", "LQj/a;", "G", "()LQj/a;", "setPermissionHelper$talk_android_release", "(LQj/a;)V", "permissionHelper", "Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", C4527h.f48087o, "Lkotlin/Lazy;", "H", "()Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", "viewModel", i.f35755A, "a", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TalkCallSetupActivity extends AbstractActivityC5481c {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public o viewModelFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Qj.a permissionHelper;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: Mj.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TalkCallSetupViewModel Q10;
            Q10 = TalkCallSetupActivity.Q(TalkCallSetupActivity.this);
            return Q10;
        }
    });

    /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(Intent intent) {
            String stringExtra = intent.getStringExtra("talk_sdk_android_call_setup_digital_line");
            Intrinsics.checkNotNull(stringExtra);
            return stringExtra;
        }

        public final Intent d(Intent intent) {
            return (Intent) g.a(intent, "talk_sdk_android_call_setup_success_intent");
        }

        public final Intent e(Context context, String digitalLine, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
            Intent putExtra = new Intent(context, (Class<?>) TalkCallSetupActivity.class).putExtra("talk_sdk_android_call_setup_digital_line", digitalLine).putExtra("talk_sdk_android_call_setup_success_intent", intent);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Qj.c.values().length];
            try {
                iArr[Qj.c.f9899a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Qj.c.f9900b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Qj.c.f9901c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68808n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f68810n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ TalkCallSetupActivity f68811o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TalkCallSetupActivity talkCallSetupActivity, Continuation continuation) {
                super(2, continuation);
                this.f68811o = talkCallSetupActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f68811o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f68810n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TalkCallSetupViewModel H10 = this.f68811o.H();
                    Companion companion = TalkCallSetupActivity.INSTANCE;
                    Intent intent = this.f68811o.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    String c10 = companion.c(intent);
                    this.f68810n = 1;
                    if (H10.q(c10, this) == coroutine_suspended) {
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

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallSetupActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68808n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TalkCallSetupActivity talkCallSetupActivity = TalkCallSetupActivity.this;
                AbstractC2185j.b bVar = AbstractC2185j.b.f20392c;
                a aVar = new a(talkCallSetupActivity, null);
                this.f68808n = 1;
                if (RepeatOnLifecycleKt.b(talkCallSetupActivity, bVar, aVar, this) == coroutine_suspended) {
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
        public int f68812n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f68814n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ TalkCallSetupActivity f68815o;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupActivity$d$a$a, reason: collision with other inner class name */
            public static final class C0993a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ TalkCallSetupActivity f68816a;

                public C0993a(TalkCallSetupActivity talkCallSetupActivity) {
                    this.f68816a = talkCallSetupActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(zendesk.talk.android.internal.call.setup.c cVar, Continuation continuation) {
                    this.f68816a.M(cVar);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TalkCallSetupActivity talkCallSetupActivity, Continuation continuation) {
                super(2, continuation);
                this.f68815o = talkCallSetupActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f68815o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f68814n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f state = this.f68815o.H().getState();
                    C0993a c0993a = new C0993a(this.f68815o);
                    this.f68814n = 1;
                    if (state.collect(c0993a, this) == coroutine_suspended) {
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

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallSetupActivity.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68812n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TalkCallSetupActivity talkCallSetupActivity = TalkCallSetupActivity.this;
                AbstractC2185j.b bVar = AbstractC2185j.b.f20392c;
                a aVar = new a(talkCallSetupActivity, null);
                this.f68812n = 1;
                if (RepeatOnLifecycleKt.b(talkCallSetupActivity, bVar, aVar, this) == coroutine_suspended) {
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

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68817n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f68819n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ TalkCallSetupActivity f68820o;

            /* renamed from: zendesk.talk.android.internal.call.setup.TalkCallSetupActivity$e$a$a, reason: collision with other inner class name */
            public static final class C0994a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ TalkCallSetupActivity f68821a;

                public C0994a(TalkCallSetupActivity talkCallSetupActivity) {
                    this.f68821a = talkCallSetupActivity;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(f fVar, Continuation continuation) {
                    this.f68821a.J(fVar);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TalkCallSetupActivity talkCallSetupActivity, Continuation continuation) {
                super(2, continuation);
                this.f68820o = talkCallSetupActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f68820o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f68819n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f effects = this.f68820o.H().getEffects();
                    C0994a c0994a = new C0994a(this.f68820o);
                    this.f68819n = 1;
                    if (effects.collect(c0994a, this) == coroutine_suspended) {
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

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TalkCallSetupActivity.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68817n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TalkCallSetupActivity talkCallSetupActivity = TalkCallSetupActivity.this;
                AbstractC2185j.b bVar = AbstractC2185j.b.f20392c;
                a aVar = new a(talkCallSetupActivity, null);
                this.f68817n = 1;
                if (RepeatOnLifecycleKt.b(talkCallSetupActivity, bVar, aVar, this) == coroutine_suspended) {
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

    public static final void K(TalkCallSetupActivity talkCallSetupActivity, DialogInterface dialogInterface, int i10) {
        talkCallSetupActivity.O();
    }

    public static final void L(TalkCallSetupActivity talkCallSetupActivity, DialogInterface dialogInterface, int i10) {
        talkCallSetupActivity.H().j();
    }

    public static final TalkCallSetupViewModel Q(TalkCallSetupActivity talkCallSetupActivity) {
        return (TalkCallSetupViewModel) new U(talkCallSetupActivity, talkCallSetupActivity.I()).a(TalkCallSetupViewModel.class);
    }

    public final Qj.a G() {
        Qj.a aVar = this.permissionHelper;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permissionHelper");
        return null;
    }

    public final TalkCallSetupViewModel H() {
        return (TalkCallSetupViewModel) this.viewModel.getValue();
    }

    public final o I() {
        o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void J(f effect) {
        if (Intrinsics.areEqual(effect, f.b.f68917a)) {
            G().c(this);
        } else {
            if (!Intrinsics.areEqual(effect, f.a.f68916a)) {
                throw new NoWhenBranchMatchedException();
            }
            new a.C0340a(this).o(m.f2887l).f(m.f2889n).setPositiveButton(m.f2886k, new DialogInterface.OnClickListener() { // from class: Mj.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    TalkCallSetupActivity.K(TalkCallSetupActivity.this, dialogInterface, i10);
                }
            }).setNegativeButton(m.f2888m, new DialogInterface.OnClickListener() { // from class: Mj.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    TalkCallSetupActivity.L(TalkCallSetupActivity.this, dialogInterface, i10);
                }
            }).p();
        }
    }

    public final void M(zendesk.talk.android.internal.call.setup.c state) {
        if (Intrinsics.areEqual(state, c.a.f68902a)) {
            finish();
        } else if (state instanceof c.e) {
            P(((c.e) state).a());
            finish();
        }
    }

    public final void O() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    public final void P(p recordingConsentAnswer) {
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Intent d10 = companion.d(intent);
        if (d10 != null) {
            d10.putExtra("recording_answer_key", recordingConsentAnswer);
        } else {
            d10 = null;
        }
        if (d10 == null) {
            TalkCallActivity.Companion companion2 = TalkCallActivity.INSTANCE;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            d10 = companion2.e(this, companion.c(intent2), recordingConsentAnswer);
        }
        startActivity(d10);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        s.f3210e.b().b().create().e(this);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            a.INSTANCE.a().show(getSupportFragmentManager(), "talk_sdk_android_call_setup_bottom_sheet");
        }
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new c(null), 3, null);
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new d(null), 3, null);
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new e(null), 3, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Qj.c b10 = G().b(this, requestCode, grantResults);
        int i10 = b10 == null ? -1 : b.$EnumSwitchMapping$0[b10.ordinal()];
        if (i10 == -1) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        if (i10 == 1) {
            H().l();
        } else if (i10 == 2) {
            H().j();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            H().k();
        }
    }
}
