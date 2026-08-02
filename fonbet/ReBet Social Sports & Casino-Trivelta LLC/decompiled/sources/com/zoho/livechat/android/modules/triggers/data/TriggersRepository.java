package com.zoho.livechat.android.modules.triggers.data;

import Ph.AbstractC1459k;
import Ph.P;
import Sf.c;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerAcknowledgementResponse;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerResponse;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.VTSTriggerResponse;
import com.zoho.livechat.android.modules.triggers.domain.entities.Trigger;
import com.zoho.livechat.android.modules.triggers.domain.entities.TriggerAlarm;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.android.TriggerReceiver;
import ge.C4377a;
import ie.b;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
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
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import me.C5582a;
import og.AbstractC5891c;
import og.AbstractC5895g;
import og.AbstractC5896h;
import td.C6461a;
import ug.AbstractC6574b;
import ze.C6959a;

/* loaded from: classes4.dex */
public final class TriggersRepository implements Pf.a {

    /* renamed from: h, reason: collision with root package name */
    public static TriggersRepository f44143h;

    /* renamed from: a, reason: collision with root package name */
    public final Application f44145a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f44146b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f44147c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f44148d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f44149e;

    /* renamed from: f, reason: collision with root package name */
    public List f44150f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f44142g = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static Object f44144i = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TriggersRepository a(Application application) {
            TriggersRepository triggersRepository;
            Intrinsics.checkNotNullParameter(application, "application");
            TriggersRepository triggersRepository2 = TriggersRepository.f44143h;
            if (triggersRepository2 != null) {
                return triggersRepository2;
            }
            synchronized (TriggersRepository.f44144i) {
                triggersRepository = new TriggersRepository(application, null);
                TriggersRepository.f44143h = triggersRepository;
            }
            return triggersRepository;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Rf.a f44151a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44152b;

        /* renamed from: c, reason: collision with root package name */
        public final String f44153c;

        /* renamed from: d, reason: collision with root package name */
        public final String f44154d;

        /* renamed from: e, reason: collision with root package name */
        public final String f44155e;

        /* renamed from: f, reason: collision with root package name */
        public final String f44156f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44157g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f44158h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f44159i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f44160j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f44161k;

        public b(Rf.a actionType, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            this.f44151a = actionType;
            this.f44152b = str;
            this.f44153c = str2;
            this.f44154d = str3;
            this.f44155e = str4;
            this.f44156f = str5;
            this.f44157g = z10;
            this.f44158h = z11;
            this.f44159i = z12;
            this.f44160j = z13;
            this.f44161k = z14;
        }

        public final String a() {
            return this.f44154d;
        }

        public final Rf.a b() {
            return this.f44151a;
        }

        public final boolean c() {
            return this.f44160j;
        }

        public final String d() {
            return this.f44153c;
        }

        public final String e() {
            return this.f44155e;
        }

        public final String f() {
            return this.f44152b;
        }

        public final boolean g() {
            return this.f44157g;
        }

        public final String h() {
            return this.f44156f;
        }

        public final boolean i() {
            return this.f44159i;
        }

        public final boolean j() {
            return this.f44158h;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.Cache.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.a.Preferences.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.a.CacheAndPreferences.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(TriggersRepository.this.f44145a);
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4377a invoke() {
            return C4377a.f47235d.a(TriggersRepository.this.f44145a);
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f44164d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ne.b invoke() {
            return Ne.b.f7993f.a();
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44165n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C5582a f44167p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C5582a c5582a, Continuation continuation) {
            super(2, continuation);
            this.f44167p = c5582a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TriggersRepository.this.new g(this.f44167p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44165n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C4377a v10 = TriggersRepository.this.v();
                b.l lVar = new b.l(MapsKt.hashMapOf(TuplesKt.to(EventKeys.VALUE_KEY, TriggersRepository.this.x().v(this.f44167p.b()))));
                this.f44165n = 1;
                if (v10.b(lVar, this) == coroutine_suspended) {
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

    public static final class h extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f44168d = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (CharSequence) it.getSecond();
        }
    }

    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f44169n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f44170o;

        /* renamed from: q, reason: collision with root package name */
        public int f44172q;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44170o = obj;
            this.f44172q |= Integer.MIN_VALUE;
            return TriggersRepository.this.D(null, null, null, false, null, null, 0L, false, this);
        }
    }

    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f44173n;

        /* renamed from: o, reason: collision with root package name */
        public Object f44174o;

        /* renamed from: p, reason: collision with root package name */
        public Object f44175p;

        /* renamed from: q, reason: collision with root package name */
        public Object f44176q;

        /* renamed from: r, reason: collision with root package name */
        public Object f44177r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f44178s;

        /* renamed from: u, reason: collision with root package name */
        public int f44180u;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44178s = obj;
            this.f44180u |= Integer.MIN_VALUE;
            return TriggersRepository.this.F(null, null, null, false, false, this);
        }
    }

    public static final class k extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public boolean f44181A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f44182B;

        /* renamed from: C, reason: collision with root package name */
        public int f44183C;

        /* renamed from: D, reason: collision with root package name */
        public /* synthetic */ Object f44184D;

        /* renamed from: F, reason: collision with root package name */
        public int f44186F;

        /* renamed from: n, reason: collision with root package name */
        public Object f44187n;

        /* renamed from: o, reason: collision with root package name */
        public Object f44188o;

        /* renamed from: p, reason: collision with root package name */
        public Object f44189p;

        /* renamed from: q, reason: collision with root package name */
        public Object f44190q;

        /* renamed from: r, reason: collision with root package name */
        public Object f44191r;

        /* renamed from: s, reason: collision with root package name */
        public Object f44192s;

        /* renamed from: t, reason: collision with root package name */
        public Object f44193t;

        /* renamed from: u, reason: collision with root package name */
        public Object f44194u;

