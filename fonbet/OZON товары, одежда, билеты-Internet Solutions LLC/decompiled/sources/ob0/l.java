package ob0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import We.B;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import id0.C7050a;
import jc0.C7346i;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import sb0.C9649b;
import tb0.C9793a;
import tb0.C9796d;
import ub0.C10014b;
import ve.EnumC10311b;
import wb0.C10469a;
import xe.C10727i;
import xe.U;
import xe.Y;
import yb0.InterfaceC10879a;
import ze.C11115c;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8685A> f77955a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9796d> f77956b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9649b> f77957c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<B> f77958d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10014b> f77959e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f77960f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9793a> f77961g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Fb0.f f77962h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f77963i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2862e f77964j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Je.d f77965k;

    /* renamed from: l, reason: collision with root package name */
    private volatile s f77966l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C11115c f77967m;

    public l() {
        throw null;
    }

    public l(InterfaceC4008j antibotRouter, InterfaceC4008j antibotJSChallengeManager, InterfaceC4008j antibotCaptchaChallengeManager, InterfaceC4008j ozonIdTrackingManager, InterfaceC4008j fingerprintChecker, InterfaceC4008j composerTrackingRepository, InterfaceC4008j antibotJSChallengeCounter, Fb0.f ozonIdConfig, InterfaceC4008j featureFlagsStore) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(antibotRouter, "antibotRouter");
        Intrinsics.checkNotNullParameter(antibotJSChallengeManager, "antibotJSChallengeManager");
        Intrinsics.checkNotNullParameter(antibotCaptchaChallengeManager, "antibotCaptchaChallengeManager");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(fingerprintChecker, "fingerprintChecker");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(antibotJSChallengeCounter, "antibotJSChallengeCounter");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f77955a = antibotRouter;
        this.f77956b = antibotJSChallengeManager;
        this.f77957c = antibotCaptchaChallengeManager;
        this.f77958d = ozonIdTrackingManager;
        this.f77959e = fingerprintChecker;
        this.f77960f = composerTrackingRepository;
        this.f77961g = antibotJSChallengeCounter;
        this.f77962h = ozonIdConfig;
        this.f77963i = featureFlagsStore;
        this.f77964j = coroutineScope;
        this.f77965k = Je.e.a();
        this.f77967m = ze.k.a(0, 7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x017f, code lost:
    
        if (r12 == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r12 == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        if (r12 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a4, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0089, code lost:
    
        if (r12 == r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(l lVar, C10469a c10469a, kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        h hVar2;
        l lVar2;
        C10469a c10469a2;
        l lVar3;
        C10469a c10469a3;
        s.e eVar;
        s.g gVar;
        C10469a c10469a4;
        s.e eVar2;
        Object bVar;
        kotlin.time.b bVar2;
        lVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.f77947j;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f77947j = i11 - LinearLayoutManager.INVALID_OFFSET;
                hVar2 = hVar;
                Object obj = hVar2.f77945h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                switch (hVar2.f77947j) {
                    case 0:
                        Sc.s.b(obj);
                        Hb0.c value = lVar.f77963i.getValue();
                        f.c cVar2 = f.c.f10797a;
                        hVar2.f77941d = lVar;
                        hVar2.f77942e = c10469a;
                        hVar2.f77947j = 1;
                        obj = value.a(cVar2, hVar2);
                        break;
                    case 1:
                        c10469a = hVar2.f77942e;
                        lVar = hVar2.f77941d;
                        Sc.s.b(obj);
                        long longValue = ((Number) obj).longValue();
                        if (longValue > 0) {
                            hVar2.f77941d = lVar;
                            hVar2.f77942e = c10469a;
                            hVar2.f77947j = 2;
                            break;
                        }
                        C10469a c10469a5 = c10469a;
                        lVar2 = lVar;
                        c10469a2 = c10469a5;
                        C10014b value2 = lVar2.f77959e.getValue();
                        hVar2.f77941d = lVar2;
                        hVar2.f77942e = c10469a2;
                        hVar2.f77947j = 3;
                        obj = value2.h(c10469a2, hVar2);
                        break;
                    case 2:
                        c10469a2 = hVar2.f77942e;
                        lVar2 = hVar2.f77941d;
                        Sc.s.b(obj);
                        C10014b value22 = lVar2.f77959e.getValue();
                        hVar2.f77941d = lVar2;
                        hVar2.f77942e = c10469a2;
                        hVar2.f77947j = 3;
                        obj = value22.h(c10469a2, hVar2);
                        break;
                    case 3:
                        c10469a2 = hVar2.f77942e;
                        lVar2 = hVar2.f77941d;
                        Sc.s.b(obj);
                        lVar3 = lVar2;
                        s.e eVar3 = (s.e) obj;
                        if (eVar3.b() != s.f.FingerprintChallengeBlock) {
                            c10469a3 = c10469a2;
                            eVar = eVar3;
                            hVar2.f77941d = lVar3;
                            hVar2.f77942e = c10469a3;
                            hVar2.f77943f = eVar;
                            hVar2.f77947j = 5;
                            obj = lVar3.n(c10469a3, hVar2);
                            break;
                        } else {
                            s.g gVar2 = new s.g(s.h.JsChallengeNoCheck, (s.d) null, 6);
                            s.b bVar3 = new s.b(s.c.CaptchaChallengeNoCheck, null);
                            hVar2.f77941d = null;
                            hVar2.f77942e = null;
                            hVar2.f77947j = 4;
                            Object m11 = lVar3.m(c10469a2, eVar3, gVar2, bVar3, hVar2);
                            if (m11 != aVar) {
                                return m11;
                            }
                        }
                    case 4:
                        Sc.s.b(obj);
                        return obj;
                    case 5:
                        eVar = hVar2.f77943f;
                        c10469a3 = hVar2.f77942e;
                        lVar3 = hVar2.f77941d;
                        Sc.s.b(obj);
                        gVar = (s.g) obj;
                        if (gVar.d() != s.h.JsChallengeBlock) {
                            c10469a4 = c10469a3;
                            eVar2 = eVar;
                            hVar2.f77941d = lVar3;
                            hVar2.f77942e = c10469a4;
                            hVar2.f77943f = eVar2;
                            hVar2.f77944g = gVar;
                            hVar2.f77947j = 7;
                            lVar3.getClass();
                            String b11 = c10469a4.b();
                            if (b11 == null || kotlin.text.h.K(b11)) {
                                bVar = new s.b(s.c.CaptchaChallengeNoUrl, null);
                            } else if (C7346i.a(b11)) {
                                Long a11 = c10469a4.a();
                                if (a11 != null) {
                                    b.Companion companion = kotlin.time.b.INSTANCE;
                                    bVar2 = kotlin.time.b.e(kotlin.time.c.h(a11.longValue(), EnumC10311b.MILLISECONDS));
                                } else {
                                    bVar2 = null;
                                }
                                bVar = lVar3.f77957c.getValue().b(b11, bVar2, i.f77948b, hVar2);
                            } else {
                                bVar = new s.b(s.c.CaptchaChallengeNotValidUrl, null);
                            }
                            obj = bVar;
                            break;
                        } else {
                            s.b bVar4 = new s.b(s.c.CaptchaChallengeNoCheck, null);
                            hVar2.f77941d = null;
                            hVar2.f77942e = null;
                            hVar2.f77943f = null;
                            hVar2.f77947j = 6;
                            Object m12 = lVar3.m(c10469a3, eVar, gVar, bVar4, hVar2);
                            if (m12 != aVar) {
                                return m12;
                            }
                        }
                    case 6:
                        Sc.s.b(obj);
                        return obj;
                    case 7:
                        s.g gVar3 = hVar2.f77944g;
                        eVar2 = hVar2.f77943f;
                        C10469a c10469a6 = hVar2.f77942e;
                        l lVar4 = hVar2.f77941d;
                        Sc.s.b(obj);
                        c10469a4 = c10469a6;
                        lVar3 = lVar4;
                        gVar = gVar3;
                        hVar2.f77941d = null;
                        hVar2.f77942e = null;
                        hVar2.f77943f = null;
                        hVar2.f77944g = null;
                        hVar2.f77947j = 8;
                        Object m13 = lVar3.m(c10469a4, eVar2, gVar, (s.b) obj, hVar2);
                        return m13 == aVar ? aVar : m13;
                    case 8:
                        Sc.s.b(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        hVar = new h(lVar, cVar);
        hVar2 = hVar;
        Object obj2 = hVar2.f77945h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        switch (hVar2.f77947j) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(s sVar, kotlin.coroutines.jvm.internal.c cVar) {
        C8686a c8686a;
        Wc.a aVar;
        int i11;
        long longValue;
        if (cVar instanceof C8686a) {
            c8686a = (C8686a) cVar;
            int i12 = c8686a.f77917g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8686a.f77917g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8686a.f77915e;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8686a.f77917g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f77955a.getValue().l();
                    Hb0.c value = this.f77963i.getValue();
                    f.m mVar = f.m.f10810a;
                    c8686a.f77914d = sVar;
                    c8686a.f77917g = 1;
                    obj = value.a(mVar, c8686a);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s sVar2 = c8686a.f77914d;
                        Sc.s.b(obj);
                        return sVar2;
                    }
                    sVar = c8686a.f77914d;
                    Sc.s.b(obj);
                }
                longValue = ((Number) obj).longValue();
                if (sVar.f() && longValue > 0) {
                    c8686a.f77914d = sVar;
                    c8686a.f77917g = 2;
                    if (Y.b(longValue, c8686a) != aVar) {
                        return aVar;
                    }
                }
                return sVar;
            }
        }
        c8686a = new C8686a(this, cVar);
        Object obj2 = c8686a.f77915e;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8686a.f77917g;
        if (i11 != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (sVar.f()) {
            c8686a.f77914d = sVar;
            c8686a.f77917g = 2;
            if (Y.b(longValue, c8686a) != aVar) {
            }
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(C10469a c10469a, s.e eVar, s.g gVar, s.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        C8690e c8690e;
        Object obj;
        int i11;
        s sVar;
        U u11;
        l lVar;
        Uri parse;
        Uri.Builder buildUpon;
        Uri.Builder appendQueryParameter;
        Uri build;
        s sVar2;
        if (cVar instanceof C8690e) {
            c8690e = (C8690e) cVar;
            int i12 = c8690e.f77935i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8690e.f77935i = i12 - LinearLayoutManager.INVALID_OFFSET;
                C8690e c8690e2 = c8690e;
                obj = c8690e2.f77933g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8690e2.f77935i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    s.a aVar2 = ((eVar.b() == s.f.FingerprintChallengeBlock || gVar.d() == s.h.JsChallengeBlock || bVar.a() == s.c.CaptchaChallengeBlock) || !(eVar.b() == s.f.FingerprintChallengeSuccess || gVar.d() == s.h.JsChallengeSuccess || bVar.a() == s.c.CaptchaChallengeSuccess)) ? s.a.BlockAntibot : s.a.PassAntibot;
                    String f7 = c10469a.f();
                    s.a aVar3 = s.a.PassAntibot;
                    s.a aVar4 = aVar2;
                    sVar = new s(f7, aVar2 == aVar3, aVar4, eVar, gVar, bVar);
                    this.f77960f.getValue().c(new f(this, c10469a, sVar));
                    if (aVar4 == aVar3) {
                        c8690e2.f77935i = 1;
                        Object j11 = j(sVar, c8690e2);
                        if (j11 != aVar) {
                            return j11;
                        }
                    } else {
                        String V11 = C7714v.V(C7714v.b0(new Integer(eVar.b().b()), new Integer(gVar.d().b()), new Integer(bVar.a().b())), "", null, null, null, 62);
                        String j12 = c10469a.j();
                        String uri = (j12 == null || (parse = Uri.parse(j12)) == null || (buildUpon = parse.buildUpon()) == null || (appendQueryParameter = buildUpon.appendQueryParameter("mobile_result", V11)) == null || (build = appendQueryParameter.build()) == null) ? null : build.toString();
                        boolean z11 = gVar.d() == s.h.JsChallengeNetworkError || bVar.a() == s.c.CaptchaChallengeNetworkError;
                        U a11 = C10727i.a(this.f77964j, null, null, new g(this, null), 3);
                        C8685A value = this.f77955a.getValue();
                        String f11 = c10469a.f();
                        String d11 = c10469a.d();
                        Boolean e11 = c10469a.e();
                        c8690e2.f77930d = this;
                        c8690e2.f77931e = sVar;
                        c8690e2.f77932f = a11;
                        c8690e2.f77935i = 2;
                        Object h11 = value.h(f11, uri, z11, V11, d11, e11, c8690e2);
                        if (h11 != aVar) {
                            u11 = a11;
                            obj = h11;
                            lVar = this;
                        }
                    }
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    return obj;
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            Sc.s.b(obj);
                            return obj;
                        }
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return obj;
                    }
                    sVar2 = c8690e2.f77931e;
                    lVar = c8690e2.f77930d;
                    Sc.s.b(obj);
                    s a12 = s.a(sVar2, ((Boolean) obj).booleanValue());
                    c8690e2.f77930d = null;
                    c8690e2.f77931e = null;
                    c8690e2.f77935i = 4;
                    Object j13 = lVar.j(a12, c8690e2);
                    return j13 != aVar ? aVar : j13;
                }
                u11 = (U) c8690e2.f77932f;
                s sVar3 = c8690e2.f77931e;
                l lVar2 = c8690e2.f77930d;
                Sc.s.b(obj);
                sVar = sVar3;
                lVar = lVar2;
                if (((Boolean) obj).booleanValue()) {
                    u11.j(null);
                    c8690e2.f77930d = null;
                    c8690e2.f77931e = null;
                    c8690e2.f77932f = null;
                    c8690e2.f77935i = 5;
                    Object j14 = lVar.j(sVar, c8690e2);
                    if (j14 != aVar) {
                        return j14;
                    }
                } else {
                    c8690e2.f77930d = lVar;
                    c8690e2.f77931e = sVar;
                    c8690e2.f77932f = null;
                    c8690e2.f77935i = 3;
                    obj = u11.s(c8690e2);
                    if (obj != aVar) {
                        sVar2 = sVar;
                        s a122 = s.a(sVar2, ((Boolean) obj).booleanValue());
                        c8690e2.f77930d = null;
                        c8690e2.f77931e = null;
                        c8690e2.f77935i = 4;
                        Object j132 = lVar.j(a122, c8690e2);
                        if (j132 != aVar) {
                        }
                    }
                }
            }
        }
        c8690e = new C8690e(this, cVar);
        C8690e c8690e22 = c8690e;
        obj = c8690e22.f77933g;
        Wc.a aVar5 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8690e22.f77935i;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(C10469a c10469a, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        long currentTimeMillis;
        s.g gVar;
        l lVar;
        l lVar2;
        long j11;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f77953h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f77953h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f77951f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f77953h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String c11 = c10469a.c();
                    currentTimeMillis = System.currentTimeMillis();
                    if (c11 == null || kotlin.text.h.K(c11)) {
                        gVar = new s.g(s.h.JsChallengeNoUrl, (s.d) null, 6);
                    } else if (!C7346i.a(c11)) {
                        gVar = new s.g(s.h.JsChallengeNotValidUrl, (s.d) null, 6);
                    } else if (this.f77961g.getValue().b()) {
                        gVar = new s.g(s.h.JsChallengeLoopError, (s.d) null, 6);
                    } else {
                        C9796d value = this.f77956b.getValue();
                        jVar.f77949d = this;
                        jVar.f77950e = currentTimeMillis;
                        jVar.f77953h = 1;
                        int i13 = rb0.c.f83273d;
                        obj = value.b(c11, null, k.f77954b, jVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        lVar2 = this;
                        j11 = currentTimeMillis;
                    }
                    lVar = this;
                    lVar.f77961g.getValue().c();
                    return s.g.a(gVar, System.currentTimeMillis() - currentTimeMillis);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = jVar.f77950e;
                lVar2 = jVar.f77949d;
                Sc.s.b(obj);
                s.g gVar2 = (s.g) obj;
                lVar = lVar2;
                gVar = gVar2;
                currentTimeMillis = j11;
                lVar.f77961g.getValue().c();
                return s.g.a(gVar, System.currentTimeMillis() - currentTimeMillis);
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f77951f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f77953h;
        if (i11 != 0) {
        }
        s.g gVar22 = (s.g) obj2;
        lVar = lVar2;
        gVar = gVar22;
        currentTimeMillis = j11;
        lVar.f77961g.getValue().c();
        return s.g.a(gVar, System.currentTimeMillis() - currentTimeMillis);
    }

    public final void k(boolean z11) {
        this.f77967m.b(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(@NotNull B.a aVar, @NotNull C10469a c10469a, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8687b c8687b;
        int i11;
        l lVar;
        InterfaceC10879a antibotEventListener;
        if (cVar instanceof C8687b) {
            c8687b = (C8687b) cVar;
            int i12 = c8687b.f77922h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8687b.f77922h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8687b.f77920f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8687b.f77922h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    U a11 = C10727i.a(this.f77964j, null, null, new C8688c(this, c10469a, null), 3);
                    c8687b.f77918d = this;
                    c8687b.f77919e = aVar;
                    c8687b.f77922h = 1;
                    obj = a11.s(c8687b);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    lVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = c8687b.f77919e;
                    lVar = c8687b.f77918d;
                    Sc.s.b(obj);
                }
                s sVar = (s) obj;
                C8689d c8689d = new C8689d(sVar, aVar);
                antibotEventListener = lVar.f77962h.getAntibotEventListener();
                if (antibotEventListener != null) {
                    antibotEventListener.onFlowEnd(c8689d);
                }
                return sVar;
            }
        }
        c8687b = new C8687b(this, cVar);
        Object obj2 = c8687b.f77920f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8687b.f77922h;
        if (i11 != 0) {
        }
        s sVar2 = (s) obj2;
        C8689d c8689d2 = new C8689d(sVar2, aVar);
        antibotEventListener = lVar.f77962h.getAntibotEventListener();
        if (antibotEventListener != null) {
        }
        return sVar2;
    }
}
