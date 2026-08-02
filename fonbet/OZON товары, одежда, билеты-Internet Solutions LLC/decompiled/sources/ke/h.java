package ke;

import java.util.Collection;
import je.AbstractC7395o;
import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9839e;
import td.InterfaceC9845k;

/* loaded from: classes.dex */
public abstract class h extends AbstractC7395o {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71488a = new a();

        @Override // ke.h
        public final void b(@NotNull Sd.b classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
        }

        @Override // ke.h
        public final void c(@NotNull InterfaceC9815F moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        }

        @Override // ke.h
        public final void d(InterfaceC9845k descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        }

        @Override // ke.h
        @NotNull
        public final Collection<N> e(@NotNull InterfaceC9839e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection<N> o11 = classDescriptor.k().o();
            Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
            return o11;
        }

        @Override // ke.h
        @NotNull
        /* renamed from: f */
        public final N a(@NotNull ne.g type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (N) type;
        }
    }

    public abstract void b(@NotNull Sd.b bVar);

    public abstract void c(@NotNull InterfaceC9815F interfaceC9815F);

    public abstract void d(@NotNull InterfaceC9845k interfaceC9845k);

    @NotNull
    public abstract Collection<N> e(@NotNull InterfaceC9839e interfaceC9839e);

    @Override // je.AbstractC7395o
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract N a(@NotNull ne.g gVar);
}
