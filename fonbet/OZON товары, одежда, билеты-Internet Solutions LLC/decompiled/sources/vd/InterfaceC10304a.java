package vd;

import Sd.f;
import he.n;
import java.util.Collection;
import je.N;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.c0;

/* renamed from: vd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10304a {

    /* renamed from: vd.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C2230a implements InterfaceC10304a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2230a f102849a = new C2230a();

        @Override // vd.InterfaceC10304a
        @NotNull
        public final Collection<N> a(@NotNull InterfaceC9839e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return K.f71697a;
        }

        @Override // vd.InterfaceC10304a
        @NotNull
        public final Collection<c0> b(@NotNull f name, @NotNull InterfaceC9839e classDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return K.f71697a;
        }

        @Override // vd.InterfaceC10304a
        @NotNull
        public final Collection c(@NotNull n classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return K.f71697a;
        }

        @Override // vd.InterfaceC10304a
        @NotNull
        public final Collection<f> e(@NotNull InterfaceC9839e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return K.f71697a;
        }
    }

    @NotNull
    Collection<N> a(@NotNull InterfaceC9839e interfaceC9839e);

    @NotNull
    Collection<c0> b(@NotNull f fVar, @NotNull InterfaceC9839e interfaceC9839e);

    @NotNull
    Collection c(@NotNull n nVar);

    @NotNull
    Collection<f> e(@NotNull InterfaceC9839e interfaceC9839e);
}
