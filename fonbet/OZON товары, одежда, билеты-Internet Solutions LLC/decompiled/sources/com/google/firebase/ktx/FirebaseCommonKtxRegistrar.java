package com.google.firebase.ktx;

import Sc.InterfaceC3999a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m8.InterfaceC8103a;
import m8.InterfaceC8104b;
import m8.InterfaceC8105c;
import m8.InterfaceC8106d;
import n8.C8451a;
import n8.InterfaceC8452b;
import n8.e;
import n8.n;
import n8.w;
import org.jetbrains.annotations.NotNull;
import xe.C10747s0;
import xe.I;

@InterfaceC3999a
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ln8/a;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f59583a = new a<>();

        @Override // n8.e
        public final Object a(InterfaceC8452b interfaceC8452b) {
            Object e11 = interfaceC8452b.e(new w<>(InterfaceC8103a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C10747s0.b((Executor) e11);
        }
    }

    public static final class b<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f59584a = new b<>();

        @Override // n8.e
        public final Object a(InterfaceC8452b interfaceC8452b) {
            Object e11 = interfaceC8452b.e(new w<>(InterfaceC8105c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C10747s0.b((Executor) e11);
        }
    }

    public static final class c<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f59585a = new c<>();

        @Override // n8.e
        public final Object a(InterfaceC8452b interfaceC8452b) {
            Object e11 = interfaceC8452b.e(new w<>(InterfaceC8104b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C10747s0.b((Executor) e11);
        }
    }

    public static final class d<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f59586a = new d<>();

        @Override // n8.e
        public final Object a(InterfaceC8452b interfaceC8452b) {
            Object e11 = interfaceC8452b.e(new w<>(InterfaceC8106d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C10747s0.b((Executor) e11);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C8451a<?>> getComponents() {
        C8451a.C1292a c11 = C8451a.c(new w(InterfaceC8103a.class, I.class));
        c11.b(n.j(new w(InterfaceC8103a.class, Executor.class)));
        c11.f(a.f59583a);
        C8451a d11 = c11.d();
        Intrinsics.checkNotNullExpressionValue(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8451a.C1292a c12 = C8451a.c(new w(InterfaceC8105c.class, I.class));
        c12.b(n.j(new w(InterfaceC8105c.class, Executor.class)));
        c12.f(b.f59584a);
        C8451a d12 = c12.d();
        Intrinsics.checkNotNullExpressionValue(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8451a.C1292a c13 = C8451a.c(new w(InterfaceC8104b.class, I.class));
        c13.b(n.j(new w(InterfaceC8104b.class, Executor.class)));
        c13.f(c.f59585a);
        C8451a d13 = c13.d();
        Intrinsics.checkNotNullExpressionValue(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8451a.C1292a c14 = C8451a.c(new w(InterfaceC8106d.class, I.class));
        c14.b(n.j(new w(InterfaceC8106d.class, Executor.class)));
        c14.f(d.f59586a);
        C8451a d14 = c14.d();
        Intrinsics.checkNotNullExpressionValue(d14, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C7714v.b0(d11, d12, d13, d14);
    }
}
