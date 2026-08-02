package fe;

import Sc.InterfaceC3999a;
import ge.C6721d;
import ie.C7056e;
import ie.InterfaceC7060i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9826Q;
import te.C9865a;

/* renamed from: fe.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6524c implements InterfaceC9826Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7056e f63202a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ld.w f63203b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wd.L f63204c;

    /* renamed from: d, reason: collision with root package name */
    protected C6535n f63205d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<Sd.c, InterfaceC9820K> f63206e;

    public AbstractC6524c(@NotNull C7056e storageManager, @NotNull Ld.w finder, @NotNull wd.L moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f63202a = storageManager;
        this.f63203b = finder;
        this.f63204c = moduleDescriptor;
        this.f63206e = storageManager.j(new C6523b(this));
    }

    @Override // td.InterfaceC9826Q
    public final void a(@NotNull Sd.c fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        C9865a.a(packageFragments, this.f63206e.invoke(fqName));
    }

    @Override // td.InterfaceC9821L
    @InterfaceC3999a
    @NotNull
    public final List<InterfaceC9820K> b(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return C7714v.c0(this.f63206e.invoke(fqName));
    }

    @Override // td.InterfaceC9826Q
    public final boolean c(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InterfaceC7060i<Sd.c, InterfaceC9820K> interfaceC7060i = this.f63206e;
        return (interfaceC7060i.p(fqName) ? (InterfaceC9820K) interfaceC7060i.invoke(fqName) : d(fqName)) == null;
    }

    protected abstract C6721d d(@NotNull Sd.c cVar);

    @NotNull
    protected final InterfaceC6516A e() {
        return this.f63203b;
    }

    @NotNull
    protected final InterfaceC9815F f() {
        return this.f63204c;
    }

    @NotNull
    protected final ie.o g() {
        return this.f63202a;
    }

    protected final void h(@NotNull C6535n c6535n) {
        Intrinsics.checkNotNullParameter(c6535n, "<set-?>");
        this.f63205d = c6535n;
    }

    @Override // td.InterfaceC9821L
    @NotNull
    public final Collection<Sd.c> j(@NotNull Sd.c fqName, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return kotlin.collections.M.f71699a;
    }
}
