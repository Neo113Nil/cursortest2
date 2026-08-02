package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.a70;
import defpackage.k13;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4386x0 {

    @NotNull
    public static final a r = new a(null);
    public static final int s = -1;

    @NotNull
    private final C4100h0 a;
    private final boolean b;

    @Nullable
    private final String c;

    @NotNull
    private final List<NetworkSettings> d;

    @NotNull
    private final C4181la e;

    @NotNull
    private final C4263q2 f;
    private int g;
    private final int h;
    private boolean i;
    private final int j;
    private final int k;

    @NotNull
    private final M0 l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4386x0(@NotNull C4100h0 c4100h0, boolean z, @Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4181la c4181la, @NotNull C4263q2 c4263q2, int i, int i2, boolean z2, int i3, int i4, @NotNull M0 m0, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        c4100h0.getClass();
        list.getClass();
        c4181la.getClass();
        c4263q2.getClass();
        m0.getClass();
        this.a = c4100h0;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = c4181la;
        this.f = c4263q2;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = m0;
        this.m = j;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NetworkSettings) obj).getProviderInstanceName().equals(str)) {
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    @NotNull
    public C4100h0 b() {
        return this.a;
    }

    @NotNull
    public abstract JSONObject b(@NotNull NetworkSettings networkSettings);

    @NotNull
    public abstract String c();

    public final boolean d() {
        return this.i;
    }

    @NotNull
    public final C4263q2 e() {
        return this.f;
    }

    public final long f() {
        return this.m;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.h;
    }

    @NotNull
    public final M0 i() {
        return this.l;
    }

    @NotNull
    public abstract String j();

    public final int k() {
        return this.g;
    }

    @NotNull
    public final String l() {
        String c;
        C4077fd f = b().f();
        return (f == null || (c = f.c()) == null) ? "" : c;
    }

    @NotNull
    public final List<NetworkSettings> m() {
        return this.d;
    }

    public final boolean n() {
        return this.n;
    }

    @NotNull
    public final C4181la o() {
        return this.e;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    @Nullable
    public final String r() {
        return this.c;
    }

    public final boolean s() {
        return this.o;
    }

    public final boolean t() {
        return this.f.g() > 0;
    }

    public boolean u() {
        return this.b;
    }

    @NotNull
    public final String v() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.g), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.i), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.q));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.x0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(@NotNull C4100h0 c4100h0, @Nullable Sa sa, @NotNull Function1<? super K3, ? extends AdFormatConfig> function1, @NotNull Function2<? super C4368w0, ? super AdFormatConfig, ? extends AdUnitData> function2) {
            List<C4398xc> list;
            Te d;
            c4100h0.getClass();
            function1.getClass();
            function2.getClass();
            Object invoke = function1.invoke((sa == null || (d = sa.d()) == null) ? null : d.c());
            if (invoke == null) {
                a70.l(c4100h0.a(), " configurations", "Error getting ");
                return null;
            }
            if (sa == null || (list = sa.d(c4100h0.e(), c4100h0.c())) == null) {
                list = km5.a;
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4398xc) it.next()).f());
            }
            C4181la b = C4181la.b();
            b.getClass();
            return (AdUnitData) function2.invoke(new C4368w0(f, arrayList, b), invoke);
        }

        private a() {
        }
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final int a() {
        return this.k;
    }

    public final void a(int i) {
        this.g = i;
    }

    @NotNull
    public AdData a(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), this.c);
        createAdDataForNetworkAdapter.getClass();
        return createAdDataForNetworkAdapter;
    }

    public /* synthetic */ AbstractC4386x0(C4100h0 c4100h0, boolean z, String str, List list, C4181la c4181la, C4263q2 c4263q2, int i, int i2, boolean z2, int i3, int i4, M0 m0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4100h0, z, str, list, c4181la, c4263q2, i, i2, z2, i3, i4, m0, j, z3, z4, z5, (i5 & com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z6);
    }
}
