package Ne;

import Ae.a;
import Ph.AbstractC1459k;
import Ph.P;
import Rf.a;
import a1.C1908a;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import com.google.gson.Gson;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.conversations.data.wms.handlers.WmsConversationsEventsHandler;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.modules.triggers.data.TriggersRepository;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.android.tracking.TrackingHelper;
import com.zoho.salesiqembed.android.tracking.UTSAdapter;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import me.C5582a;
import od.AbstractC5884j;
import od.x;
import og.AbstractC5892d;
import og.AbstractC5895g;
import og.m;
import qf.C6152a;
import rd.C6218a;
import td.C6461a;
import ug.AbstractC6574b;
import zf.C6966g;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static b f7994g;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f7996a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f7997b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f7998c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f7999d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f8000e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f7993f = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f7995h = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar;
            synchronized (b.f7995h) {
                bVar = b.f7994g;
                if (bVar == null) {
                    bVar = new b(null);
                    b.f7994g = bVar;
                }
            }
            return bVar;
        }

        public a() {
        }
    }

    /* renamed from: Ne.b$b, reason: collision with other inner class name */
    public static final class C0163b extends Lambda implements Function0 {
        public C0163b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            a.C0010a c0010a = Ae.a.f447b;
            Application k10 = b.this.k();
            Intrinsics.checkNotNull(k10);
            return c0010a.b(k10);
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f8002n;

        /* renamed from: o, reason: collision with root package name */
        public Object f8003o;

        /* renamed from: p, reason: collision with root package name */
        public Object f8004p;

        /* renamed from: q, reason: collision with root package name */
        public Object f8005q;

        /* renamed from: r, reason: collision with root package name */
        public int f8006r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f8007s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f8008t;

        /* renamed from: v, reason: collision with root package name */
        public int f8010v;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8008t = obj;
            this.f8010v |= Integer.MIN_VALUE;
            return b.this.h(0, null, false, null, this);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f8011n;

        /* renamed from: o, reason: collision with root package name */
        public int f8012o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Hashtable f8013p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f8014q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f8015r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f8016s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Hashtable hashtable, int i10, boolean z10, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f8013p = hashtable;
            this.f8014q = i10;
            this.f8015r = z10;
            this.f8016s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f8013p, this.f8014q, this.f8015r, this.f8016s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0175, code lost:
        
            if (r5.s(r6, r7, r8, r9, r11) != r0) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0177, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00d6, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6 instanceof java.lang.Boolean ? (java.lang.Boolean) r6 : null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) != false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
        
            if (r12 == r0) goto L91;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Rf.a a10;
            Hashtable hashtable;
            Object obj2;
            Hashtable hashtable2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8012o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z10 = Q.f44448i;
                ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                a.C0198a c0198a = Rf.a.Companion;
                Hashtable hashtable3 = this.f8013p;
                a10 = c0198a.a((hashtable3 == null || (obj2 = hashtable3.get("action_type")) == null) ? null : obj2.toString());
                if (this.f8014q != 10) {
                    Intrinsics.checkNotNull(allOpenChatIds);
                    if (!allOpenChatIds.isEmpty() && !this.f8015r) {
                        if (a10 == Rf.a.LandedOnApp && (hashtable = this.f8013p) != null && hashtable.containsKey("encrypted_visitor_info")) {
                            TriggersRepository p10 = this.f8016s.p();
                            Object obj4 = this.f8013p.get("encrypted_visitor_info");
                            p10.J(a10, obj4 != null ? obj4.toString() : null);
                        }
                        LiveChatUtil.log("ConversationUtsEventsHandler, executeTrigger: " + this.f8014q + " ignored.");
                        return Unit.INSTANCE;
                    }
                }
                Hashtable hashtable4 = this.f8013p;
                if (hashtable4 != null && hashtable4.containsKey("encrypted_visitor_info")) {
                    TriggersRepository p11 = this.f8016s.p();
                    Object obj5 = this.f8013p.get("attender");
                    String str = obj5 instanceof String ? (String) obj5 : null;
                    if (str != null) {
                        Object obj6 = this.f8013p.get("is_bot");
                    }
                    str = null;
                    Object obj7 = this.f8013p.get("triggerid");
                    String str2 = obj7 instanceof String ? (String) obj7 : null;
                    Object obj8 = this.f8013p.get("encrypted_visitor_info");
                    String str3 = obj8 instanceof String ? (String) obj8 : null;
                    this.f8011n = a10;
                    this.f8012o = 1;
                    obj = p11.L(str, str2, str3, this);
                }
                b bVar = this.f8016s;
                int i11 = this.f8014q;
                hashtable2 = this.f8013p;
                if (hashtable2 != null || (obj3 = hashtable2.get("acknowledgement_key")) == null || (r12 = obj3.toString()) == null) {
                    String n10 = Tf.b.n();
                }
                String str4 = n10;
                boolean z11 = this.f8015r;
                Hashtable hashtable5 = this.f8013p;
                this.f8011n = null;
                this.f8012o = 2;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Tf.b.P(null);
                    return Unit.INSTANCE;
                }
                a10 = (Rf.a) this.f8011n;
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            if (!c5582a.d() || !og.i.f((String) c5582a.b())) {
                return Unit.INSTANCE;
            }
            if (a10 == Rf.a.Clicked || a10 == Rf.a.AccessedAnyPageOnApp || a10 == Rf.a.LandedOnApp || (a10 == Rf.a.PerformedCustomAction && !this.f8015r)) {
                this.f8016s.p().J(a10, (String) c5582a.b());
            }
            this.f8013p.put("encrypted_object", c5582a.b());
            b bVar2 = this.f8016s;
            int i112 = this.f8014q;
            hashtable2 = this.f8013p;
            if (hashtable2 != null) {
            }
            String n102 = Tf.b.n();
            String str42 = n102;
            boolean z112 = this.f8015r;
            Hashtable hashtable52 = this.f8013p;
            this.f8011n = null;
            this.f8012o = 2;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f8017d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gson invoke() {
            return Yd.a.j();
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f8018d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f8019e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WaitingChatDetails f8020f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f8021g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f8022h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f8023i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8024j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, WaitingChatDetails waitingChatDetails, b bVar, boolean z10, String str3, String str4) {
            super(0);
            this.f8018d = str;
            this.f8019e = str2;
            this.f8020f = waitingChatDetails;
            this.f8021g = bVar;
            this.f8022h = z10;
            this.f8023i = str3;
            this.f8024j = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
            String str = this.f8018d;
            UTSUtil.updateBotTriggeredActionsList(str, UTSUtil.ActionState.Triggered, UTSUtil.getCustomActions(str));
            UTSUtil.sendTriggerAcknowledgement(this.f8019e);
            Intent intent = new Intent("receivelivechat");
            boolean z10 = this.f8022h;
            String str2 = this.f8023i;
            String str3 = this.f8024j;
            b bVar = this.f8021g;
            if (z10 && C6218a.k() && (LiveChatUtil.isMultipleChatsDisabled() || !LiveChatUtil.isConversationEnabled())) {
                intent.putExtra("message", "triggered_chat");
                if (str2 == null || str2.length() == 0) {
                    intent.putExtra("must_force_load_triggered_chat", true);
                } else {
                    intent.putExtra("acknowledgement_key", str3);
                }
                Application k10 = bVar.k();
                if (k10 != null) {
                    LiveChatUtil.log("TriggeredChat BroadCast sent 1");
                    C1908a.b(k10).d(intent);
                }
            }
            WaitingChatDetails waitingChatDetails = this.f8020f;
            if (waitingChatDetails != null) {
                b.y(this.f8021g, waitingChatDetails, false, 2, null);
            }
            LiveChatUtil.triggerSalesIQListener("BOT_TRIGGER", null, null);
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f8025n;

        /* renamed from: o, reason: collision with root package name */
        public Object f8026o;

        /* renamed from: p, reason: collision with root package name */
        public Object f8027p;

        /* renamed from: q, reason: collision with root package name */
        public Object f8028q;

        /* renamed from: r, reason: collision with root package name */
        public Object f8029r;

        /* renamed from: s, reason: collision with root package name */
        public Object f8030s;

        /* renamed from: t, reason: collision with root package name */
        public Object f8031t;

        /* renamed from: u, reason: collision with root package name */
        public Object f8032u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f8033v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f8034w;

        /* renamed from: y, reason: collision with root package name */
        public int f8036y;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8034w = obj;
            this.f8036y |= Integer.MIN_VALUE;
            return b.this.s(0, null, false, null, this);
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f8037d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6152a invoke() {
            return C6152a.f63488c.a();
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f8038n;

        /* renamed from: o, reason: collision with root package name */
        public Object f8039o;

        /* renamed from: p, reason: collision with root package name */
        public Object f8040p;

        /* renamed from: q, reason: collision with root package name */
        public Object f8041q;

        /* renamed from: r, reason: collision with root package name */
        public int f8042r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f8043s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Hashtable f8044t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f8045u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Hashtable hashtable, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f8044t = hashtable;
            this.f8045u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            i iVar = new i(this.f8044t, this.f8045u, continuation);
            iVar.f8043s = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(36:52|53|(3:55|(1:57)(1:121)|(30:59|60|61|(2:63|(1:65))(1:120)|66|(1:68)|69|(1:71)(1:119)|72|(1:74)(1:118)|75|(1:77)|78|(1:80)|81|(1:83)(1:117)|84|(1:86)|87|88|89|(3:111|(1:113)|114)(1:93)|94|95|(1:101)|102|(1:104)|105|106|(1:109)(12:108|9|10|(0)|13|14|(0)|17|(0)|20|21|22)))|122|60|61|(0)(0)|66|(0)|69|(0)(0)|72|(0)(0)|75|(0)|78|(0)|81|(0)(0)|84|(0)|87|88|89|(1:91)|111|(0)|114|94|95|(3:97|99|101)|102|(0)|105|106|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x01db, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x01dc, code lost:
        
            r1 = r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x02aa A[Catch: all -> 0x01db, TryCatch #5 {all -> 0x01db, blocks: (B:89:0x0198, B:91:0x01a6, B:93:0x01ad, B:95:0x0236, B:97:0x0258, B:99:0x025e, B:101:0x0264, B:102:0x02a4, B:104:0x02aa, B:105:0x02b5, B:111:0x01e0, B:113:0x0219, B:114:0x0224), top: B:88:0x0198 }] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02e6  */
        /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0219 A[Catch: all -> 0x01db, TryCatch #5 {all -> 0x01db, blocks: (B:89:0x0198, B:91:0x01a6, B:93:0x01ad, B:95:0x0236, B:97:0x0258, B:99:0x025e, B:101:0x0264, B:102:0x02a4, B:104:0x02aa, B:105:0x02b5, B:111:0x01e0, B:113:0x0219, B:114:0x0224), top: B:88:0x0198 }] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x02f0 A[Catch: all -> 0x02f4, TryCatch #1 {all -> 0x02f4, blocks: (B:10:0x02ea, B:12:0x02f0, B:13:0x02f7), top: B:9:0x02ea }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x031b A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0324 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f4 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0112 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0122 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0132 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0142 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0152 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0162 A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x016e A[Catch: all -> 0x00da, TryCatch #4 {all -> 0x00da, blocks: (B:14:0x0315, B:16:0x031b, B:17:0x031e, B:19:0x0324, B:20:0x0327, B:53:0x008c, B:55:0x00cb, B:57:0x00d5, B:59:0x00e2, B:61:0x00ee, B:63:0x00f4, B:65:0x00fc, B:66:0x010c, B:68:0x0112, B:69:0x011c, B:71:0x0122, B:72:0x012c, B:74:0x0132, B:75:0x013c, B:77:0x0142, B:78:0x014c, B:80:0x0152, B:81:0x015c, B:83:0x0162, B:84:0x0168, B:86:0x016e, B:87:0x018d, B:122:0x00e9), top: B:52:0x008c }] */
        /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wh.a a10;
            b bVar;
            Hashtable hashtable;
            long f10;
            long j10;
            SharedPreferences M10;
            b bVar2;
            String valueOf;
            String valueOf2;
            ContentResolver contentResolver;
            SalesIQChat chat;
            Ref.ObjectRef objectRef;
            com.zoho.livechat.android.provider.a aVar;
            Cursor cursor;
            SalesIQChat salesIQChat;
            SalesIQChat salesIQChat2;
            C6152a o10;
            MessageEntity h10;
            SalesIQChat salesIQChat3;
            String str;
            b bVar3;
            Object obj2;
            Object m147constructorimpl;
            Throwable m150exceptionOrNullimpl;
            Cursor cursor2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8042r;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.f8043s;
                a10 = C6461a.C0913a.f65814a.a();
                Hashtable hashtable2 = this.f8044t;
                bVar = this.f8045u;
                this.f8043s = p10;
                this.f8038n = a10;
                this.f8039o = hashtable2;
                this.f8040p = bVar;
                this.f8042r = 1;
                if (a10.f(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hashtable = hashtable2;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    salesIQChat3 = (SalesIQChat) this.f8041q;
                    objectRef = (Ref.ObjectRef) this.f8040p;
                    String str2 = (String) this.f8039o;
                    b bVar4 = (b) this.f8038n;
                    Wh.a aVar2 = (Wh.a) this.f8043s;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str = str2;
                        bVar3 = bVar4;
                        a10 = aVar2;
                        try {
                            if (C6218a.W()) {
                                rd.b.b();
                            }
                            b.w(bVar3, str, null, false, false, 14, null);
                            Ue.a.c(salesIQChat3);
                            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = a10;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                a10 = aVar2;
                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                if (m150exceptionOrNullimpl != null) {
                                }
                                cursor2 = (Cursor) objectRef.element;
                                if (cursor2 != null) {
                                }
                                Unit unit = Unit.INSTANCE;
                                a10.g(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                th = th3;
                                a10 = aVar2;
                                obj2 = null;
                                a10.g(obj2);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        a10 = aVar2;
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        cursor2 = (Cursor) objectRef.element;
                        if (cursor2 != null) {
                        }
                        Unit unit2 = Unit.INSTANCE;
                        a10.g(null);
                        return Unit.INSTANCE;
                    }
                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                        LiveChatUtil.log(m150exceptionOrNullimpl);
                    }
                    cursor2 = (Cursor) objectRef.element;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    Unit unit22 = Unit.INSTANCE;
                    a10.g(null);
                    return Unit.INSTANCE;
                }
                b bVar5 = (b) this.f8040p;
                Hashtable hashtable3 = (Hashtable) this.f8039o;
                Wh.a aVar3 = (Wh.a) this.f8038n;
                ResultKt.throwOnFailure(obj);
                bVar = bVar5;
                hashtable = hashtable3;
                a10 = aVar3;
            }
            if (hashtable == null) {
                try {
                    Unit unit3 = Unit.INSTANCE;
                    a10.g(null);
                    return unit3;
                } catch (Throwable th5) {
                    th = th5;
                    obj2 = null;
                    a10.g(obj2);
                    throw th;
                }
            }
            try {
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                String valueOf3 = String.valueOf(hashtable.get("wms_chat_id"));
                String valueOf4 = String.valueOf(hashtable.get("chid"));
                String valueOf5 = String.valueOf(hashtable.get("msg"));
                String valueOf6 = String.valueOf(hashtable.get("msgid"));
                Long longOrNull = StringsKt.toLongOrNull(valueOf6);
                if (longOrNull != null) {
                    long longValue = longOrNull.longValue();
                    Long boxLong = longValue > 0 ? Boxing.boxLong(longValue) : null;
                    if (boxLong != null) {
                        f10 = boxLong.longValue();
                        j10 = f10;
                        M10 = C6218a.M();
                        if (M10 == null) {
                            bVar2 = bVar;
                            SharedPreferences.Editor edit = M10.edit();
                            if (edit != null) {
                                edit.putString("proactive_received_msgid", valueOf6);
                                edit.putString("proactive_chid", valueOf4);
                                edit.apply();
                            }
                        } else {
                            bVar2 = bVar;
                        }
                        if (hashtable.containsKey("department")) {
                            objectRef2.element = String.valueOf(hashtable.get("department"));
                        }
                        valueOf = !hashtable.containsKey("attender") ? String.valueOf(hashtable.get("attender")) : null;
                        valueOf2 = !hashtable.containsKey("attendername") ? String.valueOf(hashtable.get("attendername")) : null;
                        if (hashtable.containsKey("attenderemail")) {
                            objectRef3.element = String.valueOf(hashtable.get("attenderemail"));
                        }
                        if (hashtable.containsKey("image_fkey")) {
                            objectRef4.element = String.valueOf(hashtable.get("image_fkey"));
                        }
                        Application k10 = bVar2.k();
                        contentResolver = k10 == null ? k10.getContentResolver() : null;
                        chat = LiveChatUtil.getChat(valueOf4);
                        if (chat != null) {
                            com.zoho.livechat.android.provider.a.INSTANCE.delete(contentResolver, b.a.f44269a, "CHATID =? ", new String[]{chat.getChid()});
                            String chid = chat.getChid();
                            Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                            C6966g.y(chid, null, 2, null);
                        }
                        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                        String[] strArr = {valueOf4};
                        Result.Companion companion3 = Result.INSTANCE;
                        aVar = com.zoho.livechat.android.provider.a.INSTANCE;
                        ?? executeRawQuery = aVar.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", strArr);
                        objectRef5.element = executeRawQuery;
                        cursor = (Cursor) executeRawQuery;
                        if (cursor == null && cursor.moveToFirst()) {
                            salesIQChat = new SalesIQChat((Cursor) objectRef5.element);
                            salesIQChat.setDeptid((String) objectRef2.element);
                            salesIQChat.setAttenderName(valueOf2);
                            salesIQChat.setStatus(7);
                            salesIQChat.setVisitorid(null);
                            salesIQChat.setAttenderid(valueOf);
                            salesIQChat.setAttenderEmail((String) objectRef3.element);
                            salesIQChat.setAttenderImgkey((String) objectRef4.element);
                        } else {
                            String uuid = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                            salesIQChat = new SalesIQChat(uuid, valueOf4, null, rd.b.f(), 7, SalesIQChat.c.Chat);
                            salesIQChat.setRchatid(valueOf3);
                            salesIQChat.setAttenderName(valueOf2);
                            salesIQChat.setDeptid((String) objectRef2.element);
                            if (AbstractC3945n.g((String) objectRef2.element) != null) {
                                salesIQChat.setDepartmentName(AbstractC3945n.g((String) objectRef2.element));
                            }
                            salesIQChat.setAttenderid(valueOf);
                            salesIQChat.setAttenderEmail((String) objectRef3.element);
                            salesIQChat.setAttenderImgkey((String) objectRef4.element);
                        }
                        salesIQChat2 = salesIQChat;
                        LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                        salesIQChat2.setUnreadCount(1);
                        salesIQChat2.setLastmsgtime(j10);
                        aVar.syncConversation(salesIQChat2);
                        if (!Intrinsics.areEqual(salesIQChat2.getChid(), C6218a.y()) && LiveChatUtil.canShowInAppNotification() && og.i.e(contentResolver)) {
                            String str3 = valueOf2;
                            aVar.insertPushNotification(contentResolver, salesIQChat2.getChid(), valueOf, str3, b.EnumC0639b.WMS, null, null, valueOf5, null, null, Boxing.boxLong(salesIQChat2.getTime()));
                            AbstractC5884j.n(bVar2.k(), salesIQChat2.getChid(), salesIQChat2.getConvID(), str3, valueOf5, MapsKt.toMap(hashtable), j10, true, true);
                        }
                        if (!hashtable.containsKey("time")) {
                            hashtable.put("time", Boxing.boxLong(rd.b.f()));
                        }
                        o10 = bVar2.o();
                        h10 = vf.c.h(hashtable, valueOf3, null, null, null, 14, null);
                        this.f8043s = a10;
                        b bVar6 = bVar2;
                        this.f8038n = bVar6;
                        this.f8039o = valueOf4;
                        this.f8040p = objectRef5;
                        this.f8041q = salesIQChat2;
                        this.f8042r = 2;
                        if (C6152a.U(o10, h10, false, this, 2, null) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef5;
                        salesIQChat3 = salesIQChat2;
                        str = valueOf4;
                        bVar3 = bVar6;
                        if (C6218a.W()) {
                        }
                        b.w(bVar3, str, null, false, false, 14, null);
                        Ue.a.c(salesIQChat3);
                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        cursor2 = (Cursor) objectRef.element;
                        if (cursor2 != null) {
                        }
                        Unit unit222 = Unit.INSTANCE;
                        a10.g(null);
                        return Unit.INSTANCE;
                    }
                }
                f10 = rd.b.f();
                j10 = f10;
                M10 = C6218a.M();
                if (M10 == null) {
                }
                if (hashtable.containsKey("department")) {
                }
                if (!hashtable.containsKey("attender")) {
                }
                if (!hashtable.containsKey("attendername")) {
                }
                if (hashtable.containsKey("attenderemail")) {
                }
                if (hashtable.containsKey("image_fkey")) {
                }
                Application k102 = bVar2.k();
                if (k102 == null) {
                }
                chat = LiveChatUtil.getChat(valueOf4);
                if (chat != null) {
                }
                Ref.ObjectRef objectRef52 = new Ref.ObjectRef();
                String[] strArr2 = {valueOf4};
                Result.Companion companion32 = Result.INSTANCE;
                aVar = com.zoho.livechat.android.provider.a.INSTANCE;
                ?? executeRawQuery2 = aVar.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", strArr2);
                objectRef52.element = executeRawQuery2;
                cursor = (Cursor) executeRawQuery2;
                if (cursor == null) {
                }
                String uuid2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                salesIQChat = new SalesIQChat(uuid2, valueOf4, null, rd.b.f(), 7, SalesIQChat.c.Chat);
                salesIQChat.setRchatid(valueOf3);
                salesIQChat.setAttenderName(valueOf2);
                salesIQChat.setDeptid((String) objectRef2.element);
                if (AbstractC3945n.g((String) objectRef2.element) != null) {
                }
                salesIQChat.setAttenderid(valueOf);
                salesIQChat.setAttenderEmail((String) objectRef3.element);
                salesIQChat.setAttenderImgkey((String) objectRef4.element);
                salesIQChat2 = salesIQChat;
                LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                salesIQChat2.setUnreadCount(1);
                salesIQChat2.setLastmsgtime(j10);
                aVar.syncConversation(salesIQChat2);
                if (!Intrinsics.areEqual(salesIQChat2.getChid(), C6218a.y())) {
                    String str32 = valueOf2;
                    aVar.insertPushNotification(contentResolver, salesIQChat2.getChid(), valueOf, str32, b.EnumC0639b.WMS, null, null, valueOf5, null, null, Boxing.boxLong(salesIQChat2.getTime()));
                    AbstractC5884j.n(bVar2.k(), salesIQChat2.getChid(), salesIQChat2.getConvID(), str32, valueOf5, MapsKt.toMap(hashtable), j10, true, true);
                }
                if (!hashtable.containsKey("time")) {
                }
                o10 = bVar2.o();
                h10 = vf.c.h(hashtable, valueOf3, null, null, null, 14, null);
                this.f8043s = a10;
                b bVar62 = bVar2;
                this.f8038n = bVar62;
                this.f8039o = valueOf4;
                this.f8040p = objectRef52;
                this.f8041q = salesIQChat2;
                this.f8042r = 2;
                if (C6152a.U(o10, h10, false, this, 2, null) != coroutine_suspended) {
                }
            } catch (Throwable th6) {
                th = th6;
                obj2 = null;
                a10.g(obj2);
                throw th;
            }
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TriggersRepository invoke() {
            TriggersRepository.a aVar = TriggersRepository.f44142g;
            Application k10 = b.this.k();
            Intrinsics.checkNotNull(k10);
            return aVar.a(k10);
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f8047d = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WmsConversationsEventsHandler invoke() {
            return WmsConversationsEventsHandler.f42873j.a();
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final b n() {
        return f7993f.a();
    }

    public static final void t(b this$0, SalesIQChat chat, String senderName, String text) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chat, "$chat");
        Intrinsics.checkNotNullParameter(senderName, "$senderName");
        Intrinsics.checkNotNullParameter(text, "$text");
        AbstractC5884j.q(this$0.k(), chat, senderName, text);
    }

    public static /* synthetic */ void w(b bVar, String str, MessageEntity messageEntity, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            messageEntity = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        bVar.v(str, messageEntity, z10, z11);
    }

    public static /* synthetic */ void y(b bVar, WaitingChatDetails waitingChatDetails, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        bVar.x(waitingChatDetails, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0188, code lost:
    
        if (r1.s(r11, r12, r4, r5, r6) != r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8 instanceof java.lang.Boolean ? (java.lang.Boolean) r8 : null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i10, String str, boolean z10, Hashtable hashtable, Continuation continuation) {
        c cVar;
        int i11;
        b bVar;
        String str2;
        Rf.a aVar;
        b bVar2;
        Object obj;
        C5582a c5582a;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f8010v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f8010v = i12 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj2 = cVar2.f8008t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = cVar2.f8010v;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    boolean z11 = Q.f44448i;
                    ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                    Rf.a a10 = Rf.a.Companion.a((hashtable == null || (obj = hashtable.get("action_type")) == null) ? null : obj.toString());
                    if (i10 != 10) {
                        Intrinsics.checkNotNull(allOpenChatIds);
                        if (!allOpenChatIds.isEmpty() && !z10) {
                            if (a10 == Rf.a.LandedOnApp && hashtable != null && hashtable.containsKey("encrypted_visitor_info")) {
                                TriggersRepository p10 = p();
                                Object obj3 = hashtable.get("encrypted_visitor_info");
                                p10.J(a10, obj3 != null ? obj3.toString() : null);
                            }
                            LiveChatUtil.log("ConversationUtsEventsHandler, executeTrigger: " + i10 + ", " + str + " ignored.");
                            return Unit.INSTANCE;
                        }
                    }
                    if (hashtable != null && hashtable.containsKey("encrypted_visitor_info")) {
                        TriggersRepository p11 = p();
                        Object obj4 = hashtable.get("attender");
                        String str3 = obj4 instanceof String ? (String) obj4 : null;
                        if (str3 != null) {
                            Object obj5 = hashtable.get("is_bot");
                        }
                        str3 = null;
                        Object obj6 = hashtable.get("triggerid");
                        String str4 = obj6 instanceof String ? (String) obj6 : null;
                        Object obj7 = hashtable.get("encrypted_visitor_info");
                        String str5 = obj7 instanceof String ? (String) obj7 : null;
                        cVar2.f8002n = this;
                        cVar2.f8003o = str;
                        cVar2.f8004p = hashtable;
                        cVar2.f8005q = a10;
                        cVar2.f8006r = i10;
                        cVar2.f8007s = z10;
                        cVar2.f8010v = 1;
                        obj2 = p11.L(str3, str4, str5, cVar2);
                        if (obj2 != coroutine_suspended) {
                            str2 = str;
                            aVar = a10;
                            bVar2 = this;
                        }
                        return coroutine_suspended;
                    }
                    bVar = this;
                    boolean z12 = z10;
                    Hashtable hashtable2 = hashtable;
                    if (str == null) {
                        str = Tf.b.n();
                    }
                    cVar2.f8002n = null;
                    cVar2.f8003o = null;
                    cVar2.f8004p = null;
                    cVar2.f8005q = null;
                    cVar2.f8010v = 2;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        Tf.b.P(null);
                        return Unit.INSTANCE;
                    }
                    z10 = cVar2.f8007s;
                    i10 = cVar2.f8006r;
                    aVar = (Rf.a) cVar2.f8005q;
                    hashtable = (Hashtable) cVar2.f8004p;
                    str2 = (String) cVar2.f8003o;
                    bVar2 = (b) cVar2.f8002n;
                    ResultKt.throwOnFailure(obj2);
                }
                c5582a = (C5582a) obj2;
                if (c5582a.d() || !og.i.f((String) c5582a.b())) {
                    return Unit.INSTANCE;
                }
                if (aVar == Rf.a.Clicked || aVar == Rf.a.AccessedAnyPageOnApp || aVar == Rf.a.LandedOnApp || (aVar == Rf.a.PerformedCustomAction && !z10)) {
                    bVar2.p().J(aVar, (String) c5582a.b());
                }
                hashtable.put("encrypted_object", c5582a.b());
                str = str2;
                bVar = bVar2;
                boolean z122 = z10;
                Hashtable hashtable22 = hashtable;
                if (str == null) {
                }
                cVar2.f8002n = null;
                cVar2.f8003o = null;
                cVar2.f8004p = null;
                cVar2.f8005q = null;
                cVar2.f8010v = 2;
            }
        }
        cVar = new c(continuation);
        c cVar22 = cVar;
        Object obj22 = cVar22.f8008t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = cVar22.f8010v;
        if (i11 != 0) {
        }
        c5582a = (C5582a) obj22;
        if (c5582a.d()) {
        }
        return Unit.INSTANCE;
    }

    public final void i(int i10, boolean z10, Hashtable hashtable) {
        AbstractC1459k.d(j(), null, null, new d(hashtable, i10, z10, this, null), 3, null);
    }

    public final P j() {
        return C6461a.f65810a.e();
    }

    public final Application k() {
        return MobilistenInitProvider.INSTANCE.e();
    }

    public final Ae.a l() {
        return (Ae.a) this.f8000e.getValue();
    }

    public final Gson m() {
        return (Gson) this.f7996a.getValue();
    }

    public final C6152a o() {
        return (C6152a) this.f7998c.getValue();
    }

    public final TriggersRepository p() {
        return (TriggersRepository) this.f7999d.getValue();
    }

    public final x q(Map map) {
        x xVar = new x();
        if (!og.i.g(map)) {
            Intrinsics.checkNotNull(map);
            if ((map.containsKey("name") ? map : null) != null) {
                xVar.z(String.valueOf(map.get("name")));
            }
            if ((map.containsKey("email") ? map : null) != null) {
                xVar.v(String.valueOf(map.get("email")));
            }
            if ((map.containsKey("phone") ? map : null) != null) {
                xVar.E(String.valueOf(map.get("phone")));
            }
            if ((map.containsKey("browser") ? map : null) != null) {
                xVar.s(String.valueOf(map.get("browser")));
            }
            if ((map.containsKey("os") ? map : null) != null) {
                xVar.D(String.valueOf(map.get("os")));
            }
            if ((map.containsKey(EventKeys.IP) ? map : null) != null) {
                xVar.x(String.valueOf(map.get(EventKeys.IP)));
            }
            if ((map.containsKey("ccode") ? map : null) != null) {
                xVar.u(String.valueOf(map.get("ccode")));
            }
            if ((map.containsKey("se") ? map : null) != null) {
                xVar.G(String.valueOf(map.get("se")));
            }
            if ((map.containsKey("sk") ? map : null) != null) {
                xVar.H(String.valueOf(map.get("sk")));
            }
            if ((map.containsKey(EventKeys.REGION) ? map : null) != null) {
                xVar.F(String.valueOf(map.get(EventKeys.REGION)));
            }
            if ((map.containsKey("state") ? map : null) != null) {
                xVar.I(String.valueOf(map.get("state")));
            }
            if ((map.containsKey("city") ? map : null) != null) {
                xVar.t(String.valueOf(map.get("city")));
            }
            if ((map.containsKey("chats") ? map : null) != null) {
                xVar.B(og.i.s(String.valueOf(map.get("chats"))));
            }
            if ((map.containsKey("visits") ? map : null) != null) {
                xVar.C(og.i.s(String.valueOf(map.get("visits"))));
            }
            if ((map.containsKey("noofdays") ? map : null) != null) {
                xVar.A(og.i.s(String.valueOf(map.get("noofdays"))));
            }
            if ((map.containsKey("totaltime") ? map : null) != null) {
                xVar.J(String.valueOf(map.get("totaltime")));
            }
            if ((map.containsKey("fintime") ? map : null) != null) {
                xVar.w(new Date(og.i.s(String.valueOf(map.get("fintime")))));
            }
            if ((map.containsKey("lvtime") ? map : null) != null) {
                xVar.y(new Date(og.i.s(String.valueOf(map.get("lvtime")))));
            }
        }
        return xVar;
    }

    public final WmsConversationsEventsHandler r() {
        return (WmsConversationsEventsHandler) this.f7997b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r2v30, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i10, String str, boolean z10, Hashtable hashtable, Continuation continuation) {
        g gVar;
        int i11;
        String str2;
        Object obj;
        Object obj2;
        Map map;
        String str3;
        b bVar;
        Object obj3;
        g gVar2;
        WaitingChatDetails waitingChatDetails;
        UTSUtil.ActionState actionState;
        String str4;
        String str5;
        String str6;
        SharedPreferences M10;
        SharedPreferences.Editor edit;
        String obj4;
        Object obj5;
        String str7;
        Object obj6;
        String str8;
        String str9;
        String str10;
        SalesIQChat salesIQChat;
        String str11;
        SalesIQChat.Extras extras;
        String convID;
        String str12;
        String str13;
        String str14;
        boolean z11;
        MessageEntity messageEntity;
        C6152a o10;
        List list;
        final String str15;
        Map map2;
        Rf.a aVar;
        final b bVar2;
        final SalesIQChat salesIQChat2;
        boolean z12;
        WaitingChatDetails waitingChatDetails2;
        final String str16;
        Object obj7;
        Object obj8;
        Object obj9;
        String obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        SharedPreferences.Editor edit2;
        Object obj15;
        boolean z13;
        Uf.j applicationManager;
        Handler p10;
        Intent intent;
        Application k10;
        SharedPreferences M11;
        SharedPreferences.Editor edit3;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i12 = gVar.f8036y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f8036y = i12 - Integer.MIN_VALUE;
                g gVar3 = gVar;
                Object obj16 = gVar3.f8034w;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = gVar3.f8036y;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj16);
                    Map map3 = hashtable != null ? MapsKt.toMap(hashtable) : null;
                    boolean isEmpty = LiveChatUtil.getAllOpenChatIds().isEmpty();
                    if (i10 != 10 && (Te.a.t(Md.a.Chat) || LiveChatUtil.isHideOutsideBusinessHours())) {
                        LiveChatUtil.log("ConversationUtsEventsHandler, handleTrigger: " + i10 + ", " + str + ", Ignored as hide outside business hours or hide when offline is enabled.");
                        return null;
                    }
                    if (l().Y() == null && UTSUtil.isTrackingEnabled()) {
                        return null;
                    }
                    Pe.b I10 = Te.a.I(str);
                    WaitingChatDetails D10 = Tf.b.D(str);
                    boolean z14 = z10 || isEmpty || D10 != null;
                    Hashtable hashtable2 = new Hashtable();
                    hashtable2.put("triggerinfo", map3);
                    hashtable2.put("type", Boxing.boxInt(i10));
                    String Y10 = l().Y();
                    if (Y10 != null) {
                        hashtable2.put("zldt", Y10);
                        Unit unit = Unit.INSTANCE;
                    }
                    SharedPreferences M12 = C6218a.M();
                    if (M12 != null && (edit2 = M12.edit()) != null) {
                        edit2.putString("trigger", AbstractC6574b.g(hashtable2));
                        edit2.apply();
                    }
                    String obj17 = (map3 == null || (obj14 = map3.get("botid")) == null) ? null : obj14.toString();
                    a.C0198a c0198a = Rf.a.Companion;
                    Rf.a a10 = c0198a.a((map3 == null || (obj13 = map3.get("action_type")) == null) ? null : obj13.toString());
                    boolean z15 = z14;
                    String str17 = obj17;
                    str2 = "executedtriggerid";
                    obj = "triggerid";
                    if (i10 != 2 || !z15) {
                        if (i10 != 16 || !z15) {
                            if (i10 != 10 || map3 == null) {
                                return null;
                            }
                            LiveChatUtil.triggerSalesIQListener("TRIGGER", String.valueOf(map3.get("triggername")), q(map3));
                            if (UTSUtil.isTrackingEnabled()) {
                                obj2 = null;
                                UTSUtil.updateBotTriggeredActionsList(TrackingHelper.INVOKE_JS_API, UTSUtil.ActionState.Triggered, null);
                                UTSUtil.sendTriggerAcknowledgement(String.valueOf(map3.get(obj)));
                            } else {
                                obj2 = null;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            return obj2;
                        }
                        rd.b.b();
                        String valueOf = String.valueOf(map3 != null ? map3.get("dname") : null);
                        String valueOf2 = String.valueOf(map3 != null ? map3.get("attender") : null);
                        Object obj18 = "dname";
                        String valueOf3 = String.valueOf(map3 != null ? map3.get("sender") : null);
                        String valueOf4 = String.valueOf(map3 != null ? map3.get(obj) : null);
                        String str18 = valueOf3;
                        Object obj19 = map3 != null ? map3.get("msglist") : null;
                        Object obj20 = "sender";
                        ArrayList arrayList = obj19 instanceof ArrayList ? (ArrayList) obj19 : null;
                        if (arrayList != null) {
                            Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                            Map map4 = firstOrNull instanceof Map ? (Map) firstOrNull : null;
                            Map map5 = map4 != null ? MapsKt.toMap(map4) : null;
                            Object obj21 = map5 != null ? map5.get("msg") : null;
                            if (og.i.d(Boxing.boxInt(arrayList.size()), 1)) {
                                Object obj22 = arrayList.get(arrayList.size() - 1);
                                Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                                map = MapsKt.toMap((Map) obj22);
                            } else {
                                map = null;
                            }
                            if (str == null) {
                                String uuid = UUID.randomUUID().toString();
                                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                                str3 = uuid;
                            } else {
                                str3 = str;
                            }
                            SalesIQChat salesIQChat3 = new SalesIQChat(str3, str3, null, rd.b.f(), 6, SalesIQChat.c.Chat);
                            String str19 = str3;
                            salesIQChat3.setAttenderName(valueOf);
                            salesIQChat3.setQuestion(String.valueOf(obj21));
                            salesIQChat3.setIsBotAttender(true);
                            salesIQChat3.setVisitid("0100");
                            if (map != null) {
                                Application k11 = k();
                                salesIQChat3.setLastMessage(k11 != null ? MessageRoomToDomainKt.g(vf.c.i(map, og.i.b(), salesIQChat3.getChid(), null, null, 12, null), k11, m(), false, false, null, null, 60, null) : null);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            salesIQChat3.setAttenderid(valueOf2);
                            salesIQChat3.setLastmsgtime(rd.b.f());
                            Object obj23 = map3.get("encrypted_visitor_info");
                            String obj24 = obj23 != null ? obj23.toString() : null;
                            Object obj25 = map3.get("encrypted_object");
                            String obj26 = obj25 != null ? obj25.toString() : null;
                            Object obj27 = map3.get("delay");
                            Long longOrNull = (obj27 == null || (obj4 = obj27.toString()) == null) ? null : StringsKt.toLongOrNull(obj4);
                            Object obj28 = map3.get("trigger_data");
                            String v10 = obj28 != null ? m().v(obj28) : null;
                            String v11 = !map3.containsKey("encrypted_visitor_info") ? m().v(map3) : null;
                            Object obj29 = map3.get("action_type");
                            salesIQChat3.setTriggerData(new SalesIQChat.b(obj24, obj26, longOrNull, v10, v11, c0198a.a(obj29 != null ? obj29.toString() : null)));
                            salesIQChat3.setExtras(I10 != null ? new SalesIQChat.Extras(new SalesIQChat.Extras.a(I10.i(), I10.c(), I10.g(), I10.d())) : null);
                            Object obj30 = map3.get("departments");
                            ArrayList arrayList2 = obj30 instanceof ArrayList ? (ArrayList) obj30 : null;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            if (og.i.f(D10 != null ? D10.getDepartmentName() : null)) {
                                ?? f10 = AbstractC3945n.f(D10 != null ? D10.getDepartmentName() : null);
                                objectRef.element = f10;
                                if (!og.i.f(f10)) {
                                    Intrinsics.checkNotNull(D10);
                                    x(D10, true);
                                    Te.a aVar2 = Te.a.f11572a;
                                    we.e a11 = we.e.f67680b.a(we.d.f67674y);
                                    gVar3.f8036y = 3;
                                    if (aVar2.q0(str19, a11, gVar3) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return null;
                                }
                                salesIQChat3.setDepartmentName(D10 != null ? D10.getDepartmentName() : null);
                                salesIQChat3.setDeptid((String) objectRef.element);
                                bVar = this;
                                obj3 = coroutine_suspended;
                                gVar2 = gVar3;
                                waitingChatDetails = D10;
                                actionState = null;
                            } else {
                                bVar = this;
                                obj3 = coroutine_suspended;
                                gVar2 = gVar3;
                                waitingChatDetails = D10;
                                actionState = null;
                                if (arrayList2 != null && arrayList2.size() == 1) {
                                    ?? first = CollectionsKt.first((List<? extends ??>) arrayList2);
                                    objectRef.element = first;
                                    salesIQChat3.setDeptid((String) first);
                                    Iterator it = AbstractC3945n.d().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Channel.Department department = (Channel.Department) it.next();
                                        if (StringsKt.equals(department.getId(), (String) objectRef.element, true)) {
                                            salesIQChat3.setDepartmentName(department.getName());
                                            break;
                                        }
                                    }
                                }
                            }
                            if (arrayList2 != null) {
                                if (salesIQChat3.getDeptid() != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj31 : arrayList2) {
                                        if (Intrinsics.areEqual((String) obj31, salesIQChat3.getDeptid())) {
                                            arrayList3.add(obj31);
                                        }
                                    }
                                    arrayList2 = arrayList3;
                                }
                                AbstractC3945n.b(str19, arrayList2);
                            }
                            boolean isEmpty2 = LiveChatUtil.getAllOpenChatIds().isEmpty();
                            int i13 = 0;
                            Q.f44447F.J(false);
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat3, true);
                            String convID2 = salesIQChat3.getConvID();
                            if (UTSUtil.isTrackingEnabled()) {
                                str5 = str17;
                                UTSUtil.updateBotTriggeredActionsList(str5, actionState, UTSUtil.getCustomActions(str17));
                                if (UTSAdapter.getConnStatus() != UTSAdapter.Status.DISCONNECTED || (M10 = C6218a.M()) == null || (edit = M10.edit()) == null) {
                                    str4 = valueOf4;
                                } else {
                                    str4 = valueOf4;
                                    edit.putString(str2, str4);
                                    edit.apply();
                                }
                            } else {
                                str4 = valueOf4;
                                str5 = str17;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int size = arrayList.size();
                            while (i13 < size) {
                                Object obj32 = arrayList.get(i13);
                                ArrayList arrayList5 = arrayList;
                                Map map6 = obj32 instanceof Map ? (Map) obj32 : null;
                                Map mutableMap = map6 != null ? MapsKt.toMutableMap(map6) : null;
                                String str20 = str18;
                                int i14 = size;
                                Object obj33 = obj20;
                                if (mutableMap != null) {
                                    mutableMap.put(obj33, str20);
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                obj20 = obj33;
                                Object obj34 = obj18;
                                if (mutableMap != null) {
                                    mutableMap.put(obj34, valueOf);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                                obj18 = obj34;
                                if (mutableMap != null) {
                                    str6 = str5;
                                    if (!mutableMap.containsKey("time")) {
                                        mutableMap.put("time", mutableMap.get("msgid"));
                                    }
                                } else {
                                    str6 = str5;
                                }
                                if (mutableMap != null) {
                                    Boxing.boxBoolean(arrayList4.add(mutableMap));
                                }
                                i13++;
                                size = i14;
                                arrayList = arrayList5;
                                str18 = str20;
                                str5 = str6;
                            }
                            Ue.a.c(salesIQChat3);
                            WmsConversationsEventsHandler.V(bVar.r(), arrayList4, null, salesIQChat3.getChid(), true, a10, false, new f(str5, str4, waitingChatDetails, bVar, isEmpty2, str, str19), 32, null);
                            Te.a aVar3 = Te.a.f11572a;
                            we.e b10 = we.e.f67680b.b(salesIQChat3);
                            gVar2.f8025n = convID2;
                            gVar2.f8036y = 4;
                            return aVar3.q0(str19, b10, gVar2) == obj3 ? obj3 : convID2;
                        }
                        return null;
                    }
                    rd.b.b();
                    String valueOf5 = String.valueOf(map3 != null ? map3.get("sendername") : null);
                    String valueOf6 = String.valueOf(map3 != null ? map3.get("message") : null);
                    if (map3 != null) {
                        str7 = "message";
                        obj6 = "delay";
                        obj5 = "encrypted_object";
                        if (map3.containsKey("attenderdetails")) {
                            Object obj35 = map3.get("attenderdetails");
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map map7 = MapsKt.toMap((Map) obj35);
                            str9 = String.valueOf(map7.get("attender"));
                            str8 = String.valueOf(map7.get("imagefkey"));
                            if (str != null) {
                                String uuid2 = UUID.randomUUID().toString();
                                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                                str10 = uuid2;
                            } else {
                                str10 = str;
                            }
                            salesIQChat = new SalesIQChat(str10, str != null ? "trigger_temp_chid" : str, null, rd.b.f(), 6, SalesIQChat.c.Chat);
                            String str21 = str10;
                            salesIQChat.setAttenderName(valueOf5);
                            salesIQChat.setQuestion(valueOf6);
                            HashMap hashMap = new HashMap();
                            hashMap.put("sender", str9 != null ? valueOf5 : str9);
                            hashMap.put("msg", valueOf6);
                            hashMap.put("mtype", "12");
                            Application k12 = k();
                            salesIQChat.setLastMessage(k12 == null ? MessageRoomToDomainKt.g(vf.c.g(hashMap, og.i.b(), salesIQChat.getChid(), null, salesIQChat), k12, m(), false, false, null, null, 60, null) : null);
                            salesIQChat.setAttenderImgkey(str8);
                            salesIQChat.setAttenderid(str9);
                            salesIQChat.setIsBotAttender(true);
                            if (I10 == null) {
                                str11 = str9;
                                extras = new SalesIQChat.Extras(new SalesIQChat.Extras.a(I10.i(), I10.c(), I10.g(), I10.d()));
                            } else {
                                str11 = str9;
                                extras = null;
                            }
                            salesIQChat.setExtras(extras);
                            if (og.i.f(D10 == null ? D10.getDepartmentName() : null)) {
                                String departmentName = D10 != null ? D10.getDepartmentName() : null;
                                String f11 = AbstractC3945n.f(departmentName);
                                if (departmentName == null) {
                                    Intrinsics.checkNotNull(D10);
                                    x(D10, true);
                                    Te.a aVar4 = Te.a.f11572a;
                                    we.e a12 = we.e.f67680b.a(we.d.f67674y);
                                    gVar3.f8036y = 1;
                                    if (aVar4.q0(str21, a12, gVar3) != coroutine_suspended) {
                                        return null;
                                    }
                                    return coroutine_suspended;
                                }
                                salesIQChat.setDepartmentName(departmentName);
                                salesIQChat.setDeptid(f11);
                            }
                            if (D10 != null && !D10.isIntelligentTrigger()) {
                                salesIQChat.setUnreadCount(1);
                            }
                            salesIQChat.setTriggerData(new SalesIQChat.b((map3 != null || (obj12 = map3.get("encrypted_visitor_info")) == null) ? null : obj12.toString(), (map3 != null || (obj11 = map3.get(obj5)) == null) ? null : obj11.toString(), (map3 != null || (obj9 = map3.get(obj6)) == null || (obj10 = obj9.toString()) == null) ? null : StringsKt.toLongOrNull(obj10), (map3 != null || (obj8 = map3.get("trigger_data")) == null) ? null : m().v(obj8), map3 == null && map3.containsKey("encrypted_visitor_info") ? map3 == null ? m().v(map3) : null : null, c0198a.a((map3 != null || (obj7 = map3.get("action_type")) == null) ? null : obj7.toString())));
                            LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                            salesIQChat.setVisitid("0100");
                            salesIQChat.setUnreadCount(salesIQChat.getUnreadCount() + 1);
                            long f12 = rd.b.f();
                            salesIQChat.setLastmsgtime(f12);
                            boolean isEmpty3 = LiveChatUtil.getAllOpenChatIds().isEmpty();
                            convID = salesIQChat.getConvID();
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                            String convID3 = salesIQChat.getConvID();
                            String visitorid = salesIQChat.getVisitorid();
                            String chid = salesIQChat.getChid();
                            String rchatid = salesIQChat.getRchatid();
                            com.google.gson.k kVar = new com.google.gson.k();
                            kVar.p("text", valueOf6);
                            String hVar = kVar.toString();
                            com.google.gson.k kVar2 = new com.google.gson.k();
                            kVar2.p("text", og.i.u(valueOf6));
                            String hVar2 = kVar2.toString();
                            String v12 = m().v(new Message.b(valueOf5, m.b(valueOf5)));
                            String valueOf7 = String.valueOf(f12);
                            String stringValue = Message.g.Text.getStringValue();
                            int ordinal = Message.f.Sent.ordinal();
                            MessageEntity.Time time = new MessageEntity.Time(f12, f12, 0L, 0L, 0L, null, 60, null);
                            if (og.i.e(str11)) {
                                str12 = valueOf7;
                                str13 = stringValue;
                                str14 = str11;
                            } else {
                                str12 = valueOf7;
                                str13 = stringValue;
                                str14 = str11;
                                if (Intrinsics.areEqual(str14, l().V())) {
                                    z11 = true;
                                    String v13 = m().v(new Message.Extras(null, null, 0L, 0L, null, null, Boxing.boxBoolean(true), null, false, 447, null));
                                    Intrinsics.checkNotNull(chid);
                                    messageEntity = new MessageEntity(convID3, visitorid, chid, rchatid, null, str13, Boxing.boxInt(ordinal), str12, "", hVar, hVar2, null, str14, v12, null, null, null, false, null, null, null, null, null, null, z11, v13, time, 16762896, null);
                                    o10 = o();
                                    gVar3.f8025n = this;
                                    gVar3.f8026o = map3;
                                    gVar3.f8027p = convID;
                                    gVar3.f8028q = D10;
                                    gVar3.f8029r = a10;
                                    gVar3.f8030s = valueOf5;
                                    gVar3.f8031t = valueOf6;
                                    gVar3.f8032u = salesIQChat;
                                    gVar3.f8033v = isEmpty3;
                                    gVar3.f8036y = 2;
                                    list = null;
                                    if (C6152a.U(o10, messageEntity, false, gVar3, 2, null) != coroutine_suspended) {
                                        str15 = valueOf5;
                                        map2 = map3;
                                        aVar = a10;
                                        bVar2 = this;
                                        salesIQChat2 = salesIQChat;
                                        z12 = isEmpty3;
                                        waitingChatDetails2 = D10;
                                        str16 = valueOf6;
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            z11 = false;
                            String v132 = m().v(new Message.Extras(null, null, 0L, 0L, null, null, Boxing.boxBoolean(true), null, false, 447, null));
                            Intrinsics.checkNotNull(chid);
                            messageEntity = new MessageEntity(convID3, visitorid, chid, rchatid, null, str13, Boxing.boxInt(ordinal), str12, "", hVar, hVar2, null, str14, v12, null, null, null, false, null, null, null, null, null, null, z11, v132, time, 16762896, null);
                            o10 = o();
                            gVar3.f8025n = this;
                            gVar3.f8026o = map3;
                            gVar3.f8027p = convID;
                            gVar3.f8028q = D10;
                            gVar3.f8029r = a10;
                            gVar3.f8030s = valueOf5;
                            gVar3.f8031t = valueOf6;
                            gVar3.f8032u = salesIQChat;
                            gVar3.f8033v = isEmpty3;
                            gVar3.f8036y = 2;
                            list = null;
                            if (C6152a.U(o10, messageEntity, false, gVar3, 2, null) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        obj5 = "encrypted_object";
                        str7 = "message";
                        obj6 = "delay";
                    }
                    str8 = null;
                    str9 = null;
                    if (str != null) {
                    }
                    salesIQChat = new SalesIQChat(str10, str != null ? "trigger_temp_chid" : str, null, rd.b.f(), 6, SalesIQChat.c.Chat);
                    String str212 = str10;
                    salesIQChat.setAttenderName(valueOf5);
                    salesIQChat.setQuestion(valueOf6);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("sender", str9 != null ? valueOf5 : str9);
                    hashMap2.put("msg", valueOf6);
                    hashMap2.put("mtype", "12");
                    Application k122 = k();
                    salesIQChat.setLastMessage(k122 == null ? MessageRoomToDomainKt.g(vf.c.g(hashMap2, og.i.b(), salesIQChat.getChid(), null, salesIQChat), k122, m(), false, false, null, null, 60, null) : null);
                    salesIQChat.setAttenderImgkey(str8);
                    salesIQChat.setAttenderid(str9);
                    salesIQChat.setIsBotAttender(true);
                    if (I10 == null) {
                    }
                    salesIQChat.setExtras(extras);
                    if (og.i.f(D10 == null ? D10.getDepartmentName() : null)) {
                    }
                    if (D10 != null) {
                        salesIQChat.setUnreadCount(1);
                    }
                    if (map3 != null) {
                    }
                    if (map3 != null) {
                    }
                    if (map3 != null) {
                    }
                    if (map3 != null) {
                    }
                    if (map3 == null) {
                    }
                    salesIQChat.setTriggerData(new SalesIQChat.b((map3 != null || (obj12 = map3.get("encrypted_visitor_info")) == null) ? null : obj12.toString(), (map3 != null || (obj11 = map3.get(obj5)) == null) ? null : obj11.toString(), (map3 != null || (obj9 = map3.get(obj6)) == null || (obj10 = obj9.toString()) == null) ? null : StringsKt.toLongOrNull(obj10), (map3 != null || (obj8 = map3.get("trigger_data")) == null) ? null : m().v(obj8), map3 == null && map3.containsKey("encrypted_visitor_info") ? map3 == null ? m().v(map3) : null : null, c0198a.a((map3 != null || (obj7 = map3.get("action_type")) == null) ? null : obj7.toString())));
                    LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                    salesIQChat.setVisitid("0100");
                    salesIQChat.setUnreadCount(salesIQChat.getUnreadCount() + 1);
                    long f122 = rd.b.f();
                    salesIQChat.setLastmsgtime(f122);
                    boolean isEmpty32 = LiveChatUtil.getAllOpenChatIds().isEmpty();
                    convID = salesIQChat.getConvID();
                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                    String convID32 = salesIQChat.getConvID();
                    String visitorid2 = salesIQChat.getVisitorid();
                    String chid2 = salesIQChat.getChid();
                    String rchatid2 = salesIQChat.getRchatid();
                    com.google.gson.k kVar3 = new com.google.gson.k();
                    kVar3.p("text", valueOf6);
                    String hVar3 = kVar3.toString();
                    com.google.gson.k kVar22 = new com.google.gson.k();
                    kVar22.p("text", og.i.u(valueOf6));
                    String hVar22 = kVar22.toString();
                    String v122 = m().v(new Message.b(valueOf5, m.b(valueOf5)));
                    String valueOf72 = String.valueOf(f122);
                    String stringValue2 = Message.g.Text.getStringValue();
                    int ordinal2 = Message.f.Sent.ordinal();
                    MessageEntity.Time time2 = new MessageEntity.Time(f122, f122, 0L, 0L, 0L, null, 60, null);
                    if (og.i.e(str11)) {
                    }
                    z11 = false;
                    String v1322 = m().v(new Message.Extras(null, null, 0L, 0L, null, null, Boxing.boxBoolean(true), null, false, 447, null));
                    Intrinsics.checkNotNull(chid2);
                    messageEntity = new MessageEntity(convID32, visitorid2, chid2, rchatid2, null, str13, Boxing.boxInt(ordinal2), str12, "", hVar3, hVar22, null, str14, v122, null, null, null, false, null, null, null, null, null, null, z11, v1322, time2, 16762896, null);
                    o10 = o();
                    gVar3.f8025n = this;
                    gVar3.f8026o = map3;
                    gVar3.f8027p = convID;
                    gVar3.f8028q = D10;
                    gVar3.f8029r = a10;
                    gVar3.f8030s = valueOf5;
                    gVar3.f8031t = valueOf6;
                    gVar3.f8032u = salesIQChat;
                    gVar3.f8033v = isEmpty32;
                    gVar3.f8036y = 2;
                    list = null;
                    if (C6152a.U(o10, messageEntity, false, gVar3, 2, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj16);
                    return null;
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj16);
                        return null;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str22 = (String) gVar3.f8025n;
                    ResultKt.throwOnFailure(obj16);
                    return str22;
                }
                z12 = gVar3.f8033v;
                salesIQChat2 = (SalesIQChat) gVar3.f8032u;
                str16 = (String) gVar3.f8031t;
                str15 = (String) gVar3.f8030s;
                aVar = (Rf.a) gVar3.f8029r;
                waitingChatDetails2 = (WaitingChatDetails) gVar3.f8028q;
                convID = (String) gVar3.f8027p;
                map2 = (Map) gVar3.f8026o;
                bVar2 = (b) gVar3.f8025n;
                ResultKt.throwOnFailure(obj16);
                str2 = "executedtriggerid";
                str7 = "message";
                obj = "triggerid";
                list = null;
                if (UTSUtil.isTrackingEnabled()) {
                    UTSUtil.updateBotTriggeredActionsList(TrackingHelper.INTELLIGENT_TRIGGER, UTSUtil.ActionState.Triggered, list);
                    if (UTSAdapter.getConnStatus() == UTSAdapter.Status.DISCONNECTED && (M11 = C6218a.M()) != null && (edit3 = M11.edit()) != null) {
                        obj15 = obj;
                        edit3.putString(str2, String.valueOf(map2 != null ? map2.get(obj15) : list));
                        edit3.apply();
                        Ue.a.c(salesIQChat2);
                        if (waitingChatDetails2 != null) {
                            z13 = true;
                            if (waitingChatDetails2.isIntelligentTrigger()) {
                                y(bVar2, waitingChatDetails2, false, 2, list);
                                UTSUtil.sendTriggerAcknowledgement(String.valueOf(map2 == null ? map2.get(obj15) : list));
                                intent = new Intent("receivelivechat");
                                if (z12 || !C6218a.k() || (!LiveChatUtil.isMultipleChatsDisabled() && LiveChatUtil.isConversationEnabled())) {
                                    intent.putExtra(str7, "refreshchat");
                                    intent.putExtra("chid", salesIQChat2.getChid());
                                } else {
                                    intent.putExtra(str7, "triggered_chat");
                                    intent.putExtra("must_force_load_triggered_chat", z13);
                                }
                                k10 = bVar2.k();
                                if (k10 != null) {
                                    Boxing.boxBoolean(C1908a.b(k10).d(intent));
                                }
                                return convID;
                            }
                        } else {
                            z13 = true;
                        }
                        if (aVar != Rf.a.Clicked && LiveChatUtil.canShowInAppNotification() && (applicationManager = ZohoLiveChat.getApplicationManager()) != null && (p10 = applicationManager.p()) != null) {
                            Boxing.boxBoolean(p10.post(new Runnable() { // from class: Ne.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.t(b.this, salesIQChat2, str15, str16);
                                }
                            }));
                        }
                        UTSUtil.sendTriggerAcknowledgement(String.valueOf(map2 == null ? map2.get(obj15) : list));
                        intent = new Intent("receivelivechat");
                        if (z12) {
                        }
                        intent.putExtra(str7, "refreshchat");
                        intent.putExtra("chid", salesIQChat2.getChid());
                        k10 = bVar2.k();
                        if (k10 != null) {
                        }
                        return convID;
                    }
                }
                obj15 = obj;
                Ue.a.c(salesIQChat2);
                if (waitingChatDetails2 != null) {
                }
                if (aVar != Rf.a.Clicked) {
                    Boxing.boxBoolean(p10.post(new Runnable() { // from class: Ne.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.t(b.this, salesIQChat2, str15, str16);
                        }
                    }));
                }
                UTSUtil.sendTriggerAcknowledgement(String.valueOf(map2 == null ? map2.get(obj15) : list));
                intent = new Intent("receivelivechat");
                if (z12) {
                }
                intent.putExtra(str7, "refreshchat");
                intent.putExtra("chid", salesIQChat2.getChid());
                k10 = bVar2.k();
                if (k10 != null) {
                }
                return convID;
            }
        }
        gVar = new g(continuation);
        g gVar32 = gVar;
        Object obj162 = gVar32.f8034w;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = gVar32.f8036y;
        if (i11 != 0) {
        }
        if (UTSUtil.isTrackingEnabled()) {
        }
        obj15 = obj;
        Ue.a.c(salesIQChat2);
        if (waitingChatDetails2 != null) {
        }
        if (aVar != Rf.a.Clicked) {
        }
        UTSUtil.sendTriggerAcknowledgement(String.valueOf(map2 == null ? map2.get(obj15) : list));
        intent = new Intent("receivelivechat");
        if (z12) {
        }
        intent.putExtra(str7, "refreshchat");
        intent.putExtra("chid", salesIQChat2.getChid());
        k10 = bVar2.k();
        if (k10 != null) {
        }
        return convID;
    }

    public final void u(Hashtable hashtable) {
        AbstractC1459k.d(j(), null, null, new i(hashtable, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(String str, MessageEntity messageEntity, boolean z10, boolean z11) {
        Intent intent;
        Application k10 = k();
        if (k10 == null) {
            return;
        }
        C1908a b10 = C1908a.b(k10);
        Intent intent2 = new Intent("receivelivechat");
        intent2.putExtra("message", "refreshchat");
        String chatId = str == null ? messageEntity != null ? messageEntity.getChatId() : null : str;
        if (chatId != null) {
            intent2.putExtra("chid", chatId);
        }
        if (z11) {
            if (og.i.e(messageEntity != null ? messageEntity.getDisplayName() : null)) {
                intent = intent2;
                if (intent != null) {
                    AbstractC5892d.n(k10, new long[]{0, 120, 1000, 0});
                    intent2.putExtra("show_connected_to_banner", true);
                    Message.b bVar = (Message.b) AbstractC5895g.b(m(), messageEntity != null ? messageEntity.getDisplayName() : null, Message.b.class);
                    intent2.putExtra("attender_name", bVar != null ? bVar.e() : null);
                }
                b10.d(intent2);
                if ((z10 ? this : null) == null) {
                    C1908a b11 = C1908a.b(k10);
                    Intent intent3 = new Intent("receivelivechat");
                    intent3.putExtra("chat_id", str);
                    intent3.putExtra("message", "endchattimer");
                    b11.d(intent3);
                    return;
                }
                return;
            }
        }
        intent = null;
        if (intent != null) {
        }
        b10.d(intent2);
        if ((z10 ? this : null) == null) {
        }
    }

    public final void x(WaitingChatDetails waitingChatDetails, boolean z10) {
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "triggered_chat");
        intent.putExtra("update_as_failed", z10);
        String acknowledgementKey = waitingChatDetails.getAcknowledgementKey();
        if (acknowledgementKey != null) {
            intent.putExtra("acknowledgement_key", acknowledgementKey);
        }
        if (og.i.e(waitingChatDetails.getAttenderId())) {
            intent.putExtra("bot_id", waitingChatDetails.getAttenderId());
        } else if (waitingChatDetails.isIntelligentTrigger()) {
            intent.putExtra("is_intelligent_trigger", true);
        }
        Application k10 = k();
        Intrinsics.checkNotNull(k10);
        C1908a.b(k10).d(intent);
    }

    public b() {
        this.f7996a = LazyKt.lazy(e.f8017d);
        this.f7997b = LazyKt.lazy(k.f8047d);
        this.f7998c = LazyKt.lazy(h.f8037d);
        this.f7999d = LazyKt.lazy(new j());
        this.f8000e = LazyKt.lazy(new C0163b());
    }
}
