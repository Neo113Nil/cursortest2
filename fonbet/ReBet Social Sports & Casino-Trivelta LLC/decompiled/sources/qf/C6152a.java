package qf;

import com.google.gson.Gson;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntityKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import me.C5582a;
import me.b;
import og.i;
import rf.InterfaceC6253a;
import vf.AbstractC6687a;

/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6152a {

    /* renamed from: d, reason: collision with root package name */
    public static C6152a f63489d;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f63491a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f63492b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0879a f63488c = new C0879a(null);

    /* renamed from: e, reason: collision with root package name */
    public static Object f63490e = new Object();

    /* renamed from: qf.a$A */
    public static final class A extends Lambda implements Function2 {
        public A() {
            super(2);
        }

        public final MessageEntity a(String _chatId, long j10) {
            Intrinsics.checkNotNullParameter(_chatId, "_chatId");
            return C6152a.this.f(_chatId, j10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((String) obj, ((Number) obj2).longValue());
        }
    }

    /* renamed from: qf.a$B */
    public static final class B extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f63494n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f63495o;

        /* renamed from: q, reason: collision with root package name */
        public int f63497q;

        public B(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63495o = obj;
            this.f63497q |= Integer.MIN_VALUE;
            return C6152a.this.N(this);
        }
    }

    /* renamed from: qf.a$C */
    public static final class C extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f63498n;

        /* renamed from: o, reason: collision with root package name */
        public Object f63499o;

        /* renamed from: p, reason: collision with root package name */
        public Object f63500p;

        /* renamed from: q, reason: collision with root package name */
        public Object f63501q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f63502r;

        /* renamed from: t, reason: collision with root package name */
        public int f63504t;

        public C(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63502r = obj;
            this.f63504t |= Integer.MIN_VALUE;
            return C6152a.this.Q(null, null, null, null, null, this);
        }
    }

    /* renamed from: qf.a$D */
    public static final class D extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63505n;

        /* renamed from: p, reason: collision with root package name */
        public int f63507p;

        public D(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63505n = obj;
            this.f63507p |= Integer.MIN_VALUE;
            return C6152a.this.R(null, null, null, this);
        }
    }

    /* renamed from: qf.a$E */
    public static final class E extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63508n;

        /* renamed from: p, reason: collision with root package name */
        public int f63510p;

        public E(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63508n = obj;
            this.f63510p |= Integer.MIN_VALUE;
            return C6152a.this.S(null, null, null, this);
        }
    }

    /* renamed from: qf.a$F */
    public static final class F extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f63511n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f63512o;

        /* renamed from: q, reason: collision with root package name */
        public int f63514q;

        public F(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63512o = obj;
            this.f63514q |= Integer.MIN_VALUE;
            return C6152a.this.T(null, false, this);
        }
    }

    /* renamed from: qf.a$G */
    public static final class G extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63515n;

        /* renamed from: p, reason: collision with root package name */
        public int f63517p;

        public G(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63515n = obj;
            this.f63517p |= Integer.MIN_VALUE;
            return C6152a.this.V(null, null, null, null, this);
        }
    }

    /* renamed from: qf.a$H */
    public static final class H extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63518n;

        /* renamed from: p, reason: collision with root package name */
        public int f63520p;

        public H(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63518n = obj;
            this.f63520p |= Integer.MIN_VALUE;
            return C6152a.this.W(null, null, null, this);
        }
    }

    /* renamed from: qf.a$I */
    public static final class I extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f63521n;

        /* renamed from: o, reason: collision with root package name */
        public Object f63522o;

        /* renamed from: p, reason: collision with root package name */
        public Object f63523p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f63524q;

        /* renamed from: s, reason: collision with root package name */
        public int f63526s;

        public I(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63524q = obj;
            this.f63526s |= Integer.MIN_VALUE;
            return C6152a.this.X(null, null, this);
        }
    }

    /* renamed from: qf.a$J */
    public static final class J extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63527n;

        /* renamed from: p, reason: collision with root package name */
        public int f63529p;

        public J(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63527n = obj;
            this.f63529p |= Integer.MIN_VALUE;
            return C6152a.this.Y(null, 0L, false, this);
        }
    }

    /* renamed from: qf.a$K */
    public static final class K extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f63530n;

        /* renamed from: o, reason: collision with root package name */
        public Object f63531o;

        /* renamed from: p, reason: collision with root package name */
        public Object f63532p;

        /* renamed from: q, reason: collision with root package name */
        public Object f63533q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f63534r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f63535s;

        /* renamed from: u, reason: collision with root package name */
        public int f63537u;

        public K(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63535s = obj;
            this.f63537u |= Integer.MIN_VALUE;
            return C6152a.this.Z(null, null, null, false, this);
        }
    }

    /* renamed from: qf.a$L */
    public static final class L extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63538n;

        /* renamed from: p, reason: collision with root package name */
        public int f63540p;

        public L(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63538n = obj;
            this.f63540p |= Integer.MIN_VALUE;
            return C6152a.this.a0(null, null, null, this);
        }
    }

    /* renamed from: qf.a$M */
    public static final class M extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63541n;

        /* renamed from: p, reason: collision with root package name */
        public int f63543p;

        public M(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63541n = obj;
            this.f63543p |= Integer.MIN_VALUE;
            return C6152a.this.c0(null, null, null, this);
        }
    }

    /* renamed from: qf.a$N */
    public static final class N extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63544n;

        /* renamed from: p, reason: collision with root package name */
        public int f63546p;

        public N(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63544n = obj;
            this.f63546p |= Integer.MIN_VALUE;
            return C6152a.this.d0(null, null, null, this);
        }
    }

    /* renamed from: qf.a$O */
    public static final class O extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63547n;

        /* renamed from: p, reason: collision with root package name */
        public int f63549p;

        public O(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63547n = obj;
            this.f63549p |= Integer.MIN_VALUE;
            return C6152a.this.b0(null, null, null, this);
        }
    }

    /* renamed from: qf.a$P */
    public static final class P extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63550n;

        /* renamed from: p, reason: collision with root package name */
        public int f63552p;

        public P(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63550n = obj;
            this.f63552p |= Integer.MIN_VALUE;
            return C6152a.this.e0(null, null, null, this);
        }
    }

    /* renamed from: qf.a$Q */
    public static final class Q extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63553n;

        /* renamed from: p, reason: collision with root package name */
        public int f63555p;

        public Q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63553n = obj;
            this.f63555p |= Integer.MIN_VALUE;
            return C6152a.this.f0(null, null, null, this);
        }
    }

    /* renamed from: qf.a$R */
    public static final class R extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f63556n;

        /* renamed from: o, reason: collision with root package name */
        public Object f63557o;

        /* renamed from: p, reason: collision with root package name */
        public Object f63558p;

        /* renamed from: q, reason: collision with root package name */
        public Object f63559q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f63560r;

        /* renamed from: t, reason: collision with root package name */
        public int f63562t;

        public R(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63560r = obj;
            this.f63562t |= Integer.MIN_VALUE;
            return C6152a.this.g0(null, false, this);
        }
    }

    /* renamed from: qf.a$a, reason: collision with other inner class name */
    public static final class C0879a {
        public /* synthetic */ C0879a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6152a a() {
            C6152a c6152a;
            synchronized (C6152a.f63490e) {
                c6152a = C6152a.f63489d;
                if (c6152a == null) {
                    c6152a = new C6152a(null);
                    C6152a.f63489d = c6152a;
                }
            }
            return c6152a;
        }

        public C0879a() {
        }
    }

    /* renamed from: qf.a$b, reason: case insensitive filesystem */
    public static final class C6153b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63563n;

        /* renamed from: p, reason: collision with root package name */
        public int f63565p;

        public C6153b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63563n = obj;
            this.f63565p |= Integer.MIN_VALUE;
            return C6152a.this.g(null, null, this);
        }
    }

    /* renamed from: qf.a$c, reason: case insensitive filesystem */
    public static final class C6154c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63566n;

        /* renamed from: p, reason: collision with root package name */
        public int f63568p;

        public C6154c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63566n = obj;
            this.f63568p |= Integer.MIN_VALUE;
            return C6152a.this.i(null, null, this);
        }
    }

    /* renamed from: qf.a$d, reason: case insensitive filesystem */
    public static final class C6155d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63569n;

        /* renamed from: p, reason: collision with root package name */
        public int f63571p;

        public C6155d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63569n = obj;
            this.f63571p |= Integer.MIN_VALUE;
            return C6152a.this.h(null, null, this);
        }
    }

    /* renamed from: qf.a$e, reason: case insensitive filesystem */
    public static final class C6156e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63572n;

        /* renamed from: p, reason: collision with root package name */
        public int f63574p;

        public C6156e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63572n = obj;
            this.f63574p |= Integer.MIN_VALUE;
            return C6152a.this.j(null, null, this);
        }
    }

    /* renamed from: qf.a$f, reason: case insensitive filesystem */
    public static final class C6157f extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6157f f63575d = new C6157f();

        public C6157f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "message_id != '" + it + '\'';
        }
    }

    /* renamed from: qf.a$g, reason: case insensitive filesystem */
    public static final class C6158g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63576n;

        /* renamed from: p, reason: collision with root package name */
        public int f63578p;

        public C6158g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63576n = obj;
            this.f63578p |= Integer.MIN_VALUE;
            return C6152a.this.l(null, this);
        }
    }

    /* renamed from: qf.a$h, reason: case insensitive filesystem */
    public static final class C6159h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63579n;

        /* renamed from: p, reason: collision with root package name */
        public int f63581p;

        public C6159h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63579n = obj;
            this.f63581p |= Integer.MIN_VALUE;
            return C6152a.this.p(null, this);
        }
    }

    /* renamed from: qf.a$i, reason: case insensitive filesystem */
    public static final class C6160i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63582n;

        /* renamed from: p, reason: collision with root package name */
        public int f63584p;

        public C6160i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63582n = obj;
            this.f63584p |= Integer.MIN_VALUE;
            return C6152a.this.q(null, this);
        }
    }

    /* renamed from: qf.a$j, reason: case insensitive filesystem */
    public static final class C6161j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63585n;

        /* renamed from: p, reason: collision with root package name */
        public int f63587p;

        public C6161j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63585n = obj;
            this.f63587p |= Integer.MIN_VALUE;
            return C6152a.this.s(this);
        }
    }

    /* renamed from: qf.a$k, reason: case insensitive filesystem */
    public static final class C6162k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63588n;

        /* renamed from: p, reason: collision with root package name */
        public int f63590p;

        public C6162k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63588n = obj;
            this.f63590p |= Integer.MIN_VALUE;
            return C6152a.this.t(null, this);
        }
    }

    /* renamed from: qf.a$l, reason: case insensitive filesystem */
    public static final class C6163l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63591n;

        /* renamed from: p, reason: collision with root package name */
        public int f63593p;

        public C6163l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63591n = obj;
            this.f63593p |= Integer.MIN_VALUE;
            return C6152a.this.u(null, this);
        }
    }

    /* renamed from: qf.a$m, reason: case insensitive filesystem */
    public static final class C6164m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63594n;

        /* renamed from: p, reason: collision with root package name */
        public int f63596p;

        public C6164m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63594n = obj;
            this.f63596p |= Integer.MIN_VALUE;
            return C6152a.this.v(null, this);
        }
    }

    /* renamed from: qf.a$n, reason: case insensitive filesystem */
    public static final class C6165n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63597n;

        /* renamed from: p, reason: collision with root package name */
        public int f63599p;

        public C6165n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63597n = obj;
            this.f63599p |= Integer.MIN_VALUE;
            return C6152a.this.w(null, null, null, null, null, this);
        }
    }

    /* renamed from: qf.a$o, reason: case insensitive filesystem */
    public static final class C6166o extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63600n;

        /* renamed from: p, reason: collision with root package name */
        public int f63602p;

        public C6166o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63600n = obj;
            this.f63602p |= Integer.MIN_VALUE;
            return C6152a.this.x(null, null, false, this);
        }
    }

    /* renamed from: qf.a$p, reason: case insensitive filesystem */
    public static final class C6167p extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63603n;

        /* renamed from: p, reason: collision with root package name */
        public int f63605p;

        public C6167p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63603n = obj;
            this.f63605p |= Integer.MIN_VALUE;
            return C6152a.this.z(null, null, null, null, null, this);
        }
    }

    /* renamed from: qf.a$q, reason: case insensitive filesystem */
    public static final class C6168q extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6168q f63606d = new C6168q();

        public C6168q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "message_type = '" + it + '\'';
        }
    }

    /* renamed from: qf.a$r, reason: case insensitive filesystem */
    public static final class C6169r extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63607n;

        /* renamed from: p, reason: collision with root package name */
        public int f63609p;

        public C6169r(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63607n = obj;
            this.f63609p |= Integer.MIN_VALUE;
            return C6152a.this.F(null, null, this);
        }
    }

    /* renamed from: qf.a$s */
    public static final class s extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63610n;

        /* renamed from: p, reason: collision with root package name */
        public int f63612p;

        public s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63610n = obj;
            this.f63612p |= Integer.MIN_VALUE;
            return C6152a.this.H(null, null, this);
        }
    }

    /* renamed from: qf.a$t */
    public static final class t extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final t f63613d = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gson invoke() {
            return Yd.a.j();
        }
    }

    /* renamed from: qf.a$u */
    public static final class u extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63614n;

        /* renamed from: p, reason: collision with root package name */
        public int f63616p;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63614n = obj;
            this.f63616p |= Integer.MIN_VALUE;
            return C6152a.this.I(null, false, this);
        }
    }

    /* renamed from: qf.a$v */
    public static final class v extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63617n;

        /* renamed from: p, reason: collision with root package name */
        public int f63619p;

        public v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63617n = obj;
            this.f63619p |= Integer.MIN_VALUE;
            return C6152a.this.J(null, this);
        }
    }

    /* renamed from: qf.a$w */
    public static final class w extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63620n;

        /* renamed from: p, reason: collision with root package name */
        public int f63622p;

        public w(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63620n = obj;
            this.f63622p |= Integer.MIN_VALUE;
            return C6152a.this.K(null, null, this);
        }
    }

    /* renamed from: qf.a$x */
    public static final class x extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final x f63623d = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6253a invoke() {
            return Yd.a.h().i();
        }
    }

    /* renamed from: qf.a$y */
    public static final class y extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f63624n;

        /* renamed from: p, reason: collision with root package name */
        public int f63626p;

        public y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63624n = obj;
            this.f63626p |= Integer.MIN_VALUE;
            return C6152a.this.L(null, null, null, this);
        }
    }

    /* renamed from: qf.a$z */
    public static final class z extends Lambda implements Function2 {
        public z() {
            super(2);
        }

        public final MessageEntity a(String _chatId, long j10) {
            Intrinsics.checkNotNullParameter(_chatId, "_chatId");
            return C6152a.this.f(_chatId, j10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((String) obj, ((Number) obj2).longValue());
        }
    }

    public /* synthetic */ C6152a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object P(C6152a c6152a, String str, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c6152a.O(str, continuation);
    }

    public static /* synthetic */ Object U(C6152a c6152a, MessageEntity messageEntity, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c6152a.T(messageEntity, z10, continuation);
    }

    public static /* synthetic */ Object m(C6152a c6152a, String str, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c6152a.l(str, continuation);
    }

    public static /* synthetic */ Object y(C6152a c6152a, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        return c6152a.w(str, str2, str3, str4, str5, continuation);
    }

    public final Object A(String str, String str2, List list, Continuation continuation) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * from messages WHERE ");
        if (str.length() > 0) {
            str3 = "chat_id = '" + str + '\'';
        } else {
            str3 = "conversation_id = '" + str2 + '\'';
        }
        sb2.append(str3);
        sb2.append(" AND (");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Message.g) it.next()).getStringValue());
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, " OR ", null, null, 0, null, C6168q.f63606d, 30, null));
        sb2.append(')');
        return G().U(new E2.a(sb2.toString()), continuation);
    }

    public final Object B(String str, Continuation continuation) {
        return G().E(str, continuation);
    }

    public final Object C(List list, Continuation continuation) {
        return G().W(list, continuation);
    }

    public final C5582a D(String str, String chatId) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(G().a(str, chatId));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return b.a(m147constructorimpl);
    }

    public final C5582a E(String str, String str2, Message.g type) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(G().N(str, str2, type.getStringValue()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return b.a(m147constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(String str, Message.g gVar, Continuation continuation) {
        C6169r c6169r;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6169r) {
            c6169r = (C6169r) continuation;
            int i11 = c6169r.f63609p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6169r.f63609p = i11 - Integer.MIN_VALUE;
                Object obj = c6169r.f63607n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6169r.f63609p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    String stringValue = gVar.getStringValue();
                    c6169r.f63609p = 1;
                    obj = G10.p(str, stringValue, c6169r);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6169r = new C6169r(continuation);
        Object obj2 = c6169r.f63607n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6169r.f63609p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Boxing.boxInt(((Number) obj2).intValue()));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    public final InterfaceC6253a G() {
        return (InterfaceC6253a) this.f63491a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(String str, String str2, Continuation continuation) {
        s sVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i11 = sVar.f63612p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f63612p = i11 - Integer.MIN_VALUE;
                Object obj = sVar.f63610n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sVar.f63612p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    sVar.f63612p = 1;
                    obj = G10.e(str, str2, sVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Boxing.boxLong(((Number) obj).longValue()));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        sVar = new s(continuation);
        Object obj2 = sVar.f63610n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sVar.f63612p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Boxing.boxLong(((Number) obj2).longValue()));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(6:21|22|(1:24)(1:32)|(1:28)|29|(1:31))|11|12|(1:14)|15|16))|35|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(MessageEntity messageEntity, boolean z10, Continuation continuation) {
        u uVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        MessageEntity replaceClientTimeWithServerTimeIfAbsent;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i11 = uVar.f63616p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f63616p = i11 - Integer.MIN_VALUE;
                Object obj = uVar.f63614n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = uVar.f63616p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    MessageEntity messageEntity2 = z10 ? messageEntity : null;
                    if (messageEntity2 != null && (replaceClientTimeWithServerTimeIfAbsent = MessageEntityKt.replaceClientTimeWithServerTimeIfAbsent(messageEntity2)) != null) {
                        messageEntity = replaceClientTimeWithServerTimeIfAbsent;
                    }
                    uVar.f63616p = 1;
                    if (G10.a0(messageEntity, uVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        uVar = new u(continuation);
        Object obj2 = uVar.f63614n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = uVar.f63616p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(List list, Continuation continuation) {
        v vVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i11 = vVar.f63619p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f63619p = i11 - Integer.MIN_VALUE;
                Object obj = vVar.f63617n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = vVar.f63619p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    vVar.f63619p = 1;
                    if (G10.b0(list, vVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        vVar = new v(continuation);
        Object obj2 = vVar.f63617n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = vVar.f63619p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(String str, String str2, Continuation continuation) {
        w wVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i11 = wVar.f63622p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f63622p = i11 - Integer.MIN_VALUE;
                Object obj = wVar.f63620n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = wVar.f63622p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    wVar.f63622p = 1;
                    obj = G10.T(str, str2, wVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        wVar = new w(continuation);
        Object obj2 = wVar.f63620n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = wVar.f63622p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|29|6|7|8|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(String str, List list, List list2, Continuation continuation) {
        y yVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i11 = yVar.f63626p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f63626p = i11 - Integer.MIN_VALUE;
                y yVar2 = yVar;
                Object obj = yVar2.f63624n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = yVar2.f63626p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    z zVar = new z();
                    yVar2.f63626p = 1;
                    if (G10.w(str, list2, list, zVar, yVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        yVar = new y(continuation);
        y yVar22 = yVar;
        Object obj2 = yVar22.f63624n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = yVar22.f63626p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    public final Object M(String str, List list, Continuation continuation) {
        Object Q10 = G().Q(str, list, new A(), continuation);
        return Q10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Q10 : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(3:27|28|(2:30|26)(1:31))|24))|34|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (P(r2, null, r0, 1, null) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(Continuation continuation) {
        B b10;
        int i10;
        C6152a c6152a;
        if (continuation instanceof B) {
            b10 = (B) continuation;
            int i11 = b10.f63497q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b10.f63497q = i11 - Integer.MIN_VALUE;
                Object obj = b10.f63495o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = b10.f63497q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    b10.f63494n = this;
                    b10.f63497q = 1;
                    if (m(this, null, b10, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6152a = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return b.a(m147constructorimpl);
                    }
                    c6152a = (C6152a) b10.f63494n;
                    ResultKt.throwOnFailure(obj);
                }
                b10.f63494n = null;
                b10.f63497q = 2;
            }
        }
        b10 = new B(continuation);
        Object obj2 = b10.f63495o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = b10.f63497q;
        if (i10 != 0) {
        }
        b10.f63494n = null;
        b10.f63497q = 2;
    }

    public final Object O(String str, Continuation continuation) {
        String n10 = n(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE messages SET is_typing = null");
        String str2 = null;
        if ((n10.length() > 0 ? this : null) != null) {
            str2 = " WHERE " + StringsKt.removeSuffix(n10, (CharSequence) " AND ");
        }
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        Object d10 = G().d(new E2.a(sb2.toString()), continuation);
        return d10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d10 : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|8|(1:(1:(1:(7:13|14|15|16|(1:18)|19|20)(2:23|24))(9:25|26|27|(1:29)|15|16|(0)|19|20))(7:32|33|15|16|(0)|19|20))(3:34|35|(6:(2:40|(2:42|31))|15|16|(0)|19|20)(7:43|(1:(2:46|(2:48|31)(3:49|27|(0)))(2:50|(0)))|15|16|(0)|19|20))|51|52|53|16|(0)|19|20))|54|6|7|8|(0)(0)|51|52|53|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r0 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:14:0x00c9, B:15:0x00d2, B:26:0x004c, B:27:0x00a6, B:29:0x00b4, B:33:0x0060, B:35:0x0068, B:40:0x0072, B:46:0x008d), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        C c10;
        int i10;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        C6152a c6152a;
        String str6;
        if (continuation instanceof C) {
            c10 = (C) continuation;
            int i11 = c10.f63504t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c10.f63504t = i11 - Integer.MIN_VALUE;
                C c11 = c10;
                Object obj = c11.f63502r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c11.f63504t;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        return b.a(m147constructorimpl);
                    }
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Boxing.boxInt(((Number) obj).intValue());
                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return b.a(m147constructorimpl);
                    }
                    str5 = (String) c11.f63500p;
                    str6 = (String) c11.f63499o;
                    c6152a = (C6152a) c11.f63498n;
                    ResultKt.throwOnFailure(obj);
                    Boxing.boxInt(((Number) obj).intValue());
                    if (str5 != null) {
                        InterfaceC6253a G10 = c6152a.G();
                        c11.f63498n = null;
                        c11.f63499o = null;
                        c11.f63500p = null;
                        c11.f63501q = null;
                        c11.f63504t = 3;
                        obj = G10.s(str6, str5, c11);
                    }
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                    }
                    return b.a(m147constructorimpl);
                }
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                if (str2 != null) {
                    if (str3 != null && str4 != null && str5 != null) {
                        InterfaceC6253a G11 = G();
                        c11.f63498n = this;
                        c11.f63499o = str;
                        c11.f63500p = str4;
                        c11.f63501q = str5;
                        c11.f63504t = 1;
                        if (G11.L(str2, str3, str4, str5, c11) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                    }
                    return b.a(m147constructorimpl);
                }
                if (str != null) {
                    if (str4 != null) {
                        InterfaceC6253a G12 = G();
                        c11.f63498n = this;
                        c11.f63499o = str;
                        c11.f63500p = str5;
                        c11.f63501q = null;
                        c11.f63504t = 2;
                        Object I10 = G12.I(str, str4, c11);
                        if (I10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = I10;
                        str6 = str;
                        c6152a = this;
                        Boxing.boxInt(((Number) obj).intValue());
                        if (str5 != null) {
                        }
                    } else {
                        c6152a = this;
                        str6 = str;
                        if (str5 != null) {
                        }
                    }
                }
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                }
                return b.a(m147constructorimpl);
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                }
                return b.a(m147constructorimpl);
            }
        }
        c10 = new C(continuation);
        C c112 = c10;
        Object obj2 = c112.f63502r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c112.f63504t;
        if (i10 == 0) {
        }
        Result.Companion companion22 = Result.INSTANCE;
        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(String str, String str2, String str3, Continuation continuation) {
        D d10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof D) {
            d10 = (D) continuation;
            int i11 = d10.f63507p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d10.f63507p = i11 - Integer.MIN_VALUE;
                Object obj = d10.f63505n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = d10.f63507p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    d10.f63507p = 1;
                    if (G10.j(str, str2, str3, d10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        d10 = new D(continuation);
        Object obj2 = d10.f63505n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = d10.f63507p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(String str, String str2, String str3, Continuation continuation) {
        E e10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof E) {
            e10 = (E) continuation;
            int i11 = e10.f63510p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e10.f63510p = i11 - Integer.MIN_VALUE;
                Object obj = e10.f63508n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = e10.f63510p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    e10.f63510p = 1;
                    if (G10.Y(str, str2, str3, e10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        e10 = new E(continuation);
        Object obj2 = e10.f63508n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = e10.f63510p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(6:15|16|17|(1:19)|20|21)(2:12|13))(2:23|24))(3:33|34|(2:36|30)(1:37))|25|(7:27|(2:29|30)|16|17|(0)|20|21)(1:31)|38|39|17|(0)|20|21))|40|6|7|(0)(0)|25|(0)(0)|38|39|17|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r7.a0(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:15:0x002b, B:16:0x0085, B:24:0x003d, B:25:0x0052, B:27:0x0067, B:31:0x0076, B:34:0x0044), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:15:0x002b, B:16:0x0085, B:24:0x003d, B:25:0x0052, B:27:0x0067, B:31:0x0076, B:34:0x0044), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(MessageEntity messageEntity, boolean z10, Continuation continuation) {
        F f10;
        int i10;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        C6152a c6152a;
        Pair pair;
        if (continuation instanceof F) {
            f10 = (F) continuation;
            int i11 = f10.f63514q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f10.f63514q = i11 - Integer.MIN_VALUE;
                Object obj = f10.f63512o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = f10.f63514q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    f10.f63511n = this;
                    f10.f63514q = 1;
                    obj = g0(messageEntity, z10, f10);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6152a = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return b.a(m147constructorimpl);
                    }
                    c6152a = (C6152a) f10.f63511n;
                    ResultKt.throwOnFailure(obj);
                }
                pair = (Pair) obj;
                MessageEntity messageEntity2 = (MessageEntity) pair.getFirst();
                if (!((Boolean) pair.getSecond()).booleanValue()) {
                    InterfaceC6253a G10 = c6152a.G();
                    f10.f63511n = null;
                    f10.f63514q = 2;
                    if (G10.n(messageEntity2, f10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                    }
                    return b.a(m147constructorimpl);
                }
                InterfaceC6253a G11 = c6152a.G();
                f10.f63511n = null;
                f10.f63514q = 3;
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                }
                return b.a(m147constructorimpl);
            }
        }
        f10 = new F(continuation);
        Object obj2 = f10.f63512o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = f10.f63514q;
        if (i10 != 0) {
        }
        pair = (Pair) obj2;
        MessageEntity messageEntity22 = (MessageEntity) pair.getFirst();
        if (!((Boolean) pair.getSecond()).booleanValue()) {
        }
        Result.Companion companion22 = Result.INSTANCE;
        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(2:26|(1:28)))|12|13|(1:15)|16|17))|32|6|7|8|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(String str, String str2, Boolean bool, Long l10, Continuation continuation) {
        G g10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof G) {
            g10 = (G) continuation;
            int i11 = g10.f63517p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g10.f63517p = i11 - Integer.MIN_VALUE;
                G g11 = g10;
                Object obj = g11.f63515n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = g11.f63517p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    if (bool != null && l10 != null) {
                        InterfaceC6253a G10 = G();
                        boolean booleanValue = bool.booleanValue();
                        long longValue = l10.longValue();
                        g11.f63517p = 1;
                        if (G10.c0(str, str2, booleanValue, longValue, g11) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        g10 = new G(continuation);
        G g112 = g10;
        Object obj2 = g112.f63515n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = g112.f63517p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(String str, String str2, Boolean bool, Continuation continuation) {
        H h10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof H) {
            h10 = (H) continuation;
            int i11 = h10.f63520p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h10.f63520p = i11 - Integer.MIN_VALUE;
                Object obj = h10.f63518n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = h10.f63520p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    h10.f63520p = 1;
                    if (G10.b(str, str2, bool, h10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        h10 = new H(continuation);
        Object obj2 = h10.f63518n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = h10.f63520p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(6:12|13|14|(1:16)|17|18)(2:21|22))(3:23|24|25))(3:28|29|30))(3:35|36|(2:38|27)(1:39))|31|(2:33|27)(2:34|25)))|42|6|7|(0)(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X(MessageEntity messageEntity, MessageEntity messageEntity2, Continuation continuation) {
        I i10;
        Object coroutine_suspended;
        int i11;
        MessageEntity messageEntity3;
        InterfaceC6253a interfaceC6253a;
        C6152a c6152a;
        Object g02;
        Pair pair;
        if (continuation instanceof I) {
            i10 = (I) continuation;
            int i12 = i10.f63526s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i10.f63526s = i12 - Integer.MIN_VALUE;
                Object obj = i10.f63524q;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = i10.f63526s;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    i10.f63521n = this;
                    i10.f63522o = messageEntity2;
                    i10.f63523p = G10;
                    i10.f63526s = 1;
                    Object g03 = g0(messageEntity, false, i10);
                    if (g03 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = g03;
                    messageEntity3 = messageEntity2;
                    interfaceC6253a = G10;
                    c6152a = this;
                } else if (i11 == 1) {
                    InterfaceC6253a interfaceC6253a2 = (InterfaceC6253a) i10.f63523p;
                    MessageEntity messageEntity4 = (MessageEntity) i10.f63522o;
                    c6152a = (C6152a) i10.f63521n;
                    ResultKt.throwOnFailure(obj);
                    interfaceC6253a = interfaceC6253a2;
                    messageEntity3 = messageEntity4;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Object m147constructorimpl = Result.m147constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return b.a(m147constructorimpl);
                    }
                    pair = (Pair) i10.f63522o;
                    interfaceC6253a = (InterfaceC6253a) i10.f63521n;
                    ResultKt.throwOnFailure(obj);
                    i10.f63521n = null;
                    i10.f63522o = null;
                    i10.f63526s = 3;
                    obj = interfaceC6253a.g0(pair, (Pair) obj, i10);
                }
                Pair pair2 = (Pair) obj;
                i10.f63521n = interfaceC6253a;
                i10.f63522o = pair2;
                i10.f63523p = null;
                i10.f63526s = 2;
                g02 = c6152a.g0(messageEntity3, false, i10);
                if (g02 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = g02;
                pair = pair2;
                i10.f63521n = null;
                i10.f63522o = null;
                i10.f63526s = 3;
                obj = interfaceC6253a.g0(pair, (Pair) obj, i10);
            }
        }
        i10 = new I(continuation);
        Object obj2 = i10.f63524q;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = i10.f63526s;
        if (i11 != 0) {
        }
        Pair pair22 = (Pair) obj2;
        i10.f63521n = interfaceC6253a;
        i10.f63522o = pair22;
        i10.f63523p = null;
        i10.f63526s = 2;
        g02 = c6152a.g0(messageEntity3, false, i10);
        if (g02 != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|29|6|7|8|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y(String str, long j10, boolean z10, Continuation continuation) {
        J j11;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof J) {
            j11 = (J) continuation;
            int i11 = j11.f63529p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j11.f63529p = i11 - Integer.MIN_VALUE;
                J j12 = j11;
                Object obj = j12.f63527n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = j12.f63529p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    j12.f63529p = 1;
                    if (InterfaceC6253a.R(G10, str, j10, z10, 0, j12, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        j11 = new J(continuation);
        J j122 = j11;
        Object obj2 = j122.f63527n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = j122.f63529p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|8|(1:(1:(6:12|13|14|(1:16)|17|18)(2:21|22))(3:23|24|25))(3:33|34|(2:36|32)(1:37))|26|(1:30)|13|14|(0)|17|18))|41|6|7|8|(0)(0)|26|(2:28|30)|13|14|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (rf.InterfaceC6253a.X(r2, r3, r4, r5, r6, r14, 0, r8, 32, null) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        r15 = kotlin.Result.INSTANCE;
        r14 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(String str, String str2, String str3, boolean z10, Continuation continuation) {
        K k10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        K k11;
        String str4;
        String str5;
        String str6;
        boolean z11;
        C6152a c6152a;
        MessageEntity messageEntity;
        MessageEntity.Time time;
        if (continuation instanceof K) {
            k10 = (K) continuation;
            int i11 = k10.f63537u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k10.f63537u = i11 - Integer.MIN_VALUE;
                K k12 = k10;
                Object obj = k12.f63535s;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = k12.f63537u;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    k12.f63530n = this;
                    k12.f63531o = str;
                    k12.f63532p = str2;
                    k12.f63533q = str3;
                    k12.f63534r = z10;
                    k12.f63537u = 1;
                    k11 = k12;
                    Object d02 = InterfaceC6253a.d0(G10, str2, str, null, str3, null, k11, 16, null);
                    if (d02 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                    z11 = z10;
                    obj = d02;
                    c6152a = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return b.a(m147constructorimpl);
                    }
                    z11 = k12.f63534r;
                    String str7 = (String) k12.f63533q;
                    String str8 = (String) k12.f63532p;
                    str4 = (String) k12.f63531o;
                    C6152a c6152a2 = (C6152a) k12.f63530n;
                    ResultKt.throwOnFailure(obj);
                    str6 = str7;
                    c6152a = c6152a2;
                    k11 = k12;
                    str5 = str8;
                }
                messageEntity = (MessageEntity) obj;
                if (messageEntity != null && (time = messageEntity.getTime()) != null) {
                    long serverTime = time.getServerTime();
                    InterfaceC6253a G11 = c6152a.G();
                    k11.f63530n = null;
                    k11.f63531o = null;
                    k11.f63532p = null;
                    k11.f63533q = null;
                    k11.f63537u = 2;
                }
                Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                if (m150exceptionOrNullimpl != null) {
                }
                return b.a(m147constructorimpl2);
            }
        }
        k10 = new K(continuation);
        K k122 = k10;
        Object obj2 = k122.f63535s;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = k122.f63537u;
        if (i10 != 0) {
        }
        messageEntity = (MessageEntity) obj2;
        if (messageEntity != null) {
            long serverTime2 = time.getServerTime();
            InterfaceC6253a G112 = c6152a.G();
            k11.f63530n = null;
            k11.f63531o = null;
            k11.f63532p = null;
            k11.f63533q = null;
            k11.f63537u = 2;
        }
        Object m147constructorimpl22 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl22);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl22);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(String str, String str2, String str3, Continuation continuation) {
        L l10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof L) {
            l10 = (L) continuation;
            int i11 = l10.f63540p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l10.f63540p = i11 - Integer.MIN_VALUE;
                Object obj = l10.f63538n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = l10.f63540p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    l10.f63540p = 1;
                    if (G10.Z(str, str2, str3, l10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        l10 = new L(continuation);
        Object obj2 = l10.f63538n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = l10.f63540p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(String str, Message.g gVar, Message.f fVar, Continuation continuation) {
        O o10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof O) {
            o10 = (O) continuation;
            int i11 = o10.f63549p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o10.f63549p = i11 - Integer.MIN_VALUE;
                Object obj = o10.f63547n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = o10.f63549p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    String stringValue = gVar.getStringValue();
                    int ordinal = fVar.ordinal();
                    o10.f63549p = 1;
                    if (G10.u(str, stringValue, ordinal, o10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        o10 = new O(continuation);
        Object obj2 = o10.f63547n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = o10.f63549p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(String str, String str2, Message.f fVar, Continuation continuation) {
        M m10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof M) {
            m10 = (M) continuation;
            int i11 = m10.f63543p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m10.f63543p = i11 - Integer.MIN_VALUE;
                Object obj = m10.f63541n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = m10.f63543p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    int ordinal = fVar.ordinal();
                    m10.f63543p = 1;
                    if (G10.l(str, str2, ordinal, m10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        m10 = new M(continuation);
        Object obj2 = m10.f63541n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = m10.f63543p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(String str, List list, Message.f fVar, Continuation continuation) {
        N n10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof N) {
            n10 = (N) continuation;
            int i11 = n10.f63546p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n10.f63546p = i11 - Integer.MIN_VALUE;
                Object obj = n10.f63544n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = n10.f63546p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    int ordinal = fVar.ordinal();
                    n10.f63546p = 1;
                    if (G10.h0(str, list, ordinal, n10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        n10 = new N(continuation);
        Object obj2 = n10.f63544n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = n10.f63546p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(String str, Message.g gVar, Message.f fVar, Continuation continuation) {
        P p10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof P) {
            p10 = (P) continuation;
            int i11 = p10.f63552p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p10.f63552p = i11 - Integer.MIN_VALUE;
                Object obj = p10.f63550n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = p10.f63552p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    String stringValue = gVar.getStringValue();
                    int ordinal = fVar.ordinal();
                    p10.f63552p = 1;
                    if (G10.r(str, stringValue, ordinal, p10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        p10 = new P(continuation);
        Object obj2 = p10.f63550n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = p10.f63552p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    public final MessageEntity f(String str, long j10) {
        return AbstractC6687a.a(new Message(null, null, str, Message.g.LoadMore, null, "load_more_" + j10, null, null, null, null, j10, j10 + 1, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -3120, 1023, null), o(), "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(String str, String str2, Message.g gVar, Continuation continuation) {
        Q q10;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof Q) {
            q10 = (Q) continuation;
            int i11 = q10.f63555p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q10.f63555p = i11 - Integer.MIN_VALUE;
                Object obj = q10.f63553n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = q10.f63555p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    String stringValue = gVar.getStringValue();
                    q10.f63555p = 1;
                    if (G10.o(str, str2, stringValue, q10) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        q10 = new Q(continuation);
        Object obj2 = q10.f63553n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = q10.f63555p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, List list, Continuation continuation) {
        C6153b c6153b;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6153b) {
            c6153b = (C6153b) continuation;
            int i11 = c6153b.f63565p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6153b.f63565p = i11 - Integer.MIN_VALUE;
                Object obj = c6153b.f63563n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6153b.f63565p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6153b.f63565p = 1;
                    if (G10.x(str, list, c6153b) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6153b = new C6153b(continuation);
        Object obj2 = c6153b.f63563n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6153b.f63565p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x032d, code lost:
    
        if (r2 != 0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(MessageEntity messageEntity, boolean z10, Continuation continuation) {
        R r10;
        Object obj;
        Object coroutine_suspended;
        int i10;
        Ref.ObjectRef objectRef;
        C6152a c6152a;
        Gson o10;
        Object G10;
        MessageEntity messageEntity2;
        MessageEntity messageEntity3;
        Ref.ObjectRef objectRef2;
        C6152a c6152a2;
        MessageEntity messageEntity4;
        MessageEntity messageEntity5;
        MessageEntity messageEntity6;
        String messageType;
        Message.g gVar;
        Ref.ObjectRef objectRef3;
        MessageEntity messageEntity7;
        T replaceClientTimeWithServerTimeIfAbsent;
        MessageEntity.Time time;
        List list;
        MessageEntity messageEntity8;
        T t10 = messageEntity;
        if (continuation instanceof R) {
            r10 = (R) continuation;
            int i11 = r10.f63562t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r10.f63562t = i11 - Integer.MIN_VALUE;
                obj = r10.f63560r;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = r10.f63562t;
                boolean z11 = false;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = t10;
                    if ((z10 ? this : null) != null) {
                        o10 = o();
                        InterfaceC6253a G11 = G();
                        String chatId = ((MessageEntity) objectRef.element).getChatId();
                        r10.f63556n = this;
                        r10.f63557o = t10;
                        r10.f63558p = objectRef;
                        r10.f63559q = o10;
                        r10.f63562t = 1;
                        G10 = G11.G(chatId, r10);
                        if (G10 != coroutine_suspended) {
                            c6152a = this;
                            messageEntity4 = t10;
                        }
                        return coroutine_suspended;
                    }
                    c6152a = this;
                    messageEntity2 = t10;
                    InterfaceC6253a G12 = c6152a.G();
                    String acknowledgementKey = ((MessageEntity) objectRef.element).getAcknowledgementKey();
                    String chatId2 = ((MessageEntity) objectRef.element).getChatId();
                    String messageId = ((MessageEntity) objectRef.element).getMessageId();
                    r10.f63556n = c6152a;
                    r10.f63557o = messageEntity2;
                    r10.f63558p = objectRef;
                    r10.f63559q = null;
                    r10.f63562t = 2;
                    obj = G12.K(acknowledgementKey, chatId2, messageId, r10);
                    if (obj != coroutine_suspended) {
                        Ref.ObjectRef objectRef4 = objectRef;
                        messageEntity3 = messageEntity2;
                        objectRef2 = objectRef4;
                        c6152a2 = c6152a;
                        messageEntity6 = (MessageEntity) obj;
                        messageType = messageEntity3.getMessageType();
                        gVar = Message.g.Question;
                        if (Intrinsics.areEqual(messageType, gVar.getStringValue())) {
                        }
                        if (((MessageEntity) objectRef2.element).getExtras() == null) {
                        }
                        boolean e10 = i.e(messageEntity6);
                        if (messageEntity6 != null) {
                        }
                        replaceClientTimeWithServerTimeIfAbsent = MessageEntityKt.replaceClientTimeWithServerTimeIfAbsent((MessageEntity) objectRef2.element);
                        objectRef2.element = replaceClientTimeWithServerTimeIfAbsent;
                        return new Pair(replaceClientTimeWithServerTimeIfAbsent, Boxing.boxBoolean(e10));
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        messageEntity7 = (MessageEntity) r10.f63557o;
                        objectRef3 = (Ref.ObjectRef) r10.f63556n;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list == null && (messageEntity8 = (MessageEntity) CollectionsKt.firstOrNull(list)) != null && (!Intrinsics.areEqual(messageEntity8.getMessageId(), ((MessageEntity) objectRef3.element).getMessageId()))) {
                            messageEntity6 = messageEntity7;
                            objectRef2 = objectRef3;
                            z11 = true;
                        } else {
                            messageEntity6 = messageEntity7;
                            objectRef2 = objectRef3;
                        }
                        if (z11) {
                            objectRef2.element = MessageEntity.copy$default((MessageEntity) objectRef2.element, null, null, null, null, null, Message.g.Text.getStringValue(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, null, 134217695, null);
                        }
                        if (((MessageEntity) objectRef2.element).getExtras() == null) {
                            if ((messageEntity6 != null ? messageEntity6.getExtras() : null) != null) {
                                objectRef2.element = MessageEntity.copy$default((MessageEntity) objectRef2.element, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, messageEntity6.getExtras(), null, 100663295, null);
                            }
                        }
                        boolean e102 = i.e(messageEntity6);
                        if (messageEntity6 != null && (time = messageEntity6.getTime()) != null) {
                            if (!Intrinsics.areEqual(messageEntity6.getMessageType(), Message.g.ReopenQuestion.getStringValue())) {
                                replaceClientTimeWithServerTimeIfAbsent = MessageEntity.copy$default((MessageEntity) objectRef2.element, null, null, null, null, null, Message.g.Text.getStringValue(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, MessageEntity.Time.copy$default(messageEntity6.getTime(), ((MessageEntity) objectRef2.element).getTime().getServerTime(), ((MessageEntity) objectRef2.element).getTime().getServerTime(), ((MessageEntity) objectRef2.element).getTime().getPreviousMessageTime(), 0L, 0L, null, 56, null), 67108831, null);
                            } else if (time.getClientTime() > 0) {
                                T t11 = objectRef2.element;
                                replaceClientTimeWithServerTimeIfAbsent = MessageEntity.copy$default((MessageEntity) t11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, MessageEntity.Time.copy$default(((MessageEntity) t11).getTime(), 0L, time.getClientTime(), 0L, 0L, 0L, null, 61, null), 67108863, null);
                            } else {
                                replaceClientTimeWithServerTimeIfAbsent = (MessageEntity) objectRef2.element;
                            }
                        }
                        replaceClientTimeWithServerTimeIfAbsent = MessageEntityKt.replaceClientTimeWithServerTimeIfAbsent((MessageEntity) objectRef2.element);
                        objectRef2.element = replaceClientTimeWithServerTimeIfAbsent;
                        return new Pair(replaceClientTimeWithServerTimeIfAbsent, Boxing.boxBoolean(e102));
                    }
                    objectRef2 = (Ref.ObjectRef) r10.f63558p;
                    messageEntity3 = (MessageEntity) r10.f63557o;
                    c6152a2 = (C6152a) r10.f63556n;
                    ResultKt.throwOnFailure(obj);
                    messageEntity6 = (MessageEntity) obj;
                    messageType = messageEntity3.getMessageType();
                    gVar = Message.g.Question;
                    if (Intrinsics.areEqual(messageType, gVar.getStringValue())) {
                        InterfaceC5321f interfaceC5321f = (InterfaceC5321f) c6152a2.E(((MessageEntity) objectRef2.element).getAcknowledgementKey(), ((MessageEntity) objectRef2.element).getChatId(), gVar).b();
                        if (interfaceC5321f != null) {
                            r10.f63556n = objectRef2;
                            r10.f63557o = messageEntity6;
                            r10.f63558p = null;
                            r10.f63562t = 3;
                            Object t12 = AbstractC5323h.t(interfaceC5321f, r10);
                            if (t12 != coroutine_suspended) {
                                objectRef3 = objectRef2;
                                messageEntity7 = messageEntity6;
                                obj = t12;
                                list = (List) obj;
                                if (list == null) {
                                }
                                messageEntity6 = messageEntity7;
                                objectRef2 = objectRef3;
                            }
                            return coroutine_suspended;
                        }
                        if (z11) {
                        }
                    }
                    if (((MessageEntity) objectRef2.element).getExtras() == null) {
                    }
                    boolean e1022 = i.e(messageEntity6);
                    if (messageEntity6 != null) {
                        if (!Intrinsics.areEqual(messageEntity6.getMessageType(), Message.g.ReopenQuestion.getStringValue())) {
                        }
                    }
                    replaceClientTimeWithServerTimeIfAbsent = MessageEntityKt.replaceClientTimeWithServerTimeIfAbsent((MessageEntity) objectRef2.element);
                    objectRef2.element = replaceClientTimeWithServerTimeIfAbsent;
                    return new Pair(replaceClientTimeWithServerTimeIfAbsent, Boxing.boxBoolean(e1022));
                }
                Gson gson = (Gson) r10.f63559q;
                objectRef = (Ref.ObjectRef) r10.f63558p;
                MessageEntity messageEntity9 = (MessageEntity) r10.f63557o;
                c6152a = (C6152a) r10.f63556n;
                ResultKt.throwOnFailure(obj);
                o10 = gson;
                messageEntity4 = messageEntity9;
                G10 = obj;
                messageEntity5 = (MessageEntity) G10;
                if (messageEntity5 == null) {
                    T t13 = objectRef.element;
                    objectRef.element = MessageEntity.copy$default((MessageEntity) t13, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, MessageEntity.Time.copy$default(((MessageEntity) t13).getTime(), 0L, 0L, messageEntity5.getTime().getServerTime(), 0L, 0L, null, 59, null), 67108863, null);
                } else {
                    messageEntity5 = null;
                }
                o10.v(messageEntity5);
                messageEntity2 = messageEntity4;
                InterfaceC6253a G122 = c6152a.G();
                String acknowledgementKey2 = ((MessageEntity) objectRef.element).getAcknowledgementKey();
                String chatId22 = ((MessageEntity) objectRef.element).getChatId();
                String messageId2 = ((MessageEntity) objectRef.element).getMessageId();
                r10.f63556n = c6152a;
                r10.f63557o = messageEntity2;
                r10.f63558p = objectRef;
                r10.f63559q = null;
                r10.f63562t = 2;
                obj = G122.K(acknowledgementKey2, chatId22, messageId2, r10);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        r10 = new R(continuation);
        obj = r10.f63560r;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = r10.f63562t;
        boolean z112 = false;
        if (i10 != 0) {
        }
        messageEntity5 = (MessageEntity) G10;
        if (messageEntity5 == null) {
        }
        o10.v(messageEntity5);
        messageEntity2 = messageEntity4;
        InterfaceC6253a G1222 = c6152a.G();
        String acknowledgementKey22 = ((MessageEntity) objectRef.element).getAcknowledgementKey();
        String chatId222 = ((MessageEntity) objectRef.element).getChatId();
        String messageId22 = ((MessageEntity) objectRef.element).getMessageId();
        r10.f63556n = c6152a;
        r10.f63557o = messageEntity2;
        r10.f63558p = objectRef;
        r10.f63559q = null;
        r10.f63562t = 2;
        obj = G1222.K(acknowledgementKey22, chatId222, messageId22, r10);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, Message.g gVar, Continuation continuation) {
        C6155d c6155d;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6155d) {
            c6155d = (C6155d) continuation;
            int i11 = c6155d.f63571p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6155d.f63571p = i11 - Integer.MIN_VALUE;
                Object obj = c6155d.f63569n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6155d.f63571p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    String stringValue = gVar.getStringValue();
                    c6155d.f63571p = 1;
                    if (G10.i(str, stringValue, c6155d) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6155d = new C6155d(continuation);
        Object obj2 = c6155d.f63569n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6155d.f63571p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, Continuation continuation) {
        C6154c c6154c;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6154c) {
            c6154c = (C6154c) continuation;
            int i11 = c6154c.f63568p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6154c.f63568p = i11 - Integer.MIN_VALUE;
                Object obj = c6154c.f63566n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6154c.f63568p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6154c.f63568p = 1;
                    if (G10.k(str, str2, c6154c) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6154c = new C6154c(continuation);
        Object obj2 = c6154c.f63566n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6154c.f63568p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(7:22|23|12|13|(0)|16|17))(8:24|25|(5:30|31|(1:33)(1:44)|(10:35|(1:37)|38|(1:40)|23|12|13|(0)|16|17)(1:42)|41)|45|31|(0)(0)|(0)(0)|41)))|48|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r1.H(r18, r2) == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0030, B:12:0x00be, B:22:0x0040, B:23:0x00a7, B:25:0x0047, B:27:0x004f, B:35:0x0061, B:37:0x0075, B:38:0x0089, B:42:0x00b1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0030, B:12:0x00be, B:22:0x0040, B:23:0x00a7, B:25:0x0047, B:27:0x004f, B:35:0x0061, B:37:0x0075, B:38:0x0089, B:42:0x00b1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, List list, Continuation continuation) {
        C6156e c6156e;
        C6152a c6152a;
        int i10;
        Throwable m150exceptionOrNullimpl;
        boolean z10;
        if (continuation instanceof C6156e) {
            c6156e = (C6156e) continuation;
            int i11 = c6156e.f63574p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6156e.f63574p = i11 - Integer.MIN_VALUE;
                c6152a = this;
                Object obj = c6156e.f63572n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6156e.f63574p;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                        Boxing.boxInt(((Number) obj).intValue());
                        Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        return b.a(m147constructorimpl);
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                    if (m150exceptionOrNullimpl != null) {
                        LiveChatUtil.log(m150exceptionOrNullimpl);
                    }
                    return b.a(m147constructorimpl2);
                }
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z10 = false;
                    if ((z10 ? c6152a : null) == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SELECT * from messages WHERE chat_id = '");
                        sb2.append(str);
                        sb2.append("' AND (");
                        sb2.append(list != null ? CollectionsKt.joinToString$default(list, " OR ", null, null, 0, null, C6157f.f63575d, 30, null) : null);
                        sb2.append(')');
                        String sb3 = sb2.toString();
                        InterfaceC6253a G10 = c6152a.G();
                        E2.a aVar = new E2.a(sb3);
                        c6156e.f63574p = 1;
                        obj = G10.m(aVar, c6156e);
                        if (obj == coroutine_suspended) {
                        }
                        Boxing.boxInt(((Number) obj).intValue());
                        Object m147constructorimpl22 = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl22);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        return b.a(m147constructorimpl22);
                    }
                    InterfaceC6253a G11 = c6152a.G();
                    c6156e.f63574p = 2;
                    return coroutine_suspended;
                }
                z10 = true;
                if ((z10 ? c6152a : null) == null) {
                }
                return coroutine_suspended;
            }
        }
        c6152a = this;
        c6156e = c6152a.new C6156e(continuation);
        Object obj2 = c6156e.f63572n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6156e.f63574p;
        if (i10 == 0) {
        }
    }

    public final Object k(String str, Continuation continuation) {
        Object B10 = G().B(str, "trigger_temp_chid", continuation);
        return B10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? B10 : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, Continuation continuation) {
        C6158g c6158g;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6158g) {
            c6158g = (C6158g) continuation;
            int i11 = c6158g.f63578p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6158g.f63578p = i11 - Integer.MIN_VALUE;
                Object obj = c6158g.f63576n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6158g.f63578p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    String str2 = "UPDATE messages SET status = " + Message.f.Failure.ordinal() + " WHERE " + n(str) + " (status = " + Message.f.Sending.ordinal() + " or status = " + Message.f.Uploading.ordinal() + ')';
                    InterfaceC6253a G10 = G();
                    E2.a aVar = new E2.a(str2);
                    c6158g.f63578p = 1;
                    if (G10.F(aVar, c6158g) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6158g = new C6158g(continuation);
        Object obj2 = c6158g.f63576n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6158g.f63578p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    public final String n(String str) {
        String str2;
        if (str != null) {
            str2 = "chat_id = '" + str + "' AND ";
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public final Gson o() {
        return (Gson) this.f63492b.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, Continuation continuation) {
        C6159h c6159h;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6159h) {
            c6159h = (C6159h) continuation;
            int i11 = c6159h.f63581p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6159h.f63581p = i11 - Integer.MIN_VALUE;
                Object obj = c6159h.f63579n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6159h.f63581p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6159h.f63581p = 1;
                    obj = G10.v(str, c6159h);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6159h = new C6159h(continuation);
        Object obj2 = c6159h.f63579n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6159h.f63581p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, Continuation continuation) {
        C6160i c6160i;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6160i) {
            c6160i = (C6160i) continuation;
            int i11 = c6160i.f63584p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6160i.f63584p = i11 - Integer.MIN_VALUE;
                Object obj = c6160i.f63582n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6160i.f63584p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6160i.f63584p = 1;
                    obj = G10.G(str, c6160i);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6160i = new C6160i(continuation);
        Object obj2 = c6160i.f63582n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6160i.f63584p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    public final C5582a r() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(G().z());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return b.a(m147constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Continuation continuation) {
        C6161j c6161j;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6161j) {
            c6161j = (C6161j) continuation;
            int i11 = c6161j.f63587p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6161j.f63587p = i11 - Integer.MIN_VALUE;
                Object obj = c6161j.f63585n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6161j.f63587p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6161j.f63587p = 1;
                    obj = G10.c(c6161j);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((List) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6161j = new C6161j(continuation);
        Object obj2 = c6161j.f63585n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6161j.f63587p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((List) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, Continuation continuation) {
        C6162k c6162k;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6162k) {
            c6162k = (C6162k) continuation;
            int i11 = c6162k.f63590p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6162k.f63590p = i11 - Integer.MIN_VALUE;
                Object obj = c6162k.f63588n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6162k.f63590p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6162k.f63590p = 1;
                    obj = G10.f0(str, c6162k);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((Long) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6162k = new C6162k(continuation);
        Object obj2 = c6162k.f63588n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6162k.f63590p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((Long) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, Continuation continuation) {
        C6163l c6163l;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6163l) {
            c6163l = (C6163l) continuation;
            int i11 = c6163l.f63593p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6163l.f63593p = i11 - Integer.MIN_VALUE;
                Object obj = c6163l.f63591n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6163l.f63593p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6163l.f63593p = 1;
                    obj = G10.h(str, c6163l);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6163l = new C6163l(continuation);
        Object obj2 = c6163l.f63591n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6163l.f63593p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, Continuation continuation) {
        C6164m c6164m;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6164m) {
            c6164m = (C6164m) continuation;
            int i11 = c6164m.f63596p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6164m.f63596p = i11 - Integer.MIN_VALUE;
                Object obj = c6164m.f63594n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6164m.f63596p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6164m.f63596p = 1;
                    obj = G10.O(str, c6164m);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6164m = new C6164m(continuation);
        Object obj2 = c6164m.f63594n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6164m.f63596p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|29|6|7|8|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        C6165n c6165n;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6165n) {
            c6165n = (C6165n) continuation;
            int i11 = c6165n.f63599p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6165n.f63599p = i11 - Integer.MIN_VALUE;
                C6165n c6165n2 = c6165n;
                Object obj = c6165n2.f63597n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6165n2.f63599p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6165n2.f63599p = 1;
                    obj = G10.M(str, str2, str3, str4, str5, c6165n2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6165n = new C6165n(continuation);
        C6165n c6165n22 = c6165n;
        Object obj2 = c6165n22.f63597n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6165n22.f63599p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(5:21|(1:23)(1:28)|24|25|(1:27))|11|12|(1:14)|15|16))|31|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, String str2, boolean z10, Continuation continuation) {
        C6166o c6166o;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6166o) {
            c6166o = (C6166o) continuation;
            int i11 = c6166o.f63602p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6166o.f63602p = i11 - Integer.MIN_VALUE;
                Object obj = c6166o.f63600n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6166o.f63602p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM messages WHERE (chat_id = '");
                    sb2.append(str2);
                    sb2.append("' OR conversation_id = '");
                    sb2.append(str);
                    sb2.append("') ORDER BY server_time ");
                    sb2.append(z10 ? "ASC" : "DESC");
                    String sb3 = sb2.toString();
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    E2.a aVar = new E2.a(sb3);
                    c6166o.f63602p = 1;
                    obj = G10.J(aVar, c6166o);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6166o = new C6166o(continuation);
        Object obj2 = c6166o.f63600n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6166o.f63602p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|29|6|7|8|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        C6167p c6167p;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6167p) {
            c6167p = (C6167p) continuation;
            int i11 = c6167p.f63605p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6167p.f63605p = i11 - Integer.MIN_VALUE;
                C6167p c6167p2 = c6167p;
                Object obj = c6167p2.f63603n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6167p2.f63605p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6253a G10 = G();
                    c6167p2.f63605p = 1;
                    obj = G10.P(str, str2, str3, str4, str5, c6167p2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((MessageEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return b.a(m147constructorimpl);
            }
        }
        c6167p = new C6167p(continuation);
        C6167p c6167p22 = c6167p;
        Object obj2 = c6167p22.f63603n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6167p22.f63605p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((MessageEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return b.a(m147constructorimpl2);
    }

    public C6152a() {
        this.f63491a = LazyKt.lazy(x.f63623d);
        this.f63492b = LazyKt.lazy(t.f63613d);
    }
}
