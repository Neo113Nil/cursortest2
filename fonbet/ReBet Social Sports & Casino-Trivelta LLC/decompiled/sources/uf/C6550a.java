package uf;

import Ph.AbstractC1459k;
import Ph.F0;
import ae.C1934a;
import android.app.Application;
import ce.AbstractC2916a;
import com.facebook.hermes.intl.Constants;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.modules.messages.domain.entities.MessageProgress;
import com.zoho.livechat.android.modules.messages.domain.entities.MessageSyncData;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import ie.EnumC4544a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import me.C5582a;
import od.t;
import og.AbstractC5891c;
import og.AbstractC5895g;
import og.AbstractC5896h;
import og.i;
import og.j;
import og.m;
import org.jetbrains.annotations.NotNull;
import qf.C6152a;
import rd.b;
import re.C6223E;
import re.C6224F;
import re.C6228J;
import re.C6231M;
import re.C6234P;
import sf.C6364a;
import td.C6461a;
import vf.AbstractC6687a;
import vf.AbstractC6688b;
import wf.EnumC6745a;
import xf.InterfaceC6823a;
import yf.y;
import ze.C6959a;

/* renamed from: uf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6550a implements InterfaceC6823a {

    /* renamed from: k, reason: collision with root package name */
    public static C6550a f66358k;

    /* renamed from: a, reason: collision with root package name */
    public final Application f66360a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f66361b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f66362c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f66363d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f66364e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f66365f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f66366g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f66367h;

    /* renamed from: i, reason: collision with root package name */
    public final Function2 f66368i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0924a f66357j = new C0924a(null);

    /* renamed from: l, reason: collision with root package name */
    public static Object f66359l = new Object();

    /* renamed from: uf.a$A */
    public static final class A extends Lambda implements Function2 {
        public A() {
            super(2);
        }

        public final Boolean a(boolean z10, String chatId) {
            long longValue;
            Long longOrNull;
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            LiveChatUtil.log("FeedbackTest");
            Boolean bool = null;
            String property = System.getProperty("feedback_cards_deletion_expiry_duration", null);
            if (property == null || (longOrNull = StringsKt.toLongOrNull(property)) == null) {
                Long l10 = (Long) C6550a.this.o0().B(Ce.a.a(De.a.FeedbackValidityDuration), 86400L).b();
                longValue = (l10 != null ? l10.longValue() : 86400L) * 60 * 1000;
            } else {
                longValue = longOrNull.longValue();
            }
            long f10 = b.f();
            boolean z11 = false;
            if (!z10 || !Intrinsics.areEqual(Ae.a.m(C6550a.this.o0(), Ce.a.a(De.a.ShowFeedbackAfterSkip), false, 2, null).b(), Boolean.TRUE)) {
                SalesIQChat chat$default = ConversationsLocalDataSource.getChat$default(C6550a.this.q0(), chatId, false, 2, null);
                if (chat$default != null) {
                    if (i.d(Long.valueOf(chat$default.getChatEndTime()), 0) && f10 > chat$default.getChatEndTime() + longValue) {
                        z11 = true;
                    }
                    bool = Boolean.valueOf(z11);
                }
                z11 = i.i(bool);
            }
            return Boolean.valueOf(z11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* renamed from: uf.a$B */
    public static final class B extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f66370n;

        /* renamed from: p, reason: collision with root package name */
        public int f66372p;

        public B(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66370n = obj;
            this.f66372p |= Integer.MIN_VALUE;
            return C6550a.this.y(null, null, this);
        }
    }

    /* renamed from: uf.a$C */
    public static final class C extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C f66373d = new C();

        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6152a invoke() {
            return C6152a.f63488c.a();
        }
    }

    /* renamed from: uf.a$D */
    public static final class D extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final D f66374d = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6364a invoke() {
            return C6364a.f64858c.a();
        }
    }

    /* renamed from: uf.a$E */
    public static final class E extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final E f66375d = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(new HashMap());
        }
    }

    /* renamed from: uf.a$F */
    public static final class F extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66376n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66377o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66378p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66379q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f66380r;

        /* renamed from: t, reason: collision with root package name */
        public int f66382t;

        public F(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66380r = obj;
            this.f66382t |= Integer.MIN_VALUE;
            return C6550a.this.e(null, null, this);
        }
    }

    /* renamed from: uf.a$G */
    public static final class G extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66383n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66384o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66385p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66386q;

        /* renamed from: s, reason: collision with root package name */
        public int f66388s;

        public G(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66386q = obj;
            this.f66388s |= Integer.MIN_VALUE;
            return C6550a.this.p(null, null, this);
        }
    }

    /* renamed from: uf.a$H */
    public static final class H extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66389n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66390o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f66391p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66392q;

        /* renamed from: s, reason: collision with root package name */
        public int f66394s;

        public H(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66392q = obj;
            this.f66394s |= Integer.MIN_VALUE;
            return C6550a.this.B0(null, null, false, this);
        }
    }

    /* renamed from: uf.a$I */
    public static final class I extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66395n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66396o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66397p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66398q;

        /* renamed from: s, reason: collision with root package name */
        public int f66400s;

        public I(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66398q = obj;
            this.f66400s |= Integer.MIN_VALUE;
            return C6550a.this.D(null, this);
        }
    }

    /* renamed from: uf.a$J */
    public static final class J extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66401n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66402o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66403p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66404q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66405r;

        /* renamed from: s, reason: collision with root package name */
        public Object f66406s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f66407t;

        /* renamed from: v, reason: collision with root package name */
        public int f66409v;

        public J(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66407t = obj;
            this.f66409v |= Integer.MIN_VALUE;
            return C6550a.this.d(null, null, this);
        }
    }

    /* renamed from: uf.a$K */
    public static final class K extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66410n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66411o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66412p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66413q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66414r;

        /* renamed from: s, reason: collision with root package name */
        public Object f66415s;

        /* renamed from: t, reason: collision with root package name */
        public Object f66416t;

        /* renamed from: u, reason: collision with root package name */
        public Object f66417u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f66418v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f66419w;

        /* renamed from: y, reason: collision with root package name */
        public int f66421y;

        public K(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66419w = obj;
            this.f66421y |= Integer.MIN_VALUE;
            return C6550a.this.m(null, null, this);
        }
    }

    /* renamed from: uf.a$L */
    public static final class L extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66422n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66423o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66424p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66425q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66426r;

        /* renamed from: s, reason: collision with root package name */
        public Object f66427s;

        /* renamed from: t, reason: collision with root package name */
        public Object f66428t;

        /* renamed from: u, reason: collision with root package name */
        public Object f66429u;

        /* renamed from: v, reason: collision with root package name */
        public Object f66430v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f66431w;

        /* renamed from: y, reason: collision with root package name */
        public int f66433y;

        public L(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66431w = obj;
            this.f66433y |= Integer.MIN_VALUE;
            return C6550a.this.z(null, null, null, null, null, this);
        }
    }

    /* renamed from: uf.a$M */
    public static final class M extends Lambda implements Function2 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f66435e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(String str) {
            super(2);
            this.f66435e = str;
        }

        public final void a(String messageId, Integer num) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            C6550a.this.F0(this.f66435e, messageId, num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Integer) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$N */
    public static final class N extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public int f66436A;

        /* renamed from: n, reason: collision with root package name */
        public Object f66437n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66438o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66439p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66440q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66441r;

        /* renamed from: s, reason: collision with root package name */
        public Object f66442s;

        /* renamed from: t, reason: collision with root package name */
        public Object f66443t;

        /* renamed from: u, reason: collision with root package name */
        public Object f66444u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f66445v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f66446w;

        /* renamed from: x, reason: collision with root package name */
        public int f66447x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f66448y;

        public N(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66448y = obj;
            this.f66436A |= Integer.MIN_VALUE;
            return C6550a.this.g(null, null, null, null, null, false, false, false, this);
        }
    }

    /* renamed from: uf.a$O */
    public static final class O extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66450n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66451o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f66452p;

        /* renamed from: q, reason: collision with root package name */
        public int f66453q;

        public O(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66452p = obj;
            this.f66453q |= Integer.MIN_VALUE;
            return C6550a.D0(null, null, null, this);
        }
    }

    /* renamed from: uf.a$P */
    public static final class P extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public Object f66454A;

        /* renamed from: B, reason: collision with root package name */
        public Object f66455B;

        /* renamed from: C, reason: collision with root package name */
        public Object f66456C;

        /* renamed from: D, reason: collision with root package name */
        public Object f66457D;

        /* renamed from: E, reason: collision with root package name */
        public Object f66458E;

        /* renamed from: F, reason: collision with root package name */
        public Object f66459F;

        /* renamed from: G, reason: collision with root package name */
        public Object f66460G;

        /* renamed from: H, reason: collision with root package name */
        public Object f66461H;

        /* renamed from: I, reason: collision with root package name */
        public Object f66462I;

        /* renamed from: J, reason: collision with root package name */
        public Object f66463J;

        /* renamed from: K, reason: collision with root package name */
        public Object f66464K;

        /* renamed from: L, reason: collision with root package name */
        public Object f66465L;

        /* renamed from: O, reason: collision with root package name */
        public boolean f66466O;

        /* renamed from: P, reason: collision with root package name */
        public boolean f66467P;

        /* renamed from: R, reason: collision with root package name */
        public /* synthetic */ Object f66468R;

        /* renamed from: V, reason: collision with root package name */
        public int f66470V;

        /* renamed from: n, reason: collision with root package name */
        public Object f66471n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66472o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66473p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66474q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66475r;

        /* renamed from: s, reason: collision with root package name */
        public Object f66476s;

        /* renamed from: t, reason: collision with root package name */
        public Object f66477t;

        /* renamed from: u, reason: collision with root package name */
        public Object f66478u;

        /* renamed from: v, reason: collision with root package name */
        public Object f66479v;

        /* renamed from: w, reason: collision with root package name */
        public Object f66480w;

        /* renamed from: x, reason: collision with root package name */
        public Object f66481x;

        /* renamed from: y, reason: collision with root package name */
        public Object f66482y;

        /* renamed from: z, reason: collision with root package name */
        public Object f66483z;

        public P(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66468R = obj;
            this.f66470V |= Integer.MIN_VALUE;
            return C6550a.this.P(null, null, null, null, null, null, null, null, null, null, null, null, false, false, this);
        }
    }

    /* renamed from: uf.a$Q */
    public static final class Q extends Lambda implements Function2 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f66485e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(String str) {
            super(2);
            this.f66485e = str;
        }

        public final void a(String messageId, Integer num) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            C6550a.this.F0(this.f66485e, messageId, num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Integer) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$R */
    public static final class R extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public boolean f66486A;

        /* renamed from: B, reason: collision with root package name */
        public int f66487B;

        /* renamed from: C, reason: collision with root package name */
        public long f66488C;

        /* renamed from: D, reason: collision with root package name */
        public /* synthetic */ Object f66489D;

        /* renamed from: F, reason: collision with root package name */
        public int f66491F;

        /* renamed from: n, reason: collision with root package name */
        public Object f66492n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66493o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66494p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66495q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66496r;

        /* renamed from: s, reason: collision with root package name */
        public Object f66497s;

        /* renamed from: t, reason: collision with root package name */
        public Object f66498t;

        /* renamed from: u, reason: collision with root package name */
        public Object f66499u;

        /* renamed from: v, reason: collision with root package name */
        public Object f66500v;

        /* renamed from: w, reason: collision with root package name */
        public Object f66501w;

        /* renamed from: x, reason: collision with root package name */
        public Object f66502x;

        /* renamed from: y, reason: collision with root package name */
        public Object f66503y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f66504z;

        public R(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66489D = obj;
            this.f66491F |= Integer.MIN_VALUE;
            return C6550a.this.L(null, null, null, null, null, null, null, false, null, false, false, this);
        }
    }

    /* renamed from: uf.a$S */
    public static final class S extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66505n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66506o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66507p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66508q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66509r;

        /* renamed from: s, reason: collision with root package name */
        public long f66510s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f66511t;

        /* renamed from: v, reason: collision with root package name */
        public int f66513v;

        public S(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66511t = obj;
            this.f66513v |= Integer.MIN_VALUE;
            return C6550a.this.E0(null, null, null, null, 0L, 0L, 0, this);
        }
    }

    /* renamed from: uf.a$T */
    public static final class T extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f66514n;

        /* renamed from: o, reason: collision with root package name */
        public int f66515o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f66517q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Integer f66518r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f66519s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(String str, Integer num, String str2, Continuation continuation) {
            super(2, continuation);
            this.f66517q = str;
            this.f66518r = num;
            this.f66519s = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C6550a.this.new T(this.f66517q, this.f66518r, this.f66519s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((T) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        
            if (r2 == null) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.y yVar;
            ?? mutableList;
            MessageProgress messageProgress;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f66515o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.y w02 = C6550a.this.w0();
                kotlinx.coroutines.flow.y w03 = C6550a.this.w0();
                this.f66514n = w02;
                this.f66515o = 1;
                Object r10 = AbstractC5323h.r(w03, this);
                if (r10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                yVar = w02;
                obj = r10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (kotlinx.coroutines.flow.y) this.f66514n;
                ResultKt.throwOnFailure(obj);
            }
            Map mutableMap = MapsKt.toMutableMap((Map) obj);
            String str = this.f66517q;
            Integer num = this.f66518r;
            String str2 = this.f66519s;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            List list = (List) mutableMap.get(str);
            T t10 = 0;
            if (list != null && (mutableList = CollectionsKt.toMutableList((Collection) list)) != 0) {
                Iterator it = mutableList.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((MessageProgress) it.next()).getMessageId(), str2)) {
                        break;
                    }
                    i11++;
                }
                if ((i11 > -1 ? mutableMap : null) != null) {
                    Object remove = mutableList.remove(i11);
                    if (num == null) {
                        remove = null;
                    }
                    MessageProgress messageProgress2 = (MessageProgress) remove;
                    if (messageProgress2 != null) {
                        Intrinsics.checkNotNull(num);
                        messageProgress = MessageProgress.copy$default(messageProgress2, null, num.intValue(), 1, null);
                    } else {
                        messageProgress = null;
                    }
                }
                messageProgress = num != null ? new MessageProgress(str2, num.intValue()) : null;
                if (messageProgress != null) {
                    Boxing.boxBoolean(mutableList.add(messageProgress));
                }
                objectRef.element = mutableList;
            }
            List list2 = (List) objectRef.element;
            if (list2 == null) {
                if ((Boxing.boxBoolean(i.e(num)).booleanValue() ? mutableMap : null) != null) {
                    t10 = new ArrayList();
                    Intrinsics.checkNotNull(num);
                    t10.add(new MessageProgress(str2, num.intValue()));
                }
            } else {
                t10 = list2;
            }
            objectRef.element = t10;
            Collection collection = (Collection) t10;
            if (collection == null || collection.isEmpty()) {
                mutableMap.remove(str);
            } else {
                T t11 = objectRef.element;
                Intrinsics.checkNotNull(t11);
                mutableMap.put(str, t11);
            }
            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.collections.List<com.zoho.livechat.android.modules.messages.domain.entities.MessageProgress>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.collections.List<com.zoho.livechat.android.modules.messages.domain.entities.MessageProgress>> }");
            yVar.setValue((HashMap) mutableMap);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$U */
    public static final class U extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66520n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66521o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f66522p;

        /* renamed from: r, reason: collision with root package name */
        public int f66524r;

        public U(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66522p = obj;
            this.f66524r |= Integer.MIN_VALUE;
            return C6550a.this.C(null, this);
        }
    }

    /* renamed from: uf.a$V */
    public static final class V extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f66525n;

        /* renamed from: p, reason: collision with root package name */
        public int f66527p;

        public V(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66525n = obj;
            this.f66527p |= Integer.MIN_VALUE;
            return C6550a.this.J0(null, null, this);
        }
    }

    /* renamed from: uf.a$W */
    public static final class W extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66528n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66529o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66530p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66531q;

        /* renamed from: s, reason: collision with root package name */
        public int f66533s;

        public W(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66531q = obj;
            this.f66533s |= Integer.MIN_VALUE;
            return C6550a.this.K0(null, null, this);
        }
    }

    /* renamed from: uf.a$a, reason: collision with other inner class name */
    public static final class C0924a {
        public /* synthetic */ C0924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6550a a(Application application) {
            C6550a c6550a;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (C6550a.f66359l) {
                c6550a = C6550a.f66358k;
                if (c6550a == null) {
                    c6550a = new C6550a(application, null);
                    C6550a.f66358k = c6550a;
                }
            }
            return c6550a;
        }

        public C0924a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: uf.a$b, reason: case insensitive filesystem */
    public static final class EnumC6551b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC6551b[] $VALUES;
        public static final EnumC6551b GeneralRetry = new EnumC6551b("GeneralRetry", 0);
        public static final EnumC6551b WmsFailedRetry = new EnumC6551b("WmsFailedRetry", 1);

        private static final /* synthetic */ EnumC6551b[] $values() {
            return new EnumC6551b[]{GeneralRetry, WmsFailedRetry};
        }

        static {
            EnumC6551b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EnumC6551b(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<EnumC6551b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC6551b valueOf(String str) {
            return (EnumC6551b) Enum.valueOf(EnumC6551b.class, str);
        }

        public static EnumC6551b[] values() {
            return (EnumC6551b[]) $VALUES.clone();
        }
    }

    /* renamed from: uf.a$c, reason: case insensitive filesystem */
    public /* synthetic */ class C6552c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6745a.values().length];
            try {
                iArr[EnumC6745a.Read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6745a.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6745a.Reply.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6745a.Delete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: uf.a$d, reason: case insensitive filesystem */
    public static final class C6553d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f66534n;

        /* renamed from: p, reason: collision with root package name */
        public int f66536p;

        public C6553d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66534n = obj;
            this.f66536p |= Integer.MIN_VALUE;
            return C6550a.this.o(null, null, false, this);
        }
    }

    /* renamed from: uf.a$e, reason: case insensitive filesystem */
    public static final class C6554e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66537n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66538o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66539p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66540q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f66541r;

        /* renamed from: t, reason: collision with root package name */
        public int f66543t;

        public C6554e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66541r = obj;
            this.f66543t |= Integer.MIN_VALUE;
            return C6550a.this.A(null, null, this);
        }
    }

    /* renamed from: uf.a$f, reason: case insensitive filesystem */
    public static final class C6555f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f66544n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66545o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66546p;

        /* renamed from: q, reason: collision with root package name */
        public Object f66547q;

        /* renamed from: r, reason: collision with root package name */
        public Object f66548r;

        /* renamed from: s, reason: collision with root package name */
        public int f66549s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f66551u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f66552v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f66553w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6555f(String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f66551u = str;
            this.f66552v = str2;
            this.f66553w = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C6550a.this.new C6555f(this.f66551u, this.f66552v, this.f66553w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6555f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0110, code lost:
        
            if (r0.c0(r2, r5, r3, r12) != r7) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
        
            if (Ph.AbstractC1440a0.a(r4, r12) == r7) goto L47;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:9:0x001a, B:10:0x0113, B:21:0x00d9, B:23:0x00e3, B:26:0x00f0, B:29:0x00f7), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v2, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v7, types: [Wh.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Long longOrNull;
            C6550a c6550a;
            String str;
            String str2;
            String str3;
            Wh.a aVar;
            Object w10;
            Wh.a aVar2;
            MessageEntity messageEntity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f66549s;
            ?? r12 = 3;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    LiveChatUtil.log("WmsDelay, onMessageSent Success");
                    String property = System.getProperty("wms_message_waiting_threshold_duration", "10000");
                    if (property != null && (longOrNull = StringsKt.toLongOrNull(property)) != null) {
                        long longValue = longOrNull.longValue();
                        this.f66549s = 1;
                    }
                } else if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 == 2) {
                        String str4 = (String) this.f66548r;
                        str2 = (String) this.f66547q;
                        str = (String) this.f66546p;
                        C6550a c6550a2 = (C6550a) this.f66545o;
                        Wh.a aVar3 = (Wh.a) this.f66544n;
                        ResultKt.throwOnFailure(obj);
                        c6550a = c6550a2;
                        aVar = aVar3;
                        str3 = str4;
                        try {
                            LiveChatUtil.log("WmsDelay, onMessageSent inside Lock");
                            C6152a u02 = c6550a.u0();
                            this.f66544n = aVar;
                            this.f66545o = c6550a;
                            this.f66546p = str2;
                            this.f66547q = str3;
                            this.f66548r = null;
                            this.f66549s = 3;
                            w10 = u02.w(str, str2, null, null, str3, this);
                            if (w10 != coroutine_suspended) {
                                aVar2 = aVar;
                                messageEntity = (MessageEntity) ((C5582a) w10).b();
                                if (messageEntity != null) {
                                }
                                LiveChatUtil.log("WmsDelay, onMessageSent Status updated to WmsFailure");
                                C6152a u03 = c6550a.u0();
                                Message.f fVar = Message.f.WmsFailure;
                                this.f66544n = aVar2;
                                this.f66545o = null;
                                this.f66546p = null;
                                this.f66547q = null;
                                this.f66549s = 4;
                                r12 = aVar2;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = aVar;
                            r12.g(null);
                            throw th;
                        }
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Wh.a aVar4 = (Wh.a) this.f66544n;
                        ResultKt.throwOnFailure(obj);
                        r12 = aVar4;
                        Unit unit = Unit.INSTANCE;
                        r12.g(null);
                        return Unit.INSTANCE;
                    }
                    String str5 = (String) this.f66547q;
                    String str6 = (String) this.f66546p;
                    C6550a c6550a3 = (C6550a) this.f66545o;
                    Wh.a aVar5 = (Wh.a) this.f66544n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str3 = str5;
                        c6550a = c6550a3;
                        w10 = obj;
                        str2 = str6;
                        aVar2 = aVar5;
                        messageEntity = (MessageEntity) ((C5582a) w10).b();
                        if (messageEntity != null) {
                            Integer status = messageEntity.getStatus();
                            int ordinal = Message.f.Sent.ordinal();
                            if (status != null && status.intValue() == ordinal) {
                                r12 = aVar2;
                                Unit unit2 = Unit.INSTANCE;
                                r12.g(null);
                                return Unit.INSTANCE;
                            }
                        }
                        LiveChatUtil.log("WmsDelay, onMessageSent Status updated to WmsFailure");
                        C6152a u032 = c6550a.u0();
                        Message.f fVar2 = Message.f.WmsFailure;
                        this.f66544n = aVar2;
                        this.f66545o = null;
                        this.f66546p = null;
                        this.f66547q = null;
                        this.f66549s = 4;
                        r12 = aVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        r12 = aVar5;
                        r12.g(null);
                        throw th;
                    }
                }
                LiveChatUtil.log("WmsDelay, onMessageSent released");
                Wh.a d10 = C6461a.C0913a.f65814a.d();
                C6550a c6550a4 = C6550a.this;
                String str7 = this.f66551u;
                String str8 = this.f66552v;
                String str9 = this.f66553w;
                this.f66544n = d10;
                this.f66545o = c6550a4;
                this.f66546p = str7;
                this.f66547q = str8;
                this.f66548r = str9;
                this.f66549s = 2;
                if (d10.f(null, this) != coroutine_suspended) {
                    c6550a = c6550a4;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    aVar = d10;
                    LiveChatUtil.log("WmsDelay, onMessageSent inside Lock");
                    C6152a u022 = c6550a.u0();
                    this.f66544n = aVar;
                    this.f66545o = c6550a;
                    this.f66546p = str2;
                    this.f66547q = str3;
                    this.f66548r = null;
                    this.f66549s = 3;
                    w10 = u022.w(str, str2, null, null, str3, this);
                    if (w10 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* renamed from: uf.a$g, reason: case insensitive filesystem */
    public static final class C6556g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66554n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66555o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66556p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66557q;

        /* renamed from: s, reason: collision with root package name */
        public int f66559s;

        public C6556g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66557q = obj;
            this.f66559s |= Integer.MIN_VALUE;
            return C6550a.this.k0(null, null, this);
        }
    }

    /* renamed from: uf.a$h, reason: case insensitive filesystem */
    public static final class C6557h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66560n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66561o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66562p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66563q;

        /* renamed from: s, reason: collision with root package name */
        public int f66565s;

        public C6557h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66563q = obj;
            this.f66565s |= Integer.MIN_VALUE;
            return C6550a.this.w(null, null, this);
        }
    }

    /* renamed from: uf.a$i, reason: case insensitive filesystem */
    public static final class C6558i extends Lambda implements Function0 {
        public C6558i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(C6550a.this.f66360a);
        }
    }

    /* renamed from: uf.a$j, reason: case insensitive filesystem */
    public static final class C6559j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6559j f66567d = new C6559j();

        public C6559j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1934a invoke() {
            return C1934a.f15123b.a();
        }
    }

    /* renamed from: uf.a$k, reason: case insensitive filesystem */
    public static final class C6560k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6560k f66568d = new C6560k();

        public C6560k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConversationsLocalDataSource invoke() {
            return ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        }
    }

    /* renamed from: uf.a$l, reason: case insensitive filesystem */
    public static final class C6561l extends Lambda implements Function0 {
        public C6561l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            return Ke.a.f6496j.a(C6550a.this.f66360a);
        }
    }

    /* renamed from: uf.a$m, reason: case insensitive filesystem */
    public static final class C6562m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66570n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66571o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f66572p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66573q;

        /* renamed from: s, reason: collision with root package name */
        public int f66575s;

        public C6562m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66573q = obj;
            this.f66575s |= Integer.MIN_VALUE;
            return C6550a.this.t(null, false, this);
        }
    }

    /* renamed from: uf.a$n, reason: case insensitive filesystem */
    public static final class C6563n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66576n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66577o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66578p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f66579q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f66580r;

        /* renamed from: t, reason: collision with root package name */
        public int f66582t;

        public C6563n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66580r = obj;
            this.f66582t |= Integer.MIN_VALUE;
            return C6550a.this.K(null, null, false, this);
        }
    }

    /* renamed from: uf.a$o, reason: case insensitive filesystem */
    public static final class C6564o extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f66583n;

        /* renamed from: p, reason: collision with root package name */
        public int f66585p;

        public C6564o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66583n = obj;
            this.f66585p |= Integer.MIN_VALUE;
            return C6550a.this.H(null, null, this);
        }
    }

    /* renamed from: uf.a$p, reason: case insensitive filesystem */
    public static final class C6565p extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66586n;

        /* renamed from: o, reason: collision with root package name */
        public Object f66587o;

        /* renamed from: p, reason: collision with root package name */
        public Object f66588p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f66589q;

        /* renamed from: s, reason: collision with root package name */
        public int f66591s;

        public C6565p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66589q = obj;
            this.f66591s |= Integer.MIN_VALUE;
            return C6550a.this.l(null, null, this);
        }
    }

    /* renamed from: uf.a$q, reason: case insensitive filesystem */
    public static final class C6566q extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66592n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f66593o;

        /* renamed from: q, reason: collision with root package name */
        public int f66595q;

        public C6566q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66593o = obj;
            this.f66595q |= Integer.MIN_VALUE;
            return C6550a.this.r(null, null, null, this);
        }
    }

    /* renamed from: uf.a$r, reason: case insensitive filesystem */
    public static final class C6567r implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f66596a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C6550a f66597b;

        /* renamed from: uf.a$r$a, reason: collision with other inner class name */
        public static final class C0925a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f66598a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C6550a f66599b;

            /* renamed from: uf.a$r$a$a, reason: collision with other inner class name */
            public static final class C0926a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f66600n;

                /* renamed from: o, reason: collision with root package name */
                public int f66601o;

                public C0926a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66600n = obj;
                    this.f66601o |= Integer.MIN_VALUE;
                    return C0925a.this.emit(null, this);
                }
            }

            public C0925a(InterfaceC5322g interfaceC5322g, C6550a c6550a) {
                this.f66598a = interfaceC5322g;
                this.f66599b = c6550a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0926a c0926a;
                int i10;
                if (continuation instanceof C0926a) {
                    c0926a = (C0926a) continuation;
                    int i11 = c0926a.f66601o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0926a.f66601o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0926a.f66600n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0926a.f66601o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f66598a;
                            List h10 = MessageRoomToDomainKt.h((List) obj, this.f66599b.f66360a, this.f66599b.s0(), false, this.f66599b.y0(), 4, null);
                            c0926a.f66601o = 1;
                            if (interfaceC5322g.emit(h10, c0926a) == coroutine_suspended) {
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
                c0926a = new C0926a(continuation);
                Object obj22 = c0926a.f66600n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0926a.f66601o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C6567r(InterfaceC5321f interfaceC5321f, C6550a c6550a) {
            this.f66596a = interfaceC5321f;
            this.f66597b = c6550a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f66596a.collect(new C0925a(interfaceC5322g, this.f66597b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$s, reason: case insensitive filesystem */
    public static final class C6568s extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66603n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f66604o;

        /* renamed from: q, reason: collision with root package name */
        public int f66606q;

        public C6568s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66604o = obj;
            this.f66606q |= Integer.MIN_VALUE;
            return C6550a.this.c(this);
        }
    }

    /* renamed from: uf.a$t, reason: case insensitive filesystem */
    public static final class C6569t extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f66607n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f66608o;

        /* renamed from: q, reason: collision with root package name */
        public int f66610q;

        public C6569t(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66608o = obj;
            this.f66610q |= Integer.MIN_VALUE;
            return C6550a.this.u(null, null, null, this);
        }
    }

    /* renamed from: uf.a$u, reason: case insensitive filesystem */
    public static final class C6570u implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f66611a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f66612b;

        /* renamed from: uf.a$u$a, reason: collision with other inner class name */
        public static final class C0927a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f66613a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f66614b;

            /* renamed from: uf.a$u$a$a, reason: collision with other inner class name */
            public static final class C0928a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f66615n;

                /* renamed from: o, reason: collision with root package name */
                public int f66616o;

                public C0928a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66615n = obj;
                    this.f66616o |= Integer.MIN_VALUE;
                    return C0927a.this.emit(null, this);
                }
            }

            public C0927a(InterfaceC5322g interfaceC5322g, String str) {
                this.f66613a = interfaceC5322g;
                this.f66614b = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0928a c0928a;
                int i10;
                if (continuation instanceof C0928a) {
                    c0928a = (C0928a) continuation;
                    int i11 = c0928a.f66616o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0928a.f66616o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0928a.f66615n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0928a.f66616o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f66613a;
                            List list = (List) ((HashMap) obj).get(this.f66614b);
                            if (list == null) {
                                list = CollectionsKt.emptyList();
                            }
                            c0928a.f66616o = 1;
                            if (interfaceC5322g.emit(list, c0928a) == coroutine_suspended) {
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
                c0928a = new C0928a(continuation);
                Object obj22 = c0928a.f66615n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0928a.f66616o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C6570u(InterfaceC5321f interfaceC5321f, String str) {
            this.f66611a = interfaceC5321f;
            this.f66612b = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f66611a.collect(new C0927a(interfaceC5322g, this.f66612b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$v, reason: case insensitive filesystem */
    public static final class C6571v implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f66618a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C6550a f66619b;

        /* renamed from: uf.a$v$a, reason: collision with other inner class name */
        public static final class C0929a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f66620a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C6550a f66621b;

            /* renamed from: uf.a$v$a$a, reason: collision with other inner class name */
            public static final class C0930a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f66622n;

                /* renamed from: o, reason: collision with root package name */
                public int f66623o;

                public C0930a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66622n = obj;
                    this.f66623o |= Integer.MIN_VALUE;
                    return C0929a.this.emit(null, this);
                }
            }

            public C0929a(InterfaceC5322g interfaceC5322g, C6550a c6550a) {
                this.f66620a = interfaceC5322g;
                this.f66621b = c6550a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0930a c0930a;
                int i10;
                if (continuation instanceof C0930a) {
                    c0930a = (C0930a) continuation;
                    int i11 = c0930a.f66623o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0930a.f66623o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0930a.f66622n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0930a.f66623o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f66620a;
                            List h10 = MessageRoomToDomainKt.h((List) obj, this.f66621b.f66360a, this.f66621b.s0(), false, this.f66621b.y0(), 4, null);
                            c0930a.f66623o = 1;
                            if (interfaceC5322g.emit(h10, c0930a) == coroutine_suspended) {
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
                c0930a = new C0930a(continuation);
                Object obj22 = c0930a.f66622n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0930a.f66623o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C6571v(InterfaceC5321f interfaceC5321f, C6550a c6550a) {
            this.f66618a = interfaceC5321f;
            this.f66619b = c6550a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f66618a.collect(new C0929a(interfaceC5322g, this.f66619b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$w, reason: case insensitive filesystem */
    public static final class C6572w implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f66625a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C6550a f66626b;

        /* renamed from: uf.a$w$a, reason: collision with other inner class name */
        public static final class C0931a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f66627a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C6550a f66628b;

            /* renamed from: uf.a$w$a$a, reason: collision with other inner class name */
            public static final class C0932a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f66629n;

                /* renamed from: o, reason: collision with root package name */
                public int f66630o;

                public C0932a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66629n = obj;
                    this.f66630o |= Integer.MIN_VALUE;
                    return C0931a.this.emit(null, this);
                }
            }

            public C0931a(InterfaceC5322g interfaceC5322g, C6550a c6550a) {
                this.f66627a = interfaceC5322g;
                this.f66628b = c6550a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0932a c0932a;
                int i10;
                if (continuation instanceof C0932a) {
                    c0932a = (C0932a) continuation;
                    int i11 = c0932a.f66630o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0932a.f66630o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0932a.f66629n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0932a.f66630o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f66627a;
                            List h10 = MessageRoomToDomainKt.h((List) obj, this.f66628b.f66360a, this.f66628b.s0(), false, this.f66628b.y0(), 4, null);
                            c0932a.f66630o = 1;
                            if (interfaceC5322g.emit(h10, c0932a) == coroutine_suspended) {
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
                c0932a = new C0932a(continuation);
                Object obj22 = c0932a.f66629n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0932a.f66630o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C6572w(InterfaceC5321f interfaceC5321f, C6550a c6550a) {
            this.f66625a = interfaceC5321f;
            this.f66626b = c6550a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f66625a.collect(new C0931a(interfaceC5322g, this.f66626b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: uf.a$x */
    public static final class x extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final x f66632d = new x();

        public x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (CharSequence) it.getSecond();
        }
    }

    /* renamed from: uf.a$y */
    public static final class y extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f66633n;

        /* renamed from: p, reason: collision with root package name */
        public int f66635p;

        public y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66633n = obj;
            this.f66635p |= Integer.MIN_VALUE;
            return C6550a.this.E(null, this);
        }
    }

    /* renamed from: uf.a$z */
    public static final class z extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public int f66636n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f66637o;

        /* renamed from: q, reason: collision with root package name */
        public int f66639q;

        public z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66637o = obj;
            this.f66639q |= Integer.MIN_VALUE;
            return C6550a.this.h(null, this);
        }
    }

    public /* synthetic */ C6550a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static /* synthetic */ Object C0(C6550a c6550a, String str, List list, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return c6550a.B0(str, list, z10, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r6.i(r7, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r9.T(r7, true, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(C6550a c6550a, Ref.ObjectRef objectRef, SalesIQChat salesIQChat, Continuation continuation) {
        O o10;
        int i10;
        if (continuation instanceof O) {
            o10 = (O) continuation;
            int i11 = o10.f66453q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o10.f66453q = i11 - Integer.MIN_VALUE;
                Object obj = o10.f66452p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = o10.f66453q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String V10 = c6550a.o0().V();
                    if (V10 != null) {
                        Message message = (Message) objectRef.element;
                        MessageEntity a10 = message != null ? AbstractC6687a.a(message, c6550a.s0(), V10) : null;
                        if (a10 != null) {
                            C6152a u02 = c6550a.u0();
                            o10.f66450n = c6550a;
                            o10.f66451o = salesIQChat;
                            o10.f66453q = 1;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    salesIQChat = (SalesIQChat) o10.f66451o;
                    c6550a = (C6550a) o10.f66450n;
                    ResultKt.throwOnFailure(obj);
                }
                Ke.a r02 = c6550a.r0();
                String chid = salesIQChat.getChid();
                Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                o10.f66450n = null;
                o10.f66451o = null;
                o10.f66453q = 2;
            }
        }
        o10 = new O(continuation);
        Object obj2 = o10.f66452p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = o10.f66453q;
        if (i10 != 0) {
        }
        Ke.a r022 = c6550a.r0();
        String chid2 = salesIQChat.getChid();
        Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
        o10.f66450n = null;
        o10.f66451o = null;
        o10.f66453q = 2;
    }

    public static /* synthetic */ Object i0(C6550a c6550a, String str, String str2, String str3, String str4, String str5, Message.g gVar, Message.f fVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, MessageEntity messageEntity, Message.Meta meta, Continuation continuation, int i10, Object obj) {
        return c6550a.h0(str, str2, str3, str4, str5, gVar, (i10 & 64) != 0 ? Message.f.Sending : fVar, attachment, extras, respondedMessage, messageEntity, (i10 & 2048) != 0 ? null : meta, continuation);
    }

    public static final void l0(Message message) {
        String localFilePath;
        Message.Extras extras = message.getExtras();
        if (extras == null || (localFilePath = extras.getLocalFilePath()) == null) {
            return;
        }
        new File(localFilePath).delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01e5 -> B:11:0x01ea). Please report as a decompilation issue!!! */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(List list, Boolean bool, Continuation continuation) {
        C6554e c6554e;
        C6550a c6550a;
        int i10;
        C6554e c6554e2;
        C6550a c6550a2;
        Iterator it;
        Boolean bool2;
        Boolean bool3;
        C6550a c6550a3;
        MessageEntity messageEntity;
        Iterator it2;
        MessageEntity messageEntity2;
        int i11;
        C6550a c6550a4;
        Boolean bool4;
        Object obj;
        MessageEntity messageEntity3;
        C6152a u02;
        boolean z10;
        MessageEntity.Time time;
        Long boxLong;
        if (continuation instanceof C6554e) {
            c6554e = (C6554e) continuation;
            int i12 = c6554e.f66543t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c6554e.f66543t = i12 - Integer.MIN_VALUE;
                c6550a = this;
                Object obj2 = c6554e.f66541r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6554e.f66543t;
                int i13 = 1;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Gson s02 = c6550a.s0();
                    String V10 = c6550a.o0().V();
                    if (V10 == null) {
                        V10 = "";
                    }
                    Iterator it3 = AbstractC6687a.b(list, s02, V10).iterator();
                    c6554e2 = c6554e;
                    c6550a2 = c6550a;
                    it = it3;
                    bool2 = bool;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i10 == 1) {
                        MessageEntity messageEntity4 = (MessageEntity) c6554e.f66540q;
                        Iterator it4 = (Iterator) c6554e.f66539p;
                        Boolean bool5 = (Boolean) c6554e.f66538o;
                        C6550a c6550a5 = (C6550a) c6554e.f66537n;
                        ResultKt.throwOnFailure(obj2);
                        messageEntity = messageEntity4;
                        it2 = it4;
                        bool3 = bool5;
                        c6550a3 = c6550a5;
                        messageEntity2 = (MessageEntity) ((C5582a) obj2).b();
                        if (messageEntity2 != null) {
                            boxLong = Boxing.boxLong(time.getClientTime());
                            boxLong.longValue();
                            if (messageEntity2.getTime().getClientTime() == -1) {
                            }
                            if (boxLong != null) {
                            }
                        }
                        i11 = i13;
                        c6550a4 = c6550a3;
                        bool4 = bool3;
                        obj = null;
                        messageEntity3 = messageEntity;
                        if (bool4 != null) {
                        }
                        u02 = c6550a4.u0();
                        c6554e.f66537n = c6550a4;
                        c6554e.f66538o = bool4;
                        c6554e.f66539p = it2;
                        c6554e.f66540q = obj;
                        c6554e.f66543t = 2;
                        z10 = i11;
                        if (u02.I(messageEntity3, z10, c6554e) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it5 = (Iterator) c6554e.f66539p;
                    Boolean bool6 = (Boolean) c6554e.f66538o;
                    C6550a c6550a6 = (C6550a) c6554e.f66537n;
                    ResultKt.throwOnFailure(obj2);
                    c6554e2 = c6554e;
                    it = it5;
                    int i14 = 1;
                    bool2 = bool6;
                    c6550a2 = c6550a6;
                    i13 = i14;
                    if (it.hasNext()) {
                        MessageEntity messageEntity5 = (MessageEntity) it.next();
                        C6152a u03 = c6550a2.u0();
                        String chatId = messageEntity5.getChatId();
                        c6554e2.f66537n = c6550a2;
                        c6554e2.f66538o = bool2;
                        c6554e2.f66539p = it;
                        c6554e2.f66540q = messageEntity5;
                        c6554e2.f66543t = i13;
                        Object q10 = u03.q(chatId, c6554e2);
                        if (q10 != coroutine_suspended) {
                            bool3 = bool2;
                            obj2 = q10;
                            C6554e c6554e3 = c6554e2;
                            it2 = it;
                            c6554e = c6554e3;
                            c6550a3 = c6550a2;
                            messageEntity = messageEntity5;
                            messageEntity2 = (MessageEntity) ((C5582a) obj2).b();
                            if (messageEntity2 != null && (time = messageEntity2.getTime()) != null) {
                                boxLong = Boxing.boxLong(time.getClientTime());
                                boxLong.longValue();
                                if (messageEntity2.getTime().getClientTime() == -1) {
                                    boxLong = null;
                                }
                                if (boxLong != null) {
                                    MessageEntity.Time copy$default = MessageEntity.Time.copy$default(messageEntity.getTime(), 0L, 0L, messageEntity2.getTime().getClientTime(), 0L, 0L, null, 59, null);
                                    c6550a4 = c6550a3;
                                    i11 = i13;
                                    obj = null;
                                    bool4 = bool3;
                                    messageEntity = MessageEntity.copy$default(messageEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, copy$default, 67108863, null);
                                    messageEntity3 = messageEntity;
                                    if (bool4 != null) {
                                        messageEntity3 = MessageEntity.copy$default(messageEntity3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, Boxing.boxBoolean(!bool4.booleanValue()), null, null, null, null, false, null, null, 133693439, null);
                                    }
                                    u02 = c6550a4.u0();
                                    c6554e.f66537n = c6550a4;
                                    c6554e.f66538o = bool4;
                                    c6554e.f66539p = it2;
                                    c6554e.f66540q = obj;
                                    c6554e.f66543t = 2;
                                    z10 = i11;
                                    if (u02.I(messageEntity3, z10, c6554e) != coroutine_suspended) {
                                        Iterator it6 = it2;
                                        c6554e2 = c6554e;
                                        it = it6;
                                        c6550a2 = c6550a4;
                                        bool2 = bool4;
                                        i14 = z10;
                                        i13 = i14;
                                        if (it.hasNext()) {
                                            return C5582a.f56502b.d(Unit.INSTANCE);
                                        }
                                    }
                                }
                            }
                            i11 = i13;
                            c6550a4 = c6550a3;
                            bool4 = bool3;
                            obj = null;
                            messageEntity3 = messageEntity;
                            if (bool4 != null) {
                            }
                            u02 = c6550a4.u0();
                            c6554e.f66537n = c6550a4;
                            c6554e.f66538o = bool4;
                            c6554e.f66539p = it2;
                            c6554e.f66540q = obj;
                            c6554e.f66543t = 2;
                            z10 = i11;
                            if (u02.I(messageEntity3, z10, c6554e) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        c6550a = this;
        c6554e = c6550a.new C6554e(continuation);
        Object obj22 = c6554e.f66541r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6554e.f66543t;
        int i132 = 1;
        if (i10 != 0) {
        }
    }

    public final Object A0(AbstractC2916a abstractC2916a, Continuation continuation) {
        if ((i.e(o0().I()) ? this : null) != null) {
            C1934a p02 = p0();
            String I10 = o0().I();
            Intrinsics.checkNotNull(I10);
            Object f10 = p02.f(I10, abstractC2916a, continuation);
            if (f10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return f10;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // xf.InterfaceC6823a
    public Object B(String str, String str2, Message.f fVar, Continuation continuation) {
        return u0().c0(str, str2, fVar, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r8.M(r7, r9, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B0(String str, List list, boolean z10, Continuation continuation) {
        H h10;
        int i10;
        C6550a c6550a;
        C6152a c6152a;
        if (continuation instanceof H) {
            h10 = (H) continuation;
            int i11 = h10.f66394s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h10.f66394s = i11 - Integer.MIN_VALUE;
                Object obj = h10.f66392q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = h10.f66394s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list != null) {
                        ConversationsLocalDataSource q02 = q0();
                        h10.f66389n = this;
                        h10.f66390o = str;
                        h10.f66391p = z10;
                        h10.f66394s = 1;
                        obj = q02.syncTimeList(str, list, h10);
                        if (obj != coroutine_suspended) {
                            c6550a = this;
                        }
                        return coroutine_suspended;
                    }
                    c6550a = this;
                    if (!z10) {
                        return Unit.INSTANCE;
                    }
                    C6152a u02 = c6550a.u0();
                    ConversationsLocalDataSource q03 = c6550a.q0();
                    h10.f66389n = u02;
                    h10.f66390o = str;
                    h10.f66394s = 2;
                    obj = q03.getUnSyncedTimeList(str, h10);
                    if (obj != coroutine_suspended) {
                        c6152a = u02;
                        List list2 = (List) ((C5582a) obj).b();
                        h10.f66389n = null;
                        h10.f66390o = null;
                        h10.f66394s = 3;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    z10 = h10.f66391p;
                    str = (String) h10.f66390o;
                    c6550a = (C6550a) h10.f66389n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    str = (String) h10.f66390o;
                    c6152a = (C6152a) h10.f66389n;
                    ResultKt.throwOnFailure(obj);
                    List list22 = (List) ((C5582a) obj).b();
                    h10.f66389n = null;
                    h10.f66390o = null;
                    h10.f66394s = 3;
                }
                if (!z10) {
                }
            }
        }
        h10 = new H(continuation);
        Object obj2 = h10.f66392q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = h10.f66394s;
        if (i10 != 0) {
        }
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(Message message, Continuation continuation) {
        U u10;
        Object coroutine_suspended;
        int i10;
        Message message2;
        C6550a c6550a;
        MessageEntity messageEntity;
        String V10;
        Message g10;
        Message copy$default;
        List list;
        if (continuation instanceof U) {
            u10 = (U) continuation;
            int i11 = u10.f66524r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u10.f66524r = i11 - Integer.MIN_VALUE;
                Object obj = u10.f66522p;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = u10.f66524r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) u0().E(message.getAcknowledgementKey(), message.getChatId(), Message.g.Feedback).b();
                    if (interfaceC5321f != null) {
                        u10.f66520n = this;
                        message2 = message;
                        u10.f66521o = message2;
                        u10.f66524r = 1;
                        obj = AbstractC5323h.t(interfaceC5321f, u10);
                        if (obj != coroutine_suspended) {
                            c6550a = this;
                        }
                    }
                    message2 = message;
                    c6550a = this;
                    messageEntity = null;
                    if (messageEntity != null && (g10 = MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null)) != null && (copy$default = Message.copy$default(g10, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, message2.getAttachment(), null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -131073, 1023, null)) != null) {
                        message2 = copy$default;
                    }
                    Gson s02 = c6550a.s0();
                    V10 = c6550a.o0().V();
                    if (V10 == null) {
                        V10 = "";
                    }
                    MessageEntity a10 = AbstractC6687a.a(message2, s02, V10);
                    C6152a u02 = c6550a.u0();
                    u10.f66520n = null;
                    u10.f66521o = null;
                    u10.f66524r = 2;
                    Object T10 = u02.T(a10, true, u10);
                    return T10 != coroutine_suspended ? coroutine_suspended : T10;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                message2 = (Message) u10.f66521o;
                c6550a = (C6550a) u10.f66520n;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list != null) {
                    messageEntity = (MessageEntity) CollectionsKt.firstOrNull(list);
                    if (messageEntity != null) {
                        message2 = copy$default;
                    }
                    Gson s022 = c6550a.s0();
                    V10 = c6550a.o0().V();
                    if (V10 == null) {
                    }
                    MessageEntity a102 = AbstractC6687a.a(message2, s022, V10);
                    C6152a u022 = c6550a.u0();
                    u10.f66520n = null;
                    u10.f66521o = null;
                    u10.f66524r = 2;
                    Object T102 = u022.T(a102, true, u10);
                    if (T102 != coroutine_suspended) {
                    }
                }
                messageEntity = null;
                if (messageEntity != null) {
                }
                Gson s0222 = c6550a.s0();
                V10 = c6550a.o0().V();
                if (V10 == null) {
                }
                MessageEntity a1022 = AbstractC6687a.a(message2, s0222, V10);
                C6152a u0222 = c6550a.u0();
                u10.f66520n = null;
                u10.f66521o = null;
                u10.f66524r = 2;
                Object T1022 = u0222.T(a1022, true, u10);
                if (T1022 != coroutine_suspended) {
                }
            }
        }
        u10 = new U(continuation);
        Object obj2 = u10.f66522p;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = u10.f66524r;
        if (i10 != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        messageEntity = null;
        if (messageEntity != null) {
        }
        Gson s02222 = c6550a.s0();
        V10 = c6550a.o0().V();
        if (V10 == null) {
        }
        MessageEntity a10222 = AbstractC6687a.a(message2, s02222, V10);
        C6152a u02222 = c6550a.u0();
        u10.f66520n = null;
        u10.f66521o = null;
        u10.f66524r = 2;
        Object T10222 = u02222.T(a10222, true, u10);
        if (T10222 != coroutine_suspended) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, com.zoho.livechat.android.modules.messages.domain.entities.Message] */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(String str, Continuation continuation) {
        I i10;
        int i11;
        C5582a E10;
        Ref.ObjectRef objectRef;
        C6550a c6550a;
        List list;
        Message.Meta meta;
        T t10;
        C5582a c5582a;
        Message.Meta meta2;
        if (continuation instanceof I) {
            i10 = (I) continuation;
            int i12 = i10.f66400s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i10.f66400s = i12 - Integer.MIN_VALUE;
                I i13 = i10;
                Object obj = i13.f66398q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = i13.f66400s;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    E10 = u0().E(null, str, Message.g.InlineForm);
                    if (E10.d()) {
                        InterfaceC5321f interfaceC5321f = (InterfaceC5321f) E10.b();
                        i13.f66395n = this;
                        i13.f66396o = objectRef2;
                        i13.f66397p = E10;
                        i13.f66400s = 1;
                        Object t11 = AbstractC5323h.t(interfaceC5321f, i13);
                        if (t11 != coroutine_suspended) {
                            objectRef = objectRef2;
                            obj = t11;
                            c6550a = this;
                        }
                        return coroutine_suspended;
                    }
                    if (E10.d()) {
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5582a = (C5582a) i13.f66395n;
                        ResultKt.throwOnFailure(obj);
                        E10 = c5582a;
                        if (E10.d()) {
                            Intrinsics.checkNotNull(E10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                            return E10;
                        }
                        return E10.a(Unit.INSTANCE);
                    }
                    E10 = (C5582a) i13.f66397p;
                    objectRef = (Ref.ObjectRef) i13.f66396o;
                    c6550a = (C6550a) i13.f66395n;
                    ResultKt.throwOnFailure(obj);
                }
                C5582a c5582a2 = E10;
                list = (List) obj;
                if (list != null) {
                    if (list.isEmpty()) {
                        meta2 = null;
                    } else {
                        MessageEntity messageEntity = (MessageEntity) CollectionsKt.firstOrNull(list);
                        Gson s02 = c6550a.s0();
                        Gson s03 = c6550a.s0();
                        ?? g10 = messageEntity != null ? MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null) : 0;
                        objectRef.element = g10;
                        Unit unit = Unit.INSTANCE;
                        meta2 = (Message.Meta) AbstractC5895g.b(s02, s03.v(g10 != 0 ? g10.getMeta() : null), Message.Meta.class);
                    }
                    if (meta2 != null) {
                        meta = Message.Meta.copy$default(meta2, null, null, null, null, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 2147475455, null);
                        t10 = objectRef.element;
                        if ((t10 != 0 ? c6550a : null) != null) {
                            Intrinsics.checkNotNull(t10);
                            Message copy$default = Message.copy$default((Message) t10, null, null, null, Message.g.Text, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, meta, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -262153, 1023, null);
                            Gson s04 = c6550a.s0();
                            String V10 = c6550a.o0().V();
                            if (V10 == null) {
                                V10 = "";
                            }
                            MessageEntity a10 = AbstractC6687a.a(copy$default, s04, V10);
                            C6152a u02 = c6550a.u0();
                            i13.f66395n = c5582a2;
                            i13.f66396o = null;
                            i13.f66397p = null;
                            i13.f66400s = 2;
                            if (C6152a.U(u02, a10, false, i13, 2, null) != coroutine_suspended) {
                                c5582a = c5582a2;
                                E10 = c5582a;
                                if (E10.d()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        E10 = c5582a2;
                        if (E10.d()) {
                        }
                    }
                }
                meta = null;
                t10 = objectRef.element;
                if ((t10 != 0 ? c6550a : null) != null) {
                }
            }
        }
        i10 = new I(continuation);
        I i132 = i10;
        Object obj2 = i132.f66398q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = i132.f66400s;
        if (i11 != 0) {
        }
        C5582a c5582a22 = E10;
        list = (List) obj2;
        if (list != null) {
        }
        meta = null;
        t10 = objectRef.element;
        if ((t10 != 0 ? c6550a : null) != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:10)(2:38|39))(3:40|41|(1:43))|11|(2:12|(2:14|(1:33)(2:35|34))(2:36|37))|22|(1:24)|25|26|(1:28)|29|30))|46|6|7|(0)(0)|11|(3:12|(0)(0)|33)|22|(0)|25|26|(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0045, B:12:0x004b, B:14:0x0052, B:16:0x0065, B:18:0x0071, B:22:0x007f, B:24:0x0083, B:25:0x0087, B:41:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0045, B:12:0x004b, B:14:0x0052, B:16:0x0065, B:18:0x0071, B:22:0x007f, B:24:0x0083, B:25:0x0087, B:41:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(String str, Continuation continuation) {
        y yVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        Iterator it;
        Object obj;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i11 = yVar.f66635p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f66635p = i11 - Integer.MIN_VALUE;
                Object obj2 = yVar.f66633n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = yVar.f66635p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Result.Companion companion = Result.INSTANCE;
                    C6152a u02 = u0();
                    yVar.f66635p = 1;
                    obj2 = u02.B(str, yVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        MessageEntity messageEntity = (MessageEntity) obj;
                        if (Intrinsics.areEqual(messageEntity.getChatId(), "temp_chid") || Intrinsics.areEqual(messageEntity.getChatId(), "trigger_temp_chid") || Intrinsics.areEqual(messageEntity.getChatId(), "proactive_chid")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                MessageEntity messageEntity2 = (MessageEntity) obj;
                Object m147constructorimpl = Result.m147constructorimpl(messageEntity2 != null ? messageEntity2.getChatId() : null);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        yVar = new y(continuation);
        Object obj22 = yVar.f66633n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = yVar.f66635p;
        if (i10 != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        MessageEntity messageEntity22 = (MessageEntity) obj;
        Object m147constructorimpl2 = Result.m147constructorimpl(messageEntity22 != null ? messageEntity22.getChatId() : null);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0168, code lost:
    
        if (r3.updateMessageLastModifiedTime(r6, r9, r14) != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        if (r3.updateMessageLastModifiedTime(r6, r9, r14) == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E0(String str, String str2, String str3, String str4, long j10, long j11, int i10, Continuation continuation) {
        S s10;
        int i11;
        List list;
        String str5;
        String str6;
        String str7;
        long j12;
        C6550a c6550a;
        Object obj;
        String str8;
        SalesIQResponse salesIQResponse;
        String str9;
        List list2;
        Object J10;
        long j13;
        if (continuation instanceof S) {
            s10 = (S) continuation;
            int i12 = s10.f66513v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                s10.f66513v = i12 - Integer.MIN_VALUE;
                S s11 = s10;
                Object obj2 = s11.f66511t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = s11.f66513v;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    String I10 = o0().I();
                    if (i.f(I10)) {
                        C6364a v02 = v0();
                        Intrinsics.checkNotNull(I10);
                        Long boxLong = Boxing.boxLong(j10);
                        s11.f66505n = this;
                        s11.f66506o = str;
                        s11.f66507p = str2;
                        s11.f66508q = str3;
                        s11.f66509r = str4;
                        s11.f66510s = j11;
                        s11.f66513v = 1;
                        list = null;
                        Object h10 = C6364a.h(v02, I10, str2, i10, null, null, null, null, null, null, boxLong, s11, 448, null);
                        if (h10 != coroutine_suspended) {
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            j12 = j11;
                            c6550a = this;
                            obj = h10;
                            str8 = str4;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i11 == 1) {
                    j12 = s11.f66510s;
                    str8 = (String) s11.f66509r;
                    str7 = (String) s11.f66508q;
                    str6 = (String) s11.f66507p;
                    str5 = (String) s11.f66506o;
                    C6550a c6550a2 = (C6550a) s11.f66505n;
                    ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    c6550a = c6550a2;
                    list = null;
                } else {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    j13 = s11.f66510s;
                    str9 = (String) s11.f66506o;
                    c6550a = (C6550a) s11.f66505n;
                    ResultKt.throwOnFailure(obj2);
                    J10 = obj2;
                    list = null;
                    j12 = j13;
                    String str10 = str9;
                    ConversationsLocalDataSource q02 = c6550a.q0();
                    s11.f66505n = list;
                    s11.f66506o = list;
                    s11.f66507p = list;
                    s11.f66508q = list;
                    s11.f66509r = list;
                    s11.f66513v = 4;
                }
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    if (salesIQResponse.getMoreDataAvailable()) {
                        ConversationsLocalDataSource q03 = c6550a.q0();
                        s11.f66505n = list;
                        s11.f66506o = list;
                        s11.f66507p = list;
                        s11.f66508q = list;
                        s11.f66509r = list;
                        s11.f66513v = 2;
                    } else {
                        List list3 = (List) salesIQResponse.getData();
                        if (list3 != null) {
                            String str11 = str7;
                            String str12 = str6;
                            String str13 = str5;
                            list2 = AbstractC6688b.b(list3, c6550a.f66360a, ConversationsLocalDataSource.getChat$default(c6550a.q0(), str7, false, 2, list), str13, str12, str11, str8, c6550a.o0().V(), c6550a.s0());
                            str9 = str11;
                        } else {
                            str9 = str7;
                            list2 = list;
                        }
                        if (list2 != null) {
                            C6152a u02 = c6550a.u0();
                            s11.f66505n = c6550a;
                            s11.f66506o = str9;
                            s11.f66507p = list;
                            s11.f66508q = list;
                            s11.f66509r = list;
                            s11.f66510s = j12;
                            s11.f66513v = 3;
                            J10 = u02.J(list2, s11);
                            if (J10 != coroutine_suspended) {
                                j13 = j12;
                                j12 = j13;
                            }
                        }
                        String str102 = str9;
                        ConversationsLocalDataSource q022 = c6550a.q0();
                        s11.f66505n = list;
                        s11.f66506o = list;
                        s11.f66507p = list;
                        s11.f66508q = list;
                        s11.f66509r = list;
                        s11.f66513v = 4;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        s10 = new S(continuation);
        S s112 = s10;
        Object obj22 = s112.f66511t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = s112.f66513v;
        if (i11 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj;
        if (salesIQResponse.getIsSuccess()) {
        }
        return Unit.INSTANCE;
    }

    @Override // xf.InterfaceC6823a
    public Object F(Continuation continuation) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(this.f66368i);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final void F0(String str, String str2, Integer num) {
        AbstractC1459k.d(m0(), null, null, new T(str, num, str2, null), 3, null);
    }

    @Override // xf.InterfaceC6823a
    public C5582a G(String chatId, String messageId, Integer num) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        try {
            Result.Companion companion = Result.INSTANCE;
            F0(chatId, messageId, num);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final Object G0(String str, List list, Message.f fVar, Continuation continuation) {
        return u0().d0(str, list, fVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(String str, String str2, Continuation continuation) {
        C6564o c6564o;
        int i10;
        SalesIQResponse b10;
        if (continuation instanceof C6564o) {
            c6564o = (C6564o) continuation;
            int i11 = c6564o.f66585p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6564o.f66585p = i11 - Integer.MIN_VALUE;
                Object obj = c6564o.f66583n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6564o.f66585p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String I10 = o0().I();
                    if (I10 == null || I10.length() == 0) {
                        SalesIQResponse.Companion companion = SalesIQResponse.INSTANCE;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("The following variable must not be null for delete message (DELETE): ");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Pair(I10, "screenName"));
                        Unit unit = Unit.INSTANCE;
                        sb2.append(x0(arrayList));
                        b10 = companion.b(new Throwable(sb2.toString()));
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                    }
                    C6364a v02 = v0();
                    c6564o.f66585p = 1;
                    obj = v02.d(I10, str, str2, c6564o);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                b10 = (SalesIQResponse) obj;
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
            }
        }
        c6564o = new C6564o(continuation);
        Object obj2 = c6564o.f66583n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6564o.f66585p;
        if (i10 != 0) {
        }
        b10 = (SalesIQResponse) obj2;
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
    }

    public final Object H0(String str, y.a aVar, Long l10, Continuation continuation) {
        Object updateSyncTime = q0().updateSyncTime(str, aVar, l10, continuation);
        return updateSyncTime == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateSyncTime : Unit.INSTANCE;
    }

    @Override // xf.InterfaceC6823a
    public C5582a I(String chatId) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(new C6570u(w0(), chatId));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final Object I0(String str, long j10, Continuation continuation) {
        Object updateSyncTimeList = q0().updateSyncTimeList(str, j10, continuation);
        return updateSyncTimeList == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateSyncTimeList : Unit.INSTANCE;
    }

    @Override // xf.InterfaceC6823a
    public Object J(String str, String str2, Message.Extras extras, Continuation continuation) {
        return u0().S(str, str2, extras != null ? s0().v(extras) : null, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J0(String str, String str2, Continuation continuation) {
        V v10;
        int i10;
        C5582a c5582a;
        if (continuation instanceof V) {
            v10 = (V) continuation;
            int i11 = v10.f66527p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v10.f66527p = i11 - Integer.MIN_VALUE;
                Object obj = v10.f66525n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = v10.f66527p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String V10 = o0().V();
                    if (V10 != null) {
                        C6152a u02 = u0();
                        v10.f66527p = 1;
                        obj = u02.R(str, V10, str2, v10);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Visitor WmsId must not be null"), false, 2, null);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c5582a = (C5582a) obj;
                if (c5582a != null) {
                    return c5582a;
                }
                return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Visitor WmsId must not be null"), false, 2, null);
            }
        }
        v10 = new V(continuation);
        Object obj2 = v10.f66525n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = v10.f66527p;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a != null) {
        }
        return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Visitor WmsId must not be null"), false, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a4, code lost:
    
        if (r3 == r2) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b A[LOOP:0: B:44:0x0155->B:46:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r3v6, types: [qf.a] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(String str, String str2, boolean z10, Continuation continuation) {
        C6563n c6563n;
        Object coroutine_suspended;
        int i10;
        boolean z11;
        String str3;
        int i11;
        String str4;
        String str5;
        C6550a c6550a;
        Object obj;
        boolean z12;
        MessageEntity messageEntity;
        Message g10;
        Object C10;
        String str6;
        Iterator it;
        Message message;
        Object g11;
        Object i12;
        C6550a c6550a2;
        InterfaceC5321f interfaceC5321f;
        Object obj2;
        String str7;
        boolean z13;
        List list;
        if (continuation instanceof C6563n) {
            c6563n = (C6563n) continuation;
            int i13 = c6563n.f66582t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c6563n.f66582t = i13 - Integer.MIN_VALUE;
                C6563n c6563n2 = c6563n;
                Object obj3 = c6563n2.f66580r;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6563n2.f66582t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    C6152a u02 = u0();
                    c6563n2.f66576n = this;
                    c6563n2.f66577o = str;
                    c6563n2.f66578p = str2;
                    c6563n2.f66579q = z10;
                    c6563n2.f66582t = 1;
                    z11 = true;
                    str3 = null;
                    i11 = 2;
                    Object y10 = C6152a.y(u02, null, str, null, null, str2, c6563n2, 8, null);
                    if (y10 != coroutine_suspended) {
                        str4 = str;
                        str5 = str2;
                        c6550a = this;
                        obj = y10;
                        z12 = z10;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        String str8 = (String) c6563n2.f66578p;
                        str6 = (String) c6563n2.f66577o;
                        C6550a c6550a3 = (C6550a) c6563n2.f66576n;
                        ResultKt.throwOnFailure(obj3);
                        z11 = true;
                        c6550a = c6550a3;
                        str5 = str8;
                        C10 = obj3;
                        str3 = null;
                        List h10 = MessageRoomToDomainKt.h((List) C10, c6550a.f66360a, c6550a.s0(), false, c6550a.f66368i, 4, null);
                        List list2 = h10;
                        it = list2.iterator();
                        while (it.hasNext()) {
                            l0((Message) it.next());
                        }
                        message = (Message) CollectionsKt.firstOrNull(h10);
                        if (message != null) {
                            C6152a u03 = c6550a.u0();
                            String chatId = message.getChatId();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((Message) it2.next()).getId());
                            }
                            c6563n2.f66576n = c6550a;
                            c6563n2.f66577o = str6;
                            c6563n2.f66578p = str5;
                            c6563n2.f66582t = 3;
                            g11 = u03.g(chatId, arrayList, c6563n2);
                        }
                        str4 = str6;
                        C6152a u04 = c6550a.u0();
                        c6563n2.f66576n = c6550a;
                        c6563n2.f66577o = str4;
                        c6563n2.f66578p = str3;
                        c6563n2.f66582t = 4;
                        i12 = u04.i(str4, str5, c6563n2);
                        if (i12 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i10 == 3) {
                        String str9 = (String) c6563n2.f66578p;
                        str6 = (String) c6563n2.f66577o;
                        C6550a c6550a4 = (C6550a) c6563n2.f66576n;
                        ResultKt.throwOnFailure(obj3);
                        z11 = true;
                        c6550a = c6550a4;
                        str5 = str9;
                        g11 = obj3;
                        str3 = null;
                        str4 = str6;
                        C6152a u042 = c6550a.u0();
                        c6563n2.f66576n = c6550a;
                        c6563n2.f66577o = str4;
                        c6563n2.f66578p = str3;
                        c6563n2.f66582t = 4;
                        i12 = u042.i(str4, str5, c6563n2);
                        if (i12 != coroutine_suspended) {
                            c6550a2 = c6550a;
                            interfaceC5321f = (InterfaceC5321f) c6550a2.u0().D(str3, str4).b();
                            if (interfaceC5321f != null) {
                            }
                            obj2 = i12;
                            str7 = str4;
                            z13 = false;
                            if (z13) {
                            }
                            return obj2;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = c6563n2.f66578p;
                        str7 = (String) c6563n2.f66577o;
                        c6550a2 = (C6550a) c6563n2.f66576n;
                        ResultKt.throwOnFailure(obj3);
                        z11 = true;
                        list = (List) obj3;
                        if (list != null) {
                            str4 = str7;
                            i12 = obj2;
                            obj2 = i12;
                            str7 = str4;
                            z13 = false;
                            if (z13) {
                            }
                            return obj2;
                        }
                        if (list.size() == 0) {
                            z13 = z11;
                            if (z13) {
                                c6550a2.q0().delete(str7);
                            }
                            return obj2;
                        }
                        z13 = false;
                        if (z13) {
                        }
                        return obj2;
                    }
                    String str10 = (String) c6563n2.f66577o;
                    c6550a2 = (C6550a) c6563n2.f66576n;
                    ResultKt.throwOnFailure(obj3);
                    str4 = str10;
                    z11 = true;
                    i12 = obj3;
                    str3 = null;
                    interfaceC5321f = (InterfaceC5321f) c6550a2.u0().D(str3, str4).b();
                    if (interfaceC5321f != null) {
                        c6563n2.f66576n = c6550a2;
                        c6563n2.f66577o = str4;
                        c6563n2.f66578p = i12;
                        c6563n2.f66582t = 5;
                        obj3 = AbstractC5323h.t(interfaceC5321f, c6563n2);
                        if (obj3 != coroutine_suspended) {
                            obj2 = i12;
                            str7 = str4;
                            list = (List) obj3;
                            if (list != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    obj2 = i12;
                    str7 = str4;
                    z13 = false;
                    if (z13) {
                    }
                    return obj2;
                }
                z12 = c6563n2.f66579q;
                str5 = (String) c6563n2.f66578p;
                str4 = (String) c6563n2.f66577o;
                c6550a = (C6550a) c6563n2.f66576n;
                ResultKt.throwOnFailure(obj3);
                i11 = 2;
                z11 = true;
                obj = obj3;
                str3 = null;
                messageEntity = (MessageEntity) ((C5582a) obj).b();
                if (messageEntity != null && (g10 = MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null)) != null) {
                    if (!z12 && g10.isChainedMessage()) {
                        ?? u05 = c6550a.u0();
                        Message.Extras extras = g10.getExtras();
                        ?? chainedMessageIds = extras != null ? extras.getChainedMessageIds() : str3;
                        Intrinsics.checkNotNull(chainedMessageIds);
                        c6563n2.f66576n = c6550a;
                        c6563n2.f66577o = str4;
                        c6563n2.f66578p = str5;
                        c6563n2.f66582t = i11;
                        C10 = u05.C(chainedMessageIds, c6563n2);
                        if (C10 != coroutine_suspended) {
                            str6 = str4;
                            List h102 = MessageRoomToDomainKt.h((List) C10, c6550a.f66360a, c6550a.s0(), false, c6550a.f66368i, 4, null);
                            List list22 = h102;
                            it = list22.iterator();
                            while (it.hasNext()) {
                            }
                            message = (Message) CollectionsKt.firstOrNull(h102);
                            if (message != null) {
                            }
                            str4 = str6;
                        }
                        return coroutine_suspended;
                    }
                    l0(g10);
                }
                C6152a u0422 = c6550a.u0();
                c6563n2.f66576n = c6550a;
                c6563n2.f66577o = str4;
                c6563n2.f66578p = str3;
                c6563n2.f66582t = 4;
                i12 = u0422.i(str4, str5, c6563n2);
                if (i12 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        c6563n = new C6563n(continuation);
        C6563n c6563n22 = c6563n;
        Object obj32 = c6563n22.f66580r;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6563n22.f66582t;
        if (i10 != 0) {
        }
        messageEntity = (MessageEntity) ((C5582a) obj).b();
        if (messageEntity != null) {
            if (!z12) {
            }
            l0(g10);
        }
        C6152a u04222 = c6550a.u0();
        c6563n22.f66576n = c6550a;
        c6563n22.f66577o = str4;
        c6563n22.f66578p = str3;
        c6563n22.f66582t = 4;
        i12 = u04222.i(str4, str5, c6563n22);
        if (i12 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r2.I0(r10, r6, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K0(MessageResponse messageResponse, String str, Continuation continuation) {
        W w10;
        int i10;
        C6550a c6550a;
        Boolean bool;
        if (continuation instanceof W) {
            w10 = (W) continuation;
            int i11 = w10.f66533s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w10.f66533s = i11 - Integer.MIN_VALUE;
                Object obj = w10.f66531q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = w10.f66533s;
                boolean z10 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String messageId = messageResponse.getMessageId();
                    if (messageId == null) {
                        return null;
                    }
                    C6152a u02 = u0();
                    w10.f66528n = this;
                    w10.f66529o = messageResponse;
                    w10.f66530p = str;
                    w10.f66533s = 1;
                    obj = u02.K(str, messageId, w10);
                    if (obj != coroutine_suspended) {
                        c6550a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(z10);
                }
                str = (String) w10.f66530p;
                messageResponse = (MessageResponse) w10.f66529o;
                c6550a = (C6550a) w10.f66528n;
                ResultKt.throwOnFailure(obj);
                bool = (Boolean) ((C5582a) obj).b();
                if (bool != null) {
                    if (bool.booleanValue()) {
                        bool = null;
                    }
                    if (bool != null) {
                        long serverTime = messageResponse.getServerTime();
                        w10.f66528n = null;
                        w10.f66529o = null;
                        w10.f66530p = null;
                        w10.f66533s = 2;
                    }
                }
                z10 = false;
                return Boxing.boxBoolean(z10);
            }
        }
        w10 = new W(continuation);
        Object obj2 = w10.f66531q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = w10.f66533s;
        boolean z102 = true;
        if (i10 != 0) {
        }
        bool = (Boolean) ((C5582a) obj2).b();
        if (bool != null) {
        }
        z102 = false;
        return Boxing.boxBoolean(z102);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // xf.InterfaceC6823a
    public java.lang.Object L(java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.Long r42, java.lang.Long r43, boolean r44, yf.y.a r45, boolean r46, boolean r47, kotlin.coroutines.Continuation r48) {
        /*
            Method dump skipped, instructions count: 4020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.C6550a.L(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, boolean, yf.y$a, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // xf.InterfaceC6823a
    public Object N(Continuation continuation) {
        C5582a r10 = u0().r();
        if (r10.d()) {
            return r10.a(new C6567r((InterfaceC5321f) r10.b(), this));
        }
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return r10;
    }

    @Override // xf.InterfaceC6823a
    public Object O(String str, Continuation continuation) {
        return u0().l(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0741, code lost:
    
        if (r0 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0274, code lost:
    
        if (r16 == null) goto L52;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05ad A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:19:0x006e, B:21:0x0610, B:22:0x0613, B:58:0x0098, B:60:0x05a3, B:62:0x05ad, B:63:0x05d4, B:66:0x05e5, B:68:0x05f1, B:75:0x0576), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05f1 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:19:0x006e, B:21:0x0610, B:22:0x0613, B:58:0x0098, B:60:0x05a3, B:62:0x05ad, B:63:0x05d4, B:66:0x05e5, B:68:0x05f1, B:75:0x0576), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d4 A[ADDED_TO_REGION] */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(String str, String str2, String str3, String str4, String str5, String str6, Message.g gVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, List list, EnumC6551b enumC6551b, boolean z10, boolean z11, Continuation continuation) {
        P p10;
        P p11;
        Object obj;
        int i10;
        boolean z12;
        C6550a c6550a;
        String str7;
        String str8;
        boolean z13;
        Message.Attachment attachment2;
        Message.Extras extras2;
        Message.RespondedMessage respondedMessage2;
        List list2;
        Function2 function2;
        String str9;
        String str10;
        boolean z14;
        String str11;
        String str12;
        String str13;
        Message.f fVar;
        String str14;
        String str15;
        String str16;
        Message.g gVar2;
        boolean z15;
        Object obj2;
        String str17;
        String str18;
        String str19;
        Message.Attachment attachment3;
        Message.Attachment attachment4;
        Message.Extras extras3;
        Message.RespondedMessage respondedMessage3;
        List list3;
        EnumC6551b enumC6551b2;
        Message.f fVar2;
        Function2 function22;
        C6550a c6550a2;
        String str20;
        String str21;
        boolean z16;
        Object obj3;
        String str22;
        Message.Extras extras4;
        Message.RespondedMessage respondedMessage4;
        String str23;
        C6550a c6550a3;
        List list4;
        Message.Attachment attachment5;
        Message.Extras extras5;
        String str24;
        boolean z17;
        EnumC6551b enumC6551b3;
        boolean z18;
        C6550a c6550a4;
        Function2 function23;
        Object i02;
        Object obj4;
        List list5;
        k kVar;
        String str25;
        String str26;
        List list6;
        String str27;
        String fileName;
        boolean z19;
        Object m10;
        String str28;
        Message.Attachment attachment6;
        String str29;
        C6550a c6550a5;
        String str30;
        Message.Extras extras6;
        List list7;
        Object obj5;
        String localFilePath;
        h B10;
        SalesIQResponse b10;
        C6550a c6550a6;
        Object obj6;
        String str31;
        String str32;
        String str33;
        String str34;
        Wh.a d10;
        Object z20;
        Message g10;
        boolean z21;
        EnumC6551b enumC6551b4 = enumC6551b;
        try {
            if (continuation instanceof P) {
                p10 = (P) continuation;
                int i11 = p10.f66470V;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    p10.f66470V = i11 - Integer.MIN_VALUE;
                    p11 = p10;
                    Object obj7 = p11.f66468R;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (p11.f66470V) {
                        case 0:
                            ResultKt.throwOnFailure(obj7);
                            String I10 = o0().I();
                            Q q10 = new Q(str2);
                            if ((I10 != null ? this : null) != null) {
                                if (enumC6551b4 == null && !z10) {
                                    if (((i.e(attachment) || !((list4 = list) == null || list4.isEmpty())) ? this : null) != null) {
                                        if (i.s(String.valueOf(extras != null ? Boxing.boxLong(extras.getLocalFileSize()) : null)) < 51200000) {
                                            fVar = Message.f.Uploading;
                                            break;
                                        } else {
                                            fVar = Message.f.Failure;
                                            break;
                                        }
                                    }
                                    fVar = Message.f.Sending;
                                    Message.f fVar3 = fVar;
                                    C6152a u02 = u0();
                                    p11.f66471n = this;
                                    p11.f66472o = str;
                                    p11.f66473p = str2;
                                    p11.f66474q = str3;
                                    p11.f66475r = str4;
                                    p11.f66476s = str5;
                                    p11.f66477t = str6;
                                    p11.f66478u = attachment;
                                    p11.f66479v = extras;
                                    p11.f66480w = respondedMessage;
                                    p11.f66481x = list;
                                    p11.f66482y = enumC6551b4;
                                    p11.f66483z = I10;
                                    p11.f66454A = q10;
                                    p11.f66455B = gVar;
                                    p11.f66456C = str6;
                                    p11.f66457D = str4;
                                    p11.f66458E = str3;
                                    p11.f66459F = str2;
                                    p11.f66460G = str;
                                    p11.f66461H = this;
                                    p11.f66462I = fVar3;
                                    p11.f66463J = respondedMessage;
                                    p11.f66464K = extras;
                                    p11.f66465L = attachment;
                                    p11.f66466O = z10;
                                    p11.f66467P = z11;
                                    p11.f66470V = 1;
                                    z12 = true;
                                    Object w10 = u02.w(str3, str2, null, str5, null, p11);
                                    if (w10 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str7 = str;
                                    str8 = str2;
                                    str14 = str3;
                                    str15 = str14;
                                    str16 = str5;
                                    gVar2 = gVar;
                                    z15 = z11;
                                    obj2 = coroutine_suspended;
                                    str17 = str4;
                                    str18 = str6;
                                    str19 = str18;
                                    attachment3 = attachment;
                                    attachment4 = attachment3;
                                    extras3 = extras;
                                    respondedMessage3 = respondedMessage;
                                    list3 = list;
                                    enumC6551b2 = enumC6551b4;
                                    fVar2 = fVar3;
                                    function22 = q10;
                                    c6550a2 = this;
                                    str20 = str7;
                                    str21 = str8;
                                    z16 = z10;
                                    obj3 = w10;
                                    str22 = str17;
                                    extras4 = extras3;
                                    respondedMessage4 = respondedMessage3;
                                    str23 = I10;
                                    c6550a3 = c6550a2;
                                    MessageEntity messageEntity = (MessageEntity) ((C5582a) obj3).b();
                                    p11.f66471n = c6550a2;
                                    p11.f66472o = str7;
                                    p11.f66473p = str8;
                                    p11.f66474q = str15;
                                    p11.f66475r = str22;
                                    p11.f66476s = str16;
                                    p11.f66477t = str19;
                                    p11.f66478u = attachment4;
                                    p11.f66479v = extras3;
                                    p11.f66480w = respondedMessage4;
                                    p11.f66481x = list3;
                                    p11.f66482y = enumC6551b2;
                                    p11.f66483z = str23;
                                    p11.f66454A = function22;
                                    attachment5 = attachment4;
                                    p11.f66455B = null;
                                    p11.f66456C = null;
                                    p11.f66457D = null;
                                    p11.f66458E = null;
                                    p11.f66459F = null;
                                    p11.f66460G = null;
                                    p11.f66461H = null;
                                    p11.f66462I = null;
                                    p11.f66463J = null;
                                    p11.f66464K = null;
                                    p11.f66465L = null;
                                    p11.f66466O = z16;
                                    boolean z22 = z15;
                                    p11.f66467P = z22;
                                    extras5 = extras3;
                                    i10 = 2;
                                    p11.f66470V = 2;
                                    str24 = str19;
                                    z17 = z22;
                                    Message.RespondedMessage respondedMessage5 = respondedMessage4;
                                    List list8 = list3;
                                    enumC6551b3 = enumC6551b2;
                                    z18 = z16;
                                    str9 = str23;
                                    c6550a4 = c6550a2;
                                    function23 = function22;
                                    i02 = i0(c6550a3, str20, str21, str14, str17, str18, gVar2, fVar2, attachment3, extras4, respondedMessage3, messageEntity, null, p11, 2048, null);
                                    p11 = p11;
                                    obj4 = obj2;
                                    if (i02 != obj4) {
                                        return obj4;
                                    }
                                    respondedMessage2 = respondedMessage5;
                                    list5 = list8;
                                    c6550a = c6550a4;
                                    str10 = str16;
                                    obj = obj4;
                                    list2 = list5;
                                    str11 = str24;
                                    enumC6551b4 = enumC6551b3;
                                    function2 = function23;
                                    z14 = z18;
                                    z13 = z17;
                                    str13 = str15;
                                    str12 = str22;
                                    attachment2 = attachment5;
                                    extras2 = extras5;
                                    if (z14) {
                                    }
                                    C5582a.C0817a c0817a = C5582a.f56502b;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Message unique Id must be a non null value to ");
                                    sb2.append(z14 ? "edit " : "reply to ");
                                    sb2.append(" a message");
                                    return C5582a.C0817a.c(c0817a, new Throwable(sb2.toString()), false, i10, null);
                                }
                                obj = coroutine_suspended;
                                i10 = 2;
                                z12 = true;
                                c6550a = this;
                                str7 = str;
                                str8 = str2;
                                z13 = z11;
                                attachment2 = attachment;
                                extras2 = extras;
                                respondedMessage2 = respondedMessage;
                                list2 = list;
                                function2 = q10;
                                str9 = I10;
                                str10 = str5;
                                z14 = z10;
                                str11 = str6;
                                str12 = str4;
                                str13 = str3;
                                if ((!z14 || z13) && str10 == null) {
                                    C5582a.C0817a c0817a2 = C5582a.f56502b;
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append("Message unique Id must be a non null value to ");
                                    sb22.append(z14 ? "edit " : "reply to ");
                                    sb22.append(" a message");
                                    return C5582a.C0817a.c(c0817a2, new Throwable(sb22.toString()), false, i10, null);
                                }
                                String property = System.getProperty("force_fail_message_sending", Constants.CASEFIRST_FALSE);
                                if (property != null ? Intrinsics.areEqual(StringsKt.toBooleanStrictOrNull(property), Boxing.boxBoolean(z12)) : false) {
                                    b10 = SalesIQResponse.INSTANCE.b(new Throwable("Message sending failed for testing"));
                                    c6550a6 = c6550a;
                                    z19 = false;
                                    obj6 = attachment2;
                                    str31 = str13;
                                    str32 = str8;
                                    str33 = str12;
                                    str34 = str7;
                                    if (b10.getIsSuccess()) {
                                        if (obj6 == null) {
                                            obj6 = list2 == null ? extras2 != null ? extras2.getLocalFilePath() : null : list2;
                                        }
                                        if (obj6 != null) {
                                            c6550a6.F0(str32, str33, null);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        d10 = C6461a.C0913a.f65814a.d();
                                        p11.f66471n = c6550a6;
                                        p11.f66472o = str34;
                                        p11.f66473p = str32;
                                        p11.f66474q = str31;
                                        p11.f66475r = str33;
                                        p11.f66476s = d10;
                                        p11.f66477t = b10;
                                        p11.f66478u = null;
                                        p11.f66479v = null;
                                        p11.f66480w = null;
                                        p11.f66481x = null;
                                        p11.f66482y = null;
                                        p11.f66483z = null;
                                        p11.f66454A = null;
                                        p11.f66470V = 4;
                                        if (d10.f(null, p11) == obj) {
                                            return obj;
                                        }
                                        C6152a u03 = c6550a6.u0();
                                        p11.f66471n = c6550a6;
                                        p11.f66472o = str34;
                                        p11.f66473p = str32;
                                        p11.f66474q = str31;
                                        p11.f66475r = str33;
                                        p11.f66476s = d10;
                                        p11.f66477t = b10;
                                        p11.f66470V = 5;
                                        z20 = u03.z(str31, str32, null, null, str33, p11);
                                        if (z20 == obj) {
                                            return obj;
                                        }
                                        MessageEntity messageEntity2 = (MessageEntity) ((C5582a) z20).b();
                                        g10 = messageEntity2 != null ? MessageRoomToDomainKt.g(messageEntity2, c6550a6.f66360a, c6550a6.s0(), false, false, null, null, 60, null) : null;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("WmsDelay Message sent in API, ");
                                        sb3.append(g10 != null ? "Message is yet to be received from WMS" : "Message has been received from WMS");
                                        LiveChatUtil.log(sb3.toString());
                                        if (g10 != null) {
                                            C6152a u04 = c6550a6.u0();
                                            Message.f fVar4 = Message.f.WaitingForWms;
                                            p11.f66471n = c6550a6;
                                            p11.f66472o = str34;
                                            p11.f66473p = str32;
                                            p11.f66474q = str31;
                                            p11.f66475r = str33;
                                            p11.f66476s = d10;
                                            p11.f66477t = b10;
                                            p11.f66470V = 6;
                                            if (u04.c0(str32, str33, fVar4, p11) == obj) {
                                                return obj;
                                            }
                                            c6550a6.j0(str31, str32, str33);
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                        d10.g(null);
                                    }
                                    if (!b10.getIsSuccess()) {
                                        SalesIQResponse.Error error = b10.getError();
                                        if (error == null) {
                                            error = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                                        }
                                        Integer b11 = error.b();
                                        if (b11 != null) {
                                            c6550a6.q0().handleError(str31, b11.intValue());
                                            Unit unit3 = Unit.INSTANCE;
                                        }
                                        Integer b12 = error.b();
                                        int a10 = C6228J.f64102d.a();
                                        if (b12 != null && b12.intValue() == a10) {
                                            y.a aVar = y.a.Bottom;
                                            p11.f66471n = b10;
                                            p11.f66472o = null;
                                            p11.f66473p = null;
                                            p11.f66474q = null;
                                            p11.f66475r = null;
                                            p11.f66476s = null;
                                            p11.f66477t = null;
                                            p11.f66478u = null;
                                            p11.f66479v = null;
                                            p11.f66480w = null;
                                            p11.f66481x = null;
                                            p11.f66482y = null;
                                            p11.f66483z = null;
                                            p11.f66454A = null;
                                            p11.f66470V = 7;
                                            if (c6550a6.L(str34, str31, str32, null, null, null, null, false, aVar, false, false, p11) == obj) {
                                                return obj;
                                            }
                                        } else {
                                            int a11 = C6231M.f64105d.a();
                                            if (b12 == null || b12.intValue() != a11) {
                                                int a12 = C6234P.f64108d.a();
                                                if (b12 == null || b12.intValue() != a12) {
                                                    z21 = z19;
                                                    if (z21) {
                                                        C6152a u05 = c6550a6.u0();
                                                        Message.f fVar5 = Message.f.Failure;
                                                        p11.f66471n = b10;
                                                        p11.f66472o = null;
                                                        p11.f66473p = null;
                                                        p11.f66474q = null;
                                                        p11.f66475r = null;
                                                        p11.f66476s = null;
                                                        p11.f66477t = null;
                                                        p11.f66478u = null;
                                                        p11.f66479v = null;
                                                        p11.f66480w = null;
                                                        p11.f66481x = null;
                                                        p11.f66482y = null;
                                                        p11.f66483z = null;
                                                        p11.f66454A = null;
                                                        p11.f66470V = 9;
                                                        if (u05.c0(str32, str33, fVar5, p11) == obj) {
                                                            return obj;
                                                        }
                                                    } else {
                                                        Ke.a r02 = c6550a6.r0();
                                                        p11.f66471n = b10;
                                                        p11.f66472o = null;
                                                        p11.f66473p = null;
                                                        p11.f66474q = null;
                                                        p11.f66475r = null;
                                                        p11.f66476s = null;
                                                        p11.f66477t = null;
                                                        p11.f66478u = null;
                                                        p11.f66479v = null;
                                                        p11.f66480w = null;
                                                        p11.f66481x = null;
                                                        p11.f66482y = null;
                                                        p11.f66483z = null;
                                                        p11.f66454A = null;
                                                        p11.f66470V = 8;
                                                        if (r02.h(str32, str31, p11) == obj) {
                                                            return obj;
                                                        }
                                                    }
                                                }
                                            }
                                            z21 = z12;
                                            if (z21) {
                                            }
                                        }
                                    }
                                } else {
                                    C6364a v02 = c6550a.v0();
                                    Intrinsics.checkNotNull(str9);
                                    String J10 = c6550a.o0().J();
                                    String Q10 = c6550a.o0().Q();
                                    k d11 = (respondedMessage2 == null || (B10 = c6550a.s0().B(respondedMessage2)) == null) ? null : AbstractC5896h.d(B10);
                                    if (list2 != null) {
                                        kVar = d11;
                                        str25 = J10;
                                        str26 = Q10;
                                        list6 = list2;
                                    } else if (extras2 == null || (localFilePath = extras2.getLocalFilePath()) == null) {
                                        kVar = d11;
                                        str25 = J10;
                                        str26 = Q10;
                                        list6 = null;
                                    } else {
                                        kVar = d11;
                                        List listOf = CollectionsKt.listOf(new File(localFilePath));
                                        str25 = J10;
                                        str26 = Q10;
                                        list6 = listOf;
                                    }
                                    String str35 = str25;
                                    if ((extras2 != null ? extras2.getUploadFileType() : null) == wf.b.VoiceNote) {
                                        fileName = "Voice note.mp3";
                                    } else if (attachment2 != null) {
                                        fileName = attachment2.getFileName();
                                    } else {
                                        str27 = null;
                                        if (extras2 != null || (r11 = extras2.getUploadFileType()) == null) {
                                            wf.b bVar = wf.b.Text;
                                        }
                                        wf.b bVar2 = bVar;
                                        String type = attachment2 == null ? attachment2.getType() : null;
                                        Boolean boxBoolean = Boxing.boxBoolean(z12);
                                        boxBoolean.getClass();
                                        Boolean bool = !(enumC6551b4 != EnumC6551b.WmsFailedRetry ? z12 : false) ? boxBoolean : null;
                                        p11.f66471n = c6550a;
                                        p11.f66472o = str7;
                                        p11.f66473p = str8;
                                        p11.f66474q = str13;
                                        p11.f66475r = str12;
                                        p11.f66476s = attachment2;
                                        p11.f66477t = extras2;
                                        p11.f66478u = list2;
                                        p11.f66479v = null;
                                        p11.f66480w = null;
                                        p11.f66481x = null;
                                        p11.f66482y = null;
                                        p11.f66483z = null;
                                        p11.f66454A = null;
                                        p11.f66470V = 3;
                                        C6550a c6550a7 = c6550a;
                                        P p12 = p11;
                                        z19 = false;
                                        m10 = v02.m(str9, str13, str12, str35, str26, str10, str11, kVar, list6, str27, bVar2, type, function2, z14, z13, bool, p12);
                                        p11 = p12;
                                        if (m10 != obj) {
                                            return obj;
                                        }
                                        String str36 = str12;
                                        str28 = str8;
                                        attachment6 = attachment2;
                                        str29 = str36;
                                        c6550a5 = c6550a7;
                                        str30 = str7;
                                        extras6 = extras2;
                                        list7 = list2;
                                        obj5 = m10;
                                        list2 = list7;
                                        obj6 = attachment6;
                                        str33 = str29;
                                        b10 = (SalesIQResponse) obj5;
                                        str31 = str13;
                                        str32 = str28;
                                        str34 = str30;
                                        c6550a6 = c6550a5;
                                        extras2 = extras6;
                                        if (b10.getIsSuccess()) {
                                        }
                                        if (!b10.getIsSuccess()) {
                                        }
                                    }
                                    str27 = fileName;
                                    if (extras2 != null) {
                                    }
                                    wf.b bVar3 = wf.b.Text;
                                    wf.b bVar22 = bVar3;
                                    if (attachment2 == null) {
                                    }
                                    Boolean boxBoolean2 = Boxing.boxBoolean(z12);
                                    boxBoolean2.getClass();
                                    if (!(enumC6551b4 != EnumC6551b.WmsFailedRetry ? z12 : false)) {
                                    }
                                    p11.f66471n = c6550a;
                                    p11.f66472o = str7;
                                    p11.f66473p = str8;
                                    p11.f66474q = str13;
                                    p11.f66475r = str12;
                                    p11.f66476s = attachment2;
                                    p11.f66477t = extras2;
                                    p11.f66478u = list2;
                                    p11.f66479v = null;
                                    p11.f66480w = null;
                                    p11.f66481x = null;
                                    p11.f66482y = null;
                                    p11.f66483z = null;
                                    p11.f66454A = null;
                                    p11.f66470V = 3;
                                    C6550a c6550a72 = c6550a;
                                    P p122 = p11;
                                    z19 = false;
                                    m10 = v02.m(str9, str13, str12, str35, str26, str10, str11, kVar, list6, str27, bVar22, type, function2, z14, z13, bool, p122);
                                    p11 = p122;
                                    if (m10 != obj) {
                                    }
                                }
                            }
                            b10 = SalesIQResponse.INSTANCE.b(new Throwable("screenName must not be null for sendMessage()"));
                            return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        case 1:
                            boolean z23 = p11.f66467P;
                            boolean z24 = p11.f66466O;
                            Message.Attachment attachment7 = (Message.Attachment) p11.f66465L;
                            Message.Extras extras7 = (Message.Extras) p11.f66464K;
                            Message.RespondedMessage respondedMessage6 = (Message.RespondedMessage) p11.f66463J;
                            Message.f fVar6 = (Message.f) p11.f66462I;
                            C6550a c6550a8 = (C6550a) p11.f66461H;
                            String str37 = (String) p11.f66460G;
                            String str38 = (String) p11.f66459F;
                            String str39 = (String) p11.f66458E;
                            String str40 = (String) p11.f66457D;
                            String str41 = (String) p11.f66456C;
                            Message.g gVar3 = (Message.g) p11.f66455B;
                            Function2 function24 = (Function2) p11.f66454A;
                            String str42 = (String) p11.f66483z;
                            EnumC6551b enumC6551b5 = (EnumC6551b) p11.f66482y;
                            List list9 = (List) p11.f66481x;
                            Message.RespondedMessage respondedMessage7 = (Message.RespondedMessage) p11.f66480w;
                            Message.Extras extras8 = (Message.Extras) p11.f66479v;
                            Message.Attachment attachment8 = (Message.Attachment) p11.f66478u;
                            String str43 = (String) p11.f66477t;
                            String str44 = (String) p11.f66476s;
                            String str45 = (String) p11.f66475r;
                            String str46 = (String) p11.f66474q;
                            String str47 = (String) p11.f66473p;
                            String str48 = (String) p11.f66472o;
                            C6550a c6550a9 = (C6550a) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            extras3 = extras8;
                            str18 = str41;
                            c6550a2 = c6550a9;
                            attachment4 = attachment8;
                            attachment3 = attachment7;
                            respondedMessage3 = respondedMessage6;
                            obj2 = coroutine_suspended;
                            c6550a3 = c6550a8;
                            obj3 = obj7;
                            z15 = z23;
                            z12 = true;
                            respondedMessage4 = respondedMessage7;
                            str16 = str44;
                            str22 = str45;
                            str8 = str47;
                            extras4 = extras7;
                            fVar2 = fVar6;
                            gVar2 = gVar3;
                            function22 = function24;
                            str19 = str43;
                            str15 = str46;
                            str21 = str38;
                            enumC6551b2 = enumC6551b5;
                            str17 = str40;
                            str23 = str42;
                            str20 = str37;
                            list3 = list9;
                            str14 = str39;
                            z16 = z24;
                            str7 = str48;
                            MessageEntity messageEntity3 = (MessageEntity) ((C5582a) obj3).b();
                            p11.f66471n = c6550a2;
                            p11.f66472o = str7;
                            p11.f66473p = str8;
                            p11.f66474q = str15;
                            p11.f66475r = str22;
                            p11.f66476s = str16;
                            p11.f66477t = str19;
                            p11.f66478u = attachment4;
                            p11.f66479v = extras3;
                            p11.f66480w = respondedMessage4;
                            p11.f66481x = list3;
                            p11.f66482y = enumC6551b2;
                            p11.f66483z = str23;
                            p11.f66454A = function22;
                            attachment5 = attachment4;
                            p11.f66455B = null;
                            p11.f66456C = null;
                            p11.f66457D = null;
                            p11.f66458E = null;
                            p11.f66459F = null;
                            p11.f66460G = null;
                            p11.f66461H = null;
                            p11.f66462I = null;
                            p11.f66463J = null;
                            p11.f66464K = null;
                            p11.f66465L = null;
                            p11.f66466O = z16;
                            boolean z222 = z15;
                            p11.f66467P = z222;
                            extras5 = extras3;
                            i10 = 2;
                            p11.f66470V = 2;
                            str24 = str19;
                            z17 = z222;
                            Message.RespondedMessage respondedMessage52 = respondedMessage4;
                            List list82 = list3;
                            enumC6551b3 = enumC6551b2;
                            z18 = z16;
                            str9 = str23;
                            c6550a4 = c6550a2;
                            function23 = function22;
                            i02 = i0(c6550a3, str20, str21, str14, str17, str18, gVar2, fVar2, attachment3, extras4, respondedMessage3, messageEntity3, null, p11, 2048, null);
                            p11 = p11;
                            obj4 = obj2;
                            if (i02 != obj4) {
                            }
                            break;
                        case 2:
                            boolean z25 = p11.f66467P;
                            boolean z26 = p11.f66466O;
                            Function2 function25 = (Function2) p11.f66454A;
                            String str49 = (String) p11.f66483z;
                            EnumC6551b enumC6551b6 = (EnumC6551b) p11.f66482y;
                            list5 = (List) p11.f66481x;
                            respondedMessage2 = (Message.RespondedMessage) p11.f66480w;
                            Message.Extras extras9 = (Message.Extras) p11.f66479v;
                            Message.Attachment attachment9 = (Message.Attachment) p11.f66478u;
                            String str50 = (String) p11.f66477t;
                            String str51 = (String) p11.f66476s;
                            String str52 = (String) p11.f66475r;
                            String str53 = (String) p11.f66474q;
                            String str54 = (String) p11.f66473p;
                            String str55 = (String) p11.f66472o;
                            C6550a c6550a10 = (C6550a) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            c6550a4 = c6550a10;
                            z18 = z26;
                            function23 = function25;
                            str9 = str49;
                            str15 = str53;
                            str22 = str52;
                            enumC6551b3 = enumC6551b6;
                            extras5 = extras9;
                            attachment5 = attachment9;
                            str24 = str50;
                            z17 = z25;
                            i10 = 2;
                            z12 = true;
                            str8 = str54;
                            str7 = str55;
                            obj4 = coroutine_suspended;
                            str16 = str51;
                            c6550a = c6550a4;
                            str10 = str16;
                            obj = obj4;
                            list2 = list5;
                            str11 = str24;
                            enumC6551b4 = enumC6551b3;
                            function2 = function23;
                            z14 = z18;
                            z13 = z17;
                            str13 = str15;
                            str12 = str22;
                            attachment2 = attachment5;
                            extras2 = extras5;
                            if (z14) {
                            }
                            C5582a.C0817a c0817a22 = C5582a.f56502b;
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("Message unique Id must be a non null value to ");
                            sb222.append(z14 ? "edit " : "reply to ");
                            sb222.append(" a message");
                            return C5582a.C0817a.c(c0817a22, new Throwable(sb222.toString()), false, i10, null);
                        case 3:
                            list7 = (List) p11.f66478u;
                            extras6 = (Message.Extras) p11.f66477t;
                            attachment6 = (Message.Attachment) p11.f66476s;
                            str29 = (String) p11.f66475r;
                            str13 = (String) p11.f66474q;
                            str28 = (String) p11.f66473p;
                            str30 = (String) p11.f66472o;
                            c6550a5 = (C6550a) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            obj = coroutine_suspended;
                            obj5 = obj7;
                            z19 = false;
                            z12 = true;
                            list2 = list7;
                            obj6 = attachment6;
                            str33 = str29;
                            b10 = (SalesIQResponse) obj5;
                            str31 = str13;
                            str32 = str28;
                            str34 = str30;
                            c6550a6 = c6550a5;
                            extras2 = extras6;
                            if (b10.getIsSuccess()) {
                            }
                            if (!b10.getIsSuccess()) {
                            }
                            break;
                        case 4:
                            b10 = (SalesIQResponse) p11.f66477t;
                            d10 = (Wh.a) p11.f66476s;
                            str33 = (String) p11.f66475r;
                            str31 = (String) p11.f66474q;
                            str32 = (String) p11.f66473p;
                            str34 = (String) p11.f66472o;
                            c6550a6 = (C6550a) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            obj = coroutine_suspended;
                            z19 = false;
                            z12 = true;
                            C6152a u032 = c6550a6.u0();
                            p11.f66471n = c6550a6;
                            p11.f66472o = str34;
                            p11.f66473p = str32;
                            p11.f66474q = str31;
                            p11.f66475r = str33;
                            p11.f66476s = d10;
                            p11.f66477t = b10;
                            p11.f66470V = 5;
                            z20 = u032.z(str31, str32, null, null, str33, p11);
                            if (z20 == obj) {
                            }
                            MessageEntity messageEntity22 = (MessageEntity) ((C5582a) z20).b();
                            if (messageEntity22 != null) {
                            }
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append("WmsDelay Message sent in API, ");
                            sb32.append(g10 != null ? "Message is yet to be received from WMS" : "Message has been received from WMS");
                            LiveChatUtil.log(sb32.toString());
                            if (g10 != null) {
                            }
                            Unit unit22 = Unit.INSTANCE;
                            d10.g(null);
                            if (!b10.getIsSuccess()) {
                            }
                            break;
                        case 5:
                            b10 = (SalesIQResponse) p11.f66477t;
                            d10 = (Wh.a) p11.f66476s;
                            str33 = (String) p11.f66475r;
                            str31 = (String) p11.f66474q;
                            str32 = (String) p11.f66473p;
                            str34 = (String) p11.f66472o;
                            c6550a6 = (C6550a) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            obj = coroutine_suspended;
                            z20 = obj7;
                            z19 = false;
                            z12 = true;
                            MessageEntity messageEntity222 = (MessageEntity) ((C5582a) z20).b();
                            if (messageEntity222 != null) {
                            }
                            StringBuilder sb322 = new StringBuilder();
                            sb322.append("WmsDelay Message sent in API, ");
                            sb322.append(g10 != null ? "Message is yet to be received from WMS" : "Message has been received from WMS");
                            LiveChatUtil.log(sb322.toString());
                            if (g10 != null) {
                            }
                            Unit unit222 = Unit.INSTANCE;
                            d10.g(null);
                            if (!b10.getIsSuccess()) {
                            }
                            break;
                        case 6:
                            b10 = (SalesIQResponse) p11.f66477t;
                            d10 = (Wh.a) p11.f66476s;
                            str33 = (String) p11.f66475r;
                            str31 = (String) p11.f66474q;
                            str32 = (String) p11.f66473p;
                            str34 = (String) p11.f66472o;
                            c6550a6 = (C6550a) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            obj = coroutine_suspended;
                            z19 = false;
                            z12 = true;
                            c6550a6.j0(str31, str32, str33);
                            Unit unit2222 = Unit.INSTANCE;
                            d10.g(null);
                            if (!b10.getIsSuccess()) {
                            }
                            break;
                        case 7:
                        case 8:
                        case 9:
                            b10 = (SalesIQResponse) p11.f66471n;
                            ResultKt.throwOnFailure(obj7);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (p11.f66470V) {
            }
        } catch (Throwable th2) {
            d10.g(null);
            throw th2;
        }
        p10 = new P(continuation);
        p11 = p10;
        Object obj72 = p11.f66468R;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // xf.InterfaceC6823a
    public Object Q(String str, String str2, Message.RespondedMessage respondedMessage, Continuation continuation) {
        C6152a u02 = u0();
        String v10 = s0().v(respondedMessage);
        Intrinsics.checkNotNullExpressionValue(v10, "toJson(...)");
        return u02.a0(str, str2, v10, continuation);
    }

    @Override // xf.InterfaceC6823a
    public C5582a a(String str, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        C5582a D10 = u0().D(str, chatId);
        if (D10.d()) {
            return D10.a(new C6571v((InterfaceC5321f) D10.b(), this));
        }
        Intrinsics.checkNotNull(D10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return D10;
    }

    @Override // xf.InterfaceC6823a
    public Object b(String str, String str2, Boolean bool, Continuation continuation) {
        return u0().W(str, str2, bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Continuation continuation) {
        C6568s c6568s;
        int i10;
        C6550a c6550a;
        C5582a c5582a;
        if (continuation instanceof C6568s) {
            c6568s = (C6568s) continuation;
            int i11 = c6568s.f66606q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6568s.f66606q = i11 - Integer.MIN_VALUE;
                Object obj = c6568s.f66604o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6568s.f66606q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C6152a u02 = u0();
                    c6568s.f66603n = this;
                    c6568s.f66606q = 1;
                    obj = u02.s(c6568s);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6550a = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6550a = (C6550a) c6568s.f66603n;
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (!c5582a.d()) {
                    return c5582a.a(MessageRoomToDomainKt.h((List) c5582a.b(), c6550a.f66360a, c6550a.s0(), false, c6550a.f66368i, 4, null));
                }
                Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                return c5582a;
            }
        }
        c6568s = new C6568s(continuation);
        Object obj2 = c6568s.f66604o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6568s.f66606q;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (!c5582a.d()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, String str2, Continuation continuation) {
        J j10;
        int i10;
        Ref.ObjectRef objectRef;
        Object obj;
        String str3;
        String str4;
        C6550a c6550a;
        C5582a c5582a;
        C5582a c5582a2;
        Ref.ObjectRef objectRef2;
        String str5;
        Message message;
        Message.g type;
        Message.g gVar;
        Object g10;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        T t10;
        C5582a c5582a3;
        if (continuation instanceof J) {
            j10 = (J) continuation;
            int i11 = j10.f66409v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j10.f66409v = i11 - Integer.MIN_VALUE;
                J j11 = j10;
                Object obj2 = j11.f66407t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = j11.f66409v;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                    C6152a u02 = u0();
                    j11.f66401n = this;
                    j11.f66402o = str;
                    j11.f66403p = str2;
                    j11.f66404q = objectRef5;
                    j11.f66409v = 1;
                    Object y10 = C6152a.y(u02, null, str, null, null, str2, j11, 8, null);
                    if (y10 != coroutine_suspended) {
                        objectRef = objectRef5;
                        obj = y10;
                        str3 = str;
                        str4 = str2;
                        c6550a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef3 = (Ref.ObjectRef) j11.f66403p;
                        c5582a3 = (C5582a) j11.f66402o;
                        objectRef4 = (Ref.ObjectRef) j11.f66401n;
                        ResultKt.throwOnFailure(obj2);
                        t10 = obj2;
                        objectRef3.element = t10;
                        c5582a = c5582a3;
                        objectRef = objectRef4;
                        if (c5582a.d()) {
                            Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                        } else {
                            c5582a = c5582a.a(Unit.INSTANCE);
                        }
                        C5582a c5582a4 = (C5582a) objectRef.element;
                        return c5582a4 != null ? c5582a : c5582a4;
                    }
                    message = (Message) j11.f66406s;
                    C5582a c5582a5 = (C5582a) j11.f66405r;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) j11.f66404q;
                    String str6 = (String) j11.f66403p;
                    String str7 = (String) j11.f66402o;
                    c6550a = (C6550a) j11.f66401n;
                    ResultKt.throwOnFailure(obj2);
                    c5582a2 = c5582a5;
                    objectRef2 = objectRef6;
                    str3 = str7;
                    str5 = str6;
                    Message.RespondedMessage respondedMessage = message.getRespondedMessage();
                    type = respondedMessage == null ? respondedMessage.getType() : null;
                    gVar = Message.g.Skip;
                    if (type != gVar) {
                        gVar = message.getMessageType();
                    }
                    String acknowledgementKey = message.getAcknowledgementKey();
                    String content = message.getContent();
                    j11.f66401n = objectRef2;
                    j11.f66402o = c5582a2;
                    j11.f66403p = objectRef2;
                    j11.f66404q = null;
                    j11.f66405r = null;
                    j11.f66406s = null;
                    j11.f66409v = 3;
                    g10 = c6550a.g(acknowledgementKey, str3, content, str5, gVar, false, false, true, j11);
                    if (g10 != coroutine_suspended) {
                        objectRef3 = objectRef2;
                        objectRef4 = objectRef3;
                        t10 = g10;
                        c5582a3 = c5582a2;
                        objectRef3.element = t10;
                        c5582a = c5582a3;
                        objectRef = objectRef4;
                        if (c5582a.d()) {
                        }
                        C5582a c5582a42 = (C5582a) objectRef.element;
                        if (c5582a42 != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                objectRef = (Ref.ObjectRef) j11.f66404q;
                str4 = (String) j11.f66403p;
                str3 = (String) j11.f66402o;
                C6550a c6550a2 = (C6550a) j11.f66401n;
                ResultKt.throwOnFailure(obj2);
                c6550a = c6550a2;
                obj = obj2;
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    MessageEntity messageEntity = (MessageEntity) c5582a.b();
                    Message g11 = messageEntity != null ? MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null) : null;
                    if (g11 != null) {
                        C6152a u03 = c6550a.u0();
                        Message.f fVar = Message.f.Sending;
                        j11.f66401n = c6550a;
                        j11.f66402o = str3;
                        j11.f66403p = str4;
                        j11.f66404q = objectRef;
                        j11.f66405r = c5582a;
                        j11.f66406s = g11;
                        j11.f66409v = 2;
                        if (u03.c0(str3, str4, fVar, j11) != coroutine_suspended) {
                            c5582a2 = c5582a;
                            objectRef2 = objectRef;
                            str5 = str4;
                            message = g11;
                            Message.RespondedMessage respondedMessage2 = message.getRespondedMessage();
                            if (respondedMessage2 == null) {
                            }
                            gVar = Message.g.Skip;
                            if (type != gVar) {
                            }
                            String acknowledgementKey2 = message.getAcknowledgementKey();
                            String content2 = message.getContent();
                            j11.f66401n = objectRef2;
                            j11.f66402o = c5582a2;
                            j11.f66403p = objectRef2;
                            j11.f66404q = null;
                            j11.f66405r = null;
                            j11.f66406s = null;
                            j11.f66409v = 3;
                            g10 = c6550a.g(acknowledgementKey2, str3, content2, str5, gVar, false, false, true, j11);
                            if (g10 != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (c5582a.d()) {
                }
                C5582a c5582a422 = (C5582a) objectRef.element;
                if (c5582a422 != null) {
                }
            }
        }
        j10 = new J(continuation);
        J j112 = j10;
        Object obj22 = j112.f66407t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = j112.f66409v;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj;
        if (c5582a.d()) {
        }
        if (c5582a.d()) {
        }
        C5582a c5582a4222 = (C5582a) objectRef.element;
        if (c5582a4222 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r2.A0(r12, r6) == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(String str, String str2, Continuation continuation) {
        F f10;
        F f11;
        Object coroutine_suspended;
        int i10;
        String I10;
        C6550a c6550a;
        String str3;
        String str4;
        String str5;
        C6550a c6550a2;
        C6152a u02;
        Object obj;
        C5582a.C0817a c0817a;
        Throwable th2;
        C5582a c10;
        if (continuation instanceof F) {
            f10 = (F) continuation;
            int i11 = f10.f66382t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f10.f66382t = i11 - Integer.MIN_VALUE;
                f11 = f10;
                Object obj2 = f11.f66380r;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = f11.f66382t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    I10 = o0().I();
                    if (((I10 == null || !o0().g0()) ? null : this) != null) {
                        C6364a v02 = v0();
                        Intrinsics.checkNotNull(I10);
                        f11.f66376n = this;
                        f11.f66377o = str;
                        f11.f66378p = str2;
                        f11.f66379q = I10;
                        f11.f66382t = 1;
                        Object j10 = v02.j(I10, str, str2, f11);
                        if (j10 != coroutine_suspended) {
                            str3 = str;
                            str4 = str2;
                            str5 = I10;
                            obj2 = j10;
                            c6550a2 = this;
                        }
                        return coroutine_suspended;
                    }
                    c6550a = this;
                    c0817a = C5582a.f56502b;
                    if (I10 != null) {
                    }
                } else if (i10 == 1) {
                    String str6 = (String) f11.f66379q;
                    String str7 = (String) f11.f66378p;
                    String str8 = (String) f11.f66377o;
                    C6550a c6550a3 = (C6550a) f11.f66376n;
                    ResultKt.throwOnFailure(obj2);
                    str4 = str7;
                    str3 = str8;
                    str5 = str6;
                    c6550a2 = c6550a3;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0817a = (C5582a.C0817a) f11.f66376n;
                        ResultKt.throwOnFailure(obj2);
                        th2 = new Throwable("Screen Name must not be Null for readMessage()");
                        return C5582a.C0817a.c(c0817a, th2, false, 2, null);
                    }
                    obj = f11.f66379q;
                    String str9 = (String) f11.f66378p;
                    String str10 = (String) f11.f66377o;
                    c6550a = (C6550a) f11.f66376n;
                    ResultKt.throwOnFailure(obj2);
                    I10 = str9;
                    str2 = str10;
                    c10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c((SalesIQResponse) obj);
                    if (c10 != null) {
                        return c10;
                    }
                    c0817a = C5582a.f56502b;
                    if (I10 != null) {
                        th2 = new Throwable("Message (ID - " + str2 + ") cannot be read as the Read receipts feature was disabled");
                        return C5582a.C0817a.c(c0817a, th2, false, 2, null);
                    }
                    AbstractC2916a.k kVar = new AbstractC2916a.k("Screen name must not be null");
                    f11.f66376n = c0817a;
                    f11.f66377o = null;
                    f11.f66378p = null;
                    f11.f66379q = null;
                    f11.f66382t = 3;
                }
                u02 = c6550a2.u0();
                f11.f66376n = c6550a2;
                f11.f66377o = str4;
                f11.f66378p = str5;
                f11.f66379q = obj2;
                f11.f66382t = 2;
                if (u02.Z(null, str3, str4, true, f11) != coroutine_suspended) {
                    c6550a = c6550a2;
                    obj = obj2;
                    I10 = str5;
                    str2 = str4;
                    c10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c((SalesIQResponse) obj);
                    if (c10 != null) {
                    }
                    c0817a = C5582a.f56502b;
                    if (I10 != null) {
                    }
                }
                return coroutine_suspended;
            }
        }
        f10 = new F(continuation);
        f11 = f10;
        Object obj22 = f11.f66380r;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = f11.f66382t;
        if (i10 != 0) {
        }
        u02 = c6550a2.u0();
        f11.f66376n = c6550a2;
        f11.f66377o = str4;
        f11.f66378p = str5;
        f11.f66379q = obj22;
        f11.f66382t = 2;
        if (u02.Z(null, str3, str4, true, f11) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // xf.InterfaceC6823a
    public Object f(String str, String str2, String str3, Continuation continuation) {
        return u0().Q(str, null, null, str2, str3, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0437, code lost:
    
        if (r5 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0439, code lost:
    
        r17 = kotlin.jvm.internal.Intrinsics.areEqual(r5.isSkippable(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x044c, code lost:
    
        if (r17 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x044e, code lost:
    
        r5 = com.zoho.livechat.android.modules.messages.domain.entities.Message.g.Skip;
        r6 = "-";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x044a, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03d8, code lost:
    
        r5 = com.zoho.livechat.android.modules.common.domain.entities.Form.Message.Meta.InputCard.a.Campaign;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03da, code lost:
    
        if (r8 != r5) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03dc, code lost:
    
        r5 = r4.o0();
        r6 = De.a.IsCampaignSuggestionsSubscribed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03f8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.e(Ce.a.a(r6)).b(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03fa, code lost:
    
        r5 = r4.f66360a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0417, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(Ae.a.m(r4.o0(), Ce.a.a(r6), false, 2, null).b(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0419, code lost:
    
        r6 = od.t.f60978Z0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x041e, code lost:
    
        r6 = r5.getString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x041c, code lost:
    
        r6 = od.t.f60972Y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0423, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0425, code lost:
    
        if (r8 == r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0427, code lost:
    
        r6 = r0.getDepartmentName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03c4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5 != null ? r5.getFieldName() : null, "department") != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03af, code lost:
    
        if (r6.contains(r8 != null ? com.zoho.livechat.android.modules.common.domain.entities.Form.Message.Meta.InputCard.a.Companion.a(r8) : null) == true) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03c6, code lost:
    
        if (r8 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c8, code lost:
    
        r6 = (java.lang.String) r4.r0().j(r8).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x042b, code lost:
    
        if (r6 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0431, code lost:
    
        if (r6.length() != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0455, code lost:
    
        r5 = com.zoho.livechat.android.modules.messages.domain.entities.Message.g.Text;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0452, code lost:
    
        r9 = r5;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0458, code lost:
    
        if (r7 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x045a, code lost:
    
        r8 = java.lang.String.valueOf(rd.b.f());
        r13.f66437n = r3;
        r13.f66438o = null;
        r13.f66439p = null;
        r13.f66440q = null;
        r13.f66441r = null;
        r13.f66447x = r1;
        r13.f66436A = 4;
        r2 = r4.g(r10, r21, r7, r8, r9, true, true, true, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x047c, code lost:
    
        if (r2 != r14) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0488, code lost:
    
        r13.f66437n = r3;
        r13.f66438o = null;
        r13.f66439p = null;
        r13.f66440q = null;
        r13.f66441r = null;
        r13.f66447x = r1;
        r13.f66436A = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x049c, code lost:
    
        if (D0(r4, r2, r0, r13) != r14) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0433, code lost:
    
        r5 = r7.getMeta();
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0680 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0371 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r5v18, types: [T, com.zoho.livechat.android.modules.messages.domain.entities.Message] */
    /* JADX WARN: Type inference failed for: r8v31, types: [T, com.zoho.livechat.android.modules.messages.domain.entities.Message] */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(String str, String str2, String str3, String str4, Message.g gVar, boolean z10, boolean z11, boolean z12, Continuation continuation) {
        N n10;
        N n11;
        String f10;
        SalesIQResponse b10;
        int i10;
        Object obj;
        Message.RespondedMessage respondedMessage;
        boolean z13;
        C6550a c6550a;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z14;
        boolean z15;
        String str9;
        int i11;
        Message.RespondedMessage respondedMessage2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        C6550a c6550a2;
        int i12;
        h B10;
        SalesIQResponse salesIQResponse;
        boolean z16;
        String str15;
        int i13;
        C6152a u02;
        Message.f fVar;
        boolean z17;
        C6550a c6550a3;
        Form.Message message;
        SalesIQChat chatFromAcknowledgementKey;
        Ref.ObjectRef objectRef;
        Form.Message.Meta meta;
        boolean z18;
        String str16;
        boolean z19;
        SalesIQResponse salesIQResponse2;
        Form.Message.Meta.InputCard.a aVar;
        C6550a c6550a4;
        HashSet hashSet;
        Form.Message.Meta.InputCard inputCard;
        String text;
        String str17;
        SalesIQResponse salesIQResponse3;
        Object obj2;
        String a10;
        Message.g gVar2 = gVar;
        if (continuation instanceof N) {
            n10 = (N) continuation;
            int i14 = n10.f66436A;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n10.f66436A = i14 - Integer.MIN_VALUE;
                n11 = n10;
                Object obj3 = n11.f66448y;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (n11.f66436A) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        String I10 = o0().I();
                        f10 = o0().f();
                        if (!i.f(I10) || !i.f(f10)) {
                            b10 = SalesIQResponse.INSTANCE.b(new Throwable("Screen name is null for logDebugInfo"));
                            i10 = 0;
                            obj = null;
                            Object c10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                            if (obj == null) {
                                obj = c10;
                            }
                            return i10 != 0 ? C5582a.f56502b.b(new C5582a.b("Form context completed but selected department status differs with the form", Boxing.boxInt(C6224F.f64098d.a()), null, 4, null)) : obj;
                        }
                        Message.g gVar3 = Message.g.Skip;
                        respondedMessage = gVar2 == gVar3 ? new Message.RespondedMessage(gVar3, "-", null, 4, null) : null;
                        if (z12) {
                            z13 = true;
                            c6550a = this;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            z14 = z10;
                            z15 = z11;
                            str9 = I10;
                            i11 = 0;
                            c6550a.o0().k0(De.a.OngoingConversationContextAcknowledgementKey, str5, z13);
                            C6364a v02 = c6550a.v0();
                            Intrinsics.checkNotNull(str9);
                            Intrinsics.checkNotNull(f10);
                            String J10 = c6550a.o0().J();
                            if (respondedMessage != null) {
                            }
                            n11.f66437n = c6550a;
                            n11.f66438o = str5;
                            n11.f66439p = str6;
                            n11.f66440q = str8;
                            n11.f66441r = null;
                            n11.f66442s = null;
                            n11.f66443t = null;
                            n11.f66444u = null;
                            n11.f66447x = i11;
                            n11.f66445v = z14;
                            n11.f66436A = 2;
                            String str18 = str8;
                            obj3 = v02.l(str9, f10, str18, str7, J10, r10, z15, n11);
                            if (obj3 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (gVar2 == gVar3) {
                            gVar2 = null;
                        }
                        if (gVar2 == null) {
                            gVar2 = Message.g.Text;
                        }
                        Message.g gVar4 = gVar2;
                        Message.f fVar2 = Message.f.Sending;
                        Gson s02 = s0();
                        k kVar = new k();
                        kVar.n("form_msg", Boxing.boxBoolean(true));
                        Unit unit = Unit.INSTANCE;
                        Message.Meta meta2 = (Message.Meta) AbstractC5895g.a(s02, kVar, Message.Meta.class);
                        n11.f66437n = this;
                        n11.f66438o = str;
                        n11.f66439p = str2;
                        n11.f66440q = str3;
                        n11.f66441r = str4;
                        n11.f66442s = I10;
                        n11.f66443t = f10;
                        n11.f66444u = respondedMessage;
                        n11.f66445v = z11;
                        n11.f66447x = 0;
                        n11.f66446w = z10;
                        n11.f66436A = 1;
                        z13 = true;
                        if (h0(str, str2, null, str4, str3, gVar4, fVar2, null, null, respondedMessage, null, meta2, n11) != coroutine_suspended) {
                            c6550a = this;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            z14 = z10;
                            z15 = z11;
                            respondedMessage2 = respondedMessage;
                            str10 = f10;
                            i11 = 0;
                            str11 = I10;
                            f10 = str10;
                            str9 = str11;
                            respondedMessage = respondedMessage2;
                            c6550a.o0().k0(De.a.OngoingConversationContextAcknowledgementKey, str5, z13);
                            C6364a v022 = c6550a.v0();
                            Intrinsics.checkNotNull(str9);
                            Intrinsics.checkNotNull(f10);
                            String J102 = c6550a.o0().J();
                            k e10 = (respondedMessage != null || (B10 = c6550a.s0().B(respondedMessage)) == null) ? null : B10.e();
                            n11.f66437n = c6550a;
                            n11.f66438o = str5;
                            n11.f66439p = str6;
                            n11.f66440q = str8;
                            n11.f66441r = null;
                            n11.f66442s = null;
                            n11.f66443t = null;
                            n11.f66444u = null;
                            n11.f66447x = i11;
                            n11.f66445v = z14;
                            n11.f66436A = 2;
                            String str182 = str8;
                            obj3 = v022.l(str9, f10, str182, str7, J102, e10, z15, n11);
                            if (obj3 != coroutine_suspended) {
                                str12 = str5;
                                str13 = str6;
                                str14 = str182;
                                c6550a2 = c6550a;
                                i12 = i11;
                                salesIQResponse = (SalesIQResponse) obj3;
                                if (salesIQResponse.getIsSuccess()) {
                                    SalesIQResponse.Error error = salesIQResponse.getError();
                                    if (error != null) {
                                        Integer b11 = error.b();
                                        int a11 = C6223E.f64097d.a();
                                        if (b11 != null && b11.intValue() == a11) {
                                            z16 = true;
                                            if (z16) {
                                                str15 = null;
                                                C6152a u03 = c6550a2.u0();
                                                Message.f fVar3 = Message.f.Failure;
                                                n11.f66437n = salesIQResponse;
                                                n11.f66438o = null;
                                                n11.f66439p = null;
                                                n11.f66440q = null;
                                                n11.f66447x = i12;
                                                n11.f66436A = 8;
                                                if (u03.c0(str13, str14, fVar3, n11) != coroutine_suspended) {
                                                    i13 = i12;
                                                    salesIQResponse3 = salesIQResponse;
                                                    obj2 = str15;
                                                    b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                                                    i10 = i13;
                                                    obj = obj2;
                                                    Object c102 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                                                    if (obj == null) {
                                                    }
                                                    if (i10 != 0) {
                                                    }
                                                }
                                            } else {
                                                c6550a2.n0().L(null);
                                                HashMap s10 = c6550a2.n0().s();
                                                if (s10 != null) {
                                                }
                                                HashMap s11 = c6550a2.n0().s();
                                                if (s11 != null) {
                                                }
                                                SalesIQChat chatFromAcknowledgementKey2 = c6550a2.q0().getChatFromAcknowledgementKey(str12);
                                                if (chatFromAcknowledgementKey2 != null && chatFromAcknowledgementKey2.getDeptid() == null) {
                                                    List i15 = AbstractC3945n.i(false, null, chatFromAcknowledgementKey2.getConvID());
                                                    Intrinsics.checkNotNull(i15);
                                                    if (!i15.isEmpty()) {
                                                        Channel.Department department = (Channel.Department) i15.get(0);
                                                        chatFromAcknowledgementKey2.setDeptid(department.getId());
                                                        chatFromAcknowledgementKey2.setDepartmentName(department.getName());
                                                        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chatFromAcknowledgementKey2);
                                                    }
                                                }
                                                if (EnumC4544a.Companion.a((String) c6550a2.o0().M(De.a.OngoingConversationContextAppStatus, null).b()) == EnumC4544a.Online) {
                                                    Channel.Department e11 = AbstractC3945n.e(chatFromAcknowledgementKey2 != null ? chatFromAcknowledgementKey2.getDeptid() : null);
                                                    if (e11 != null ? Intrinsics.areEqual(e11.isOnline(), Boxing.boxBoolean(true)) : false) {
                                                        LiveChatUtil.setFormContextCompleted();
                                                        u02 = c6550a2.u0();
                                                        fVar = Message.f.Sent;
                                                        n11.f66437n = c6550a2;
                                                        n11.f66438o = salesIQResponse;
                                                        str15 = null;
                                                        n11.f66439p = null;
                                                        n11.f66440q = null;
                                                        n11.f66447x = i12;
                                                        n11.f66436A = 7;
                                                        if (u02.c0(str13, str14, fVar, n11) != coroutine_suspended) {
                                                            i13 = i12;
                                                            c6550a2.o0().k0(De.a.OngoingConversationContextAppStatus, str15, true);
                                                            c6550a2.o0().h0("is_ongoing_conversation_context_auto_reply_on", false);
                                                            salesIQResponse3 = salesIQResponse;
                                                            obj2 = str15;
                                                            b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                                                            i10 = i13;
                                                            obj = obj2;
                                                        }
                                                    }
                                                    i12 = 1;
                                                    u02 = c6550a2.u0();
                                                    fVar = Message.f.Sent;
                                                    n11.f66437n = c6550a2;
                                                    n11.f66438o = salesIQResponse;
                                                    str15 = null;
                                                    n11.f66439p = null;
                                                    n11.f66440q = null;
                                                    n11.f66447x = i12;
                                                    n11.f66436A = 7;
                                                    if (u02.c0(str13, str14, fVar, n11) != coroutine_suspended) {
                                                    }
                                                } else {
                                                    Channel.Department e12 = AbstractC3945n.e(chatFromAcknowledgementKey2 != null ? chatFromAcknowledgementKey2.getDeptid() : null);
                                                    if (e12 != null ? Intrinsics.areEqual(e12.isOnline(), Boxing.boxBoolean(false)) : false) {
                                                        LiveChatUtil.setFormContextCompleted();
                                                        u02 = c6550a2.u0();
                                                        fVar = Message.f.Sent;
                                                        n11.f66437n = c6550a2;
                                                        n11.f66438o = salesIQResponse;
                                                        str15 = null;
                                                        n11.f66439p = null;
                                                        n11.f66440q = null;
                                                        n11.f66447x = i12;
                                                        n11.f66436A = 7;
                                                        if (u02.c0(str13, str14, fVar, n11) != coroutine_suspended) {
                                                        }
                                                    }
                                                    i12 = 1;
                                                    u02 = c6550a2.u0();
                                                    fVar = Message.f.Sent;
                                                    n11.f66437n = c6550a2;
                                                    n11.f66438o = salesIQResponse;
                                                    str15 = null;
                                                    n11.f66439p = null;
                                                    n11.f66440q = null;
                                                    n11.f66447x = i12;
                                                    n11.f66436A = 7;
                                                    if (u02.c0(str13, str14, fVar, n11) != coroutine_suspended) {
                                                    }
                                                }
                                                Object c1022 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                                                if (obj == null) {
                                                }
                                                if (i10 != 0) {
                                                }
                                            }
                                        }
                                    }
                                    z16 = false;
                                    if (z16) {
                                    }
                                } else {
                                    FormResponse.Message message2 = (FormResponse.Message) salesIQResponse.getData();
                                    Form.Message a12 = message2 != null ? Ld.b.a(message2, c6550a2.s0()) : null;
                                    c6550a2.n0().L(a12);
                                    C6152a u04 = c6550a2.u0();
                                    Message.f fVar4 = Message.f.Sent;
                                    n11.f66437n = c6550a2;
                                    n11.f66438o = str12;
                                    n11.f66439p = str13;
                                    n11.f66440q = salesIQResponse;
                                    n11.f66441r = a12;
                                    n11.f66447x = i12;
                                    n11.f66445v = z14;
                                    n11.f66436A = 3;
                                    if (u04.c0(str13, str14, fVar4, n11) != coroutine_suspended) {
                                        int i16 = i12;
                                        z17 = z14;
                                        i13 = i16;
                                        c6550a3 = c6550a2;
                                        message = a12;
                                        String str19 = str13;
                                        if ((message == null ? message.getMeta() : null) != null && (text = message.getText()) != null && text.length() == 0) {
                                            if (message.getStringResourceId() == null) {
                                                Application application = c6550a3.f66360a;
                                                Integer stringResourceId = message.getStringResourceId();
                                                Intrinsics.checkNotNull(stringResourceId);
                                                str17 = application.getString(stringResourceId.intValue());
                                            } else {
                                                str17 = "";
                                            }
                                            message = Form.Message.copy$default(message, null, null, str17, null, 11, null);
                                        }
                                        chatFromAcknowledgementKey = c6550a3.q0().getChatFromAcknowledgementKey(str12);
                                        long f11 = b.f() + 1;
                                        objectRef = new Ref.ObjectRef();
                                        if ((message == null ? message.getMeta() : null) != null && chatFromAcknowledgementKey != null) {
                                            meta = message.getMeta();
                                            if ((meta == null ? meta.getSuggestions() : null) == null) {
                                                List i17 = AbstractC3945n.i(chatFromAcknowledgementKey.isTriggeredChat(), null, chatFromAcknowledgementKey.getConvID());
                                                int size = i17.size();
                                                if (chatFromAcknowledgementKey.getDepartmentName() != null || chatFromAcknowledgementKey.getDeptid() != null) {
                                                    int i18 = 0;
                                                    while (i18 < size) {
                                                        Channel.Department department2 = (Channel.Department) i17.get(i18);
                                                        boolean z20 = z17;
                                                        str16 = str19;
                                                        if (StringsKt.equals(department2.getName(), chatFromAcknowledgementKey.getDepartmentName(), true) || StringsKt.equals(department2.getId(), chatFromAcknowledgementKey.getDeptid(), true)) {
                                                            LiveChatUtil.log("onDepartmentSelected");
                                                            z19 = true;
                                                            if (objectRef.element == 0 || z19) {
                                                                Object b12 = c6550a3.o0().P(De.a.OngoingConversationContextRequestedMessages, null).b();
                                                                HashSet hashSet2 = !(b12 instanceof HashSet) ? (HashSet) b12 : null;
                                                                Form.Message.Meta meta3 = message.getMeta();
                                                                Form.Message.Meta.InputCard.a type = (meta3 != null || (inputCard = meta3.getInputCard()) == null) ? null : inputCard.getType();
                                                                if (z19) {
                                                                    if (hashSet2 != null) {
                                                                        break;
                                                                    }
                                                                    Form.Message.Meta meta4 = message.getMeta();
                                                                    break;
                                                                }
                                                                n11.f66437n = c6550a3;
                                                                n11.f66438o = salesIQResponse;
                                                                n11.f66439p = hashSet2;
                                                                n11.f66440q = type;
                                                                n11.f66441r = null;
                                                                n11.f66447x = i13;
                                                                n11.f66436A = 6;
                                                                if (D0(c6550a3, objectRef, chatFromAcknowledgementKey, n11) != coroutine_suspended) {
                                                                    salesIQResponse2 = salesIQResponse;
                                                                    aVar = type;
                                                                    c6550a4 = c6550a3;
                                                                    hashSet = hashSet2;
                                                                    Ae.a o02 = c6550a4.o0();
                                                                    De.a aVar2 = De.a.OngoingConversationContextRequestedMessages;
                                                                    if (hashSet == null) {
                                                                        hashSet = new HashSet();
                                                                    }
                                                                    if (aVar != null && (a10 = Form.Message.Meta.InputCard.a.Companion.a(aVar)) != null) {
                                                                        hashSet.add(a10);
                                                                        Unit unit2 = Unit.INSTANCE;
                                                                    }
                                                                    Unit unit3 = Unit.INSTANCE;
                                                                    o02.l0(aVar2, hashSet, true);
                                                                    salesIQResponse3 = salesIQResponse2;
                                                                    obj2 = null;
                                                                }
                                                            }
                                                        } else {
                                                            i18++;
                                                            z17 = z20;
                                                            str19 = str16;
                                                        }
                                                    }
                                                    z18 = z17;
                                                    str16 = str19;
                                                } else if (size == 1) {
                                                    Channel.Department department3 = (Channel.Department) i17.get(0);
                                                    chatFromAcknowledgementKey.setDeptid(department3.getId());
                                                    chatFromAcknowledgementKey.setDepartmentName(department3.getName());
                                                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chatFromAcknowledgementKey);
                                                    LiveChatUtil.log("onDepartmentSelected only one department available");
                                                    str16 = str19;
                                                    z19 = true;
                                                    if (objectRef.element == 0) {
                                                    }
                                                    Object b122 = c6550a3.o0().P(De.a.OngoingConversationContextRequestedMessages, null).b();
                                                    if (!(b122 instanceof HashSet)) {
                                                    }
                                                    Form.Message.Meta meta32 = message.getMeta();
                                                    if (meta32 != null) {
                                                    }
                                                    if (z19) {
                                                    }
                                                    n11.f66437n = c6550a3;
                                                    n11.f66438o = salesIQResponse;
                                                    n11.f66439p = hashSet2;
                                                    n11.f66440q = type;
                                                    n11.f66441r = null;
                                                    n11.f66447x = i13;
                                                    n11.f66436A = 6;
                                                    if (D0(c6550a3, objectRef, chatFromAcknowledgementKey, n11) != coroutine_suspended) {
                                                    }
                                                } else {
                                                    if (size > 1) {
                                                        objectRef.element = c6550a3.t0(chatFromAcknowledgementKey, f11, message);
                                                    }
                                                    z18 = z17;
                                                    str16 = str19;
                                                }
                                                b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                                                i10 = i13;
                                                obj = obj2;
                                                Object c10222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                                                if (obj == null) {
                                                }
                                                if (i10 != 0) {
                                                }
                                            } else {
                                                z18 = z17;
                                                str16 = str19;
                                                objectRef.element = c6550a3.t0(chatFromAcknowledgementKey, f11, message);
                                            }
                                            z19 = z18;
                                            if (objectRef.element == 0) {
                                            }
                                            Object b1222 = c6550a3.o0().P(De.a.OngoingConversationContextRequestedMessages, null).b();
                                            if (!(b1222 instanceof HashSet)) {
                                            }
                                            Form.Message.Meta meta322 = message.getMeta();
                                            if (meta322 != null) {
                                            }
                                            if (z19) {
                                            }
                                            n11.f66437n = c6550a3;
                                            n11.f66438o = salesIQResponse;
                                            n11.f66439p = hashSet2;
                                            n11.f66440q = type;
                                            n11.f66441r = null;
                                            n11.f66447x = i13;
                                            n11.f66436A = 6;
                                            if (D0(c6550a3, objectRef, chatFromAcknowledgementKey, n11) != coroutine_suspended) {
                                            }
                                        }
                                        salesIQResponse3 = salesIQResponse;
                                        obj2 = null;
                                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                                        i10 = i13;
                                        obj = obj2;
                                        Object c102222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                                        if (obj == null) {
                                        }
                                        if (i10 != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        z14 = n11.f66446w;
                        int i19 = n11.f66447x;
                        z15 = n11.f66445v;
                        respondedMessage2 = (Message.RespondedMessage) n11.f66444u;
                        str10 = (String) n11.f66443t;
                        str11 = (String) n11.f66442s;
                        str8 = (String) n11.f66441r;
                        str7 = (String) n11.f66440q;
                        str6 = (String) n11.f66439p;
                        String str20 = (String) n11.f66438o;
                        c6550a = (C6550a) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        i11 = i19;
                        str5 = str20;
                        z13 = true;
                        f10 = str10;
                        str9 = str11;
                        respondedMessage = respondedMessage2;
                        c6550a.o0().k0(De.a.OngoingConversationContextAcknowledgementKey, str5, z13);
                        C6364a v0222 = c6550a.v0();
                        Intrinsics.checkNotNull(str9);
                        Intrinsics.checkNotNull(f10);
                        String J1022 = c6550a.o0().J();
                        if (respondedMessage != null) {
                        }
                        n11.f66437n = c6550a;
                        n11.f66438o = str5;
                        n11.f66439p = str6;
                        n11.f66440q = str8;
                        n11.f66441r = null;
                        n11.f66442s = null;
                        n11.f66443t = null;
                        n11.f66444u = null;
                        n11.f66447x = i11;
                        n11.f66445v = z14;
                        n11.f66436A = 2;
                        String str1822 = str8;
                        obj3 = v0222.l(str9, f10, str1822, str7, J1022, e10, z15, n11);
                        if (obj3 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        z14 = n11.f66445v;
                        int i20 = n11.f66447x;
                        String str21 = (String) n11.f66440q;
                        String str22 = (String) n11.f66439p;
                        String str23 = (String) n11.f66438o;
                        C6550a c6550a5 = (C6550a) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        i12 = i20;
                        str14 = str21;
                        c6550a2 = c6550a5;
                        str12 = str23;
                        str13 = str22;
                        salesIQResponse = (SalesIQResponse) obj3;
                        if (salesIQResponse.getIsSuccess()) {
                        }
                        return coroutine_suspended;
                    case 3:
                        boolean z21 = n11.f66445v;
                        int i21 = n11.f66447x;
                        message = (Form.Message) n11.f66441r;
                        SalesIQResponse salesIQResponse4 = (SalesIQResponse) n11.f66440q;
                        str13 = (String) n11.f66439p;
                        str12 = (String) n11.f66438o;
                        C6550a c6550a6 = (C6550a) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        z17 = z21;
                        i13 = i21;
                        salesIQResponse = salesIQResponse4;
                        c6550a3 = c6550a6;
                        String str192 = str13;
                        if ((message == null ? message.getMeta() : null) != null) {
                            if (message.getStringResourceId() == null) {
                            }
                            message = Form.Message.copy$default(message, null, null, str17, null, 11, null);
                            break;
                        }
                        chatFromAcknowledgementKey = c6550a3.q0().getChatFromAcknowledgementKey(str12);
                        long f112 = b.f() + 1;
                        objectRef = new Ref.ObjectRef();
                        if ((message == null ? message.getMeta() : null) != null) {
                            meta = message.getMeta();
                            if ((meta == null ? meta.getSuggestions() : null) == null) {
                            }
                            z19 = z18;
                            if (objectRef.element == 0) {
                            }
                            Object b12222 = c6550a3.o0().P(De.a.OngoingConversationContextRequestedMessages, null).b();
                            if (!(b12222 instanceof HashSet)) {
                            }
                            Form.Message.Meta meta3222 = message.getMeta();
                            if (meta3222 != null) {
                            }
                            if (z19) {
                            }
                            n11.f66437n = c6550a3;
                            n11.f66438o = salesIQResponse;
                            n11.f66439p = hashSet2;
                            n11.f66440q = type;
                            n11.f66441r = null;
                            n11.f66447x = i13;
                            n11.f66436A = 6;
                            if (D0(c6550a3, objectRef, chatFromAcknowledgementKey, n11) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        salesIQResponse3 = salesIQResponse;
                        obj2 = null;
                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        i10 = i13;
                        obj = obj2;
                        Object c1022222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        if (obj == null) {
                        }
                        if (i10 != 0) {
                        }
                        break;
                    case 4:
                        i13 = n11.f66447x;
                        salesIQResponse = (SalesIQResponse) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        salesIQResponse3 = salesIQResponse;
                        obj2 = (C5582a) obj3;
                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        i10 = i13;
                        obj = obj2;
                        Object c10222222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        if (obj == null) {
                        }
                        if (i10 != 0) {
                        }
                        break;
                    case 5:
                        i13 = n11.f66447x;
                        salesIQResponse = (SalesIQResponse) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        salesIQResponse3 = salesIQResponse;
                        obj2 = null;
                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        i10 = i13;
                        obj = obj2;
                        Object c102222222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        if (obj == null) {
                        }
                        if (i10 != 0) {
                        }
                        break;
                    case 6:
                        i13 = n11.f66447x;
                        aVar = (Form.Message.Meta.InputCard.a) n11.f66440q;
                        hashSet = (HashSet) n11.f66439p;
                        salesIQResponse2 = (SalesIQResponse) n11.f66438o;
                        c6550a4 = (C6550a) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        Ae.a o022 = c6550a4.o0();
                        De.a aVar22 = De.a.OngoingConversationContextRequestedMessages;
                        if (hashSet == null) {
                        }
                        if (aVar != null) {
                            hashSet.add(a10);
                            Unit unit22 = Unit.INSTANCE;
                            break;
                        }
                        Unit unit32 = Unit.INSTANCE;
                        o022.l0(aVar22, hashSet, true);
                        salesIQResponse3 = salesIQResponse2;
                        obj2 = null;
                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        i10 = i13;
                        obj = obj2;
                        Object c1022222222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        if (obj == null) {
                        }
                        if (i10 != 0) {
                        }
                        break;
                    case 7:
                        i13 = n11.f66447x;
                        salesIQResponse = (SalesIQResponse) n11.f66438o;
                        c6550a2 = (C6550a) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        str15 = null;
                        c6550a2.o0().k0(De.a.OngoingConversationContextAppStatus, str15, true);
                        c6550a2.o0().h0("is_ongoing_conversation_context_auto_reply_on", false);
                        salesIQResponse3 = salesIQResponse;
                        obj2 = str15;
                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        i10 = i13;
                        obj = obj2;
                        Object c10222222222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        if (obj == null) {
                        }
                        if (i10 != 0) {
                        }
                        break;
                    case 8:
                        i13 = n11.f66447x;
                        salesIQResponse = (SalesIQResponse) n11.f66437n;
                        ResultKt.throwOnFailure(obj3);
                        str15 = null;
                        salesIQResponse3 = salesIQResponse;
                        obj2 = str15;
                        b10 = SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        i10 = i13;
                        obj = obj2;
                        Object c102222222222 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                        if (obj == null) {
                        }
                        if (i10 != 0) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        n10 = new N(continuation);
        n11 = n10;
        Object obj32 = n11.f66448y;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (n11.f66436A) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(14:5|6|7|(1:(2:10|11)(2:31|32))(3:33|34|(1:36)(1:37))|12|(8:30|16|(1:18)(1:27)|19|20|(1:22)|23|24)|15|16|(0)(0)|19|20|(0)|23|24))|40|6|7|(0)(0)|12|(1:14)(9:28|30|16|(0)(0)|19|20|(0)|23|24)|15|16|(0)(0)|19|20|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r8 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, Continuation continuation) {
        z zVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        int i11;
        Long l10;
        boolean z10;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i12 = zVar.f66639q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zVar.f66639q = i12 - Integer.MIN_VALUE;
                Object obj = zVar.f66637o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zVar.f66639q;
                boolean z11 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    ConversationsLocalDataSource q02 = q0();
                    y.a aVar = y.a.Top;
                    zVar.f66636n = 1;
                    zVar.f66639q = 1;
                    obj = q02.getSyncTime(str, aVar, zVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i11 = 1;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = zVar.f66636n;
                    ResultKt.throwOnFailure(obj);
                }
                l10 = (Long) ((C5582a) obj).b();
                if (l10 != null && l10.longValue() == -2) {
                    z10 = true;
                    if (i11 != 0) {
                        z11 = false;
                    }
                    Object m147constructorimpl = Result.m147constructorimpl(new MessageSyncData(z11, z10));
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                        LiveChatUtil.log(m150exceptionOrNullimpl);
                    }
                    return me.b.a(m147constructorimpl);
                }
                z10 = false;
                if (i11 != 0) {
                }
                Object m147constructorimpl2 = Result.m147constructorimpl(new MessageSyncData(z11, z10));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                if (m150exceptionOrNullimpl != null) {
                }
                return me.b.a(m147constructorimpl2);
            }
        }
        zVar = new z(continuation);
        Object obj2 = zVar.f66637o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zVar.f66639q;
        boolean z112 = true;
        if (i10 != 0) {
        }
        l10 = (Long) ((C5582a) obj2).b();
        if (l10 != null) {
            z10 = true;
            if (i11 != 0) {
            }
            Object m147constructorimpl22 = Result.m147constructorimpl(new MessageSyncData(z112, z10));
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl22);
            if (m150exceptionOrNullimpl != null) {
            }
            return me.b.a(m147constructorimpl22);
        }
        z10 = false;
        if (i11 != 0) {
        }
        Object m147constructorimpl222 = Result.m147constructorimpl(new MessageSyncData(z112, z10));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl222);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl222);
    }

    public final Object h0(String str, String str2, String str3, String str4, String str5, Message.g gVar, Message.f fVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, MessageEntity messageEntity, Message.Meta meta, Continuation continuation) {
        String str6;
        List c10;
        if (str5 != null) {
            k kVar = new k();
            kVar.p("text", str5);
            str6 = kVar.toString();
        } else {
            str6 = null;
        }
        C6152a u02 = u0();
        String stringValue = gVar.getStringValue();
        String u10 = str6 != null ? i.u(str6) : null;
        int ordinal = fVar.ordinal();
        String V10 = o0().V();
        String v10 = s0().v(new Message.b(o0().T(), m.b(o0().T())));
        String v11 = attachment != null ? s0().v(attachment) : null;
        String v12 = meta != null ? s0().v(meta) : null;
        String v13 = (str5 == null || (c10 = m.c(str5)) == null) ? null : s0().v(c10);
        String v14 = respondedMessage != null ? s0().v(respondedMessage) : null;
        String v15 = extras != null ? s0().v(extras) : null;
        Long longOrNull = StringsKt.toLongOrNull(str4);
        long longValue = longOrNull != null ? longOrNull.longValue() : b.f();
        Long longOrNull2 = StringsKt.toLongOrNull(str4);
        Object T10 = u02.T(new MessageEntity(str, str3, str2, null, null, stringValue, Boxing.boxInt(ordinal), str4, "", str6, u10, v13, V10, v10, v11, v12, v14, false, null, null, null, null, s0().v(messageEntity), null, true, v15, new MessageEntity.Time(0L, longValue, 0L, 0L, 0L, j.c(longOrNull2 != null ? longOrNull2.longValue() : b.f(), null, null, 3, null), 29, null), 12451864, null), true, continuation);
        return T10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? T10 : Unit.INSTANCE;
    }

    @Override // xf.InterfaceC6823a
    public Object i(String str, Message.g gVar, Continuation continuation) {
        return u0().h(str, gVar, continuation);
    }

    @Override // xf.InterfaceC6823a
    public Object j(String str, String str2, Message.g gVar, Continuation continuation) {
        C5582a E10 = u0().E(str, str2, gVar);
        if (E10.d()) {
            return E10.a(new C6572w((InterfaceC5321f) E10.b(), this));
        }
        Intrinsics.checkNotNull(E10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return E10;
    }

    public final void j0(String str, String str2, String str3) {
        AbstractC1459k.d(m0(), null, null, new C6555f(str, str2, str3, null), 3, null);
    }

    @Override // xf.InterfaceC6823a
    public Object k(Continuation continuation) {
        return u0().N(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(String str, String str2, Continuation continuation) {
        C6556g c6556g;
        int i10;
        C6550a c6550a;
        if (continuation instanceof C6556g) {
            c6556g = (C6556g) continuation;
            int i11 = c6556g.f66559s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6556g.f66559s = i11 - Integer.MIN_VALUE;
                Object obj = c6556g.f66557q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6556g.f66559s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Message.f fVar = Message.f.Failure;
                    c6556g.f66554n = this;
                    c6556g.f66555o = str;
                    c6556g.f66556p = str2;
                    c6556g.f66559s = 1;
                    if (B(str, str2, fVar, c6556g) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6550a = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c6556g.f66556p;
                    str = (String) c6556g.f66555o;
                    c6550a = (C6550a) c6556g.f66554n;
                    ResultKt.throwOnFailure(obj);
                }
                c6550a.F0(str, str2, null);
                return Unit.INSTANCE;
            }
        }
        c6556g = new C6556g(continuation);
        Object obj2 = c6556g.f66557q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6556g.f66559s;
        if (i10 != 0) {
        }
        c6550a.F0(str, str2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[EDGE_INSN: B:51:0x00ea->B:52:0x00ea BREAK  A[LOOP:1: B:32:0x00bb->B:47:0x00bb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, String str2, Continuation continuation) {
        C6565p c6565p;
        int i10;
        ArrayList arrayList;
        Object A10;
        C6550a c6550a;
        Iterator it;
        String localFilePath;
        if (continuation instanceof C6565p) {
            c6565p = (C6565p) continuation;
            int i11 = c6565p.f66591s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6565p.f66591s = i11 - Integer.MIN_VALUE;
                Object obj = c6565p.f66589q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6565p.f66591s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    C6152a u02 = u0();
                    List listOf = CollectionsKt.listOf((Object[]) new Message.g[]{Message.g.Video, Message.g.Audio, Message.g.File, Message.g.Image});
                    c6565p.f66586n = this;
                    c6565p.f66587o = str;
                    c6565p.f66588p = arrayList;
                    c6565p.f66591s = 1;
                    A10 = u02.A(str, str2, listOf, c6565p);
                    if (A10 != coroutine_suspended) {
                        c6550a = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ?? r13 = (List) c6565p.f66588p;
                String str3 = (String) c6565p.f66587o;
                c6550a = (C6550a) c6565p.f66586n;
                ResultKt.throwOnFailure(obj);
                arrayList = r13;
                str = str3;
                A10 = obj;
                List h10 = MessageRoomToDomainKt.h((List) A10, c6550a.f66360a, c6550a.s0(), false, c6550a.f66368i, 4, null);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : h10) {
                    Message message = (Message) obj2;
                    if (message.getExtras() != null && message.getExtras().getLocalFileSize() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Message message2 = (Message) it.next();
                    Message.Extras extras = message2.getExtras();
                    if (extras != null && (localFilePath = extras.getLocalFilePath()) != null) {
                        if ((new File(localFilePath).delete() ? null : c6550a) != null) {
                            arrayList.add(message2.getId());
                        }
                    }
                }
                C6152a u03 = c6550a.u0();
                c6565p.f66586n = null;
                c6565p.f66587o = null;
                c6565p.f66588p = null;
                c6565p.f66591s = 2;
                Object j10 = u03.j(str, arrayList, c6565p);
                return j10 != coroutine_suspended ? coroutine_suspended : j10;
            }
        }
        c6565p = new C6565p(continuation);
        Object obj3 = c6565p.f66589q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6565p.f66591s;
        if (i10 != 0) {
        }
        List h102 = MessageRoomToDomainKt.h((List) A10, c6550a.f66360a, c6550a.s0(), false, c6550a.f66368i, 4, null);
        ArrayList arrayList22 = new ArrayList();
        while (r14.hasNext()) {
        }
        it = arrayList22.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        C6152a u032 = c6550a.u0();
        c6565p.f66586n = null;
        c6565p.f66587o = null;
        c6565p.f66588p = null;
        c6565p.f66591s = 2;
        Object j102 = u032.j(str, arrayList, c6565p);
        if (j102 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
    
        if (r11.c0(r15, r12, r10, r9) == r2) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01f1 -> B:62:0x01f5). Please report as a decompilation issue!!! */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(String str, String str2, Continuation continuation) {
        K k10;
        K k11;
        Ref.ObjectRef objectRef;
        String str3;
        String str4;
        C6550a c6550a;
        Ref.BooleanRef booleanRef;
        Object obj;
        C5582a c5582a;
        Message g10;
        Message.f status;
        String str5;
        Ref.BooleanRef booleanRef2;
        C5582a c5582a2;
        Ref.ObjectRef objectRef2;
        C6550a c6550a2;
        String str6;
        Message message;
        boolean z10;
        Ref.BooleanRef booleanRef3;
        C5582a c5582a3;
        Object obj2;
        Ref.ObjectRef objectRef3;
        Message.Extras extras;
        Message.Extras extras2;
        List h10;
        Ref.BooleanRef booleanRef4;
        C6550a c6550a3;
        Message message2;
        Iterator it;
        C5582a c5582a4;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.BooleanRef booleanRef5;
        C5582a c5582a5;
        T t10;
        String str7;
        String str8;
        if (continuation instanceof K) {
            k10 = (K) continuation;
            int i10 = k10.f66421y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k10.f66421y = i10 - Integer.MIN_VALUE;
                k11 = k10;
                Object obj3 = k11.f66419w;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z11 = true;
                switch (k11.f66421y) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        Ref.BooleanRef booleanRef6 = new Ref.BooleanRef();
                        objectRef = new Ref.ObjectRef();
                        C6152a u02 = u0();
                        k11.f66410n = this;
                        k11.f66411o = str;
                        k11.f66412p = str2;
                        k11.f66413q = booleanRef6;
                        k11.f66414r = objectRef;
                        k11.f66421y = 1;
                        Object y10 = C6152a.y(u02, null, str, null, null, str2, k11, 8, null);
                        if (y10 != coroutine_suspended) {
                            str3 = str;
                            str4 = str2;
                            c6550a = this;
                            booleanRef = booleanRef6;
                            obj = y10;
                            c5582a = (C5582a) obj;
                            if (c5582a.d()) {
                                MessageEntity messageEntity = (MessageEntity) c5582a.b();
                                g10 = messageEntity != null ? MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null) : null;
                                if (i.e((g10 == null || (extras2 = g10.getExtras()) == null) ? null : extras2.getChainedMessageIds())) {
                                    C6152a u03 = c6550a.u0();
                                    List<String> chainedMessageIds = (g10 == null || (extras = g10.getExtras()) == null) ? null : extras.getChainedMessageIds();
                                    Intrinsics.checkNotNull(chainedMessageIds);
                                    k11.f66410n = c6550a;
                                    k11.f66411o = booleanRef;
                                    k11.f66412p = objectRef;
                                    k11.f66413q = c5582a;
                                    k11.f66414r = g10;
                                    k11.f66421y = 2;
                                    Object C10 = u03.C(chainedMessageIds, k11);
                                    if (C10 != coroutine_suspended) {
                                        booleanRef3 = booleanRef;
                                        c5582a3 = c5582a;
                                        obj2 = C10;
                                        objectRef3 = objectRef;
                                        h10 = MessageRoomToDomainKt.h((List) obj2, c6550a.f66360a, c6550a.s0(), false, null, 12, null);
                                        booleanRef4 = new Ref.BooleanRef();
                                        c6550a3 = c6550a;
                                        message2 = g10;
                                        it = h10.iterator();
                                        if (it.hasNext()) {
                                            Message message3 = (Message) it.next();
                                            if (!booleanRef4.element) {
                                                booleanRef4.element = message3.getStatus() == Message.f.WmsFailure ? z11 : false;
                                            }
                                            C6152a u04 = c6550a3.u0();
                                            String chatId = message3.getChatId();
                                            String id2 = message3.getId();
                                            Message.Extras extras3 = message3.getExtras();
                                            Message.f fVar = i.f(extras3 != null ? extras3.getLocalFilePath() : null) ? Message.f.Uploading : Message.f.Sending;
                                            k11.f66410n = c6550a3;
                                            k11.f66411o = booleanRef3;
                                            k11.f66412p = objectRef3;
                                            k11.f66413q = c5582a3;
                                            k11.f66414r = message2;
                                            k11.f66415s = h10;
                                            k11.f66416t = booleanRef4;
                                            k11.f66417u = it;
                                            k11.f66421y = 3;
                                            break;
                                        } else {
                                            String acknowledgementKey = message2.getAcknowledgementKey();
                                            String chatId2 = message2.getChatId();
                                            String conversationId = message2.getConversationId();
                                            Intrinsics.checkNotNull(conversationId);
                                            EnumC6551b enumC6551b = booleanRef4.element ? EnumC6551b.WmsFailedRetry : EnumC6551b.GeneralRetry;
                                            k11.f66410n = booleanRef3;
                                            k11.f66411o = objectRef3;
                                            k11.f66412p = c5582a3;
                                            k11.f66413q = objectRef3;
                                            k11.f66414r = null;
                                            k11.f66415s = null;
                                            k11.f66416t = null;
                                            k11.f66417u = null;
                                            k11.f66421y = 4;
                                            Object z12 = c6550a3.z(acknowledgementKey, chatId2, conversationId, h10, enumC6551b, k11);
                                            if (z12 != coroutine_suspended) {
                                                c5582a4 = c5582a3;
                                                objectRef4 = objectRef3;
                                                objectRef5 = objectRef4;
                                                booleanRef5 = booleanRef3;
                                                t10 = z12;
                                                objectRef4.element = t10;
                                                c5582a = c5582a4;
                                                objectRef = objectRef5;
                                                booleanRef = booleanRef5;
                                            }
                                        }
                                    }
                                } else {
                                    boolean e10 = i.e(g10 != null ? g10.getExtras() : null);
                                    status = g10 != null ? g10.getStatus() : null;
                                    Message.f fVar2 = e10 ? Message.f.Uploading : Message.f.Sending;
                                    k11.f66410n = c6550a;
                                    k11.f66411o = str3;
                                    k11.f66412p = str4;
                                    k11.f66413q = booleanRef;
                                    k11.f66414r = objectRef;
                                    k11.f66415s = c5582a;
                                    k11.f66416t = g10;
                                    k11.f66417u = status;
                                    k11.f66418v = e10;
                                    k11.f66421y = 5;
                                    if (c6550a.B(str3, str4, fVar2, k11) != coroutine_suspended) {
                                        str5 = str3;
                                        booleanRef2 = booleanRef;
                                        c5582a2 = c5582a;
                                        objectRef2 = objectRef;
                                        c6550a2 = c6550a;
                                        str6 = str4;
                                        message = g10;
                                        z10 = e10;
                                        if (z10) {
                                            HashMap uploadJobs = com.zoho.livechat.android.utils.Q.f44444C;
                                            Intrinsics.checkNotNullExpressionValue(uploadJobs, "uploadJobs");
                                            uploadJobs.put(str5 + '_' + str6, F0.n(k11.get$context()));
                                        }
                                        if (((i.e(message) || !i.e(message.getConversationId())) ? null : c6550a2) == null) {
                                            Intrinsics.checkNotNull(message);
                                            Message.Extras extras4 = message.getExtras();
                                            if (i.r(extras4 != null ? Boxing.boxLong(extras4.getLocalFileSize()) : null) >= 51200000) {
                                                booleanRef2.element = true;
                                            }
                                            String acknowledgementKey2 = message.getAcknowledgementKey();
                                            String conversationId2 = message.getConversationId();
                                            Intrinsics.checkNotNull(conversationId2);
                                            Message replyTo = message.getReplyTo();
                                            if (replyTo != null) {
                                                String uniqueID = replyTo.getUniqueID();
                                                str7 = conversationId2;
                                                str8 = uniqueID;
                                            } else {
                                                str7 = conversationId2;
                                                str8 = null;
                                            }
                                            String content = message.getContent();
                                            Message.g messageType = message.getMessageType();
                                            Message message4 = message;
                                            String str9 = str5;
                                            Message.Attachment attachment = message4.getAttachment();
                                            String str10 = str7;
                                            Message.Extras extras5 = message4.getExtras();
                                            Message.RespondedMessage respondedMessage = message4.getRespondedMessage();
                                            EnumC6551b enumC6551b2 = status == Message.f.WmsFailure ? EnumC6551b.WmsFailedRetry : EnumC6551b.GeneralRetry;
                                            k11.f66410n = booleanRef2;
                                            k11.f66411o = objectRef2;
                                            k11.f66412p = c5582a2;
                                            k11.f66413q = objectRef2;
                                            k11.f66414r = null;
                                            k11.f66415s = null;
                                            k11.f66416t = null;
                                            k11.f66417u = null;
                                            k11.f66421y = 6;
                                            C5582a c5582a6 = c5582a2;
                                            Ref.BooleanRef booleanRef7 = booleanRef2;
                                            Object R10 = InterfaceC6823a.R(c6550a2, acknowledgementKey2, str9, str10, str6, str8, content, messageType, attachment, extras5, respondedMessage, null, enumC6551b2, false, false, k11, 12288, null);
                                            if (R10 != coroutine_suspended) {
                                                objectRef4 = objectRef2;
                                                objectRef5 = objectRef4;
                                                t10 = R10;
                                                booleanRef5 = booleanRef7;
                                                c5582a4 = c5582a6;
                                                objectRef4.element = t10;
                                                c5582a = c5582a4;
                                                objectRef = objectRef5;
                                                booleanRef = booleanRef5;
                                            }
                                        } else {
                                            C5582a c5582a7 = c5582a2;
                                            objectRef = objectRef2;
                                            booleanRef = booleanRef2;
                                            c5582a = c5582a7;
                                        }
                                    }
                                }
                            }
                            if (c5582a.d()) {
                                c5582a = c5582a.a(Boxing.boxBoolean(booleanRef.element));
                            } else {
                                Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                            }
                            c5582a5 = (C5582a) objectRef.element;
                            if (c5582a5 != null) {
                                if (c5582a5.d()) {
                                    c5582a5 = c5582a5.a(Boxing.boxBoolean(booleanRef.element));
                                }
                                if (c5582a5 != null) {
                                    return c5582a5;
                                }
                            }
                            if (c5582a.d()) {
                                ((Boolean) c5582a.b()).getClass();
                                return c5582a.a(Boxing.boxBoolean(booleanRef.element));
                            }
                            Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                            return c5582a;
                        }
                        return coroutine_suspended;
                    case 1:
                        Ref.ObjectRef objectRef6 = (Ref.ObjectRef) k11.f66414r;
                        booleanRef = (Ref.BooleanRef) k11.f66413q;
                        str4 = (String) k11.f66412p;
                        str3 = (String) k11.f66411o;
                        c6550a = (C6550a) k11.f66410n;
                        ResultKt.throwOnFailure(obj3);
                        objectRef = objectRef6;
                        obj = obj3;
                        c5582a = (C5582a) obj;
                        if (c5582a.d()) {
                        }
                        if (c5582a.d()) {
                        }
                        c5582a5 = (C5582a) objectRef.element;
                        if (c5582a5 != null) {
                        }
                        if (c5582a.d()) {
                        }
                        break;
                    case 2:
                        g10 = (Message) k11.f66414r;
                        c5582a3 = (C5582a) k11.f66413q;
                        objectRef3 = (Ref.ObjectRef) k11.f66412p;
                        booleanRef3 = (Ref.BooleanRef) k11.f66411o;
                        c6550a = (C6550a) k11.f66410n;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        h10 = MessageRoomToDomainKt.h((List) obj2, c6550a.f66360a, c6550a.s0(), false, null, 12, null);
                        booleanRef4 = new Ref.BooleanRef();
                        c6550a3 = c6550a;
                        message2 = g10;
                        it = h10.iterator();
                        if (it.hasNext()) {
                        }
                        return coroutine_suspended;
                    case 3:
                        it = (Iterator) k11.f66417u;
                        Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) k11.f66416t;
                        List list = (List) k11.f66415s;
                        Message message5 = (Message) k11.f66414r;
                        C5582a c5582a8 = (C5582a) k11.f66413q;
                        Ref.ObjectRef objectRef7 = (Ref.ObjectRef) k11.f66412p;
                        Ref.BooleanRef booleanRef9 = (Ref.BooleanRef) k11.f66411o;
                        C6550a c6550a4 = (C6550a) k11.f66410n;
                        ResultKt.throwOnFailure(obj3);
                        h10 = list;
                        objectRef3 = objectRef7;
                        c6550a3 = c6550a4;
                        booleanRef4 = booleanRef8;
                        c5582a3 = c5582a8;
                        message2 = message5;
                        booleanRef3 = booleanRef9;
                        z11 = true;
                        if (it.hasNext()) {
                        }
                        return coroutine_suspended;
                    case 4:
                    case 6:
                        objectRef4 = (Ref.ObjectRef) k11.f66413q;
                        c5582a4 = (C5582a) k11.f66412p;
                        objectRef5 = (Ref.ObjectRef) k11.f66411o;
                        booleanRef5 = (Ref.BooleanRef) k11.f66410n;
                        ResultKt.throwOnFailure(obj3);
                        t10 = obj3;
                        objectRef4.element = t10;
                        c5582a = c5582a4;
                        objectRef = objectRef5;
                        booleanRef = booleanRef5;
                        if (c5582a.d()) {
                        }
                        c5582a5 = (C5582a) objectRef.element;
                        if (c5582a5 != null) {
                        }
                        if (c5582a.d()) {
                        }
                        break;
                    case 5:
                        z10 = k11.f66418v;
                        Message.f fVar3 = (Message.f) k11.f66417u;
                        message = (Message) k11.f66416t;
                        C5582a c5582a9 = (C5582a) k11.f66415s;
                        Ref.ObjectRef objectRef8 = (Ref.ObjectRef) k11.f66414r;
                        Ref.BooleanRef booleanRef10 = (Ref.BooleanRef) k11.f66413q;
                        String str11 = (String) k11.f66412p;
                        str5 = (String) k11.f66411o;
                        c6550a2 = (C6550a) k11.f66410n;
                        ResultKt.throwOnFailure(obj3);
                        objectRef2 = objectRef8;
                        str6 = str11;
                        status = fVar3;
                        c5582a2 = c5582a9;
                        booleanRef2 = booleanRef10;
                        if (z10) {
                        }
                        if (i.e(message)) {
                            break;
                        }
                        if (((i.e(message) || !i.e(message.getConversationId())) ? null : c6550a2) == null) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        k10 = new K(continuation);
        k11 = k10;
        Object obj32 = k11.f66419w;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z112 = true;
        switch (k11.f66421y) {
        }
    }

    public final Ph.P m0() {
        return C6461a.f65810a.e();
    }

    public final C6959a n0() {
        return C6959a.f68673u.b();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26)))|11|12|(1:14)|15|16))|29|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r8 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(SalesIQChat salesIQChat, Form.Message message, boolean z10, Continuation continuation) {
        C6553d c6553d;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C6553d) {
            c6553d = (C6553d) continuation;
            int i11 = c6553d.f66536p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6553d.f66536p = i11 - Integer.MIN_VALUE;
                Object obj = c6553d.f66534n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6553d.f66536p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    String V10 = o0().V();
                    if (V10 != null) {
                        C6152a u02 = u0();
                        MessageEntity a10 = AbstractC6687a.a(t0(salesIQChat, b.f(), message), s0(), V10);
                        c6553d.f66536p = 1;
                        if (u02.T(a10, z10, c6553d) == coroutine_suspended) {
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
                return me.b.a(m147constructorimpl);
            }
        }
        c6553d = new C6553d(continuation);
        Object obj2 = c6553d.f66534n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6553d.f66536p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    public final Ae.a o0() {
        return (Ae.a) this.f66367h.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0170, code lost:
    
        if ((r7 != null ? r7.getAttenderId() : null) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02bc, code lost:
    
        if (r2 == r4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(String str, String str2, Continuation continuation) {
        G g10;
        int i10;
        SalesIQChat chat;
        C6550a c6550a;
        List list;
        Object t10;
        String str3 = str;
        if (continuation instanceof G) {
            g10 = (G) continuation;
            int i11 = g10.f66388s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g10.f66388s = i11 - Integer.MIN_VALUE;
                Object obj = g10.f66386q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = g10.f66388s;
                boolean z10 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    chat = LiveChatUtil.getChat(str2);
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) u0().D(str3, str2).b();
                    if (interfaceC5321f != null) {
                        g10.f66383n = this;
                        g10.f66384o = str3;
                        g10.f66385p = chat;
                        g10.f66388s = 1;
                        t10 = AbstractC5323h.t(interfaceC5321f, g10);
                        if (t10 != coroutine_suspended) {
                            c6550a = this;
                        }
                        return coroutine_suspended;
                    }
                    c6550a = this;
                    list = null;
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        int i12 = 0;
                        for (Object obj2 : list2) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            MessageEntity messageEntity = (MessageEntity) obj2;
                            MessageEntity copy$default = MessageEntity.copy$default(messageEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, c6550a.z0(MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, null, null, 60, null)), null, MessageEntity.Time.copy$default(messageEntity.getTime(), 0L, 0L, 0L, 0L, 0L, j.c(messageEntity.getTime().getClientTime(), null, null, 3, null), 31, null), 50331647, null);
                            String dateDifference = LiveChatUtil.getDateDifference(c6550a.f66360a, Boxing.boxLong(copy$default.getTime().getClientTime()));
                            String formattedClientTime = copy$default.getTime().getFormattedClientTime();
                            boolean z11 = z10;
                            if (!Intrinsics.areEqual(dateDifference, c6550a.f66360a.getString(t.f60899M))) {
                                formattedClientTime = dateDifference + ", " + formattedClientTime;
                            }
                            if (chat == null) {
                                WaitingChatDetails D10 = Tf.b.D(str3);
                            }
                            String str4 = (Intrinsics.areEqual(dateDifference, c6550a.f66360a.getString(t.f60899M)) || Intrinsics.areEqual(dateDifference, c6550a.f66360a.getString(t.f60905N))) ? dateDifference : formattedClientTime;
                            if (copy$default.getTime().getPreviousMessageTime() != -1 || i12 == RangesKt.coerceAtLeast(list.size() - 1, 0)) {
                                z10 = z11;
                                copy$default = (!StringsKt.equals(LiveChatUtil.getDateDifference(c6550a.f66360a, Boxing.boxLong(copy$default.getTime().getPreviousMessageTime())), dateDifference, z10) || copy$default.getTime().getPreviousMessageTime() == -2) ? MessageEntity.copy$default(copy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, str4, false, null, null, 125829119, null) : MessageEntity.copy$default(copy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, null, 125829119, null);
                                arrayList.add(copy$default);
                                i12 = i13;
                            } else {
                                copy$default = MessageEntity.copy$default(copy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, null, 125829119, null);
                                z10 = z11;
                                arrayList.add(copy$default);
                                i12 = i13;
                            }
                        }
                        C6152a u02 = c6550a.u0();
                        g10.f66383n = null;
                        g10.f66384o = null;
                        g10.f66385p = null;
                        g10.f66388s = 2;
                        obj = u02.J(arrayList, g10);
                    }
                    return C5582a.f56502b.d(Unit.INSTANCE);
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return C5582a.f56502b.d(Unit.INSTANCE);
                }
                SalesIQChat salesIQChat = (SalesIQChat) g10.f66385p;
                String str5 = (String) g10.f66384o;
                c6550a = (C6550a) g10.f66383n;
                ResultKt.throwOnFailure(obj);
                chat = salesIQChat;
                str3 = str5;
                t10 = obj;
                list = (List) t10;
                if (list != null) {
                }
                return C5582a.f56502b.d(Unit.INSTANCE);
            }
        }
        g10 = new G(continuation);
        Object obj3 = g10.f66386q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = g10.f66388s;
        boolean z102 = true;
        if (i10 != 0) {
        }
        list = (List) t10;
        if (list != null) {
        }
        return C5582a.f56502b.d(Unit.INSTANCE);
    }

    public final C1934a p0() {
        return (C1934a) this.f66366g.getValue();
    }

    @Override // xf.InterfaceC6823a
    public C5582a q(EnumC6745a messageAction) {
        Intrinsics.checkNotNullParameter(messageAction, "messageAction");
        C5582a.C0817a c0817a = C5582a.f56502b;
        int i10 = C6552c.$EnumSwitchMapping$0[messageAction.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            z10 = o0().g0();
        } else if (i10 == 2) {
            z10 = o0().e0();
        } else if (i10 == 3) {
            z10 = Intrinsics.areEqual(System.getProperty("is_mobilisten_reply_enabled", "true"), "true");
        } else if (i10 == 4) {
            z10 = o0().d0();
        }
        return c0817a.d(Boolean.valueOf(z10));
    }

    public final ConversationsLocalDataSource q0() {
        return (ConversationsLocalDataSource) this.f66364e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(String str, String str2, Boolean bool, Continuation continuation) {
        C6566q c6566q;
        int i10;
        C6550a c6550a;
        C6550a c6550a2;
        C5582a c5582a;
        C5582a c5582a2;
        if (continuation instanceof C6566q) {
            c6566q = (C6566q) continuation;
            int i11 = c6566q.f66595q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6566q.f66595q = i11 - Integer.MIN_VALUE;
                Object obj = c6566q.f66593o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6566q.f66595q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str != null) {
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                            C6152a u02 = u0();
                            c6566q.f66592n = this;
                            c6566q.f66595q = 1;
                            obj = u02.u(str, c6566q);
                            if (obj != coroutine_suspended) {
                                c6550a2 = this;
                                c5582a = (C5582a) obj;
                                if (c5582a.d()) {
                                }
                            }
                        } else {
                            C6152a u03 = u0();
                            c6566q.f66592n = this;
                            c6566q.f66595q = 2;
                            obj = u03.p(str, c6566q);
                            if (obj != coroutine_suspended) {
                                c6550a2 = this;
                                c5582a = (C5582a) obj;
                                if (c5582a.d()) {
                                }
                            }
                        }
                    } else {
                        if (str2 == null) {
                            return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Both acknowledgement key and chat Id cannot be null for getLastMessage()"), false, 2, null);
                        }
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                            C6152a u04 = u0();
                            c6566q.f66592n = this;
                            c6566q.f66595q = 3;
                            obj = u04.v(str2, c6566q);
                            if (obj != coroutine_suspended) {
                                c6550a = this;
                                c5582a2 = (C5582a) obj;
                                if (c5582a2.d()) {
                                }
                            }
                        } else {
                            C6152a u05 = u0();
                            c6566q.f66592n = this;
                            c6566q.f66595q = 4;
                            obj = u05.q(str2, c6566q);
                            if (obj != coroutine_suspended) {
                                c6550a = this;
                                c5582a2 = (C5582a) obj;
                                if (c5582a2.d()) {
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    c6550a2 = (C6550a) c6566q.f66592n;
                    ResultKt.throwOnFailure(obj);
                    c5582a = (C5582a) obj;
                    if (c5582a.d()) {
                    }
                } else {
                    if (i10 == 2) {
                        c6550a2 = (C6550a) c6566q.f66592n;
                        ResultKt.throwOnFailure(obj);
                        c5582a = (C5582a) obj;
                        if (c5582a.d()) {
                            Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                            return c5582a;
                        }
                        MessageEntity messageEntity = (MessageEntity) c5582a.b();
                        return c5582a.a(messageEntity != null ? MessageRoomToDomainKt.g(messageEntity, c6550a2.f66360a, c6550a2.s0(), false, false, c6550a2.f66368i, null, 44, null) : null);
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6550a = (C6550a) c6566q.f66592n;
                        ResultKt.throwOnFailure(obj);
                        c5582a2 = (C5582a) obj;
                        if (c5582a2.d()) {
                            Intrinsics.checkNotNull(c5582a2, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                            return c5582a2;
                        }
                        MessageEntity messageEntity2 = (MessageEntity) c5582a2.b();
                        return c5582a2.a(messageEntity2 != null ? MessageRoomToDomainKt.g(messageEntity2, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null) : null);
                    }
                    c6550a = (C6550a) c6566q.f66592n;
                    ResultKt.throwOnFailure(obj);
                    c5582a2 = (C5582a) obj;
                    if (c5582a2.d()) {
                    }
                }
            }
        }
        c6566q = new C6566q(continuation);
        Object obj2 = c6566q.f66593o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6566q.f66595q;
        if (i10 != 0) {
        }
    }

    public final Ke.a r0() {
        return (Ke.a) this.f66365f.getValue();
    }

    @Override // xf.InterfaceC6823a
    public Object s(String str, String str2, Message.g gVar, Continuation continuation) {
        return u0().f0(str, str2, gVar, continuation);
    }

    public final Gson s0() {
        return Yd.a.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, boolean z10, Continuation continuation) {
        C6562m c6562m;
        int i10;
        C6550a c6550a;
        List list;
        List h10;
        C6550a c6550a2;
        boolean z11;
        Iterator it;
        if (continuation instanceof C6562m) {
            c6562m = (C6562m) continuation;
            int i11 = c6562m.f66575s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6562m.f66575s = i11 - Integer.MIN_VALUE;
                Object obj = c6562m.f66573q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6562m.f66575s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z10 && Intrinsics.areEqual(Ae.a.m(o0(), Ce.a.a(De.a.ShowFeedbackAfterSkip), false, 2, null).b(), Boxing.boxBoolean(true))) {
                        return C5582a.f56502b.b(new C5582a.b("ShowFeedbackAfterSkip is enabled", null, null, 6, null));
                    }
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) u0().E(null, str, Message.g.Feedback).b();
                    if (interfaceC5321f != null) {
                        c6562m.f66570n = this;
                        c6562m.f66572p = z10;
                        c6562m.f66575s = 1;
                        obj = AbstractC5323h.t(interfaceC5321f, c6562m);
                        if (obj != coroutine_suspended) {
                            c6550a = this;
                        }
                        return coroutine_suspended;
                    }
                    return C5582a.f56502b.d(Unit.INSTANCE);
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = c6562m.f66572p;
                    it = (Iterator) c6562m.f66571o;
                    c6550a2 = (C6550a) c6562m.f66570n;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Message message = (Message) it.next();
                        if (((Boolean) c6550a2.f66368i.invoke(Boxing.boxBoolean(z11), message.getChatId())).booleanValue()) {
                            C6152a u02 = c6550a2.u0();
                            String chatId = message.getChatId();
                            Message.g gVar = Message.g.Feedback;
                            c6562m.f66570n = c6550a2;
                            c6562m.f66571o = it;
                            c6562m.f66572p = z11;
                            c6562m.f66575s = 2;
                            if (u02.h(chatId, gVar, c6562m) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return C5582a.f56502b.d(Unit.INSTANCE);
                }
                z10 = c6562m.f66572p;
                c6550a = (C6550a) c6562m.f66570n;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list != null && (h10 = MessageRoomToDomainKt.h(list, c6550a.f66360a, c6550a.s0(), false, c6550a.f66368i, 4, null)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : h10) {
                        Message.Attachment attachment = ((Message) obj2).getAttachment();
                        if (i.g(attachment != null ? attachment.getRating() : null)) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    c6550a2 = c6550a;
                    z11 = z10;
                    it = it2;
                    while (it.hasNext()) {
                    }
                }
                return C5582a.f56502b.d(Unit.INSTANCE);
            }
        }
        c6562m = new C6562m(continuation);
        Object obj3 = c6562m.f66573q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6562m.f66575s;
        if (i10 != 0) {
        }
        list = (List) obj3;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            while (r15.hasNext()) {
            }
            Iterator it22 = arrayList2.iterator();
            c6550a2 = c6550a;
            z11 = z10;
            it = it22;
            while (it.hasNext()) {
            }
        }
        return C5582a.f56502b.d(Unit.INSTANCE);
    }

    public final Message t0(SalesIQChat chat, long j10, Form.Message formMessage) {
        boolean z10;
        String str;
        String str2;
        Message.Meta a10;
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(formMessage, "formMessage");
        if (chat.isTriggeredChat()) {
            str = chat.getAttenderName();
            z10 = chat.isBotAttender();
            str2 = chat.getAttenderid();
        } else {
            z10 = false;
            str = null;
            str2 = null;
        }
        boolean z11 = z10;
        if (str2 == null || StringsKt.trim((CharSequence) str2).toString().length() == 0) {
            str2 = "form_sender";
        }
        String str3 = str2;
        if (str == null || StringsKt.trim((CharSequence) str).toString().length() == 0) {
            str = formMessage.getDisplayName();
        }
        if (str == null || StringsKt.trim((CharSequence) str).toString().length() == 0) {
            str = this.f66360a.getString(t.f61034h1);
        }
        String convID = chat.getConvID();
        String visitorid = chat.getVisitorid();
        String chid = chat.getChid();
        Message.g gVar = Message.g.Text;
        Message.f fVar = Message.f.Sent;
        String valueOf = String.valueOf(j10);
        Integer stringResourceId = formMessage.getStringResourceId();
        String text = formMessage.getText();
        Message.b bVar = new Message.b(str, m.b(str));
        String rchatid = chat.getRchatid();
        Form.Message.Meta meta = formMessage.getMeta();
        Message.Meta copy$default = (meta == null || (a10 = Form.Message.INSTANCE.a(meta, this.f66360a, chat.getConvID())) == null) ? null : Message.Meta.copy$default(a10, null, (Message.Meta.InputCard) AbstractC5895g.b(Yd.b.a(), Yd.b.a().v(formMessage.getMeta().getInputCard()), Message.Meta.InputCard.class), null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(i.f(formMessage.getText())), null, null, false, 2013263869, null);
        Intrinsics.checkNotNull(chid);
        return new Message(convID, visitorid, chid, gVar, fVar, valueOf, "", stringResourceId, text, null, j10, j10, str3, str, bVar, null, rchatid, null, copy$default, null, z11, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1409024, 1023, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(String str, String str2, Message.e eVar, Continuation continuation) {
        C6569t c6569t;
        int i10;
        C6550a c6550a;
        C5582a c5582a;
        if (continuation instanceof C6569t) {
            c6569t = (C6569t) continuation;
            int i11 = c6569t.f66610q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6569t.f66610q = i11 - Integer.MIN_VALUE;
                Object obj = c6569t.f66608o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6569t.f66610q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C6152a u02 = u0();
                    boolean z10 = eVar == Message.e.Top;
                    c6569t.f66607n = this;
                    c6569t.f66610q = 1;
                    obj = u02.x(str, str2, z10, c6569t);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6550a = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6550a = (C6550a) c6569t.f66607n;
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                    return c5582a;
                }
                MessageEntity messageEntity = (MessageEntity) c5582a.b();
                return c5582a.a(messageEntity != null ? MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null) : null);
            }
        }
        c6569t = new C6569t(continuation);
        Object obj2 = c6569t.f66608o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6569t.f66610q;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
    }

    public final C6152a u0() {
        return (C6152a) this.f66362c.getValue();
    }

    @Override // xf.InterfaceC6823a
    public Object v(String str, Message.g gVar, Message.f fVar, Continuation continuation) {
        return u0().b0(str, gVar, fVar, continuation);
    }

    public final C6364a v0() {
        return (C6364a) this.f66363d.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|8|(1:(1:(1:(1:(1:(6:15|16|17|(1:19)|20|21)(2:24|25))(10:26|27|28|(3:31|(3:33|34|35)(1:36)|29)|37|16|17|(0)|20|21))(8:38|39|(4:41|28|(1:29)|37)|16|17|(0)|20|21))(12:42|43|44|45|(1:47)|48|(3:52|(5:56|(2:59|57)|60|61|(2:63|35))|(0))|16|17|(0)|20|21))(3:64|65|66))(3:87|88|(2:90|35)(1:91))|67|(5:71|(1:73)(1:86)|74|(4:76|(1:78)(1:83)|79|(1:81)(5:82|45|(0)|48|(4:50|52|(6:54|56|(1:57)|60|61|(0))|(0))))(1:84)|35)|16|17|(0)|20|21))|94|6|7|8|(0)(0)|67|(6:69|71|(0)(0)|74|(0)(0)|35)|16|17|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        if (r6.k0(r4, r3, r9) == r2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0038, B:16:0x01c6, B:27:0x0054, B:29:0x0198, B:31:0x019e, B:39:0x0065, B:41:0x0191, B:43:0x0072, B:45:0x0121, B:48:0x012d, B:50:0x0132, B:52:0x014a, B:54:0x0152, B:56:0x0158, B:57:0x016a, B:59:0x0170, B:61:0x017e, B:65:0x008a, B:67:0x00c1, B:69:0x00cd, B:71:0x00e9, B:73:0x00ef, B:74:0x00f5, B:76:0x00fd, B:78:0x0107, B:79:0x010d, B:84:0x01b7, B:88:0x0096), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0038, B:16:0x01c6, B:27:0x0054, B:29:0x0198, B:31:0x019e, B:39:0x0065, B:41:0x0191, B:43:0x0072, B:45:0x0121, B:48:0x012d, B:50:0x0132, B:52:0x014a, B:54:0x0152, B:56:0x0158, B:57:0x016a, B:59:0x0170, B:61:0x017e, B:65:0x008a, B:67:0x00c1, B:69:0x00cd, B:71:0x00e9, B:73:0x00ef, B:74:0x00f5, B:76:0x00fd, B:78:0x0107, B:79:0x010d, B:84:0x01b7, B:88:0x0096), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170 A[Catch: all -> 0x003d, LOOP:1: B:57:0x016a->B:59:0x0170, LOOP_END, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0038, B:16:0x01c6, B:27:0x0054, B:29:0x0198, B:31:0x019e, B:39:0x0065, B:41:0x0191, B:43:0x0072, B:45:0x0121, B:48:0x012d, B:50:0x0132, B:52:0x014a, B:54:0x0152, B:56:0x0158, B:57:0x016a, B:59:0x0170, B:61:0x017e, B:65:0x008a, B:67:0x00c1, B:69:0x00cd, B:71:0x00e9, B:73:0x00ef, B:74:0x00f5, B:76:0x00fd, B:78:0x0107, B:79:0x010d, B:84:0x01b7, B:88:0x0096), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0038, B:16:0x01c6, B:27:0x0054, B:29:0x0198, B:31:0x019e, B:39:0x0065, B:41:0x0191, B:43:0x0072, B:45:0x0121, B:48:0x012d, B:50:0x0132, B:52:0x014a, B:54:0x0152, B:56:0x0158, B:57:0x016a, B:59:0x0170, B:61:0x017e, B:65:0x008a, B:67:0x00c1, B:69:0x00cd, B:71:0x00e9, B:73:0x00ef, B:74:0x00f5, B:76:0x00fd, B:78:0x0107, B:79:0x010d, B:84:0x01b7, B:88:0x0096), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0038, B:16:0x01c6, B:27:0x0054, B:29:0x0198, B:31:0x019e, B:39:0x0065, B:41:0x0191, B:43:0x0072, B:45:0x0121, B:48:0x012d, B:50:0x0132, B:52:0x014a, B:54:0x0152, B:56:0x0158, B:57:0x016a, B:59:0x0170, B:61:0x017e, B:65:0x008a, B:67:0x00c1, B:69:0x00cd, B:71:0x00e9, B:73:0x00ef, B:74:0x00f5, B:76:0x00fd, B:78:0x0107, B:79:0x010d, B:84:0x01b7, B:88:0x0096), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:15:0x0038, B:16:0x01c6, B:27:0x0054, B:29:0x0198, B:31:0x019e, B:39:0x0065, B:41:0x0191, B:43:0x0072, B:45:0x0121, B:48:0x012d, B:50:0x0132, B:52:0x014a, B:54:0x0152, B:56:0x0158, B:57:0x016a, B:59:0x0170, B:61:0x017e, B:65:0x008a, B:67:0x00c1, B:69:0x00cd, B:71:0x00e9, B:73:0x00ef, B:74:0x00f5, B:76:0x00fd, B:78:0x0107, B:79:0x010d, B:84:0x01b7, B:88:0x0096), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0093  */
    /* JADX WARN: Type inference failed for: r3v5, types: [qf.a] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(String str, String str2, Continuation continuation) {
        C6557h c6557h;
        Object coroutine_suspended;
        int i10;
        Throwable m150exceptionOrNullimpl;
        Object obj;
        String str3;
        C6550a c6550a;
        Object obj2;
        String str4;
        MessageEntity messageEntity;
        Message g10;
        Message.Extras extras;
        Object C10;
        C6550a c6550a2;
        List list;
        List h10;
        Message message;
        String chatId;
        ArrayList arrayList;
        Iterator it;
        Message.f fVar;
        Iterator it2;
        if (continuation instanceof C6557h) {
            c6557h = (C6557h) continuation;
            int i11 = c6557h.f66565s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6557h.f66565s = i11 - Integer.MIN_VALUE;
                C6557h c6557h2 = c6557h;
                Object obj3 = c6557h2.f66563q;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6557h2.f66565s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    Result.Companion companion = Result.INSTANCE;
                    C6152a u02 = u0();
                    c6557h2.f66560n = this;
                    c6557h2.f66561o = str;
                    c6557h2.f66562p = str2;
                    c6557h2.f66565s = 1;
                    obj = null;
                    Object y10 = C6152a.y(u02, null, str, null, null, str2, c6557h2, 8, null);
                    if (y10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    c6550a = this;
                    obj2 = y10;
                    str4 = str2;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            String str5 = (String) c6557h2.f66561o;
                            C6550a c6550a3 = (C6550a) c6557h2.f66560n;
                            ResultKt.throwOnFailure(obj3);
                            C10 = obj3;
                            obj = null;
                            c6550a2 = c6550a3;
                            str3 = str5;
                            if (!((List) C10).isEmpty()) {
                                obj = C10;
                            }
                            list = (List) obj;
                            if (list != null && (h10 = MessageRoomToDomainKt.h(list, c6550a2.f66360a, c6550a2.s0(), false, c6550a2.f66368i, 4, null)) != null) {
                                message = (Message) CollectionsKt.firstOrNull(h10);
                                if (message != null && (chatId = message.getChatId()) != null) {
                                    List list2 = h10;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Message) it.next()).getId());
                                    }
                                    fVar = Message.f.Failure;
                                    c6557h2.f66560n = c6550a2;
                                    c6557h2.f66561o = str3;
                                    c6557h2.f66562p = h10;
                                    c6557h2.f66565s = 3;
                                    if (c6550a2.G0(chatId, arrayList, fVar, c6557h2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                if (h10 != null) {
                                }
                            }
                            Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return me.b.a(m147constructorimpl);
                        }
                        if (i10 == 3) {
                            h10 = (List) c6557h2.f66562p;
                            str3 = (String) c6557h2.f66561o;
                            c6550a2 = (C6550a) c6557h2.f66560n;
                            ResultKt.throwOnFailure(obj3);
                            if (h10 != null) {
                                it2 = h10.iterator();
                                while (it2.hasNext()) {
                                }
                            }
                            Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return me.b.a(m147constructorimpl2);
                        }
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            Object m147constructorimpl22 = Result.m147constructorimpl(Unit.INSTANCE);
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl22);
                            if (m150exceptionOrNullimpl != null) {
                                LiveChatUtil.log(m150exceptionOrNullimpl);
                            }
                            return me.b.a(m147constructorimpl22);
                        }
                        it2 = (Iterator) c6557h2.f66562p;
                        str3 = (String) c6557h2.f66561o;
                        c6550a2 = (C6550a) c6557h2.f66560n;
                        ResultKt.throwOnFailure(obj3);
                        while (it2.hasNext()) {
                            String id2 = ((Message) it2.next()).getId();
                            c6557h2.f66560n = c6550a2;
                            c6557h2.f66561o = str3;
                            c6557h2.f66562p = it2;
                            c6557h2.f66565s = 4;
                            if (c6550a2.k0(str3, id2, c6557h2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        Object m147constructorimpl222 = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl222);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        return me.b.a(m147constructorimpl222);
                    }
                    str4 = (String) c6557h2.f66562p;
                    str3 = (String) c6557h2.f66561o;
                    c6550a = (C6550a) c6557h2.f66560n;
                    ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    obj = null;
                }
                messageEntity = (MessageEntity) ((C5582a) obj2).b();
                if (messageEntity != null && (g10 = MessageRoomToDomainKt.g(messageEntity, c6550a.f66360a, c6550a.s0(), false, false, c6550a.f66368i, null, 44, null)) != null) {
                    extras = g10.getExtras();
                    if (AbstractC5891c.d((Collection) (extras == null ? extras.getChainedMessageIds() : obj))) {
                        c6557h2.f66560n = obj;
                        c6557h2.f66561o = obj;
                        c6557h2.f66562p = obj;
                        c6557h2.f66565s = 5;
                    } else {
                        ?? u03 = c6550a.u0();
                        Message.Extras extras2 = g10.getExtras();
                        ?? chainedMessageIds = extras2 != null ? extras2.getChainedMessageIds() : obj;
                        Intrinsics.checkNotNull(chainedMessageIds);
                        c6557h2.f66560n = c6550a;
                        c6557h2.f66561o = str3;
                        c6557h2.f66562p = obj;
                        c6557h2.f66565s = 2;
                        C10 = u03.C(chainedMessageIds, c6557h2);
                        if (C10 != coroutine_suspended) {
                            c6550a2 = c6550a;
                            if (!((List) C10).isEmpty()) {
                            }
                            list = (List) obj;
                            if (list != null) {
                                message = (Message) CollectionsKt.firstOrNull(h10);
                                if (message != null) {
                                    List list22 = h10;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                                    it = list22.iterator();
                                    while (it.hasNext()) {
                                    }
                                    fVar = Message.f.Failure;
                                    c6557h2.f66560n = c6550a2;
                                    c6557h2.f66561o = str3;
                                    c6557h2.f66562p = h10;
                                    c6557h2.f66565s = 3;
                                    if (c6550a2.G0(chatId, arrayList, fVar, c6557h2) == coroutine_suspended) {
                                    }
                                }
                                if (h10 != null) {
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                Object m147constructorimpl2222 = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2222);
                if (m150exceptionOrNullimpl != null) {
                }
                return me.b.a(m147constructorimpl2222);
            }
        }
        c6557h = new C6557h(continuation);
        C6557h c6557h22 = c6557h;
        Object obj32 = c6557h22.f66563q;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6557h22.f66565s;
        if (i10 != 0) {
        }
        messageEntity = (MessageEntity) ((C5582a) obj2).b();
        if (messageEntity != null) {
            extras = g10.getExtras();
            if (AbstractC5891c.d((Collection) (extras == null ? extras.getChainedMessageIds() : obj))) {
            }
            return coroutine_suspended;
        }
        Object m147constructorimpl22222 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl22222);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl22222);
    }

    public final kotlinx.coroutines.flow.y w0() {
        return (kotlinx.coroutines.flow.y) this.f66361b.getValue();
    }

    @Override // xf.InterfaceC6823a
    public Object x(Message message, boolean z10, Continuation continuation) {
        C6152a u02 = u0();
        Gson s02 = s0();
        String V10 = o0().V();
        if (V10 == null) {
            V10 = "";
        }
        return u02.T(AbstractC6687a.a(message, s02, V10), z10, continuation);
    }

    public final String x0(List list) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Pair pair = (Pair) obj;
            if (i.g(pair.getFirst()) || String.valueOf(pair.getFirst()).length() == 0) {
                arrayList.add(obj);
            }
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, x.f66632d, 30, null));
        sb2.append('.');
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(String str, Message.g gVar, Continuation continuation) {
        B b10;
        int i10;
        C5582a c5582a;
        if (continuation instanceof B) {
            b10 = (B) continuation;
            int i11 = b10.f66372p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b10.f66372p = i11 - Integer.MIN_VALUE;
                Object obj = b10.f66370n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = b10.f66372p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C6152a u02 = u0();
                    b10.f66372p = 1;
                    obj = u02.F(str, gVar, b10);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (!c5582a.d()) {
                    return c5582a.a(Boxing.boxBoolean(i.d(Boxing.boxInt(((Number) c5582a.b()).intValue()), 0)));
                }
                Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                return c5582a;
            }
        }
        b10 = new B(continuation);
        Object obj2 = b10.f66370n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = b10.f66372p;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (!c5582a.d()) {
        }
    }

    public final Function2 y0() {
        return this.f66368i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x046d, code lost:
    
        if (r5 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b7, code lost:
    
        if (r18 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0219 A[LOOP:2: B:109:0x0213->B:111:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0246 A[LOOP:3: B:114:0x0240->B:116:0x0246, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032d A[Catch: all -> 0x03e1, TRY_LEAVE, TryCatch #1 {all -> 0x03e1, blocks: (B:31:0x0327, B:33:0x032d, B:49:0x03e4), top: B:30:0x0327 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0376 A[Catch: all -> 0x006c, TryCatch #2 {all -> 0x006c, blocks: (B:27:0x0067, B:28:0x03d0, B:36:0x036b, B:38:0x0376, B:39:0x038e, B:42:0x039f, B:44:0x03ab, B:67:0x0091), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03ab A[Catch: all -> 0x006c, TryCatch #2 {all -> 0x006c, blocks: (B:27:0x0067, B:28:0x03d0, B:36:0x036b, B:38:0x0376, B:39:0x038e, B:42:0x039f, B:44:0x03ab, B:67:0x0091), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03e4 A[Catch: all -> 0x03e1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x03e1, blocks: (B:31:0x0327, B:33:0x032d, B:49:0x03e4), top: B:30:0x0327 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x03a9 -> B:25:0x03d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x03cc -> B:24:0x03d0). Please report as a decompilation issue!!! */
    @Override // xf.InterfaceC6823a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(String str, String str2, String str3, List list, EnumC6551b enumC6551b, Continuation continuation) {
        L l10;
        Wh.a aVar;
        Object obj;
        String str4;
        String str5;
        C6550a c6550a;
        Function2 function2;
        String str6;
        List list2;
        List list3;
        String str7;
        String str8;
        Iterator it;
        Function2 function22;
        List list4;
        String str9;
        String localFilePath;
        Iterator it2;
        Iterator it3;
        ArrayList arrayList;
        Iterator it4;
        String str10;
        List list5;
        String str11;
        String str12;
        Message.f fVar;
        SalesIQResponse salesIQResponse;
        Wh.a aVar2;
        Iterator it5;
        List list6;
        String str13;
        C6550a c6550a2;
        L l11;
        SalesIQResponse salesIQResponse2;
        String str14;
        Message message;
        Iterator it6;
        Wh.a aVar3;
        SalesIQResponse salesIQResponse3;
        List list7;
        String str15;
        String str16;
        C6550a c6550a3;
        Iterator it7;
        String str17;
        C6550a c6550a4;
        Message g10;
        try {
            if (continuation instanceof L) {
                l10 = (L) continuation;
                int i10 = l10.f66433y;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    l10.f66433y = i10 - Integer.MIN_VALUE;
                    Object obj2 = l10.f66431w;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (l10.f66433y) {
                        case 0:
                            ResultKt.throwOnFailure(obj2);
                            String I10 = o0().I();
                            M m10 = new M(str2);
                            if ((I10 != null ? this : null) != null) {
                                List list8 = list;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                                Iterator it8 = list8.iterator();
                                while (it8.hasNext()) {
                                    Message.Extras extras = ((Message) it8.next()).getExtras();
                                    arrayList2.add((extras == null || (localFilePath = extras.getLocalFilePath()) == null) ? null : new File(localFilePath));
                                }
                                if (enumC6551b == null) {
                                    str7 = str;
                                    str8 = str3;
                                    c6550a = this;
                                    str6 = str2;
                                    it = list8.iterator();
                                    function22 = m10;
                                    list4 = arrayList2;
                                    str9 = I10;
                                    list3 = list;
                                    while (it.hasNext()) {
                                        Message message2 = (Message) it.next();
                                        String id2 = message2.getId();
                                        String content = message2.getContent();
                                        Message.g messageType = message2.getMessageType();
                                        if (((i.e(message2.getAttachment()) || !list4.isEmpty()) ? message2 : null) != null) {
                                            Message.Extras extras2 = message2.getExtras();
                                            if (i.s(String.valueOf(extras2 != null ? Boxing.boxLong(extras2.getLocalFileSize()) : null)) < 10485760) {
                                                fVar = Message.f.Uploading;
                                                break;
                                            } else {
                                                fVar = Message.f.Failure;
                                                break;
                                            }
                                        }
                                        fVar = Message.f.Sending;
                                        Message.Attachment attachment = message2.getAttachment();
                                        Message.Extras extras3 = message2.getExtras();
                                        Message.RespondedMessage respondedMessage = message2.getRespondedMessage();
                                        l10.f66422n = c6550a;
                                        l10.f66423o = str7;
                                        l10.f66424p = str6;
                                        l10.f66425q = str8;
                                        l10.f66426r = list3;
                                        l10.f66427s = str9;
                                        l10.f66428t = function22;
                                        l10.f66429u = it;
                                        l10.f66430v = list4;
                                        l10.f66433y = 1;
                                        L l12 = l10;
                                        if (i0(c6550a, str7, str6, str8, id2, content, messageType, fVar, attachment, extras3, respondedMessage, null, null, l12, 2048, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        l10 = l12;
                                    }
                                    list2 = list4;
                                    function2 = function22;
                                    str5 = str9;
                                    str4 = str8;
                                    List list9 = list3;
                                    it2 = list9.iterator();
                                    while (it2.hasNext()) {
                                        c6550a.F0(str6, ((Message) it2.next()).getId(), Boxing.boxInt(0));
                                    }
                                    C6364a v02 = c6550a.v0();
                                    Intrinsics.checkNotNull(str5);
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                                    it3 = list9.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((Message) it3.next()).getId());
                                    }
                                    String J10 = c6550a.o0().J();
                                    String Q10 = c6550a.o0().Q();
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                                    it4 = list9.iterator();
                                    while (true) {
                                        str10 = "";
                                        if (!it4.hasNext()) {
                                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                                            Iterator it9 = list9.iterator();
                                            while (it9.hasNext()) {
                                                Message.Attachment attachment2 = ((Message) it9.next()).getAttachment();
                                                String type = attachment2 != null ? attachment2.getType() : null;
                                                if (type == null) {
                                                    type = "";
                                                }
                                                arrayList4.add(type);
                                            }
                                            l10.f66422n = c6550a;
                                            l10.f66423o = str6;
                                            l10.f66424p = str4;
                                            l10.f66425q = list3;
                                            l10.f66426r = null;
                                            l10.f66427s = null;
                                            l10.f66428t = null;
                                            l10.f66429u = null;
                                            l10.f66430v = null;
                                            l10.f66433y = 2;
                                            L l13 = l10;
                                            Object k10 = v02.k(str5, str4, arrayList3, J10, Q10, list2, arrayList, arrayList4, function2, l13);
                                            if (k10 != coroutine_suspended) {
                                                list5 = list3;
                                                obj2 = k10;
                                                str11 = str6;
                                                str12 = str4;
                                                l10 = l13;
                                                salesIQResponse = (SalesIQResponse) obj2;
                                                if (salesIQResponse.getIsSuccess()) {
                                                    Wh.a d10 = C6461a.C0913a.f65814a.d();
                                                    l10.f66422n = c6550a;
                                                    l10.f66423o = str11;
                                                    l10.f66424p = str12;
                                                    l10.f66425q = list5;
                                                    l10.f66426r = salesIQResponse;
                                                    l10.f66427s = d10;
                                                    l10.f66433y = 3;
                                                    if (d10.f(null, l10) != coroutine_suspended) {
                                                        aVar2 = d10;
                                                        try {
                                                            it5 = list5.iterator();
                                                            aVar = aVar2;
                                                            list6 = list5;
                                                            str13 = str11;
                                                            c6550a2 = c6550a;
                                                            l11 = l10;
                                                            salesIQResponse2 = salesIQResponse;
                                                            str14 = str12;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            obj = null;
                                                            aVar = aVar2;
                                                            aVar.g(obj);
                                                            throw th;
                                                        }
                                                        try {
                                                            if (it5.hasNext()) {
                                                                Message message3 = (Message) it5.next();
                                                                c6550a2.F0(str13, message3.getId(), null);
                                                                C6152a u02 = c6550a2.u0();
                                                                String id3 = message3.getId();
                                                                l11.f66422n = c6550a2;
                                                                l11.f66423o = str13;
                                                                l11.f66424p = str14;
                                                                l11.f66425q = list6;
                                                                l11.f66426r = salesIQResponse2;
                                                                l11.f66427s = aVar;
                                                                l11.f66428t = it5;
                                                                l11.f66429u = message3;
                                                                l11.f66433y = 4;
                                                                Object z10 = u02.z(str14, str13, null, null, id3, l11);
                                                                if (z10 != coroutine_suspended) {
                                                                    salesIQResponse3 = salesIQResponse2;
                                                                    l10 = l11;
                                                                    aVar3 = aVar;
                                                                    list7 = list6;
                                                                    c6550a3 = c6550a2;
                                                                    str15 = str14;
                                                                    str16 = str13;
                                                                    it6 = it5;
                                                                    obj2 = z10;
                                                                    message = message3;
                                                                    MessageEntity messageEntity = (MessageEntity) ((C5582a) obj2).b();
                                                                    g10 = messageEntity == null ? MessageRoomToDomainKt.g(messageEntity, c6550a3.f66360a, c6550a3.s0(), false, false, null, null, 60, null) : null;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("WmsDelay Message sent in API, ");
                                                                    sb2.append(g10 == null ? "Message is yet to be received from WMS" : "Message has been received from WMS");
                                                                    LiveChatUtil.log(sb2.toString());
                                                                    if (g10 != null) {
                                                                        C6152a u03 = c6550a3.u0();
                                                                        String id4 = message.getId();
                                                                        Message.f fVar2 = Message.f.WaitingForWms;
                                                                        l10.f66422n = c6550a3;
                                                                        l10.f66423o = str16;
                                                                        l10.f66424p = str15;
                                                                        l10.f66425q = list7;
                                                                        l10.f66426r = salesIQResponse3;
                                                                        l10.f66427s = aVar3;
                                                                        l10.f66428t = it6;
                                                                        l10.f66429u = message;
                                                                        l10.f66433y = 5;
                                                                        if (u03.c0(str16, id4, fVar2, l10) == coroutine_suspended) {
                                                                        }
                                                                        c6550a3.j0(str15, str16, message.getId());
                                                                    }
                                                                    it5 = it6;
                                                                    str14 = str15;
                                                                    str13 = str16;
                                                                    c6550a2 = c6550a3;
                                                                    l11 = l10;
                                                                    aVar = aVar3;
                                                                    salesIQResponse2 = salesIQResponse3;
                                                                    list6 = list7;
                                                                    if (it5.hasNext()) {
                                                                        Unit unit = Unit.INSTANCE;
                                                                        aVar.g(null);
                                                                        str12 = str14;
                                                                        str11 = str13;
                                                                        list5 = list6;
                                                                        salesIQResponse = salesIQResponse2;
                                                                        l10 = l11;
                                                                        c6550a = c6550a2;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            obj = null;
                                                            aVar.g(obj);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                if (!salesIQResponse.getIsSuccess()) {
                                                    SalesIQResponse.Error error = salesIQResponse.getError();
                                                    if (error == null) {
                                                        error = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                                                    }
                                                    Integer b10 = error.b();
                                                    if (b10 != null) {
                                                        c6550a.q0().handleError(str12, b10.intValue());
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    it7 = list5.iterator();
                                                    str17 = str11;
                                                    c6550a4 = c6550a;
                                                    while (it7.hasNext()) {
                                                        Message message4 = (Message) it7.next();
                                                        C6152a u04 = c6550a4.u0();
                                                        String id5 = message4.getId();
                                                        Message.f fVar3 = Message.f.Failure;
                                                        l10.f66422n = c6550a4;
                                                        l10.f66423o = str17;
                                                        l10.f66424p = salesIQResponse;
                                                        l10.f66425q = it7;
                                                        l10.f66426r = null;
                                                        l10.f66427s = null;
                                                        l10.f66428t = null;
                                                        l10.f66429u = null;
                                                        l10.f66433y = 6;
                                                        if (u04.c0(str17, id5, fVar3, l10) == coroutine_suspended) {
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            return coroutine_suspended;
                                        }
                                        Message.Attachment attachment3 = ((Message) it4.next()).getAttachment();
                                        String fileName = attachment3 != null ? attachment3.getFileName() : null;
                                        if (fileName != null) {
                                            str10 = fileName;
                                        }
                                        arrayList.add(str10);
                                    }
                                } else {
                                    str4 = str3;
                                    str5 = I10;
                                    c6550a = this;
                                    function2 = m10;
                                    str6 = str2;
                                    list2 = arrayList2;
                                    list3 = list;
                                    List list92 = list3;
                                    it2 = list92.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    C6364a v022 = c6550a.v0();
                                    Intrinsics.checkNotNull(str5);
                                    ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list92, 10));
                                    it3 = list92.iterator();
                                    while (it3.hasNext()) {
                                    }
                                    String J102 = c6550a.o0().J();
                                    String Q102 = c6550a.o0().Q();
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list92, 10));
                                    it4 = list92.iterator();
                                    while (true) {
                                        str10 = "";
                                        if (!it4.hasNext()) {
                                        }
                                        arrayList.add(str10);
                                    }
                                }
                            }
                            salesIQResponse = SalesIQResponse.INSTANCE.b(new Throwable("screenName must not be null for sendMessage()"));
                            return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
                        case 1:
                            list4 = (List) l10.f66430v;
                            it = (Iterator) l10.f66429u;
                            function22 = (Function2) l10.f66428t;
                            str9 = (String) l10.f66427s;
                            List list10 = (List) l10.f66426r;
                            String str18 = (String) l10.f66425q;
                            str6 = (String) l10.f66424p;
                            String str19 = (String) l10.f66423o;
                            C6550a c6550a5 = (C6550a) l10.f66422n;
                            ResultKt.throwOnFailure(obj2);
                            str8 = str18;
                            str7 = str19;
                            list3 = list10;
                            c6550a = c6550a5;
                            while (it.hasNext()) {
                            }
                            list2 = list4;
                            function2 = function22;
                            str5 = str9;
                            str4 = str8;
                            List list922 = list3;
                            it2 = list922.iterator();
                            while (it2.hasNext()) {
                            }
                            C6364a v0222 = c6550a.v0();
                            Intrinsics.checkNotNull(str5);
                            ArrayList arrayList322 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list922, 10));
                            it3 = list922.iterator();
                            while (it3.hasNext()) {
                            }
                            String J1022 = c6550a.o0().J();
                            String Q1022 = c6550a.o0().Q();
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list922, 10));
                            it4 = list922.iterator();
                            while (true) {
                                str10 = "";
                                if (!it4.hasNext()) {
                                }
                                arrayList.add(str10);
                            }
                            break;
                        case 2:
                            List list11 = (List) l10.f66425q;
                            String str20 = (String) l10.f66424p;
                            String str21 = (String) l10.f66423o;
                            C6550a c6550a6 = (C6550a) l10.f66422n;
                            ResultKt.throwOnFailure(obj2);
                            str11 = str21;
                            c6550a = c6550a6;
                            list5 = list11;
                            str12 = str20;
                            salesIQResponse = (SalesIQResponse) obj2;
                            if (salesIQResponse.getIsSuccess()) {
                            }
                            if (!salesIQResponse.getIsSuccess()) {
                            }
                            break;
                        case 3:
                            aVar2 = (Wh.a) l10.f66427s;
                            salesIQResponse = (SalesIQResponse) l10.f66426r;
                            list5 = (List) l10.f66425q;
                            str12 = (String) l10.f66424p;
                            str11 = (String) l10.f66423o;
                            c6550a = (C6550a) l10.f66422n;
                            ResultKt.throwOnFailure(obj2);
                            it5 = list5.iterator();
                            aVar = aVar2;
                            list6 = list5;
                            str13 = str11;
                            c6550a2 = c6550a;
                            l11 = l10;
                            salesIQResponse2 = salesIQResponse;
                            str14 = str12;
                            if (it5.hasNext()) {
                            }
                            break;
                        case 4:
                            message = (Message) l10.f66429u;
                            it6 = (Iterator) l10.f66428t;
                            aVar3 = (Wh.a) l10.f66427s;
                            salesIQResponse3 = (SalesIQResponse) l10.f66426r;
                            list7 = (List) l10.f66425q;
                            str15 = (String) l10.f66424p;
                            str16 = (String) l10.f66423o;
                            c6550a3 = (C6550a) l10.f66422n;
                            ResultKt.throwOnFailure(obj2);
                            MessageEntity messageEntity2 = (MessageEntity) ((C5582a) obj2).b();
                            if (messageEntity2 == null) {
                            }
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("WmsDelay Message sent in API, ");
                            sb22.append(g10 == null ? "Message is yet to be received from WMS" : "Message has been received from WMS");
                            LiveChatUtil.log(sb22.toString());
                            if (g10 != null) {
                            }
                            it5 = it6;
                            str14 = str15;
                            str13 = str16;
                            c6550a2 = c6550a3;
                            l11 = l10;
                            aVar = aVar3;
                            salesIQResponse2 = salesIQResponse3;
                            list6 = list7;
                            if (it5.hasNext()) {
                            }
                            break;
                        case 5:
                            message = (Message) l10.f66429u;
                            it6 = (Iterator) l10.f66428t;
                            aVar3 = (Wh.a) l10.f66427s;
                            salesIQResponse3 = (SalesIQResponse) l10.f66426r;
                            list7 = (List) l10.f66425q;
                            str15 = (String) l10.f66424p;
                            str16 = (String) l10.f66423o;
                            c6550a3 = (C6550a) l10.f66422n;
                            ResultKt.throwOnFailure(obj2);
                            c6550a3.j0(str15, str16, message.getId());
                            it5 = it6;
                            str14 = str15;
                            str13 = str16;
                            c6550a2 = c6550a3;
                            l11 = l10;
                            aVar = aVar3;
                            salesIQResponse2 = salesIQResponse3;
                            list6 = list7;
                            if (it5.hasNext()) {
                            }
                            break;
                        case 6:
                            it7 = (Iterator) l10.f66425q;
                            salesIQResponse = (SalesIQResponse) l10.f66424p;
                            str17 = (String) l10.f66423o;
                            c6550a4 = (C6550a) l10.f66422n;
                            ResultKt.throwOnFailure(obj2);
                            while (it7.hasNext()) {
                            }
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (l10.f66433y) {
            }
        } catch (Throwable th4) {
            th = th4;
            aVar = aVar3;
        }
        l10 = new L(continuation);
        Object obj22 = l10.f66431w;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final boolean z0(Message message) {
        if (message.getMessageType() != Message.g.Question) {
            String sender = message.getSender();
            if (sender != null) {
                if (StringsKt.startsWith$default(sender, "$", false, 2, (Object) null)) {
                    Message.Meta meta = message.getMeta();
                    if (!i.g(meta != null ? meta.getOperationUser() : null) || (!i.g(message.getMode()) && message.getMode() == Message.d.Trigger)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C6550a(Application application) {
        this.f66360a = application;
        this.f66361b = LazyKt.lazy(E.f66375d);
        this.f66362c = LazyKt.lazy(C.f66373d);
        this.f66363d = LazyKt.lazy(D.f66374d);
        this.f66364e = LazyKt.lazy(C6560k.f66568d);
        this.f66365f = LazyKt.lazy(new C6561l());
        this.f66366g = LazyKt.lazy(C6559j.f66567d);
        this.f66367h = LazyKt.lazy(new C6558i());
        this.f66368i = new A();
    }
}
