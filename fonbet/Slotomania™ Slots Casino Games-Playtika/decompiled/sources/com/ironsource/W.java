package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class W {
    public static final a q = new a(null);
    public static final int r = -1;
    private final IronSource.a a;
    private final String b;
    private final List<NetworkSettings> c;
    private final C2643s2 d;
    private int e;
    private final int f;
    private boolean g;
    private final int h;
    private final int i;
    private final O0 j;
    private final J0 k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private boolean p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W(IronSource.a adUnit, String str, List<? extends NetworkSettings> list, C2643s2 auctionSettings, int i, int i2, boolean z, int i3, int i4, O0 loadingData, J0 interactionData, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.a = adUnit;
        this.b = str;
        this.c = list;
        this.d = auctionSettings;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = loadingData;
        this.k = interactionData;
        this.l = j;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final IronSource.a b() {
        return this.a;
    }

    public final boolean c() {
        return this.g;
    }

    public final C2643s2 d() {
        return this.d;
    }

    public final long e() {
        return this.l;
    }

    public final int f() {
        return this.h;
    }

    public final J0 g() {
        return this.k;
    }

    public final O0 h() {
        return this.j;
    }

    public final int i() {
        return this.e;
    }

    public List<NetworkSettings> j() {
        return this.c;
    }

    public final boolean k() {
        return this.m;
    }

    public final boolean l() {
        return this.o;
    }

    public final boolean m() {
        return this.p;
    }

    public final int n() {
        return this.f;
    }

    public String o() {
        return this.b;
    }

    public final boolean p() {
        return this.n;
    }

    public final boolean q() {
        return this.d.g() > 0;
    }

    public final String r() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.e), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.g), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.p));
        Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public final int a() {
        return this.i;
    }

    public final NetworkSettings a(String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> j = j();
        Object obj = null;
        if (j == null) {
            return null;
        }
        Iterator<T> it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ W(IronSource.a aVar, String str, List list, C2643s2 c2643s2, int i, int i2, boolean z, int i3, int i4, O0 o0, J0 j0, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, list, c2643s2, i, i2, z, i3, i4, o0, j0, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }
}
