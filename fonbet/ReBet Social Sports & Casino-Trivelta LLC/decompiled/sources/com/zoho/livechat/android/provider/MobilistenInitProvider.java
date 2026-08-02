package com.zoho.livechat.android.provider;

import Ge.e;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import Uf.j;
import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import ba.AbstractC2414a;
import com.facebook.hermes.intl.Constants;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.modules.authentication.ui.models.SalesIQJWTAuth;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import ge.C4377a;
import ie.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import me.C5582a;
import od.AbstractC5884j;
import od.m;
import og.i;
import pg.C6069a;
import rd.C6218a;
import sd.d;
import td.C6461a;
import ue.C6549a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010!J=\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/zoho/livechat/android/provider/MobilistenInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "onCreate", "()Z", "Landroid/content/Context;", "context", "Landroid/content/pm/ProviderInfo;", "info", "", "attachInfo", "(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", EventKeys.VALUES_KEY, "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MobilistenInitProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    public static Application f44217b;

    /* renamed from: c, reason: collision with root package name */
    public static Application f44218c;

    /* renamed from: f, reason: collision with root package name */
    public static j f44221f;

    /* renamed from: g, reason: collision with root package name */
    public static C0 f44222g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static boolean f44219d = true;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f44220e = new Object();

    /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$a, reason: collision with other inner class name */
        public static final class C0635a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f44223n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f44224o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0635a(String str, Continuation continuation) {
                super(2, continuation);
                this.f44224o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0635a(this.f44224o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0635a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f44223n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C4377a.C0689a c0689a = C4377a.f47235d;
                    j jVar = MobilistenInitProvider.f44221f;
                    Application o10 = jVar != null ? jVar.o() : null;
                    Intrinsics.checkNotNull(o10);
                    Ge.e eVar = new Ge.e(c0689a.a(o10));
                    b.h hVar = new b.h(this.f44224o);
                    this.f44223n = 1;
                    if (eVar.a(hVar, this) == coroutine_suspended) {
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

        /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: A, reason: collision with root package name */
            public final /* synthetic */ String f44225A;

            /* renamed from: B, reason: collision with root package name */
            public final /* synthetic */ nd.b f44226B;

            /* renamed from: n, reason: collision with root package name */
            public boolean f44227n;

            /* renamed from: o, reason: collision with root package name */
            public int f44228o;

            /* renamed from: p, reason: collision with root package name */
            public Object f44229p;

            /* renamed from: q, reason: collision with root package name */
            public Object f44230q;

            /* renamed from: r, reason: collision with root package name */
            public Object f44231r;

            /* renamed from: s, reason: collision with root package name */
            public int f44232s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Bd.b f44233t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f44234u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f44235v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Application f44236w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Activity f44237x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ nd.e f44238y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ InitListener f44239z;

            /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$b$a, reason: collision with other inner class name */
            public static final class C0636a extends SuspendLambda implements Function1 {

                /* renamed from: n, reason: collision with root package name */
                public int f44240n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Bd.b f44241o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ String f44242p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0636a(Bd.b bVar, String str, Continuation continuation) {
                    super(1, continuation);
                    this.f44241o = bVar;
                    this.f44242p = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new C0636a(this.f44241o, this.f44242p, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f44240n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new Pair(Boxing.boxBoolean(Ed.a.f3035a.w()), Boxing.boxBoolean(MobilistenInitProvider.INSTANCE.m(this.f44241o, this.f44242p)));
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation continuation) {
                    return ((C0636a) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$b$b, reason: collision with other inner class name */
            public static final class C0637b implements AbstractC2414a.InterfaceC0433a {
                @Override // ba.AbstractC2414a.InterfaceC0433a
                public void a() {
                }

                @Override // ba.AbstractC2414a.InterfaceC0433a
                public void b(int i10, Intent intent) {
                }
            }

            /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$b$c */
            public static final class c extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f44243n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Application f44244o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ nd.b f44245p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Application application, nd.b bVar, Continuation continuation) {
                    super(2, continuation);
                    this.f44244o = application;
                    this.f44245p = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new c(this.f44244o, this.f44245p, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f44243n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C6218a.b0(this.f44244o, this.f44245p, true);
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$b$d */
            public static final class d extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f44246n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f44247o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(String str, Continuation continuation) {
                    super(2, continuation);
                    this.f44247o = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new d(this.f44247o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f44246n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Ye.d.r(De.a.CVUID, this.f44247o).b(true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Bd.b bVar, String str, String str2, Application application, Activity activity, nd.e eVar, InitListener initListener, String str3, nd.b bVar2, Continuation continuation) {
                super(2, continuation);
                this.f44233t = bVar;
                this.f44234u = str;
                this.f44235v = str2;
                this.f44236w = application;
                this.f44237x = activity;
                this.f44238y = eVar;
                this.f44239z = initListener;
                this.f44225A = str3;
                this.f44226B = bVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f44233t, this.f44234u, this.f44235v, this.f44236w, this.f44237x, this.f44238y, this.f44239z, this.f44225A, this.f44226B, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:107:0x00f3, code lost:
            
                if (r14 == r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x0072, code lost:
            
                if (r14 == r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
            
                if (r14 == r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x0270, code lost:
            
                if (r6.p(r7, r8, r9, r10, r11, r12) == r0) goto L144;
             */
            /* JADX WARN: Removed duplicated region for block: B:45:0x02a1  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0240  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x024c  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0257  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x02c0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i10;
                String str;
                Activity activity;
                Activity activity2;
                boolean z10;
                Bd.b t10;
                Activity activity3;
                Activity activity4;
                j jVar;
                j jVar2;
                b bVar;
                Activity activity5;
                Activity activity6;
                j jVar3;
                j jVar4;
                j applicationManager;
                String b10;
                Integer b11;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = -1;
                switch (this.f44232s) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        C6461a c6461a = C6461a.f65810a;
                        C0636a c0636a = new C0636a(this.f44233t, this.f44225A, null);
                        this.f44232s = 1;
                        obj = c6461a.b(c0636a, this);
                        break;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        Pair pair = (Pair) obj;
                        boolean booleanValue = ((Boolean) pair.component1()).booleanValue();
                        boolean booleanValue2 = ((Boolean) pair.component2()).booleanValue();
                        Bd.b bVar2 = this.f44233t;
                        if (bVar2 != null) {
                            Ed.a.B(bVar2);
                        }
                        i10 = (booleanValue && booleanValue2 && this.f44233t == null) ? 1 : 0;
                        String str2 = this.f44234u;
                        if (MobilistenInitProvider.f44221f != null && !MobilistenInitProvider.INSTANCE.n(str2, this.f44235v) && !booleanValue2) {
                            t10 = Ed.a.t();
                            if (t10 instanceof SalesIQJWTAuth) {
                                String token = ((SalesIQJWTAuth) t10).getToken();
                                Ed.a aVar = Ed.a.f3035a;
                                if (!Intrinsics.areEqual(token, aVar.s())) {
                                    j applicationManager2 = ZohoLiveChat.getApplicationManager();
                                    if (applicationManager2 != null) {
                                        applicationManager2.T(this.f44239z);
                                    }
                                    j applicationManager3 = ZohoLiveChat.getApplicationManager();
                                    if (applicationManager3 != null) {
                                        applicationManager3.U(this.f44238y);
                                    }
                                    Bd.a aVar2 = Bd.a.Initialisation;
                                    this.f44229p = t10;
                                    this.f44232s = 5;
                                    obj = aVar.d(t10, aVar2, this);
                                    break;
                                }
                            }
                            if (!i.f(this.f44225A)) {
                                nd.e eVar = this.f44238y;
                                if (eVar != null) {
                                    eVar.a();
                                }
                                InitListener initListener = this.f44239z;
                                if (initListener != null) {
                                    initListener.onInitSuccess();
                                }
                                j jVar5 = MobilistenInitProvider.f44221f;
                                if (jVar5 != null) {
                                    jVar5.T(null);
                                }
                            } else if (ZohoLiveChat.isSDKEnabled()) {
                                nd.e eVar2 = this.f44238y;
                                if (eVar2 != null) {
                                    eVar2.a();
                                }
                                InitListener initListener2 = this.f44239z;
                                if (initListener2 != null) {
                                    initListener2.onInitSuccess();
                                }
                                j jVar6 = MobilistenInitProvider.f44221f;
                                if (jVar6 != null) {
                                    jVar6.T(null);
                                }
                            } else {
                                j jVar7 = MobilistenInitProvider.f44221f;
                                if (jVar7 != null) {
                                    jVar7.k(this.f44239z, this.f44238y);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "_", 0, false, 6, (Object) null);
                        if (lastIndexOf$default != -1) {
                            String substring = str2.substring(lastIndexOf$default + 1, str2.length());
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            str2 = str2.substring(0, lastIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                            MobilistenInitProvider.INSTANCE.f(substring);
                        }
                        str = str2;
                        AbstractC2414a.b(this.f44236w, new C0637b());
                        if (MobilistenInitProvider.f44221f != null) {
                            Activity n10 = j.n();
                            j jVar8 = MobilistenInitProvider.f44221f;
                            activity = jVar8 != null ? jVar8.l() : null;
                            activity2 = n10;
                        } else {
                            Activity activity7 = this.f44237x;
                            activity = activity7 != null ? activity7 : null;
                            activity2 = activity;
                        }
                        MobilistenInitProvider.f44221f = new j(this.f44236w);
                        C6549a.f66349d.d(this.f44236w, true);
                        AbstractC5884j.m();
                        L b12 = C1452g0.b();
                        c cVar = new c(this.f44236w, this.f44226B, null);
                        this.f44229p = str;
                        this.f44230q = activity2;
                        this.f44231r = activity;
                        this.f44227n = booleanValue2;
                        this.f44228o = i10;
                        this.f44232s = 2;
                        if (AbstractC1455i.g(b12, cVar, this) != coroutine_suspended) {
                            z10 = booleanValue2;
                            activity3 = activity;
                            activity4 = activity2;
                            String str3 = str;
                            Yd.a.f14134a.p();
                            jVar = MobilistenInitProvider.f44221f;
                            if (jVar != null) {
                                jVar.U(this.f44238y);
                            }
                            jVar2 = MobilistenInitProvider.f44221f;
                            if (jVar2 != null) {
                                jVar2.T(this.f44239z);
                            }
                            if (!C6218a.c0()) {
                                Companion companion = MobilistenInitProvider.INSTANCE;
                                String str4 = this.f44235v;
                                Application application = this.f44236w;
                                boolean z11 = i10 != 0;
                                this.f44229p = activity4;
                                this.f44230q = activity3;
                                this.f44231r = null;
                                this.f44232s = 3;
                                bVar = this;
                                break;
                            } else {
                                InitListener initListener3 = this.f44239z;
                                if (initListener3 != null) {
                                    initListener3.onInitError(600, "No network connection");
                                    j jVar9 = MobilistenInitProvider.f44221f;
                                    if (jVar9 != null) {
                                        jVar9.T(null);
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        i10 = this.f44228o;
                        boolean z12 = this.f44227n;
                        activity = (Activity) this.f44231r;
                        activity2 = (Activity) this.f44230q;
                        str = (String) this.f44229p;
                        ResultKt.throwOnFailure(obj);
                        z10 = z12;
                        activity3 = activity;
                        activity4 = activity2;
                        String str32 = str;
                        Yd.a.f14134a.p();
                        jVar = MobilistenInitProvider.f44221f;
                        if (jVar != null) {
                        }
                        jVar2 = MobilistenInitProvider.f44221f;
                        if (jVar2 != null) {
                        }
                        if (!C6218a.c0()) {
                        }
                        break;
                    case 3:
                        Activity activity8 = (Activity) this.f44230q;
                        activity4 = (Activity) this.f44229p;
                        ResultKt.throwOnFailure(obj);
                        bVar = this;
                        activity3 = activity8;
                        activity5 = activity4;
                        if (i.f(bVar.f44225A)) {
                            L b13 = C1452g0.b();
                            d dVar = new d(bVar.f44225A, null);
                            bVar.f44229p = activity5;
                            bVar.f44230q = activity3;
                            bVar.f44232s = 4;
                            if (AbstractC1455i.g(b13, dVar, this) != coroutine_suspended) {
                                activity6 = activity3;
                                activity3 = activity6;
                            }
                            return coroutine_suspended;
                        }
                        LiveChatUtil.reInitialiseExecutorService();
                        j.f12225o = true;
                        jVar3 = MobilistenInitProvider.f44221f;
                        if (jVar3 != null) {
                            jVar3.k(bVar.f44239z, bVar.f44238y);
                        }
                        if (activity5 != null && (applicationManager = ZohoLiveChat.getApplicationManager()) != null) {
                            applicationManager.R(activity5);
                        }
                        if (activity3 != null && (jVar4 = MobilistenInitProvider.f44221f) != null) {
                            jVar4.Q(activity3);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        activity6 = (Activity) this.f44230q;
                        activity5 = (Activity) this.f44229p;
                        ResultKt.throwOnFailure(obj);
                        bVar = this;
                        activity3 = activity6;
                        LiveChatUtil.reInitialiseExecutorService();
                        j.f12225o = true;
                        jVar3 = MobilistenInitProvider.f44221f;
                        if (jVar3 != null) {
                        }
                        if (activity5 != null) {
                            applicationManager.R(activity5);
                            break;
                        }
                        if (activity3 != null) {
                            jVar4.Q(activity3);
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        t10 = (Bd.b) this.f44229p;
                        ResultKt.throwOnFailure(obj);
                        if (!((C5582a) obj).d()) {
                            Ed.a aVar3 = Ed.a.f3035a;
                            this.f44229p = null;
                            this.f44232s = 6;
                            obj = aVar3.y(true, t10, this);
                            break;
                        } else {
                            InitListener initListener4 = this.f44239z;
                            if (initListener4 != null) {
                                initListener4.onInitSuccess();
                            }
                            nd.e eVar3 = this.f44238y;
                            if (eVar3 != null) {
                                eVar3.a();
                            }
                            return Unit.INSTANCE;
                        }
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        C5582a c5582a = (C5582a) obj;
                        if (!c5582a.d()) {
                            InitListener initListener5 = this.f44239z;
                            if (initListener5 != null) {
                                C5582a.b c10 = c5582a.c();
                                if (c10 != null && (b11 = c10.b()) != null) {
                                    i11 = b11.intValue();
                                }
                                C5582a.b c11 = c5582a.c();
                                if (c11 == null || (b10 = c11.c()) == null) {
                                    b10 = we.d.f67649d.b();
                                }
                                initListener5.onInitError(i11, b10);
                            }
                            nd.e eVar4 = this.f44238y;
                            if (eVar4 != null) {
                                eVar4.a();
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$c */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final c f44248d = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th2) {
                if (th2 != null) {
                    LiveChatUtil.reInitialiseExecutorService();
                }
            }
        }

        /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$d */
        public static final class d extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f44249n;

            /* renamed from: o, reason: collision with root package name */
            public Object f44250o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f44251p;

            /* renamed from: r, reason: collision with root package name */
            public int f44253r;

            public d(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f44251p = obj;
                this.f44253r |= Integer.MIN_VALUE;
                return Companion.this.p(null, null, null, false, false, this);
            }
        }

        /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$e */
        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f44254n;

            /* renamed from: o, reason: collision with root package name */
            public int f44255o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Application f44256p;

            /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$e$a, reason: collision with other inner class name */
            public static final class C0638a extends Lambda implements Function0 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Continuation f44257d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0638a(Continuation continuation) {
                    super(0);
                    this.f44257d = continuation;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m123invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m123invoke() {
                    Continuation continuation = this.f44257d;
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Application application, Continuation continuation) {
                super(2, continuation);
                this.f44256p = application;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new e(this.f44256p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f44255o;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Application application = this.f44256p;
                    this.f44254n = application;
                    this.f44255o = 1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    ZohoLiveChat.clearDataForRegisterVisitor(application, false, false, null, null, new C0638a(safeContinuation));
                    Object orThrow = safeContinuation.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (orThrow == coroutine_suspended) {
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

        /* renamed from: com.zoho.livechat.android.provider.MobilistenInitProvider$a$f */
        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f44258n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f44259o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f44260p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f44259o = str;
                this.f44260p = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new f(this.f44259o, this.f44260p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f44258n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Ye.d.r(De.a.AppKey, this.f44259o).h(De.a.AccessKey, this.f44260p).b(true);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void l(Companion companion, Application application, String str, String str2, Bd.b bVar, Activity activity, nd.e eVar, InitListener initListener, nd.b bVar2, String str3, int i10, Object obj) {
            companion.j(application, str, str2, bVar, activity, eVar, initListener, bVar2, (i10 & 256) != 0 ? null : str3);
        }

        public final Application e() {
            Application application = MobilistenInitProvider.f44217b;
            synchronized (MobilistenInitProvider.f44220e) {
                try {
                    String stackTraceString = i.g(application) ? Log.getStackTraceString(new Throwable()) : null;
                    if (i.g(application) && MobilistenInitProvider.f44219d) {
                        j jVar = MobilistenInitProvider.f44221f;
                        if (i.e(jVar != null ? jVar.o() : null)) {
                            MobilistenInitProvider.f44219d = false;
                            AbstractC1459k.d(C6461a.f65810a.e(), null, null, new C0635a(stackTraceString, null), 3, null);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (application != null) {
                return application;
            }
            j jVar2 = MobilistenInitProvider.f44221f;
            Application m10 = jVar2 != null ? jVar2.m() : null;
            return m10 == null ? MobilistenInitProvider.f44218c : m10;
        }

        public final void f(String str) {
            if (StringsKt.equals("eu", str, true)) {
                sd.d.i(d.a.EU);
                return;
            }
            if (StringsKt.equals("cn", str, true)) {
                sd.d.i(d.a.CN);
                return;
            }
            if (StringsKt.equals("in", str, true)) {
                sd.d.i(d.a.IN);
                return;
            }
            if (StringsKt.equals("au", str, true)) {
                sd.d.i(d.a.AU);
                return;
            }
            if (StringsKt.equals("jp", str, true)) {
                sd.d.i(d.a.JP);
                return;
            }
            if (StringsKt.equals("ca", str, true)) {
                sd.d.i(d.a.CA);
                return;
            }
            if (StringsKt.equals("sa", str, true)) {
                sd.d.i(d.a.SA);
                return;
            }
            if (StringsKt.equals("uae", str, true)) {
                sd.d.i(d.a.UAE);
                return;
            }
            if (StringsKt.equals("sg", str, true)) {
                sd.d.i(d.a.SG);
            } else if (StringsKt.equals("uk", str, true)) {
                sd.d.i(d.a.UK);
            } else if (StringsKt.equals("inec", str, true)) {
                sd.d.i(d.a.INEC);
            }
        }

        public final Application g() {
            return MobilistenInitProvider.f44217b;
        }

        public final j h() {
            return MobilistenInitProvider.f44221f;
        }

        public final void i(Application context, String appKey, String accessKey, Bd.b bVar, Activity activity, nd.e eVar, InitListener initListener, nd.b bVar2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            l(this, context, appKey, accessKey, bVar, activity, eVar, initListener, bVar2, null, 256, null);
        }

        public final void j(Application context, String appKey, String accessKey, Bd.b bVar, Activity activity, nd.e eVar, InitListener initListener, nd.b bVar2, String str) {
            C0 d10;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            LiveChatUtil.log("MultipleInit - init called");
            o(context);
            ZohoLDContentProvider.c(context);
            C0 c02 = MobilistenInitProvider.f44222g;
            if (c02 != null && c02.isActive()) {
                we.d dVar = we.d.f67667r;
                LiveChatUtil.triggerInitListener(false, dVar.a(), dVar.b(), null);
                Ye.a.r(false, null);
            }
            C0 c03 = MobilistenInitProvider.f44222g;
            if (c03 != null) {
                C0.a.b(c03, null, 1, null);
            }
            d10 = AbstractC1459k.d(C6461a.f65810a.f(), null, null, new b(bVar, appKey, accessKey, context, activity, eVar, initListener, str, bVar2, null), 3, null);
            d10.invokeOnCompletion(c.f44248d);
            MobilistenInitProvider.f44222g = d10;
            if (Intrinsics.areEqual(System.getProperty("stop_mobilisten_av_library_initialization", Constants.CASEFIRST_FALSE), "true")) {
                return;
            }
            Wd.a aVar = Wd.a.f13230a;
            Application application = MobilistenInitProvider.f44217b;
            if (application == null) {
                application = context;
            }
            aVar.c(application);
            Wd.c cVar = Wd.c.f13237a;
            Application application2 = MobilistenInitProvider.f44217b;
            if (application2 != null) {
                context = application2;
            }
            cVar.b(context, bVar2);
        }

        public final void k(Application context, C6069a configuration, Activity activity, nd.e eVar, InitListener initListener, nd.b bVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            j(context, configuration.f(), configuration.e(), configuration.g(), activity, eVar, initListener, bVar, configuration.j());
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6, com.zoho.livechat.android.utils.LiveChatUtil.getCVUID()) == false) goto L13;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m(Bd.b bVar, String str) {
            boolean z10;
            boolean w10 = Ed.a.f3035a.w();
            if (Intrinsics.areEqual(w10 ? SalesIQJWTAuth.class : null, bVar != null ? bVar.getClass() : null)) {
                if (bVar instanceof SalesIQJWTAuth) {
                    if (w10) {
                        w10 = false;
                        if (!w10) {
                            z10 = false;
                        }
                    }
                    w10 = true;
                    if (!w10) {
                    }
                } else {
                    if (i.f(str)) {
                    }
                    if (!w10) {
                    }
                }
                return LiveChatUtil.getAndroidChannel() == null && z10;
            }
            z10 = true;
            if (LiveChatUtil.getAndroidChannel() == null) {
            }
        }

        public final boolean n(String str, String str2) {
            return (StringsKt.equals(str, MobilistenUtil.d(), true) && StringsKt.equals(str2, MobilistenUtil.c(), true)) ? false : true;
        }

        public final void o(Application application) {
            if (application == null || MobilistenInitProvider.f44217b != null) {
                return;
            }
            MobilistenInitProvider.f44218c = application;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
        
            if (Ph.AbstractC1455i.g(r12, r13, r4) != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        
            if (Ed.a.z(r1, false, null, r4, 3, null) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        
            if (Ph.AbstractC1455i.g(r13, r14, r4) == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object p(String str, String str2, Application application, boolean z10, boolean z11, Continuation continuation) {
            d dVar;
            int i10;
            if (continuation instanceof d) {
                dVar = (d) continuation;
                int i11 = dVar.f44253r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f44253r = i11 - Integer.MIN_VALUE;
                    d dVar2 = dVar;
                    Object obj = dVar2.f44251p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = dVar2.f44253r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        String d10 = MobilistenUtil.d();
                        String c10 = MobilistenUtil.c();
                        if (z10 || (d10 != null && c10 != null && n(str, str2))) {
                            if (z11) {
                                Ed.a aVar = Ed.a.f3035a;
                                dVar2.f44249n = str;
                                dVar2.f44250o = str2;
                                dVar2.f44253r = 1;
                            } else {
                                L b10 = C1452g0.b();
                                e eVar = new e(application, null);
                                dVar2.f44249n = str;
                                dVar2.f44250o = str2;
                                dVar2.f44253r = 2;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i10 != 1 && i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        str2 = (String) dVar2.f44250o;
                        str = (String) dVar2.f44249n;
                        ResultKt.throwOnFailure(obj);
                    }
                    L b11 = C1452g0.b();
                    f fVar = new f(str, str2, null);
                    dVar2.f44249n = null;
                    dVar2.f44250o = null;
                    dVar2.f44253r = 3;
                }
            }
            dVar = new d(continuation);
            d dVar22 = dVar;
            Object obj2 = dVar22.f44251p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = dVar22.f44253r;
            if (i10 != 0) {
            }
            L b112 = C1452g0.b();
            f fVar2 = new f(str, str2, null);
            dVar22.f44249n = null;
            dVar22.f44250o = null;
            dVar22.f44253r = 3;
        }

        public Companion() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44261n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ProviderInfo f44262o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProviderInfo providerInfo, Continuation continuation) {
            super(2, continuation);
            this.f44262o = providerInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f44262o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44261n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C4377a.C0689a c0689a = C4377a.f47235d;
                j applicationManager = ZohoLiveChat.getApplicationManager();
                Application o10 = applicationManager != null ? applicationManager.o() : null;
                Intrinsics.checkNotNull(o10);
                e eVar = new e(c0689a.a(o10));
                b.i iVar = new b.i(Yd.a.j().v(this.f44262o));
                this.f44261n = 1;
                if (eVar.a(iVar, this) == coroutine_suspended) {
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
        public int f44263n;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44263n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Yd.a.i();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44264n;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44264n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Application application = MobilistenInitProvider.f44217b;
            if (application != null) {
                C6218a.b0(application, null, false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Application k() {
        return INSTANCE.e();
    }

    public static final Application l() {
        return INSTANCE.g();
    }

    public static final j m() {
        return INSTANCE.h();
    }

    public static final void n(Application application, String str, String str2, Bd.b bVar, Activity activity, nd.e eVar, InitListener initListener, nd.b bVar2) {
        INSTANCE.i(application, str, str2, bVar, activity, eVar, initListener, bVar2);
    }

    public static final void o(Application application, C6069a c6069a, Activity activity, nd.e eVar, InitListener initListener, nd.b bVar) {
        INSTANCE.k(application, c6069a, activity, eVar, initListener, bVar);
    }

    public static final void p(Application application) {
        INSTANCE.o(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo info) {
        synchronized (f44220e) {
            if (context == null) {
                try {
                    j applicationManager = ZohoLiveChat.getApplicationManager();
                    if (i.e(applicationManager != null ? applicationManager.o() : null)) {
                        AbstractC1459k.d(C6461a.f65810a.e(), null, null, new b(info, null), 3, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        super.attachInfo(context, info);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Resources resources;
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            Context context2 = getContext();
            application = context2 instanceof Application ? (Application) context2 : null;
        }
        f44217b = application;
        Companion companion = INSTANCE;
        Application e10 = companion.e();
        Q.f44460u = (e10 == null || (resources = e10.getResources()) == null) ? false : resources.getBoolean(m.f59916c);
        if (companion.e() != null) {
            C6461a c6461a = C6461a.f65810a;
            AbstractC1459k.d(c6461a.e(), null, null, new c(null), 3, null);
            AbstractC1459k.d(c6461a.e(), null, null, new d(null), 3, null);
        }
        Application application2 = f44217b;
        if (application2 != null) {
            Wd.a.f13230a.c(application2);
            C6549a.C0923a.e(C6549a.f66349d, application2, false, 2, null);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
