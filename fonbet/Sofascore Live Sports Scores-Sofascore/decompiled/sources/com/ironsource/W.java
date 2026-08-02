package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class W {

    @NotNull
    public static final a q = new a(null);
    public static final int r = -1;

    @NotNull
    private final IronSource.a a;

    @Nullable
    private final String b;

    @Nullable
    private final List<NetworkSettings> c;

    @NotNull
    private final C4263q2 d;
    private int e;
    private final int f;
    private boolean g;
    private final int h;
    private final int i;

    @NotNull
    private final M0 j;

    @NotNull
    private final I0 k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public W(@NotNull IronSource.a aVar, @Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C4263q2 c4263q2, int i, int i2, boolean z, int i3, int i4, @NotNull M0 m0, @NotNull I0 i0, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        aVar.getClass();
        c4263q2.getClass();
        m0.getClass();
        i0.getClass();
        this.a = aVar;
        this.b = str;
        this.c = list;
        this.d = c4263q2;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = m0;
        this.k = i0;
        this.l = j;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String str) {
        str.getClass();
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
            if (((NetworkSettings) next).getProviderInstanceName().equals(str)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    @NotNull
    public final IronSource.a b() {
        return this.a;
    }

    public final boolean c() {
        return this.g;
    }

    @NotNull
    public final C4263q2 d() {
        return this.d;
    }

    public final long e() {
        return this.l;
    }

    public final int f() {
        return this.h;
    }

    @NotNull
    public final I0 g() {
        return this.k;
    }

    @NotNull
    public final M0 h() {
        return this.j;
    }

    public final int i() {
        return this.e;
    }

    @Nullable
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

    @Nullable
    public String o() {
        return this.b;
    }

    public final boolean p() {
        return this.n;
    }

    public final boolean q() {
        return this.d.g() > 0;
    }

    @NotNull
    public final String r() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, Integer.valueOf(this.e), com.ironsource.mediationsdk.d.y, Boolean.valueOf(this.g), com.ironsource.mediationsdk.d.z, Boolean.valueOf(this.p));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final int a() {
        return this.i;
    }

    public final void a(int i) {
        this.e = i;
    }

    public /* synthetic */ W(IronSource.a aVar, String str, List list, C4263q2 c4263q2, int i, int i2, boolean z, int i3, int i4, M0 m0, I0 i0, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, list, c4263q2, i, i2, z, i3, i4, m0, i0, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }
}
