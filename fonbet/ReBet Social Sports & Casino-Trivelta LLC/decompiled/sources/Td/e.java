package Td;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.P;
import Ph.h1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.activities.PreChatFormActivity;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.C3946o;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.zsiqcore.av.model.Sound;
import ge.C4377a;
import ie.EnumC4544a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ke.C5252a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import me.C5582a;
import od.AbstractC5886l;
import og.AbstractC5890b;
import og.AbstractC5892d;
import rd.C6218a;
import re.AbstractC6235a;
import re.C6239e;
import re.C6247m;
import td.C6461a;
import te.AbstractC6462a;
import ve.InterfaceC6686a;
import we.AbstractC6744a;
import we.d;
import we.e;
import xe.C6822a;
import zf.C6966g;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11456a;

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f11457b;

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f11458c;

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f11459d;

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f11460e;

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f11461f;

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f11462g;

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f11463h;

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f11464i;

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f11465j;

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f11466k;

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f11467l;

    /* renamed from: m, reason: collision with root package name */
    public static String f11468m;

    /* renamed from: n, reason: collision with root package name */
    public static String f11469n;

    /* renamed from: o, reason: collision with root package name */
    public static List f11470o;

    /* renamed from: p, reason: collision with root package name */
    public static InterfaceC6686a f11471p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f11472q;

    /* renamed from: r, reason: collision with root package name */
    public static Dg.b f11473r;

    public static final class A extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11474n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f11475o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Vd.a f11476p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.k f11477q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String str, Vd.a aVar, com.google.gson.k kVar, Continuation continuation) {
            super(2, continuation);
            this.f11475o = str;
            this.f11476p = aVar;
            this.f11477q = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new A(this.f11475o, this.f11476p, this.f11477q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((A) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11474n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f11475o;
                if (str == null) {
                    str = e.L();
                }
                if (str != null) {
                    Vd.a aVar = this.f11476p;
                    com.google.gson.k kVar = this.f11477q;
                    Xd.e e02 = e.f11456a.e0();
                    this.f11474n = 1;
                    if (e02.a(str, aVar, kVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class B extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11478n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11479o;

        /* renamed from: p, reason: collision with root package name */
        public int f11480p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.d f11481q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Channel f11482r;

        public static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Continuation f11483a;

            public a(Continuation continuation) {
                this.f11483a = continuation;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Ge.h.c(Ye.d.o(De.a.CallRecordingConsentAccepted, true), false, 1, null);
                Continuation continuation = this.f11483a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Boolean.TRUE));
            }
        }

        public static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Continuation f11484a;

            public b(Continuation continuation) {
                this.f11484a = continuation;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Continuation continuation = this.f11484a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Boolean.FALSE));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(androidx.appcompat.view.d dVar, Channel channel, Continuation continuation) {
            super(1, continuation);
            this.f11481q = dVar;
            this.f11482r = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new B(this.f11481q, this.f11482r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11480p;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            androidx.appcompat.view.d dVar = this.f11481q;
            Channel channel = this.f11482r;
            this.f11478n = dVar;
            this.f11479o = channel;
            this.f11480p = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            qe.d dVar2 = qe.d.f63485a;
            String string = dVar.getString(od.t.f60903M3);
            Channel.Recording recording = channel.getRecording();
            String callConsentMessage = recording != null ? recording.getCallConsentMessage() : null;
            if (!og.i.f(callConsentMessage)) {
                callConsentMessage = null;
            }
            if (callConsentMessage == null) {
                callConsentMessage = dVar.getString(od.t.f60897L3);
                Intrinsics.checkNotNullExpressionValue(callConsentMessage, "getString(...)");
            }
            qe.d.i(dVar, string, callConsentMessage, dVar.getString(od.t.f60885J3), new a(safeContinuation), null, dVar.getString(od.t.f60891K3), new b(safeContinuation), Boxing.boxInt(AbstractC5892d.h(dVar, Boxing.boxInt(AbstractC5886l.f59900w1), 0.0f, 2, null)), null, null, false, false, null, 13856, null);
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((B) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: Td.e$a, reason: case insensitive filesystem */
    public static final class C1686a extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11485n;

        /* renamed from: o, reason: collision with root package name */
        public int f11486o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.d f11487p;

        /* renamed from: Td.e$a$a, reason: collision with other inner class name */
        public static final class DialogInterfaceOnClickListenerC0223a implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f11488a;

            public DialogInterfaceOnClickListenerC0223a(Ref.ObjectRef objectRef) {
                this.f11488a = objectRef;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C1686a.j(this.f11488a, true);
            }
        }

        /* renamed from: Td.e$a$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f11489a;

            public b(Ref.ObjectRef objectRef) {
                this.f11489a = objectRef;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C1686a.j(this.f11489a, false);
            }
        }

        /* renamed from: Td.e$a$c */
        public static final class c implements DialogInterface.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f11490a;

            public c(Ref.ObjectRef objectRef) {
                this.f11490a = objectRef;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1686a.j(this.f11490a, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1686a(androidx.appcompat.view.d dVar, Continuation continuation) {
            super(1, continuation);
            this.f11487p = dVar;
        }

        public static final void j(Ref.ObjectRef objectRef, boolean z10) {
            Continuation continuation = (Continuation) objectRef.element;
            if (continuation != null) {
                continuation.resumeWith(Result.m147constructorimpl(Boolean.valueOf(z10)));
            }
            objectRef.element = null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C1686a(this.f11487p, continuation);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlin.coroutines.SafeContinuation] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11486o;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            androidx.appcompat.view.d dVar = this.f11487p;
            this.f11485n = dVar;
            this.f11486o = 1;
            ?? safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = safeContinuation;
            qe.d.i(dVar, dVar.getString(od.t.f60970X4), dVar.getString(od.t.f60964W4), dVar.getString(od.t.f60873H3), new DialogInterfaceOnClickListenerC0223a(objectRef), null, dVar.getString(od.t.f60867G3), new b(objectRef), null, null, new c(objectRef), false, false, null, 15104, null);
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((C1686a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: Td.e$b, reason: case insensitive filesystem */
    public static final class C1687b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1687b f11491d = new C1687b();

        public C1687b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            return new ArrayList();
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f11492d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Rd.a invoke() {
            return Rd.a.f10182d.a();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f11493d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4377a invoke() {
            return C4377a.f47235d.a(e.f11456a.z());
        }
    }

    /* renamed from: Td.e$e, reason: collision with other inner class name */
    public static final class C0224e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0224e f11494d = new C0224e();

        public C0224e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            return Ke.a.f6496j.a(e.f11456a.z());
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f11495d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C5252a invoke() {
            return new C5252a(e.f11456a.I());
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11496n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11497o;

        /* renamed from: p, reason: collision with root package name */
        public int f11498p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f11499q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ HashMap f11500r;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f11501n;

            /* renamed from: o, reason: collision with root package name */
            public int f11502o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Map.Entry f11503p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ String f11504q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Map f11505r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ P f11506s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map.Entry entry, String str, Map map, P p10, Continuation continuation) {
                super(2, continuation);
                this.f11503p = entry;
                this.f11504q = str;
                this.f11505r = map;
                this.f11506s = p10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f11503p, this.f11504q, this.f11505r, this.f11506s, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
            
                if (Td.e.g.j(r3, r4, r5, r6, r7, null, r12, 16, null) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
            
                if (r13 == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11502o;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C5252a R10 = e.f11456a.R();
                    String str = (String) this.f11503p.getValue();
                    String str2 = this.f11504q;
                    this.f11502o = 1;
                    obj = R10.a(str, str2, this);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C5582a c5582a = (C5582a) obj;
                String str3 = this.f11504q;
                Map map = this.f11505r;
                Map.Entry entry = this.f11503p;
                P p10 = this.f11506s;
                if (c5582a.d()) {
                    File file = new File(str3);
                    this.f11501n = c5582a;
                    this.f11502o = 2;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HashMap hashMap, Continuation continuation) {
            super(2, continuation);
            this.f11500r = hashMap;
        }

        public static final Object i(File file, Map map, Map.Entry entry, String str, P p10, Function2 function2, Continuation continuation) {
            if (file.exists() && file.length() > 0) {
                return map.put(entry.getKey(), str);
            }
            if (function2 == null) {
                return null;
            }
            Object invoke = function2.invoke(p10, continuation);
            return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
        }

        public static /* synthetic */ Object j(File file, Map map, Map.Entry entry, String str, P p10, Function2 function2, Continuation continuation, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                function2 = null;
            }
            return i(file, map, entry, str, p10, function2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = new g(this.f11500r, continuation);
            gVar.f11499q = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x008c -> B:5:0x008f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Map linkedHashMap;
            P p10;
            Iterator it;
            g gVar = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = gVar.f11498p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p11 = (P) gVar.f11499q;
                linkedHashMap = new LinkedHashMap();
                p10 = p11;
                it = gVar.f11500r.entrySet().iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it2 = (Iterator) gVar.f11497o;
                linkedHashMap = (Map) gVar.f11496n;
                P p12 = (P) gVar.f11499q;
                ResultKt.throwOnFailure(obj);
                it = it2;
                p10 = p12;
                gVar = this;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = e.f11472q + entry.getKey() + ".mp3";
                    File file = new File(str);
                    Map map = linkedHashMap;
                    a aVar = new a(entry, str, map, p10, null);
                    linkedHashMap = map;
                    gVar.f11499q = p10;
                    gVar.f11496n = linkedHashMap;
                    gVar.f11497o = it;
                    gVar.f11498p = 1;
                    if (i(file, linkedHashMap, entry, str, p10, aVar, gVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gVar = this;
                    if (it.hasNext()) {
                        e.O0(null, null, null, new Sound((String) linkedHashMap.get(Channel.CDN.a.Ringtone), (String) linkedHashMap.get(Channel.CDN.a.Ping), (String) linkedHashMap.get(Channel.CDN.a.Buzz), (String) linkedHashMap.get(Channel.CDN.a.OnHold), (String) linkedHashMap.get(Channel.CDN.a.Waiting), (String) linkedHashMap.get(Channel.CDN.a.ShortNotification)), 7, null);
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11507n;

        public static final class a implements InterfaceC6686a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1465n f11508a;

            public a(InterfaceC1465n interfaceC1465n) {
                this.f11508a = interfaceC1465n;
            }

            @Override // ve.InterfaceC6686a
            public final void a(we.e result) {
                Intrinsics.checkNotNullParameter(result, "result");
                InterfaceC1465n interfaceC1465n = this.f11508a;
                Result.Companion companion = Result.INSTANCE;
                interfaceC1465n.resumeWith(Result.m147constructorimpl(result.b()));
            }
        }

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11507n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f11507n = 1;
            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
            c1469p.F();
            e eVar = e.f11456a;
            e.f11471p = new a(c1469p);
            e.h();
            Object z10 = c1469p.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return z10 == coroutine_suspended ? coroutine_suspended : z10;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11509n;

        /* renamed from: o, reason: collision with root package name */
        public int f11510o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function1 f11511p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f11511p = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f11511p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11510o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function12 = this.f11511p;
                if (function12 != null) {
                    this.f11509n = function12;
                    this.f11510o = 1;
                    Object v10 = e.v(this);
                    if (v10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function12;
                    obj = v10;
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.f11509n;
            ResultKt.throwOnFailure(obj);
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f11512d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Xd.b invoke() {
            return new Xd.b(e.f11456a.E());
        }
    }

    public static final class k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11513n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11514o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f11515p;

        /* renamed from: r, reason: collision with root package name */
        public int f11517r;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11515p = obj;
            this.f11517r |= Integer.MIN_VALUE;
            return e.this.S(null, this);
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f11518d = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Xd.c invoke() {
            return new Xd.c(e.f11456a.E());
        }
    }

    public static final class m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11519n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11520o;

        /* renamed from: p, reason: collision with root package name */
        public Object f11521p;

        /* renamed from: q, reason: collision with root package name */
        public Object f11522q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f11523r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f11524s;

        /* renamed from: u, reason: collision with root package name */
        public int f11526u;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11524s = obj;
            this.f11526u |= Integer.MIN_VALUE;
            return e.this.i0(null, null, false, false, this);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11527n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11528o;

        /* renamed from: p, reason: collision with root package name */
        public int f11529p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Context f11530q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f11531r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f11532s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f11533t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Cg.b f11534u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context, Ref.ObjectRef objectRef, SalesIQChat salesIQChat, boolean z10, Cg.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f11530q = context;
            this.f11531r = objectRef;
            this.f11532s = salesIQChat;
            this.f11533t = z10;
            this.f11534u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f11530q, this.f11531r, this.f11532s, this.f11533t, this.f11534u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0144, code lost:
        
            if (r0 == r9) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x006a, code lost:
        
            if (r0 == r9) goto L75;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0121  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String attenderid;
            Object obj2;
            Object t10;
            C5582a c5582a;
            String convID;
            T t11;
            C5582a c5582a2;
            Cg.b bVar;
            Object S10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11529p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f11530q;
                if (context == null) {
                    context = MobilistenInitProvider.INSTANCE.e();
                }
                Object Q10 = e.Q((Pe.b) this.f11531r.element, this.f11532s);
                if (Q10 != null && context != null) {
                    wd.d dVar = wd.d.f67581a;
                    this.f11529p = 1;
                    t10 = dVar.t(context, Q10, this);
                } else if (!this.f11533t) {
                    e eVar = e.f11456a;
                    if (eVar.F()) {
                        SalesIQChat salesIQChat = this.f11532s;
                        attenderid = salesIQChat != null ? salesIQChat.getAttenderid() : null;
                        this.f11529p = 4;
                        Object S11 = eVar.S(attenderid, this);
                        if (S11 != coroutine_suspended) {
                            obj2 = S11;
                            e.W0(null, null, null, obj2, null, null, null, 119, null);
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
                t10 = obj;
                c5582a = (C5582a) t10;
                Ref.ObjectRef objectRef = this.f11531r;
                SalesIQChat salesIQChat2 = this.f11532s;
                if (c5582a.d()) {
                    Bitmap bitmap = (Bitmap) c5582a.b();
                    Pe.b bVar2 = (Pe.b) objectRef.element;
                    objectRef.element = bVar2 != null ? Pe.b.b(bVar2, null, null, null, null, AbstractC5890b.d(bitmap, null, 0, 3, null), null, 47, null) : 0;
                    e.W0(null, null, null, bitmap, null, null, null, 119, null);
                    if (salesIQChat2 != null && (convID = salesIQChat2.getConvID()) != null && (t11 = objectRef.element) != 0) {
                        Intrinsics.checkNotNull(t11);
                        Te.a.B0(convID, (Pe.b) t11);
                        Re.o f02 = e.f11456a.f0();
                        String chid = salesIQChat2.getChid();
                        Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                        SalesIQChat.Extras extras = salesIQChat2.getExtras();
                        if (extras == null) {
                            extras = new SalesIQChat.Extras(new SalesIQChat.Extras.a());
                        }
                        SalesIQChat.Extras extras2 = extras;
                        SalesIQChat.Extras.a aVar = extras2.attributes;
                        if (aVar != null) {
                            Pe.b bVar3 = (Pe.b) objectRef.element;
                            aVar.displayPicture = bVar3 != null ? bVar3.g() : null;
                        } else {
                            aVar = null;
                        }
                        extras2.attributes = aVar;
                        Unit unit = Unit.INSTANCE;
                        this.f11527n = c5582a;
                        this.f11529p = 2;
                        if (Re.o.b(f02, chid, null, null, null, extras2, this, 14, null) != coroutine_suspended) {
                            c5582a2 = c5582a;
                            c5582a = c5582a2;
                        }
                        return coroutine_suspended;
                    }
                }
                boolean z10 = this.f11533t;
                SalesIQChat salesIQChat3 = this.f11532s;
                bVar = this.f11534u;
                if (!c5582a.d()) {
                }
            } else if (i10 == 2) {
                c5582a2 = (C5582a) this.f11527n;
                ResultKt.throwOnFailure(obj);
                c5582a = c5582a2;
                boolean z102 = this.f11533t;
                SalesIQChat salesIQChat32 = this.f11532s;
                bVar = this.f11534u;
                if (!c5582a.d()) {
                    Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    if (!z102) {
                        e eVar2 = e.f11456a;
                        if (eVar2.F()) {
                            attenderid = salesIQChat32 != null ? salesIQChat32.getAttenderid() : null;
                            this.f11527n = c5582a;
                            this.f11528o = bVar;
                            this.f11529p = 3;
                            S10 = eVar2.S(attenderid, this);
                        } else {
                            e.W0(null, null, null, bVar.a(), null, null, null, 119, null);
                        }
                    }
                }
            } else if (i10 == 3) {
                Cg.b bVar4 = (Cg.b) this.f11528o;
                ResultKt.throwOnFailure(obj);
                bVar = bVar4;
                S10 = obj;
                if (S10 == null) {
                    S10 = bVar.a();
                }
                e.W0(null, null, null, S10, null, null, null, 119, null);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                e.W0(null, null, null, obj2, null, null, null, 119, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11535n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11536o;

        /* renamed from: p, reason: collision with root package name */
        public Object f11537p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f11538q;

        /* renamed from: s, reason: collision with root package name */
        public int f11540s;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11538q = obj;
            this.f11540s |= Integer.MIN_VALUE;
            return e.this.k0(null, null, null, this);
        }
    }

    public static final class p extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final p f11541d = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.i invoke() {
            return new Re.i(e.f11456a.J());
        }
    }

    public static final class q extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11542n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11543o;

        /* renamed from: p, reason: collision with root package name */
        public Object f11544p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f11545q;

        /* renamed from: s, reason: collision with root package name */
        public int f11547s;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11545q = obj;
            this.f11547s |= Integer.MIN_VALUE;
            return e.this.p0(null, null, null, null, this);
        }
    }

    public static final class r extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f11548n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Context f11549o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f11550p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Context context, String str, Continuation continuation) {
            super(1, continuation);
            this.f11549o = context;
            this.f11550p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new r(this.f11549o, this.f11550p, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11548n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            e eVar = e.f11456a;
            try {
                Result.Companion companion = Result.INSTANCE;
                e.h();
                m147constructorimpl = Result.m147constructorimpl(null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Result.m146boximpl(m147constructorimpl);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((r) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class s extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11551n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Context f11552o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f11553p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.f11552o = context;
            this.f11553p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new s(this.f11552o, this.f11553p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((s) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11551n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f11552o;
                String str = this.f11553p;
                this.f11551n = 1;
                if (e.u0(context, str, this) == coroutine_suspended) {
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

    public static final class u extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11555n;

        /* renamed from: o, reason: collision with root package name */
        public int f11556o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function1 f11557p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Context f11558q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Function1 function1, Context context, Continuation continuation) {
            super(2, continuation);
            this.f11557p = function1;
            this.f11558q = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new u(this.f11557p, this.f11558q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((u) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11556o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function12 = this.f11557p;
                e eVar = e.f11456a;
                Context context = this.f11558q;
                this.f11555n = function12;
                this.f11556o = 1;
                Object p10 = eVar.p(context, this);
                if (p10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function12;
                obj = p10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f11555n;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class v extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11559n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11560o;

        /* renamed from: p, reason: collision with root package name */
        public Object f11561p;

        /* renamed from: q, reason: collision with root package name */
        public Object f11562q;

        /* renamed from: r, reason: collision with root package name */
        public Object f11563r;

        /* renamed from: s, reason: collision with root package name */
        public Object f11564s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f11565t;

        /* renamed from: v, reason: collision with root package name */
        public int f11567v;

        public v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11565t = obj;
            this.f11567v |= Integer.MIN_VALUE;
            return e.this.G0(null, null, null, null, false, this);
        }
    }

    public static final class w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11568n;

        public w(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11568n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                e.O0(null, null, Boxing.boxBoolean(false), null, 11, null);
                this.f11568n = 1;
                if (AbstractC1440a0.a(6000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            e.O0(null, null, Boxing.boxBoolean(true), null, 11, null);
            return Unit.INSTANCE;
        }
    }

    public static final class x extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final x f11569d = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.m invoke() {
            return new Re.m(e.f11456a.J());
        }
    }

    public static final class y extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final y f11570d = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Xd.e invoke() {
            return new Xd.e(e.f11456a.E());
        }
    }

    public static final class z extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final z f11571d = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.o invoke() {
            return new Re.o(e.f11456a.J());
        }
    }

    static {
        e eVar = new e();
        f11456a = eVar;
        f11457b = LazyKt.lazy(C1687b.f11491d);
        f11458c = LazyKt.lazy(d.f11493d);
        f11459d = LazyKt.lazy(C0224e.f11494d);
        f11460e = LazyKt.lazy(c.f11492d);
        f11461f = LazyKt.lazy(f.f11495d);
        f11462g = LazyKt.lazy(z.f11571d);
        f11463h = LazyKt.lazy(x.f11569d);
        f11464i = LazyKt.lazy(p.f11541d);
        f11465j = LazyKt.lazy(j.f11512d);
        f11466k = LazyKt.lazy(l.f11518d);
        f11467l = LazyKt.lazy(y.f11570d);
        f11470o = eVar.N();
        f11472q = new C3946o(eVar.z()).e().getAbsolutePath() + "/av_media/";
        f11473r = Dg.b.f2756a;
    }

    public static final void A0(Ref.ObjectRef onComplete, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Ge.h.c(Ye.d.o(De.a.CallRecordingConsentAccepted, true), false, 1, null);
        z0(onComplete, true);
    }

    public static final String B() {
        String appName;
        Channel m10 = C6822a.m();
        if (m10 == null) {
            return null;
        }
        Channel.CallConfigurations callConfigurations = m10.getCallConfigurations();
        return (callConfigurations == null || (appName = callConfigurations.getAppName()) == null) ? m10.getAppName() : appName;
    }

    public static final void B0(Ref.ObjectRef onComplete, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        z0(onComplete, false);
    }

    public static final void C0(Ref.ObjectRef onComplete, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        z0(onComplete, false);
    }

    public static final ViewGroup D(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC5892d.b(context);
        throw new IllegalStateException("initialize() API of Mobilisten SDK is not invoked.");
    }

    public static /* synthetic */ void E0(e eVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        eVar.D0(context, z10);
    }

    public static final void F0(Context context, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        AbstractC1459k.d(f11456a.A(), null, null, new u(onComplete, context, null), 3, null);
    }

    public static final boolean H() {
        Resources resources;
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 == null || (resources = e10.getResources()) == null) {
            return true;
        }
        return resources.getBoolean(od.m.f59920g);
    }

    public static /* synthetic */ Object H0(e eVar, String str, String str2, String str3, EnumC4544a enumC4544a, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return eVar.G0(str, str2, str3, enumC4544a, z10, continuation);
    }

    public static final String K() {
        return null;
    }

    public static /* synthetic */ void K0(e eVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        eVar.J0(str, z10);
    }

    public static final String L() {
        return null;
    }

    public static final Dg.b M() {
        return null;
    }

    public static final void M0(Boolean bool, Boolean bool2, Boolean bool3) {
        O0(bool, bool2, bool3, null, 8, null);
    }

    public static final void N0(Boolean bool, Boolean bool2, Boolean bool3, Sound sound) {
        Object m147constructorimpl;
        try {
            m147constructorimpl = Result.m147constructorimpl(null);
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public static final List O(String str, boolean z10) {
        List list;
        List h10;
        Pe.b I10 = Te.a.I(str);
        List a02 = a0(z10);
        if (I10 == null || (list = I10.e()) == null || list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            I10 = null;
        }
        return (I10 == null || (h10 = I10.h(a02)) == null) ? a02 : h10;
    }

    public static /* synthetic */ void O0(Boolean bool, Boolean bool2, Boolean bool3, Sound sound, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            bool2 = null;
        }
        if ((i10 & 4) != 0) {
            bool3 = null;
        }
        if ((i10 & 8) != 0) {
            sound = null;
        }
        N0(bool, bool2, bool3, sound);
    }

    public static /* synthetic */ List P(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O(str, z10);
    }

    public static final void P0(Vd.a mediaAction) {
        Intrinsics.checkNotNullParameter(mediaAction, "mediaAction");
        R0(mediaAction, null, null, 6, null);
    }

    public static final Object Q(Pe.b bVar, SalesIQChat salesIQChat) {
        String g10;
        String d10;
        SalesIQChat.Extras extras;
        SalesIQChat.Extras extras2;
        SalesIQChat.Extras.a aVar;
        String str;
        String d11;
        if (salesIQChat != null && (extras2 = salesIQChat.getExtras()) != null && (aVar = extras2.attributes) != null && (str = aVar.displayPicture) != null && (d11 = og.m.d(str)) != null) {
            return d11;
        }
        if (salesIQChat != null && (extras = salesIQChat.getExtras()) != null) {
            extras.getCall();
        }
        Bitmap g11 = (bVar == null || (g10 = bVar.g()) == null || (d10 = og.m.d(g10)) == null) ? null : AbstractC5890b.g(d10);
        if (g11 != null) {
            return g11;
        }
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public static final void Q0(Vd.a mediaAction, String str, com.google.gson.k kVar) {
        Intrinsics.checkNotNullParameter(mediaAction, "mediaAction");
        AbstractC1459k.d(f11456a.y(), null, null, new A(str, mediaAction, kVar, null), 3, null);
    }

    public static /* synthetic */ void R0(Vd.a aVar, String str, com.google.gson.k kVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        Q0(aVar, str, kVar);
    }

    public static final void U0(List replyMessages) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(replyMessages, "replyMessages");
        if (replyMessages.isEmpty()) {
            arrayList = f11456a.N();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(replyMessages);
            arrayList = arrayList2;
        }
        f11470o = arrayList;
    }

    public static final String W(Pe.b bVar, SalesIQChat salesIQChat) {
        String i10;
        SalesIQChat.Extras extras;
        SalesIQChat.Extras extras2;
        SalesIQChat.Extras.a aVar;
        String str;
        String d10;
        if (salesIQChat != null && (extras2 = salesIQChat.getExtras()) != null && (aVar = extras2.attributes) != null && (str = aVar.name) != null && (d10 = og.m.d(str)) != null) {
            return d10;
        }
        if (salesIQChat != null && (extras = salesIQChat.getExtras()) != null) {
            extras.getCall();
        }
        if (bVar == null || (i10 = bVar.i()) == null) {
            return null;
        }
        return og.m.d(i10);
    }

    public static /* synthetic */ void W0(String str, String str2, String str3, Object obj, Integer num, String str4, Boolean bool, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        V0(str, str2, str3, obj, num, str4, bool);
    }

    public static final String X() {
        return f11469n;
    }

    public static final String Y() {
        return f11468m;
    }

    public static final List Z() {
        return b0(false, 1, null);
    }

    public static final List a0(boolean z10) {
        List list = (List) f11456a.U().a(z10).b();
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public static /* synthetic */ List b0(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a0(z10);
    }

    public static final /* synthetic */ Ag.b h() {
        return null;
    }

    public static final void h0(Ag.b contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
    }

    public static /* synthetic */ Object j0(e eVar, Context context, SalesIQChat salesIQChat, boolean z10, boolean z11, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return eVar.i0(context, salesIQChat, z10, z11, continuation);
    }

    public static final boolean m0() {
        return (M() == null || M() == Dg.b.f2756a || M() == Dg.b.f2764i || M() == Dg.b.f2766k || M() == Dg.b.f2765j) ? false : true;
    }

    public static final boolean n0() {
        return false;
    }

    public static final boolean o0() {
        return false;
    }

    public static /* synthetic */ Object q0(e eVar, View view, Activity activity, String str, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return eVar.p0(view, activity, str, function1, continuation);
    }

    public static /* synthetic */ Pair r(e eVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return eVar.q(str, str2, str3);
    }

    public static final void r0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void t(Application application, nd.b bVar) {
        Intrinsics.checkNotNullParameter(application, "application");
        O0(Boolean.TRUE, Boolean.valueOf(LiveChatUtil.isChatEnabled()), null, null, 12, null);
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 != null) {
            String languageOrNull = LiveChatUtil.getLanguageOrNull();
            if (languageOrNull == null) {
                Locale defaultSystemLocale = LiveChatUtil.getDefaultSystemLocale();
                languageOrNull = defaultSystemLocale != null ? defaultSystemLocale.getLanguage() : null;
            }
            if (languageOrNull != null) {
                v0(e10, languageOrNull);
            }
        }
    }

    public static final void u(Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        HashMap hashMap = new HashMap();
        Channel.CDN.a aVar = Channel.CDN.a.Ringtone;
        String c10 = AbstractC6462a.c(channel, aVar);
        if (c10 != null) {
        }
        Channel.CDN.a aVar2 = Channel.CDN.a.Waiting;
        String c11 = AbstractC6462a.c(channel, aVar2);
        if (c11 != null) {
        }
        Channel.CDN.a aVar3 = Channel.CDN.a.OnHold;
        String c12 = AbstractC6462a.c(channel, aVar3);
        if (c12 != null) {
            hashMap.put(aVar3, c12);
        }
        AbstractC1459k.d(f11456a.y(), null, null, new g(hashMap, null), 3, null);
    }

    public static final Object u0(Context context, String str, Continuation continuation) {
        Object b10 = C6461a.f65810a.b(new r(context, str, null), continuation);
        return b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b10 : Unit.INSTANCE;
    }

    public static final Object v(Continuation continuation) {
        return h1.d(30000L, new h(null), continuation);
    }

    public static final void v0(Context context, String languageCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        AbstractC1459k.d(f11456a.y(), null, null, new s(context, languageCode, null), 3, null);
    }

    public static final void w(Function1 function1) {
        AbstractC1459k.d(f11456a.y(), null, null, new i(function1, null), 3, null);
    }

    public static final String x(Pe.b bVar, SalesIQChat salesIQChat) {
        String c10;
        SalesIQChat.Extras extras;
        SalesIQChat.Extras extras2;
        SalesIQChat.Extras.a aVar;
        String str;
        String d10;
        if (salesIQChat != null && (extras2 = salesIQChat.getExtras()) != null && (aVar = extras2.attributes) != null && (str = aVar.additionalInfo) != null && (d10 = og.m.d(str)) != null) {
            return d10;
        }
        if (salesIQChat != null && (extras = salesIQChat.getExtras()) != null) {
            extras.getCall();
        }
        String d11 = (bVar == null || (c10 = bVar.c()) == null) ? null : og.m.d(c10);
        if (d11 != null) {
            return d11;
        }
        String departmentName = salesIQChat != null ? salesIQChat.getDepartmentName() : null;
        return departmentName == null ? "" : departmentName;
    }

    public static /* synthetic */ void x0(e eVar, String str, String str2, String str3, String str4, Object obj, Integer num, String str5, boolean z10, int i10, Object obj2) {
        if ((i10 & 16) != 0) {
            obj = null;
        }
        if ((i10 & 32) != 0) {
            num = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        if ((i10 & 128) != 0) {
            z10 = false;
        }
        eVar.w0(str, str2, str3, str4, obj, num, str5, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.appcompat.app.a y0(Context context, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = onComplete;
        Channel m10 = C6822a.m();
        if (m10 == null) {
            z0(objectRef, false);
            return null;
        }
        if (!m10.isAudioCallRecordingEnabled()) {
            z0(objectRef, true);
            return null;
        }
        if (Ye.d.f(De.a.CallRecordingConsentAccepted, false, 2, null)) {
            z0(objectRef, true);
            return null;
        }
        qe.d dVar2 = qe.d.f63485a;
        String string = dVar.getString(od.t.f60903M3);
        Channel.Recording recording = m10.getRecording();
        String callConsentMessage = recording != null ? recording.getCallConsentMessage() : null;
        if (!og.i.f(callConsentMessage)) {
            callConsentMessage = null;
        }
        if (callConsentMessage == null) {
            callConsentMessage = dVar.getString(od.t.f60897L3);
            Intrinsics.checkNotNullExpressionValue(callConsentMessage, "getString(...)");
        }
        return qe.d.i(dVar, string, callConsentMessage, dVar.getString(od.t.f60885J3), new DialogInterface.OnClickListener() { // from class: Td.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e.A0(Ref.ObjectRef.this, dialogInterface, i10);
            }
        }, null, dVar.getString(od.t.f60891K3), new DialogInterface.OnClickListener() { // from class: Td.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e.B0(Ref.ObjectRef.this, dialogInterface, i10);
            }
        }, Integer.valueOf(AbstractC5892d.h(dVar, Integer.valueOf(AbstractC5886l.f59900w1), 0.0f, 2, null)), null, new DialogInterface.OnDismissListener() { // from class: Td.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                e.C0(Ref.ObjectRef.this, dialogInterface);
            }
        }, false, false, null, 14880, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, Td.e$t] */
    public static final void z0(Ref.ObjectRef objectRef, boolean z10) {
        ((Function1) objectRef.element).invoke(Boolean.valueOf(z10));
        objectRef.element = t.f11554d;
    }

    public final P A() {
        return C6461a.f65810a.d();
    }

    public final List C() {
        return (List) f11457b.getValue();
    }

    public final Rd.a E() {
        return (Rd.a) f11460e.getValue();
    }

    public final boolean F() {
        Channel.Chat chat;
        Channel m10 = C6822a.m();
        return ((m10 == null || (chat = m10.getChat()) == null) ? false : Intrinsics.areEqual(chat.getShowOperatorImage(), Boolean.TRUE)) && Ye.d.e(De.a.CallsOperatorImageVisibility, true);
    }

    public final boolean G() {
        return Ye.d.e(De.a.CallsOperatorNameVisibility, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G0(String str, String str2, String str3, EnumC4544a enumC4544a, boolean z10, Continuation continuation) {
        v vVar;
        v vVar2;
        SalesIQChat salesIQChat;
        Message message;
        Object obj;
        String str4;
        String str5;
        String str6;
        Object a10;
        SalesIQChat salesIQChat2;
        String str7;
        String str8;
        String str9;
        e eVar;
        we.e eVar2;
        String str10;
        we.e a11;
        SalesIQChat salesIQChat3;
        Object obj2;
        String str11;
        String str12;
        Object b10;
        SalesIQChat salesIQChat4;
        String str13;
        C5582a c5582a;
        AbstractC6235a abstractC6235a;
        C5582a.b c10;
        AbstractC6235a abstractC6235a2;
        C5582a c5582a2;
        SalesIQChat salesIQChat5;
        String str14;
        we.d dVar;
        C5582a c5582a3;
        String string;
        String str15;
        C5582a c5582a4;
        AbstractC6235a abstractC6235a3;
        C5582a.b c11;
        String str16;
        String str17;
        AbstractC6235a abstractC6235a4;
        C5582a c5582a5;
        SalesIQChat salesIQChat6;
        we.d dVar2;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i10 = vVar.f11567v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f11567v = i10 - Integer.MIN_VALUE;
                vVar2 = vVar;
                Object obj3 = vVar2.f11565t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (vVar2.f11567v) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        Pair q10 = q(str, str2, str3);
                        salesIQChat = (SalesIQChat) q10.component1();
                        message = (Message) q10.component2();
                        if (salesIQChat == null || salesIQChat.getDeptid() == null) {
                            LiveChatUtil.log("Chat creation failed");
                            return we.e.f67680b.a(we.d.f67649d);
                        }
                        if (message != null) {
                            C6966g.u0(message);
                        }
                        if (enumC4544a != EnumC4544a.CallOnline) {
                            obj = coroutine_suspended;
                            str4 = "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error";
                            str5 = "getString(...)";
                            Re.i V10 = V();
                            String chid = salesIQChat.getChid();
                            str6 = "getChid(...)";
                            Intrinsics.checkNotNullExpressionValue(chid, str6);
                            String convID = salesIQChat.getConvID();
                            Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                            String deptid = salesIQChat.getDeptid();
                            Intrinsics.checkNotNull(deptid);
                            String content = message != null ? message.getContent() : null;
                            if (content == null) {
                                content = "";
                            }
                            String str18 = content;
                            String n10 = C6218a.n();
                            Pe.a aVar = Pe.a.Audio;
                            vVar2.f11559n = str2;
                            vVar2.f11560o = salesIQChat;
                            vVar2.f11567v = 5;
                            a10 = V10.a(chid, convID, deptid, str18, n10, aVar, vVar2);
                            if (a10 == obj) {
                                return obj;
                            }
                            salesIQChat2 = salesIQChat;
                            str7 = str2;
                            c5582a3 = (C5582a) a10;
                            if (c5582a3.d()) {
                                e eVar3 = f11456a;
                                string = eVar3.z().getString(C6239e.f64119d.b());
                                Intrinsics.checkNotNullExpressionValue(string, str5);
                                vVar2.f11559n = str7;
                                vVar2.f11560o = salesIQChat2;
                                vVar2.f11561p = c5582a3;
                                vVar2.f11562q = string;
                                vVar2.f11567v = 6;
                                if (eVar3.S0(string, vVar2) == obj) {
                                    return obj;
                                }
                                str15 = str7;
                                c5582a4 = c5582a3;
                                f11456a.L0(string, string);
                                String str19 = str15;
                                c5582a3 = c5582a4;
                                str7 = str19;
                            }
                            AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
                            if (!c5582a3.d()) {
                                C5582a.b c12 = c5582a3.c();
                                if (c12 == null || (abstractC6235a3 = AbstractC6235a.f64111c.a(c12, cVar)) == null) {
                                    abstractC6235a3 = AbstractC6235a.b.f64114d;
                                }
                                c11 = c5582a3.c();
                                Intrinsics.checkNotNull(c11, str4);
                                e eVar4 = f11456a;
                                String string2 = eVar4.z().getString(abstractC6235a3.b());
                                Intrinsics.checkNotNullExpressionValue(string2, str5);
                                vVar2.f11559n = str7;
                                vVar2.f11560o = salesIQChat2;
                                vVar2.f11561p = c5582a3;
                                vVar2.f11562q = c11;
                                vVar2.f11563r = abstractC6235a3;
                                vVar2.f11564s = string2;
                                vVar2.f11567v = 7;
                                if (eVar4.S0(string2, vVar2) == obj) {
                                    return obj;
                                }
                                str16 = string2;
                                str17 = str7;
                                abstractC6235a4 = abstractC6235a3;
                                if (M() != Dg.b.f2756a) {
                                    f11456a.L0(str16, str16);
                                }
                                if (abstractC6235a4.a() != C6247m.f64127d.a()) {
                                    com.zoho.livechat.android.modules.brand.ui.helpers.a aVar2 = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                                    Md.a[] aVarArr = {Md.a.Call};
                                    vVar2.f11559n = str17;
                                    vVar2.f11560o = salesIQChat2;
                                    vVar2.f11561p = c5582a3;
                                    vVar2.f11562q = null;
                                    vVar2.f11563r = null;
                                    vVar2.f11564s = null;
                                    vVar2.f11567v = 8;
                                    if (aVar2.O(aVarArr, vVar2) == obj) {
                                        return obj;
                                    }
                                    c5582a5 = c5582a3;
                                    salesIQChat6 = salesIQChat2;
                                    c5582a3 = c5582a5;
                                    salesIQChat2 = salesIQChat6;
                                    str7 = str17;
                                } else {
                                    Ud.b.f12184a.c(new AbstractC6744a.C0960a(c11.c()));
                                    str7 = str17;
                                }
                            }
                            salesIQChat3 = salesIQChat2;
                            if (c5582a3.d()) {
                                e.a aVar3 = we.e.f67680b;
                                C5582a.b c13 = c5582a3.c();
                                if (c13 != null) {
                                    Integer b11 = c13.b();
                                    dVar2 = new d.b(b11 != null ? b11.intValue() : -1, c13.c());
                                } else {
                                    dVar2 = we.d.f67649d;
                                }
                                a11 = aVar3.a(dVar2);
                            } else {
                                a11 = we.e.f67680b.b(LiveChatUtil.getChatWithAnyId(str7));
                            }
                            if (!a11.d()) {
                            }
                            return a11;
                        }
                        Application e10 = MobilistenInitProvider.INSTANCE.e();
                        vVar2.f11559n = this;
                        vVar2.f11560o = str2;
                        str8 = str3;
                        vVar2.f11561p = str8;
                        vVar2.f11562q = salesIQChat;
                        vVar2.f11563r = message;
                        vVar2.f11567v = 1;
                        obj3 = i0(e10, salesIQChat, true, z10, vVar2);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str9 = str2;
                        eVar = this;
                        eVar2 = (we.e) obj3;
                        if (eVar2.d()) {
                            SalesIQChat salesIQChat7 = salesIQChat;
                            str10 = "getChid(...)";
                            e.a aVar4 = we.e.f67680b;
                            we.d c14 = eVar2.c();
                            if (c14 == null) {
                                c14 = we.d.f67649d;
                            }
                            a11 = aVar4.a(c14);
                            salesIQChat3 = salesIQChat7;
                            str6 = str10;
                            if (!a11.d()) {
                            }
                            return a11;
                        }
                        Re.m d02 = eVar.d0();
                        String convID2 = salesIQChat.getConvID();
                        Intrinsics.checkNotNullExpressionValue(convID2, "getConvID(...)");
                        String content2 = message != null ? message.getContent() : null;
                        if (str8 == null) {
                            str8 = salesIQChat.getDeptid();
                            Intrinsics.checkNotNull(str8);
                        }
                        String str20 = str8;
                        Pe.a aVar5 = Pe.a.Audio;
                        String n11 = C6218a.n();
                        android.support.v4.media.session.b.a(eVar2.b());
                        vVar2.f11559n = str9;
                        vVar2.f11560o = salesIQChat;
                        vVar2.f11561p = null;
                        vVar2.f11562q = null;
                        vVar2.f11563r = null;
                        vVar2.f11567v = 2;
                        str10 = "getChid(...)";
                        obj2 = coroutine_suspended;
                        SalesIQChat salesIQChat8 = salesIQChat;
                        str11 = "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error";
                        String str21 = str9;
                        str12 = "getString(...)";
                        b10 = Re.m.b(d02, convID2, content2, str20, aVar5, false, false, null, null, n11, message, null, null, vVar2, 2048, null);
                        vVar2 = vVar2;
                        if (b10 == obj2) {
                            return obj2;
                        }
                        salesIQChat4 = salesIQChat8;
                        str13 = str21;
                        c5582a = (C5582a) b10;
                        AbstractC6235a.c cVar2 = AbstractC6235a.c.Conversations;
                        if (!c5582a.d()) {
                            C5582a.b c15 = c5582a.c();
                            if (c15 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c15, cVar2)) == null) {
                                abstractC6235a = AbstractC6235a.b.f64114d;
                            }
                            c10 = c5582a.c();
                            Intrinsics.checkNotNull(c10, str11);
                            e eVar5 = f11456a;
                            String string3 = eVar5.z().getString(abstractC6235a.b());
                            Intrinsics.checkNotNullExpressionValue(string3, str12);
                            vVar2.f11559n = str13;
                            vVar2.f11560o = salesIQChat4;
                            vVar2.f11561p = c5582a;
                            vVar2.f11562q = c10;
                            vVar2.f11563r = abstractC6235a;
                            vVar2.f11567v = 3;
                            if (eVar5.S0(string3, vVar2) == obj2) {
                                return obj2;
                            }
                            abstractC6235a2 = abstractC6235a;
                            if (abstractC6235a2.a() != C6239e.f64119d.a()) {
                                AbstractC1459k.d(f11456a.y(), null, null, new w(null), 3, null);
                                com.zoho.livechat.android.modules.brand.ui.helpers.a aVar6 = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                                Md.a[] aVarArr2 = {Md.a.Call};
                                vVar2.f11559n = str13;
                                vVar2.f11560o = salesIQChat4;
                                vVar2.f11561p = c5582a;
                                vVar2.f11562q = null;
                                vVar2.f11563r = null;
                                vVar2.f11567v = 4;
                                if (aVar6.O(aVarArr2, vVar2) == obj2) {
                                    return obj2;
                                }
                                c5582a2 = c5582a;
                                salesIQChat5 = salesIQChat4;
                                str14 = str13;
                                str13 = str14;
                                salesIQChat4 = salesIQChat5;
                                c5582a = c5582a2;
                            } else {
                                Ud.b.f12184a.c(new AbstractC6744a.C0960a(c10.c()));
                            }
                        }
                        salesIQChat3 = salesIQChat4;
                        if (c5582a.d()) {
                            a11 = we.e.f67680b.b(LiveChatUtil.getChatWithAnyId(str13));
                        } else {
                            e.a aVar7 = we.e.f67680b;
                            C5582a.b c16 = c5582a.c();
                            if (c16 != null) {
                                Integer b12 = c16.b();
                                dVar = new d.b(b12 != null ? b12.intValue() : -1, c16.c());
                            } else {
                                dVar = we.d.f67649d;
                            }
                            a11 = aVar7.a(dVar);
                        }
                        str6 = str10;
                        if (!a11.d()) {
                            we.d c17 = a11.c();
                            Intrinsics.checkNotNull(c17, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.ui.result.entities.SalesIQError");
                            LiveChatUtil.log("Failed to start call: " + c17);
                            String chid2 = salesIQChat3.getChid();
                            Intrinsics.checkNotNullExpressionValue(chid2, str6);
                            C6966g.v(chid2, Message.g.Question);
                        }
                        return a11;
                    case 1:
                        Message message2 = (Message) vVar2.f11563r;
                        SalesIQChat salesIQChat9 = (SalesIQChat) vVar2.f11562q;
                        String str22 = (String) vVar2.f11561p;
                        String str23 = (String) vVar2.f11560o;
                        eVar = (e) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        message = message2;
                        salesIQChat = salesIQChat9;
                        str8 = str22;
                        str9 = str23;
                        eVar2 = (we.e) obj3;
                        if (eVar2.d()) {
                        }
                        break;
                    case 2:
                        SalesIQChat salesIQChat10 = (SalesIQChat) vVar2.f11560o;
                        String str24 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        salesIQChat4 = salesIQChat10;
                        str13 = str24;
                        str10 = "getChid(...)";
                        str11 = "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error";
                        str12 = "getString(...)";
                        b10 = obj3;
                        obj2 = coroutine_suspended;
                        c5582a = (C5582a) b10;
                        AbstractC6235a.c cVar22 = AbstractC6235a.c.Conversations;
                        if (!c5582a.d()) {
                        }
                        salesIQChat3 = salesIQChat4;
                        if (c5582a.d()) {
                        }
                        str6 = str10;
                        if (!a11.d()) {
                        }
                        return a11;
                    case 3:
                        abstractC6235a2 = (AbstractC6235a) vVar2.f11563r;
                        C5582a.b bVar = (C5582a.b) vVar2.f11562q;
                        C5582a c5582a6 = (C5582a) vVar2.f11561p;
                        SalesIQChat salesIQChat11 = (SalesIQChat) vVar2.f11560o;
                        String str25 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = coroutine_suspended;
                        str10 = "getChid(...)";
                        c10 = bVar;
                        c5582a = c5582a6;
                        salesIQChat4 = salesIQChat11;
                        str13 = str25;
                        if (abstractC6235a2.a() != C6239e.f64119d.a()) {
                        }
                        break;
                    case 4:
                        c5582a2 = (C5582a) vVar2.f11561p;
                        salesIQChat5 = (SalesIQChat) vVar2.f11560o;
                        str14 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        str10 = "getChid(...)";
                        str13 = str14;
                        salesIQChat4 = salesIQChat5;
                        c5582a = c5582a2;
                        salesIQChat3 = salesIQChat4;
                        if (c5582a.d()) {
                        }
                        str6 = str10;
                        if (!a11.d()) {
                        }
                        return a11;
                    case 5:
                        SalesIQChat salesIQChat12 = (SalesIQChat) vVar2.f11560o;
                        str7 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        a10 = obj3;
                        salesIQChat2 = salesIQChat12;
                        obj = coroutine_suspended;
                        str6 = "getChid(...)";
                        str4 = "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error";
                        str5 = "getString(...)";
                        c5582a3 = (C5582a) a10;
                        if (c5582a3.d()) {
                        }
                        AbstractC6235a.c cVar3 = AbstractC6235a.c.Conversations;
                        if (!c5582a3.d()) {
                        }
                        salesIQChat3 = salesIQChat2;
                        if (c5582a3.d()) {
                        }
                        if (!a11.d()) {
                        }
                        return a11;
                    case 6:
                        String str26 = (String) vVar2.f11562q;
                        c5582a4 = (C5582a) vVar2.f11561p;
                        SalesIQChat salesIQChat13 = (SalesIQChat) vVar2.f11560o;
                        str15 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        salesIQChat2 = salesIQChat13;
                        obj = coroutine_suspended;
                        str6 = "getChid(...)";
                        str5 = "getString(...)";
                        string = str26;
                        str4 = "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error";
                        f11456a.L0(string, string);
                        String str192 = str15;
                        c5582a3 = c5582a4;
                        str7 = str192;
                        AbstractC6235a.c cVar32 = AbstractC6235a.c.Conversations;
                        if (!c5582a3.d()) {
                        }
                        salesIQChat3 = salesIQChat2;
                        if (c5582a3.d()) {
                        }
                        if (!a11.d()) {
                        }
                        return a11;
                    case 7:
                        str16 = (String) vVar2.f11564s;
                        abstractC6235a4 = (AbstractC6235a) vVar2.f11563r;
                        C5582a.b bVar2 = (C5582a.b) vVar2.f11562q;
                        c5582a3 = (C5582a) vVar2.f11561p;
                        salesIQChat2 = (SalesIQChat) vVar2.f11560o;
                        str17 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        c11 = bVar2;
                        str6 = "getChid(...)";
                        obj = coroutine_suspended;
                        if (M() != Dg.b.f2756a) {
                        }
                        if (abstractC6235a4.a() != C6247m.f64127d.a()) {
                        }
                        break;
                    case 8:
                        c5582a5 = (C5582a) vVar2.f11561p;
                        salesIQChat6 = (SalesIQChat) vVar2.f11560o;
                        String str27 = (String) vVar2.f11559n;
                        ResultKt.throwOnFailure(obj3);
                        str17 = str27;
                        str6 = "getChid(...)";
                        c5582a3 = c5582a5;
                        salesIQChat2 = salesIQChat6;
                        str7 = str17;
                        salesIQChat3 = salesIQChat2;
                        if (c5582a3.d()) {
                        }
                        if (!a11.d()) {
                        }
                        return a11;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        vVar = new v(continuation);
        vVar2 = vVar;
        Object obj32 = vVar2.f11565t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (vVar2.f11567v) {
        }
    }

    public final C4377a I() {
        return (C4377a) f11458c.getValue();
    }

    public final void I0(Activity activity, String str) {
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) PreChatFormActivity.class);
            intent.putExtra("navigate_to", "calls_form");
            intent.putExtra("requested_for_call_type_chat", true);
            intent.putExtra("can_finish_activity_on_call", true);
            intent.putExtra("chid", "temp_call_chid");
            if (str != null) {
                intent.putExtra("acknowledgement_key", str);
            }
            activity.startActivity(intent);
        }
    }

    public final Ke.a J() {
        return (Ke.a) f11459d.getValue();
    }

    public final ArrayList N() {
        ArrayList arrayList = new ArrayList();
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 != null) {
            arrayList.add(e10.getString(od.t.f61129v3));
            arrayList.add(e10.getString(od.t.f61135w3));
            arrayList.add(e10.getString(od.t.f61141x3));
            arrayList.add(e10.getString(od.t.f61147y3));
            arrayList.add(e10.getString(od.t.f61153z3));
        }
        return arrayList;
    }

    public final C5252a R() {
        return (C5252a) f11461f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(String str, Continuation continuation) {
        k kVar;
        int i10;
        e eVar;
        Object Q10;
        File file;
        Bitmap bitmap;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f11517r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f11517r = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f11515p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = kVar.f11517r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(K());
                    if (chatWithAnyId != null && (Q10 = Q(Te.a.I(chatWithAnyId.getConvID()), chatWithAnyId)) != null) {
                        wd.d dVar = wd.d.f67581a;
                        Application e10 = MobilistenInitProvider.INSTANCE.e();
                        kVar.f11513n = this;
                        kVar.f11514o = str;
                        kVar.f11517r = 1;
                        obj = dVar.t(e10, Q10, kVar);
                        if (obj != coroutine_suspended) {
                            eVar = this;
                        }
                    }
                    eVar = this;
                    if (!f11456a.F()) {
                        eVar = null;
                    }
                    if (eVar != null || str == null) {
                        file = null;
                        if (file == null) {
                        }
                    } else {
                        wd.d dVar2 = wd.d.f67581a;
                        kVar.f11513n = null;
                        kVar.f11514o = null;
                        kVar.f11517r = 2;
                        obj = dVar2.B(str, kVar);
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        ResultKt.throwOnFailure(obj);
                        file = (File) obj;
                        if (file == null) {
                            return file;
                        }
                        wd.d dVar3 = wd.d.f67581a;
                        kVar.f11513n = null;
                        kVar.f11514o = null;
                        kVar.f11517r = 3;
                        Object n10 = dVar3.n(kVar);
                        return n10 == coroutine_suspended ? coroutine_suspended : n10;
                    }
                    str = (String) kVar.f11514o;
                    eVar = (e) kVar.f11513n;
                    ResultKt.throwOnFailure(obj);
                }
                bitmap = (Bitmap) ((C5582a) obj).b();
                if (bitmap != null) {
                    return bitmap;
                }
                if (!f11456a.F()) {
                }
                if (eVar != null) {
                }
                file = null;
                if (file == null) {
                }
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f11515p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = kVar.f11517r;
        if (i10 != 0) {
        }
        bitmap = (Bitmap) ((C5582a) obj2).b();
        if (bitmap != null) {
        }
        if (!f11456a.F()) {
        }
        if (eVar != null) {
        }
        file = null;
        if (file == null) {
        }
    }

    public final Object S0(String str, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final File T(String str) {
        if ((f11456a.F() ? this : null) != null) {
            File C10 = str != null ? wd.d.f67581a.C(str) : null;
            if (C10 != null) {
                return C10;
            }
        }
        return wd.d.f67581a.o();
    }

    public final Xd.b U() {
        return (Xd.b) f11465j.getValue();
    }

    public final Re.i V() {
        return (Re.i) f11464i.getValue();
    }

    public final Object X0(Context context, Continuation continuation) {
        Channel m10 = C6822a.m();
        if (m10 == null || !m10.isAudioCallRecordingEnabled()) {
            return Boxing.boxBoolean(true);
        }
        if (Ye.d.f(De.a.CallRecordingConsentAccepted, false, 2, null)) {
            return Boxing.boxBoolean(true);
        }
        if (context == null) {
            context = MobilistenInitProvider.INSTANCE.e();
        }
        return C6461a.f65810a.c(new B(new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode()), m10, null), continuation);
    }

    public final List c0() {
        return f11470o;
    }

    public final Re.m d0() {
        return (Re.m) f11463h.getValue();
    }

    public final Xd.e e0() {
        return (Xd.e) f11467l.getValue();
    }

    public final Re.o f0() {
        return (Re.o) f11462g.getValue();
    }

    public final we.e g0(View view, Activity activity) {
        ViewParent parent = view != null ? view.getParent() : null;
        MobilistenToggleFAB mobilistenToggleFAB = parent instanceof MobilistenToggleFAB ? (MobilistenToggleFAB) parent : null;
        if (mobilistenToggleFAB != null) {
            MobilistenToggleFAB.H0(mobilistenToggleFAB, true, null, 2, null);
        }
        if (activity == null) {
            return we.e.f67680b.a(we.d.f67649d);
        }
        r0(activity);
        return we.e.f67680b.a(we.d.f67637S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fe, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v5, types: [Pe.b, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(Context context, SalesIQChat salesIQChat, boolean z10, boolean z11, Continuation continuation) {
        m mVar;
        int i10;
        String str;
        Object Q10;
        Object obj;
        Cg.b bVar;
        String attenderName;
        Context context2;
        boolean z12;
        SalesIQChat salesIQChat2;
        Cg.b bVar2;
        Result result;
        Ref.ObjectRef objectRef;
        String str2;
        Object Q11;
        Object obj2;
        List b02;
        Channel.CallConfigurations callConfigurations;
        Long sdkWaitingTime;
        String convID;
        Throwable m150exceptionOrNullimpl;
        boolean z13;
        Cg.b bVar3;
        Ref.ObjectRef objectRef2;
        SalesIQChat salesIQChat3;
        Context context3;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f11526u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f11526u = i11 - Integer.MIN_VALUE;
                Object obj3 = mVar.f11524s;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = mVar.f11526u;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (!C6218a.c0()) {
                        return we.e.f67680b.a(we.d.f67651e);
                    }
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    ?? I10 = Te.a.I((salesIQChat == null || (convID = salesIQChat.getConvID()) == null) ? null : og.m.d(convID));
                    objectRef3.element = I10;
                    if (z10) {
                        Channel m10 = C6822a.m();
                        long longValue = ((m10 == null || (callConfigurations = m10.getCallConfigurations()) == null || (sdkWaitingTime = callConfigurations.getSdkWaitingTime()) == null) ? 60L : sdkWaitingTime.longValue()) * 1000;
                        String W10 = W((Pe.b) objectRef3.element, salesIQChat);
                        String str3 = (W10 == null && (W10 = B()) == null) ? "" : W10;
                        String x10 = x((Pe.b) objectRef3.element, salesIQChat);
                        if (x10 == null) {
                            Pe.b bVar4 = (Pe.b) objectRef3.element;
                            if (bVar4 != null && (b02 = bVar4.e()) != null) {
                                if (b02.isEmpty()) {
                                    b02 = null;
                                }
                            }
                            b02 = b0(false, 1, null);
                            Channel.Department department = (Channel.Department) CollectionsKt.firstOrNull(b02);
                            if (department != null) {
                                x10 = department.getName();
                            } else {
                                str2 = null;
                                Q11 = Q((Pe.b) objectRef3.element, salesIQChat);
                                if (Q11 == null) {
                                    Channel m11 = C6822a.m();
                                    if (m11 != null) {
                                        Q11 = m11.getBrandLogoUrlIfAllowed();
                                    } else {
                                        obj2 = null;
                                        bVar = new Cg.b(str3, null, null, str2, obj2, null, true, false, new Cg.a(longValue, longValue));
                                    }
                                }
                                obj2 = Q11;
                                bVar = new Cg.b(str3, null, null, str2, obj2, null, true, false, new Cg.a(longValue, longValue));
                            }
                        }
                        str2 = x10;
                        Q11 = Q((Pe.b) objectRef3.element, salesIQChat);
                        if (Q11 == null) {
                        }
                        obj2 = Q11;
                        bVar = new Cg.b(str3, null, null, str2, obj2, null, true, false, new Cg.a(longValue, longValue));
                    } else {
                        String W11 = W(I10, salesIQChat);
                        if (W11 == null) {
                            if (salesIQChat == null || (attenderName = salesIQChat.getAttenderName()) == null || (W11 = og.m.d(attenderName)) == null || !f11456a.G()) {
                                W11 = null;
                            }
                            if (W11 == null && (W11 = B()) == null) {
                                str = "";
                                String visitorid = salesIQChat == null ? salesIQChat.getVisitorid() : null;
                                String x11 = x((Pe.b) objectRef3.element, salesIQChat);
                                Q10 = Q((Pe.b) objectRef3.element, salesIQChat);
                                if (Q10 == null) {
                                    if (F()) {
                                        Q10 = T(salesIQChat != null ? salesIQChat.getAttenderid() : null);
                                        if (Q10 == null) {
                                            Q10 = Boxing.boxInt(MobilistenUtil.k() ? od.p.f60127l2 : od.p.f60132m2);
                                        }
                                    } else {
                                        Channel m12 = C6822a.m();
                                        if (m12 != null) {
                                            Q10 = m12.getBrandLogoUrlIfAllowed();
                                        } else {
                                            obj = null;
                                            bVar = new Cg.b(str, null, visitorid, x11, obj, null, false, false, new Cg.a(0L, 10000L, 1, null));
                                        }
                                    }
                                }
                                obj = Q10;
                                bVar = new Cg.b(str, null, visitorid, x11, obj, null, false, false, new Cg.a(0L, 10000L, 1, null));
                            }
                        }
                        str = W11;
                        if (salesIQChat == null) {
                        }
                        String x112 = x((Pe.b) objectRef3.element, salesIQChat);
                        Q10 = Q((Pe.b) objectRef3.element, salesIQChat);
                        if (Q10 == null) {
                        }
                        obj = Q10;
                        bVar = new Cg.b(str, null, visitorid, x112, obj, null, false, false, new Cg.a(0L, 10000L, 1, null));
                    }
                    Q.f44447F.f44468c = true;
                    if ((context == null ? MobilistenInitProvider.INSTANCE.e() : context) != null) {
                        context2 = context;
                        z12 = z10;
                        salesIQChat2 = salesIQChat;
                        bVar2 = bVar;
                        result = null;
                        objectRef = objectRef3;
                    }
                    result = null;
                    if (result == null && Result.m154isSuccessimpl(result.getValue())) {
                        Object value = result.getValue();
                        if (Result.m153isFailureimpl(value)) {
                            value = null;
                        }
                        if (value == null) {
                            return we.e.f67680b.a(we.d.f67650d0);
                        }
                        e.a aVar = we.e.f67680b;
                        Object value2 = result.getValue();
                        return aVar.b(Result.m153isFailureimpl(value2) ? null : value2);
                    }
                    m150exceptionOrNullimpl = result != null ? Result.m150exceptionOrNullimpl(result.getValue()) : null;
                    if (m150exceptionOrNullimpl != null) {
                        return we.e.f67680b.a(we.d.f67646b0);
                    }
                    e.a aVar2 = we.e.f67680b;
                    we.d dVar = we.d.f67646b0;
                    int a10 = dVar.a();
                    String message = m150exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = dVar.b();
                    }
                    return aVar2.a(new d.b(a10, message));
                }
                if (i10 == 1) {
                    z13 = mVar.f11523r;
                    bVar3 = (Cg.b) mVar.f11522q;
                    objectRef2 = (Ref.ObjectRef) mVar.f11521p;
                    salesIQChat3 = (SalesIQChat) mVar.f11520o;
                    context3 = (Context) mVar.f11519n;
                    ResultKt.throwOnFailure(obj3);
                    result = Result.m146boximpl(((Result) obj3).getValue());
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z13 = mVar.f11523r;
                    bVar3 = (Cg.b) mVar.f11522q;
                    objectRef2 = (Ref.ObjectRef) mVar.f11521p;
                    salesIQChat3 = (SalesIQChat) mVar.f11520o;
                    context3 = (Context) mVar.f11519n;
                    ResultKt.throwOnFailure(obj3);
                    result = Result.m146boximpl(((Result) obj3).getValue());
                }
                z12 = z13;
                context2 = context3;
                bVar2 = bVar3;
                objectRef = objectRef2;
                salesIQChat2 = salesIQChat3;
                if (result != null) {
                    result.getValue();
                    AbstractC1459k.d(f11456a.y(), null, null, new n(context2, objectRef, salesIQChat2, z12, bVar2, null), 3, null);
                    ne.j.s0(false, 1, null);
                    if (result == null) {
                    }
                    if (result != null) {
                    }
                    if (m150exceptionOrNullimpl != null) {
                    }
                }
                result = null;
                if (result == null) {
                }
                if (result != null) {
                }
                if (m150exceptionOrNullimpl != null) {
                }
            }
        }
        mVar = new m(continuation);
        Object obj32 = mVar.f11524s;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = mVar.f11526u;
        if (i10 != 0) {
        }
        if (result != null) {
        }
        result = null;
        if (result == null) {
        }
        if (result != null) {
        }
        if (m150exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r0 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        if (r0 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(Activity activity, String str, Function1 function1, Continuation continuation) {
        o oVar;
        int i10;
        Object j10;
        e eVar;
        Throwable m150exceptionOrNullimpl;
        Activity activity2;
        EnumC4544a enumC4544a;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i11 = oVar.f11540s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f11540s = i11 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj = oVar2.f11538q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = oVar2.f11540s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zoho.livechat.android.modules.brand.ui.helpers.a aVar = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                    Pe.a aVar2 = Pe.a.Audio;
                    oVar2.f11535n = this;
                    oVar2.f11536o = activity;
                    oVar2.f11540s = 1;
                    j10 = aVar.j(aVar2, str, false, function1, oVar2);
                    if (j10 != coroutine_suspended) {
                        eVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            enumC4544a = (EnumC4544a) oVar2.f11535n;
                            ResultKt.throwOnFailure(obj);
                            return ((Boolean) obj).booleanValue() ? we.e.f67680b.b(new Pair(enumC4544a, Boxing.boxBoolean(true))) : we.e.f67680b.a(we.d.f67641W);
                        }
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        enumC4544a = (EnumC4544a) oVar2.f11535n;
                        ResultKt.throwOnFailure(obj);
                        return ((Boolean) obj).booleanValue() ? we.e.f67680b.b(new Pair(enumC4544a, Boxing.boxBoolean(true))) : we.e.f67680b.a(we.d.f67648c0);
                    }
                    enumC4544a = (EnumC4544a) oVar2.f11537p;
                    activity2 = (Activity) oVar2.f11536o;
                    eVar = (e) oVar2.f11535n;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return we.e.f67680b.a(we.d.f67642X);
                    }
                    if (enumC4544a == EnumC4544a.CallOnline) {
                        oVar2.f11535n = enumC4544a;
                        oVar2.f11536o = null;
                        oVar2.f11537p = null;
                        oVar2.f11540s = 3;
                        obj = eVar.X0(activity2, oVar2);
                    } else {
                        oVar2.f11535n = enumC4544a;
                        oVar2.f11536o = null;
                        oVar2.f11537p = null;
                        oVar2.f11540s = 4;
                        obj = eVar.p(activity2, oVar2);
                    }
                    return coroutine_suspended;
                }
                activity = (Activity) oVar2.f11536o;
                e eVar2 = (e) oVar2.f11535n;
                ResultKt.throwOnFailure(obj);
                j10 = ((Result) obj).getValue();
                eVar = eVar2;
                if (Result.m154isSuccessimpl(j10)) {
                    Pair pair = (Pair) (Result.m153isFailureimpl(j10) ? null : j10);
                    if ((pair != null ? (Boolean) pair.getSecond() : null) != null) {
                        Object obj2 = Result.m153isFailureimpl(j10) ? null : j10;
                        Intrinsics.checkNotNull(obj2);
                        EnumC4544a enumC4544a2 = (EnumC4544a) ((Pair) obj2).getFirst();
                        if (Result.m153isFailureimpl(j10)) {
                            j10 = null;
                        }
                        Pair pair2 = (Pair) j10;
                        if (pair2 != null && ((Boolean) pair2.getSecond()).booleanValue()) {
                            return we.e.f67680b.b(new Pair(enumC4544a2, Boxing.boxBoolean(false)));
                        }
                        Te.a aVar3 = Te.a.f11572a;
                        oVar2.f11535n = eVar;
                        oVar2.f11536o = activity;
                        oVar2.f11537p = enumC4544a2;
                        oVar2.f11540s = 2;
                        obj = aVar3.W0(activity, oVar2);
                        if (obj != coroutine_suspended) {
                            activity2 = activity;
                            enumC4544a = enumC4544a2;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                e.a aVar4 = we.e.f67680b;
                we.d dVar = we.d.f67649d;
                int a10 = dVar.a();
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(j10);
                if (m150exceptionOrNullimpl != null || (r0 = m150exceptionOrNullimpl.getMessage()) == null) {
                    String b10 = dVar.b();
                }
                return aVar4.a(new d.b(a10, b10));
            }
        }
        oVar = new o(continuation);
        o oVar22 = oVar;
        Object obj3 = oVar22.f11538q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = oVar22.f11540s;
        if (i10 != 0) {
        }
        if (Result.m154isSuccessimpl(j10)) {
        }
        e.a aVar42 = we.e.f67680b;
        we.d dVar2 = we.d.f67649d;
        int a102 = dVar2.a();
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(j10);
        if (m150exceptionOrNullimpl != null) {
        }
        String b102 = dVar2.b();
        return aVar42.a(new d.b(a102, b102));
    }

    public final void l0(Cg.c data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final void o(ConstraintLayout constraintLayout, Context context, boolean z10, int i10, int i11) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(D(context, z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        ViewGroup viewGroup = (ViewGroup) m147constructorimpl;
        if (viewGroup != null) {
            viewGroup.setId(View.generateViewId());
            constraintLayout.addView(viewGroup);
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f(constraintLayout);
            dVar.h(viewGroup.getId(), 3, i10, 4);
            dVar.h(viewGroup.getId(), 6, 0, 6);
            dVar.h(viewGroup.getId(), 7, 0, 7);
            dVar.h(i11, 3, viewGroup.getId(), 4);
            dVar.c(constraintLayout);
        }
    }

    public final Object p(Context context, Continuation continuation) {
        if (context == null) {
            context = MobilistenInitProvider.INSTANCE.e();
        }
        return C6461a.f65810a.c(new C1686a(new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode()), null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p0(View view, Activity activity, String str, Function1 function1, Continuation continuation) {
        q qVar;
        int i10;
        e eVar;
        we.e eVar2;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i11 = qVar.f11547s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f11547s = i11 - Integer.MIN_VALUE;
                q qVar2 = qVar;
                Object obj = qVar2.f11545q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = qVar2.f11547s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m0()) {
                        return g0(view, activity);
                    }
                    qVar2.f11542n = this;
                    qVar2.f11543o = activity;
                    qVar2.f11544p = str;
                    qVar2.f11547s = 1;
                    obj = k0(activity, str, function1, qVar2);
                    if (obj != coroutine_suspended) {
                        eVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                str = (String) qVar2.f11544p;
                activity = (Activity) qVar2.f11543o;
                e eVar3 = (e) qVar2.f11542n;
                ResultKt.throwOnFailure(obj);
                eVar = eVar3;
                eVar2 = (we.e) obj;
                if (eVar2.d()) {
                    e.a aVar = we.e.f67680b;
                    we.d c10 = eVar2.c();
                    if (c10 == null) {
                        c10 = we.d.f67649d;
                    }
                    return aVar.a(c10);
                }
                Pair pair = (Pair) eVar2.b();
                if (pair != null && !((Boolean) pair.getSecond()).booleanValue()) {
                    eVar.I0(activity, str);
                    return we.e.f67680b.a(we.d.f67673x);
                }
                Pair pair2 = (Pair) eVar2.b();
                EnumC4544a enumC4544a = pair2 != null ? (EnumC4544a) pair2.getFirst() : null;
                qVar2.f11542n = null;
                qVar2.f11543o = null;
                qVar2.f11544p = null;
                qVar2.f11547s = 2;
                Object H02 = H0(eVar, str, str, null, enumC4544a, false, qVar2, 16, null);
                return H02 == coroutine_suspended ? coroutine_suspended : H02;
            }
        }
        qVar = new q(continuation);
        q qVar22 = qVar;
        Object obj2 = qVar22.f11545q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = qVar22.f11547s;
        if (i10 != 0) {
        }
        eVar2 = (we.e) obj2;
        if (eVar2.d()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0050, code lost:
    
        if (r0 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair q(String str, String str2, String str3) {
        List b02;
        Channel.Department department;
        String str4;
        SalesIQChat salesIQChat;
        Object obj;
        if (str3 != null) {
            if ((str3.length() > 0 ? str3 : null) != null) {
                Iterator it = b0(false, 1, null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((Channel.Department) obj).getId(), str3)) {
                        break;
                    }
                }
                department = (Channel.Department) obj;
            }
        }
        Pe.b h02 = Te.a.h0(str);
        if (h02 != null && (b02 = h02.e()) != null) {
            if (b02.isEmpty()) {
                b02 = null;
            }
        }
        b02 = b0(false, 1, null);
        department = (Channel.Department) CollectionsKt.firstOrNull(b02);
        if (str2 == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            str4 = uuid;
        } else {
            str4 = str2;
        }
        long f10 = rd.b.f();
        if (((department != null ? department.getId() : null) != null ? this : null) != null) {
            SalesIQChat salesIQChat2 = new SalesIQChat(str4, str4, null, f10, 1, SalesIQChat.c.Call);
            salesIQChat2.setDeptid(department != null ? department.getId() : null);
            salesIQChat2.setDepartmentName(department != null ? department.getName() : null);
            salesIQChat2.setQuestion(f11456a.z().getString(od.t.f60879I3, LiveChatUtil.getVisitorName()));
            salesIQChat2.setLastmsgtime(f10);
            Pe.b h03 = Te.a.h0(str4);
            salesIQChat2.setExtras(h03 != null ? new SalesIQChat.Extras(new SalesIQChat.Extras.a(h03.i(), h03.c(), h03.g(), h03.d())) : null);
            salesIQChat = salesIQChat2;
        } else {
            salesIQChat = null;
        }
        return new Pair(salesIQChat, C6966g.Q(salesIQChat, salesIQChat != null ? salesIQChat.getQuestion() : null, salesIQChat != null ? Long.valueOf(salesIQChat.getTime()) : null, LiveChatUtil.getAnnonID(), LiveChatUtil.getVisitorName(), null, Message.g.Question, null, null, 416, null));
    }

    public final void s0(Dg.b bVar, Dg.a aVar) {
        synchronized (this) {
            try {
                Iterator it = f11456a.C().iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(bVar, aVar);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t0(Dg.b callState) {
        Intrinsics.checkNotNullParameter(callState, "callState");
    }

    public final void w0(String str, String name, String str2, String str3, Object obj, Integer num, String str4, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final P y() {
        return C6461a.f65810a.e();
    }

    public final Application z() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final void s() {
    }

    public static final class t extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final t f11554d = new t();

        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void a(boolean z10) {
        }
    }

    public static final void T0(int i10) {
    }

    public final void D0(Context context, boolean z10) {
    }

    public final void J0(String str, boolean z10) {
    }

    public final void L0(Object obj, String str) {
    }

    public static final void V0(String str, String str2, String str3, Object obj, Integer num, String str4, Boolean bool) {
    }
}
