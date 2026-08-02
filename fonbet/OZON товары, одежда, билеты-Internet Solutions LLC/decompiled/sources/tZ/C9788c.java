package tZ;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* renamed from: tZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9788c extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f99312e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f99313a;

    /* renamed from: b, reason: collision with root package name */
    private final f f99314b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f99315c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f99316d;

    /* renamed from: tZ.c$a */
    public static final class a {
        @NotNull
        public static C9788c a(String str, @NotNull f redirect) {
            Intrinsics.checkNotNullParameter(redirect, "redirect");
            f.Companion.getClass();
            if (redirect != f.NONE) {
                return new C9788c(str, redirect);
            }
            throw new IllegalArgumentException("'redirect' must not be NONE for 'Inclusive'");
        }
    }

    public C9788c(f fVar) {
        this.f99316d = N.b(C9789d.class);
        this.f99315c = false;
        this.f99314b = fVar;
        this.f99313a = null;
    }

    public final boolean a() {
        return this.f99315c;
    }

    public final f b() {
        return this.f99314b;
    }

    public final String c() {
        return this.f99313a;
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f99316d;
    }

    @NotNull
    public final String toString() {
        return "ClearBackStackDestination(redirect=" + this.f99314b + ")";
    }

    public C9788c(String str, f fVar) {
        this.f99316d = N.b(C9789d.class);
        this.f99314b = fVar;
        this.f99315c = true;
        this.f99313a = str;
    }
}
