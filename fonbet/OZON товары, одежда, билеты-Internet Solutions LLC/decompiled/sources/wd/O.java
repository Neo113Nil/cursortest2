package wd;

import ie.C7056e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9814E;

/* loaded from: classes.dex */
public interface O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f104211a = a.f104212a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f104212a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final C9814E<O> f104213b = new C9814E<>("PackageViewDescriptorFactory");

        @NotNull
        public static C9814E a() {
            return f104213b;
        }
    }

    public static final class b implements O {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f104214b = new b();

        @Override // wd.O
        @NotNull
        public final C10513E a(@NotNull L module, @NotNull Sd.c fqName, @NotNull C7056e storageManager) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            return new C10513E(module, fqName, storageManager);
        }
    }

    @NotNull
    C10513E a(@NotNull L l11, @NotNull Sd.c cVar, @NotNull C7056e c7056e);
}
