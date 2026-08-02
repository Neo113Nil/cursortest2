package com.surt.guardian;

import Ac.b;
import Ac.c;
import Bc.a;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1469p;
import Ph.P;
import Ph.Q;
import Ph.X0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import c.C2428A;
import c.C2429B;
import c.C2434c;
import c.C2435c0;
import c.C2436d;
import c.C2437d0;
import c.C2438e;
import c.C2443g0;
import c.C2444h;
import c.C2447i0;
import c.C2449j0;
import c.C2452l;
import c.C2455m0;
import c.C2458o;
import c.C2460p;
import c.C2461p0;
import c.C2463q0;
import c.C2464r0;
import c.C2465s;
import c.C2467t;
import c.C2470w;
import c.C2471x;
import c.D;
import c.E;
import c.F;
import c.F0;
import c.I;
import c.J;
import c.M;
import c.N;
import c.N0;
import c.Q0;
import c.S0;
import c.X;
import c.Y;
import c.Z;
import c.t0;
import c.v0;
import c.y0;
import com.surt.guardian.core.Configuration;
import com.surt.guardian.models.GuardianDiagnostics;
import com.surt.guardian.models.GuardianWarning;
import com.surt.guardian.network.CollectResult;
import com.surt.guardian.network.VerificationResult;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventKeys;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zc.AbstractC6956b;
import zc.C6957c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u0001:\u00012J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f\u0012\u0004\u0012\u00020\u00040\u000bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J:\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\"J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)R(\u00100\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lcom/surt/guardian/GuardianSDK;", "", "Landroid/app/Activity;", "activity", "", "setActivity", "(Landroid/app/Activity;)V", "", "jwt", "", "collectLocation", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/surt/guardian/network/VerificationResult;", "callback", "verify", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "verifySuspend-0E7RQCE", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifySuspend", "Lcom/surt/guardian/network/CollectResult;", "collect", "collectSuspend-0E7RQCE", "collectSuspend", "LAc/c;", "getConfiguration", "()LAc/c;", "", "getCollectedSignalsSummary", "()Ljava/util/Map;", "isAttestationAvailable", "()Z", "isVerisoulAvailable", "reinitializeVerisoul", "()V", "Lcom/surt/guardian/utils/Logger$Level;", "level", "setLogLevel", "(Lcom/surt/guardian/utils/Logger$Level;)V", "clearCache", "getVersion", "()Ljava/lang/String;", "Lc/t0;", EventKeys.VALUE_KEY, "getListener", "()Lc/t0;", "setListener", "(Lc/t0;)V", "listener", "Companion", "a", "securitysdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGuardianSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuardianSDK.kt\ncom/surt/guardian/GuardianSDK\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1009:1\n1#2:1010\n314#3,11:1011\n314#3,11:1022\n*S KotlinDebug\n*F\n+ 1 GuardianSDK.kt\ncom/surt/guardian/GuardianSDK\n*L\n343#1:1011,11\n582#1:1022,11\n*E\n"})
/* loaded from: classes4.dex */
public final class GuardianSDK {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String VERSION = "0.4.2";

    /* renamed from: n, reason: collision with root package name */
    public static volatile GuardianSDK f41534n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41535a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f41536b;

    /* renamed from: c, reason: collision with root package name */
    public final C2434c f41537c;

    /* renamed from: d, reason: collision with root package name */
    public volatile WeakReference f41538d;

    /* renamed from: e, reason: collision with root package name */
    public c f41539e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f41540f;

    /* renamed from: g, reason: collision with root package name */
    public final C6957c f41541g;

    /* renamed from: h, reason: collision with root package name */
    public final Z f41542h;

    /* renamed from: i, reason: collision with root package name */
    public final P f41543i;

    /* renamed from: j, reason: collision with root package name */
    public final C2438e f41544j;

    /* renamed from: k, reason: collision with root package name */
    public final C2435c0 f41545k;

    /* renamed from: l, reason: collision with root package name */
    public final D f41546l;

    /* renamed from: m, reason: collision with root package name */
    public final C2461p0 f41547m;

