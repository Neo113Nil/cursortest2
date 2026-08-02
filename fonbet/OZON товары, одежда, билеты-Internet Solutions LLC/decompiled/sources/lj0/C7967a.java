package lj0;

import android.content.Context;
import jj0.C7434a;
import jj0.b;
import jj0.e;
import jj0.f;
import jj0.i;
import jj0.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: lj0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7967a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f73382a;

    public C7967a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f73382a = new Nl.a(context, 3);
    }

    @NotNull
    public final C7434a a() {
        return new C7434a(this.f73382a);
    }

    @NotNull
    public final b b() {
        return new b(this.f73382a);
    }

    @NotNull
    public final e c() {
        return new e(this.f73382a);
    }

    @NotNull
    public final f d() {
        return new f(this.f73382a);
    }

    @NotNull
    public final i e() {
        return new i(this.f73382a);
    }

    @NotNull
    public final j f() {
        return new j(this.f73382a);
    }
}
