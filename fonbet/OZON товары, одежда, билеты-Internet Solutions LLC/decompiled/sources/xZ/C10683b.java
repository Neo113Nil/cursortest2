package xZ;

import CZ.b;
import Sc.o;
import androidx.fragment.app.G;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sZ.c;
import tZ.C9786a;

/* renamed from: xZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10683b extends j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f105183a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f105184b;

    /* renamed from: xZ.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105185a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105185a = iArr;
        }
    }

    /* renamed from: xZ.b$b, reason: collision with other inner class name */
    static final class C2276b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f105187c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CZ.e f105188d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f105189e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EZ.e<?> f105190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f105191g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2276b(String str, CZ.e eVar, String str2, EZ.e eVar2, int i11) {
            super(0);
            this.f105187c = str;
            this.f105188d = eVar;
            this.f105189e = str2;
            this.f105190f = eVar2;
            this.f105191g = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C10683b c10683b = C10683b.this;
            h<String> c11 = c10683b.c();
            String str = this.f105187c;
            boolean contains = c11.contains(str);
            EZ.e<?> eVar = this.f105190f;
            int i11 = this.f105191g;
            String str2 = this.f105189e;
            if (contains || c10683b.d().remove(str)) {
                CZ.e eVar2 = this.f105188d;
                if (eVar2.d()) {
                    h<String> c12 = c10683b.c();
                    c12.remove(str);
                    c12.add(str);
                    if (str2 != null) {
                        G fragmentManager = c10683b.getFragmentManager();
                        if (!str2.equals(c10683b.getHostName$compass_release())) {
                            c10683b.d().add(str2);
                            fragmentManager.h1(str2);
                        }
                    }
                    c10683b.getFragmentManager().d1(str);
                    c10683b.getFragmentManager().c0();
                    if (eVar2.c() != null) {
                        c10683b.redirect(eVar.e(eVar2.c()), i11);
                    }
                    return Unit.f71690a;
                }
            }
            h<String> c13 = c10683b.c();
            c13.remove(str);
            c13.add(str);
            if (str2 != null) {
                G fragmentManager2 = c10683b.getFragmentManager();
                if (!str2.equals(c10683b.getHostName$compass_release())) {
                    c10683b.d().add(str2);
                    fragmentManager2.h1(str2);
                }
            }
            c10683b.getFragmentManager().c0();
            C10683b.super.navigate(eVar, i11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10683b(@NotNull androidx.appcompat.app.g activity, @NotNull String appName, int i11, @NotNull i rootFactory) {
        super(activity, r2, activity, i11, appName, rootFactory, new c.b(0, 0, 0, 15, 0));
        k savedMiniApps;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(rootFactory, "rootFactory");
        savedMiniApps = C10686e.f105198a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(rootFactory, "rootFactory");
        Intrinsics.checkNotNullParameter(savedMiniApps, "savedMiniApps");
        G supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.f105183a = savedMiniApps;
        h<String> hVar = new h<>(activity);
        this.f105184b = hVar;
        String str = (String) C7714v.L(hVar);
        if (str == null || !str.equals(appName)) {
            hVar.addFirst(appName);
        }
    }

    @NotNull
    public final h<String> c() {
        return this.f105184b;
    }

    @NotNull
    public final k d() {
        return this.f105183a;
    }

    public final boolean e(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.d(name, getHostName$compass_release()) || this.f105184b.contains(name) || this.f105183a.contains(name);
    }

    @Override // xZ.j, EZ.g
    public final void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        boolean z11 = b11 instanceof CZ.e;
        h<String> hVar = this.f105184b;
        if (z11) {
            safeTransaction(new C2276b(((CZ.e) b11).a(), (CZ.e) b11, (String) C7714v.Y(hVar), response, i11));
            return;
        }
        if (!(b11 instanceof CZ.b)) {
            if (!(b11 instanceof CZ.a)) {
                super.navigate(response, i11);
                return;
            }
            String pollLast = hVar.pollLast();
            if (pollLast != null) {
                safeTransaction(new C10685d(pollLast, this, false));
                return;
            } else {
                redirect(response.e(new C9786a()), i11);
                return;
            }
        }
        if (hVar.size() <= 1) {
            pZ.f b12 = ((CZ.b) b11).b();
            if (b12 != null) {
                redirect(response.e(b12), i11);
                return;
            }
            return;
        }
        String removeLast = hVar.removeLast();
        CZ.b bVar = (CZ.b) b11;
        int i12 = a.f105185a[bVar.a().ordinal()];
        if (i12 == 1) {
            Intrinsics.f(removeLast);
            safeTransaction(new C10684c(removeLast, this, bVar.c()));
        } else {
            if (i12 != 2) {
                throw new o();
            }
            Intrinsics.f(removeLast);
            safeTransaction(new C10685d(removeLast, this, bVar.c()));
        }
        pZ.f b13 = bVar.b();
        if (b13 != null) {
            redirect(response.e(b13), i11);
        }
    }
}
