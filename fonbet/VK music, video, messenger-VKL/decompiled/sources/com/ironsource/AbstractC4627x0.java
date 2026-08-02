package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.c5g;
import xsna.izs;
import xsna.wzs;
import xsna.zcl;

/* renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4627x0 {
    public static final a r = new a(null);
    public static final int s = -1;
    private final C4341h0 a;
    private final boolean b;
    private final String c;
    private final List<NetworkSettings> d;
    private final C4440ma e;
    private final C4539s2 f;
    private int g;
    private final int h;
    private boolean i;
    private final int j;
    private final int k;
    private final O0 l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;

    /* renamed from: com.ironsource.x0$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(C4341h0 c4341h0, Va va, izs<? super N3, ? extends AdFormatConfig> izsVar, wzs<? super C4609w0, ? super AdFormatConfig, ? extends AdUnitData> wzsVar) {
            List<C4657yc> list;
            Ve d;
            AdFormatConfig invoke = izsVar.invoke((va == null || (d = va.d()) == null) ? null : d.c());
            if (invoke == null) {
                throw new IllegalStateException("Error getting " + c4341h0.a() + " configurations");
            }
            if (va == null || (list = va.d(c4341h0.e(), c4341h0.c())) == null) {
                list = EmptyList.b;
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4657yc) it.next()).f());
            }
            return wzsVar.invoke(new C4609w0(f, arrayList, C4440ma.b()), invoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4627x0(C4341h0 c4341h0, boolean z, String str, List<? extends NetworkSettings> list, C4440ma c4440ma, C4539s2 c4539s2, int i, int i2, boolean z2, int i3, int i4, O0 o0, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = c4341h0;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = c4440ma;
        this.f = c4539s2;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = o0;
        this.m = j;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }

    public final void a(int i) {
        this.g = i;
    }

    public C4341h0 b() {
        return this.a;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract String c();

    public final boolean d() {
        return this.i;
    }

    public final C4539s2 e() {
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

    public final O0 i() {
        return this.l;
    }

    public abstract String j();

    public final int k() {
        return this.g;
    }

    public final String l() {
        String c;
        C4336gd f = b().f();
        return (f == null || (c = f.c()) == null) ? "" : c;
    }

    public final List<NetworkSettings> m() {
        return this.d;
    }

    public final boolean n() {
        return this.n;
    }

    public final C4440ma o() {
        return this.e;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

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

    public final String v() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.g), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.i), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.q));
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final int a() {
        return this.k;
    }

    public final NetworkSettings a(String str) {
        Object obj;
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

    public AdData a(NetworkSettings networkSettings) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), this.c);
    }

    public /* synthetic */ AbstractC4627x0(C4341h0 c4341h0, boolean z, String str, List list, C4440ma c4440ma, C4539s2 c4539s2, int i, int i2, boolean z2, int i3, int i4, O0 o0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, zcl zclVar) {
        this(c4341h0, z, str, list, c4440ma, c4539s2, i, i2, z2, i3, i4, o0, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }
}
