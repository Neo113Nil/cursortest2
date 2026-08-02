package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0067c5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0015a5 f13486a;

    /* renamed from: b, reason: collision with root package name */
    public final C0041b5 f13487b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected final Context f13488c;

    /* renamed from: d, reason: collision with root package name */
    public final Q4 f13489d;

    /* renamed from: e, reason: collision with root package name */
    public final C0372o4 f13490e;

    /* renamed from: f, reason: collision with root package name */
    public final V4 f13491f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    protected final C0161fm f13492g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0208hh f13493h;

    /* renamed from: i, reason: collision with root package name */
    public final H8 f13494i;
    public final ICommonExecutor j;

    /* renamed from: k, reason: collision with root package name */
    public final Fb f13495k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0476s9 f13496l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13497m;

    public C0067c5(Context context, Q4 q42, C0372o4 c0372o4, V4 v42, C0161fm c0161fm, InterfaceC0208hh interfaceC0208hh, ICommonExecutor iCommonExecutor, int i5, Fb fb2, InterfaceC0476s9 interfaceC0476s9) {
        this(context, q42, c0372o4, v42, c0161fm, interfaceC0208hh, iCommonExecutor, new H8(), i5, new C0015a5(c0372o4.f14381a), new C0041b5(context, q42), fb2, interfaceC0476s9);
    }

    public static X8 c(X4 x42) {
        return new X8(x42);
    }

    public final M8 a() {
        Context context = this.f13488c;
        Q4 q42 = this.f13489d;
        return new M8(new R8(context, q42), this.f13497m);
    }

    public final L6 b(X4 x42) {
        return new L6(x42, C0353na.I.B().c(this.f13488c, this.f13489d), new H6(x42.c()), new C0146f7());
    }

    public final C0015a5 d() {
        return this.f13486a;
    }

    public final C0041b5 e() {
        return this.f13487b;
    }

    public final xo f() {
        xo xoVar;
        Bo c0046ba;
        Ao D = C0353na.I.D();
        Q4 q42 = this.f13489d;
        synchronized (D) {
            try {
                String valueOf = String.valueOf(q42);
                LinkedHashMap linkedHashMap = D.f12013b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    We we2 = new We(C0353na.I.B().b(D.f12012a, q42));
                    if (q42.d()) {
                        String str = "appmetrica_vital_" + q42.f12771b + ".dat";
                        c0046ba = new C0170g5(kotlin.collections.u.f(new Pair(str, new C0046ba(D.f12012a, str)), new Pair("appmetrica_vital_main.dat", new C0046ba(D.f12012a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0046ba = new C0046ba(D.f12012a, "appmetrica_vital_" + q42.f12771b + ".dat");
                    }
                    obj = new xo(we2, c0046ba, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                xoVar = (xo) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xoVar;
    }

    public C0067c5(Context context, Q4 q42, C0372o4 c0372o4, V4 v42, C0161fm c0161fm, InterfaceC0208hh interfaceC0208hh, ICommonExecutor iCommonExecutor, H8 h82, int i5, C0015a5 c0015a5, C0041b5 c0041b5, Fb fb2, InterfaceC0476s9 interfaceC0476s9) {
        this.f13488c = context;
        this.f13489d = q42;
        this.f13490e = c0372o4;
        this.f13491f = v42;
        this.f13492g = c0161fm;
        this.f13493h = interfaceC0208hh;
        this.j = iCommonExecutor;
        this.f13494i = h82;
        this.f13497m = i5;
        this.f13486a = c0015a5;
        this.f13487b = c0041b5;
        this.f13495k = fb2;
        this.f13496l = interfaceC0476s9;
    }

    public final Jk c() {
        return new Jk(this.f13488c, this.f13489d);
    }

    public final C0560vi d(X4 x42) {
        C0560vi c0560vi = new C0560vi(x42, this.f13491f.a(), this.j);
        Fb fb2 = this.f13495k;
        synchronized (fb2) {
            fb2.f12222c.add(c0560vi);
        }
        return c0560vi;
    }

    public final Qg a(X4 x42) {
        return new Qg(new C0233ih(x42, this.f13493h, new C3()), this.f13492g, new C0156fh(this.f13490e));
    }

    public static Rk a(X4 x42, xo xoVar, W4 w42) {
        Qk qk = new Qk(xoVar);
        return new Rk(x42, qk, w42, new C0201ha(x42, qk, new Uk(x42.h(), C0201ha.f13893g), AbstractC0593x1.a(), new SystemTimeProvider()), new C0644z2(x42, qk, new Uk(x42.h(), C0644z2.f14985g), AbstractC0593x1.a(), new SystemTimeProvider()));
    }

    public static S4 b() {
        return new S4();
    }

    public final C0321m3 b(We we2) {
        Context context = this.f13488c;
        return new C0321m3(context, we2, context.getPackageName(), new SafePackageManager());
    }

    public final C0277k9 a(We we2, xo xoVar, Rk rk, L6 l6, C0242j0 c0242j0, Jk jk, C0560vi c0560vi) {
        return new C0277k9(we2, xoVar, rk, l6, c0242j0, this.f13494i, jk, this.f13497m, new Z4(c0560vi), new SystemTimeProvider());
    }

    public static C0510ti a(X4 x42, X8 x82) {
        return new C0510ti(x82, x42);
    }

    public InterfaceC0427q9 a(InterfaceC0551v9 interfaceC0551v9, L6 l6, Qg qg2, C0372o4 c0372o4, Q4 q42, We we2) {
        return this.f13496l.a(interfaceC0551v9, l6, qg2, c0372o4, q42, we2).a();
    }

    public final C0395p2 a(We we2) {
        return new C0395p2(this.f13489d, we2);
    }
}
