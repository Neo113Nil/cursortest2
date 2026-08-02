package vd;

import he.C6926H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* renamed from: vd.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10306c {

    /* renamed from: vd.c$a */
    /* loaded from: classes10.dex */
    public static final class a implements InterfaceC10306c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f102850a = new a();

        @Override // vd.InterfaceC10306c
        public final boolean d(@NotNull InterfaceC9839e classDescriptor, @NotNull C6926H functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: vd.c$b */
    /* loaded from: classes10.dex */
    public static final class b implements InterfaceC10306c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f102851a = new b();

        @Override // vd.InterfaceC10306c
        public final boolean d(@NotNull InterfaceC9839e classDescriptor, @NotNull C6926H functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().K0(C10307d.a());
        }
    }

    boolean d(@NotNull InterfaceC9839e interfaceC9839e, @NotNull C6926H c6926h);
}
