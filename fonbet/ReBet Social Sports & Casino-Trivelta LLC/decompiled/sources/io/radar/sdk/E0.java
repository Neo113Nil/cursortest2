package io.radar.sdk;

import Gh.C1165b;
import Gh.C1167d;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import io.radar.sdk.C4589c;
import io.radar.sdk.L;
import io.radar.sdk.N0;
import io.radar.sdk.RadarForegroundService;
import io.radar.sdk.T;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class E0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a f49617m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f49618a;

    /* renamed from: b, reason: collision with root package name */
    public final T f49619b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f49620c;

    /* renamed from: d, reason: collision with root package name */
    public final C4619e0 f49621d;

    /* renamed from: e, reason: collision with root package name */
    public J0 f49622e;

    /* renamed from: f, reason: collision with root package name */
    public L f49623f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49624g;

    /* renamed from: h, reason: collision with root package name */
    public N0.b f49625h;

    /* renamed from: i, reason: collision with root package name */
    public int f49626i;

    /* renamed from: j, reason: collision with root package name */
    public int f49627j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f49628k;

    /* renamed from: l, reason: collision with root package name */
    public final P f49629l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(boolean z10) {
            if (z10) {
                G0.b(E0.this.f49620c, "Successfully added stopped bubble geofence", null, null, 6, null);
            } else {
                G0.b(E0.this.f49620c, "Error adding stopped bubble geofence", null, null, 6, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(boolean z10) {
            if (z10) {
                G0.b(E0.this.f49620c, "Successfully added moving bubble geofence", null, null, 6, null);
            } else {
                G0.b(E0.this.f49620c, "Error adding moving bubble geofence", null, null, 6, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(boolean z10) {
            if (z10) {
                G0.b(E0.this.f49620c, "Successfully added synced geofences", null, null, 6, null);
            } else {
                G0.b(E0.this.f49620c, "Error adding synced geofences", null, null, 6, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ E0 f49634e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C4589c.EnumC4597i f49635f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(E0 e02, C4589c.EnumC4597i enumC4597i) {
            super(1);
            this.f49634e = e02;
            this.f49635f = enumC4597i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Location location) {
            if (location != null) {
                G0.b(E0.this.f49620c, "Successfully requested location", null, null, 6, null);
                this.f49634e.v(location, this.f49635f);
                return;
            }
            G0.b(E0.this.f49620c, "Location timeout", null, null, 6, null);
            C4589c c4589c = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_LOCATION;
            c4589c.l0(enumC4607s, "Location timeout");
            E0.l(E0.this, enumC4607s, null, 2, null);
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Location location) {
            E0.this.M(location);
        }
    }

    public static final class g extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function1 f49638e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1) {
            super(1);
            this.f49638e = function1;
        }

        public final void a(boolean z10) {
            if (z10) {
                G0.b(E0.this.f49620c, "Removed bubble geofences", null, null, 6, null);
                Function1 function1 = this.f49638e;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            G0.b(E0.this.f49620c, "Error removing bubble geofences", null, null, 6, null);
            Function1 function12 = this.f49638e;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function1 f49640e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1) {
            super(1);
            this.f49640e = function1;
        }

        public final void a(boolean z10) {
            if (z10) {
                G0.b(E0.this.f49620c, "Removed synced geofences", null, null, 6, null);
                Function1 function1 = this.f49640e;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            G0.b(E0.this.f49620c, "Error removing synced geofences", null, null, 6, null);
            Function1 function12 = this.f49640e;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Location f49642e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f49643f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Location location, boolean z10) {
            super(1);
            this.f49642e = location;
            this.f49643f = z10;
        }

        public final void a(boolean z10) {
            E0.this.h(this.f49642e, this.f49643f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        final /* synthetic */ Gh.j[] $radarGeofences;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Gh.j[] jVarArr) {
            super(1);
            this.$radarGeofences = jVarArr;
        }

        public final void a(boolean z10) {
            E0.this.j(this.$radarGeofences);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class k implements T.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f49645a;

        public static final class a implements C4589c.InterfaceC0745c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1 f49646a;

            public a(Function1 function1) {
                this.f49646a = function1;
            }

            @Override // io.radar.sdk.C4589c.InterfaceC0745c
            public void a(C4589c.EnumC4607s status, C1165b[] c1165bArr) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != C4589c.EnumC4607s.SUCCESS || c1165bArr == null) {
                    this.f49646a.invoke(null);
                } else {
                    this.f49646a.invoke(c1165bArr);
                }
            }
        }

        public static final class b implements C4589c.InterfaceC0745c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1 f49647a;

            public b(Function1 function1) {
                this.f49647a = function1;
            }

            @Override // io.radar.sdk.C4589c.InterfaceC0745c
            public void a(C4589c.EnumC4607s status, C1165b[] c1165bArr) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != C4589c.EnumC4607s.SUCCESS || c1165bArr == null) {
                    this.f49647a.invoke(null);
                } else {
                    this.f49647a.invoke(c1165bArr);
                }
            }
        }

        public k(Function1 function1) {
            this.f49645a = function1;
        }

        @Override // io.radar.sdk.T.i
        public void a(C4589c.EnumC4607s status, JSONObject jSONObject, C1165b[] c1165bArr, String[] strArr, String[] strArr2) {
            Intrinsics.checkNotNullParameter(status, "status");
            if ((strArr != null && strArr.length != 0) || (strArr2 != null && strArr2.length != 0)) {
                C4589c c4589c = C4589c.f49918a;
                c4589c.n().q(strArr, strArr2);
                c4589c.n().m(strArr, strArr2, true, new a(this.f49645a));
            } else {
                if (c1165bArr == null) {
                    this.f49645a.invoke(new C1165b[0]);
                    return;
                }
                C4589c c4589c2 = C4589c.f49918a;
                c4589c2.n().r(c1165bArr);
                c4589c2.n().o(c1165bArr, true, new b(this.f49645a));
            }
        }
    }

    public static final class l extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Location f49649e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f49650f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C4589c.EnumC4597i f49651g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f49652h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ E0 f49653i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ N0 f49654j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ N0.c f49655k;

        public static final class a implements T.m {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ E0 f49656a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N0 f49657b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ N0.c f49658c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ E0 f49659d;

            public a(E0 e02, N0 n02, N0.c cVar, E0 e03) {
                this.f49656a = e02;
                this.f49657b = n02;
                this.f49658c = cVar;
                this.f49659d = e03;
            }

            @Override // io.radar.sdk.T.m
            public void a(C4589c.EnumC4607s status, JSONObject jSONObject, Gh.h[] hVarArr, Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, Gh.D d10) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.f49656a.C(jVarArr);
                if (this.f49657b.i() && this.f49658c.k()) {
                    this.f49656a.I();
                }
                this.f49659d.O(eVar != null ? eVar.b() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Location location, boolean z10, C4589c.EnumC4597i enumC4597i, boolean z11, E0 e02, N0 n02, N0.c cVar) {
            super(1);
            this.f49649e = location;
            this.f49650f = z10;
            this.f49651g = enumC4597i;
            this.f49652h = z11;
            this.f49653i = e02;
            this.f49654j = n02;
            this.f49655k = cVar;
        }

        public final void a(C1165b[] c1165bArr) {
            T.t(E0.this.f49619b, this.f49649e, this.f49650f, M.f49706d.a(), this.f49651g, this.f49652h, c1165bArr, false, null, null, null, null, null, null, null, new a(this.f49653i, this.f49654j, this.f49655k, E0.this), 16320, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1165b[]) obj);
            return Unit.INSTANCE;
        }
    }

    public E0(Context context, T apiClient, G0 logger, C4619e0 batteryManager, C4589c.EnumC4596h provider, J0 permissionsHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(batteryManager, "batteryManager");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        this.f49618a = context;
        this.f49619b = apiClient;
        this.f49620c = logger;
        this.f49621d = batteryManager;
        this.f49622e = permissionsHelper;
        this.f49623f = provider == C4589c.EnumC4596h.HUAWEI ? new C4660z0(context, logger) : new C4654w0(context, logger);
        this.f49625h = N0.b.NONE;
        this.f49628k = new ArrayList();
        this.f49629l = new P(context);
    }

    public static /* synthetic */ void A(E0 e02, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        e02.z(function1);
    }

    public static final void L(E0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I();
    }

    public static /* synthetic */ void N(E0 e02, Location location, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            location = null;
        }
        e02.M(location);
    }

    public static /* synthetic */ void l(E0 e02, C4589c.EnumC4607s enumC4607s, Location location, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            location = null;
        }
        e02.k(enumC4607s, location);
    }

    public static /* synthetic */ void y(E0 e02, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        e02.x(function1);
    }

    public final void B(Location location, boolean z10) {
        x(new i(location, z10));
    }

    public final void C(Gh.j[] jVarArr) {
        z(new j(jVarArr));
    }

    public final void D() {
        L0 l02 = L0.f49705a;
        N0 o10 = l02.o(this.f49618a);
        G0.b(this.f49620c, "Restarting previous tracking options | trackingOptions = " + o10, null, null, 6, null);
        if (o10 == null) {
            C4589c.Q0();
        } else {
            C4589c.N0(o10);
        }
        l02.G(this.f49618a);
    }

    public final void E(Location location, boolean z10, C4589c.EnumC4597i enumC4597i, boolean z11) {
        N0 C10 = C4589c.C();
        N0.c d10 = L0.f49705a.d(this.f49618a);
        if (C10.i() && d10.k()) {
            F(d10);
        }
        G0.b(this.f49620c, "Sending location | source = " + enumC4597i + "; location = " + location + "; stopped = " + z10 + "; replayed = " + z11, null, null, 6, null);
        l lVar = new l(location, z10, enumC4597i, z11, this, C10, d10);
        if (C10.b() && Build.VERSION.SDK_INT >= 26 && this.f49622e.a(this.f49618a)) {
            this.f49619b.o(location, 1000, 10, new k(lVar), z10 || enumC4597i == C4589c.EnumC4597i.BEACON_ENTER || enumC4597i == C4589c.EnumC4597i.BEACON_EXIT);
        } else {
            lVar.invoke(null);
        }
    }

    public final void F(N0.c cVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                RadarForegroundService.Companion companion = RadarForegroundService.INSTANCE;
                if (companion.a()) {
                    G0.b(this.f49620c, "Already started foreground service", null, null, 6, null);
                    return;
                }
                Intent intent = new Intent(this.f49618a, (Class<?>) RadarForegroundService.class);
                intent.setAction(ViewProps.START);
                Intent putExtra = intent.putExtra(StackTraceHelper.ID_KEY, cVar.g());
                Integer h10 = cVar.h();
                putExtra.putExtra("importance", h10 != null ? h10.intValue() : 3).putExtra("title", cVar.j()).putExtra("text", cVar.i()).putExtra("icon", cVar.d()).putExtra("iconString", cVar.f()).putExtra("iconColor", cVar.e()).putExtra("activity", cVar.b());
                G0.b(this.f49620c, "Starting foreground service with intent | intent = " + intent, null, null, 6, null);
                this.f49618a.getApplicationContext().startForegroundService(intent);
                companion.b(true);
            } catch (Exception e10) {
                this.f49620c.c("Error starting foreground service with intent", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
            }
        }
    }

    public final void G(N0.b bVar, int i10, int i11) {
        if (this.f49624g && bVar == this.f49625h && i10 == this.f49626i && i11 == this.f49627j) {
            return;
        }
        this.f49623f.i(bVar, i10, i11, RadarLocationReceiver.INSTANCE.e(this.f49618a));
        this.f49624g = true;
        this.f49625h = bVar;
        this.f49626i = i10;
        this.f49627j = i11;
    }

    public final void H(N0 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        J();
        if (!this.f49622e.c(this.f49618a) && !this.f49622e.b(this.f49618a)) {
            C4589c.m0(C4589c.f49918a, C4589c.EnumC4607s.ERROR_PERMISSIONS, null, 2, null);
            return;
        }
        L0 l02 = L0.f49705a;
        l02.Y(this.f49618a, true);
        l02.Z(this.f49618a, options);
        N(this, null, 1, null);
    }

    public final void I() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Intent intent = new Intent(this.f49618a, (Class<?>) RadarForegroundService.class);
                intent.setAction("stop");
                G0.b(this.f49620c, "Stopping foreground service with intent", null, null, 6, null);
                this.f49618a.getApplicationContext().startService(intent);
                RadarForegroundService.INSTANCE.b(false);
            } catch (Exception e10) {
                this.f49620c.c("Error stopping foreground service with intent", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
            }
        }
    }

    public final void J() {
        this.f49623f.h(RadarLocationReceiver.INSTANCE.e(this.f49618a));
        this.f49624g = false;
    }

    public final void K() {
        this.f49624g = false;
        L0 l02 = L0.f49705a;
        l02.Y(this.f49618a, false);
        N0 x10 = l02.x(this.f49618a);
        x10.w(null);
        x10.x(null);
        l02.Z(this.f49618a, x10);
        N(this, null, 1, null);
        Gh.y s10 = l02.s(this.f49618a);
        if (s10.a()) {
            C4589c.j(null, null, 3, null);
        }
        if (s10.i()) {
            this.f49629l.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Location location) {
        L0 l02 = L0.f49705a;
        boolean w10 = l02.w(this.f49618a);
        N0 C10 = C4589c.C();
        N0 x10 = l02.x(this.f49618a);
        G0.b(this.f49620c, "Updating tracking | options = " + C10 + "; location = " + location, null, null, 6, null);
        Date date = new Date();
        if (!w10 && x10.l() != null) {
            Date l10 = x10.l();
            Intrinsics.checkNotNull(l10);
            if (l10.before(date)) {
                G0.b(this.f49620c, "Starting time-based tracking | startTrackingAfter = " + C10.l(), null, null, 6, null);
                l02.Y(this.f49618a, true);
                w10 = true;
                if (w10) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 26 && RadarForegroundService.INSTANCE.a()) {
                        I();
                    }
                    J();
                    w();
                    if (i10 >= 26) {
                        C4589c.f49918a.n().s();
                        return;
                    }
                    return;
                }
                if (l02.s(this.f49618a).i()) {
                    this.f49629l.c();
                }
                if (C10.i()) {
                    N0.c d10 = l02.d(this.f49618a);
                    if (!d10.k()) {
                        F(d10);
                    }
                }
                if (M0.f49714a.p(this.f49618a)) {
                    if (C10.e() == 0) {
                        J();
                    } else {
                        G(C10.c(), C10.e(), C10.h());
                    }
                    if (!C10.u()) {
                        y(this, null, 1, null);
                    } else if (location != null) {
                        B(location, true);
                    }
                } else {
                    if (C10.d() == 0) {
                        J();
                    } else {
                        G(C10.c(), C10.d(), C10.g());
                    }
                    if (!C10.t()) {
                        y(this, null, 1, null);
                    } else if (location != null) {
                        B(location, false);
                    }
                }
                if (Build.VERSION.SDK_INT < 26 || C10.i() || !RadarForegroundService.INSTANCE.a()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.radar.sdk.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        E0.L(E0.this);
                    }
                }, 5000L);
                return;
            }
        }
        if (w10 && x10.o() != null) {
            Date o10 = x10.o();
            Intrinsics.checkNotNull(o10);
            if (o10.before(date)) {
                G0.b(this.f49620c, "Stopping time-based tracking | startTrackingAfter = " + C10.l(), null, null, 6, null);
                l02.Y(this.f49618a, false);
                w10 = false;
            }
        }
        if (w10) {
        }
    }

    public final void O(Gh.m mVar) {
        if (mVar != null) {
            if (mVar.a() != null) {
                G0.b(this.f49620c, "Setting remote tracking options | trackingOptions = " + mVar.a(), null, null, 6, null);
                L0.f49705a.V(this.f49618a, mVar.a());
            } else {
                L0.f49705a.H(this.f49618a);
                G0.b(this.f49620c, "Removed remote tracking options | trackingOptions = " + C4589c.C(), null, null, 6, null);
            }
        }
        N(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Location location, boolean z10) {
        N0 C10 = C4589c.C();
        if (z10 && C10.u()) {
            float p10 = C10.p();
            DefaultConstructorMarker defaultConstructorMarker = null;
            L.a[] aVarArr = {new L.a("radar_stopped", location.getLatitude(), location.getLongitude(), p10, false, true, false, 0, 208, defaultConstructorMarker)};
            L.b bVar = new L.b(false, true, 0 == true ? 1 : 0, 5, defaultConstructorMarker);
            G0.b(this.f49620c, "Adding stopped bubble geofence | latitude = " + location.getLatitude() + "; longitude = " + location.getLongitude() + "; radius = " + p10 + "; identifier = radar_stopped", null, null, 6, null);
            this.f49623f.a(aVarArr, bVar, RadarLocationReceiver.INSTANCE.d(this.f49618a), new b());
            return;
        }
        if (z10 || !C10.t()) {
            return;
        }
        float j10 = C10.j();
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z11 = true;
        L.a aVar = new L.a("radar_moving", location.getLatitude(), location.getLongitude(), j10, false, true, z11, (C10.n() * 1000) + 10000, 16, defaultConstructorMarker2);
        L.b bVar2 = new L.b(false, z11, true, 1, defaultConstructorMarker2);
        G0.b(this.f49620c, "Adding moving bubble geofence | latitude = " + location.getLatitude() + "; longitude = " + location.getLongitude() + "; radius = " + j10 + "; identifier = radar_moving", null, null, 6, null);
        this.f49623f.a(new L.a[]{aVar}, bVar2, RadarLocationReceiver.INSTANCE.d(this.f49618a), new c());
    }

    public final void i(C4589c.InterfaceC4595g interfaceC4595g) {
        if (interfaceC4595g == null) {
            return;
        }
        synchronized (this.f49628k) {
            this.f49628k.add(interfaceC4595g);
        }
    }

    public final void j(Gh.j[] jVarArr) {
        Gh.g gVar;
        double d10;
        int i10;
        N0 C10 = C4589c.C();
        if (!C10.r() || jVarArr == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = jVarArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Gh.j jVar = jVarArr[i11];
            int i13 = i12 + 1;
            if (jVar.a() instanceof C1167d) {
                gVar = ((C1167d) jVar.a()).a();
                d10 = ((C1167d) jVar.a()).b();
            } else if (jVar.a() instanceof Gh.p) {
                gVar = ((Gh.p) jVar.a()).a();
                d10 = ((Gh.p) jVar.a()).c();
            } else {
                gVar = null;
                d10 = 100.0d;
            }
            if (gVar != null) {
                try {
                    String str = "radar_sync_" + i12;
                    arrayList.add(new L.a(str, gVar.a(), gVar.b(), (float) d10, true, true, true, (C10.n() * 1000) + 10000));
                    G0 g02 = this.f49620c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Adding synced geofence | latitude = ");
                    i10 = length;
                    try {
                        sb2.append(gVar.a());
                        sb2.append("; longitude = ");
                        sb2.append(gVar.b());
                        sb2.append("; radius = ");
                        sb2.append(d10);
                        sb2.append("; identifier = ");
                        sb2.append(str);
                        G0.b(g02, sb2.toString(), null, null, 6, null);
                    } catch (Exception unused) {
                        G0.b(this.f49620c, "Error building synced geofence | latitude = " + gVar.a() + "; longitude = " + gVar.b() + "; radius = " + d10, null, null, 6, null);
                        i11++;
                        i12 = i13;
                        length = i10;
                    }
                } catch (Exception unused2) {
                    i10 = length;
                }
            } else {
                i10 = length;
            }
            i11++;
            i12 = i13;
            length = i10;
        }
        if (arrayList.size() == 0) {
            G0.b(this.f49620c, "No synced geofences", null, null, 6, null);
            return;
        }
        L.b bVar = new L.b(false, false, false, 7, null);
        L l10 = this.f49623f;
        Object[] array = arrayList.toArray(new L.a[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        l10.a((L.a[]) array, bVar, RadarLocationReceiver.INSTANCE.f(this.f49618a), new d());
    }

    public final void k(C4589c.EnumC4607s enumC4607s, Location location) {
        synchronized (this.f49628k) {
            try {
                if (this.f49628k.isEmpty()) {
                    return;
                }
                G0.b(this.f49620c, "Calling callbacks | callbacks.size = " + this.f49628k.size(), null, null, 6, null);
                Iterator it = this.f49628k.iterator();
                while (it.hasNext()) {
                    ((C4589c.InterfaceC4595g) it.next()).a(enumC4607s, location, M0.f49714a.p(this.f49618a));
                }
                this.f49628k.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(C4589c.InterfaceC4595g interfaceC4595g) {
        n(N0.b.MEDIUM, C4589c.EnumC4597i.FOREGROUND_LOCATION, interfaceC4595g);
    }

    public final void n(N0.b desiredAccuracy, C4589c.EnumC4597i source, C4589c.InterfaceC4595g interfaceC4595g) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f49622e.d(this.f49618a)) {
            G0.b(this.f49620c, "Location services are not enabled", null, null, 6, null);
            C4589c c4589c = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_PERMISSIONS;
            c4589c.l0(enumC4607s, "Location services are not enabled");
            if (interfaceC4595g != null) {
                C4589c.InterfaceC4595g.a.a(interfaceC4595g, enumC4607s, null, false, 6, null);
                return;
            }
            return;
        }
        if (this.f49622e.c(this.f49618a) || this.f49622e.b(this.f49618a)) {
            i(interfaceC4595g);
            G0.b(this.f49620c, "Requesting location", null, null, 6, null);
            this.f49623f.b(desiredAccuracy, new e(this, source));
        } else {
            C4589c c4589c2 = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s2 = C4589c.EnumC4607s.ERROR_PERMISSIONS;
            C4589c.m0(c4589c2, enumC4607s2, null, 2, null);
            if (interfaceC4595g != null) {
                C4589c.InterfaceC4595g.a.a(interfaceC4595g, enumC4607s2, null, false, 6, null);
            }
        }
    }

    public final L o() {
        return this.f49623f;
    }

    public final Location p(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f49623f.d(intent);
    }

    public final Location q(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f49623f.e(intent);
    }

    public final J0 r() {
        return this.f49622e;
    }

    public final C4589c.EnumC4597i s(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f49623f.f(intent);
    }

    public final void t(C1165b[] c1165bArr, C4589c.EnumC4597i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT >= 26) {
            G0.b(this.f49620c, "Handling beacons", null, null, 6, null);
            C4589c.f49918a.n().i(c1165bArr, source);
            Location h10 = M0.f49714a.h(this.f49618a);
            if (h10 == null) {
                G0.b(this.f49620c, "Not handling beacons, no last location", null, null, 6, null);
            }
            v(h10, source);
        }
    }

    public final void u() {
        G0.b(this.f49620c, "Handling boot completed", null, null, 6, null);
        this.f49624g = false;
        M0.f49714a.D(this.f49618a, false);
        this.f49623f.c(new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Location location, C4589c.EnumC4597i source) {
        N0 n02;
        long j10;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        Location location2 = location;
        Intrinsics.checkNotNullParameter(source, "source");
        if (C4589c.Q()) {
            long time = location2 == null ? -1L : new Date().getTime() - location2.getTime();
            Integer b10 = this.f49621d.b();
            Hh.a c10 = this.f49621d.c();
            G0.b(this.f49620c, "Handling location | location = " + location2 + "; latency = " + time + "; standbyBucket = " + b10 + "; performanceState = " + c10.b().name() + "; isCharging = " + c10.e() + "; batteryPercentage = " + c10.a() + "; isPowerSaveMode = " + c10.d() + "; isIgnoringBatteryOptimizations = " + c10.g() + "; locationPowerSaveMode = " + c10.c() + "; isDozeMode = " + c10.f(), null, null, 6, null);
        } else {
            G0.b(this.f49620c, "Handling location | source = " + source + "; location = " + location2, null, null, 6, null);
        }
        if (Intrinsics.areEqual(location2 != null ? Float.valueOf(location2.getAccuracy()) : null, 0.0f)) {
            location2.setAccuracy(1000.0f);
            G0.b(this.f49620c, "Setting default accuracy of 1000 for location without accuracy", null, null, 6, null);
        }
        if (location2 == null || !R0.f49781a.p(location2)) {
            G0.b(this.f49620c, "Invalid location | source = " + source + "; location = " + location2, null, null, 6, null);
            C4589c c4589c = C4589c.f49918a;
            C4589c.EnumC4607s enumC4607s = C4589c.EnumC4607s.ERROR_LOCATION;
            c4589c.l0(enumC4607s, "Invalid location | source = " + source + "; location = " + location2);
            l(this, enumC4607s, null, 2, null);
            return;
        }
        N0 C10 = C4589c.C();
        M0 m02 = M0.f49714a;
        boolean p10 = m02.p(this.f49618a);
        C4589c.EnumC4597i enumC4597i = C4589c.EnumC4597i.FOREGROUND_LOCATION;
        boolean z13 = source == enumC4597i || source == C4589c.EnumC4597i.MANUAL_LOCATION || source == C4589c.EnumC4597i.BEACON_ENTER || source == C4589c.EnumC4597i.BEACON_EXIT;
        if (!z13 && location2.getAccuracy() >= 1000.0f && C10.c() != N0.b.LOW) {
            G0.b(this.f49620c, "Skipping location: inaccurate | accuracy = " + location2.getAccuracy(), null, null, 6, null);
            M(location);
            return;
        }
        if (C10.m() <= 0 || C10.n() <= 0) {
            n02 = C10;
            j10 = 0;
            z10 = z13 || source == C4589c.EnumC4597i.GEOFENCE_DWELL;
            f10 = Float.MAX_VALUE;
        } else {
            Location k10 = m02.k(this.f49618a);
            if (k10 == null) {
                m02.A(this.f49618a, location2);
                k10 = location2;
            }
            long j11 = m02.j(this.f49618a);
            if (j11 == 0) {
                j11 = location2.getTime();
                m02.z(this.f49618a, j11);
            }
            if (!z13 && j11 > location2.getTime()) {
                G0.b(this.f49620c, "Skipping location: old | lastMovedAt = " + j11 + "; location.time = " + location2.getTime(), null, null, 6, null);
                return;
            }
            f10 = location2.distanceTo(k10);
            j10 = 0;
            long time2 = (location2.getTime() - j11) / 1000;
            if (f10 < C10.m()) {
                n02 = C10;
                if (time2 > C10.n()) {
                    z10 = true;
                    G0.b(this.f49620c, "Calculating stopped | stopped = " + z10 + "; distance = " + f10 + "; duration = " + time2 + "; location.time = " + location2.getTime() + "; lastMovedAt = " + j11, null, null, 6, null);
                    if (f10 > n02.m()) {
                        m02.A(this.f49618a, location2);
                        if (!z10) {
                            m02.z(this.f49618a, location2.getTime());
                        }
                    }
                }
            } else {
                n02 = C10;
            }
            z10 = false;
            G0.b(this.f49620c, "Calculating stopped | stopped = " + z10 + "; distance = " + f10 + "; duration = " + time2 + "; location.time = " + location2.getTime() + "; lastMovedAt = " + j11, null, null, 6, null);
            if (f10 > n02.m()) {
            }
        }
        boolean z14 = z10 && !p10;
        m02.D(this.f49618a, z10);
        m02.x(this.f49618a, location2);
        C4589c.f49918a.k0(location2, z10, source);
        if (source != C4589c.EnumC4597i.MANUAL_LOCATION) {
            M(location);
        }
        k(C4589c.EnumC4607s.SUCCESS, location2);
        Location g10 = m02.g(this.f49618a);
        if (n02.k() != N0.d.STOPS || g10 == null || z14) {
            z11 = true;
            z12 = false;
        } else {
            m02.w(this.f49618a, null);
            G0 g02 = this.f49620c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Replaying location | location = ");
            sb2.append(location2);
            sb2.append("; stopped = ");
            z11 = true;
            sb2.append(true);
            G0.b(g02, sb2.toString(), null, null, 6, null);
            location2 = g10;
            z10 = true;
            z12 = true;
        }
        long l10 = m02.l(this.f49618a);
        boolean z15 = (l10 == j10 || this.f49628k.size() > 0 || z14 || z12) ? z11 : false;
        long currentTimeMillis = (System.currentTimeMillis() - l10) / 1000;
        if (!z15) {
            if (!z13 && z10 && p10 && f10 < n02.m() && (n02.e() == 0 || n02.q() != N0.e.ALL)) {
                G0.b(this.f49620c, "Skipping sync: already stopped | stopped = " + z10 + "; wasStopped = " + p10, null, null, 6, null);
                return;
            }
            double d10 = currentTimeMillis + 0.1d;
            if (d10 < n02.f()) {
                G0.b(this.f49620c, "Skipping sync: desired sync interval | desiredSyncInterval = " + n02.f() + "; lastSyncInterval = " + d10, null, null, 6, null);
                return;
            }
            if (!z13 && !z14 && currentTimeMillis < 1) {
                G0.b(this.f49620c, "Skipping sync: rate limit | justStopped = " + z14 + "; lastSyncInterval = " + currentTimeMillis, null, null, 6, null);
                return;
            }
            if (n02.q() == N0.e.NONE) {
                G0.b(this.f49620c, "Skipping sync: sync mode | sync = " + n02.q(), null, null, 6, null);
                return;
            }
            boolean b11 = m02.b(this.f49618a);
            if (!b11 && n02.q() == N0.e.STOPS_AND_EXITS) {
                G0.b(this.f49620c, "Skipping sync: can't exit | sync = " + n02.q() + "; canExit = " + b11, null, null, 6, null);
                return;
            }
        }
        m02.F(this.f49618a);
        if (source == enumC4597i) {
            return;
        }
        E(location2, z10, source, z12);
    }

    public final void w() {
        y(this, null, 1, null);
        A(this, null, 1, null);
    }

    public final void x(Function1 function1) {
        this.f49623f.g(RadarLocationReceiver.INSTANCE.d(this.f49618a), new g(function1));
    }

    public final void z(Function1 function1) {
        this.f49623f.g(RadarLocationReceiver.INSTANCE.f(this.f49618a), new h(function1));
    }

    public /* synthetic */ E0(Context context, T t10, G0 g02, C4619e0 c4619e0, C4589c.EnumC4596h enumC4596h, J0 j02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, t10, g02, c4619e0, enumC4596h, (i10 & 32) != 0 ? new J0() : j02);
    }
}
