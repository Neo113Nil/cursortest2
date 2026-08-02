package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.au3;
import defpackage.by0;
import defpackage.f8h;
import defpackage.i7b;
import defpackage.iy1;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.oif;
import defpackage.p4h;
import defpackage.qx4;
import defpackage.rik;
import defpackage.s9k;
import defpackage.wxf;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lkb3;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<kb3> getComponents() {
        jb3 a = kb3.a(new oif(by0.class, au3.class));
        a.a(new qx4(new oif(by0.class, Executor.class), 1, 0));
        a.f = wxf.f;
        kb3 b = a.b();
        jb3 a2 = kb3.a(new oif(i7b.class, au3.class));
        a2.a(new qx4(new oif(i7b.class, Executor.class), 1, 0));
        a2.f = p4h.e;
        kb3 b2 = a2.b();
        jb3 a3 = kb3.a(new oif(iy1.class, au3.class));
        a3.a(new qx4(new oif(iy1.class, Executor.class), 1, 0));
        a3.f = f8h.e;
        kb3 b3 = a3.b();
        jb3 a4 = kb3.a(new oif(s9k.class, au3.class));
        a4.a(new qx4(new oif(s9k.class, Executor.class), 1, 0));
        a4.f = rik.d;
        return b.j(b, b2, b3, a4.b());
    }
}
