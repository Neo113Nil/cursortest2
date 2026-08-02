package qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.InterfaceC9035f;

/* renamed from: qe.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9043n implements InterfaceC9035f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f81964a;

    /* renamed from: qe.n$a */
    public static final class a extends AbstractC9043n {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f81965b = new a("must be a member function");

        @Override // qe.InterfaceC9035f
        public final boolean a(@NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.c0() != null;
        }
    }

    /* renamed from: qe.n$b */
    public static final class b extends AbstractC9043n {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f81966b = new b("must be a member or an extension function");

        @Override // qe.InterfaceC9035f
        public final boolean a(@NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.c0() == null && functionDescriptor.d0() == null) ? false : true;
        }
    }

    public AbstractC9043n(String str) {
        this.f81964a = str;
    }

    @Override // qe.InterfaceC9035f
    public final String b(@NotNull Ed.e eVar) {
        return InterfaceC9035f.a.a(this, eVar);
    }

    @Override // qe.InterfaceC9035f
    @NotNull
    public final String getDescription() {
        return this.f81964a;
    }
}
