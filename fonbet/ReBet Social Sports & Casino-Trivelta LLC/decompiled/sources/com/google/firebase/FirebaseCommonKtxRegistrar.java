package com.google.firebase;

import Ph.AbstractC1481v0;
import Ph.L;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ib.InterfaceC4541a;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mb.C5576c;
import mb.D;
import mb.InterfaceC5577d;
import mb.g;
import mb.q;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmb/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37517a = new a();

        @Override // mb.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L a(InterfaceC5577d interfaceC5577d) {
            Object c10 = interfaceC5577d.c(D.a(InterfaceC4541a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(c10, "get(...)");
            return AbstractC1481v0.b((Executor) c10);
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37518a = new b();

        @Override // mb.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L a(InterfaceC5577d interfaceC5577d) {
            Object c10 = interfaceC5577d.c(D.a(ib.c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(c10, "get(...)");
            return AbstractC1481v0.b((Executor) c10);
        }
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37519a = new c();

        @Override // mb.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L a(InterfaceC5577d interfaceC5577d) {
            Object c10 = interfaceC5577d.c(D.a(ib.b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(c10, "get(...)");
            return AbstractC1481v0.b((Executor) c10);
        }
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final d f37520a = new d();

        @Override // mb.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L a(InterfaceC5577d interfaceC5577d) {
            Object c10 = interfaceC5577d.c(D.a(ib.d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(c10, "get(...)");
            return AbstractC1481v0.b((Executor) c10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C5576c> getComponents() {
        C5576c d10 = C5576c.e(D.a(InterfaceC4541a.class, L.class)).b(q.k(D.a(InterfaceC4541a.class, Executor.class))).f(a.f37517a).d();
        Intrinsics.checkNotNullExpressionValue(d10, "build(...)");
        C5576c d11 = C5576c.e(D.a(ib.c.class, L.class)).b(q.k(D.a(ib.c.class, Executor.class))).f(b.f37518a).d();
        Intrinsics.checkNotNullExpressionValue(d11, "build(...)");
        C5576c d12 = C5576c.e(D.a(ib.b.class, L.class)).b(q.k(D.a(ib.b.class, Executor.class))).f(c.f37519a).d();
        Intrinsics.checkNotNullExpressionValue(d12, "build(...)");
        C5576c d13 = C5576c.e(D.a(ib.d.class, L.class)).b(q.k(D.a(ib.d.class, Executor.class))).f(d.f37520a).d();
        Intrinsics.checkNotNullExpressionValue(d13, "build(...)");
        return CollectionsKt.listOf((Object[]) new C5576c[]{d10, d11, d12, d13});
    }
}
