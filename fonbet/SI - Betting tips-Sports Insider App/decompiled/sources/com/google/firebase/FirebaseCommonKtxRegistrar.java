package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import eg.w;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n8.c;
import n8.d;
import o8.a;
import o8.b;
import o8.h;
import o8.p;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo8/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        a b10 = b.b(new p(n8.a.class, w.class));
        b10.a(new h(new p(n8.a.class, Executor.class), 1, 0));
        b10.f21100f = h8.h.f10410b;
        b b11 = b10.b();
        Intrinsics.checkNotNullExpressionValue(b11, "build(...)");
        a b12 = b.b(new p(c.class, w.class));
        b12.a(new h(new p(c.class, Executor.class), 1, 0));
        b12.f21100f = h8.h.f10411c;
        b b13 = b12.b();
        Intrinsics.checkNotNullExpressionValue(b13, "build(...)");
        a b14 = b.b(new p(n8.b.class, w.class));
        b14.a(new h(new p(n8.b.class, Executor.class), 1, 0));
        b14.f21100f = h8.h.f10412d;
        b b15 = b14.b();
        Intrinsics.checkNotNullExpressionValue(b15, "build(...)");
        a b16 = b.b(new p(d.class, w.class));
        b16.a(new h(new p(d.class, Executor.class), 1, 0));
        b16.f21100f = h8.h.f10413e;
        b b17 = b16.b();
        Intrinsics.checkNotNullExpressionValue(b17, "build(...)");
        return u.f(b11, b13, b15, b17);
    }
}
