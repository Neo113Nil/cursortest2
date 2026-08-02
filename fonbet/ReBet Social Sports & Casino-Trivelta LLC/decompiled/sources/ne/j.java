package ne;

import Ph.AbstractC1440a0;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.L;
import Ph.M0;
import Ph.P;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.SalesIQListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.customviews.SalesIQFloatingActionButton;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import ie.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import l0.AbstractC5338c;
import lb.C5444x;
import n.AbstractC5596a;
import ne.j;
import od.AbstractC5886l;
import od.EnumC5876b;
import og.AbstractC5892d;
import rd.C6218a;
import td.C6461a;
import ud.p;
import ue.C6549a;
import xe.C6822a;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f57314c;

    /* renamed from: f, reason: collision with root package name */
    public static nd.c f57317f;

    /* renamed from: g, reason: collision with root package name */
    public static nd.c f57318g;

    /* renamed from: i, reason: collision with root package name */
    public static WindowManager f57320i;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f57322k;

    /* renamed from: l, reason: collision with root package name */
    public static GestureDetector f57323l;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f57328q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f57329r;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f57331t;

    /* renamed from: u, reason: collision with root package name */
    public static Boolean f57332u;

    /* renamed from: a, reason: collision with root package name */
    public static final j f57312a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f57313b = LazyKt.lazy(f.f57394d);

    /* renamed from: d, reason: collision with root package name */
    public static final int f57315d = C6218a.b(8.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final int f57316e = og.k.b(16);

    /* renamed from: h, reason: collision with root package name */
    public static long f57319h = 250;

    /* renamed from: j, reason: collision with root package name */
    public static ConcurrentHashMap f57321j = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static int f57324m = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: n, reason: collision with root package name */
    public static int f57325n = Resources.getSystem().getDisplayMetrics().heightPixels;

    /* renamed from: o, reason: collision with root package name */
    public static int f57326o = C6218a.s();

    /* renamed from: p, reason: collision with root package name */
    public static int f57327p = f57325n + C6218a.U();

    /* renamed from: s, reason: collision with root package name */
    public static boolean f57330s = true;

    public static final class A extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57333n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SalesIQListener f57334o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f57335p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function0 f57336q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(SalesIQListener salesIQListener, boolean z10, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f57334o = salesIQListener;
            this.f57335p = z10;
            this.f57336q = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new A(this.f57334o, this.f57335p, this.f57336q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((A) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57333n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.f57334o.handleCustomLauncherVisibility(this.f57335p);
            Function0 function0 = this.f57336q;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ud.p f57365a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f57366b;

        /* renamed from: c, reason: collision with root package name */
        public View f57367c;

        /* renamed from: d, reason: collision with root package name */
        public View f57368d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f57369e;

        /* renamed from: f, reason: collision with root package name */
        public View f57370f;

        /* renamed from: g, reason: collision with root package name */
        public WindowManager.LayoutParams f57371g;

        /* renamed from: h, reason: collision with root package name */
        public WindowManager.LayoutParams f57372h;

        /* renamed from: i, reason: collision with root package name */
        public WindowManager.LayoutParams f57373i;

        /* renamed from: j, reason: collision with root package name */
        public WindowManager.LayoutParams f57374j;

        /* renamed from: k, reason: collision with root package name */
        public ud.d f57375k;

        /* renamed from: l, reason: collision with root package name */
        public Integer f57376l;

        /* renamed from: m, reason: collision with root package name */
        public ud.o f57377m;

        /* renamed from: n, reason: collision with root package name */
        public ViewOnTouchListenerC5700a f57378n;

        public final void A(Integer num) {
            this.f57376l = num;
        }

        public final void B(WindowManager.LayoutParams layoutParams) {
            this.f57371g = layoutParams;
        }

        public final ud.o a() {
            return this.f57377m;
        }

        public final ud.p b() {
            return this.f57365a;
        }

        public final View c() {
            return this.f57368d;
        }

        public final WindowManager.LayoutParams d() {
            return this.f57374j;
        }

        public final View e() {
            return this.f57370f;
        }

        public final TextView f() {
            return this.f57369e;
        }

        public final WindowManager.LayoutParams g() {
            return this.f57373i;
        }

        public final View h() {
            return this.f57367c;
        }

        public final WindowManager.LayoutParams i() {
            return this.f57372h;
        }

        public final ViewOnTouchListenerC5700a j() {
            return this.f57378n;
        }

        public final ViewGroup k() {
            return this.f57366b;
        }

        public final ud.d l() {
            return this.f57375k;
        }

        public final Integer m() {
            return this.f57376l;
        }

        public final WindowManager.LayoutParams n() {
            return this.f57371g;
        }

        public final void o(ud.o oVar) {
            this.f57377m = oVar;
        }

        public final void p(ud.p pVar) {
            this.f57365a = pVar;
        }

        public final void q(View view) {
            this.f57368d = view;
        }

        public final void r(WindowManager.LayoutParams layoutParams) {
            this.f57374j = layoutParams;
        }

        public final void s(View view) {
            this.f57370f = view;
        }

        public final void t(TextView textView) {
            this.f57369e = textView;
        }

        public final void u(WindowManager.LayoutParams layoutParams) {
            this.f57373i = layoutParams;
        }

        public final void v(View view) {
            this.f57367c = view;
        }

        public final void w(WindowManager.LayoutParams layoutParams) {
            this.f57372h = layoutParams;
        }

        public final void x(ViewOnTouchListenerC5700a viewOnTouchListenerC5700a) {
            this.f57378n = viewOnTouchListenerC5700a;
        }

        public final void y(ViewGroup viewGroup) {
            this.f57366b = viewGroup;
        }

        public final void z(ud.d dVar) {
            this.f57375k = dVar;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ZohoSalesIQ.h.a.values().length];
            try {
                iArr[ZohoSalesIQ.h.a.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZohoSalesIQ.h.a.NEVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZohoSalesIQ.h.a.WHEN_ACTIVE_CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57392n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f57393o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.f57393o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f57393o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57392n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = j.f57312a;
                jVar.u0(jVar.Q(), this.f57393o);
                Activity Q10 = jVar.Q();
                this.f57392n = 1;
                if (j.F0(Q10, false, true, this, 2, null) == coroutine_suspended) {
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

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f57394d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Be.a invoke() {
            return Be.a.f866b.a(j.f57312a.O());
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57395n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f57396o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f57396o = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f57396o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57395n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ge.h.c(Ye.d.o(De.a.EnableDragDismissing, this.f57396o), false, 1, null);
                if (!this.f57396o) {
                    j.E(j.f57312a, false, false, false, 4, null);
                    j.J(null, 1, null);
                    return Unit.INSTANCE;
                }
                Q.f44447F.J(false);
                j jVar = j.f57312a;
                b R10 = jVar.R();
                this.f57395n = 1;
                if (jVar.b0(R10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            j.r0(true);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return true;
        }
    }

    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f57397n;

        /* renamed from: o, reason: collision with root package name */
        public Object f57398o;

        /* renamed from: p, reason: collision with root package name */
        public Object f57399p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f57400q;

        /* renamed from: s, reason: collision with root package name */
        public int f57402s;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57400q = obj;
            this.f57402s |= Integer.MIN_VALUE;
            return j.this.b0(null, this);
        }
    }

    /* renamed from: ne.j$j, reason: collision with other inner class name */
    public static final class C0836j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f57403n;

        /* renamed from: o, reason: collision with root package name */
        public Object f57404o;

        /* renamed from: p, reason: collision with root package name */
        public int f57405p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f57406q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function2 f57407r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0836j(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f57407r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0836j c0836j = new C0836j(this.f57407r, continuation);
            c0836j.f57406q = obj;
            return c0836j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0836j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            if (r8.f(null, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P p10;
            Wh.a b10;
            Function2 function2;
            Wh.a aVar;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57405p;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    p10 = (P) this.f57406q;
                    b10 = C6461a.C0913a.f65814a.b();
                    function2 = this.f57407r;
                    this.f57406q = p10;
                    this.f57403n = b10;
                    this.f57404o = function2;
                    this.f57405p = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Wh.a) this.f57406q;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar.g(null);
                            throw th2;
                        }
                    }
                    function2 = (Function2) this.f57404o;
                    Wh.a aVar2 = (Wh.a) this.f57403n;
                    p10 = (P) this.f57406q;
                    ResultKt.throwOnFailure(obj);
                    b10 = aVar2;
                }
                this.f57406q = b10;
                this.f57403n = null;
                this.f57404o = null;
                this.f57405p = 2;
                if (function2.invoke(p10, this) != coroutine_suspended) {
                    aVar = b10;
                    Unit unit2 = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                aVar = b10;
                th2 = th4;
                aVar.g(null);
                throw th2;
            }
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57408n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f57409o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Activity f57410p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f57411q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f57412r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Activity activity, boolean z10, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f57410p = activity;
            this.f57411q = z10;
            this.f57412r = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = new k(this.f57410p, this.f57411q, this.f57412r, continuation);
            kVar.f57409o = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((k) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
        
            if (ne.j.E0(r11, r1, r9, r10) == r0) goto L47;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FloatingActionButton floatingActionButton;
            TextView textView;
            Activity i10;
            FloatingActionButton floatingActionButton2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57408n;
            try {
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Activity activity = this.f57410p;
                boolean z10 = this.f57411q;
                boolean z11 = this.f57412r;
                Result.Companion companion2 = Result.INSTANCE;
                j.S0();
                if (activity != null && !Intrinsics.areEqual(rd.b.i().getValue(), Boxing.boxBoolean(true))) {
                    LiveChatUtil.log("refreshChatBubble | activity name: " + activity.getClass().getCanonicalName());
                    ViewGroup h10 = rd.b.h(activity);
                    if (h10 != null) {
                        floatingActionButton = (FloatingActionButton) h10.findViewById(od.q.f60364Q4);
                        textView = (TextView) h10.findViewById(od.q.f60235D5);
                        if (textView != null) {
                            textView.setTypeface(C6218a.P());
                        }
                    } else {
                        floatingActionButton = null;
                        textView = null;
                    }
                    boolean c02 = j.c0(activity);
                    if (c02) {
                        if (!z10 && floatingActionButton != null && textView != null) {
                            LiveChatUtil.log("refreshChatBubble | updating launcher");
                            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(h10 != null ? h10.getContext() : null, ZohoSalesIQ.getStyleForCurrentThemeMode());
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(1);
                            gradientDrawable.setColor(com.zoho.livechat.android.utils.P.e(dVar, AbstractC5886l.f59913z2));
                            textView.setBackground(gradientDrawable);
                            j jVar = j.f57312a;
                            b R10 = jVar.R();
                            if (R10 != null) {
                                this.f57409o = floatingActionButton;
                                this.f57408n = 2;
                                if (jVar.A0(R10, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                floatingActionButton2 = floatingActionButton;
                                floatingActionButton = floatingActionButton2;
                            }
                        }
                        this.f57408n = 1;
                    } else {
                        j jVar2 = j.f57312a;
                        j.v0(jVar2, activity, null, 2, null);
                        if (z11 && (i10 = C6549a.f66349d.a().i()) != null) {
                            j.v0(jVar2, i10, null, 2, null);
                        }
                    }
                    Result.m147constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                Result.m147constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatingActionButton2 = (FloatingActionButton) this.f57409o;
            ResultKt.throwOnFailure(obj);
            floatingActionButton = floatingActionButton2;
            floatingActionButton.invalidate();
            j.f57322k = true;
            Result.m147constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57413n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Activity f57414o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f57415p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Activity activity, String str, Continuation continuation) {
            super(2, continuation);
            this.f57414o = activity;
            this.f57415p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.f57414o, this.f57415p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((l) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57413n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j.f57312a.u0(this.f57414o, this.f57415p);
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57416n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Drawable f57417o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Drawable drawable, Continuation continuation) {
            super(2, continuation);
            this.f57417o = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.f57417o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((m) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57416n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            nd.c T10 = j.T();
            if (T10 != null) {
                nd.c.m(T10, this.f57417o, null, null, null, 14, null);
            }
            j.s0(false, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57418n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b f57419o;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57420n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ SalesIQChat f57421o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ b f57422p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SalesIQChat salesIQChat, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f57421o = salesIQChat;
                this.f57422p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f57421o, this.f57422p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i10;
                Channel.Chat chat;
                ConstraintLayout b10;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f57420n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SalesIQChat salesIQChat = this.f57421o;
                if (salesIQChat != null && salesIQChat.getAttenderid() != null) {
                    ud.p b11 = this.f57422p.b();
                    String str = null;
                    if (((b11 == null || (b10 = b11.b()) == null) ? null : b10.getContext()) != null) {
                        ud.p b12 = this.f57422p.b();
                        MobilistenToggleFAB mobilistenToggleFAB = b12 != null ? b12.f66346b : null;
                        if (mobilistenToggleFAB != null) {
                            Channel m10 = C6822a.m();
                            if (((m10 == null || (chat = m10.getChat()) == null) ? false : Intrinsics.areEqual(chat.getShowOperatorImage(), Boxing.boxBoolean(true))) || this.f57421o.isBotAttender()) {
                                str = sd.d.b(this.f57421o.getAttenderImgkey() != null ? this.f57421o.getAttenderImgkey() : this.f57421o.getAttenderid(), this.f57421o.isBotAttender());
                            }
                            String attenderImgkey = this.f57421o.getAttenderImgkey();
                            Intrinsics.checkNotNullExpressionValue(attenderImgkey, "getAttenderImgkey(...)");
                            ud.p b13 = this.f57422p.b();
                            Intrinsics.checkNotNull(b13);
                            Context context = b13.b().getContext();
                            if (this.f57421o.isBotAttender()) {
                                i10 = od.p.f60148p3;
                            } else {
                                ud.p b14 = this.f57422p.b();
                                Intrinsics.checkNotNull(b14);
                                i10 = com.zoho.livechat.android.utils.P.l(b14.b().getContext()) ? od.p.f59983I : od.p.f59988J;
                            }
                            mobilistenToggleFAB.setImageModel(new MobilistenToggleFAB.d(str, attenderImgkey, AbstractC5596a.b(context, i10)));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57423n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f57424o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b bVar, Continuation continuation) {
                super(2, continuation);
                this.f57424o = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f57424o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f57423n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ud.p b10 = this.f57424o.b();
                MobilistenToggleFAB mobilistenToggleFAB = b10 != null ? b10.f66346b : null;
                if (mobilistenToggleFAB != null) {
                    mobilistenToggleFAB.setImageModel(null);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57425n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f57426o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, Continuation continuation) {
                super(2, continuation);
                this.f57426o = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f57426o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f57425n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ud.p b10 = this.f57426o.b();
                MobilistenToggleFAB mobilistenToggleFAB = b10 != null ? b10.f66346b : null;
                if (mobilistenToggleFAB != null) {
                    mobilistenToggleFAB.setImageModel(null);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class d extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57427n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f57428o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ int f57429p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b bVar, int i10, Continuation continuation) {
                super(2, continuation);
                this.f57428o = bVar;
                this.f57429p = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.f57428o, this.f57429p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MobilistenToggleFAB mobilistenToggleFAB;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f57427n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ud.p b10 = this.f57428o.b();
                if (b10 == null || (mobilistenToggleFAB = b10.f66346b) == null) {
                    return null;
                }
                mobilistenToggleFAB.setBadgeCount(this.f57429p);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f57419o = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f57419o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r3 != null ? r3.getVisitorid() : null, Td.e.K()) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        
            if (Ph.AbstractC1455i.g(r1, r3, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        
            if (Td.e.m0() != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        
            if (Ph.AbstractC1455i.g(r9, r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        
            if (Ph.AbstractC1455i.g(r9, r1, r8) == r0) goto L46;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57418n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<String> connectedChatIds = LiveChatUtil.getConnectedChatIds(SalesIQChat.c.Chat);
                ArrayList<String> connectedChatIds2 = LiveChatUtil.getConnectedChatIds(SalesIQChat.c.Call);
                if (LiveChatUtil.canShowOperatorImageInLauncher()) {
                    if (connectedChatIds2.size() + connectedChatIds.size() == 1) {
                        if (connectedChatIds.size() == 1) {
                            if (Td.e.m0()) {
                                Intrinsics.checkNotNull(connectedChatIds);
                                SalesIQChat chat = LiveChatUtil.getChat((String) CollectionsKt.firstOrNull((List) connectedChatIds));
                            }
                            if (connectedChatIds.size() != 1) {
                                connectedChatIds = connectedChatIds2;
                            }
                            Intrinsics.checkNotNull(connectedChatIds);
                            SalesIQChat chat2 = LiveChatUtil.getChat((String) CollectionsKt.firstOrNull((List) connectedChatIds));
                            M0 c10 = C1452g0.c();
                            a aVar = new a(chat2, this.f57419o, null);
                            this.f57418n = 1;
                        }
                        if (connectedChatIds2.size() == 1) {
                        }
                    }
                    M0 c11 = C1452g0.c();
                    b bVar = new b(this.f57419o, null);
                    this.f57418n = 2;
                } else {
                    M0 c12 = C1452g0.c();
                    c cVar = new c(this.f57419o, null);
                    this.f57418n = 3;
                }
            } else {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
            }
            int d10 = Kf.a.d();
            M0 c13 = C1452g0.c();
            d dVar = new d(this.f57419o, d10, null);
            this.f57418n = 4;
            Object g10 = AbstractC1455i.g(c13, dVar, this);
            return g10 == coroutine_suspended ? coroutine_suspended : g10;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57430n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Activity f57431o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f57432p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Activity activity, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f57431o = activity;
            this.f57432p = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f57431o, this.f57432p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57430n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Activity activity = this.f57431o;
                boolean z10 = this.f57432p;
                this.f57430n = 1;
                if (j.F0(activity, z10, false, this, 4, null) == coroutine_suspended) {
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

    public static final class p extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public boolean f57433A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f57434B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f57435C;

        /* renamed from: D, reason: collision with root package name */
        public boolean f57436D;

        /* renamed from: E, reason: collision with root package name */
        public boolean f57437E;

        /* renamed from: F, reason: collision with root package name */
        public float f57438F;

        /* renamed from: G, reason: collision with root package name */
        public int f57439G;

        /* renamed from: H, reason: collision with root package name */
        public int f57440H;

        /* renamed from: I, reason: collision with root package name */
        public int f57441I;

        /* renamed from: J, reason: collision with root package name */
        public int f57442J;

        /* renamed from: K, reason: collision with root package name */
        public /* synthetic */ Object f57443K;

        /* renamed from: L, reason: collision with root package name */
        public int f57444L;

        /* renamed from: n, reason: collision with root package name */
        public Object f57445n;

        /* renamed from: o, reason: collision with root package name */
        public Object f57446o;

        /* renamed from: p, reason: collision with root package name */
        public Object f57447p;

        /* renamed from: q, reason: collision with root package name */
        public Object f57448q;

        /* renamed from: r, reason: collision with root package name */
        public Object f57449r;

        /* renamed from: s, reason: collision with root package name */
        public Object f57450s;

        /* renamed from: t, reason: collision with root package name */
        public Object f57451t;

        /* renamed from: u, reason: collision with root package name */
        public Object f57452u;

        /* renamed from: v, reason: collision with root package name */
        public Object f57453v;

        /* renamed from: w, reason: collision with root package name */
        public Object f57454w;

        /* renamed from: x, reason: collision with root package name */
        public Object f57455x;

        /* renamed from: y, reason: collision with root package name */
        public Object f57456y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f57457z;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57443K = obj;
            this.f57444L |= Integer.MIN_VALUE;
            return j.E0(null, false, false, this);
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57458n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f57459o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List f57460p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List list, Continuation continuation) {
            super(2, continuation);
            this.f57460p = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            q qVar = new q(this.f57460p, continuation);
            qVar.f57459o = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            List list;
            WindowManager windowManager;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57458n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list2 = this.f57460p;
                    Result.Companion companion = Result.INSTANCE;
                    this.f57459o = list2;
                    this.f57458n = 1;
                    if (AbstractC1440a0.a(10L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f57459o;
                    ResultKt.throwOnFailure(obj);
                }
                for (Object obj2 : list) {
                    if (obj2 instanceof ud.p) {
                        WindowManager windowManager2 = j.f57320i;
                        if (windowManager2 != null) {
                            windowManager2.removeViewImmediate(((ud.p) obj2).b());
                        }
                    } else if ((obj2 instanceof ud.o) && (windowManager = j.f57320i) != null) {
                        windowManager.removeViewImmediate(((ud.o) obj2).b());
                    }
                    LiveChatUtil.log("LauncherLogs " + obj2.hashCode() + " removed");
                }
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m150exceptionOrNullimpl(m147constructorimpl) != null) {
                ne.l.f(new b.g());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class r extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57461n;

        public r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((r) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57461n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String K10 = Td.e.K();
            SalesIQChat chat = LiveChatUtil.getChat(K10 != null ? LiveChatUtil.getChatidfromVisitorID(K10) : null);
            boolean z10 = false;
            if (chat != null && chat.getType() == SalesIQChat.c.Call) {
                z10 = true;
            }
            return Boxing.boxBoolean(z10);
        }
    }

    public static final class s extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57462n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Lazy f57463o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f57463o = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new s(this.f57463o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((s) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57462n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(j.H0(this.f57463o).size() > 0);
        }
    }

    public static final class t extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ud.p f57464d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ud.p pVar) {
            super(0);
            this.f57464d = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1616invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1616invoke() {
            og.p.n(this.f57464d.b());
        }
    }

    public static final class u extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f57465d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ud.p f57466e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(b bVar, ud.p pVar) {
            super(1);
            this.f57465d = bVar;
            this.f57466e = pVar;
        }

        public final void a(Boolean bool) {
            ConstraintLayout b10;
            ConstraintLayout b11;
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                ud.o a10 = this.f57465d.a();
                og.p.n(a10 != null ? a10.b() : null);
                og.p.n(this.f57466e.b());
                ud.d l10 = this.f57465d.l();
                if (l10 == null || (b11 = l10.b()) == null) {
                    return;
                }
                og.p.w(b11);
                return;
            }
            ud.o a11 = this.f57465d.a();
            og.p.w(a11 != null ? a11.b() : null);
            og.p.w(this.f57466e.b());
            ud.d l11 = this.f57465d.l();
            if (l11 == null || (b10 = l11.b()) == null) {
                return;
            }
            og.p.n(b10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class v extends Lambda implements Function0 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ud.p f57468e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ud.p pVar) {
            super(0);
            this.f57468e = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1617invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1617invoke() {
            if (j.this.e0()) {
                og.p.n(this.f57468e.b());
            }
        }
    }

    public static final class w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57469n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ud.p f57470o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ j f57471p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b f57472q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ MobilistenToggleFAB f57473r;

        public static final class a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f57474d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ud.p f57475e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MobilistenToggleFAB f57476f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ j f57477g;

            /* renamed from: ne.j$w$a$a, reason: collision with other inner class name */
            public static final class C0837a extends Lambda implements Function0 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f57478d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j f57479e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ud.p f57480f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0837a(boolean z10, j jVar, ud.p pVar) {
                    super(0);
                    this.f57478d = z10;
                    this.f57479e = jVar;
                    this.f57480f = pVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1618invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1618invoke() {
                    if (this.f57478d) {
                        if (this.f57479e.e0()) {
                            og.p.w(this.f57480f.b());
                        }
                    } else if (this.f57479e.e0()) {
                        og.p.n(this.f57480f.b());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, ud.p pVar, MobilistenToggleFAB mobilistenToggleFAB, j jVar) {
                super(1);
                this.f57474d = bVar;
                this.f57475e = pVar;
                this.f57476f = mobilistenToggleFAB;
                this.f57477g = jVar;
            }

            public final void a(boolean z10) {
                ConstraintLayout b10;
                ConstraintLayout b11;
                if (z10) {
                    ud.o a10 = this.f57474d.a();
                    og.p.n(a10 != null ? a10.b() : null);
                    og.p.n(this.f57475e.b());
                    ud.d l10 = this.f57474d.l();
                    if (l10 != null && (b11 = l10.b()) != null) {
                        og.p.w(b11);
                    }
                } else {
                    ud.o a11 = this.f57474d.a();
                    og.p.w(a11 != null ? a11.b() : null);
                    og.p.w(this.f57475e.b());
                    ud.d l11 = this.f57474d.l();
                    if (l11 != null && (b10 = l11.b()) != null) {
                        og.p.n(b10);
                    }
                }
                MobilistenToggleFAB this_apply = this.f57476f;
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                MobilistenToggleFAB.H0(this_apply, false, new C0837a(z10, this.f57477g, this.f57475e), 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ud.p pVar, j jVar, b bVar, MobilistenToggleFAB mobilistenToggleFAB, Continuation continuation) {
            super(2, continuation);
            this.f57470o = pVar;
            this.f57471p = jVar;
            this.f57472q = bVar;
            this.f57473r = mobilistenToggleFAB;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w(this.f57470o, this.f57471p, this.f57472q, this.f57473r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f57469n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Td.e eVar = Td.e.f11456a;
                SalesIQFloatingActionButton baseFab = this.f57470o.f66346b.getBaseFab();
                Activity Q10 = this.f57471p.Q();
                a aVar = new a(this.f57472q, this.f57470o, this.f57473r, this.f57471p);
                this.f57469n = 1;
                if (Td.e.q0(eVar, baseFab, Q10, null, aVar, this, 4, null) == coroutine_suspended) {
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

    public static final class x extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57481n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f57483p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f57484q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i10, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f57483p = i10;
            this.f57484q = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new x(this.f57483p, this.f57484q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((x) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharedPreferences.Editor edit;
            SharedPreferences.Editor putBoolean;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57481n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (j.this.m0(this.f57483p) && this.f57484q) {
                SharedPreferences M10 = C6218a.M();
                if (M10 != null && (edit = M10.edit()) != null && (putBoolean = edit.putBoolean("is_launcher_in_bottom_side", false)) != null) {
                    Boxing.boxBoolean(putBoolean.commit());
                }
                j.r0(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class y extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final y f57485d = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return LiveChatUtil.getConnectedChatIds(SalesIQChat.c.Chat);
        }
    }

    public static final class z extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final z f57486d = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return LiveChatUtil.getAllOpenChatIds(SalesIQChat.c.Chat);
        }
    }

    public static final void B0(ZohoSalesIQ.h.a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        f57314c = true;
        Ge.h.c(Ye.d.r(De.a.CustomLauncherVisibilityMode, mode.name()), false, 1, null);
        s0(false, 1, null);
    }

    public static final void C0(Activity activity, boolean z10) {
        f57312a.n0(new o(activity, z10, null));
    }

    public static /* synthetic */ void D0(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        C0(activity, z10);
    }

    public static /* synthetic */ void E(j jVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        jVar.D(z10, z11, z12);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:303|191|(39:195|196|(1:275)(1:201)|202|(29:274|(8:(1:221)|222|223|224|225|(1:229)|230|(12:249|(1:251)|252|104|(4:106|(2:110|(3:112|(1:114)(1:116)|115)(2:117|118))|(1:120)(1:122)|121)|123|(1:125)(1:187)|126|(1:186)|128|129|(10:131|(1:133)(1:139)|134|(1:136)(1:138)|137|50|51|(1:53)|54|55)(8:140|(1:142)(1:185)|143|(1:145)(1:184)|146|(4:148|(6:151|(2:162|163)(2:153|(4:155|156|157|158)(1:159))|160|161|158|149)|164|165)|166|(4:168|(1:170)|171|(2:173|174)(7:175|85|(1:87)(1:99)|88|(1:98)(1:92)|93|(2:95|96)(17:97|68|(1:70)(1:81)|71|(3:73|74|(1:77)(8:76|16|(4:19|(2:21|(2:23|24)(1:26))(2:27|(2:31|32))|25|17)|35|36|37|(1:39)|40))|41|42|43|(7:48|49|50|51|(0)|54|55)|56|(1:61)(1:60)|49|50|51|(0)|54|55)))(16:176|(1:180)|181|(12:183|43|(8:45|48|49|50|51|(0)|54|55)|56|(1:58)|61|49|50|51|(0)|54|55)|42|43|(0)|56|(0)|61|49|50|51|(0)|54|55)))(5:(1:235)(1:248)|236|(1:238)(2:244|(1:246)(1:247))|239|(2:241|242)(11:243|103|104|(0)|123|(0)(0)|126|(0)|128|129|(0)(0))))|256|257|(1:259)|260|261|(1:263)|264|(1:266)(1:267)|222|223|224|225|(2:227|229)|230|(1:232)|249|(0)|252|104|(0)|123|(0)(0)|126|(0)|128|129|(0)(0))|208|(1:273)|210|211|(1:213)(1:272)|214|(20:(0)|222|223|224|225|(0)|230|(0)|249|(0)|252|104|(0)|123|(0)(0)|126|(0)|128|129|(0)(0))|256|257|(0)|260|261|(0)|264|(0)(0)|222|223|224|225|(0)|230|(0)|249|(0)|252|104|(0)|123|(0)(0)|126|(0)|128|129|(0)(0))|276|196|(0)|275|202|(1:204)|274|(0)|256|257|(0)|260|261|(0)|264|(0)(0)|222|223|224|225|(0)|230|(0)|249|(0)|252|104|(0)|123|(0)(0)|126|(0)|128|129|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|455|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x092c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x092d, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x08d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x08ef, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x055e, code lost:
    
        if (I0(r26).size() == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03fe, code lost:
    
        if (r0 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0d87, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x09f3 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0a58 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0a9b A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a51 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a46 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0c56 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:14:0x004b, B:16:0x0c4a, B:17:0x0c50, B:19:0x0c56, B:21:0x0c5e, B:23:0x0c62, B:25:0x0c83, B:27:0x0c6f, B:29:0x0c73, B:31:0x0c77, B:36:0x0c9f), top: B:13:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07fe A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08c2 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x093e A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0954 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x09e0 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x08ce A[Catch: all -> 0x08d7, TryCatch #4 {all -> 0x08d7, blocks: (B:257:0x08c6, B:259:0x08ce, B:260:0x08d9), top: B:256:0x08c6, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08ff A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0909 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0722 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x072c A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0790 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0733 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0727 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x065e A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0542 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x056d A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0549 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x03ed A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0cb8 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x043b A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x048e A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0d7f A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x03b5 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0d5b A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0d68 A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0c0b A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0c32 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0b9c A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:37:0x0cb2, B:39:0x0cb8, B:40:0x0cc0, B:43:0x0d41, B:45:0x0d5b, B:49:0x0d72, B:50:0x0d78, B:56:0x0d62, B:58:0x0d68, B:60:0x0d6c, B:64:0x0ca8, B:66:0x0065, B:68:0x0c03, B:70:0x0c0b, B:71:0x0c11, B:83:0x0082, B:85:0x0b94, B:87:0x0b9c, B:88:0x0ba2, B:90:0x0bb9, B:92:0x0bbf, B:93:0x0bc9, B:101:0x00ad, B:103:0x09cb, B:104:0x09ed, B:106:0x09f3, B:108:0x09f9, B:110:0x09fd, B:112:0x0a03, B:114:0x0a07, B:115:0x0a27, B:116:0x0a15, B:117:0x0a2d, B:118:0x0a34, B:120:0x0a37, B:121:0x0a3c, B:122:0x0a3a, B:123:0x0a3f, B:126:0x0a48, B:129:0x0a54, B:131:0x0a58, B:133:0x0a68, B:134:0x0a6e, B:136:0x0a7c, B:137:0x0a82, B:140:0x0a9b, B:142:0x0aab, B:143:0x0ab1, B:145:0x0abf, B:146:0x0ac5, B:148:0x0aee, B:149:0x0af4, B:151:0x0afa, B:163:0x0b02, B:153:0x0b18, B:156:0x0b1c, B:165:0x0b25, B:166:0x0b27, B:168:0x0b2d, B:170:0x0b31, B:171:0x0b3e, B:176:0x0cc8, B:178:0x0d11, B:180:0x0d17, B:181:0x0d30, B:183:0x0d36, B:186:0x0a51, B:187:0x0a46, B:189:0x00e9, B:191:0x07d9, B:196:0x07eb, B:199:0x07f1, B:202:0x07f8, B:204:0x07fe, B:208:0x0813, B:211:0x0827, B:213:0x0847, B:214:0x0875, B:217:0x08bb, B:221:0x08c2, B:222:0x0916, B:225:0x0937, B:227:0x093e, B:229:0x0944, B:230:0x0950, B:232:0x0954, B:236:0x0968, B:238:0x096e, B:239:0x098b, B:247:0x0982, B:248:0x095f, B:251:0x09e0, B:255:0x092d, B:261:0x08f9, B:263:0x08ff, B:264:0x0902, B:267:0x0909, B:271:0x08ef, B:278:0x015b, B:280:0x070c, B:282:0x0722, B:285:0x072c, B:287:0x0736, B:296:0x0754, B:298:0x0790, B:299:0x0793, B:308:0x0733, B:309:0x0727, B:311:0x01e5, B:313:0x05dc, B:317:0x0654, B:319:0x065e, B:321:0x0664, B:325:0x067c, B:330:0x066a, B:336:0x023f, B:338:0x0518, B:340:0x0536, B:342:0x053c, B:344:0x0542, B:348:0x0567, B:350:0x056d, B:356:0x0549, B:359:0x0550, B:361:0x0556, B:378:0x02bd, B:380:0x02cb, B:381:0x02d5, B:383:0x02df, B:384:0x02e9, B:386:0x02f7, B:387:0x0302, B:389:0x0363, B:390:0x03b8, B:392:0x03ed, B:397:0x04b9, B:399:0x04d0, B:400:0x04d7, B:405:0x04d3, B:406:0x03f4, B:410:0x0400, B:412:0x043b, B:413:0x0481, B:415:0x048e, B:418:0x0496, B:421:0x049e, B:424:0x04b1, B:428:0x0d7f, B:429:0x0d86, B:436:0x03af, B:438:0x03b5, B:441:0x03a5, B:257:0x08c6, B:259:0x08ce, B:260:0x08d9, B:224:0x091d), top: B:7:0x0030, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r0v107, types: [T, android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, androidx.appcompat.view.d] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E0(Activity activity, boolean z10, boolean z11, Continuation continuation) {
        p pVar;
        Throwable m150exceptionOrNullimpl;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        String str;
        boolean z12;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl2;
        final ud.p b10;
        ViewGroup.LayoutParams layoutParams;
        boolean z13;
        Object obj;
        final b bVar;
        boolean z14;
        j jVar;
        Ref.ObjectRef objectRef;
        Activity activity2;
        String str2;
        boolean z15;
        float f10;
        Ref.ObjectRef objectRef2;
        boolean z16;
        String str3;
        Lazy lazy;
        boolean z17;
        int i10;
        int i11;
        Object obj2;
        MobilistenToggleFAB mobilistenToggleFAB;
        b bVar2;
        int i12;
        j jVar2;
        Ref.ObjectRef objectRef3;
        boolean z18;
        Lazy lazy2;
        MobilistenToggleFAB mobilistenToggleFAB2;
        Ref.ObjectRef objectRef4;
        boolean z19;
        boolean z20;
        boolean z21;
        Activity activity3;
        MobilistenToggleFAB mobilistenToggleFAB3;
        Ref.ObjectRef objectRef5;
        ud.p pVar2;
        boolean z22;
        boolean z23;
        j jVar3;
        float f11;
        Ref.BooleanRef booleanRef3;
        boolean z24;
        Lazy lazy3;
        float f12;
        int i13;
        boolean z25;
        boolean z26;
        MobilistenToggleFAB mobilistenToggleFAB4;
        boolean z27;
        boolean z28;
        MobilistenToggleFAB mobilistenToggleFAB5;
        boolean z29;
        Ref.ObjectRef objectRef6;
        Ref.BooleanRef booleanRef4;
        ud.p pVar3;
        Activity activity4;
        Object obj3;
        boolean z30;
        int i14;
        int i15;
        Object g10;
        final j jVar4;
        Object obj4;
        boolean z31;
        boolean z32;
        final Ref.ObjectRef objectRef7;
        int i16;
        final ud.p pVar4;
        boolean z33;
        boolean z34;
        final Activity activity5;
        MobilistenToggleFAB mobilistenToggleFAB6;
        Ref.BooleanRef booleanRef5;
        final MobilistenToggleFAB mobilistenToggleFAB7;
        int i17;
        boolean z35;
        float f13;
        Object b02;
        Object obj5;
        boolean z36;
        Ref.ObjectRef objectRef8;
        boolean z37;
        float f14;
        Ref.BooleanRef booleanRef6;
        Ref.BooleanRef booleanRef7;
        boolean z38;
        Ref.ObjectRef objectRef9;
        j jVar5;
        boolean z39;
        boolean z40;
        int i18;
        int i19;
        boolean z41;
        boolean z42;
        Object obj6;
        ud.p pVar5;
        Throwable m150exceptionOrNullimpl3;
        TextView f15;
        String languageOrNull;
        int i20;
        Object m147constructorimpl2;
        nd.c cVar;
        Object obj7;
        ud.p pVar6;
        int i21;
        b bVar3;
        int i22;
        int i23;
        int i24;
        int i25;
        Activity activity6;
        b bVar4;
        boolean z43;
        Integer num;
        Ref.ObjectRef objectRef10;
        ud.p pVar7;
        SharedPreferences M10;
        WindowManager.LayoutParams n10;
        WindowManager.LayoutParams n11;
        String str4;
        SalesIQFloatingActionButton salesIQFloatingActionButton;
        ConstraintLayout b11;
        Ref.ObjectRef objectRef11;
        MobilistenToggleFAB mobilistenToggleFAB8;
        b bVar5;
        j jVar6;
        ConstraintLayout b12;
        List list;
        Activity activity7;
        Object m147constructorimpl3;
        ud.o a10;
        SalesIQFloatingActionButton baseFab;
        MobilistenToggleFAB mobilistenToggleFAB9;
        SalesIQFloatingActionButton salesIQFloatingActionButton2;
        WindowManager windowManager;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i26 = pVar.f57444L;
            if ((i26 & Integer.MIN_VALUE) != 0) {
                pVar.f57444L = i26 - Integer.MIN_VALUE;
                Object obj8 = pVar.f57443K;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (pVar.f57444L) {
                    case 0:
                        ResultKt.throwOnFailure(obj8);
                        booleanRef = new Ref.BooleanRef();
                        booleanRef2 = new Ref.BooleanRef();
                        Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                        b bVar6 = (b) f57321j.get(Boxing.boxInt(activity != null ? activity.hashCode() : 0));
                        if (bVar6 != null) {
                            booleanRef.element = true;
                            ?? arrayList = new ArrayList();
                            ud.p b13 = bVar6.b();
                            if (b13 != null) {
                                Boxing.boxBoolean(arrayList.add(b13));
                            }
                            ud.o a11 = bVar6.a();
                            if (a11 != null) {
                                arrayList.add(a11);
                                Unit unit = Unit.INSTANCE;
                            }
                            objectRef12.element = arrayList;
                        } else {
                            bVar6 = new b();
                            f57321j.put(Boxing.boxInt(activity != null ? activity.hashCode() : 0), bVar6);
                        }
                        b bVar7 = bVar6;
                        f57322k = true;
                        j jVar7 = f57312a;
                        Result.Companion companion = Result.INSTANCE;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("LauncherLogs | Creating launcher : ");
                        sb2.append(activity != null ? activity.getClass().getCanonicalName() : null);
                        sb2.append(' ');
                        sb2.append(activity != null ? Boxing.boxInt(activity.hashCode()) : null);
                        LiveChatUtil.log(sb2.toString());
                        if (f57317f == null) {
                            f57317f = new nd.c(C6218a.w());
                        }
                        int styleForCurrentThemeMode = ZohoSalesIQ.getStyleForCurrentThemeMode();
                        Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                        objectRef13.element = new androidx.appcompat.view.d(activity, styleForCurrentThemeMode);
                        boolean e02 = C6218a.e0();
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        boolean d02 = C6218a.d0();
                        float dimension = ((Context) objectRef13.element).getResources().getDimension(od.o.f59939f);
                        Intrinsics.checkNotNull(activity);
                        Object systemService = activity.getSystemService("window");
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                        f57320i = (WindowManager) systemService;
                        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-1, -1, 2, 262952, -2);
                        layoutParams2.height = f57326o;
                        layoutParams2.gravity = 8388659;
                        if (Build.VERSION.SDK_INT >= 34) {
                            layoutParams2.setCanPlayMoveAnimation(false);
                            z12 = e02;
                        } else {
                            try {
                                Class<?> cls = Class.forName("android.view.WindowManager$LayoutParams");
                                Field field = cls.getField("privateFlags");
                                z12 = e02;
                                try {
                                    field.setInt(bVar7.n(), field.getInt(bVar7.n()) | cls.getField("PRIVATE_FLAG_NO_MOVE_ANIMATION").getInt(bVar7.n()));
                                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th2) {
                                    th = th2;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                    m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                    if (m150exceptionOrNullimpl2 != null) {
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    bVar7.w(layoutParams2);
                                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-2, -2, 2, 262952, -2);
                                    layoutParams3.gravity = 8388693;
                                    bVar7.B(layoutParams3);
                                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                                    f57324m = displayMetrics.widthPixels;
                                    f57325n = displayMetrics.heightPixels;
                                    b10 = bVar7.b();
                                    if (b10 != null) {
                                    }
                                    LiveChatUtil.log("LauncherLogs " + activity.hashCode() + " new " + booleanRef2.element + ' ' + z10);
                                    booleanRef2.element = true;
                                    b10 = ud.p.c(LayoutInflater.from((Context) objectRef13.element));
                                    if (jVar7.e0()) {
                                    }
                                    MobilistenToggleFAB siqCustomCoreFab = b10.f66346b;
                                    Intrinsics.checkNotNullExpressionValue(siqCustomCoreFab, "siqCustomCoreFab");
                                    layoutParams = siqCustomCoreFab.getLayoutParams();
                                    if (layoutParams != null) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z12 = e02;
                            }
                            m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl2 != null) {
                                LiveChatUtil.log(m150exceptionOrNullimpl2);
                            }
                        }
                        Unit unit22 = Unit.INSTANCE;
                        bVar7.w(layoutParams2);
                        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(-2, -2, 2, 262952, -2);
                        layoutParams32.gravity = 8388693;
                        bVar7.B(layoutParams32);
                        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                        f57324m = displayMetrics2.widthPixels;
                        f57325n = displayMetrics2.heightPixels;
                        b10 = bVar7.b();
                        if (b10 != null) {
                            Integer m10 = bVar7.m();
                            if (m10 != null && styleForCurrentThemeMode == m10.intValue() && !z10) {
                                break;
                            }
                            b10 = null;
                        }
                        LiveChatUtil.log("LauncherLogs " + activity.hashCode() + " new " + booleanRef2.element + ' ' + z10);
                        booleanRef2.element = true;
                        b10 = ud.p.c(LayoutInflater.from((Context) objectRef13.element));
                        if (jVar7.e0()) {
                            bVar7.o(ud.o.c(LayoutInflater.from((Context) objectRef13.element)));
                            ud.o a12 = bVar7.a();
                            Intrinsics.checkNotNull(a12);
                            a12.f66343c.setOnClickListener(new View.OnClickListener() { // from class: ne.b
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    j.G0(p.this, view);
                                }
                            });
                            MobilistenToggleFAB mobilistenToggleFAB10 = b10.f66346b;
                            ud.o a13 = bVar7.a();
                            Intrinsics.checkNotNull(a13);
                            SalesIQFloatingActionButton siqBaseFab = a13.f66343c;
                            Intrinsics.checkNotNullExpressionValue(siqBaseFab, "siqBaseFab");
                            mobilistenToggleFAB10.setAliasBaseFloatingActionButton(siqBaseFab);
                            MobilistenToggleFAB mobilistenToggleFAB11 = b10.f66346b;
                            ud.o a14 = bVar7.a();
                            Intrinsics.checkNotNull(a14);
                            MobilistenTextView siqBadgeCount = a14.f66342b;
                            Intrinsics.checkNotNullExpressionValue(siqBadgeCount, "siqBadgeCount");
                            mobilistenToggleFAB11.setAliasBaseFabBadgeCountView(siqBadgeCount);
                        }
                        MobilistenToggleFAB siqCustomCoreFab2 = b10.f66346b;
                        Intrinsics.checkNotNullExpressionValue(siqCustomCoreFab2, "siqCustomCoreFab");
                        layoutParams = siqCustomCoreFab2.getLayoutParams();
                        if (layoutParams != null) {
                            throw new NullPointerException(str);
                        }
                        ConstraintLayout.b bVar8 = (ConstraintLayout.b) layoutParams;
                        bVar8.f18128G = z12 ? 1.0f : 0.0f;
                        bVar8.f18129H = d02 ? 1.0f : 0.0f;
                        siqCustomCoreFab2.setLayoutParams(bVar8);
                        b10.b().setVisibility(jVar7.e0() ? 8 : 0);
                        Intrinsics.checkNotNullExpressionValue(b10, "also(...)");
                        bVar7.A(Boxing.boxInt(styleForCurrentThemeMode));
                        bVar7.p(b10);
                        bVar7.y(b10.b());
                        bVar7.v(jVar7.e0() ? b10.f66346b : b10.b());
                        pVar.f57445n = activity;
                        pVar.f57446o = booleanRef;
                        pVar.f57447p = booleanRef2;
                        pVar.f57448q = objectRef12;
                        pVar.f57449r = bVar7;
                        pVar.f57450s = jVar7;
                        pVar.f57451t = objectRef13;
                        pVar.f57452u = b10;
                        pVar.f57457z = z10;
                        z13 = z11;
                        pVar.f57433A = z13;
                        boolean z44 = z12;
                        pVar.f57434B = z44;
                        pVar.f57435C = d02;
                        pVar.f57438F = dimension;
                        pVar.f57444L = 1;
                        obj = coroutine_suspended;
                        if (jVar7.A0(bVar7, pVar) == obj) {
                            return obj;
                        }
                        bVar = bVar7;
                        z14 = d02;
                        jVar = jVar7;
                        objectRef = objectRef13;
                        activity2 = activity;
                        str2 = " new ";
                        z15 = z44;
                        f10 = dimension;
                        objectRef2 = objectRef12;
                        z16 = z10;
                        str3 = "LauncherLogs ";
                        lazy = LazyKt.lazy(z.f57486d);
                        Lazy lazy4 = LazyKt.lazy(y.f57485d);
                        Object obj9 = obj;
                        MobilistenToggleFAB mobilistenToggleFAB12 = b10.f66346b;
                        float f16 = f10;
                        boolean f02 = jVar.f0();
                        if (jVar.f0() && !Td.e.m0()) {
                            if (jVar.h0()) {
                                if (!jVar.k0()) {
                                    if (jVar.k0()) {
                                        break;
                                    }
                                    z17 = f02;
                                    i10 = 1;
                                }
                            } else if (!jVar.g0()) {
                                z17 = f02;
                                i10 = 1;
                            }
                            if (Td.e.m0()) {
                                i11 = i10;
                                obj2 = obj9;
                                mobilistenToggleFAB = mobilistenToggleFAB12;
                                bVar2 = bVar;
                                i12 = 1;
                                jVar2 = jVar;
                                objectRef3 = objectRef2;
                                z18 = z13;
                                lazy2 = lazy;
                                mobilistenToggleFAB2 = mobilistenToggleFAB;
                                objectRef4 = objectRef;
                                z19 = z14;
                                z20 = z15;
                                z21 = z17;
                                lazy3 = lazy2;
                                f12 = f16;
                                i13 = 0;
                                z25 = z21;
                                z26 = z18;
                                mobilistenToggleFAB4 = mobilistenToggleFAB;
                                z27 = z16;
                                z28 = z19;
                                mobilistenToggleFAB5 = mobilistenToggleFAB2;
                                z29 = z20;
                                objectRef6 = objectRef3;
                                booleanRef4 = booleanRef;
                                pVar3 = b10;
                                activity4 = activity2;
                                jVar3 = jVar2;
                                bVar = bVar2;
                                int i27 = i11;
                                int i28 = i12;
                                obj3 = obj2;
                                boolean h02 = jVar3.h0();
                                if (jVar3.g0()) {
                                }
                                L b14 = C1452g0.b();
                                boolean z45 = z29;
                                Lazy lazy5 = lazy3;
                                boolean z46 = z26;
                                s sVar = new s(lazy5, null);
                                pVar.f57445n = activity4;
                                pVar.f57446o = booleanRef4;
                                pVar.f57447p = booleanRef2;
                                pVar.f57448q = objectRef6;
                                pVar.f57449r = bVar;
                                pVar.f57450s = jVar3;
                                pVar.f57451t = objectRef4;
                                pVar.f57452u = pVar3;
                                pVar.f57453v = mobilistenToggleFAB5;
                                pVar.f57454w = mobilistenToggleFAB4;
                                pVar.f57455x = mobilistenToggleFAB12;
                                pVar.f57456y = null;
                                pVar.f57457z = z27;
                                pVar.f57433A = z46;
                                pVar.f57434B = z45;
                                z30 = z28;
                                pVar.f57435C = z30;
                                j jVar8 = jVar3;
                                float f17 = f12;
                                pVar.f57438F = f17;
                                pVar.f57439G = i27;
                                boolean z47 = z25;
                                pVar.f57436D = z47;
                                pVar.f57440H = i28;
                                i14 = i28;
                                int i29 = i13;
                                pVar.f57441I = i29;
                                i15 = i29;
                                int i30 = r33;
                                pVar.f57442J = i30;
                                pVar.f57437E = h02;
                                pVar.f57444L = 3;
                                g10 = AbstractC1455i.g(b14, sVar, pVar);
                                if (g10 == obj3) {
                                }
                            } else {
                                int i31 = i10;
                                L b15 = C1452g0.b();
                                boolean z48 = z14;
                                r rVar = new r(null);
                                pVar.f57445n = activity2;
                                pVar.f57446o = booleanRef;
                                pVar.f57447p = booleanRef2;
                                pVar.f57448q = objectRef2;
                                pVar.f57449r = bVar;
                                pVar.f57450s = jVar;
                                pVar.f57451t = objectRef;
                                pVar.f57452u = b10;
                                pVar.f57453v = lazy;
                                pVar.f57454w = mobilistenToggleFAB12;
                                pVar.f57455x = mobilistenToggleFAB12;
                                pVar.f57456y = mobilistenToggleFAB12;
                                pVar.f57457z = z16;
                                pVar.f57433A = z13;
                                pVar.f57434B = z15;
                                pVar.f57435C = z48;
                                activity3 = activity2;
                                pVar.f57438F = f16;
                                pVar.f57439G = i31;
                                i11 = i31;
                                boolean z49 = z17;
                                pVar.f57436D = z49;
                                pVar.f57440H = 1;
                                pVar.f57444L = 2;
                                Object g11 = AbstractC1455i.g(b15, rVar, pVar);
                                obj2 = obj9;
                                if (g11 == obj2) {
                                    return obj2;
                                }
                                mobilistenToggleFAB3 = mobilistenToggleFAB12;
                                mobilistenToggleFAB = mobilistenToggleFAB3;
                                objectRef5 = objectRef2;
                                i12 = 1;
                                pVar2 = b10;
                                obj8 = g11;
                                z22 = z16;
                                z23 = z48;
                                jVar3 = jVar;
                                z18 = z13;
                                z20 = z15;
                                f11 = f16;
                                mobilistenToggleFAB2 = mobilistenToggleFAB;
                                booleanRef3 = booleanRef2;
                                z24 = z49;
                                if (((Boolean) obj8).booleanValue()) {
                                    b bVar9 = bVar;
                                    jVar2 = jVar3;
                                    activity2 = activity3;
                                    objectRef3 = objectRef5;
                                    bVar2 = bVar9;
                                    float f18 = f11;
                                    z21 = z24;
                                    booleanRef2 = booleanRef3;
                                    f16 = f18;
                                    Ref.ObjectRef objectRef14 = objectRef;
                                    z19 = z23;
                                    z16 = z22;
                                    lazy2 = lazy;
                                    objectRef4 = objectRef14;
                                    b10 = pVar2;
                                    mobilistenToggleFAB12 = mobilistenToggleFAB3;
                                    lazy3 = lazy2;
                                    f12 = f16;
                                    i13 = 0;
                                    z25 = z21;
                                    z26 = z18;
                                    mobilistenToggleFAB4 = mobilistenToggleFAB;
                                    z27 = z16;
                                    z28 = z19;
                                    mobilistenToggleFAB5 = mobilistenToggleFAB2;
                                    z29 = z20;
                                    objectRef6 = objectRef3;
                                    booleanRef4 = booleanRef;
                                    pVar3 = b10;
                                    activity4 = activity2;
                                    jVar3 = jVar2;
                                    bVar = bVar2;
                                    int i272 = i11;
                                    int i282 = i12;
                                    obj3 = obj2;
                                    boolean h022 = jVar3.h0();
                                    if (jVar3.g0()) {
                                    }
                                    L b142 = C1452g0.b();
                                    boolean z452 = z29;
                                    Lazy lazy52 = lazy3;
                                    boolean z462 = z26;
                                    s sVar2 = new s(lazy52, null);
                                    pVar.f57445n = activity4;
                                    pVar.f57446o = booleanRef4;
                                    pVar.f57447p = booleanRef2;
                                    pVar.f57448q = objectRef6;
                                    pVar.f57449r = bVar;
                                    pVar.f57450s = jVar3;
                                    pVar.f57451t = objectRef4;
                                    pVar.f57452u = pVar3;
                                    pVar.f57453v = mobilistenToggleFAB5;
                                    pVar.f57454w = mobilistenToggleFAB4;
                                    pVar.f57455x = mobilistenToggleFAB12;
                                    pVar.f57456y = null;
                                    pVar.f57457z = z27;
                                    pVar.f57433A = z462;
                                    pVar.f57434B = z452;
                                    z30 = z28;
                                    pVar.f57435C = z30;
                                    j jVar82 = jVar3;
                                    float f172 = f12;
                                    pVar.f57438F = f172;
                                    pVar.f57439G = i272;
                                    boolean z472 = z25;
                                    pVar.f57436D = z472;
                                    pVar.f57440H = i282;
                                    i14 = i282;
                                    int i292 = i13;
                                    pVar.f57441I = i292;
                                    i15 = i292;
                                    int i302 = r33;
                                    pVar.f57442J = i302;
                                    pVar.f57437E = h022;
                                    pVar.f57444L = 3;
                                    g10 = AbstractC1455i.g(b142, sVar2, pVar);
                                    if (g10 == obj3) {
                                    }
                                } else {
                                    Ref.BooleanRef booleanRef8 = booleanRef3;
                                    z25 = z24;
                                    booleanRef2 = booleanRef8;
                                    boolean z50 = z22;
                                    z26 = z18;
                                    z27 = z50;
                                    lazy3 = lazy;
                                    activity4 = activity3;
                                    i13 = 1;
                                    objectRef4 = objectRef;
                                    z29 = z20;
                                    booleanRef4 = booleanRef;
                                    pVar3 = pVar2;
                                    mobilistenToggleFAB12 = mobilistenToggleFAB3;
                                    f12 = f11;
                                    mobilistenToggleFAB4 = mobilistenToggleFAB;
                                    z28 = z23;
                                    mobilistenToggleFAB5 = mobilistenToggleFAB2;
                                    objectRef6 = objectRef5;
                                    int i2722 = i11;
                                    int i2822 = i12;
                                    obj3 = obj2;
                                    boolean h0222 = jVar3.h0();
                                    int i32 = (jVar3.g0() || ((LiveChatUtil.isMultipleChatsDisabled() || !jVar3.h0()) && H0(lazy3).size() != 0)) ? 0 : 1;
                                    L b1422 = C1452g0.b();
                                    boolean z4522 = z29;
                                    Lazy lazy522 = lazy3;
                                    boolean z4622 = z26;
                                    s sVar22 = new s(lazy522, null);
                                    pVar.f57445n = activity4;
                                    pVar.f57446o = booleanRef4;
                                    pVar.f57447p = booleanRef2;
                                    pVar.f57448q = objectRef6;
                                    pVar.f57449r = bVar;
                                    pVar.f57450s = jVar3;
                                    pVar.f57451t = objectRef4;
                                    pVar.f57452u = pVar3;
                                    pVar.f57453v = mobilistenToggleFAB5;
                                    pVar.f57454w = mobilistenToggleFAB4;
                                    pVar.f57455x = mobilistenToggleFAB12;
                                    pVar.f57456y = null;
                                    pVar.f57457z = z27;
                                    pVar.f57433A = z4622;
                                    pVar.f57434B = z4522;
                                    z30 = z28;
                                    pVar.f57435C = z30;
                                    j jVar822 = jVar3;
                                    float f1722 = f12;
                                    pVar.f57438F = f1722;
                                    pVar.f57439G = i2722;
                                    boolean z4722 = z25;
                                    pVar.f57436D = z4722;
                                    pVar.f57440H = i2822;
                                    i14 = i2822;
                                    int i2922 = i13;
                                    pVar.f57441I = i2922;
                                    i15 = i2922;
                                    int i3022 = i32;
                                    pVar.f57442J = i3022;
                                    pVar.f57437E = h0222;
                                    pVar.f57444L = 3;
                                    g10 = AbstractC1455i.g(b1422, sVar22, pVar);
                                    if (g10 == obj3) {
                                        return obj3;
                                    }
                                    jVar4 = jVar822;
                                    obj4 = obj3;
                                    z31 = z4622;
                                    z32 = z4522;
                                    objectRef7 = objectRef4;
                                    i16 = i2722;
                                    pVar4 = pVar3;
                                    z33 = z27;
                                    z34 = z4722;
                                    activity5 = activity4;
                                    obj8 = g10;
                                    mobilistenToggleFAB6 = mobilistenToggleFAB12;
                                    booleanRef5 = booleanRef4;
                                    mobilistenToggleFAB7 = mobilistenToggleFAB4;
                                    i17 = i3022;
                                    z35 = h0222;
                                    f13 = f1722;
                                    mobilistenToggleFAB6.setFabsVisibility(new MobilistenToggleFAB.a(i14 == 0, z34, i16 == 0, i15 == 0, z35, i17 == 0, ((Boolean) obj8).booleanValue(), jVar4.k0(), !LiveChatUtil.isMultipleChatsDisabled(), false, f57317f, !z32 ? MobilistenToggleFAB.c.End : MobilistenToggleFAB.c.Start, !z30 ? MobilistenToggleFAB.e.Bottom : MobilistenToggleFAB.e.Top, false, 8192, null));
                                    mobilistenToggleFAB7.setElevation(og.k.d(6));
                                    mobilistenToggleFAB7.setScrimView(pVar4.f66348d);
                                    pVar4.f66348d.setOnClickListener(new View.OnClickListener() { // from class: ne.c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            j.J0(p.this, view);
                                        }
                                    });
                                    mobilistenToggleFAB7.setOnChatClickListener(new View.OnClickListener() { // from class: ne.d
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            j.K0(j.this, mobilistenToggleFAB7, bVar, pVar4, view);
                                        }
                                    });
                                    mobilistenToggleFAB7.setOnCallClickListener(new View.OnClickListener() { // from class: ne.e
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            j.L0(j.this, mobilistenToggleFAB7, objectRef7, activity5, pVar4, bVar, view);
                                        }
                                    });
                                    if (rd.b.h(activity5) == null) {
                                        I(activity5);
                                    }
                                    pVar.f57445n = activity5;
                                    pVar.f57446o = booleanRef5;
                                    pVar.f57447p = booleanRef2;
                                    pVar.f57448q = objectRef6;
                                    pVar.f57449r = bVar;
                                    pVar.f57450s = jVar4;
                                    pVar.f57451t = objectRef7;
                                    pVar.f57452u = pVar4;
                                    pVar.f57453v = null;
                                    pVar.f57454w = null;
                                    pVar.f57455x = null;
                                    pVar.f57457z = z33;
                                    pVar.f57433A = z31;
                                    boolean z51 = z32;
                                    pVar.f57434B = z51;
                                    pVar.f57435C = z30;
                                    float f19 = f13;
                                    pVar.f57438F = f19;
                                    pVar.f57444L = 4;
                                    b02 = jVar4.b0(bVar, pVar);
                                    obj5 = obj4;
                                    if (b02 != obj5) {
                                        return obj5;
                                    }
                                    boolean z52 = z33;
                                    z36 = z51;
                                    obj8 = b02;
                                    objectRef8 = objectRef6;
                                    z37 = z52;
                                    Ref.BooleanRef booleanRef9 = booleanRef5;
                                    f14 = f19;
                                    booleanRef6 = booleanRef9;
                                    j jVar9 = jVar4;
                                    booleanRef7 = booleanRef2;
                                    z38 = z31;
                                    objectRef9 = objectRef7;
                                    jVar5 = jVar9;
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    z39 = z37;
                                    if (booleanRef7.element && !booleanValue) {
                                        z40 = false;
                                        booleanRef7.element = z40;
                                        i18 = (z39 && z38 && booleanRef6.element) ? 1 : 0;
                                        if (jVar5.f0() || (bVar.l() != null && i18 != 0)) {
                                            i19 = i18;
                                            z41 = z36;
                                            z42 = z38;
                                            obj6 = obj5;
                                            pVar5 = pVar4;
                                            if (!z39 && (!z42 || !booleanRef7.element)) {
                                                if (!z42) {
                                                    t0(activity5);
                                                }
                                                i20 = f57324m;
                                                Ref.FloatRef floatRef = new Ref.FloatRef();
                                                Result.Companion companion3 = Result.INSTANCE;
                                                floatRef.element = C6218a.x();
                                                m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                                                if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null && (M10 = C6218a.M()) != null) {
                                                    C6218a.m0(M10.getInt("launcher_y", -1));
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                                cVar = f57317f;
                                                if (cVar != null || cVar.e() != 2) {
                                                    int i33 = i19;
                                                    obj7 = obj6;
                                                    pVar6 = pVar5;
                                                    if (i20 == -1) {
                                                        C6218a.l0(f57325n, true, MobilistenToggleFAB.e.Bottom);
                                                    }
                                                    i21 = i33;
                                                    bVar3 = bVar;
                                                    i22 = 0;
                                                    i23 = 0;
                                                    if (jVar5.e0()) {
                                                        ud.p b16 = bVar3.b();
                                                        if (b16 != null && (mobilistenToggleFAB8 = b16.f66346b) != null) {
                                                            ViewGroup.LayoutParams layoutParams4 = mobilistenToggleFAB8.getLayoutParams();
                                                            if (layoutParams4 == null) {
                                                                throw new NullPointerException(str);
                                                            }
                                                            ConstraintLayout.b bVar10 = (ConstraintLayout.b) layoutParams4;
                                                            if (z30) {
                                                                bVar10.f18129H = 1.0f;
                                                                ((ViewGroup.MarginLayoutParams) bVar10).topMargin = 0;
                                                                ((ViewGroup.MarginLayoutParams) bVar10).bottomMargin = jVar5.B(i23);
                                                            } else {
                                                                bVar10.f18129H = 0.0f;
                                                                ((ViewGroup.MarginLayoutParams) bVar10).topMargin = f57327p - (og.k.b(88) + i23);
                                                                ((ViewGroup.MarginLayoutParams) bVar10).bottomMargin = 0;
                                                            }
                                                            mobilistenToggleFAB8.setLayoutParams(bVar10);
                                                            Unit unit4 = Unit.INSTANCE;
                                                        }
                                                        jVar5.Q0(bVar3, z30 ? MobilistenToggleFAB.e.Bottom : MobilistenToggleFAB.e.Top);
                                                    }
                                                    n10 = bVar3.n();
                                                    if (n10 != null) {
                                                        n10.x = i22;
                                                    }
                                                    n11 = bVar3.n();
                                                    if (n11 != null) {
                                                        n11.y = i23;
                                                    }
                                                    f57322k = true;
                                                    if (i21 != 0) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(str3);
                                                        ViewGroup k10 = bVar3.k();
                                                        sb3.append(k10 != null ? k10.hashCode() : 0);
                                                        sb3.append(' ');
                                                        ud.o a15 = bVar3.a();
                                                        sb3.append(a15 != null ? a15.hashCode() : 0);
                                                        sb3.append(" update ");
                                                        sb3.append(booleanRef7.element);
                                                        LiveChatUtil.log(sb3.toString());
                                                        jVar5.R0(bVar3);
                                                        Object m147constructorimpl4 = Result.m147constructorimpl(Unit.INSTANCE);
                                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl4);
                                                        if (m150exceptionOrNullimpl != null) {
                                                            f57322k = false;
                                                            LiveChatUtil.log(m150exceptionOrNullimpl);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    str4 = str3;
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append(str4);
                                                    ViewGroup k11 = bVar3.k();
                                                    sb4.append(k11 != null ? k11.hashCode() : 0);
                                                    sb4.append(' ');
                                                    ud.o a16 = bVar3.a();
                                                    sb4.append(a16 != null ? a16.hashCode() : 0);
                                                    sb4.append(str2);
                                                    sb4.append(booleanRef7.element);
                                                    LiveChatUtil.log(sb4.toString());
                                                    E(jVar5, false, false, false, 4, null);
                                                    List list2 = (List) objectRef8.element;
                                                    if (list2 != null) {
                                                        for (Object obj10 : list2) {
                                                            if (obj10 instanceof ud.p) {
                                                                ((ud.p) obj10).f66346b.setElevation(0.0f);
                                                                ((ud.p) obj10).f66346b.getBaseFab().setElevation(0.0f);
                                                            } else if (obj10 instanceof ud.o) {
                                                                ((ud.o) obj10).f66343c.setElevation(0.0f);
                                                            }
                                                        }
                                                        Unit unit5 = Unit.INSTANCE;
                                                    }
                                                    if (!jVar5.e0()) {
                                                        jVar5.C(f57320i, pVar6.b(), bVar3.n());
                                                        LiveChatUtil.log("LauncherLogs | Added bindingRoot(1): " + pVar6.b().hashCode() + ' ' + activity5.getClass().getCanonicalName() + ' ' + activity5.hashCode());
                                                        ud.d l10 = bVar3.l();
                                                        if (l10 != null && (b11 = l10.b()) != null) {
                                                            WindowManager windowManager2 = f57320i;
                                                            WindowManager.LayoutParams layoutParams5 = new WindowManager.LayoutParams(-1, -2, 2, 262952, -2);
                                                            layoutParams5.height = f57326o;
                                                            Unit unit6 = Unit.INSTANCE;
                                                            jVar5.C(windowManager2, b11, layoutParams5);
                                                        }
                                                        List list3 = (List) objectRef8.element;
                                                        if (list3 != null) {
                                                            salesIQFloatingActionButton = null;
                                                            jVar5.n0(new q(list3, null));
                                                            Unit unit7 = Unit.INSTANCE;
                                                            rd.b.a(activity5, bVar3.k());
                                                            f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                                                            a10 = bVar3.a();
                                                            if (a10 != null) {
                                                                baseFab = salesIQFloatingActionButton2;
                                                                Intrinsics.checkNotNull(baseFab);
                                                                jVar5.Z(activity5, baseFab);
                                                                Object m147constructorimpl42 = Result.m147constructorimpl(Unit.INSTANCE);
                                                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl42);
                                                                if (m150exceptionOrNullimpl != null) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                            ud.p b17 = bVar3.b();
                                                            if (b17 != null) {
                                                            }
                                                            Intrinsics.checkNotNull(baseFab);
                                                            jVar5.Z(activity5, baseFab);
                                                            Object m147constructorimpl422 = Result.m147constructorimpl(Unit.INSTANCE);
                                                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl422);
                                                            if (m150exceptionOrNullimpl != null) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                        salesIQFloatingActionButton = null;
                                                        rd.b.a(activity5, bVar3.k());
                                                        f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                                                        a10 = bVar3.a();
                                                        if (a10 != null) {
                                                        }
                                                        ud.p b172 = bVar3.b();
                                                        if (b172 != null) {
                                                        }
                                                        Intrinsics.checkNotNull(baseFab);
                                                        jVar5.Z(activity5, baseFab);
                                                        Object m147constructorimpl4222 = Result.m147constructorimpl(Unit.INSTANCE);
                                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl4222);
                                                        if (m150exceptionOrNullimpl != null) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    WindowManager windowManager3 = f57320i;
                                                    if (windowManager3 != null) {
                                                        jVar5.C(windowManager3, pVar6.b(), bVar3.i());
                                                        Unit unit8 = Unit.INSTANCE;
                                                    }
                                                    LiveChatUtil.log("LauncherLogs | Added bindingRoot: " + pVar6.b().hashCode() + ' ' + activity5.getClass().getCanonicalName() + ' ' + activity5.hashCode());
                                                    pVar.f57445n = activity5;
                                                    pVar.f57446o = objectRef8;
                                                    pVar.f57447p = bVar3;
                                                    pVar.f57448q = jVar5;
                                                    pVar.f57449r = null;
                                                    pVar.f57450s = null;
                                                    pVar.f57451t = null;
                                                    pVar.f57452u = null;
                                                    pVar.f57444L = 6;
                                                    if (AbstractC1440a0.a(10L, pVar) == obj7) {
                                                        return obj7;
                                                    }
                                                    objectRef11 = objectRef8;
                                                    WindowManager windowManager4 = f57320i;
                                                    ud.o a17 = bVar3.a();
                                                    jVar5.C(windowManager4, a17 == null ? a17.b() : null, bVar3.n());
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append("LauncherLogs | Added baseFabAlias: ");
                                                    ud.o a18 = bVar3.a();
                                                    sb5.append((a18 != null || (b12 = a18.b()) == null) ? null : Boxing.boxInt(b12.hashCode()));
                                                    sb5.append(' ');
                                                    sb5.append(activity5.getClass().getCanonicalName());
                                                    sb5.append(' ');
                                                    sb5.append(activity5.hashCode());
                                                    LiveChatUtil.log(sb5.toString());
                                                    pVar.f57445n = activity5;
                                                    pVar.f57446o = objectRef11;
                                                    pVar.f57447p = bVar3;
                                                    pVar.f57448q = jVar5;
                                                    pVar.f57444L = 7;
                                                    if (AbstractC1440a0.a(10L, pVar) != obj7) {
                                                        return obj7;
                                                    }
                                                    bVar5 = bVar3;
                                                    jVar6 = jVar5;
                                                    WindowManager windowManager5 = f57320i;
                                                    ud.d l11 = bVar5.l();
                                                    ConstraintLayout b18 = l11 == null ? l11.b() : null;
                                                    WindowManager.LayoutParams layoutParams6 = new WindowManager.LayoutParams(-1, -2, 2, 262952, -2);
                                                    layoutParams6.height = f57326o;
                                                    Unit unit9 = Unit.INSTANCE;
                                                    jVar6.C(windowManager5, b18, layoutParams6);
                                                    list = (List) objectRef11.element;
                                                    if (list != null) {
                                                        try {
                                                            Result.Companion companion4 = Result.INSTANCE;
                                                            pVar.f57445n = activity5;
                                                            pVar.f57446o = bVar5;
                                                            pVar.f57447p = jVar6;
                                                            pVar.f57448q = list;
                                                            pVar.f57444L = 8;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            activity7 = activity5;
                                                            Result.Companion companion5 = Result.INSTANCE;
                                                            m147constructorimpl3 = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                            if (Result.m150exceptionOrNullimpl(m147constructorimpl3) != null) {
                                                            }
                                                            Result.m146boximpl(m147constructorimpl3);
                                                            activity5 = activity7;
                                                            jVar5 = jVar6;
                                                            bVar3 = bVar5;
                                                            salesIQFloatingActionButton = null;
                                                            rd.b.a(activity5, bVar3.k());
                                                            f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                                                            a10 = bVar3.a();
                                                            if (a10 != null) {
                                                            }
                                                            ud.p b1722 = bVar3.b();
                                                            if (b1722 != null) {
                                                            }
                                                            Intrinsics.checkNotNull(baseFab);
                                                            jVar5.Z(activity5, baseFab);
                                                            Object m147constructorimpl42222 = Result.m147constructorimpl(Unit.INSTANCE);
                                                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl42222);
                                                            if (m150exceptionOrNullimpl != null) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                        if (AbstractC1440a0.a(10L, pVar) == obj7) {
                                                            return obj7;
                                                        }
                                                        activity7 = activity5;
                                                        for (Object obj11 : list) {
                                                            if (obj11 instanceof ud.p) {
                                                                WindowManager windowManager6 = f57320i;
                                                                if (windowManager6 != null) {
                                                                    windowManager6.removeViewImmediate(((ud.p) obj11).b());
                                                                    Unit unit10 = Unit.INSTANCE;
                                                                }
                                                            } else if ((obj11 instanceof ud.o) && (windowManager = f57320i) != null) {
                                                                windowManager.removeViewImmediate(((ud.o) obj11).b());
                                                                Unit unit11 = Unit.INSTANCE;
                                                            }
                                                            LiveChatUtil.log(str4 + obj11.hashCode() + " removed");
                                                        }
                                                        m147constructorimpl3 = Result.m147constructorimpl(Unit.INSTANCE);
                                                        if (Result.m150exceptionOrNullimpl(m147constructorimpl3) != null) {
                                                            ne.l.f(new b.g());
                                                        }
                                                        Result.m146boximpl(m147constructorimpl3);
                                                        activity5 = activity7;
                                                    }
                                                    jVar5 = jVar6;
                                                    bVar3 = bVar5;
                                                    salesIQFloatingActionButton = null;
                                                    rd.b.a(activity5, bVar3.k());
                                                    f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                                                    a10 = bVar3.a();
                                                    if (a10 != null && (salesIQFloatingActionButton2 = a10.f66343c) != null) {
                                                        baseFab = salesIQFloatingActionButton2;
                                                        Intrinsics.checkNotNull(baseFab);
                                                        jVar5.Z(activity5, baseFab);
                                                        Object m147constructorimpl422222 = Result.m147constructorimpl(Unit.INSTANCE);
                                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl422222);
                                                        if (m150exceptionOrNullimpl != null) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    ud.p b17222 = bVar3.b();
                                                    baseFab = (b17222 != null || (mobilistenToggleFAB9 = b17222.f66346b) == null) ? salesIQFloatingActionButton : mobilistenToggleFAB9.getBaseFab();
                                                    Intrinsics.checkNotNull(baseFab);
                                                    jVar5.Z(activity5, baseFab);
                                                    Object m147constructorimpl4222222 = Result.m147constructorimpl(Unit.INSTANCE);
                                                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl4222222);
                                                    if (m150exceptionOrNullimpl != null) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                i24 = z41 ? 0 : (f57324m - ((int) f14)) - (f57316e * 2);
                                                float f20 = floatRef.element;
                                                Integer boxInt = Boxing.boxInt(f20 == 1.0f ? f57325n - (((int) f14) + (f57316e * 2)) : f20 == 0.0f ? 0 : jVar5.o0((int) (f20 * f57325n)));
                                                int intValue = boxInt.intValue();
                                                L b19 = C1452g0.b();
                                                x xVar = jVar5.new x(intValue, z30, null);
                                                pVar.f57445n = activity5;
                                                pVar.f57446o = booleanRef7;
                                                pVar.f57447p = objectRef8;
                                                pVar.f57448q = bVar;
                                                pVar.f57449r = jVar5;
                                                ud.p pVar8 = pVar5;
                                                pVar.f57450s = pVar8;
                                                pVar.f57451t = boxInt;
                                                pVar.f57452u = null;
                                                pVar.f57457z = z30;
                                                i25 = i19;
                                                pVar.f57439G = i25;
                                                pVar.f57440H = i24;
                                                pVar.f57444L = 5;
                                                obj7 = obj6;
                                                if (AbstractC1455i.g(b19, xVar, pVar) == obj7) {
                                                    return obj7;
                                                }
                                                activity6 = activity5;
                                                bVar4 = bVar;
                                                z43 = z30;
                                                num = boxInt;
                                                objectRef10 = objectRef8;
                                                pVar7 = pVar8;
                                                i23 = num.intValue();
                                                i22 = i24;
                                                i21 = i25;
                                                bVar3 = bVar4;
                                                objectRef8 = objectRef10;
                                                pVar6 = pVar7;
                                                z30 = z43;
                                                activity5 = activity6;
                                                if (jVar5.e0()) {
                                                }
                                                n10 = bVar3.n();
                                                if (n10 != null) {
                                                }
                                                n11 = bVar3.n();
                                                if (n11 != null) {
                                                }
                                                f57322k = true;
                                                if (i21 != 0) {
                                                }
                                            }
                                            Result.Companion companion6 = Result.INSTANCE;
                                            languageOrNull = LiveChatUtil.getLanguageOrNull();
                                            if (languageOrNull == null) {
                                                languageOrNull = Locale.getDefault().getLanguage();
                                            }
                                            objectRef9.element = AbstractC5892d.a((Context) objectRef9.element, new Locale(languageOrNull));
                                            Object m147constructorimpl5 = Result.m147constructorimpl(Unit.INSTANCE);
                                            m150exceptionOrNullimpl3 = Result.m150exceptionOrNullimpl(m147constructorimpl5);
                                            if (m150exceptionOrNullimpl3 != null) {
                                                LiveChatUtil.log(m150exceptionOrNullimpl3);
                                            }
                                            f15 = bVar.f();
                                            if (f15 != null) {
                                                f15.setText(((Context) objectRef9.element).getString(od.t.f60974Y2));
                                            }
                                            i20 = f57324m;
                                            Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                            Result.Companion companion32 = Result.INSTANCE;
                                            floatRef2.element = C6218a.x();
                                            m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                                            if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                                C6218a.m0(M10.getInt("launcher_y", -1));
                                                Unit unit32 = Unit.INSTANCE;
                                            }
                                            cVar = f57317f;
                                            if (cVar != null) {
                                            }
                                            int i332 = i19;
                                            obj7 = obj6;
                                            pVar6 = pVar5;
                                            if (i20 == -1) {
                                            }
                                            i21 = i332;
                                            bVar3 = bVar;
                                            i22 = 0;
                                            i23 = 0;
                                            if (jVar5.e0()) {
                                            }
                                            n10 = bVar3.n();
                                            if (n10 != null) {
                                            }
                                            n11 = bVar3.n();
                                            if (n11 != null) {
                                            }
                                            f57322k = true;
                                            if (i21 != 0) {
                                            }
                                        }
                                        LayoutInflater from = LayoutInflater.from((Context) objectRef9.element);
                                        ConstraintLayout b20 = pVar4.b();
                                        if (b20 == null) {
                                            b20 = null;
                                        }
                                        z41 = z36;
                                        ud.d c10 = ud.d.c(from, b20, false);
                                        c10.b().setElevation(og.k.d(25));
                                        c10.b().setVisibility(8);
                                        if (jVar5.e0()) {
                                            z42 = z38;
                                            obj6 = obj5;
                                        } else {
                                            z42 = z38;
                                            obj6 = obj5;
                                            c10.b().setBackgroundColor(androidx.core.content.res.k.d(c10.b().getContext().getResources(), od.n.f59926f, c10.b().getContext().getTheme()));
                                        }
                                        Drawable background = c10.f66284e.getBackground();
                                        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                                        GradientDrawable gradientDrawable = (GradientDrawable) background;
                                        i19 = i18;
                                        pVar5 = pVar4;
                                        gradientDrawable.setColor(AbstractC5892d.h((Context) objectRef9.element, Boxing.boxInt(AbstractC5886l.f59743M1), 0.0f, 2, null));
                                        c10.f66285f.setText(c10.b().getContext().getString(od.t.f61101r));
                                        c10.f66284e.setBackground(gradientDrawable);
                                        Unit unit12 = Unit.INSTANCE;
                                        bVar.z(c10);
                                        if (!z39) {
                                            if (!z42) {
                                            }
                                            i20 = f57324m;
                                            Ref.FloatRef floatRef22 = new Ref.FloatRef();
                                            Result.Companion companion322 = Result.INSTANCE;
                                            floatRef22.element = C6218a.x();
                                            m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                                            if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                            }
                                            cVar = f57317f;
                                            if (cVar != null) {
                                            }
                                            int i3322 = i19;
                                            obj7 = obj6;
                                            pVar6 = pVar5;
                                            if (i20 == -1) {
                                            }
                                            i21 = i3322;
                                            bVar3 = bVar;
                                            i22 = 0;
                                            i23 = 0;
                                            if (jVar5.e0()) {
                                            }
                                            n10 = bVar3.n();
                                            if (n10 != null) {
                                            }
                                            n11 = bVar3.n();
                                            if (n11 != null) {
                                            }
                                            f57322k = true;
                                            if (i21 != 0) {
                                            }
                                        }
                                        Result.Companion companion62 = Result.INSTANCE;
                                        languageOrNull = LiveChatUtil.getLanguageOrNull();
                                        if (languageOrNull == null) {
                                        }
                                        objectRef9.element = AbstractC5892d.a((Context) objectRef9.element, new Locale(languageOrNull));
                                        Object m147constructorimpl52 = Result.m147constructorimpl(Unit.INSTANCE);
                                        m150exceptionOrNullimpl3 = Result.m150exceptionOrNullimpl(m147constructorimpl52);
                                        if (m150exceptionOrNullimpl3 != null) {
                                        }
                                        f15 = bVar.f();
                                        if (f15 != null) {
                                        }
                                        i20 = f57324m;
                                        Ref.FloatRef floatRef222 = new Ref.FloatRef();
                                        Result.Companion companion3222 = Result.INSTANCE;
                                        floatRef222.element = C6218a.x();
                                        m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                        }
                                        cVar = f57317f;
                                        if (cVar != null) {
                                        }
                                        int i33222 = i19;
                                        obj7 = obj6;
                                        pVar6 = pVar5;
                                        if (i20 == -1) {
                                        }
                                        i21 = i33222;
                                        bVar3 = bVar;
                                        i22 = 0;
                                        i23 = 0;
                                        if (jVar5.e0()) {
                                        }
                                        n10 = bVar3.n();
                                        if (n10 != null) {
                                        }
                                        n11 = bVar3.n();
                                        if (n11 != null) {
                                        }
                                        f57322k = true;
                                        if (i21 != 0) {
                                        }
                                    }
                                    z40 = true;
                                    booleanRef7.element = z40;
                                    if (z39) {
                                    }
                                    if (jVar5.f0()) {
                                    }
                                    i19 = i18;
                                    z41 = z36;
                                    z42 = z38;
                                    obj6 = obj5;
                                    pVar5 = pVar4;
                                    if (!z39) {
                                    }
                                    Result.Companion companion622 = Result.INSTANCE;
                                    languageOrNull = LiveChatUtil.getLanguageOrNull();
                                    if (languageOrNull == null) {
                                    }
                                    objectRef9.element = AbstractC5892d.a((Context) objectRef9.element, new Locale(languageOrNull));
                                    Object m147constructorimpl522 = Result.m147constructorimpl(Unit.INSTANCE);
                                    m150exceptionOrNullimpl3 = Result.m150exceptionOrNullimpl(m147constructorimpl522);
                                    if (m150exceptionOrNullimpl3 != null) {
                                    }
                                    f15 = bVar.f();
                                    if (f15 != null) {
                                    }
                                    i20 = f57324m;
                                    Ref.FloatRef floatRef2222 = new Ref.FloatRef();
                                    Result.Companion companion32222 = Result.INSTANCE;
                                    floatRef2222.element = C6218a.x();
                                    m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                                    if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                    }
                                    cVar = f57317f;
                                    if (cVar != null) {
                                    }
                                    int i332222 = i19;
                                    obj7 = obj6;
                                    pVar6 = pVar5;
                                    if (i20 == -1) {
                                    }
                                    i21 = i332222;
                                    bVar3 = bVar;
                                    i22 = 0;
                                    i23 = 0;
                                    if (jVar5.e0()) {
                                    }
                                    n10 = bVar3.n();
                                    if (n10 != null) {
                                    }
                                    n11 = bVar3.n();
                                    if (n11 != null) {
                                    }
                                    f57322k = true;
                                    if (i21 != 0) {
                                    }
                                }
                            }
                        }
                        z17 = f02;
                        i10 = 0;
                        if (Td.e.m0()) {
                        }
                        break;
                    case 1:
                        float f21 = pVar.f57438F;
                        boolean z53 = pVar.f57435C;
                        boolean z54 = pVar.f57434B;
                        boolean z55 = pVar.f57433A;
                        z16 = pVar.f57457z;
                        ud.p pVar9 = (ud.p) pVar.f57452u;
                        objectRef = (Ref.ObjectRef) pVar.f57451t;
                        jVar = (j) pVar.f57450s;
                        bVar = (b) pVar.f57449r;
                        objectRef2 = (Ref.ObjectRef) pVar.f57448q;
                        Ref.BooleanRef booleanRef10 = (Ref.BooleanRef) pVar.f57447p;
                        Ref.BooleanRef booleanRef11 = (Ref.BooleanRef) pVar.f57446o;
                        activity2 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        f10 = f21;
                        str2 = " new ";
                        b10 = pVar9;
                        z14 = z53;
                        obj = coroutine_suspended;
                        z15 = z54;
                        z13 = z55;
                        booleanRef2 = booleanRef10;
                        booleanRef = booleanRef11;
                        str3 = "LauncherLogs ";
                        lazy = LazyKt.lazy(z.f57486d);
                        Lazy lazy42 = LazyKt.lazy(y.f57485d);
                        Object obj92 = obj;
                        MobilistenToggleFAB mobilistenToggleFAB122 = b10.f66346b;
                        float f162 = f10;
                        boolean f022 = jVar.f0();
                        if (jVar.f0()) {
                            if (jVar.h0()) {
                            }
                            if (Td.e.m0()) {
                            }
                            break;
                        }
                        z17 = f022;
                        i10 = 0;
                        if (Td.e.m0()) {
                        }
                        break;
                    case 2:
                        int i34 = pVar.f57440H;
                        boolean z56 = pVar.f57436D;
                        int i35 = pVar.f57439G;
                        float f22 = pVar.f57438F;
                        z23 = pVar.f57435C;
                        z20 = pVar.f57434B;
                        boolean z57 = pVar.f57433A;
                        boolean z58 = pVar.f57457z;
                        MobilistenToggleFAB mobilistenToggleFAB13 = (MobilistenToggleFAB) pVar.f57456y;
                        MobilistenToggleFAB mobilistenToggleFAB14 = (MobilistenToggleFAB) pVar.f57455x;
                        MobilistenToggleFAB mobilistenToggleFAB15 = (MobilistenToggleFAB) pVar.f57454w;
                        Lazy lazy6 = (Lazy) pVar.f57453v;
                        ud.p pVar10 = (ud.p) pVar.f57452u;
                        Ref.ObjectRef objectRef15 = (Ref.ObjectRef) pVar.f57451t;
                        j jVar10 = (j) pVar.f57450s;
                        b bVar11 = (b) pVar.f57449r;
                        objectRef5 = (Ref.ObjectRef) pVar.f57448q;
                        booleanRef3 = (Ref.BooleanRef) pVar.f57447p;
                        Ref.BooleanRef booleanRef12 = (Ref.BooleanRef) pVar.f57446o;
                        Activity activity8 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        activity3 = activity8;
                        jVar3 = jVar10;
                        i11 = i35;
                        booleanRef = booleanRef12;
                        mobilistenToggleFAB3 = mobilistenToggleFAB13;
                        mobilistenToggleFAB = mobilistenToggleFAB14;
                        i12 = i34;
                        bVar = bVar11;
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        z22 = z58;
                        str3 = "LauncherLogs ";
                        lazy = lazy6;
                        obj2 = coroutine_suspended;
                        z18 = z57;
                        objectRef = objectRef15;
                        mobilistenToggleFAB2 = mobilistenToggleFAB15;
                        str2 = " new ";
                        f11 = f22;
                        z24 = z56;
                        pVar2 = pVar10;
                        if (((Boolean) obj8).booleanValue()) {
                        }
                        break;
                    case 3:
                        boolean z59 = pVar.f57437E;
                        int i36 = pVar.f57442J;
                        int i37 = pVar.f57441I;
                        int i38 = pVar.f57440H;
                        boolean z60 = pVar.f57436D;
                        int i39 = pVar.f57439G;
                        float f23 = pVar.f57438F;
                        boolean z61 = pVar.f57435C;
                        boolean z62 = pVar.f57434B;
                        boolean z63 = pVar.f57433A;
                        boolean z64 = pVar.f57457z;
                        MobilistenToggleFAB mobilistenToggleFAB16 = (MobilistenToggleFAB) pVar.f57455x;
                        MobilistenToggleFAB mobilistenToggleFAB17 = (MobilistenToggleFAB) pVar.f57454w;
                        ud.p pVar11 = (ud.p) pVar.f57452u;
                        Ref.ObjectRef objectRef16 = (Ref.ObjectRef) pVar.f57451t;
                        j jVar11 = (j) pVar.f57450s;
                        b bVar12 = (b) pVar.f57449r;
                        Ref.ObjectRef objectRef17 = (Ref.ObjectRef) pVar.f57448q;
                        Ref.BooleanRef booleanRef13 = (Ref.BooleanRef) pVar.f57447p;
                        Ref.BooleanRef booleanRef14 = (Ref.BooleanRef) pVar.f57446o;
                        Activity activity9 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        mobilistenToggleFAB6 = mobilistenToggleFAB16;
                        z32 = z62;
                        bVar = bVar12;
                        i16 = i39;
                        mobilistenToggleFAB7 = mobilistenToggleFAB17;
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        z31 = z63;
                        z30 = z61;
                        activity5 = activity9;
                        z35 = z59;
                        obj4 = coroutine_suspended;
                        i15 = i37;
                        objectRef6 = objectRef17;
                        z33 = z64;
                        f13 = f23;
                        objectRef7 = objectRef16;
                        i14 = i38;
                        booleanRef2 = booleanRef13;
                        z34 = z60;
                        jVar4 = jVar11;
                        str3 = "LauncherLogs ";
                        pVar4 = pVar11;
                        str2 = " new ";
                        i17 = i36;
                        booleanRef5 = booleanRef14;
                        mobilistenToggleFAB6.setFabsVisibility(new MobilistenToggleFAB.a(i14 == 0, z34, i16 == 0, i15 == 0, z35, i17 == 0, ((Boolean) obj8).booleanValue(), jVar4.k0(), !LiveChatUtil.isMultipleChatsDisabled(), false, f57317f, !z32 ? MobilistenToggleFAB.c.End : MobilistenToggleFAB.c.Start, !z30 ? MobilistenToggleFAB.e.Bottom : MobilistenToggleFAB.e.Top, false, 8192, null));
                        mobilistenToggleFAB7.setElevation(og.k.d(6));
                        mobilistenToggleFAB7.setScrimView(pVar4.f66348d);
                        pVar4.f66348d.setOnClickListener(new View.OnClickListener() { // from class: ne.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                j.J0(p.this, view);
                            }
                        });
                        mobilistenToggleFAB7.setOnChatClickListener(new View.OnClickListener() { // from class: ne.d
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                j.K0(j.this, mobilistenToggleFAB7, bVar, pVar4, view);
                            }
                        });
                        mobilistenToggleFAB7.setOnCallClickListener(new View.OnClickListener() { // from class: ne.e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                j.L0(j.this, mobilistenToggleFAB7, objectRef7, activity5, pVar4, bVar, view);
                            }
                        });
                        if (rd.b.h(activity5) == null) {
                        }
                        pVar.f57445n = activity5;
                        pVar.f57446o = booleanRef5;
                        pVar.f57447p = booleanRef2;
                        pVar.f57448q = objectRef6;
                        pVar.f57449r = bVar;
                        pVar.f57450s = jVar4;
                        pVar.f57451t = objectRef7;
                        pVar.f57452u = pVar4;
                        pVar.f57453v = null;
                        pVar.f57454w = null;
                        pVar.f57455x = null;
                        pVar.f57457z = z33;
                        pVar.f57433A = z31;
                        boolean z512 = z32;
                        pVar.f57434B = z512;
                        pVar.f57435C = z30;
                        float f192 = f13;
                        pVar.f57438F = f192;
                        pVar.f57444L = 4;
                        b02 = jVar4.b0(bVar, pVar);
                        obj5 = obj4;
                        if (b02 != obj5) {
                        }
                        break;
                    case 4:
                        float f24 = pVar.f57438F;
                        boolean z65 = pVar.f57435C;
                        z36 = pVar.f57434B;
                        z38 = pVar.f57433A;
                        boolean z66 = pVar.f57457z;
                        ud.p pVar12 = (ud.p) pVar.f57452u;
                        Ref.ObjectRef objectRef18 = (Ref.ObjectRef) pVar.f57451t;
                        j jVar12 = (j) pVar.f57450s;
                        b bVar13 = (b) pVar.f57449r;
                        Ref.ObjectRef objectRef19 = (Ref.ObjectRef) pVar.f57448q;
                        Ref.BooleanRef booleanRef15 = (Ref.BooleanRef) pVar.f57447p;
                        Ref.BooleanRef booleanRef16 = (Ref.BooleanRef) pVar.f57446o;
                        Activity activity10 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        str2 = " new ";
                        objectRef9 = objectRef18;
                        jVar5 = jVar12;
                        str3 = "LauncherLogs ";
                        objectRef8 = objectRef19;
                        bVar = bVar13;
                        activity5 = activity10;
                        z30 = z65;
                        pVar4 = pVar12;
                        f14 = f24;
                        booleanRef6 = booleanRef16;
                        obj5 = coroutine_suspended;
                        z37 = z66;
                        booleanRef7 = booleanRef15;
                        boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                        z39 = z37;
                        if (booleanRef7.element) {
                            z40 = false;
                            booleanRef7.element = z40;
                            if (z39) {
                            }
                            if (jVar5.f0()) {
                            }
                            i19 = i18;
                            z41 = z36;
                            z42 = z38;
                            obj6 = obj5;
                            pVar5 = pVar4;
                            if (!z39) {
                            }
                            Result.Companion companion6222 = Result.INSTANCE;
                            languageOrNull = LiveChatUtil.getLanguageOrNull();
                            if (languageOrNull == null) {
                            }
                            objectRef9.element = AbstractC5892d.a((Context) objectRef9.element, new Locale(languageOrNull));
                            Object m147constructorimpl5222 = Result.m147constructorimpl(Unit.INSTANCE);
                            m150exceptionOrNullimpl3 = Result.m150exceptionOrNullimpl(m147constructorimpl5222);
                            if (m150exceptionOrNullimpl3 != null) {
                            }
                            f15 = bVar.f();
                            if (f15 != null) {
                            }
                            i20 = f57324m;
                            Ref.FloatRef floatRef22222 = new Ref.FloatRef();
                            Result.Companion companion322222 = Result.INSTANCE;
                            floatRef22222.element = C6218a.x();
                            m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                            if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                            }
                            cVar = f57317f;
                            if (cVar != null) {
                            }
                            int i3322222 = i19;
                            obj7 = obj6;
                            pVar6 = pVar5;
                            if (i20 == -1) {
                            }
                            i21 = i3322222;
                            bVar3 = bVar;
                            i22 = 0;
                            i23 = 0;
                            if (jVar5.e0()) {
                            }
                            n10 = bVar3.n();
                            if (n10 != null) {
                            }
                            n11 = bVar3.n();
                            if (n11 != null) {
                            }
                            f57322k = true;
                            if (i21 != 0) {
                            }
                        }
                        z40 = true;
                        booleanRef7.element = z40;
                        if (z39) {
                        }
                        if (jVar5.f0()) {
                        }
                        i19 = i18;
                        z41 = z36;
                        z42 = z38;
                        obj6 = obj5;
                        pVar5 = pVar4;
                        if (!z39) {
                        }
                        Result.Companion companion62222 = Result.INSTANCE;
                        languageOrNull = LiveChatUtil.getLanguageOrNull();
                        if (languageOrNull == null) {
                        }
                        objectRef9.element = AbstractC5892d.a((Context) objectRef9.element, new Locale(languageOrNull));
                        Object m147constructorimpl52222 = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl3 = Result.m150exceptionOrNullimpl(m147constructorimpl52222);
                        if (m150exceptionOrNullimpl3 != null) {
                        }
                        f15 = bVar.f();
                        if (f15 != null) {
                        }
                        i20 = f57324m;
                        Ref.FloatRef floatRef222222 = new Ref.FloatRef();
                        Result.Companion companion3222222 = Result.INSTANCE;
                        floatRef222222.element = C6218a.x();
                        m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                        }
                        cVar = f57317f;
                        if (cVar != null) {
                        }
                        int i33222222 = i19;
                        obj7 = obj6;
                        pVar6 = pVar5;
                        if (i20 == -1) {
                        }
                        i21 = i33222222;
                        bVar3 = bVar;
                        i22 = 0;
                        i23 = 0;
                        if (jVar5.e0()) {
                        }
                        n10 = bVar3.n();
                        if (n10 != null) {
                        }
                        n11 = bVar3.n();
                        if (n11 != null) {
                        }
                        f57322k = true;
                        if (i21 != 0) {
                        }
                        break;
                    case 5:
                        i24 = pVar.f57440H;
                        i25 = pVar.f57439G;
                        z43 = pVar.f57457z;
                        num = (Integer) pVar.f57451t;
                        pVar7 = (ud.p) pVar.f57450s;
                        jVar5 = (j) pVar.f57449r;
                        bVar4 = (b) pVar.f57448q;
                        objectRef10 = (Ref.ObjectRef) pVar.f57447p;
                        booleanRef7 = (Ref.BooleanRef) pVar.f57446o;
                        activity6 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        str2 = " new ";
                        str3 = "LauncherLogs ";
                        obj7 = coroutine_suspended;
                        i23 = num.intValue();
                        i22 = i24;
                        i21 = i25;
                        bVar3 = bVar4;
                        objectRef8 = objectRef10;
                        pVar6 = pVar7;
                        z30 = z43;
                        activity5 = activity6;
                        if (jVar5.e0()) {
                        }
                        n10 = bVar3.n();
                        if (n10 != null) {
                        }
                        n11 = bVar3.n();
                        if (n11 != null) {
                        }
                        f57322k = true;
                        if (i21 != 0) {
                        }
                        break;
                    case 6:
                        j jVar13 = (j) pVar.f57448q;
                        bVar3 = (b) pVar.f57447p;
                        objectRef11 = (Ref.ObjectRef) pVar.f57446o;
                        Activity activity11 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        jVar5 = jVar13;
                        activity5 = activity11;
                        str4 = "LauncherLogs ";
                        obj7 = coroutine_suspended;
                        WindowManager windowManager42 = f57320i;
                        ud.o a172 = bVar3.a();
                        jVar5.C(windowManager42, a172 == null ? a172.b() : null, bVar3.n());
                        StringBuilder sb52 = new StringBuilder();
                        sb52.append("LauncherLogs | Added baseFabAlias: ");
                        ud.o a182 = bVar3.a();
                        if (a182 != null) {
                            break;
                        }
                        sb52.append((a182 != null || (b12 = a182.b()) == null) ? null : Boxing.boxInt(b12.hashCode()));
                        sb52.append(' ');
                        sb52.append(activity5.getClass().getCanonicalName());
                        sb52.append(' ');
                        sb52.append(activity5.hashCode());
                        LiveChatUtil.log(sb52.toString());
                        pVar.f57445n = activity5;
                        pVar.f57446o = objectRef11;
                        pVar.f57447p = bVar3;
                        pVar.f57448q = jVar5;
                        pVar.f57444L = 7;
                        if (AbstractC1440a0.a(10L, pVar) != obj7) {
                        }
                        break;
                    case 7:
                        j jVar14 = (j) pVar.f57448q;
                        b bVar14 = (b) pVar.f57447p;
                        objectRef11 = (Ref.ObjectRef) pVar.f57446o;
                        Activity activity12 = (Activity) pVar.f57445n;
                        ResultKt.throwOnFailure(obj8);
                        activity5 = activity12;
                        obj7 = coroutine_suspended;
                        bVar5 = bVar14;
                        jVar6 = jVar14;
                        str4 = "LauncherLogs ";
                        WindowManager windowManager52 = f57320i;
                        ud.d l112 = bVar5.l();
                        if (l112 == null) {
                        }
                        WindowManager.LayoutParams layoutParams62 = new WindowManager.LayoutParams(-1, -2, 2, 262952, -2);
                        layoutParams62.height = f57326o;
                        Unit unit92 = Unit.INSTANCE;
                        jVar6.C(windowManager52, b18, layoutParams62);
                        list = (List) objectRef11.element;
                        if (list != null) {
                        }
                        jVar5 = jVar6;
                        bVar3 = bVar5;
                        salesIQFloatingActionButton = null;
                        rd.b.a(activity5, bVar3.k());
                        f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                        a10 = bVar3.a();
                        if (a10 != null) {
                        }
                        ud.p b172222 = bVar3.b();
                        if (b172222 != null) {
                        }
                        Intrinsics.checkNotNull(baseFab);
                        jVar5.Z(activity5, baseFab);
                        Object m147constructorimpl42222222 = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl42222222);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                        List list4 = (List) pVar.f57448q;
                        jVar6 = (j) pVar.f57447p;
                        bVar5 = (b) pVar.f57446o;
                        activity7 = (Activity) pVar.f57445n;
                        try {
                            ResultKt.throwOnFailure(obj8);
                            list = list4;
                            str4 = "LauncherLogs ";
                            while (r0.hasNext()) {
                            }
                            m147constructorimpl3 = Result.m147constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th5) {
                            th = th5;
                            Result.Companion companion52 = Result.INSTANCE;
                            m147constructorimpl3 = Result.m147constructorimpl(ResultKt.createFailure(th));
                            if (Result.m150exceptionOrNullimpl(m147constructorimpl3) != null) {
                            }
                            Result.m146boximpl(m147constructorimpl3);
                            activity5 = activity7;
                            jVar5 = jVar6;
                            bVar3 = bVar5;
                            salesIQFloatingActionButton = null;
                            rd.b.a(activity5, bVar3.k());
                            f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                            a10 = bVar3.a();
                            if (a10 != null) {
                            }
                            ud.p b1722222 = bVar3.b();
                            if (b1722222 != null) {
                            }
                            Intrinsics.checkNotNull(baseFab);
                            jVar5.Z(activity5, baseFab);
                            Object m147constructorimpl422222222 = Result.m147constructorimpl(Unit.INSTANCE);
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl422222222);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl3) != null) {
                        }
                        Result.m146boximpl(m147constructorimpl3);
                        activity5 = activity7;
                        jVar5 = jVar6;
                        bVar3 = bVar5;
                        salesIQFloatingActionButton = null;
                        rd.b.a(activity5, bVar3.k());
                        f57321j.put(Boxing.boxInt(activity5.hashCode()), bVar3);
                        a10 = bVar3.a();
                        if (a10 != null) {
                        }
                        ud.p b17222222 = bVar3.b();
                        if (b17222222 != null) {
                        }
                        Intrinsics.checkNotNull(baseFab);
                        jVar5.Z(activity5, baseFab);
                        Object m147constructorimpl4222222222 = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl4222222222);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        pVar = new p(continuation);
        Object obj82 = pVar.f57443K;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (pVar.f57444L) {
        }
    }

    public static final void F(nd.c launcherProperties, boolean z10) {
        Intrinsics.checkNotNullParameter(launcherProperties, "launcherProperties");
        if (z10) {
            f57318g = launcherProperties;
        }
        f57317f = launcherProperties;
        SharedPreferences M10 = C6218a.M();
        if (M10 != null) {
            SharedPreferences.Editor edit = M10.edit();
            if (launcherProperties.e() != C6218a.w() && launcherProperties.e() != C6218a.w()) {
                j jVar = f57312a;
                Intrinsics.checkNotNull(edit);
                jVar.K(edit);
            }
            Integer f10 = launcherProperties.f();
            if (f10 != null) {
                edit.putBoolean("launcher_in_right_side", f10.intValue() >= f57324m / 2);
            }
            Integer g10 = launcherProperties.g();
            if (g10 != null) {
                int intValue = g10.intValue();
                edit.putFloat("launcher_y_in_points", ((intValue < 0 || intValue > f57326o) ? 0.0f : intValue) / f57326o);
                edit.putBoolean("is_launcher_in_bottom_side", !f57312a.m0(intValue));
            }
            Boolean h10 = launcherProperties.h();
            if (h10 != null) {
                edit.putBoolean("launcher_in_right_side", h10.booleanValue());
            }
            edit.putInt("launcher_mode", launcherProperties.e());
            edit.apply();
        }
        j jVar2 = f57312a;
        if (jVar2.Q() == null || !c0(jVar2.Q())) {
            return;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable());
        Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LauncherLogs applyLauncherProperties ");
        Activity Q10 = jVar2.Q();
        sb2.append(Q10 != null ? Q10.getClass().getCanonicalName() : null);
        sb2.append(", hashCode: ");
        Activity Q11 = jVar2.Q();
        sb2.append(Q11 != null ? Integer.valueOf(Q11.hashCode()) : null);
        sb2.append("\n\n");
        sb2.append(stackTraceString);
        LiveChatUtil.log(sb2.toString());
        jVar2.n0(new e(stackTraceString, null));
    }

    public static /* synthetic */ Object F0(Activity activity, boolean z10, boolean z11, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = c0(activity);
        }
        return E0(activity, z10, z11, continuation);
    }

    public static /* synthetic */ void G(nd.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        F(cVar, z10);
    }

    public static final void G0(ud.p binding, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        MobilistenToggleFAB mobilistenToggleFAB = binding.f66346b;
        ConstraintLayout b10 = binding.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        mobilistenToggleFAB.W0(b10);
    }

    public static final ArrayList H0(Lazy lazy) {
        return (ArrayList) lazy.getValue();
    }

    public static final void I(Activity activity) {
        if (activity == null) {
            Iterator it = f57321j.entrySet().iterator();
            while (it.hasNext()) {
                f57312a.H((b) ((Map.Entry) it.next()).getValue());
            }
            return;
        }
        b bVar = (b) f57321j.get(Integer.valueOf(activity.hashCode()));
        if (bVar != null) {
            f57312a.H(bVar);
        }
    }

    public static final ArrayList I0(Lazy lazy) {
        return (ArrayList) lazy.getValue();
    }

    public static /* synthetic */ void J(Activity activity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            activity = null;
        }
        I(activity);
    }

    public static final void J0(ud.p binding, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        binding.f66346b.G0(true, new t(binding));
    }

    public static final void K0(j this_runCatching, MobilistenToggleFAB this_apply, b launcherView, ud.p binding, View view) {
        Intrinsics.checkNotNullParameter(this_runCatching, "$this_runCatching");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(launcherView, "$launcherView");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        LiveChatUtil.openChat(this_runCatching.Q(), null, false, true, Tf.b.h(Rf.a.Clicked, null, 2, null) || UTSUtil.shouldWaitForWidgetInteractionTrigger(), true, null, new u(launcherView, binding), null);
        this_apply.G0(false, this_runCatching.new v(binding));
    }

    public static final void L(boolean z10) {
        AbstractC1459k.d(f57312a.P(), null, null, new g(z10, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L0(j this_runCatching, MobilistenToggleFAB this_apply, Ref.ObjectRef themedContext, Activity activity, ud.p binding, b launcherView, View view) {
        Intrinsics.checkNotNullParameter(this_runCatching, "$this_runCatching");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(themedContext, "$themedContext");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(launcherView, "$launcherView");
        if (!Td.e.m0()) {
            if (this_runCatching.h0() || this_runCatching.k0()) {
                Ye.a.m(activity, null, false, true, false, false, null, (r19 & 128) != 0 ? null : null, null);
                return;
            } else {
                AbstractC1459k.d(this_runCatching.N(), null, null, new w(binding, this_runCatching, launcherView, this_apply, null), 3, null);
                return;
            }
        }
        if (!this_runCatching.h0() && !this_runCatching.k0()) {
            Td.e.r0((Context) themedContext.element);
            return;
        }
        Context context = this_apply.getContext();
        Intent intent = new Intent(this_apply.getContext(), (Class<?>) SalesIQActivity.class);
        intent.putExtra("open_call_screen", true);
        context.startActivity(intent);
    }

    public static final void M0(ZohoSalesIQ.h.a mode, boolean z10) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Ge.h.c(Ye.d.r(De.a.LauncherVisibilityMode, mode.name()), false, 1, null);
        if (mode != ZohoSalesIQ.h.a.NEVER) {
            Q.f44447F.J(false);
        }
        if (z10) {
            return;
        }
        s0(false, 1, null);
    }

    public static final void N0(boolean z10) {
        P0(z10, null, 2, null);
    }

    public static final void O0(boolean z10, Function0 function0) {
        SalesIQListener listener = ZohoLiveChat.getListener();
        if (listener != null) {
            Boolean bool = f57332u;
            Unit unit = null;
            if (bool == null || !Intrinsics.areEqual(bool, Boolean.valueOf(z10))) {
                AbstractC1459k.d(f57312a.P(), null, null, new A(listener, z10, function0, null), 3, null);
                f57332u = Boolean.valueOf(z10);
                unit = Unit.INSTANCE;
            } else if (function0 != null) {
                function0.invoke();
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        if (function0 != null) {
            function0.invoke();
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void P0(boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        O0(z10, function0);
    }

    public static final ZohoSalesIQ.h.a S() {
        ZohoSalesIQ.h.a aVar;
        ZohoSalesIQ.h.a[] values = ZohoSalesIQ.h.a.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i10];
            if (Intrinsics.areEqual(aVar.name(), Ye.d.l(De.a.CustomLauncherVisibilityMode, ZohoSalesIQ.h.a.NEVER.name()))) {
                break;
            }
            i10++;
        }
        return aVar == null ? ZohoSalesIQ.h.a.NEVER : aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r0.isEmpty() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void S0() {
        boolean isEmbedAllowed = LiveChatUtil.isEmbedAllowed();
        boolean z10 = true;
        boolean z11 = f57314c && isEmbedAllowed && !LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline();
        if (!LiveChatUtil.isSupportedVersion() || !isEmbedAllowed || !LiveChatUtil.isAppEnabled()) {
            z11 = false;
        }
        boolean z12 = (!isEmbedAllowed || LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline() || !com.zoho.livechat.android.modules.brand.ui.helpers.a.M() || MobilistenUtil.j() || Q.y()) ? false : true;
        boolean z13 = (LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline() || !com.zoho.livechat.android.modules.brand.ui.helpers.a.L() || MobilistenUtil.j() || Q.y()) ? false : true;
        if (z11) {
            if (z12 || z13) {
                int i10 = c.$EnumSwitchMapping$0[S().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                        Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
                    }
                }
                z12 = z10;
            }
            z10 = false;
            z12 = z10;
        }
        if (f57314c) {
            P0(z12, null, 2, null);
        }
    }

    public static final nd.c T() {
        return f57317f;
    }

    public static final ZohoSalesIQ.h.a V() {
        ZohoSalesIQ.h.a aVar;
        ZohoSalesIQ.h.a[] values = ZohoSalesIQ.h.a.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i10];
            if (Intrinsics.areEqual(aVar.name(), Ye.d.l(De.a.LauncherVisibilityMode, ZohoSalesIQ.h.a.NEVER.name()))) {
                break;
            }
            i10++;
        }
        return aVar == null ? ZohoSalesIQ.h.a.NEVER : aVar;
    }

    public static final long W() {
        return f57319h;
    }

    public static final void Y() {
        ud.p b10;
        MobilistenToggleFAB mobilistenToggleFAB;
        Window window;
        View decorView;
        Activity n10 = Uf.j.n();
        View rootView = (n10 == null || (window = n10.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        if (rootView == null) {
            return;
        }
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        int i10 = height - rect.bottom;
        if (i10 <= height * 0.15d) {
            f57329r = false;
            if (!c0(n10) || f57322k) {
                return;
            }
            s0(false, 1, null);
            return;
        }
        nd.c cVar = f57317f;
        if (cVar == null || cVar.e() != 1) {
            nd.c cVar2 = f57317f;
            if (cVar2 == null || cVar2.e() != 2) {
                return;
            }
            float x10 = C6218a.x() * height;
            b R10 = f57312a.R();
            if (x10 + (((R10 == null || (b10 = R10.b()) == null || (mobilistenToggleFAB = b10.f66346b) == null) ? 0.0f : mobilistenToggleFAB.getMeasuredHeight()) / 2) >= i10) {
                return;
            }
        }
        t0(n10);
        f57329r = true;
    }

    public static final void a0(View view) {
        Object m147constructorimpl;
        j jVar = f57312a;
        try {
            Result.Companion companion = Result.INSTANCE;
            LiveChatUtil.openChat(jVar.Q(), false, true, UTSUtil.shouldWaitForWidgetInteractionTrigger(), true);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c0(Activity activity) {
        boolean z10;
        boolean z11;
        boolean z12;
        Hashtable s10;
        if (!Uf.j.f12224n) {
            return false;
        }
        if (Q.p()) {
            z10 = false;
            z11 = false;
        } else {
            if (C6218a.M() != null) {
                j jVar = f57312a;
                if (!jVar.l0() && !(activity instanceof Yf.c) && ((activity == null || !Ag.c.b(activity)) && !f57329r)) {
                    z10 = jVar.d0();
                    z11 = true;
                }
            }
            z10 = false;
            z11 = true;
        }
        if (!z11 && (!LiveChatUtil.isSupportedVersion() || !LiveChatUtil.isEmbedAllowed() || !LiveChatUtil.isAppEnabled())) {
            z10 = false;
            z11 = true;
        }
        if (!z11) {
            if ((activity instanceof Yf.c) || ((activity != null && Ag.c.b(activity)) || f57329r || LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline() || (!(com.zoho.livechat.android.modules.brand.ui.helpers.a.M() || com.zoho.livechat.android.modules.brand.ui.helpers.a.L()) || MobilistenUtil.j() || Q.y()))) {
                z10 = false;
            } else {
                Uf.j applicationManager = ZohoLiveChat.getApplicationManager();
                Map map = (applicationManager == null || (s10 = applicationManager.s()) == null) ? null : (Hashtable) s10.get(EnumC5876b.CHAT);
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                if (map.containsKey(activity != null ? activity.getClass().getCanonicalName() : null)) {
                    z10 = og.i.i((Boolean) map.get(activity != null ? activity.getClass().getCanonicalName() : null));
                } else {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return z10;
        }
        if (!Q.f44447F.A()) {
            int i10 = c.$EnumSwitchMapping$0[V().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    z12 = f57312a.d0();
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                    Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
                    if (allOpenChatIds.isEmpty()) {
                        z12 = false;
                    }
                }
                if (!z12) {
                    return true;
                }
            }
            z12 = true;
            if (!z12) {
            }
        }
        return false;
    }

    public static final boolean j0() {
        return Ye.d.e(De.a.EnableDragDismissing, false);
    }

    public static final void p0() {
        nd.c cVar = f57317f;
        if (cVar != null) {
            G(cVar, false, 2, null);
        }
    }

    public static final void q0() {
        s0(false, 1, null);
    }

    public static final void r0(boolean z10) {
        j jVar = f57312a;
        jVar.n0(new k(jVar.Q(), z10, !Uf.j.z(), null));
    }

    public static /* synthetic */ void s0(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        r0(z10);
    }

    public static final void t0(Activity activity) {
        String stackTraceString = Log.getStackTraceString(new Throwable());
        Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
        f57312a.n0(new l(activity, stackTraceString, null));
    }

    public static /* synthetic */ void v0(j jVar, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        jVar.u0(activity, str);
    }

    public static final void x0(boolean z10) {
        f57329r = z10;
    }

    public static final void y0(Drawable drawable) {
        if (f57317f == null) {
            s0(false, 1, null);
        } else {
            f57312a.n0(new m(drawable, null));
        }
    }

    public static final void z0(long j10) {
        f57319h = j10;
    }

    public final Object A0(b bVar, Continuation continuation) {
        return AbstractC1455i.g(C1452g0.b(), new n(bVar, null), continuation);
    }

    public final int B(int i10) {
        return i10 + C6218a.G();
    }

    public final void C(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        Object m147constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (windowManager != null) {
                windowManager.addView(view, layoutParams);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m147constructorimpl = Result.m147constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public final void D(boolean z10, boolean z11, boolean z12) {
        AbstractC1459k.d(P(), null, null, new d(z12, z10, z11, null), 3, null);
    }

    public final void H(b bVar) {
        Unit unit;
        Unit unit2;
        try {
            Result.Companion companion = Result.INSTANCE;
            WindowManager windowManager = f57320i;
            if (windowManager != null) {
                windowManager.removeViewImmediate(bVar.c());
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            Result.m147constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        bVar.q(null);
        bVar.u(null);
        try {
            WindowManager windowManager2 = f57320i;
            if (windowManager2 != null) {
                windowManager2.removeViewImmediate(bVar.e());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m147constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th3));
        }
        bVar.s(null);
        bVar.r(null);
    }

    public final void K(SharedPreferences.Editor editor) {
        editor.remove("launcher_x");
        editor.remove("launcher_y");
        editor.remove("launcher_y_in_points");
        editor.remove("launcher_in_right_side");
    }

    public final nd.c M() {
        return f57318g;
    }

    public final P N() {
        return C6461a.f65810a.e();
    }

    public final Application O() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final P P() {
        return C6461a.f65810a.d();
    }

    public final Activity Q() {
        return Uf.j.n();
    }

    public final b R() {
        if (Q() == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f57321j;
        Activity Q10 = f57312a.Q();
        return (b) concurrentHashMap.get(Integer.valueOf(Q10 != null ? Q10.hashCode() : 0));
    }

    public final void R0(b bVar) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            unit = null;
            if (!Uf.j.z()) {
                int coerceAtMost = RangesKt.coerceAtMost(3, Uf.j.f12229s.size());
                ArrayList activityHashCodes = Uf.j.f12229s;
                Intrinsics.checkNotNullExpressionValue(activityHashCodes, "activityHashCodes");
                Iterator it = CollectionsKt.reversed(activityHashCodes).subList(0, coerceAtMost).iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) f57321j.get((Integer) it.next());
                    if (bVar2 != null && bVar2.k() != null) {
                        if (f57312a.e0()) {
                            WindowManager windowManager = f57320i;
                            if (windowManager != null) {
                                windowManager.updateViewLayout(bVar.k(), bVar.i());
                            }
                            WindowManager windowManager2 = f57320i;
                            if (windowManager2 != null) {
                                ud.o a10 = bVar.a();
                                windowManager2.updateViewLayout(a10 != null ? a10.b() : null, bVar.n());
                            }
                        } else {
                            WindowManager windowManager3 = f57320i;
                            if (windowManager3 != null) {
                                windowManager3.updateViewLayout(bVar.k(), bVar.n());
                            }
                        }
                    }
                }
                unit = Unit.INSTANCE;
            } else if (f57312a.e0()) {
                WindowManager windowManager4 = f57320i;
                if (windowManager4 != null) {
                    windowManager4.updateViewLayout(bVar.k(), bVar.i());
                }
                WindowManager windowManager5 = f57320i;
                if (windowManager5 != null) {
                    ud.o a11 = bVar.a();
                    windowManager5.updateViewLayout(a11 != null ? a11.b() : null, bVar.n());
                    unit = Unit.INSTANCE;
                }
            } else {
                WindowManager windowManager6 = f57320i;
                if (windowManager6 != null) {
                    windowManager6.updateViewLayout(bVar.k(), bVar.n());
                    unit = Unit.INSTANCE;
                }
            }
            m147constructorimpl = Result.m147constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public final float U() {
        return X().getResources().getDimension(od.o.f59939f);
    }

    public final Context X() {
        Context Q10 = Q();
        if (Q10 == null) {
            Q10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(Q10);
        }
        return new androidx.appcompat.view.d(Q10, ZohoSalesIQ.getStyleForCurrentThemeMode());
    }

    public final void Z(Activity activity, View view) {
        ViewGroup k10;
        nd.c cVar;
        if (activity != null) {
            b bVar = (b) f57321j.get(Integer.valueOf(activity.hashCode()));
            if ((bVar != null ? bVar.k() : null) == null || (cVar = f57317f) == null || cVar.e() != 2) {
                if (bVar == null || (k10 = bVar.k()) == null) {
                    return;
                }
                k10.setOnClickListener(new View.OnClickListener() { // from class: ne.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        j.a0(view2);
                    }
                });
                return;
            }
            f57323l = new GestureDetector(activity, new h());
            f57330s = true;
            View h10 = bVar.h();
            Intrinsics.checkNotNull(h10);
            h10.setOnClickListener(null);
            ViewOnTouchListenerC5700a j10 = bVar.j();
            if (j10 == null) {
                j10 = new ViewOnTouchListenerC5700a();
                ViewOnTouchListenerC5700a.C0833a c0833a = ViewOnTouchListenerC5700a.f57337k;
                WindowManager.LayoutParams n10 = bVar.n();
                c0833a.a(og.i.m(n10 != null ? Integer.valueOf(n10.x) : null));
                WindowManager.LayoutParams n11 = bVar.n();
                c0833a.b(og.i.m(n11 != null ? Integer.valueOf(n11.y) : null));
                LiveChatUtil.log("Launcher new onTouch");
                bVar.x(j10);
                f57321j.put(Integer.valueOf(activity.hashCode()), bVar);
            }
            f57321j.put(Integer.valueOf(activity.hashCode()), bVar);
            view.setOnTouchListener(j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(b bVar, Continuation continuation) {
        i iVar;
        j jVar;
        int i10;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Context context;
        b bVar2 = bVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f57402s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f57402s = i11 - Integer.MIN_VALUE;
                jVar = this;
                Object obj = iVar.f57400q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar.f57402s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    booleanRef = new Ref.BooleanRef();
                    if (j0() && !Q.f44447F.A() && bVar2 != null) {
                        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(jVar.O(), ZohoSalesIQ.getStyleForCurrentThemeMode());
                        if (bVar2.e() == null) {
                            booleanRef.element = true;
                            bVar2.r(new WindowManager.LayoutParams());
                            bVar2.s(LayoutInflater.from(dVar).inflate(od.r.f60812u, (ViewGroup) null));
                            View e10 = bVar2.e();
                            Intrinsics.checkNotNull(e10);
                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                            j jVar2 = f57312a;
                            og.p.b(e10, orientation, AbstractC5892d.i(jVar2.O(), od.n.f59928h), AbstractC5892d.i(jVar2.O(), od.n.f59929i));
                            WindowManager.LayoutParams d10 = bVar2.d();
                            if (d10 != null) {
                                d10.type = 2;
                            }
                            WindowManager.LayoutParams d11 = bVar2.d();
                            if (d11 != null) {
                                d11.flags = 40;
                            }
                            WindowManager.LayoutParams d12 = bVar2.d();
                            if (d12 != null) {
                                d12.format = -3;
                            }
                            WindowManager.LayoutParams d13 = bVar2.d();
                            if (d13 != null) {
                                d13.width = -1;
                            }
                            WindowManager.LayoutParams d14 = bVar2.d();
                            if (d14 != null) {
                                d14.height = (int) jVar2.O().getResources().getDimension(od.o.f59934a);
                            }
                            WindowManager.LayoutParams d15 = bVar2.d();
                            if (d15 != null) {
                                d15.gravity = 80;
                            }
                            WindowManager windowManager = f57320i;
                            if (windowManager != null) {
                                jVar2.C(windowManager, bVar2.e(), bVar2.d());
                            }
                        }
                        iVar.f57397n = booleanRef;
                        iVar.f57398o = dVar;
                        iVar.f57399p = bVar2;
                        iVar.f57402s = 1;
                        if (AbstractC1440a0.a(10L, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef2 = booleanRef;
                        context = dVar;
                    }
                    return Boxing.boxBoolean(booleanRef.element);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (b) iVar.f57399p;
                context = (Context) iVar.f57398o;
                booleanRef2 = (Ref.BooleanRef) iVar.f57397n;
                ResultKt.throwOnFailure(obj);
                if (bVar2.c() == null) {
                    booleanRef2.element = true;
                    bVar2.q(LayoutInflater.from(context).inflate(od.r.f60814v, (ViewGroup) null));
                    View c10 = bVar2.c();
                    Intrinsics.checkNotNull(c10);
                    bVar2.t((TextView) c10.findViewById(od.q.f60566k));
                    bVar2.u(new WindowManager.LayoutParams());
                    WindowManager.LayoutParams g10 = bVar2.g();
                    if (g10 != null) {
                        g10.gravity = 81;
                    }
                    WindowManager.LayoutParams g11 = bVar2.g();
                    if (g11 != null) {
                        g11.type = 2;
                    }
                    WindowManager.LayoutParams g12 = bVar2.g();
                    if (g12 != null) {
                        g12.flags = 40;
                    }
                    WindowManager.LayoutParams g13 = bVar2.g();
                    if (g13 != null) {
                        g13.format = -3;
                    }
                    WindowManager.LayoutParams g14 = bVar2.g();
                    if (g14 != null) {
                        g14.width = -2;
                    }
                    WindowManager.LayoutParams g15 = bVar2.g();
                    if (g15 != null) {
                        g15.height = -2;
                    }
                    WindowManager windowManager2 = f57320i;
                    if (windowManager2 != null) {
                        f57312a.C(windowManager2, bVar2.c(), bVar2.g());
                    }
                    View c11 = bVar2.c();
                    if (c11 != null) {
                        c11.setPadding(0, 0, 0, f57315d);
                    }
                }
                booleanRef = booleanRef2;
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        jVar = this;
        iVar = jVar.new i(continuation);
        Object obj2 = iVar.f57400q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar.f57402s;
        if (i10 != 0) {
        }
        if (bVar2.c() == null) {
        }
        booleanRef = booleanRef2;
        return Boxing.boxBoolean(booleanRef.element);
    }

    public final boolean d0() {
        return LiveChatUtil.canShowLauncher() && LiveChatUtil.isEmbedAllowed() && !LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline();
    }

    public final boolean e0() {
        return f0() && g0() && !h0();
    }

    public final boolean f0() {
        return com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
    }

    public final boolean g0() {
        return com.zoho.livechat.android.modules.brand.ui.helpers.a.M();
    }

    public final boolean h0() {
        return LiveChatUtil.isConversationEnabled();
    }

    public final boolean i0() {
        return f57331t;
    }

    public final boolean k0() {
        return LiveChatUtil.isArticlesEnabled();
    }

    public final boolean l0() {
        SharedPreferences M10 = C6218a.M();
        boolean i10 = og.i.i(M10 != null ? Boolean.valueOf(M10.getBoolean("showLaucher", false)) : null);
        De.a aVar = De.a.LauncherVisibilityMode;
        ZohoSalesIQ.h.a aVar2 = ZohoSalesIQ.h.a.NEVER;
        boolean areEqual = Intrinsics.areEqual(Ye.d.l(aVar, aVar2.name()), aVar2.name());
        SharedPreferences M11 = C6218a.M();
        return !(M11 == null || !M11.contains("showLaucher") || i10) || (Ye.d.c(aVar) && areEqual);
    }

    public final boolean m0(int i10) {
        return i10 > f57325n - ((e0() ? ((int) U()) * 3 : ((int) U()) + og.k.b(16)) + C6218a.U());
    }

    public final void n0(Function2 function2) {
        AbstractC1459k.d(P(), null, null, new C0836j(function2, null), 3, null);
    }

    public final int o0(int i10) {
        return RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i10, 0), f57325n - (((int) U()) + f57316e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(Activity activity, String str) {
        Object m147constructorimpl;
        ConstraintLayout b10;
        WindowManager windowManager;
        ConstraintLayout b11;
        WindowManager windowManager2;
        ud.o a10;
        ud.p b12;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (rd.b.i().getValue() != null) {
                Object value = rd.b.i().getValue();
                Intrinsics.checkNotNull(value);
                if (!((Boolean) value).booleanValue() && activity != null) {
                    b bVar = (b) f57321j.get(Integer.valueOf(activity.hashCode()));
                    ConstraintLayout constraintLayout = null;
                    if (((bVar == null || (b12 = bVar.b()) == null) ? null : b12.b()) == null) {
                        if (bVar != null && (a10 = bVar.a()) != null) {
                            constraintLayout = a10.b();
                        }
                    }
                    LiveChatUtil.log("removeChatView | remove launcher from windowManager: " + activity.getClass().getCanonicalName() + ", hashCode: " + activity.hashCode());
                    E(this, false, false, false, 4, null);
                    ud.p b13 = bVar.b();
                    if (b13 != null && (b11 = b13.b()) != null && (windowManager2 = f57320i) != null) {
                        windowManager2.removeViewImmediate(b11);
                    }
                    I(activity);
                    ud.o a11 = bVar.a();
                    if (a11 != null && (b10 = a11.b()) != null && (windowManager = f57320i) != null) {
                        windowManager.removeViewImmediate(b10);
                    }
                    f57321j.remove(Integer.valueOf(activity.hashCode()));
                }
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        rd.b.k(activity);
        f57322k = false;
    }

    public final void w0(boolean z10) {
        f57331t = z10;
    }

    /* renamed from: ne.j$a, reason: case insensitive filesystem */
    public static final class ViewOnTouchListenerC5700a implements View.OnTouchListener {

        /* renamed from: k, reason: collision with root package name */
        public static final C0833a f57337k = new C0833a(null);

        /* renamed from: l, reason: collision with root package name */
        public static int f57338l;

        /* renamed from: m, reason: collision with root package name */
        public static int f57339m;

        /* renamed from: n, reason: collision with root package name */
        public static int f57340n;

        /* renamed from: o, reason: collision with root package name */
        public static int f57341o;

        /* renamed from: a, reason: collision with root package name */
        public View f57342a;

        /* renamed from: b, reason: collision with root package name */
        public int f57343b;

        /* renamed from: c, reason: collision with root package name */
        public int f57344c;

        /* renamed from: d, reason: collision with root package name */
        public float f57345d;

        /* renamed from: e, reason: collision with root package name */
        public float f57346e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f57347f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f57348g;

        /* renamed from: h, reason: collision with root package name */
        public C0 f57349h;

        /* renamed from: i, reason: collision with root package name */
        public ValueAnimator f57350i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f57351j;

        /* renamed from: ne.j$a$a, reason: collision with other inner class name */
        public static final class C0833a {
            public /* synthetic */ C0833a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(int i10) {
                ViewOnTouchListenerC5700a.f57338l = i10;
            }

            public final void b(int i10) {
                ViewOnTouchListenerC5700a.f57339m = i10;
            }

            public C0833a() {
            }
        }

        /* renamed from: ne.j$a$c */
        public static final class c extends Lambda implements Function0 {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1614invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1614invoke() {
                ViewOnTouchListenerC5700a.w(ViewOnTouchListenerC5700a.this, false, 1, null);
            }
        }

        /* renamed from: ne.j$a$d */
        public static final class d extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f57357d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ViewOnTouchListenerC5700a f57358e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b bVar, ViewOnTouchListenerC5700a viewOnTouchListenerC5700a) {
                super(0);
                this.f57357d = bVar;
                this.f57358e = viewOnTouchListenerC5700a;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1615invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1615invoke() {
                WindowManager.LayoutParams n10 = this.f57357d.n();
                Intrinsics.checkNotNull(n10);
                n10.y = this.f57358e.f57344c;
                WindowManager.LayoutParams n11 = this.f57357d.n();
                Intrinsics.checkNotNull(n11);
                n11.x = this.f57358e.f57343b;
                j.f57312a.R0(this.f57357d);
            }
        }

        /* renamed from: ne.j$a$e */
        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57359n;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ MotionEvent f57361p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(MotionEvent motionEvent, Continuation continuation) {
                super(2, continuation);
                this.f57361p = motionEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return ViewOnTouchListenerC5700a.this.new e(this.f57361p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f57359n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long W10 = j.W();
                    this.f57359n = 1;
                    if (AbstractC1440a0.a(W10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!j.f57330s) {
                    ViewOnTouchListenerC5700a.this.r(this.f57361p);
                }
                j.f57328q = false;
                return Unit.INSTANCE;
            }
        }

        /* renamed from: ne.j$a$f */
        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57362n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f57363o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ WindowManager.LayoutParams f57364p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(b bVar, WindowManager.LayoutParams layoutParams, Continuation continuation) {
                super(2, continuation);
                this.f57363o = bVar;
                this.f57364p = layoutParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new f(this.f57363o, this.f57364p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f57362n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Set entrySet = j.f57321j.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                for (Object obj2 : CollectionsKt.reversed(entrySet)) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "next(...)");
                    b bVar = (b) ((Map.Entry) obj2).getValue();
                    if (bVar.h() != null && !Intrinsics.areEqual(bVar.h(), this.f57363o.h())) {
                        View h10 = bVar.h();
                        Intrinsics.checkNotNull(h10);
                        ViewGroup.LayoutParams layoutParams = h10.getLayoutParams();
                        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.x = this.f57364p.x;
                        }
                        if (layoutParams2 != null) {
                            layoutParams2.y = this.f57364p.y;
                        }
                        j.f57312a.R0(bVar);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public static /* synthetic */ void j(ViewOnTouchListenerC5700a viewOnTouchListenerC5700a, b bVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            viewOnTouchListenerC5700a.i(bVar, motionEvent, z10);
        }

        public static final void k(b launcherView, ValueAnimator valueAnimator) {
            MobilistenToggleFAB.e eVar;
            MobilistenToggleFAB mobilistenToggleFAB;
            MobilistenToggleFAB.a fabsVisibility;
            MobilistenToggleFAB mobilistenToggleFAB2;
            MobilistenToggleFAB mobilistenToggleFAB3;
            MobilistenToggleFAB.a fabsVisibility2;
            Intrinsics.checkNotNullParameter(launcherView, "$launcherView");
            Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue(C5444x.f55808b);
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Object animatedValue2 = valueAnimator.getAnimatedValue("y_with_margin");
            Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            float floatValue2 = ((Float) animatedValue2).floatValue();
            j jVar = j.f57312a;
            if (jVar.e0()) {
                ud.p b10 = launcherView.b();
                if (b10 != null && (mobilistenToggleFAB2 = b10.f66346b) != null) {
                    ViewGroup.LayoutParams layoutParams = mobilistenToggleFAB2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    ud.p b11 = launcherView.b();
                    if (((b11 == null || (mobilistenToggleFAB3 = b11.f66346b) == null || (fabsVisibility2 = mobilistenToggleFAB3.getFabsVisibility()) == null) ? null : fabsVisibility2.h()) == MobilistenToggleFAB.e.Top) {
                        ((ViewGroup.MarginLayoutParams) bVar).topMargin = (j.f57327p - ((int) floatValue2)) - og.k.b(88);
                        bVar.f18129H = 0.0f;
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
                    } else {
                        bVar.f18129H = 1.0f;
                        ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = jVar.B((int) floatValue2);
                    }
                    bVar.f18128G = 1.0f;
                    bVar.setMarginStart(0);
                    bVar.setMarginEnd((int) floatValue);
                    mobilistenToggleFAB2.setLayoutParams(bVar);
                }
                ud.p b12 = launcherView.b();
                if (b12 == null || (mobilistenToggleFAB = b12.f66346b) == null || (fabsVisibility = mobilistenToggleFAB.getFabsVisibility()) == null || (eVar = fabsVisibility.h()) == null) {
                    eVar = MobilistenToggleFAB.e.Bottom;
                }
                jVar.Q0(launcherView, eVar);
            }
            WindowManager.LayoutParams n10 = launcherView.n();
            if (n10 != null) {
                n10.x = (int) floatValue;
                n10.y = (int) floatValue2;
            }
            jVar.R0(launcherView);
        }

        public static final void t(final ViewOnTouchListenerC5700a this$0, b this_migrateLauncherIntoDismissView, ArrayList baseFabs, int i10, int i11, Function0 onEnd, boolean z10, ValueAnimator valueAnimator) {
            MobilistenToggleFAB mobilistenToggleFAB;
            ConstraintLayout b10;
            MobilistenToggleFAB mobilistenToggleFAB2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_migrateLauncherIntoDismissView, "$this_migrateLauncherIntoDismissView");
            Intrinsics.checkNotNullParameter(baseFabs, "$baseFabs");
            Intrinsics.checkNotNullParameter(onEnd, "$onEnd");
            Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
            this$0.f57351j = true;
            j jVar = j.f57312a;
            if (jVar.e0()) {
                WindowManager.LayoutParams n10 = this_migrateLauncherIntoDismissView.n();
                if (n10 != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue("x1");
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    n10.x = ((Integer) animatedValue).intValue();
                }
            } else {
                WindowManager.LayoutParams n11 = this_migrateLauncherIntoDismissView.n();
                if (n11 != null) {
                    Object animatedValue2 = valueAnimator.getAnimatedValue(C5444x.f55808b);
                    Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    n11.x = ((Integer) animatedValue2).intValue();
                }
            }
            WindowManager.LayoutParams n12 = this_migrateLauncherIntoDismissView.n();
            if (n12 != null) {
                Object animatedValue3 = valueAnimator.getAnimatedValue("y");
                Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                n12.y = ((Integer) animatedValue3).intValue();
            }
            if (jVar.e0()) {
                ud.p b11 = this_migrateLauncherIntoDismissView.b();
                MobilistenToggleFAB mobilistenToggleFAB3 = b11 != null ? b11.f66346b : null;
                if (mobilistenToggleFAB3 != null) {
                    ud.p b12 = this_migrateLauncherIntoDismissView.b();
                    ViewGroup.LayoutParams layoutParams = (b12 == null || (mobilistenToggleFAB2 = b12.f66346b) == null) ? null : mobilistenToggleFAB2.getLayoutParams();
                    ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                    if (bVar != null) {
                        Object animatedValue4 = valueAnimator.getAnimatedValue("y");
                        Intrinsics.checkNotNull(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ((Integer) animatedValue4).intValue();
                        bVar.f18128G = 1.0f;
                        bVar.setMarginStart(0);
                        Object animatedValue5 = valueAnimator.getAnimatedValue(C5444x.f55808b);
                        Intrinsics.checkNotNull(animatedValue5, "null cannot be cast to non-null type kotlin.Int");
                        bVar.setMarginEnd(((Integer) animatedValue5).intValue());
                    } else {
                        bVar = null;
                    }
                    mobilistenToggleFAB3.setLayoutParams(bVar);
                }
            }
            Object animatedValue6 = valueAnimator.getAnimatedValue("launcher_size");
            Intrinsics.checkNotNull(animatedValue6, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue6).intValue();
            Iterator it = baseFabs.iterator();
            while (it.hasNext()) {
                SalesIQFloatingActionButton salesIQFloatingActionButton = (SalesIQFloatingActionButton) it.next();
                ViewGroup.LayoutParams layoutParams2 = salesIQFloatingActionButton.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                bVar2.f18141T = intValue;
                salesIQFloatingActionButton.setLayoutParams(bVar2);
                salesIQFloatingActionButton.setCustomSize(intValue);
            }
            j.f57312a.R0(this_migrateLauncherIntoDismissView);
            WindowManager.LayoutParams n13 = this_migrateLauncherIntoDismissView.n();
            if (n13 == null || n13.y != i10) {
                return;
            }
            WindowManager.LayoutParams n14 = this_migrateLauncherIntoDismissView.n();
            if (n14 == null || n14.x != i11) {
                WindowManager.LayoutParams n15 = this_migrateLauncherIntoDismissView.n();
                if (n15 == null) {
                    return;
                }
                int i12 = n15.x;
                Object animatedValue7 = valueAnimator.getAnimatedValue("x1");
                Intrinsics.checkNotNull(animatedValue7, "null cannot be cast to non-null type kotlin.Int");
                if (i12 != ((Integer) animatedValue7).intValue()) {
                    return;
                }
            }
            ud.p b13 = this_migrateLauncherIntoDismissView.b();
            if (b13 != null && (b10 = b13.b()) != null) {
                b10.postDelayed(new Runnable() { // from class: ne.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.ViewOnTouchListenerC5700a.u(j.ViewOnTouchListenerC5700a.this);
                    }
                }, 300L);
            }
            onEnd.invoke();
            if (z10) {
                return;
            }
            ud.o a10 = this_migrateLauncherIntoDismissView.a();
            SalesIQFloatingActionButton salesIQFloatingActionButton2 = a10 != null ? a10.f66343c : null;
            if (salesIQFloatingActionButton2 != null) {
                salesIQFloatingActionButton2.setElevation(2.0f);
            }
            ud.p b14 = this_migrateLauncherIntoDismissView.b();
            MobilistenToggleFAB mobilistenToggleFAB4 = b14 != null ? b14.f66346b : null;
            if (mobilistenToggleFAB4 != null) {
                mobilistenToggleFAB4.setElevation(og.k.d(6));
            }
            ud.p b15 = this_migrateLauncherIntoDismissView.b();
            SalesIQFloatingActionButton baseFab = (b15 == null || (mobilistenToggleFAB = b15.f66346b) == null) ? null : mobilistenToggleFAB.getBaseFab();
            if (baseFab != null) {
                baseFab.setElevation(og.k.d(2));
            }
            ud.o a11 = this_migrateLauncherIntoDismissView.a();
            ConstraintLayout b16 = a11 != null ? a11.b() : null;
            if (b16 == null) {
                return;
            }
            b16.setElevation(6.0f);
        }

        public static final void u(ViewOnTouchListenerC5700a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f57351j = false;
        }

        public static /* synthetic */ void w(ViewOnTouchListenerC5700a viewOnTouchListenerC5700a, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            viewOnTouchListenerC5700a.v(z10);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01c9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i(final b bVar, MotionEvent motionEvent, boolean z10) {
            int i10;
            float f10;
            MobilistenToggleFAB.e eVar;
            float f11;
            float f12;
            boolean z11;
            MobilistenToggleFAB mobilistenToggleFAB;
            MobilistenToggleFAB.a a10;
            MobilistenToggleFAB mobilistenToggleFAB2;
            MobilistenToggleFAB.e eVar2;
            float f13;
            MobilistenToggleFAB mobilistenToggleFAB3;
            MobilistenToggleFAB.e eVar3;
            MobilistenToggleFAB.a a11;
            MobilistenToggleFAB mobilistenToggleFAB4;
            MobilistenToggleFAB.a fabsVisibility;
            if (bVar != null) {
                Pair q10 = q(motionEvent);
                int intValue = ((Number) q10.component1()).intValue();
                int intValue2 = ((Number) q10.component2()).intValue();
                Ref.FloatRef floatRef = new Ref.FloatRef();
                j jVar = j.f57312a;
                MobilistenToggleFAB.e eVar4 = jVar.m0(intValue2) ? MobilistenToggleFAB.e.Top : MobilistenToggleFAB.e.Bottom;
                ud.p b10 = bVar.b();
                boolean z12 = eVar4 != ((b10 == null || (mobilistenToggleFAB4 = b10.f66346b) == null || (fabsVisibility = mobilistenToggleFAB4.getFabsVisibility()) == null) ? null : fabsVisibility.h());
                if (z10) {
                    WindowManager.LayoutParams n10 = bVar.n();
                    f12 = og.i.k(n10 != null ? Integer.valueOf(n10.x) : null);
                    WindowManager.LayoutParams n11 = bVar.n();
                    f10 = og.i.k(n11 != null ? Integer.valueOf(n11.y) : null);
                    WindowManager.LayoutParams n12 = bVar.n();
                    float k10 = og.i.k(n12 != null ? Integer.valueOf(n12.x) : null);
                    floatRef.element = 0.0f;
                    f11 = k10;
                    eVar = eVar4;
                    i10 = 2;
                } else {
                    float f14 = intValue;
                    float f15 = intValue2;
                    float o02 = jVar.o0(intValue2);
                    floatRef.element = o02;
                    if (z12) {
                        floatRef.element = eVar4 == MobilistenToggleFAB.e.Top ? o02 + j.f57316e : o02 - j.f57316e;
                    }
                    if (motionEvent.getRawX() <= j.f57324m / 2) {
                        MobilistenToggleFAB.e eVar5 = eVar4;
                        i10 = 2;
                        f10 = f15;
                        ud.p b11 = bVar.b();
                        if (b11 != null && (mobilistenToggleFAB2 = b11.f66346b) != null) {
                            r10 = Integer.valueOf(mobilistenToggleFAB2.getMeasuredWidth());
                        }
                        float k11 = j.f57324m - og.i.k(r10);
                        ud.p b12 = bVar.b();
                        if (b12 == null || (mobilistenToggleFAB = b12.f66346b) == null) {
                            eVar = eVar5;
                        } else {
                            a10 = r9.a((r29 & 1) != 0 ? r9.f42706a : false, (r29 & 2) != 0 ? r9.f42707b : false, (r29 & 4) != 0 ? r9.f42708c : false, (r29 & 8) != 0 ? r9.f42709d : false, (r29 & 16) != 0 ? r9.f42710e : false, (r29 & 32) != 0 ? r9.f42711f : false, (r29 & 64) != 0 ? r9.f42712g : false, (r29 & 128) != 0 ? r9.f42713h : false, (r29 & 256) != 0 ? r9.f42714i : false, (r29 & 512) != 0 ? r9.f42715j : false, (r29 & 1024) != 0 ? r9.f42716k : null, (r29 & 2048) != 0 ? r9.f42717l : MobilistenToggleFAB.c.Start, (r29 & 4096) != 0 ? r9.f42718m : eVar5, (r29 & 8192) != 0 ? mobilistenToggleFAB.getFabsVisibility().f42719n : false);
                            eVar = eVar5;
                            mobilistenToggleFAB.setFabsVisibility(a10);
                        }
                        f11 = k11;
                        f12 = f14;
                        z11 = true;
                        LiveChatUtil.log("Final Animation moving values " + f12 + ' ' + f10 + ' ' + f11 + ' ' + floatRef.element + ' ' + z10);
                        float[] fArr = new float[i10];
                        fArr[0] = f12;
                        fArr[1] = f11;
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(C5444x.f55808b, fArr);
                        float f16 = floatRef.element;
                        float[] fArr2 = new float[i10];
                        fArr2[0] = f10;
                        fArr2[1] = f16;
                        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("y", fArr2);
                        float f17 = !z12 ? eVar == MobilistenToggleFAB.e.Bottom ? j.f57316e : -j.f57316e : 0;
                        floatRef.element += f17;
                        float f18 = bVar.n() == null ? r9.y : f10 + f17;
                        float f19 = floatRef.element;
                        float[] fArr3 = new float[i10];
                        fArr3[0] = f18;
                        fArr3[1] = f19;
                        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofFloat, ofFloat2, PropertyValuesHolder.ofFloat("y_with_margin", fArr3));
                        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ne.h
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                j.ViewOnTouchListenerC5700a.k(j.b.this, valueAnimator);
                            }
                        });
                        Intrinsics.checkNotNull(ofPropertyValuesHolder);
                        ofPropertyValuesHolder.addListener(new b(bVar, floatRef, z11, eVar));
                        ofPropertyValuesHolder.setDuration(160L);
                        ofPropertyValuesHolder.start();
                    }
                    ud.p b13 = bVar.b();
                    if (b13 == null || (mobilistenToggleFAB3 = b13.f66346b) == null) {
                        eVar2 = eVar4;
                        i10 = 2;
                        f13 = 0.0f;
                        f10 = f15;
                    } else {
                        f13 = 0.0f;
                        eVar3 = eVar4;
                        i10 = 2;
                        f10 = f15;
                        eVar2 = eVar3;
                        a11 = r9.a((r29 & 1) != 0 ? r9.f42706a : false, (r29 & 2) != 0 ? r9.f42707b : false, (r29 & 4) != 0 ? r9.f42708c : false, (r29 & 8) != 0 ? r9.f42709d : false, (r29 & 16) != 0 ? r9.f42710e : false, (r29 & 32) != 0 ? r9.f42711f : false, (r29 & 64) != 0 ? r9.f42712g : false, (r29 & 128) != 0 ? r9.f42713h : false, (r29 & 256) != 0 ? r9.f42714i : false, (r29 & 512) != 0 ? r9.f42715j : false, (r29 & 1024) != 0 ? r9.f42716k : null, (r29 & 2048) != 0 ? r9.f42717l : MobilistenToggleFAB.c.End, (r29 & 4096) != 0 ? r9.f42718m : eVar2, (r29 & 8192) != 0 ? mobilistenToggleFAB3.getFabsVisibility().f42719n : false);
                        mobilistenToggleFAB3.setFabsVisibility(a11);
                    }
                    f12 = f14;
                    f11 = f13;
                    eVar = eVar2;
                }
                z11 = false;
                LiveChatUtil.log("Final Animation moving values " + f12 + ' ' + f10 + ' ' + f11 + ' ' + floatRef.element + ' ' + z10);
                float[] fArr4 = new float[i10];
                fArr4[0] = f12;
                fArr4[1] = f11;
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(C5444x.f55808b, fArr4);
                float f162 = floatRef.element;
                float[] fArr22 = new float[i10];
                fArr22[0] = f10;
                fArr22[1] = f162;
                PropertyValuesHolder ofFloat22 = PropertyValuesHolder.ofFloat("y", fArr22);
                float f172 = !z12 ? eVar == MobilistenToggleFAB.e.Bottom ? j.f57316e : -j.f57316e : 0;
                floatRef.element += f172;
                if (bVar.n() == null) {
                }
                float f192 = floatRef.element;
                float[] fArr32 = new float[i10];
                fArr32[0] = f18;
                fArr32[1] = f192;
                ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(ofFloat3, ofFloat22, PropertyValuesHolder.ofFloat("y_with_margin", fArr32));
                ofPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
                ofPropertyValuesHolder2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ne.h
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        j.ViewOnTouchListenerC5700a.k(j.b.this, valueAnimator);
                    }
                });
                Intrinsics.checkNotNull(ofPropertyValuesHolder2);
                ofPropertyValuesHolder2.addListener(new b(bVar, floatRef, z11, eVar));
                ofPropertyValuesHolder2.setDuration(160L);
                ofPropertyValuesHolder2.start();
            }
        }

        public final void m() {
            ValueAnimator valueAnimator = this.f57350i;
            if (valueAnimator != null) {
                Intrinsics.checkNotNull(valueAnimator);
                if (!valueAnimator.isRunning()) {
                    ValueAnimator valueAnimator2 = this.f57350i;
                    Intrinsics.checkNotNull(valueAnimator2);
                    if (!valueAnimator2.isStarted()) {
                        return;
                    }
                }
                ValueAnimator valueAnimator3 = this.f57350i;
                Intrinsics.checkNotNull(valueAnimator3);
                valueAnimator3.cancel();
            }
        }

        public final View n() {
            View c10;
            View view = this.f57342a;
            if (view == null) {
                b R10 = j.f57312a.R();
                view = (R10 == null || (c10 = R10.c()) == null) ? null : c10.findViewById(od.q.f60214B4);
                this.f57342a = view;
            }
            return view;
        }

        public final int o() {
            return (C6218a.r() / 2) - (C6218a.b(56.0f) / 2);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            C0 d10;
            MobilistenToggleFAB mobilistenToggleFAB;
            MobilistenToggleFAB mobilistenToggleFAB2;
            b R10;
            Object m147constructorimpl;
            ud.p b10;
            MobilistenToggleFAB mobilistenToggleFAB3;
            ud.p b11;
            MobilistenToggleFAB mobilistenToggleFAB4;
            Intrinsics.checkNotNullParameter(event, "event");
            if ((!this.f57348g || event.getAction() != 1) && view != null) {
                view.onTouchEvent(event);
            }
            LiveChatUtil.log("Launcher event " + event.getAction());
            GestureDetector gestureDetector = j.f57323l;
            if (gestureDetector != null && gestureDetector.onTouchEvent(event) && !this.f57348g) {
                j.f57330s = true;
                LiveChatUtil.log("Launcher released onTouchEvent");
                return true;
            }
            j jVar = j.f57312a;
            b R11 = jVar.R();
            if (R11 != null && (b11 = R11.b()) != null && (mobilistenToggleFAB4 = b11.f66346b) != null && mobilistenToggleFAB4.z0()) {
                return true;
            }
            if (jVar.R() != null) {
                LiveChatUtil.log("Launcher " + event.getAction());
                int action = event.getAction();
                Integer num = null;
                if (action == 0) {
                    LiveChatUtil.log("Launcher action down");
                    j.f57330s = false;
                    j.f57328q = true;
                    d10 = AbstractC1459k.d(jVar.P(), null, null, new e(event, null), 3, null);
                    this.f57349h = d10;
                    b R12 = jVar.R();
                    Intrinsics.checkNotNull(R12);
                    if (R12.n() != null) {
                        WindowManager.LayoutParams n10 = R12.n();
                        Intrinsics.checkNotNull(n10);
                        f57338l = n10.x;
                        WindowManager.LayoutParams n11 = R12.n();
                        Intrinsics.checkNotNull(n11);
                        f57339m = n11.y;
                    }
                    ud.p b12 = R12.b();
                    f57340n = og.i.k((b12 == null || (mobilistenToggleFAB2 = b12.f66346b) == null) ? null : Integer.valueOf(og.i.m(Float.valueOf(mobilistenToggleFAB2.getX()))));
                    ud.p b13 = R12.b();
                    if (b13 != null && (mobilistenToggleFAB = b13.f66346b) != null) {
                        num = Integer.valueOf(og.i.m(Float.valueOf(mobilistenToggleFAB.getY())));
                    }
                    f57341o = og.i.k(num);
                    this.f57345d = event.getRawX();
                    this.f57346e = event.getRawY();
                    return true;
                }
                if (action != 1) {
                    if (action == 2) {
                        Pair q10 = q(event);
                        int intValue = ((Number) q10.component1()).intValue();
                        int intValue2 = ((Number) q10.component2()).intValue();
                        this.f57343b = intValue;
                        this.f57344c = intValue2;
                        if (!j.f57328q) {
                            r(event);
                        }
                        return true;
                    }
                    if (action != 3) {
                        if (action == 4) {
                            return true;
                        }
                    }
                }
                C0 c02 = this.f57349h;
                if (c02 != null) {
                    C0.a.b(c02, null, 1, null);
                }
                j.f57328q = false;
                LiveChatUtil.log("Launcher released");
                j.f57330s = true;
                boolean j02 = j.j0();
                if (jVar.R() != null) {
                    if (this.f57348g || !((R10 = jVar.R()) == null || (b10 = R10.b()) == null || (mobilistenToggleFAB3 = b10.f66346b) == null || !mobilistenToggleFAB3.Q0())) {
                        b R13 = jVar.R();
                        Intrinsics.checkNotNull(R13);
                        if (j02) {
                            if (R13.n() != null && this.f57347f) {
                                v(false);
                            }
                            jVar.w0(false);
                            m();
                            jVar.D(false, this.f57347f, true);
                        }
                        WindowManager.LayoutParams n12 = R13.n();
                        if (n12 != null) {
                            x();
                            if (j02 && this.f57347f) {
                                this.f57342a = null;
                                this.f57347f = false;
                                Q.f44447F.J(true);
                            } else if (this.f57348g) {
                                j(this, R13, event, false, 4, null);
                                AbstractC1459k.d(jVar.P(), null, null, new f(R13, n12, null), 3, null);
                            }
                        }
                    } else {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            LiveChatUtil.openChat(jVar.Q(), false, true, UTSUtil.shouldWaitForWidgetInteractionTrigger(), true);
                            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        }
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                    }
                }
                this.f57348g = false;
                return true;
            }
            return false;
        }

        public final int p() {
            int[] iArr = new int[2];
            View n10 = n();
            if (n10 != null) {
                n10.getLocationOnScreen(iArr);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Launcher dragToDismissViewY ");
            sb2.append(iArr[1]);
            sb2.append(' ');
            j jVar = j.f57312a;
            sb2.append(jVar.R());
            sb2.append(' ');
            b R10 = jVar.R();
            sb2.append(R10 != null ? R10.c() : null);
            LiveChatUtil.log(sb2.toString());
            return C6218a.b(68.0f);
        }

        public final Pair q(MotionEvent motionEvent) {
            return new Pair(Integer.valueOf(f57338l + ((j.f57324m - ((int) motionEvent.getRawX())) - (j.f57324m - ((int) this.f57345d)))), Integer.valueOf(f57339m + ((j.f57325n - ((int) motionEvent.getRawY())) - (j.f57325n - ((int) this.f57346e)))));
        }

        public final void r(MotionEvent motionEvent) {
            int k10;
            MobilistenToggleFAB mobilistenToggleFAB;
            Resources resources;
            ConstraintLayout b10;
            MobilistenToggleFAB mobilistenToggleFAB2;
            int i10;
            MobilistenToggleFAB mobilistenToggleFAB3;
            MobilistenToggleFAB.a fabsVisibility;
            j jVar = j.f57312a;
            if (jVar.R() != null) {
                b R10 = jVar.R();
                Intrinsics.checkNotNull(R10);
                Pair q10 = q(motionEvent);
                int intValue = ((Number) q10.component1()).intValue();
                int intValue2 = ((Number) q10.component2()).intValue();
                if (!this.f57348g) {
                    this.f57348g = true;
                    l();
                    View h10 = R10.h();
                    Intrinsics.checkNotNull(h10);
                    boolean performHapticFeedback = h10.performHapticFeedback(1, 2);
                    Boolean valueOf = Boolean.valueOf(performHapticFeedback);
                    if (performHapticFeedback) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Haptic feedback failed, API: ");
                        sb2.append(Build.VERSION.SDK_INT);
                        sb2.append(", vibration permission status: ");
                        sb2.append(AbstractC5338c.checkSelfPermission(jVar.O(), "android.permission.VIBRATE") == 0);
                        LiveChatUtil.log(sb2.toString());
                    }
                }
                if (this.f57348g) {
                    if (!this.f57347f) {
                        Pair q11 = q(motionEvent);
                        int intValue3 = ((Number) q11.component1()).intValue();
                        int intValue4 = ((Number) q11.component2()).intValue();
                        if (jVar.e0()) {
                            if (this.f57351j) {
                                ud.p b11 = R10.b();
                                ConstraintLayout b12 = b11 != null ? b11.b() : null;
                                if (b12 != null) {
                                    b12.setVisibility(4);
                                }
                                LiveChatUtil.log("LauncherPos Invisible");
                            } else {
                                ud.p b13 = R10.b();
                                ConstraintLayout b14 = b13 != null ? b13.b() : null;
                                if (b14 != null) {
                                    b14.setVisibility(0);
                                }
                            }
                            ud.p b15 = R10.b();
                            if (b15 != null && (mobilistenToggleFAB2 = b15.f66346b) != null) {
                                Intrinsics.checkNotNull(mobilistenToggleFAB2);
                                ViewGroup.LayoutParams layoutParams = mobilistenToggleFAB2.getLayoutParams();
                                if (layoutParams == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                }
                                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                bVar.f18129H = 1.0f;
                                ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
                                if (jVar.e0()) {
                                    Integer valueOf2 = Integer.valueOf(j.f57316e);
                                    ud.p b16 = R10.b();
                                    if (((b16 == null || (mobilistenToggleFAB3 = b16.f66346b) == null || (fabsVisibility = mobilistenToggleFAB3.getFabsVisibility()) == null) ? null : fabsVisibility.h()) != MobilistenToggleFAB.e.Top) {
                                        valueOf2 = null;
                                    }
                                    i10 = og.i.k(valueOf2) + intValue4;
                                } else {
                                    i10 = intValue4;
                                }
                                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = Integer.valueOf(jVar.B(i10)).intValue();
                                bVar.setMarginEnd(intValue3);
                                bVar.f18128G = 1.0f;
                                mobilistenToggleFAB2.setLayoutParams(bVar);
                            }
                            LiveChatUtil.log("Alias launcher under moving " + intValue3);
                        }
                        if (R10.n() != null) {
                            WindowManager.LayoutParams n10 = R10.n();
                            Intrinsics.checkNotNull(n10);
                            n10.x = intValue3;
                            WindowManager.LayoutParams n11 = R10.n();
                            Intrinsics.checkNotNull(n11);
                            n11.y = intValue4;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Main launcher under moving final values ");
                            WindowManager.LayoutParams n12 = R10.n();
                            Intrinsics.checkNotNull(n12);
                            sb3.append(n12.x);
                            sb3.append(' ');
                            WindowManager.LayoutParams n13 = R10.n();
                            Intrinsics.checkNotNull(n13);
                            sb3.append(n13.y);
                            LiveChatUtil.log(sb3.toString());
                            jVar.R0(R10);
                        }
                    }
                    if (!j.j0() || n() == null) {
                        return;
                    }
                    boolean d02 = C6218a.d0();
                    View n14 = n();
                    Intrinsics.checkNotNull(n14);
                    int measuredWidth = n14.getMeasuredWidth();
                    int o10 = o();
                    int p10 = p();
                    Integer valueOf3 = Integer.valueOf(j.f57316e);
                    if (d02) {
                        valueOf3 = null;
                    }
                    int k11 = p10 + og.i.k(valueOf3);
                    if (jVar.e0()) {
                        ud.o a10 = R10.a();
                        k10 = og.i.k((a10 == null || (b10 = a10.b()) == null) ? null : Integer.valueOf(b10.getMeasuredWidth()));
                    } else {
                        ud.p b17 = R10.b();
                        k10 = og.i.k((b17 == null || (mobilistenToggleFAB = b17.f66346b) == null) ? null : Integer.valueOf(mobilistenToggleFAB.getMeasuredWidth()));
                    }
                    int i11 = k10;
                    int b18 = C6218a.b(4.0f);
                    int i12 = (o10 - i11) + b18;
                    int i13 = ((measuredWidth + i12) + i11) - (b18 * 2);
                    j.E(jVar, true, false, false, 4, null);
                    LiveChatUtil.log("LauncherLogs dragToDismiss " + intValue2 + ' ' + k11 + ' ' + intValue + ' ' + i13 + ' ' + i12);
                    if (intValue2 <= k11 && intValue <= i13 && intValue >= i12) {
                        if (this.f57347f) {
                            return;
                        }
                        x();
                        this.f57347f = true;
                        TextView f10 = R10.f();
                        if (f10 != null) {
                            f10.setAlpha(0.0f);
                        }
                        WindowManager.LayoutParams n15 = R10.n();
                        Intrinsics.checkNotNull(n15);
                        int i14 = n15.x;
                        int r10 = (C6218a.r() / 2) - (i11 / 2);
                        WindowManager.LayoutParams n16 = R10.n();
                        Intrinsics.checkNotNull(n16);
                        s(R10, i14, r10, n16.y, d02 ? 0 : j.f57316e, true, new c());
                        return;
                    }
                    if (this.f57347f) {
                        l();
                        TextView f11 = R10.f();
                        if (f11 != null) {
                            f11.setAlpha(1.0f);
                        }
                        int b19 = C6218a.b(4.0f);
                        View n17 = n();
                        Intrinsics.checkNotNull(n17);
                        ViewGroup.LayoutParams layoutParams2 = n17.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        View c10 = R10.c();
                        if (c10 != null && (resources = c10.getResources()) != null) {
                            resources.getDimension(od.o.f59936c);
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMarginStart(b19);
                            }
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMarginEnd(b19);
                            }
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = b19;
                            }
                            if (marginLayoutParams != null) {
                                marginLayoutParams.bottomMargin = b19;
                            }
                        }
                        View n18 = n();
                        Intrinsics.checkNotNull(n18);
                        n18.setLayoutParams(marginLayoutParams);
                        WindowManager.LayoutParams n19 = R10.n();
                        Intrinsics.checkNotNull(n19);
                        int i15 = n19.x;
                        WindowManager.LayoutParams n20 = R10.n();
                        Intrinsics.checkNotNull(n20);
                        s(R10, i15, intValue, n20.y, intValue2, false, new d(R10, this));
                    }
                    this.f57347f = false;
                }
            }
        }

        public final void s(final b bVar, int i10, final int i11, int i12, final int i13, final boolean z10, final Function0 function0) {
            SalesIQFloatingActionButton salesIQFloatingActionButton;
            MobilistenToggleFAB mobilistenToggleFAB;
            SalesIQFloatingActionButton baseFab;
            MobilistenToggleFAB mobilistenToggleFAB2;
            if (j.f57312a.e0()) {
                ud.p b10 = bVar.b();
                ConstraintLayout b11 = b10 != null ? b10.b() : null;
                if (b11 != null) {
                    b11.setVisibility(4);
                }
                LiveChatUtil.log("LauncherPos Invisible two");
            }
            ud.p b12 = bVar.b();
            MobilistenToggleFAB mobilistenToggleFAB3 = b12 != null ? b12.f66346b : null;
            if (mobilistenToggleFAB3 != null) {
                mobilistenToggleFAB3.setElevation(0.0f);
            }
            ud.p b13 = bVar.b();
            SalesIQFloatingActionButton baseFab2 = (b13 == null || (mobilistenToggleFAB2 = b13.f66346b) == null) ? null : mobilistenToggleFAB2.getBaseFab();
            if (baseFab2 != null) {
                baseFab2.setElevation(0.0f);
            }
            ud.o a10 = bVar.a();
            ConstraintLayout b14 = a10 != null ? a10.b() : null;
            if (b14 != null) {
                b14.setElevation(0.0f);
            }
            ud.o a11 = bVar.a();
            SalesIQFloatingActionButton salesIQFloatingActionButton2 = a11 != null ? a11.f66343c : null;
            if (salesIQFloatingActionButton2 != null) {
                salesIQFloatingActionButton2.setElevation(0.0f);
            }
            final ArrayList arrayList = new ArrayList();
            ud.p b15 = bVar.b();
            if (b15 != null && (mobilistenToggleFAB = b15.f66346b) != null && (baseFab = mobilistenToggleFAB.getBaseFab()) != null) {
                arrayList.add(baseFab);
            }
            ud.o a12 = bVar.a();
            if (a12 != null && (salesIQFloatingActionButton = a12.f66343c) != null) {
                arrayList.add(salesIQFloatingActionButton);
            }
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(C5444x.f55808b, i10, i11);
            PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("y", i12, i13);
            PropertyValuesHolder ofInt3 = PropertyValuesHolder.ofInt("x1", i10, og.k.b(4) + i11);
            PropertyValuesHolder ofInt4 = z10 ? PropertyValuesHolder.ofInt("launcher_size", og.k.b(56), og.k.b(48)) : PropertyValuesHolder.ofInt("launcher_size", og.k.b(48), og.k.b(56));
            LiveChatUtil.log("LauncherLogs migrateLauncherIntoDismissView " + i10 + ' ' + i11 + ' ' + i12 + ' ' + i13);
            m();
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofInt, ofInt2, ofInt4, ofInt3);
            ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
            ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ne.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    j.ViewOnTouchListenerC5700a.t(j.ViewOnTouchListenerC5700a.this, bVar, arrayList, i13, i11, function0, z10, valueAnimator);
                }
            });
            ofPropertyValuesHolder.setDuration(150L);
            this.f57350i = ofPropertyValuesHolder;
            ofPropertyValuesHolder.start();
            this.f57351j = true;
        }

        public final void v(boolean z10) {
            b R10;
            View h10;
            View c10;
            Resources resources;
            View n10 = n();
            Intrinsics.checkNotNull(n10);
            ViewGroup.LayoutParams layoutParams = n10.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                b R11 = j.f57312a.R();
                if (R11 != null && (c10 = R11.c()) != null && (resources = c10.getResources()) != null) {
                    resources.getDimension(od.o.f59935b);
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.setMarginEnd(0);
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                }
                View n11 = n();
                Intrinsics.checkNotNull(n11);
                n11.setLayoutParams(marginLayoutParams);
            }
            if (!z10 || (R10 = j.f57312a.R()) == null || (h10 = R10.h()) == null) {
                return;
            }
            h10.performHapticFeedback(1, 2);
        }

        public final void l() {
        }

        public final void x() {
        }

        /* renamed from: ne.j$a$b */
        public static final class b implements Animator.AnimatorListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f57352a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f57353b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f57354c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MobilistenToggleFAB.e f57355d;

            public b(b bVar, Ref.FloatRef floatRef, boolean z10, MobilistenToggleFAB.e eVar) {
                this.f57352a = bVar;
                this.f57353b = floatRef;
                this.f57354c = z10;
                this.f57355d = eVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ud.p b10;
                MobilistenToggleFAB mobilistenToggleFAB;
                MobilistenToggleFAB mobilistenToggleFAB2;
                MobilistenToggleFAB.a fabsVisibility;
                b bVar = this.f57352a;
                int i10 = (int) this.f57353b.element;
                LiveChatUtil.log("LauncherPos onEnd " + this.f57353b.element + ' ' + ((j.f57325n - ((int) this.f57353b.element)) - og.k.b(88)));
                j jVar = j.f57312a;
                if (jVar.e0()) {
                    ud.p b11 = bVar.b();
                    ConstraintLayout constraintLayout = null;
                    if (b11 != null && (mobilistenToggleFAB = b11.f66346b) != null) {
                        Intrinsics.checkNotNull(mobilistenToggleFAB);
                        ViewGroup.LayoutParams layoutParams = mobilistenToggleFAB.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
                        ud.p b12 = this.f57352a.b();
                        if (((b12 == null || (mobilistenToggleFAB2 = b12.f66346b) == null || (fabsVisibility = mobilistenToggleFAB2.getFabsVisibility()) == null) ? null : fabsVisibility.h()) == MobilistenToggleFAB.e.Top) {
                            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = (j.f57327p - ((int) this.f57353b.element)) - og.k.b(88);
                            bVar2.f18129H = 0.0f;
                            ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = 0;
                        } else {
                            bVar2.f18129H = 1.0f;
                            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = 0;
                            ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = jVar.B((int) this.f57353b.element);
                        }
                        bVar2.f18128G = this.f57354c ? 0.0f : 1.0f;
                        mobilistenToggleFAB.setLayoutParams(bVar2);
                    }
                    b R10 = jVar.R();
                    if (R10 != null && (b10 = R10.b()) != null) {
                        constraintLayout = b10.b();
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                }
                int i11 = jVar.O().getResources().getConfiguration().orientation;
                int unused = j.f57325n;
                if (i11 == 2) {
                    C6218a.U();
                }
                C6218a.l0(i10, !this.f57354c, this.f57355d);
                LiveChatUtil.log("LauncherPos AnimationEnd");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f57379n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f57380o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f57381p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f57382q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f57383r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f57381p = z10;
            this.f57382q = z11;
            this.f57383r = z12;
        }

        public static final void j(b bVar, ValueAnimator valueAnimator) {
            ud.o a10 = bVar.a();
            ConstraintLayout b10 = a10 != null ? a10.b() : null;
            if (b10 != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                b10.setTranslationY(((Float) animatedValue).floatValue());
            }
            ud.p b11 = bVar.b();
            MobilistenToggleFAB mobilistenToggleFAB = b11 != null ? b11.f66346b : null;
            if (mobilistenToggleFAB == null) {
                return;
            }
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            mobilistenToggleFAB.setTranslationY(((Float) animatedValue2).floatValue());
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f57381p, this.f57382q, this.f57383r, continuation);
            dVar.f57380o = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57379n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.f57380o;
            if (this.f57381p || !j.f57312a.i0()) {
                j jVar = j.f57312a;
                if (jVar.R() != null) {
                    b R10 = jVar.R();
                    Intrinsics.checkNotNull(R10);
                    if (R10.c() != null) {
                        final b R11 = jVar.R();
                        Intrinsics.checkNotNull(R11);
                        boolean z10 = this.f57382q;
                        boolean z11 = this.f57383r;
                        View c10 = R11.c();
                        Intrinsics.checkNotNull(c10);
                        float measuredHeight = c10.getMeasuredHeight() + j.f57315d;
                        float f10 = z10 ? measuredHeight : 0.0f;
                        float f11 = z10 ? 0.0f : measuredHeight;
                        if (z10) {
                            View c11 = R11.c();
                            if (c11 == null || c11.getVisibility() != 8) {
                                return Unit.INSTANCE;
                            }
                            TextView f12 = R11.f();
                            if (f12 != null) {
                                f12.setAlpha(0.0f);
                            }
                            View e10 = R11.e();
                            if (e10 != null) {
                                og.p.w(e10);
                            }
                            View c12 = R11.c();
                            if (c12 != null) {
                                og.p.w(c12);
                            }
                            View c13 = R11.c();
                            if (c13 != null) {
                                c13.setTranslationY(measuredHeight);
                            }
                        } else {
                            View c14 = R11.c();
                            if (c14 == null || c14.getVisibility() != 0) {
                                return Unit.INSTANCE;
                            }
                            TextView f13 = R11.f();
                            if (f13 != null) {
                                f13.setAlpha(0.0f);
                            }
                            View c15 = R11.c();
                            if (c15 != null) {
                                c15.setTranslationY(0.0f);
                            }
                        }
                        jVar.w0(true);
                        float f14 = z10 ? 0.0f : 1.0f;
                        float f15 = z10 ? 1.0f : 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(R11.c(), "translationY", f10, f11);
                        long j10 = 200;
                        ofFloat.setDuration(j10);
                        ofFloat.setInterpolator(new DecelerateInterpolator());
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(R11.e(), "alpha", f14, f15);
                        ofFloat2.setDuration(j10);
                        ofFloat2.setInterpolator(new DecelerateInterpolator());
                        if (z10) {
                            AbstractC1459k.d(p10, null, null, new a(200, R11, null), 3, null);
                        } else {
                            Intrinsics.checkNotNull(ofFloat);
                            ofFloat.addListener(new b(R11, measuredHeight));
                            Intrinsics.checkNotNull(ofFloat2);
                            ofFloat2.addListener(new c(R11, f15));
                            if (z11) {
                                if (!Uf.j.z()) {
                                    try {
                                        Result.Companion companion = Result.INSTANCE;
                                        for (Map.Entry entry : j.f57321j.entrySet()) {
                                            b bVar = (b) entry.getValue();
                                            j jVar2 = j.f57312a;
                                            b R12 = jVar2.R();
                                            if ((R12 != null ? R12.hashCode() : 0) != bVar.hashCode()) {
                                                rd.b.j(((Number) entry.getKey()).intValue());
                                                WindowManager windowManager = j.f57320i;
                                                if (windowManager != null) {
                                                    windowManager.removeViewImmediate(bVar.k());
                                                }
                                                jVar2.H(bVar);
                                            }
                                        }
                                        Result.m147constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th2) {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        Result.m147constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    j.f57321j.clear();
                                }
                                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, measuredHeight + 0.0f);
                                ofFloat3.setDuration(j10);
                                ofFloat3.setInterpolator(new DecelerateInterpolator());
                                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ne.k
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        j.d.j(j.b.this, valueAnimator);
                                    }
                                });
                                Intrinsics.checkNotNull(ofFloat3);
                                ofFloat3.addListener(new C0835d());
                                Intrinsics.checkNotNullExpressionValue(ofFloat3, "apply(...)");
                                ofFloat3.start();
                            } else if (!Uf.j.z() && Uf.j.f12229s.size() > 1) {
                                int coerceAtMost = RangesKt.coerceAtMost(3, Uf.j.f12229s.size());
                                ArrayList activityHashCodes = Uf.j.f12229s;
                                Intrinsics.checkNotNullExpressionValue(activityHashCodes, "activityHashCodes");
                                Iterator it = CollectionsKt.reversed(activityHashCodes).subList(1, coerceAtMost).iterator();
                                while (it.hasNext()) {
                                    b bVar2 = (b) j.f57321j.get((Integer) it.next());
                                    if (bVar2 != null) {
                                        View c16 = bVar2.c();
                                        if (c16 != null) {
                                            c16.setTranslationY(measuredHeight);
                                        }
                                        View e11 = bVar2.e();
                                        if (e11 != null) {
                                            e11.setAlpha(0.0f);
                                        }
                                    }
                                }
                            }
                        }
                        ofFloat2.start();
                        ofFloat.start();
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f57384n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f57385o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ b f57386p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f57385o = i10;
                this.f57386p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f57385o, this.f57386p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f57384n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j10 = this.f57385o - 100;
                    this.f57384n = 1;
                    if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f57386p.f(), "alpha", 0.0f, 1.0f);
                b bVar = this.f57386p;
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                Intrinsics.checkNotNull(ofFloat);
                ofFloat.addListener(new C0834a(bVar));
                ofFloat.start();
                return Unit.INSTANCE;
            }

            /* renamed from: ne.j$d$a$a, reason: collision with other inner class name */
            public static final class C0834a implements Animator.AnimatorListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f57387a;

                public C0834a(b bVar) {
                    this.f57387a = bVar;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TextView f10 = this.f57387a.f();
                    if (f10 != null) {
                        f10.setAlpha(1.0f);
                    }
                    j.f57312a.w0(false);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            }
        }

        public static final class b implements Animator.AnimatorListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f57388a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ float f57389b;

            public b(b bVar, float f10) {
                this.f57388a = bVar;
                this.f57389b = f10;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View c10 = this.f57388a.c();
                if (c10 != null) {
                    og.p.n(c10);
                }
                View c11 = this.f57388a.c();
                if (c11 != null) {
                    c11.setTranslationY(this.f57389b);
                }
                j.f57312a.w0(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public static final class c implements Animator.AnimatorListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f57390a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ float f57391b;

            public c(b bVar, float f10) {
                this.f57390a = bVar;
                this.f57391b = f10;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View e10 = this.f57390a.e();
                if (e10 != null) {
                    og.p.n(e10);
                }
                View e11 = this.f57390a.e();
                if (e11 != null) {
                    e11.setAlpha(this.f57391b);
                }
                j.f57312a.w0(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        /* renamed from: ne.j$d$d, reason: collision with other inner class name */
        public static final class C0835d implements Animator.AnimatorListener {
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                j jVar = j.f57312a;
                j.t0(jVar.Q());
                if (jVar.M() == null) {
                    C6218a.l0(1.0f, true, MobilistenToggleFAB.e.Bottom);
                    return;
                }
                nd.c M10 = jVar.M();
                Intrinsics.checkNotNull(M10);
                j.G(M10, false, 2, null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }
    }

    public final void Q0(b bVar, MobilistenToggleFAB.e eVar) {
    }
}
