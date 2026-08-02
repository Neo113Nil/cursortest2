package c;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1469p;
import android.app.Activity;
import android.content.Context;
import com.surt.guardian.GuardianSDK;
import com.surt.guardian.core.Configuration;
import com.surt.guardian.models.GuardianDiagnostics;
import com.surt.guardian.network.VerificationResult;
import com.surt.guardian.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import zc.C6957c;

/* renamed from: c.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2449j0 extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public Object f26588n;

    /* renamed from: o, reason: collision with root package name */
    public Object f26589o;

    /* renamed from: p, reason: collision with root package name */
    public String f26590p;

    /* renamed from: q, reason: collision with root package name */
    public Map f26591q;

    /* renamed from: r, reason: collision with root package name */
    public int f26592r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f26593s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f26594t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26595u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f26596v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f26597w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f26598x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2449j0(String str, GuardianSDK guardianSDK, boolean z10, String str2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f26594t = str;
        this.f26595u = guardianSDK;
        this.f26596v = z10;
        this.f26597w = str2;
        this.f26598x = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C2449j0 c2449j0 = new C2449j0(this.f26594t, this.f26595u, this.f26596v, this.f26597w, this.f26598x, continuation);
        c2449j0.f26593s = obj;
        return c2449j0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2449j0) create((Ph.P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02d5, code lost:
    
        if (r8 != r10) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c6 A[Catch: Exception -> 0x0043, TryCatch #5 {Exception -> 0x0043, blocks: (B:8:0x0034, B:12:0x02de, B:16:0x02fc, B:20:0x0321, B:22:0x0329, B:24:0x0335, B:25:0x0376, B:27:0x0395, B:28:0x03c0, B:30:0x03c8, B:34:0x0372, B:36:0x0301, B:38:0x030b, B:40:0x0313, B:44:0x02e9, B:59:0x029e, B:70:0x0278, B:82:0x007c, B:84:0x01f7, B:85:0x020b, B:102:0x0091, B:104:0x01b6, B:106:0x01c6, B:108:0x01cc, B:114:0x009c, B:117:0x018c, B:119:0x01a3, B:124:0x00a9, B:126:0x017d, B:130:0x00bb, B:131:0x0168, B:135:0x00c7, B:137:0x00e9, B:138:0x00f2, B:140:0x00f6, B:142:0x0100, B:144:0x0108, B:146:0x0112, B:148:0x011a, B:150:0x0124, B:152:0x0160), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3 A[Catch: Exception -> 0x0043, TryCatch #5 {Exception -> 0x0043, blocks: (B:8:0x0034, B:12:0x02de, B:16:0x02fc, B:20:0x0321, B:22:0x0329, B:24:0x0335, B:25:0x0376, B:27:0x0395, B:28:0x03c0, B:30:0x03c8, B:34:0x0372, B:36:0x0301, B:38:0x030b, B:40:0x0313, B:44:0x02e9, B:59:0x029e, B:70:0x0278, B:82:0x007c, B:84:0x01f7, B:85:0x020b, B:102:0x0091, B:104:0x01b6, B:106:0x01c6, B:108:0x01cc, B:114:0x009c, B:117:0x018c, B:119:0x01a3, B:124:0x00a9, B:126:0x017d, B:130:0x00bb, B:131:0x0168, B:135:0x00c7, B:137:0x00e9, B:138:0x00f2, B:140:0x00f6, B:142:0x0100, B:144:0x0108, B:146:0x0112, B:148:0x011a, B:150:0x0124, B:152:0x0160), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Z z10;
        Ph.P p10;
        v0 v0Var;
        WeakReference weakReference;
        Context context;
        Configuration configuration;
        Z z11;
        Object access$collectFingerprint;
        Ph.P p11;
        String str;
        C2435c0 c2435c0;
        C2443g0 a10;
        C2443g0 c2443g0;
        String str2;
        Ph.P p12;
        String str3;
        Object access$performAttestation;
        C2443g0 c2443g02;
        String str4;
        String str5;
        Map map;
        Ph.P p13;
        Object access$collectDeviceData;
        C2443g0 c2443g03;
        Ph.P p14;
        String str6;
        Z z12;
        String str7;
        Map map2;
        Z z13;
        Object a11;
        Map map3;
        String str8;
        C2443g0 c2443g04;
        Ph.P p15;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        D d10;
        Object c10;
        Map map4;
        String str14;
        v0 v0Var2;
        Object m147constructorimpl;
        C2434c c2434c;
        C2434c c2434c2;
        C6957c c6957c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Unexpected error during verification", e10);
            S0.b("verification", e10);
            GuardianSDK.access$handleFailure(this.f26595u, new D0(e10), this.f26598x);
        }
        switch (this.f26592r) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Ph.P p16 = (Ph.P) this.f26593s;
                Logger logger = Logger.f41582a;
                logger.d("GuardianSDK", "Starting device verification (session: " + this.f26594t + ')');
                z10 = this.f26595u.f41542h;
                if (z10.f26512b) {
                    z11 = this.f26595u.f41542h;
                    z11.b();
                }
                if (this.f26596v) {
                    v0Var = this.f26595u.f41540f;
                    K0 k02 = v0Var.f26707k;
                    if (k02 == null || (AbstractC5338c.checkSelfPermission(k02.f26453a, "android.permission.ACCESS_FINE_LOCATION") != 0 && AbstractC5338c.checkSelfPermission(k02.f26453a, "android.permission.ACCESS_COARSE_LOCATION") != 0)) {
                        weakReference = this.f26595u.f41538d;
                        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                        if (activity != null) {
                            logger.d("GuardianSDK", "Requesting location permission...");
                            context = this.f26595u.f41535a;
                            configuration = this.f26595u.f41536b;
                            U u10 = new U(context, configuration);
                            this.f26593s = p16;
                            this.f26588n = activity;
                            this.f26589o = u10;
                            this.f26592r = 1;
                            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
                            c1469p.F();
                            u10.a(activity, new C2433b0(c1469p));
                            Object z14 = c1469p.z();
                            if (z14 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(this);
                            }
                            if (z14 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            p10 = p16;
                            this.f26593s = p10;
                            this.f26588n = null;
                            this.f26589o = null;
                            this.f26592r = 2;
                            if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            GuardianSDK guardianSDK = this.f26595u;
                            this.f26593s = p10;
                            this.f26592r = 3;
                            access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK, this);
                            if (access$collectFingerprint == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            p11 = p10;
                            str = (String) access$collectFingerprint;
                            c2435c0 = this.f26595u.f41545k;
                            String str15 = this.f26597w;
                            c2435c0.getClass();
                            a10 = C2435c0.a(str15);
                            if (a10.d()) {
                                GuardianSDK guardianSDK2 = this.f26595u;
                                this.f26593s = p11;
                                this.f26588n = str;
                                this.f26589o = a10;
                                this.f26592r = 4;
                                access$performAttestation = GuardianSDK.access$performAttestation(guardianSDK2, a10, this);
                                if (access$performAttestation == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str3 = (String) access$performAttestation;
                                Ph.P p17 = p11;
                                c2443g0 = a10;
                                str2 = str;
                                p12 = p17;
                                if (c2443g0 == null && c2443g0.e()) {
                                    GuardianSDK guardianSDK3 = this.f26595u;
                                    List c11 = c2443g0.c();
                                    boolean z15 = this.f26596v;
                                    this.f26593s = p12;
                                    this.f26588n = str2;
                                    this.f26589o = c2443g0;
                                    this.f26590p = str3;
                                    this.f26592r = 5;
                                    Ph.P p18 = p12;
                                    String str16 = str2;
                                    access$collectDeviceData = GuardianSDK.access$collectDeviceData(guardianSDK3, c11, str3, c2443g0, z15, this);
                                    if (access$collectDeviceData == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    c2443g03 = c2443g0;
                                    p14 = p18;
                                    str6 = str16;
                                    p13 = p14;
                                    c2443g02 = c2443g03;
                                    str4 = str6;
                                    str5 = str3;
                                    map = (Map) access$collectDeviceData;
                                    z12 = this.f26595u.f41542h;
                                    if (z12.f26512b) {
                                    }
                                } else {
                                    Ph.P p19 = p12;
                                    c2443g02 = c2443g0;
                                    str4 = str2;
                                    str5 = str3;
                                    map = null;
                                    p13 = p19;
                                    z12 = this.f26595u.f41542h;
                                    if (z12.f26512b) {
                                        try {
                                            z13 = this.f26595u.f41542h;
                                            this.f26593s = p13;
                                            this.f26588n = str4;
                                            this.f26589o = c2443g02;
                                            this.f26590p = str5;
                                            this.f26591q = map;
                                            str7 = str4;
                                        } catch (Exception e11) {
                                            e = e11;
                                            str7 = str4;
                                        }
                                        try {
                                            this.f26592r = 6;
                                            a11 = z13.a(this);
                                        } catch (Exception e12) {
                                            e = e12;
                                            map2 = map;
                                            str11 = null;
                                            Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                                            map3 = map2;
                                            str10 = str11;
                                            str8 = str5;
                                            c2443g04 = c2443g02;
                                            p15 = p13;
                                            str9 = str7;
                                            G g10 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                                            str12 = str8;
                                            str13 = str10;
                                            d10 = this.f26595u.f41546l;
                                            String str17 = this.f26597w;
                                            this.f26593s = p15;
                                            this.f26588n = c2443g04;
                                            this.f26589o = str12;
                                            this.f26590p = str13;
                                            this.f26591q = null;
                                            this.f26592r = 7;
                                            c10 = d10.c(g10, str17, this);
                                            break;
                                        }
                                        if (a11 != coroutine_suspended) {
                                            map2 = map;
                                            try {
                                                str11 = (String) a11;
                                                if (str11 == null) {
                                                    try {
                                                        map4 = map2;
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                    }
                                                    try {
                                                        Logger.f41582a.d("GuardianSDK", "Verisoul session ID obtained: " + StringsKt.take(str11, 8) + "...");
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        map2 = map4;
                                                        Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                                                        map3 = map2;
                                                        str10 = str11;
                                                        str8 = str5;
                                                        c2443g04 = c2443g02;
                                                        p15 = p13;
                                                        str9 = str7;
                                                        G g102 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                                                        str12 = str8;
                                                        str13 = str10;
                                                        d10 = this.f26595u.f41546l;
                                                        String str172 = this.f26597w;
                                                        this.f26593s = p15;
                                                        this.f26588n = c2443g04;
                                                        this.f26589o = str12;
                                                        this.f26590p = str13;
                                                        this.f26591q = null;
                                                        this.f26592r = 7;
                                                        c10 = d10.c(g102, str172, this);
                                                    }
                                                } else {
                                                    map4 = map2;
                                                }
                                                map3 = map4;
                                            } catch (Exception e15) {
                                                e = e15;
                                                str11 = null;
                                                Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                                                map3 = map2;
                                                str10 = str11;
                                                str8 = str5;
                                                c2443g04 = c2443g02;
                                                p15 = p13;
                                                str9 = str7;
                                                G g1022 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                                                str12 = str8;
                                                str13 = str10;
                                                d10 = this.f26595u.f41546l;
                                                String str1722 = this.f26597w;
                                                this.f26593s = p15;
                                                this.f26588n = c2443g04;
                                                this.f26589o = str12;
                                                this.f26590p = str13;
                                                this.f26591q = null;
                                                this.f26592r = 7;
                                                c10 = d10.c(g1022, str1722, this);
                                            }
                                            str10 = str11;
                                            str8 = str5;
                                            c2443g04 = c2443g02;
                                            p15 = p13;
                                            str9 = str7;
                                            G g10222 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                                            str12 = str8;
                                            str13 = str10;
                                            d10 = this.f26595u.f41546l;
                                            String str17222 = this.f26597w;
                                            this.f26593s = p15;
                                            this.f26588n = c2443g04;
                                            this.f26589o = str12;
                                            this.f26590p = str13;
                                            this.f26591q = null;
                                            this.f26592r = 7;
                                            c10 = d10.c(g10222, str17222, this);
                                        }
                                        return coroutine_suspended;
                                    }
                                    map3 = map;
                                    str8 = str5;
                                    c2443g04 = c2443g02;
                                    p15 = p13;
                                    str9 = str4;
                                    str10 = null;
                                    G g102222 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                                    str12 = str8;
                                    str13 = str10;
                                    d10 = this.f26595u.f41546l;
                                    String str172222 = this.f26597w;
                                    this.f26593s = p15;
                                    this.f26588n = c2443g04;
                                    this.f26589o = str12;
                                    this.f26590p = str13;
                                    this.f26591q = null;
                                    this.f26592r = 7;
                                    c10 = d10.c(g102222, str172222, this);
                                }
                            } else {
                                c2443g0 = a10;
                                str2 = str;
                                p12 = p11;
                                str3 = null;
                                if (c2443g0 == null) {
                                }
                                Ph.P p192 = p12;
                                c2443g02 = c2443g0;
                                str4 = str2;
                                str5 = str3;
                                map = null;
                                p13 = p192;
                                z12 = this.f26595u.f41542h;
                                if (z12.f26512b) {
                                }
                            }
                        }
                    }
                }
                p10 = p16;
                GuardianSDK guardianSDK4 = this.f26595u;
                this.f26593s = p10;
                this.f26592r = 3;
                access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK4, this);
                if (access$collectFingerprint == coroutine_suspended) {
                }
                p11 = p10;
                str = (String) access$collectFingerprint;
                c2435c0 = this.f26595u.f41545k;
                String str152 = this.f26597w;
                c2435c0.getClass();
                a10 = C2435c0.a(str152);
                if (a10.d()) {
                }
                break;
            case 1:
                p10 = (Ph.P) this.f26593s;
                ResultKt.throwOnFailure(obj);
                this.f26593s = p10;
                this.f26588n = null;
                this.f26589o = null;
                this.f26592r = 2;
                if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                }
                GuardianSDK guardianSDK42 = this.f26595u;
                this.f26593s = p10;
                this.f26592r = 3;
                access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK42, this);
                if (access$collectFingerprint == coroutine_suspended) {
                }
                p11 = p10;
                str = (String) access$collectFingerprint;
                c2435c0 = this.f26595u.f41545k;
                String str1522 = this.f26597w;
                c2435c0.getClass();
                a10 = C2435c0.a(str1522);
                if (a10.d()) {
                }
                break;
            case 2:
                p10 = (Ph.P) this.f26593s;
                ResultKt.throwOnFailure(obj);
                GuardianSDK guardianSDK422 = this.f26595u;
                this.f26593s = p10;
                this.f26592r = 3;
                access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK422, this);
                if (access$collectFingerprint == coroutine_suspended) {
                }
                p11 = p10;
                str = (String) access$collectFingerprint;
                c2435c0 = this.f26595u.f41545k;
                String str15222 = this.f26597w;
                c2435c0.getClass();
                a10 = C2435c0.a(str15222);
                if (a10.d()) {
                }
                break;
            case 3:
                p10 = (Ph.P) this.f26593s;
                ResultKt.throwOnFailure(obj);
                access$collectFingerprint = obj;
                p11 = p10;
                str = (String) access$collectFingerprint;
                c2435c0 = this.f26595u.f41545k;
                String str152222 = this.f26597w;
                c2435c0.getClass();
                a10 = C2435c0.a(str152222);
                if (a10.d()) {
                }
                break;
            case 4:
                a10 = (C2443g0) this.f26589o;
                str = (String) this.f26588n;
                p11 = (Ph.P) this.f26593s;
                ResultKt.throwOnFailure(obj);
                access$performAttestation = obj;
                str3 = (String) access$performAttestation;
                Ph.P p172 = p11;
                c2443g0 = a10;
                str2 = str;
                p12 = p172;
                if (c2443g0 == null) {
                }
                Ph.P p1922 = p12;
                c2443g02 = c2443g0;
                str4 = str2;
                str5 = str3;
                map = null;
                p13 = p1922;
                z12 = this.f26595u.f41542h;
                if (z12.f26512b) {
                }
                break;
            case 5:
                String str18 = this.f26590p;
                c2443g03 = (C2443g0) this.f26589o;
                str6 = (String) this.f26588n;
                p14 = (Ph.P) this.f26593s;
                ResultKt.throwOnFailure(obj);
                str3 = str18;
                access$collectDeviceData = obj;
                p13 = p14;
                c2443g02 = c2443g03;
                str4 = str6;
                str5 = str3;
                map = (Map) access$collectDeviceData;
                z12 = this.f26595u.f41542h;
                if (z12.f26512b) {
                }
                break;
            case 6:
                map2 = this.f26591q;
                str5 = this.f26590p;
                c2443g02 = (C2443g0) this.f26589o;
                String str19 = (String) this.f26588n;
                Ph.P p20 = (Ph.P) this.f26593s;
                try {
                    ResultKt.throwOnFailure(obj);
                    a11 = obj;
                    p13 = p20;
                    str7 = str19;
                    str11 = (String) a11;
                    if (str11 == null) {
                    }
                    map3 = map4;
                } catch (Exception e16) {
                    e = e16;
                    p13 = p20;
                    str11 = null;
                    str7 = str19;
                    Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                    map3 = map2;
                    str10 = str11;
                    str8 = str5;
                    c2443g04 = c2443g02;
                    p15 = p13;
                    str9 = str7;
                    G g1022222 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                    str12 = str8;
                    str13 = str10;
                    d10 = this.f26595u.f41546l;
                    String str1722222 = this.f26597w;
                    this.f26593s = p15;
                    this.f26588n = c2443g04;
                    this.f26589o = str12;
                    this.f26590p = str13;
                    this.f26591q = null;
                    this.f26592r = 7;
                    c10 = d10.c(g1022222, str1722222, this);
                    break;
                }
                str10 = str11;
                str8 = str5;
                c2443g04 = c2443g02;
                p15 = p13;
                str9 = str7;
                G g10222222 = new G(this.f26594t, str9, System.currentTimeMillis(), str8, map3, null, GuardianSDK.access$getAppVersion(this.f26595u), null, str10);
                str12 = str8;
                str13 = str10;
                d10 = this.f26595u.f41546l;
                String str17222222 = this.f26597w;
                this.f26593s = p15;
                this.f26588n = c2443g04;
                this.f26589o = str12;
                this.f26590p = str13;
                this.f26591q = null;
                this.f26592r = 7;
                c10 = d10.c(g10222222, str17222222, this);
                break;
            case 7:
                str13 = this.f26590p;
                str12 = (String) this.f26589o;
                c2443g04 = (C2443g0) this.f26588n;
                p15 = (Ph.P) this.f26593s;
                ResultKt.throwOnFailure(obj);
                c10 = ((Result) obj).getValue();
                Ph.P p21 = p15;
                String str20 = "not_requested";
                if (c2443g04 == null || !c2443g04.d()) {
                    str14 = "not_requested";
                } else if (str12 != null) {
                    str14 = "collected";
                } else {
                    c6957c = this.f26595u.f41541g;
                    str14 = !c6957c.e() ? "not_supported" : "failed";
                }
                if (this.f26596v) {
                    v0Var2 = this.f26595u.f41540f;
                    K0 k03 = v0Var2.f26707k;
                    str20 = (k03 == null || !(AbstractC5338c.checkSelfPermission(k03.f26453a, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(k03.f26453a, "android.permission.ACCESS_COARSE_LOCATION") == 0)) ? "denied" : "collected";
                }
                GuardianDiagnostics access$buildDeviceDiagnostics = GuardianSDK.access$buildDeviceDiagnostics(this.f26595u, str20, str14, (str13 == null || StringsKt.isBlank(str13)) ? "unavailable" : "collected");
                if (Result.m154isSuccessimpl(c10)) {
                    VerificationResult verificationResult = (VerificationResult) c10;
                    m147constructorimpl = Result.m147constructorimpl(VerificationResult.copy$default(verificationResult, false, null, null, null, 0L, null, GuardianDiagnostics.copy$default(access$buildDeviceDiagnostics, null, null, null, verificationResult.getDiagnostics().getAttestationResult(), verificationResult.getDiagnostics().getNetworkIntelResult(), null, 39, null), 63, null));
                } else {
                    m147constructorimpl = Result.m147constructorimpl(c10);
                }
                AbstractC1459k.d(p21, C1452g0.c(), null, new C2441f0(this.f26598x, m147constructorimpl, null), 2, null);
                GuardianSDK guardianSDK5 = this.f26595u;
                if (Result.m154isSuccessimpl(m147constructorimpl)) {
                    VerificationResult verificationResult2 = (VerificationResult) m147constructorimpl;
                    Logger.f41582a.d("GuardianSDK", "Verification complete: allowed=" + verificationResult2.getAllowed() + ", risk=" + verificationResult2.getRiskLevel());
                    c2434c2 = guardianSDK5.f41537c;
                    c2434c2.d(verificationResult2);
                }
                GuardianSDK guardianSDK6 = this.f26595u;
                Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    Logger.f41582a.b("GuardianSDK", "Verification failed: " + m150exceptionOrNullimpl.getMessage(), m150exceptionOrNullimpl);
                    S0.b("verification", m150exceptionOrNullimpl);
                    c2434c = guardianSDK6.f41537c;
                    c2434c.a(new D0(m150exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