    /* renamed from: com.surt.guardian.GuardianSDK$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final GuardianSDK a() {
            GuardianSDK guardianSDK = GuardianSDK.f41534n;
            if (guardianSDK != null) {
                return guardianSDK;
            }
            throw new IllegalStateException("SDK not initialized. Call GuardianSDK.initialize() first.");
        }

        public final void b(Context context, c options) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            if (GuardianSDK.f41534n == null) {
                synchronized (this) {
                    try {
                        if (GuardianSDK.f41534n == null) {
                            Configuration a10 = Configuration.INSTANCE.a(options);
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            GuardianSDK guardianSDK = new GuardianSDK(applicationContext, a10, null);
                            guardianSDK.f41539e = options;
                            GuardianSDK.f41534n = guardianSDK;
                            Logger.f41582a.d("GuardianSDK", "Surt Guardian SDK v0.4.2 initialized");
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GuardianSDK(Context context, Configuration configuration, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, configuration);
    }

    public static final GuardianDiagnostics access$buildDeviceDiagnostics(GuardianSDK guardianSDK, String str, String str2, String str3) {
        guardianSDK.getClass();
        ArrayList arrayList = new ArrayList();
        int hashCode = str.hashCode();
        if (hashCode != -1335395429) {
            if (hashCode != -1313911455) {
                if (hashCode != -665462704) {
                    if (hashCode == 96784904 && str.equals("error")) {
                        arrayList.add(new GuardianWarning("LOCATION_ERROR", "location", null, 4, null));
                    }
                } else if (str.equals("unavailable")) {
                    arrayList.add(new GuardianWarning("LOCATION_UNAVAILABLE", "location", null, 4, null));
                }
            } else if (str.equals("timeout")) {
                arrayList.add(new GuardianWarning("LOCATION_TIMEOUT", "location", null, 4, null));
            }
        } else if (str.equals("denied")) {
            arrayList.add(new GuardianWarning("LOCATION_PERMISSION_DENIED", "location", null, 4, null));
        }
        int hashCode2 = str2.hashCode();
        if (hashCode2 != -1281977283) {
            if (hashCode2 != -665462704) {
                if (hashCode2 == -267956670 && str2.equals("not_supported")) {
                    arrayList.add(new GuardianWarning("ATTESTATION_NOT_SUPPORTED", "attestation", null, 4, null));
                }
            } else if (str2.equals("unavailable")) {
                arrayList.add(new GuardianWarning("ATTESTATION_UNAVAILABLE", "attestation", null, 4, null));
            }
        } else if (str2.equals("failed")) {
            arrayList.add(new GuardianWarning("ATTESTATION_FAILED", "attestation", null, 4, null));
        }
        if (Intrinsics.areEqual(str3, "unavailable")) {
            arrayList.add(new GuardianWarning("NETWORK_INTEL_UNAVAILABLE", "network_intel", null, 4, null));
        }
        return new GuardianDiagnostics(str, str2, str3, null, null, arrayList, 24, null);
    }

    public static final /* synthetic */ String access$calculateRiskLevel(GuardianSDK guardianSDK, y0 y0Var) {
        guardianSDK.getClass();
        return a(y0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x02e0 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0035, B:14:0x0069, B:16:0x0083, B:18:0x0089, B:19:0x00a2, B:21:0x02e0, B:22:0x02f6, B:24:0x02fc, B:26:0x0314, B:28:0x031a, B:29:0x0340, B:31:0x0346, B:32:0x0372, B:34:0x0378, B:35:0x03a1, B:48:0x004c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fc A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0035, B:14:0x0069, B:16:0x0083, B:18:0x0089, B:19:0x00a2, B:21:0x02e0, B:22:0x02f6, B:24:0x02fc, B:26:0x0314, B:28:0x031a, B:29:0x0340, B:31:0x0346, B:32:0x0372, B:34:0x0378, B:35:0x03a1, B:48:0x004c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0346 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0035, B:14:0x0069, B:16:0x0083, B:18:0x0089, B:19:0x00a2, B:21:0x02e0, B:22:0x02f6, B:24:0x02fc, B:26:0x0314, B:28:0x031a, B:29:0x0340, B:31:0x0346, B:32:0x0372, B:34:0x0378, B:35:0x03a1, B:48:0x004c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0378 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0035, B:14:0x0069, B:16:0x0083, B:18:0x0089, B:19:0x00a2, B:21:0x02e0, B:22:0x02f6, B:24:0x02fc, B:26:0x0314, B:28:0x031a, B:29:0x0340, B:31:0x0346, B:32:0x0372, B:34:0x0378, B:35:0x03a1, B:48:0x004c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$collectDeviceData(GuardianSDK guardianSDK, List list, String str, C2443g0 c2443g0, boolean z10, Continuation continuation) {
        C2465s c2465s;
        int i10;
        String str2;
        Object obj;
        C2443g0 c2443g02;
        boolean z11;
        F0 f10;
        GuardianSDK guardianSDK2 = guardianSDK;
        guardianSDK2.getClass();
        try {
            if (continuation instanceof C2465s) {
                c2465s = (C2465s) continuation;
                int i11 = c2465s.f26671t;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c2465s.f26671t = i11 - Integer.MIN_VALUE;
                    Object obj2 = c2465s.f26669r;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c2465s.f26671t;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        v0 v0Var = guardianSDK2.f41540f;
                        c2465s.f26665n = guardianSDK2;
                        str2 = str;
                        c2465s.f26666o = str2;
                        c2465s.f26667p = c2443g0;
                        c2465s.f26668q = z10;
                        c2465s.f26671t = 1;
                        y0 a10 = v0Var.a();
                        if (a10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = a10;
                        c2443g02 = c2443g0;
                        z11 = z10;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z12 = c2465s.f26668q;
                        c2443g02 = c2465s.f26667p;
                        str2 = c2465s.f26666o;
                        GuardianSDK guardianSDK3 = c2465s.f26665n;
                        ResultKt.throwOnFailure(obj2);
                        z11 = z12;
                        guardianSDK2 = guardianSDK3;
                        obj = obj2;
                    }
                    String str3 = str2;
                    y0 y0Var = (y0) obj;
                    String d10 = y0Var.d();
                    int b10 = guardianSDK2.b();
                    String a11 = a(y0Var);
                    long a12 = guardianSDK2.a();
                    long currentTimeMillis = System.currentTimeMillis();
                    N0 n02 = (c2443g02 == null && c2443g02.d()) ? new N0("google_play_integrity", str3, null, c2443g02.a(), Boxing.boxLong(System.currentTimeMillis()), "PRODUCTION", null) : null;
                    String h10 = y0Var.c().h();
                    String i12 = y0Var.c().i();
                    String b11 = y0Var.c().b();
                    String j10 = y0Var.c().j();
                    Integer boxInt = Boxing.boxInt(y0Var.c().n());
                    Integer boxInt2 = Boxing.boxInt(y0Var.c().m());
                    Integer boxInt3 = Boxing.boxInt(y0Var.c().k());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(y0Var.c().m());
                    sb2.append('x');
                    sb2.append(y0Var.c().k());
                    C2436d c2436d = new C2436d(h10, i12, b11, j10, boxInt, boxInt2, boxInt3, sb2.toString(), Boxing.boxFloat(y0Var.c().d()), y0Var.c().l(), Boxing.boxLong(y0Var.c().p()), Boxing.boxLong(y0Var.c().q()), y0Var.c().a(), y0Var.c().o(), Boxing.boxBoolean(y0Var.c().g()), Boxing.boxBoolean(y0Var.c().f()), y0Var.c().c(), y0Var.c().e(), y0Var.c().r());
                    C2444h c2444h = new C2444h(Boxing.boxBoolean(y0Var.e().j()), Boxing.boxDouble(y0Var.e().g()), y0Var.e().h(), Boxing.boxBoolean(y0Var.e().i()), y0Var.e().a(), y0Var.e().d(), y0Var.e().e(), y0Var.e().f(), y0Var.e().c(), y0Var.e().b());
                    boolean n10 = y0Var.h().n();
                    double b12 = y0Var.h().b();
                    boolean p10 = y0Var.h().p();
                    boolean m10 = y0Var.h().m();
                    boolean o10 = y0Var.h().o();
                    C2467t c2467t = new C2467t(Boxing.boxBoolean(n10), Boxing.boxDouble(b12), Boxing.boxBoolean(p10), Boxing.boxBoolean(m10), Boxing.boxBoolean(y0Var.h().k()), Boxing.boxBoolean(o10), Boxing.boxBoolean(y0Var.h().a()), Boxing.boxBoolean(y0Var.h().c()), Boxing.boxBoolean(y0Var.h().j()), Boxing.boxBoolean(y0Var.h().g()), Boxing.boxBoolean(y0Var.h().d()), Boxing.boxBoolean(y0Var.h().l()), Boxing.boxBoolean(y0Var.h().e()), y0Var.h().h(), Boxing.boxBoolean(y0Var.h().f()), y0Var.h().i());
                    C2429B c2429b = new C2429B(y0Var.j().c(), y0Var.j().d(), y0Var.j().g(), y0Var.j().e(), y0Var.j().a(), y0Var.j().b(), y0Var.j().f());
                    String k10 = y0Var.k();
                    C2447i0 a13 = y0Var.a();
                    Q0 q02 = a13 == null ? new Q0(a13.a(), a13.c(), a13.b()) : null;
                    N g10 = y0Var.g();
                    C2460p c2460p = g10 == null ? new C2460p(g10.c(), g10.a(), g10.b()) : null;
                    C2452l c2452l = (z11 || (f10 = y0Var.f()) == null) ? null : new C2452l(f10.c(), f10.d(), f10.a(), f10.g(), f10.b(), f10.f(), f10.e());
                    C2437d0 l10 = y0Var.l();
                    F f11 = l10 == null ? new F(l10.e(), l10.a(), l10.c(), l10.d(), l10.b()) : null;
                    C2464r0 i13 = y0Var.i();
                    return new J(d10, b10, a11, a12, currentTimeMillis, n02, c2436d, c2444h, c2467t, c2429b, k10, q02, c2460p, c2452l, f11, i13 == null ? new C2471x(i13.b(), i13.a(), i13.d(), i13.c(), i13.e()) : null, Boxing.boxDouble(y0Var.b())).a();
                }
            }
            if (i10 != 0) {
            }
            String str32 = str2;
            y0 y0Var2 = (y0) obj;
            String d102 = y0Var2.d();
            int b102 = guardianSDK2.b();
            String a112 = a(y0Var2);
            long a122 = guardianSDK2.a();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (c2443g02 == null) {
            }
            String h102 = y0Var2.c().h();
            String i122 = y0Var2.c().i();
            String b112 = y0Var2.c().b();
            String j102 = y0Var2.c().j();
            Integer boxInt4 = Boxing.boxInt(y0Var2.c().n());
            Integer boxInt22 = Boxing.boxInt(y0Var2.c().m());
            Integer boxInt32 = Boxing.boxInt(y0Var2.c().k());
            StringBuilder sb22 = new StringBuilder();
            sb22.append(y0Var2.c().m());
            sb22.append('x');
            sb22.append(y0Var2.c().k());
            C2436d c2436d2 = new C2436d(h102, i122, b112, j102, boxInt4, boxInt22, boxInt32, sb22.toString(), Boxing.boxFloat(y0Var2.c().d()), y0Var2.c().l(), Boxing.boxLong(y0Var2.c().p()), Boxing.boxLong(y0Var2.c().q()), y0Var2.c().a(), y0Var2.c().o(), Boxing.boxBoolean(y0Var2.c().g()), Boxing.boxBoolean(y0Var2.c().f()), y0Var2.c().c(), y0Var2.c().e(), y0Var2.c().r());
            C2444h c2444h2 = new C2444h(Boxing.boxBoolean(y0Var2.e().j()), Boxing.boxDouble(y0Var2.e().g()), y0Var2.e().h(), Boxing.boxBoolean(y0Var2.e().i()), y0Var2.e().a(), y0Var2.e().d(), y0Var2.e().e(), y0Var2.e().f(), y0Var2.e().c(), y0Var2.e().b());
            boolean n102 = y0Var2.h().n();
            double b122 = y0Var2.h().b();
            boolean p102 = y0Var2.h().p();
            boolean m102 = y0Var2.h().m();
            boolean o102 = y0Var2.h().o();
            C2467t c2467t2 = new C2467t(Boxing.boxBoolean(n102), Boxing.boxDouble(b122), Boxing.boxBoolean(p102), Boxing.boxBoolean(m102), Boxing.boxBoolean(y0Var2.h().k()), Boxing.boxBoolean(o102), Boxing.boxBoolean(y0Var2.h().a()), Boxing.boxBoolean(y0Var2.h().c()), Boxing.boxBoolean(y0Var2.h().j()), Boxing.boxBoolean(y0Var2.h().g()), Boxing.boxBoolean(y0Var2.h().d()), Boxing.boxBoolean(y0Var2.h().l()), Boxing.boxBoolean(y0Var2.h().e()), y0Var2.h().h(), Boxing.boxBoolean(y0Var2.h().f()), y0Var2.h().i());
            C2429B c2429b2 = new C2429B(y0Var2.j().c(), y0Var2.j().d(), y0Var2.j().g(), y0Var2.j().e(), y0Var2.j().a(), y0Var2.j().b(), y0Var2.j().f());
            String k102 = y0Var2.k();
            C2447i0 a132 = y0Var2.a();
            if (a132 == null) {
            }
            N g102 = y0Var2.g();
            if (g102 == null) {
            }
            if (z11) {
            }
            C2437d0 l102 = y0Var2.l();
            if (l102 == null) {
            }
            C2464r0 i132 = y0Var2.i();
            return new J(d102, b102, a112, a122, currentTimeMillis2, n02, c2436d2, c2444h2, c2467t2, c2429b2, k102, q02, c2460p, c2452l, f11, i132 == null ? new C2471x(i132.b(), i132.a(), i132.d(), i132.c(), i132.e()) : null, Boxing.boxDouble(y0Var2.b())).a();
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Error collecting device data", e10);
            S0.b("data_collection", e10);
            return null;
        }
        c2465s = new C2465s(guardianSDK2, continuation);
        Object obj22 = c2465s.f26669r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c2465s.f26671t;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$collectFingerprint(GuardianSDK guardianSDK, Continuation continuation) {
        C2470w c2470w;
        int i10;
        guardianSDK.getClass();
        try {
            if (continuation instanceof C2470w) {
                c2470w = (C2470w) continuation;
                int i11 = c2470w.f26712p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c2470w.f26712p = i11 - Integer.MIN_VALUE;
                    Object obj = c2470w.f26710n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c2470w.f26712p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        v0 v0Var = guardianSDK.f41540f;
                        c2470w.f26712p = 1;
                        obj = v0Var.a();
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((y0) obj).d();
                }
            }
            if (i10 != 0) {
            }
            return ((y0) obj).d();
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Error collecting fingerprint", e10);
            S0.b("fingerprint_collection", e10);
            return "error_fingerprint_" + System.currentTimeMillis();
        }
        c2470w = new C2470w(guardianSDK, continuation);
        Object obj2 = c2470w.f26710n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c2470w.f26712p;
    }

    public static final String access$getAppVersion(GuardianSDK guardianSDK) {
        guardianSDK.getClass();
        try {
            String str = guardianSDK.f41535a.getPackageManager().getPackageInfo(guardianSDK.f41535a.getPackageName(), 0).versionName;
            return str == null ? "unknown" : str;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static final void access$handleCollectFailure(GuardianSDK guardianSDK, Dc.c cVar, Function1 function1) {
        guardianSDK.getClass();
        Logger.f41582a.b("GuardianSDK", "Collect failure: " + cVar.getMessage(), cVar);
        guardianSDK.f41537c.a(cVar);
        AbstractC1459k.d(guardianSDK.f41543i, C1452g0.c(), null, new I(function1, cVar, null), 2, null);
    }

    public static final void access$handleFailure(GuardianSDK guardianSDK, Dc.c cVar, Function1 function1) {
        guardianSDK.getClass();
        Logger.f41582a.b("GuardianSDK", "Handling failure: " + cVar.getMessage(), cVar);
        guardianSDK.f41537c.a(cVar);
        if (guardianSDK.f41539e.e() instanceof b.a) {
            AbstractC1459k.d(guardianSDK.f41543i, C1452g0.c(), null, new M(function1, cVar, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:11:0x0037, B:12:0x0094, B:14:0x009a, B:17:0x00be, B:19:0x00c2, B:21:0x00ec, B:23:0x00f0, B:24:0x0114, B:25:0x0119, B:29:0x0049, B:31:0x0051, B:33:0x0060, B:35:0x0066, B:36:0x0073, B:38:0x007b, B:39:0x0085), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:11:0x0037, B:12:0x0094, B:14:0x009a, B:17:0x00be, B:19:0x00c2, B:21:0x00ec, B:23:0x00f0, B:24:0x0114, B:25:0x0119, B:29:0x0049, B:31:0x0051, B:33:0x0060, B:35:0x0066, B:36:0x0073, B:38:0x007b, B:39:0x0085), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$performAttestation(GuardianSDK guardianSDK, C2443g0 c2443g0, Continuation continuation) {
        X x10;
        int i10;
        AbstractC6956b abstractC6956b;
        GuardianSDK guardianSDK2 = guardianSDK;
        guardianSDK2.getClass();
        try {
            if (continuation instanceof X) {
                x10 = (X) continuation;
                int i11 = x10.f26506q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    x10.f26506q = i11 - Integer.MIN_VALUE;
                    Object obj = x10.f26504o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = x10.f26506q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!guardianSDK2.f41541g.e()) {
                            Logger.f41582a.f("GuardianSDK", "Attestation not available on this device");
                            C2438e.c(guardianSDK2.f41544j, "play_integrity_unavailable");
                            return null;
                        }
                        String a10 = c2443g0.a();
                        if (a10 == null) {
                            a10 = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(a10, "toString(...)");
                        }
                        C6957c c6957c = guardianSDK2.f41541g;
                        Long b10 = c2443g0.b();
                        Long boxLong = Boxing.boxLong(b10 != null ? b10.longValue() : 817986950837L);
                        x10.f26503n = guardianSDK2;
                        x10.f26506q = 1;
                        obj = c6957c.b(a10, boxLong, x10);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        guardianSDK2 = x10.f26503n;
                        ResultKt.throwOnFailure(obj);
                    }
                    abstractC6956b = (AbstractC6956b) obj;
                    if (!(abstractC6956b instanceof AbstractC6956b.C0983b)) {
                        Logger.f41582a.d("GuardianSDK", "Attestation successful (cached: " + ((AbstractC6956b.C0983b) abstractC6956b).a() + ')');
                        return ((AbstractC6956b.C0983b) abstractC6956b).b();
                    }
                    if (abstractC6956b instanceof AbstractC6956b.a) {
                        Logger.c(Logger.f41582a, "GuardianSDK", "Attestation failed: " + ((AbstractC6956b.a) abstractC6956b).a(), null, 4, null);
                        C2438e.c(guardianSDK2.f41544j, ((AbstractC6956b.a) abstractC6956b).a());
                    } else {
                        if (!(abstractC6956b instanceof AbstractC6956b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Logger.f41582a.f("GuardianSDK", "Attestation unavailable: " + ((AbstractC6956b.c) abstractC6956b).a());
                        C2438e.c(guardianSDK2.f41544j, ((AbstractC6956b.c) abstractC6956b).a());
                    }
                    return null;
                }
            }
            if (i10 != 0) {
            }
            abstractC6956b = (AbstractC6956b) obj;
            if (!(abstractC6956b instanceof AbstractC6956b.C0983b)) {
            }
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Attestation error", e10);
            S0.b("attestation", e10);
            return null;
        }
        x10 = new X(guardianSDK2, continuation);
        Object obj2 = x10.f26504o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = x10.f26506q;
    }

    public static /* synthetic */ void collect$default(GuardianSDK guardianSDK, String str, Boolean bool, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        guardianSDK.collect(str, bool, function1);
    }

    /* renamed from: collectSuspend-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m111collectSuspend0E7RQCE$default(GuardianSDK guardianSDK, String str, Boolean bool, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return guardianSDK.m113collectSuspend0E7RQCE(str, bool, continuation);
    }

    public static /* synthetic */ void verify$default(GuardianSDK guardianSDK, String str, Boolean bool, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        guardianSDK.verify(str, bool, function1);
    }

    /* renamed from: verifySuspend-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m112verifySuspend0E7RQCE$default(GuardianSDK guardianSDK, String str, Boolean bool, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return guardianSDK.m114verifySuspend0E7RQCE(str, bool, continuation);
    }

    public final long a() {
        try {
            SharedPreferences sharedPreferences = this.f41535a.getSharedPreferences("guardian_sdk", 0);
            long j10 = sharedPreferences.getLong("first_seen", 0L);
            if (j10 != 0) {
                return j10;
            }
            long currentTimeMillis = System.currentTimeMillis();
            sharedPreferences.edit().putLong("first_seen", currentTimeMillis).apply();
            return currentTimeMillis;
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Error getting first seen timestamp", e10);
            return System.currentTimeMillis();
        }
    }

    public final int b() {
        try {
            SharedPreferences sharedPreferences = this.f41535a.getSharedPreferences("guardian_sdk", 0);
            int i10 = sharedPreferences.getInt("verification_count", 0) + 1;
            sharedPreferences.edit().putInt("verification_count", i10).apply();
            return i10;
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Error getting verification count", e10);
            return 1;
        }
    }

    public final void clearCache() {
        try {
            this.f41541g.c();
            Y y10 = this.f41540f.f26706j;
            if (y10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("persistentIdModule");
                y10 = null;
            }
            y10.a();
            Logger.f41582a.d("GuardianSDK", "All caches cleared");
        } catch (Exception e10) {
            S0.b("clear_cache", e10);
        }
    }

    public final void collect(@Nullable String jwt, @Nullable Boolean collectLocation, @NotNull Function1<? super Result<CollectResult>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1459k.d(this.f41543i, null, null, new C2458o(this, collectLocation != null ? collectLocation.booleanValue() : this.f41536b.getCollectLocation(), jwt, callback, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: collectSuspend-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m113collectSuspend0E7RQCE(@Nullable String str, @Nullable Boolean bool, @NotNull Continuation<? super Result<CollectResult>> continuation) {
        C2428A c2428a;
        int i10;
        if (continuation instanceof C2428A) {
            c2428a = (C2428A) continuation;
            int i11 = c2428a.f26368p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2428a.f26368p = i11 - Integer.MIN_VALUE;
                Object obj = c2428a.f26366n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c2428a.f26368p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c2428a.f26368p = 1;
                    C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(c2428a), 1);
                    c1469p.F();
                    collect(str, bool, new E(c1469p));
                    obj = c1469p.z();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c2428a);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        c2428a = new C2428A(this, continuation);
        Object obj2 = c2428a.f26366n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c2428a.f26368p;
        if (i10 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @NotNull
    public final Map<String, Boolean> getCollectedSignalsSummary() {
        return MapsKt.mapOf(TuplesKt.to("hardware_info", Boolean.valueOf(this.f41536b.getCollectHardwareInfo())), TuplesKt.to("battery_info", Boolean.valueOf(this.f41536b.getCollectBatteryInfo())), TuplesKt.to("timezone", Boolean.valueOf(this.f41536b.getCollectTimezone())), TuplesKt.to("root_detection", Boolean.valueOf(this.f41536b.getDetectRoot())), TuplesKt.to("emulator_detection", Boolean.valueOf(this.f41536b.getDetectEmulator())), TuplesKt.to("vpn_detection", Boolean.valueOf(this.f41536b.getDetectVPN())), TuplesKt.to("developer_options_detection", Boolean.valueOf(this.f41536b.getDetectDeveloperOptions())), TuplesKt.to("location", Boolean.valueOf(this.f41536b.getCollectLocation())), TuplesKt.to("wifi_info", Boolean.valueOf(this.f41536b.getCollectWifiInfo())), TuplesKt.to("sim_card_info", Boolean.valueOf(this.f41536b.getCollectSimCardInfo())), TuplesKt.to("camera_info", Boolean.valueOf(this.f41536b.getCollectCameraInfo())));
    }

    @NotNull
    /* renamed from: getConfiguration, reason: from getter */
    public final c getF41539e() {
        return this.f41539e;
    }

    @Nullable
    public final t0 getListener() {
        this.f41537c.getClass();
        return null;
    }

    @NotNull
    public final String getVersion() {
        return VERSION;
    }

    public final boolean isAttestationAvailable() {
        return this.f41541g.e();
    }

    public final boolean isVerisoulAvailable() {
        return this.f41542h.f26512b;
    }

    public final void reinitializeVerisoul() {
        this.f41542h.b();
    }

    public final void setActivity(@Nullable Activity activity) {
        this.f41538d = activity != null ? new WeakReference(activity) : null;
    }

    public final void setListener(@Nullable t0 t0Var) {
        this.f41537c.getClass();
    }

    public final void setLogLevel(@NotNull Logger.Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        Logger.f41582a.e(level);
    }

    public final void verify(@NotNull String jwt, @Nullable Boolean collectLocation, @NotNull Function1<? super Result<VerificationResult>, Unit> callback) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        AbstractC1459k.d(this.f41543i, null, null, new C2449j0(uuid, this, collectLocation != null ? collectLocation.booleanValue() : this.f41536b.getCollectLocation(), jwt, callback, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: verifySuspend-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m114verifySuspend0E7RQCE(@NotNull String str, @Nullable Boolean bool, @NotNull Continuation<? super Result<VerificationResult>> continuation) {
        C2455m0 c2455m0;
        int i10;
        if (continuation instanceof C2455m0) {
            c2455m0 = (C2455m0) continuation;
            int i11 = c2455m0.f26629p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2455m0.f26629p = i11 - Integer.MIN_VALUE;
                Object obj = c2455m0.f26627n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c2455m0.f26629p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c2455m0.f26629p = 1;
                    C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(c2455m0), 1);
                    c1469p.F();
                    verify(str, bool, new C2463q0(c1469p));
                    obj = c1469p.z();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c2455m0);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        c2455m0 = new C2455m0(this, continuation);
        Object obj2 = c2455m0.f26627n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c2455m0.f26629p;
        if (i10 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public GuardianSDK(Context context, Configuration configuration) {
        this.f41535a = context;
        this.f41536b = configuration;
        this.f41537c = new C2434c();
        this.f41539e = new c(null, null, false, false, false, false, null, 0L, 255, null);
        a a10 = a.f863b.a();
        v0 v0Var = new v0(context);
        this.f41540f = v0Var;
        this.f41541g = new C6957c(context);
        this.f41542h = Z.f26509c.a(context);
        this.f41543i = Q.a(C1452g0.b().plus(X0.b(null, 1, null)));
        C2438e c2438e = new C2438e(configuration.getBaseUrl());
        this.f41544j = c2438e;
        this.f41545k = new C2435c0(context);
        this.f41546l = new D(configuration.getBaseUrl(), CollectionsKt.emptyList());
        this.f41547m = new C2461p0(configuration.getBaseUrl());
        v0Var.c(configuration);
        S0.a(c2438e);
        try {
            a.e(a10, null, 1, null);
            Logger.f41582a.d("GuardianSDK", "Cryptographic keys initialized");
        } catch (Exception e10) {
            S0.b("initialization", e10);
        }
        this.f41542h.c(this.f41536b);
        this.f41544j.e(MapsKt.mapOf(TuplesKt.to("environment", "PRODUCTION"), TuplesKt.to("requires_permissions", Boolean.valueOf(this.f41536b.requiresPermissions())), TuplesKt.to("verisoul_enabled", Boolean.TRUE)));
    }

    public static String a(y0 y0Var) {
        int i10 = y0Var.e().j() ? 40 : 0;
        if (y0Var.h().n()) {
            i10 += 30;
        }
        if (y0Var.h().c()) {
            i10 += 25;
        }
        if (y0Var.h().j()) {
            i10 += 25;
        }
        if (y0Var.h().d()) {
            i10 += 25;
        }
        if (y0Var.h().g()) {
            i10 += 20;
        }
        if (y0Var.h().a()) {
            i10 += 15;
        }
        if (y0Var.h().k()) {
            i10 += 10;
        }
        if (y0Var.h().m()) {
            i10 += 5;
        }
        if (y0Var.h().p()) {
            i10 += 5;
        }
        if (y0Var.h().l()) {
            i10 += 15;
        }
        if (!y0Var.h().f()) {
            i10 += 20;
        }
        if (i10 >= 50) {
            return "HIGH";
        }
        if (i10 >= 20) {
            return "MEDIUM";
        }
        return "LOW";
    }
}