        /* renamed from: v, reason: collision with root package name */
        public Object f44195v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f44196w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f44197x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f44198y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f44199z;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44184D = obj;
            this.f44186F |= Integer.MIN_VALUE;
            return TriggersRepository.this.h(null, null, null, null, null, null, false, false, false, false, false, false, this);
        }
    }

    public static final class l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f44200n;

        /* renamed from: o, reason: collision with root package name */
        public Object f44201o;

        /* renamed from: p, reason: collision with root package name */
        public Object f44202p;

        /* renamed from: q, reason: collision with root package name */
        public Object f44203q;

        /* renamed from: r, reason: collision with root package name */
        public Object f44204r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f44205s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f44206t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f44207u;

        /* renamed from: w, reason: collision with root package name */
        public int f44209w;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44207u = obj;
            this.f44209w |= Integer.MIN_VALUE;
            return TriggersRepository.this.g(null, null, false, false, this);
        }
    }

    public static final class m extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final m f44210d = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Mf.a invoke() {
            return Mf.a.f7651b.a();
        }
    }

    public static final class n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f44211n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f44212o;

        /* renamed from: q, reason: collision with root package name */
        public int f44214q;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44212o = obj;
            this.f44214q |= Integer.MIN_VALUE;
            return TriggersRepository.this.L(null, null, null, this);
        }
    }

    public /* synthetic */ TriggersRepository(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static final TriggerResponse G(TriggersRepository triggersRepository, Rf.a aVar, String str) {
        TriggerResponse d10;
        HashMap c10;
        Lf.b A10 = triggersRepository.A(Qf.a.a(aVar));
        if (aVar != Rf.a.PerformedCustomAction) {
            return (A10 == null || (d10 = A10.d()) == null) ? triggersRepository.C() : d10;
        }
        if (A10 == null || (c10 = A10.c()) == null) {
            return null;
        }
        return (TriggerResponse) c10.get(str);
    }

    public static final TriggersRepository y(Application application) {
        return f44142g.a(application);
    }

    public final Lf.b A(Lf.a aVar) {
        Lf.b bVar = (Lf.b) t().x().get(aVar);
        if (bVar != null) {
            return bVar;
        }
        if (aVar == Lf.a.Clicked) {
            return new Lf.b(C(), null, 2, null);
        }
        return null;
    }

    public final Mf.a B() {
        return (Mf.a) this.f44147c.getValue();
    }

    public final TriggerResponse C() {
        String str = (String) u().M(De.a.WidgetInteractionTriggerData, null).b();
        if (str != null) {
            return (TriggerResponse) AbstractC5895g.b(x(), str, TriggerResponse.class);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Trigger trigger, Rf.a aVar, String str, boolean z10, TriggerResponse triggerResponse, String str2, long j10, boolean z11, Continuation continuation) {
        i iVar;
        int i10;
        Rf.a aVar2;
        String str3;
        com.google.gson.k d10;
        com.google.gson.k d11;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f44172q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f44172q = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f44170o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar.f44172q;
                boolean z12 = true;
                if (i10 == 0) {
                    if (i10 == 1 || i10 == 2) {
                        String str4 = (String) iVar.f44169n;
                        ResultKt.throwOnFailure(obj);
                        return str4;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                boolean isEmpty = LiveChatUtil.getAllOpenChatIds().isEmpty();
                WaitingChatDetails D10 = Tf.b.D(str2);
                if (!z10 && !isEmpty && D10 == null) {
                    z12 = false;
                }
                trigger.getAction();
                Trigger.Type type = Trigger.Type.SendChatInvite;
                if (type == null && z12) {
                    if (str2 == null) {
                        UUID.randomUUID().toString();
                    }
                    new Intent(this.f44145a, (Class<?>) TriggerReceiver.class);
                    x();
                    trigger.getAction();
                    throw null;
                }
                if (trigger.getType() == type && trigger.getParams() != null && z12) {
                    String uuid = str2 == null ? UUID.randomUUID().toString() : str2;
                    Intent intent = new Intent(this.f44145a, (Class<?>) TriggerReceiver.class);
                    com.google.gson.h B10 = x().B(triggerResponse.getParams());
                    if (B10 == null || (d10 = AbstractC5896h.d(B10)) == null) {
                        aVar2 = aVar;
                        str3 = null;
                    } else {
                        if (trigger.getParams().getMessageList() != null) {
                            Gson x10 = x();
                            com.google.gson.h params = triggerResponse.getParams();
                            d10.m("msglist", x10.B((params == null || (d11 = AbstractC5896h.d(params)) == null) ? null : d11.r("msg_list")));
                            if (d10.t("msg_list")) {
                                d10.v("msg_list");
                            }
                        }
                        Trigger.Params.Attender attender = trigger.getParams().getAttender();
                        if (attender != null) {
                            String displayName = attender.getDisplayName();
                            if (displayName != null) {
                                d10.p("dname", displayName);
                            }
                            String id2 = attender.getId();
                            if (id2 != null) {
                                d10.p("attender", id2);
                            }
                            String sender = attender.getSender();
                            if (sender != null) {
                                d10.p("sender", sender);
                            }
                            Boolean isBot = attender.isBot();
                            if (isBot != null) {
                                d10.n("is_bot", Boxing.boxBoolean(isBot.booleanValue()));
                            }
                        }
                        d10.p("triggerid", trigger.getMatchedRuleId());
                        com.google.gson.h params2 = triggerResponse.getParams();
                        if (params2 != null) {
                            d10.m("trigger_data", params2);
                        }
                        d10.p("encrypted_visitor_info", trigger.getEncryptedVisitorInfo());
                        aVar2 = aVar;
                        d10.p("action_type", Rf.a.Companion.b(aVar2));
                        if (str != null) {
                            d10.p("custom_action_name", str);
                        }
                        d10.o("delay", trigger.getDelay());
                        Unit unit = Unit.INSTANCE;
                        str3 = d10.toString();
                    }
                    intent.putExtra("triggerinfo", str3);
                    intent.putExtra("has_custom_chat_id", z10);
                    if (str2 != null) {
                        intent.putExtra("acknowledgement_key", str2);
                    }
                    intent.putExtra("type", 16);
                    if (!z11 && RangesKt.coerceAtLeast(og.i.r(trigger.getDelay()) - j10, 0L) > 1000) {
                        I(this.f44145a, aVar2, str, intent, og.i.r(trigger.getDelay()));
                        return uuid;
                    }
                    iVar.f44169n = uuid;
                    iVar.f44172q = 2;
                    if (E(intent, iVar) != coroutine_suspended) {
                        return uuid;
                    }
                } else {
                    trigger.getAction();
                    if (Trigger.Type.InvokeJSApi != null) {
                        return null;
                    }
                    Type type2 = new TypeToken<HashMap<String, Object>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$handleSuccess$mapType$1
                    }.getType();
                    Intent intent2 = new Intent(this.f44145a, (Class<?>) TriggerReceiver.class);
                    Gson x11 = x();
                    String v10 = x().v(trigger.getVisitorInfo());
                    Intrinsics.checkNotNull(type2);
                    if (((HashMap) AbstractC5895g.c(x11, v10, type2)) != null) {
                        trigger.getAction();
                        throw null;
                    }
                    intent2.putExtra("triggerinfo", (Serializable) null);
                    if (str != null) {
                        intent2.putExtra("custom_action_name", str);
                    }
                    intent2.putExtra("triggerid", trigger.getMatchedRuleId());
                    intent2.putExtra("type", 10);
                    if (!z11) {
                        trigger.getAction();
                        throw null;
                    }
                    iVar.f44172q = 3;
                    if (E(intent2, iVar) != coroutine_suspended) {
                        return null;
                    }
                }
                return coroutine_suspended;
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f44170o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar.f44172q;
        boolean z122 = true;
        if (i10 == 0) {
        }
    }

    public final Object E(Intent intent, Continuation continuation) {
        int intExtra = intent.getIntExtra("type", 0);
        String stringExtra = intent.getStringExtra("triggerid");
        Hashtable hashtable = new Hashtable();
        if (intExtra == 10) {
            Serializable serializableExtra = intent.getSerializableExtra("triggerinfo");
            HashMap hashMap = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
            if (hashMap != null) {
                hashtable.putAll(hashMap);
            }
        } else {
            Object d10 = AbstractC6574b.d(intent.getStringExtra("triggerinfo"));
            Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type java.util.Hashtable<kotlin.String, kotlin.Any?>");
            hashtable = (Hashtable) d10;
        }
        Hashtable hashtable2 = hashtable;
        if (stringExtra != null) {
            hashtable2.put("triggerid", stringExtra);
        }
        Object h10 = w().h(intExtra, intent.getStringExtra("acknowledgement_key"), intent.getBooleanExtra("has_custom_chat_id", false), hashtable2, continuation);
        return h10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? h10 : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r3v24, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(VTSTriggerResponse.Triggers triggers, String str, com.google.gson.k kVar, boolean z10, boolean z11, Continuation continuation) {
        j jVar;
        TriggersRepository triggersRepository;
        int i10;
        Ref.ObjectRef objectRef;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        T t10;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f44180u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f44180u = i11 - Integer.MIN_VALUE;
                triggersRepository = this;
                j jVar2 = jVar;
                Object obj = jVar2.f44178s;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = jVar2.f44180u;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = str;
                    booleanRef = new Ref.BooleanRef();
                    objectRef2 = new Ref.ObjectRef();
                    objectRef3 = new Ref.ObjectRef();
                    Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$handleTriggerMessage$mapType$1
                    }.getType();
                    Gson x10 = triggersRepository.x();
                    String value = triggers.getValue();
                    Intrinsics.checkNotNull(type);
                    Map map = (Map) AbstractC5895g.c(x10, value, type);
                    if (map != null) {
                        WaitingChatDetails D10 = Tf.b.D((String) objectRef.element);
                        Map mutableMap = MapsKt.toMutableMap(map);
                        String triggerId = triggers.getTriggerId();
                        if (triggerId != null) {
                            mutableMap.put("triggerid", triggerId);
                        }
                        Hashtable hashtable = new Hashtable(mutableMap);
                        Object obj2 = hashtable.get("departments");
                        Object obj3 = null;
                        ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                        if (arrayList != null) {
                            if (arrayList.size() <= 1) {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                List d10 = AbstractC3945n.d();
                                if ((D10 != null ? D10.getDepartmentName() : null) != null) {
                                    Intrinsics.checkNotNull(d10);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : d10) {
                                        if (CollectionsKt.contains(arrayList, ((Channel.Department) obj4).getId())) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    Iterator it = arrayList2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        Channel.Department department = (Channel.Department) next;
                                        LiveChatUtil.log("UTSRepository departments check: " + department.getId() + ' ' + department.getName());
                                        if (StringsKt.equals(D10.getDepartmentName(), department.getName(), true)) {
                                            obj3 = next;
                                            break;
                                        }
                                    }
                                    LiveChatUtil.log("UTSRepository departments: " + ((Channel.Department) obj3));
                                    booleanRef.element = obj3 == null;
                                    we.d dVar = we.d.f67674y;
                                    objectRef2.element = dVar.b();
                                    objectRef3.element = Boxing.boxInt(dVar.a());
                                }
                            }
                        }
                        if (!z11 || !booleanRef.element) {
                            Ne.b w10 = triggersRepository.w();
                            int n10 = og.i.n(triggers.getType());
                            String str2 = (String) objectRef.element;
                            jVar2.f44173n = objectRef;
                            jVar2.f44174o = booleanRef;
                            jVar2.f44175p = objectRef2;
                            jVar2.f44176q = objectRef3;
                            jVar2.f44177r = objectRef;
                            jVar2.f44180u = 1;
                            Object s10 = w10.s(n10, str2, z10, hashtable, jVar2);
                            if (s10 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef4 = objectRef;
                            objectRef5 = objectRef4;
                            t10 = s10;
                            booleanRef2 = booleanRef;
                            objectRef6 = objectRef2;
                            objectRef7 = objectRef3;
                        }
                    }
                    return new Pair(objectRef.element, new Triple(Boxing.boxBoolean(booleanRef.element), objectRef2.element, objectRef3.element));
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef4 = (Ref.ObjectRef) jVar2.f44177r;
                objectRef7 = (Ref.ObjectRef) jVar2.f44176q;
                objectRef6 = (Ref.ObjectRef) jVar2.f44175p;
                booleanRef2 = (Ref.BooleanRef) jVar2.f44174o;
                objectRef5 = (Ref.ObjectRef) jVar2.f44173n;
                ResultKt.throwOnFailure(obj);
                t10 = obj;
                objectRef4.element = t10;
                objectRef3 = objectRef7;
                objectRef2 = objectRef6;
                booleanRef = booleanRef2;
                objectRef = objectRef5;
                return new Pair(objectRef.element, new Triple(Boxing.boxBoolean(booleanRef.element), objectRef2.element, objectRef3.element));
            }
        }
        triggersRepository = this;
        jVar = triggersRepository.new j(continuation);
        j jVar22 = jVar;
        Object obj5 = jVar22.f44178s;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = jVar22.f44180u;
        if (i10 != 0) {
        }
        objectRef4.element = t10;
        objectRef3 = objectRef7;
        objectRef2 = objectRef6;
        booleanRef = booleanRef2;
        objectRef = objectRef5;
        return new Pair(objectRef.element, new Triple(Boxing.boxBoolean(booleanRef.element), objectRef2.element, objectRef3.element));
    }

    public final void H(Rf.a actionType, String str) {
        List list;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        String str2 = (String) u().M(De.a.TriggersAlarmsData, null).b();
        if (str2 != null) {
            Type type = new TypeToken<EnumMap<Rf.a, List<? extends TriggerAlarm>>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$removeTriggerAlarm$mapType$1
            }.getType();
            Gson x10 = x();
            Intrinsics.checkNotNull(type);
            EnumMap enumMap = (EnumMap) AbstractC5895g.c(x10, str2, type);
            if (str != null) {
                if (enumMap != null && (list = (List) enumMap.get(actionType)) != null) {
                    List mutableList = CollectionsKt.toMutableList((Collection) list);
                    Iterator it = mutableList.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        } else if (Intrinsics.areEqual(((TriggerAlarm) it.next()).getCustomActionName(), str)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 > -1) {
                        mutableList.remove(i10);
                    }
                    if (mutableList.isEmpty()) {
                        enumMap.remove(actionType);
                    } else {
                        enumMap.put((EnumMap) actionType, (Rf.a) mutableList);
                    }
                }
            } else if (enumMap != null) {
            }
            u().k0(De.a.TriggersAlarmsData, x().v(enumMap), true);
        }
    }

    public final void I(Application application, Rf.a aVar, String str, Intent intent, long j10) {
        Object m147constructorimpl;
        long currentTimeMillis = System.currentTimeMillis() + j10;
        intent.putExtra("request_code", currentTimeMillis);
        intent.setAction("com.zoho.salesiq.action.TRIGGER");
        intent.setData(Uri.parse("siq://mobilisten/trigger/" + currentTimeMillis));
        Object systemService = application.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        AbstractC5338c.checkSelfPermission(application, "android.permission.POST_NOTIFICATIONS");
        try {
            Result.Companion companion = Result.INSTANCE;
            alarmManager.setExact(0, currentTimeMillis, PendingIntent.getBroadcast(application, 1000, intent, 201326592));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AlarmTiming: ");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            date.setTime(currentTimeMillis);
            Unit unit = Unit.INSTANCE;
            sb2.append(simpleDateFormat.format(date));
            LiveChatUtil.log(sb2.toString());
            K(aVar, str, currentTimeMillis);
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

    public final void J(Rf.a actionType, String str) {
        EnumMap enumMap;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        LiveChatUtil.log("TriggerRepository: EVI updateEncryptedVisitorInfo " + actionType + ' ' + str);
        if (str == null) {
            return;
        }
        Ae.a u10 = u();
        De.a aVar = De.a.TriggerEncryptedVisitorInfo;
        String str2 = (String) u10.M(aVar, null).b();
        if (str2 != null) {
            Type type = new TypeToken<EnumMap<Rf.a, Rf.b>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$updateEncryptedVisitorInfo$mapType$1
            }.getType();
            Gson x10 = x();
            Intrinsics.checkNotNull(type);
            enumMap = (EnumMap) AbstractC5895g.c(x10, str2, type);
            if (enumMap == null) {
                enumMap = new EnumMap(Rf.a.class);
            }
        } else {
            enumMap = new EnumMap(Rf.a.class);
        }
        enumMap.put((EnumMap) actionType, (Rf.a) new Rf.b(rd.b.f(), str));
        u().k0(aVar, x().v(enumMap), true);
        LiveChatUtil.log("TriggerRepository: EVI updateEncryptedVisitorInfo success");
    }

    public final void K(Rf.a actionType, String str, long j10) {
        EnumMap enumMap;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Ae.a u10 = u();
        De.a aVar = De.a.TriggersAlarmsData;
        String str2 = (String) u10.M(aVar, null).b();
        if (str2 != null) {
            Type type = new TypeToken<EnumMap<Rf.a, List<? extends TriggerAlarm>>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$updateTriggerAlarms$mapType$1
            }.getType();
            Gson x10 = x();
            Intrinsics.checkNotNull(type);
            enumMap = (EnumMap) AbstractC5895g.c(x10, str2, type);
            if (enumMap != null) {
                List list = (List) enumMap.get(actionType);
                List mutableList = list != null ? CollectionsKt.toMutableList((Collection) list) : null;
                if (mutableList == null) {
                    mutableList = new ArrayList();
                }
                mutableList.add(new TriggerAlarm(Long.valueOf(j10), str));
                enumMap.put((EnumMap) actionType, (Rf.a) mutableList);
            } else {
                enumMap = new EnumMap(Rf.a.class);
                enumMap.put((EnumMap) actionType, (Rf.a) CollectionsKt.listOf(new TriggerAlarm(Long.valueOf(j10), str)));
            }
        } else {
            enumMap = new EnumMap(Rf.a.class);
            enumMap.put((EnumMap) actionType, (Rf.a) CollectionsKt.listOf(new TriggerAlarm(Long.valueOf(j10), str)));
        }
        u().k0(aVar, x().v(enumMap), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r1 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(String str, String str2, String str3, Continuation continuation) {
        n nVar;
        int i10;
        int i11;
        String str4;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i12 = nVar.f44214q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f44214q = i12 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj = nVar2.f44212o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = nVar2.f44214q;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                        SalesIQResponse salesIQResponse = (SalesIQResponse) obj;
                        TriggerAcknowledgementResponse triggerAcknowledgementResponse = (TriggerAcknowledgementResponse) salesIQResponse.getData();
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, triggerAcknowledgementResponse != null ? triggerAcknowledgementResponse.getEncryptedObject() : null, null, 0, false, null, null, null, 126, null));
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) nVar2.f44211n;
                    ResultKt.throwOnFailure(obj);
                    i11 = 2;
                    return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str4), false, i11, null);
                }
                ResultKt.throwOnFailure(obj);
                String I10 = u().I();
                String f10 = u().f();
                if (I10 == null || f10 == null) {
                    i11 = 2;
                    String str5 = "The following variable(s) must not be null for open conversation: " + z(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(I10, "screenName"), new Pair(f10, "avuid")}));
                    C4377a v10 = v();
                    b.j jVar = new b.j("initiate_trigger_new");
                    nVar2.f44211n = str5;
                    nVar2.f44214q = 2;
                    if (v10.b(jVar, nVar2) != coroutine_suspended) {
                        str4 = str5;
                        return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str4), false, i11, null);
                    }
                } else {
                    Mf.a B10 = B();
                    nVar2.f44214q = 1;
                    obj = B10.g(I10, f10, str, str2, str3, nVar2);
                }
                return coroutine_suspended;
            }
        }
        nVar = new n(continuation);
        n nVar22 = nVar;
        Object obj2 = nVar22.f44212o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = nVar22.f44214q;
        if (i10 == 0) {
        }
    }

    @Override // Pf.a
    public C5582a a(Rf.a actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Ae.a u10 = u();
        De.a aVar = De.a.TriggerEncryptedVisitorInfo;
        String str = (String) u10.M(aVar, null).b();
        if (str != null) {
            Type type = new TypeToken<EnumMap<Rf.a, Rf.b>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$removeEncryptedVisitorInfo$mapType$1
            }.getType();
            Gson x10 = x();
            Intrinsics.checkNotNull(type);
            EnumMap enumMap = (EnumMap) AbstractC5895g.c(x10, str, type);
            if (enumMap != null) {
            }
            u().k0(aVar, x().v(enumMap), true);
        }
        return C5582a.C0817a.e(C5582a.f56502b, null, 1, null);
    }

    @Override // Pf.a
    public C5582a c() {
        String str = (String) u().M(De.a.TriggersAlarmsData, null).b();
        if (str != null) {
            Type type = new TypeToken<EnumMap<Rf.a, List<? extends TriggerAlarm>>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$cancelAndClearAllScheduledTriggers$mapType$1
            }.getType();
            Gson x10 = x();
            Intrinsics.checkNotNull(type);
            EnumMap enumMap = (EnumMap) AbstractC5895g.c(x10, str, type);
            if (enumMap != null) {
                Iterator it = enumMap.entrySet().iterator();
                while (it.hasNext()) {
                    List<TriggerAlarm> list = (List) ((Map.Entry) it.next()).getValue();
                    if (list != null) {
                        Intrinsics.checkNotNull(list);
                        for (TriggerAlarm triggerAlarm : list) {
                        }
                    }
                }
            }
            u().m0(Ce.a.a(De.a.TriggersAlarmsData));
        }
        return C5582a.f56502b.d(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    @Override // Pf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5582a d(Rf.a actionType, String str, c.a dataSource) {
        TriggerResponse d10;
        Trigger a10;
        HashMap c10;
        TriggerResponse C10;
        HashMap c11;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Lf.b bVar = (Lf.b) t().x().get(Qf.a.a(actionType));
        int i10 = c.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                TriggerResponse C11 = actionType == Rf.a.Clicked ? C() : null;
                if (C11 != null) {
                    a10 = Qf.b.a(C11, x());
                }
                a10 = null;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (actionType == Rf.a.PerformedCustomAction) {
                    if (bVar != null && (c11 = bVar.c()) != null) {
                        C10 = (TriggerResponse) c11.get(str);
                        if (C10 != null) {
                            a10 = Qf.b.a(C10, x());
                        }
                        a10 = null;
                    }
                    C10 = null;
                    if (C10 != null) {
                    }
                    a10 = null;
                } else {
                    if (bVar == null || (C10 = bVar.d()) == null) {
                        if (actionType == Rf.a.Clicked) {
                            C10 = C();
                        }
                        C10 = null;
                    }
                    if (C10 != null) {
                    }
                    a10 = null;
                }
            }
        } else if (actionType == Rf.a.PerformedCustomAction) {
            if (bVar != null && (c10 = bVar.c()) != null) {
                d10 = (TriggerResponse) c10.get(str);
                if (d10 != null) {
                    a10 = Qf.b.a(d10, x());
                }
                a10 = null;
            }
            d10 = null;
            if (d10 != null) {
            }
            a10 = null;
        } else {
            if (bVar != null) {
                d10 = bVar.d();
                if (d10 != null) {
                }
                a10 = null;
            }
            d10 = null;
            if (d10 != null) {
            }
            a10 = null;
        }
        return (bVar != null || (a10 != null && actionType == Rf.a.Clicked)) ? a10 != null ? C5582a.f56502b.d(a10) : C5582a.f56502b.d(null) : C5582a.f56502b.b(new C5582a.b("Trigger not found", null, null, 6, null));
    }

    @Override // Pf.a
    public C5582a e() {
        return C5582a.f56502b.d(Boolean.valueOf(t().C()));
    }

    @Override // Pf.a
    public C5582a f(Rf.a actionType) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        String str = (String) u().M(De.a.TriggerEncryptedVisitorInfo, null).b();
        if (str == null) {
            return C5582a.f56502b.d(null);
        }
        Type type = new TypeToken<EnumMap<Rf.a, Rf.b>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$getEncryptedVisitorInfo$mapType$1
        }.getType();
        C5582a.C0817a c0817a = C5582a.f56502b;
        Gson x10 = x();
        Intrinsics.checkNotNull(type);
        EnumMap enumMap = (EnumMap) AbstractC5895g.c(x10, str, type);
        C5582a d10 = c0817a.d(enumMap != null ? (Rf.b) enumMap.get(actionType) : null);
        try {
            Result.Companion companion = Result.INSTANCE;
            Rf.b bVar = (Rf.b) d10.b();
            if (bVar != null) {
                bVar.a();
            }
            m147constructorimpl = Result.m147constructorimpl(d10);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m150exceptionOrNullimpl(m147constructorimpl) != null) {
            AbstractC1459k.d(C6461a.f65810a.e(), null, null, new g(d10, null), 3, null);
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        C5582a c5582a = (C5582a) m147constructorimpl;
        return c5582a == null ? C5582a.f56502b.d(null) : c5582a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [T, java.lang.Object] */
    @Override // Pf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(String str, String str2, boolean z10, boolean z11, Continuation continuation) {
        l lVar;
        int i10;
        String str3;
        TriggersRepository triggersRepository;
        T t10;
        boolean z12;
        boolean z13;
        SalesIQResponse salesIQResponse;
        Ref.ObjectRef objectRef;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        SalesIQResponse salesIQResponse2;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i11 = lVar.f44209w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f44209w = i11 - Integer.MIN_VALUE;
                l lVar2 = lVar;
                Object obj = lVar2.f44207u;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = lVar2.f44209w;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String I10 = u().I();
                    String Y10 = u().Y();
                    if (I10 == null || Y10 == null) {
                        String str4 = "The following variable(s) must not be null for open conversation: " + z(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(I10, "screenName"), new Pair(Y10, "zldt")}));
                        C4377a v10 = v();
                        b.j jVar = new b.j("initiate_trigger");
                        lVar2.f44200n = str4;
                        lVar2.f44209w = 3;
                        if (v10.b(jVar, lVar2) != coroutine_suspended) {
                            str3 = str4;
                            return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str3), false, 2, null);
                        }
                    } else {
                        Mf.a B10 = B();
                        lVar2.f44200n = this;
                        lVar2.f44201o = str2;
                        lVar2.f44205s = z10;
                        lVar2.f44206t = z11;
                        lVar2.f44209w = 1;
                        obj = B10.f(I10, Y10, lVar2);
                        if (obj != coroutine_suspended) {
                            triggersRepository = this;
                            t10 = str2;
                            z12 = z10;
                            z13 = z11;
                            salesIQResponse = (SalesIQResponse) obj;
                            objectRef = new Ref.ObjectRef();
                            objectRef.element = t10;
                            booleanRef = new Ref.BooleanRef();
                            objectRef2 = new Ref.ObjectRef();
                            objectRef3 = new Ref.ObjectRef();
                            if (salesIQResponse.getIsSuccess()) {
                            }
                            if (!booleanRef.element) {
                            }
                            if (r10 == null) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) lVar2.f44200n;
                        ResultKt.throwOnFailure(obj);
                        return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str3), false, 2, null);
                    }
                    salesIQResponse2 = (SalesIQResponse) lVar2.f44204r;
                    objectRef6 = (Ref.ObjectRef) lVar2.f44203q;
                    objectRef5 = (Ref.ObjectRef) lVar2.f44202p;
                    booleanRef2 = (Ref.BooleanRef) lVar2.f44201o;
                    objectRef4 = (Ref.ObjectRef) lVar2.f44200n;
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) obj;
                    booleanRef2.element = ((Boolean) ((Triple) pair.getSecond()).getFirst()).booleanValue();
                    objectRef5.element = ((Triple) pair.getSecond()).getSecond();
                    objectRef6.element = ((Triple) pair.getSecond()).getThird();
                    objectRef4.element = pair.getFirst();
                    salesIQResponse = salesIQResponse2;
                    objectRef3 = objectRef6;
                    objectRef2 = objectRef5;
                    booleanRef = booleanRef2;
                    objectRef = objectRef4;
                    C5582a c10 = !booleanRef.element ? com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, (String) objectRef.element, null, 0, false, null, null, null, 126, null)) : null;
                    return c10 == null ? C5582a.f56502b.b(new C5582a.b((String) objectRef2.element, (Integer) objectRef3.element, null, 4, null)) : c10;
                }
                boolean z14 = lVar2.f44206t;
                boolean z15 = lVar2.f44205s;
                String str5 = (String) lVar2.f44201o;
                TriggersRepository triggersRepository2 = (TriggersRepository) lVar2.f44200n;
                ResultKt.throwOnFailure(obj);
                z13 = z14;
                triggersRepository = triggersRepository2;
                z12 = z15;
                t10 = str5;
                salesIQResponse = (SalesIQResponse) obj;
                objectRef = new Ref.ObjectRef();
                objectRef.element = t10;
                booleanRef = new Ref.BooleanRef();
                objectRef2 = new Ref.ObjectRef();
                objectRef3 = new Ref.ObjectRef();
                if (salesIQResponse.getIsSuccess()) {
                    VTSTriggerResponse vTSTriggerResponse = (VTSTriggerResponse) salesIQResponse.getData();
                    LiveChatUtil.log("UTSRepository initiateTrigger onSuccess");
                    com.google.gson.h B11 = triggersRepository.x().B(vTSTriggerResponse.getTriggers());
                    Intrinsics.checkNotNullExpressionValue(B11, "toJsonTree(...)");
                    com.google.gson.k d10 = AbstractC5896h.d(B11);
                    VTSTriggerResponse.Triggers triggers = vTSTriggerResponse.getTriggers();
                    if (triggers != null) {
                        if (d10 != null) {
                            d10.p("triggerid", triggers.getTriggerId());
                        }
                        String str6 = (String) objectRef.element;
                        lVar2.f44200n = objectRef;
                        lVar2.f44201o = booleanRef;
                        lVar2.f44202p = objectRef2;
                        lVar2.f44203q = objectRef3;
                        lVar2.f44204r = salesIQResponse;
                        lVar2.f44209w = 2;
                        Object F10 = triggersRepository.F(triggers, str6, d10, z12, z13, lVar2);
                        if (F10 != coroutine_suspended) {
                            salesIQResponse2 = salesIQResponse;
                            obj = F10;
                            objectRef4 = objectRef;
                            booleanRef2 = booleanRef;
                            objectRef5 = objectRef2;
                            objectRef6 = objectRef3;
                            Pair pair2 = (Pair) obj;
                            booleanRef2.element = ((Boolean) ((Triple) pair2.getSecond()).getFirst()).booleanValue();
                            objectRef5.element = ((Triple) pair2.getSecond()).getSecond();
                            objectRef6.element = ((Triple) pair2.getSecond()).getThird();
                            objectRef4.element = pair2.getFirst();
                            salesIQResponse = salesIQResponse2;
                            objectRef3 = objectRef6;
                            objectRef2 = objectRef5;
                            booleanRef = booleanRef2;
                            objectRef = objectRef4;
                        }
                        return coroutine_suspended;
                    }
                }
                if (!booleanRef.element) {
                }
                if (c10 == null) {
                }
            }
        }
        lVar = new l(continuation);
        l lVar22 = lVar;
        Object obj2 = lVar22.f44207u;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = lVar22.f44209w;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e1, code lost:
    
        if (r2 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0319, code lost:
    
        android.util.Log.i("okhttp.OkHttpClient", "Trigger already scheduled");
        com.zoho.livechat.android.utils.LiveChatUtil.log("Trigger already scheduled");
        r1 = me.C5582a.f56502b;
        r3 = we.d.f67625G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x034b, code lost:
    
        return r1.b(new me.C5582a.b(r3.b(), kotlin.coroutines.jvm.internal.Boxing.boxInt(r3.a()), null, 4, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0317, code lost:
    
        if (r2 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x06a8, code lost:
    
        if (r5 == r2) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0734 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerResponse] */
    @Override // Pf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Continuation continuation) {
        k kVar;
        int i10;
        String str6;
        String str7;
        String str8;
        String str9;
        Rf.a aVar2;
        String str10;
        int i11;
        boolean z16;
        Object obj;
        C4377a v10;
        b.j jVar;
        String str11;
        char c10;
        int i12;
        String str12;
        String a10;
        Rf.a aVar3;
        int i13;
        char c11;
        Object obj2;
        String str13;
        boolean z17;
        Rf.a aVar4;
        com.google.gson.k y10;
        String str14;
        com.google.gson.k kVar2;
        Rf.a aVar5;
        Object e10;
        Object obj3;
        TriggersRepository triggersRepository;
        Rf.a aVar6;
        String str15;
        String str16;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Object obj4;
        int i14;
        boolean z23;
        String str17;
        String str18;
        Unit unit;
        TriggersRepository triggersRepository2;
        SalesIQResponse e11;
        Rf.a aVar7;
        int i15;
        boolean z24;
        SalesIQResponse salesIQResponse;
        Object obj5;
        boolean z25;
        boolean z26;
        String str19;
        int i16;
        boolean z27;
        boolean z28;
        boolean z29;
        String str20;
        boolean z30;
        boolean z31;
        String str21;
        Rf.a aVar8;
        int i17;
        boolean z32;
        boolean z33;
        Rf.a aVar9;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        Lf.b bVar;
        TriggersRepository triggersRepository3;
        boolean z39;
        String str22;
        String str23;
        String str24;
        Rf.a aVar10;
        SalesIQResponse salesIQResponse2;
        boolean z40;
        boolean z41;
        HashMap hashMap;
        boolean z42;
        List list;
        k kVar3;
        boolean z43;
        int i18;
        TriggersRepository triggersRepository4;
        char c12;
        C5582a c13;
        Object h10;
        List list2;
        Iterator it;
        TriggersRepository triggersRepository5;
        C5582a c5582a;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i19 = kVar.f44186F;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                kVar.f44186F = i19 - Integer.MIN_VALUE;
                k kVar4 = kVar;
                Object obj6 = kVar4.f44184D;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = kVar4.f44186F;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj6);
                    String I10 = u().I();
                    String f10 = u().f();
                    String h11 = u().h();
                    if (Channel.INSTANCE.a(u().r()) && aVar != Rf.a.PerformedCustomAction) {
                        return C5582a.f56502b.b(new C5582a.b("Tracking is enabled", null, null, 6, null));
                    }
                    LiveChatUtil.log("TriggerRepository: initiateTrigger " + aVar + ' ' + str + ' ' + str2 + ' ' + str3 + ' ' + str4 + ' ' + str5 + ' ' + z10 + ' ' + z11 + ' ' + z12 + ' ' + z13);
                    Rf.a aVar11 = Rf.a.AccessedAnyPageOnApp;
                    if (aVar == aVar11) {
                        Rf.b bVar2 = (Rf.b) f(Rf.a.LandedOnApp).b();
                        if ((bVar2 != null ? bVar2.a() : null) == null) {
                            if (this.f44150f == null) {
                                this.f44150f = new ArrayList();
                            }
                            List list3 = this.f44150f;
                            if (list3 != null) {
                                Boxing.boxBoolean(list3.add(new b(aVar, str, str2, str3, str4, str5, z10, z11, z12, z13, z15)));
                            }
                            LiveChatUtil.log("TriggerRepository: EVI AccessAnyPageOnWebsite added to queue");
                            C5582a.C0817a c0817a = C5582a.f56502b;
                            we.d dVar = we.d.f67626H;
                            return c0817a.b(new C5582a.b(dVar.b(), Boxing.boxInt(dVar.a()), null, 4, null));
                        }
                        str6 = str;
                        str7 = str3;
                        str8 = str4;
                        str9 = str5;
                        aVar2 = aVar;
                        str10 = str2;
                    } else {
                        str6 = str;
                        str7 = str3;
                        str8 = str4;
                        str9 = str5;
                        aVar2 = aVar;
                        str10 = str2;
                        if (aVar2 == Rf.a.LandedOnApp && AbstractC5891c.d(this.f44150f)) {
                            i11 = 1;
                            if (I10 != null || f10 == null || h11 == null) {
                                z16 = false;
                                obj = null;
                                String str25 = "The following variable(s) must not be null for open conversation: " + z(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(I10, "screenName"), new Pair(f10, "avuid")}));
                                v10 = v();
                                jVar = new b.j("initiate_trigger_new");
                                kVar4.f44187n = str25;
                                kVar4.f44186F = 5;
                                if (v10.b(jVar, kVar4) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str11 = str25;
                                return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str11), z16, 2, obj);
                            }
                            if (aVar2 == aVar11) {
                                Rf.b bVar3 = (Rf.b) f(aVar).b();
                                a10 = bVar3 != null ? bVar3.a() : null;
                                Rf.b bVar4 = (Rf.b) f(Rf.a.LandedOnApp).b();
                                String a11 = bVar4 != null ? bVar4.a() : null;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("TriggerRepository: EVI ");
                                sb2.append(aVar2);
                                c10 = ' ';
                                sb2.append(' ');
                                sb2.append(a11);
                                LiveChatUtil.log(sb2.toString());
                                if (a10 == null) {
                                    i12 = i11;
                                    str12 = a11;
                                    aVar3 = Rf.a.LandedOnApp;
                                    Rf.a aVar12 = aVar2 != aVar3 ? aVar11 : aVar2;
                                    if (aVar2 != aVar3) {
                                        str13 = f10;
                                        i13 = i12;
                                        z17 = z10;
                                        c11 = c10;
                                        obj2 = coroutine_suspended;
                                        aVar4 = aVar12;
                                        TriggerAlarm triggerAlarm = (TriggerAlarm) Pf.a.b(this, aVar3, null, null, 4, null).b();
                                        if (triggerAlarm != null) {
                                            if (og.i.r(triggerAlarm.getTime()) < System.currentTimeMillis()) {
                                                H(aVar3, null);
                                            }
                                        }
                                        triggerAlarm = null;
                                    } else {
                                        i13 = i12;
                                        c11 = c10;
                                        obj2 = coroutine_suspended;
                                        str13 = f10;
                                        z17 = z10;
                                        aVar4 = aVar12;
                                    }
                                    if (aVar2 == aVar11) {
                                        TriggerAlarm triggerAlarm2 = (TriggerAlarm) Pf.a.b(this, aVar11, null, null, 4, null).b();
                                        if (triggerAlarm2 != null) {
                                            if (og.i.r(triggerAlarm2.getTime()) < System.currentTimeMillis()) {
                                                H(aVar11, null);
                                            }
                                        }
                                        triggerAlarm2 = null;
                                    }
                                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                    if (z12) {
                                        ?? G10 = G(this, aVar4, str6);
                                        if (G10 != 0) {
                                            objectRef.element = G10;
                                            unit = Unit.INSTANCE;
                                        } else {
                                            unit = null;
                                        }
                                        if (unit != null) {
                                            z19 = z12;
                                            z20 = z13;
                                            z21 = z14;
                                            z22 = z15;
                                            triggersRepository2 = this;
                                            e11 = SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, objectRef.element, 200, false, null, null, Boxing.boxLong(0L), 28, null);
                                            aVar7 = aVar4;
                                            obj3 = obj2;
                                            i15 = i13;
                                            z24 = z11;
                                        }
                                    }
                                    Mf.a B10 = B();
                                    String b10 = Rf.a.Companion.b(aVar4);
                                    String str26 = (z17 && (str6 == null || str6.length() == 0)) ? str12 : null;
                                    String T10 = u().T();
                                    String R10 = u().R();
                                    String U10 = u().U();
                                    y10 = t().y();
                                    if (y10.isEmpty()) {
                                        str14 = U10;
                                        kVar2 = y10;
                                    } else {
                                        str14 = U10;
                                        kVar2 = null;
                                    }
                                    kVar4.f44187n = this;
                                    kVar4.f44188o = str6;
                                    kVar4.f44189p = str10;
                                    kVar4.f44190q = str7;
                                    kVar4.f44191r = str8;
                                    kVar4.f44192s = str9;
                                    kVar4.f44193t = aVar2;
                                    kVar4.f44194u = aVar4;
                                    kVar4.f44196w = z17;
                                    aVar5 = aVar4;
                                    kVar4.f44197x = z11;
                                    kVar4.f44198y = z12;
                                    kVar4.f44199z = z13;
                                    kVar4.f44181A = z14;
                                    kVar4.f44182B = z15;
                                    int i20 = i13;
                                    kVar4.f44183C = i20;
                                    kVar4.f44186F = 1;
                                    e10 = B10.e(I10, h11, str13, b10, str26, str8, str9, T10, R10, str14, str6, kVar2, kVar4);
                                    obj3 = obj2;
                                    if (e10 != obj3) {
                                        return obj3;
                                    }
                                    triggersRepository = this;
                                    aVar6 = aVar;
                                    str15 = str3;
                                    str16 = str4;
                                    str9 = str5;
                                    z18 = z11;
                                    z19 = z12;
                                    z20 = z13;
                                    z21 = z14;
                                    z22 = z15;
                                    obj4 = e10;
                                    i14 = i20;
                                    z23 = z17;
                                    str17 = str;
                                    str18 = str2;
                                    String str27 = str16;
                                    str6 = str17;
                                    z24 = z18;
                                    aVar2 = aVar6;
                                    str8 = str27;
                                    String str28 = str18;
                                    z17 = z23;
                                    str10 = str28;
                                    String str29 = str15;
                                    triggersRepository2 = triggersRepository;
                                    str7 = str29;
                                    e11 = (SalesIQResponse) obj4;
                                    i15 = i14;
                                    aVar7 = aVar5;
                                }
                                str12 = a10;
                                i12 = i11;
                                aVar3 = Rf.a.LandedOnApp;
                                if (aVar2 != aVar3) {
                                }
                                if (aVar2 != aVar3) {
                                }
                                if (aVar2 == aVar11) {
                                }
                                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                if (z12) {
                                }
                                Mf.a B102 = B();
                                String b102 = Rf.a.Companion.b(aVar4);
                                if (z17) {
                                }
                                String T102 = u().T();
                                String R102 = u().R();
                                String U102 = u().U();
                                y10 = t().y();
                                if (y10.isEmpty()) {
                                }
                                kVar4.f44187n = this;
                                kVar4.f44188o = str6;
                                kVar4.f44189p = str10;
                                kVar4.f44190q = str7;
                                kVar4.f44191r = str8;
                                kVar4.f44192s = str9;
                                kVar4.f44193t = aVar2;
                                kVar4.f44194u = aVar4;
                                kVar4.f44196w = z17;
                                aVar5 = aVar4;
                                kVar4.f44197x = z11;
                                kVar4.f44198y = z12;
                                kVar4.f44199z = z13;
                                kVar4.f44181A = z14;
                                kVar4.f44182B = z15;
                                int i202 = i13;
                                kVar4.f44183C = i202;
                                kVar4.f44186F = 1;
                                e10 = B102.e(I10, h11, str13, b102, str26, str8, str9, T102, R102, str14, str6, kVar2, kVar4);
                                obj3 = obj2;
                                if (e10 != obj3) {
                                }
                            } else {
                                c10 = ' ';
                                Rf.b bVar5 = (Rf.b) f(aVar).b();
                                if (bVar5 != null) {
                                    a10 = bVar5.a();
                                    str12 = a10;
                                    i12 = i11;
                                    aVar3 = Rf.a.LandedOnApp;
                                    if (aVar2 != aVar3) {
                                    }
                                    if (aVar2 != aVar3) {
                                    }
                                    if (aVar2 == aVar11) {
                                    }
                                    Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                                    if (z12) {
                                    }
                                    Mf.a B1022 = B();
                                    String b1022 = Rf.a.Companion.b(aVar4);
                                    if (z17) {
                                    }
                                    String T1022 = u().T();
                                    String R1022 = u().R();
                                    String U1022 = u().U();
                                    y10 = t().y();
                                    if (y10.isEmpty()) {
                                    }
                                    kVar4.f44187n = this;
                                    kVar4.f44188o = str6;
                                    kVar4.f44189p = str10;
                                    kVar4.f44190q = str7;
                                    kVar4.f44191r = str8;
                                    kVar4.f44192s = str9;
                                    kVar4.f44193t = aVar2;
                                    kVar4.f44194u = aVar4;
                                    kVar4.f44196w = z17;
                                    aVar5 = aVar4;
                                    kVar4.f44197x = z11;
                                    kVar4.f44198y = z12;
                                    kVar4.f44199z = z13;
                                    kVar4.f44181A = z14;
                                    kVar4.f44182B = z15;
                                    int i2022 = i13;
                                    kVar4.f44183C = i2022;
                                    kVar4.f44186F = 1;
                                    e10 = B1022.e(I10, h11, str13, b1022, str26, str8, str9, T1022, R1022, str14, str6, kVar2, kVar4);
                                    obj3 = obj2;
                                    if (e10 != obj3) {
                                    }
                                } else {
                                    i12 = i11;
                                    str12 = null;
                                    aVar3 = Rf.a.LandedOnApp;
                                    if (aVar2 != aVar3) {
                                    }
                                    if (aVar2 != aVar3) {
                                    }
                                    if (aVar2 == aVar11) {
                                    }
                                    Ref.ObjectRef objectRef222 = new Ref.ObjectRef();
                                    if (z12) {
                                    }
                                    Mf.a B10222 = B();
                                    String b10222 = Rf.a.Companion.b(aVar4);
                                    if (z17) {
                                    }
                                    String T10222 = u().T();
                                    String R10222 = u().R();
                                    String U10222 = u().U();
                                    y10 = t().y();
                                    if (y10.isEmpty()) {
                                    }
                                    kVar4.f44187n = this;
                                    kVar4.f44188o = str6;
                                    kVar4.f44189p = str10;
                                    kVar4.f44190q = str7;
                                    kVar4.f44191r = str8;
                                    kVar4.f44192s = str9;
                                    kVar4.f44193t = aVar2;
                                    kVar4.f44194u = aVar4;
                                    kVar4.f44196w = z17;
                                    aVar5 = aVar4;
                                    kVar4.f44197x = z11;
                                    kVar4.f44198y = z12;
                                    kVar4.f44199z = z13;
                                    kVar4.f44181A = z14;
                                    kVar4.f44182B = z15;
                                    int i20222 = i13;
                                    kVar4.f44183C = i20222;
                                    kVar4.f44186F = 1;
                                    e10 = B10222.e(I10, h11, str13, b10222, str26, str8, str9, T10222, R10222, str14, str6, kVar2, kVar4);
                                    obj3 = obj2;
                                    if (e10 != obj3) {
                                    }
                                }
                            }
                            return obj5;
                        }
                    }
                    i11 = 0;
                    if (I10 != null) {
                    }
                    z16 = false;
                    obj = null;
                    String str252 = "The following variable(s) must not be null for open conversation: " + z(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(I10, "screenName"), new Pair(f10, "avuid")}));
                    v10 = v();
                    jVar = new b.j("initiate_trigger_new");
                    kVar4.f44187n = str252;
                    kVar4.f44186F = 5;
                    if (v10.b(jVar, kVar4) != coroutine_suspended) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                int i21 = kVar4.f44183C;
                                z27 = kVar4.f44196w;
                                TriggersRepository triggersRepository6 = (TriggersRepository) kVar4.f44187n;
                                ResultKt.throwOnFailure(obj6);
                                h10 = obj6;
                                i16 = i21;
                                kVar3 = kVar4;
                                obj5 = coroutine_suspended;
                                z43 = false;
                                z42 = true;
                                list = null;
                                c12 = ' ';
                                triggersRepository4 = triggersRepository6;
                                i18 = 4;
                                c13 = (C5582a) h10;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("TriggerRepository: EVI onSuccess ");
                                sb3.append(i16 != 0 ? z42 : z43);
                                sb3.append(c12);
                                sb3.append(z27);
                                LiveChatUtil.log(sb3.toString());
                                if (i16 != 0 && !z27) {
                                    list2 = triggersRepository4.f44150f;
                                    if (list2 != null) {
                                        it = list2.iterator();
                                        TriggersRepository triggersRepository7 = triggersRepository4;
                                        kVar4 = kVar3;
                                        triggersRepository5 = triggersRepository7;
                                        c5582a = c13;
                                        while (it.hasNext()) {
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                        c13 = c5582a;
                                        triggersRepository4 = triggersRepository5;
                                    }
                                    triggersRepository4.f44150f = list;
                                }
                                return c13;
                            }
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str11 = (String) kVar4.f44187n;
                                ResultKt.throwOnFailure(obj6);
                                z16 = false;
                                obj = null;
                                return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str11), z16, 2, obj);
                            }
                            Iterator it2 = (Iterator) kVar4.f44189p;
                            c5582a = (C5582a) kVar4.f44188o;
                            TriggersRepository triggersRepository8 = (TriggersRepository) kVar4.f44187n;
                            ResultKt.throwOnFailure(obj6);
                            it = it2;
                            triggersRepository5 = triggersRepository8;
                            obj5 = coroutine_suspended;
                            i18 = 4;
                            list = null;
                            while (it.hasNext()) {
                                b bVar6 = (b) it.next();
                                Rf.a b11 = bVar6.b();
                                String f11 = bVar6.f();
                                String d10 = bVar6.d();
                                String a12 = bVar6.a();
                                String e12 = bVar6.e();
                                String h12 = bVar6.h();
                                boolean g10 = bVar6.g();
                                boolean j10 = bVar6.j();
                                boolean i22 = bVar6.i();
                                boolean c14 = bVar6.c();
                                kVar4.f44187n = triggersRepository5;
                                kVar4.f44188o = c5582a;
                                kVar4.f44189p = it;
                                kVar4.f44190q = list;
                                kVar4.f44191r = list;
                                kVar4.f44192s = list;
                                kVar4.f44193t = list;
                                kVar4.f44194u = list;
                                kVar4.f44195v = list;
                                kVar4.f44186F = i18;
                                k kVar5 = kVar4;
                                if (Pf.a.j(triggersRepository5, b11, f11, d10, a12, e12, h12, g10, j10, i22, c14, true, false, kVar5, 2048, null) == obj5) {
                                    return obj5;
                                }
                                kVar4 = kVar5;
                            }
                            Unit unit22 = Unit.INSTANCE;
                            c13 = c5582a;
                            triggersRepository4 = triggersRepository5;
                            triggersRepository4.f44150f = list;
                            return c13;
                        }
                        int i23 = kVar4.f44183C;
                        z27 = kVar4.f44182B;
                        z41 = kVar4.f44181A;
                        z40 = kVar4.f44199z;
                        z36 = kVar4.f44198y;
                        boolean z44 = kVar4.f44197x;
                        z39 = kVar4.f44196w;
                        salesIQResponse2 = (SalesIQResponse) kVar4.f44194u;
                        aVar10 = (Rf.a) kVar4.f44193t;
                        String str30 = (String) kVar4.f44192s;
                        str23 = (String) kVar4.f44191r;
                        str22 = (String) kVar4.f44190q;
                        String str31 = (String) kVar4.f44189p;
                        String str32 = (String) kVar4.f44188o;
                        triggersRepository3 = (TriggersRepository) kVar4.f44187n;
                        ResultKt.throwOnFailure(obj6);
                        i17 = i23;
                        str24 = str30;
                        obj5 = coroutine_suspended;
                        c11 = ' ';
                        str6 = str32;
                        z32 = z44;
                        str10 = str31;
                        Rf.a aVar13 = aVar10;
                        str9 = str24;
                        z35 = z41;
                        aVar9 = aVar13;
                        String str33 = str22;
                        z34 = z39;
                        str19 = str33;
                        z33 = z40;
                        salesIQResponse = salesIQResponse2;
                        str8 = str23;
                        triggersRepository2 = triggersRepository3;
                        boolean z45 = z32;
                        int i24 = i17;
                        z25 = z35;
                        z29 = z45;
                        z28 = z36;
                        i16 = i24;
                        z26 = z34;
                        str20 = str9;
                        z30 = z33;
                        z31 = true;
                        aVar8 = aVar9;
                        str21 = str6;
                        if (salesIQResponse.getIsSuccess()) {
                            z42 = z31;
                            list = null;
                            String str34 = str19;
                            kVar3 = kVar4;
                            z43 = false;
                            i18 = 4;
                            triggersRepository4 = triggersRepository2;
                            c12 = c11;
                            c13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, str34, null, 0, false, null, null, null, 126, null));
                        } else {
                            TriggerResponse triggerResponse = (TriggerResponse) salesIQResponse.getData();
                            if (triggerResponse != null ? Intrinsics.areEqual(triggerResponse.isTriggered(), Boxing.boxBoolean(z31)) : false) {
                                String str35 = str19;
                                if (z27) {
                                    z42 = z31;
                                    list = null;
                                    kVar3 = kVar4;
                                    z43 = false;
                                    i18 = 4;
                                    triggersRepository4 = triggersRepository2;
                                    c12 = c11;
                                    c13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, str35, null, 0, false, null, null, null, 126, null));
                                } else {
                                    if (aVar8 == Rf.a.AccessedAnyPageOnApp) {
                                        triggersRepository2.a(aVar8);
                                    }
                                    kVar4.f44187n = triggersRepository2;
                                    kVar4.f44188o = null;
                                    kVar4.f44189p = null;
                                    kVar4.f44190q = null;
                                    kVar4.f44191r = null;
                                    kVar4.f44192s = null;
                                    kVar4.f44193t = null;
                                    kVar4.f44194u = null;
                                    kVar4.f44195v = null;
                                    kVar4.f44196w = z27;
                                    kVar4.f44183C = i16;
                                    kVar4.f44186F = 3;
                                    triggersRepository4 = triggersRepository2;
                                    c12 = c11;
                                    z42 = z31;
                                    z43 = false;
                                    list = null;
                                    i18 = 4;
                                    h10 = triggersRepository4.h(aVar8, str21, str10, str35, str8, str20, z26, z29, z28, z30, z25, true, kVar4);
                                    kVar3 = kVar4;
                                }
                            } else {
                                c13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, str19, null, 0, false, null, null, null, 126, null));
                                z42 = z31;
                                list = null;
                                kVar3 = kVar4;
                                z43 = false;
                                i18 = 4;
                                triggersRepository4 = triggersRepository2;
                                c12 = c11;
                            }
                        }
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append("TriggerRepository: EVI onSuccess ");
                        sb32.append(i16 != 0 ? z42 : z43);
                        sb32.append(c12);
                        sb32.append(z27);
                        LiveChatUtil.log(sb32.toString());
                        if (i16 != 0) {
                            list2 = triggersRepository4.f44150f;
                            if (list2 != null) {
                            }
                            triggersRepository4.f44150f = list;
                        }
                        return c13;
                    }
                    obj4 = obj6;
                    int i25 = kVar4.f44183C;
                    z22 = kVar4.f44182B;
                    z21 = kVar4.f44181A;
                    z20 = kVar4.f44199z;
                    z19 = kVar4.f44198y;
                    z18 = kVar4.f44197x;
                    z23 = kVar4.f44196w;
                    Rf.a aVar14 = (Rf.a) kVar4.f44194u;
                    aVar6 = (Rf.a) kVar4.f44193t;
                    str9 = (String) kVar4.f44192s;
                    str16 = (String) kVar4.f44191r;
                    str15 = (String) kVar4.f44190q;
                    str18 = (String) kVar4.f44189p;
                    i14 = i25;
                    String str36 = (String) kVar4.f44188o;
                    TriggersRepository triggersRepository9 = (TriggersRepository) kVar4.f44187n;
                    ResultKt.throwOnFailure(obj4);
                    aVar5 = aVar14;
                    obj3 = coroutine_suspended;
                    c11 = ' ';
                    triggersRepository = triggersRepository9;
                    str17 = str36;
                    String str272 = str16;
                    str6 = str17;
                    z24 = z18;
                    aVar2 = aVar6;
                    str8 = str272;
                    String str282 = str18;
                    z17 = z23;
                    str10 = str282;
                    String str292 = str15;
                    triggersRepository2 = triggersRepository;
                    str7 = str292;
                    e11 = (SalesIQResponse) obj4;
                    i15 = i14;
                    aVar7 = aVar5;
                }
                if (e11.getIsSuccess()) {
                    boolean z46 = z22;
                    boolean z47 = z19;
                    salesIQResponse = e11;
                    obj5 = obj3;
                    z25 = z21;
                    z26 = z17;
                    str19 = str7;
                    i16 = i15;
                    z27 = z46;
                    z28 = z47;
                    z29 = z24;
                    str20 = str9;
                    z30 = z20;
                    z31 = true;
                    str21 = str6;
                    aVar8 = aVar7;
                    if (salesIQResponse.getIsSuccess()) {
                    }
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append("TriggerRepository: EVI onSuccess ");
                    sb322.append(i16 != 0 ? z42 : z43);
                    sb322.append(c12);
                    sb322.append(z27);
                    LiveChatUtil.log(sb322.toString());
                    if (i16 != 0) {
                    }
                    return c13;
                }
                Object obj7 = obj3;
                TriggerResponse triggerResponse2 = (TriggerResponse) e11.getData();
                i17 = i15;
                boolean z48 = z22;
                if (Intrinsics.areEqual(triggerResponse2.isTriggered(), Boxing.boxBoolean(true))) {
                    z32 = z24;
                    z33 = z20;
                    boolean z49 = z19;
                    obj5 = obj7;
                    salesIQResponse = e11;
                    aVar9 = aVar7;
                    z34 = z17;
                    str19 = str7;
                    z35 = z21;
                    z27 = z48;
                    z36 = z49;
                    boolean z452 = z32;
                    int i242 = i17;
                    z25 = z35;
                    z29 = z452;
                    z28 = z36;
                    i16 = i242;
                    z26 = z34;
                    str20 = str9;
                    z30 = z33;
                    z31 = true;
                    aVar8 = aVar9;
                    str21 = str6;
                    if (salesIQResponse.getIsSuccess()) {
                    }
                    StringBuilder sb3222 = new StringBuilder();
                    sb3222.append("TriggerRepository: EVI onSuccess ");
                    sb3222.append(i16 != 0 ? z42 : z43);
                    sb3222.append(c12);
                    sb3222.append(z27);
                    LiveChatUtil.log(sb3222.toString());
                    if (i16 != 0) {
                    }
                    return c13;
                }
                Lf.a a13 = Qf.a.a(aVar7);
                Lf.b A10 = triggersRepository2.A(Qf.a.a(aVar7));
                boolean z50 = z21;
                boolean z51 = z20;
                Rf.a aVar15 = aVar7;
                if (aVar15 == Rf.a.PerformedCustomAction) {
                    if (A10 == null || (hashMap = A10.c()) == null) {
                        hashMap = new HashMap();
                    }
                    if (str6 != null) {
                        hashMap.put(str6, triggerResponse2);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    z37 = z24;
                    z38 = z19;
                    if (A10 == null || (bVar = Lf.b.b(A10, null, hashMap, 1, null)) == null) {
                        bVar = new Lf.b(null, hashMap, 1, null);
                    }
                } else {
                    z37 = z24;
                    z38 = z19;
                    if (A10 == null || (bVar = Lf.b.b(A10, triggerResponse2, null, 2, null)) == null) {
                        bVar = new Lf.b(triggerResponse2, null, 2, null);
                    }
                }
                triggersRepository2.t().x().put(a13, bVar);
                if (aVar15 == Rf.a.Clicked) {
                    triggersRepository2.t().S(true);
                    triggersRepository2.u().k0(De.a.WidgetInteractionTriggerData, triggersRepository2.x().v(triggerResponse2), true);
                }
                Trigger a14 = Qf.b.a(triggerResponse2, triggersRepository2.x());
                LiveChatUtil.log("TriggerRepository: EVI onSuccess (!isTriggered)");
                if (!z17) {
                    a14.getAction();
                    if (Trigger.Type.InvokeJSApi != null) {
                        triggersRepository2.J(aVar2, triggerResponse2.getEncryptedVisitorInfo());
                    }
                }
                if (a14.getParams() == null) {
                    a14.getAction();
                    C5582a.C0817a c0817a2 = C5582a.f56502b;
                    we.d dVar2 = we.d.f67628J;
                    return c0817a2.b(new C5582a.b(dVar2.b(), Boxing.boxInt(dVar2.a()), null, 4, null));
                }
                if (z37) {
                    return C5582a.f56502b.d(null);
                }
                long r10 = og.i.r(e11.getDuration());
                kVar4.f44187n = triggersRepository2;
                kVar4.f44188o = str6;
                kVar4.f44189p = str10;
                kVar4.f44190q = str7;
                kVar4.f44191r = str8;
                kVar4.f44192s = str9;
                kVar4.f44193t = aVar15;
                SalesIQResponse salesIQResponse3 = e11;
                kVar4.f44194u = salesIQResponse3;
                kVar4.f44195v = salesIQResponse3;
                kVar4.f44196w = z17;
                z32 = z37;
                kVar4.f44197x = z32;
                kVar4.f44198y = z38;
                kVar4.f44199z = z51;
                kVar4.f44181A = z50;
                kVar4.f44182B = z48;
                kVar4.f44183C = i17;
                kVar4.f44186F = 2;
                String str37 = str7;
                TriggersRepository triggersRepository10 = triggersRepository2;
                boolean z52 = z17;
                Object D10 = triggersRepository10.D(a14, aVar2, str6, z52, triggerResponse2, str37, r10, z50, kVar4);
                triggersRepository3 = triggersRepository10;
                z39 = z52;
                str22 = str37;
                obj5 = obj7;
                if (D10 != obj5) {
                    str23 = str8;
                    str24 = str9;
                    z36 = z38;
                    aVar10 = aVar15;
                    salesIQResponse2 = salesIQResponse3;
                    z40 = z51;
                    z41 = z50;
                    z27 = z48;
                    Rf.a aVar132 = aVar10;
                    str9 = str24;
                    z35 = z41;
                    aVar9 = aVar132;
                    String str332 = str22;
                    z34 = z39;
                    str19 = str332;
                    z33 = z40;
                    salesIQResponse = salesIQResponse2;
                    str8 = str23;
                    triggersRepository2 = triggersRepository3;
                    boolean z4522 = z32;
                    int i2422 = i17;
                    z25 = z35;
                    z29 = z4522;
                    z28 = z36;
                    i16 = i2422;
                    z26 = z34;
                    str20 = str9;
                    z30 = z33;
                    z31 = true;
                    aVar8 = aVar9;
                    str21 = str6;
                    if (salesIQResponse.getIsSuccess()) {
                    }
                    StringBuilder sb32222 = new StringBuilder();
                    sb32222.append("TriggerRepository: EVI onSuccess ");
                    sb32222.append(i16 != 0 ? z42 : z43);
                    sb32222.append(c12);
                    sb32222.append(z27);
                    LiveChatUtil.log(sb32222.toString());
                    if (i16 != 0) {
                    }
                    return c13;
                }
                return obj5;
            }
        }
        kVar = new k(continuation);
        k kVar42 = kVar;
        Object obj62 = kVar42.f44184D;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = kVar42.f44186F;
        if (i10 != 0) {
        }
        if (e11.getIsSuccess()) {
        }
    }

    @Override // Pf.a
    public C5582a i(Rf.a actionType, String str, Long l10) {
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Object obj = null;
        String str2 = (String) u().M(De.a.TriggersAlarmsData, null).b();
        if (str2 != null) {
            Type type = new TypeToken<EnumMap<Rf.a, List<? extends TriggerAlarm>>>() { // from class: com.zoho.livechat.android.modules.triggers.data.TriggersRepository$getTriggerAlarm$mapType$1
            }.getType();
            Gson x10 = x();
            Intrinsics.checkNotNull(type);
            EnumMap enumMap = (EnumMap) AbstractC5895g.c(x10, str2, type);
            if (actionType != Rf.a.PerformedCustomAction || str == null) {
                C5582a.C0817a c0817a = C5582a.f56502b;
                if (enumMap != null && (list = (List) enumMap.get(actionType)) != null) {
                    obj = (TriggerAlarm) CollectionsKt.firstOrNull(list);
                }
                return c0817a.d(obj);
            }
            if (enumMap != null && (list2 = (List) enumMap.get(actionType)) != null) {
                C5582a.C0817a c0817a2 = C5582a.f56502b;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    TriggerAlarm triggerAlarm = (TriggerAlarm) next;
                    if (Intrinsics.areEqual(triggerAlarm.getCustomActionName(), str) && Intrinsics.areEqual(l10, triggerAlarm.getTime())) {
                        obj = next;
                        break;
                    }
                }
                return c0817a2.d(obj);
            }
        }
        return C5582a.f56502b.d(null);
    }

    @Override // Pf.a
    public C5582a k(Rf.a actionType, String encryptedVisitorInfo) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(encryptedVisitorInfo, "encryptedVisitorInfo");
        C5582a.C0817a c0817a = C5582a.f56502b;
        J(actionType, encryptedVisitorInfo);
        return c0817a.d(Unit.INSTANCE);
    }

    public final C6959a t() {
        return C6959a.f68673u.b();
    }

    public final Ae.a u() {
        return (Ae.a) this.f44146b.getValue();
    }

    public final C4377a v() {
        return (C4377a) this.f44148d.getValue();
    }

    public final Ne.b w() {
        return (Ne.b) this.f44149e.getValue();
    }

    public final Gson x() {
        return Yd.a.j();
    }

    public final String z(List list) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Pair pair = (Pair) obj;
            if (og.i.g(pair.getFirst()) || String.valueOf(pair.getFirst()).length() == 0) {
                arrayList.add(obj);
            }
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, h.f44168d, 30, null));
        sb2.append('.');
        return sb2.toString();
    }

    public TriggersRepository(Application application) {
        this.f44145a = application;
        this.f44146b = LazyKt.lazy(new d());
        this.f44147c = LazyKt.lazy(m.f44210d);
        this.f44148d = LazyKt.lazy(new e());
        this.f44149e = LazyKt.lazy(f.f44164d);
    }
}
