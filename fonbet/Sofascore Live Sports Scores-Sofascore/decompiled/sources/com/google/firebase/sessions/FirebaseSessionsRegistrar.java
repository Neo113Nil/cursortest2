package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.au3;
import defpackage.ayf;
import defpackage.by0;
import defpackage.d8h;
import defpackage.f5p;
import defpackage.fc4;
import defpackage.fcp;
import defpackage.hg6;
import defpackage.iy1;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.l48;
import defpackage.o58;
import defpackage.oif;
import defpackage.p58;
import defpackage.q58;
import defpackage.qx4;
import defpackage.r06;
import defpackage.r38;
import defpackage.r58;
import defpackage.teh;
import defpackage.u7h;
import defpackage.vff;
import defpackage.w58;
import defpackage.wba;
import defpackage.wff;
import defpackage.wxj;
import defpackage.x58;
import defpackage.x65;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lkb3;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "w58", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final w58 Companion = new w58();

    @NotNull
    private static final oif appContext = oif.a(Context.class);

    @NotNull
    private static final oif firebaseApp = oif.a(r38.class);

    @NotNull
    private static final oif firebaseInstallationsApi = oif.a(l48.class);

    @NotNull
    private static final oif backgroundDispatcher = new oif(by0.class, au3.class);

    @NotNull
    private static final oif blockingDispatcher = new oif(iy1.class, au3.class);

    @NotNull
    private static final oif transportFactory = oif.a(wxj.class);

    @NotNull
    private static final oif firebaseSessionsComponent = oif.a(p58.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final o58 getComponents$lambda$0(ac3 ac3Var) {
        return (o58) ((fc4) ((p58) ac3Var.h(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p58 getComponents$lambda$1(ac3 ac3Var) {
        Object h = ac3Var.h(appContext);
        h.getClass();
        Object h2 = ac3Var.h(backgroundDispatcher);
        h2.getClass();
        Object h3 = ac3Var.h(blockingDispatcher);
        h3.getClass();
        Object h4 = ac3Var.h(firebaseApp);
        h4.getClass();
        Object h5 = ac3Var.h(firebaseInstallationsApi);
        h5.getClass();
        vff g = ac3Var.g(transportFactory);
        g.getClass();
        fc4 fc4Var = new fc4();
        fc4Var.a = u7h.a((r38) h4);
        u7h a = u7h.a((Context) h);
        fc4Var.b = a;
        fc4Var.c = x65.a(new r06(a, 2));
        fc4Var.d = x65.a(f5p.e);
        fc4Var.e = u7h.a((l48) h5);
        int i = 1;
        fc4Var.f = x65.a(new r06(fc4Var.a, i));
        u7h a2 = u7h.a((CoroutineContext) h3);
        fc4Var.g = a2;
        fc4Var.h = x65.a(new q58(fc4Var.f, a2));
        fc4Var.i = u7h.a((CoroutineContext) h2);
        int i2 = 0;
        fc4Var.j = x65.a(new d8h(fc4Var.c, x65.a(new ayf(fc4Var.d, fc4Var.e, fc4Var.f, fc4Var.h, x65.a(new r58((wff) fc4Var.i, fc4Var.d, x65.a(new q58(fc4Var.b, fc4Var.g, i2)))))), i));
        wff a3 = x65.a(fcp.d);
        fc4Var.k = a3;
        fc4Var.l = x65.a(new d8h(fc4Var.d, a3, i2));
        fc4Var.m = x65.a(new ayf(fc4Var.a, (wff) fc4Var.e, fc4Var.j, x65.a(new r06(u7h.a(g), i2)), (wff) fc4Var.i));
        fc4Var.n = x65.a(new r58(fc4Var.b, (wff) fc4Var.g, x65.a(new u7h(fc4Var.l, i2))));
        wff a4 = x65.a(new teh(fc4Var.j, fc4Var.l, fc4Var.m, fc4Var.d, fc4Var.n, x65.a(new q58(fc4Var.b, fc4Var.k, i)), fc4Var.i));
        fc4Var.o = a4;
        fc4Var.p = x65.a(new x58(fc4Var.a, fc4Var.j, fc4Var.i, x65.a(new u7h(a4, i))));
        return fc4Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<kb3> getComponents() {
        jb3 b = kb3.b(o58.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.b(firebaseSessionsComponent));
        b.f = new hg6(19);
        b.c(2);
        kb3 b2 = b.b();
        jb3 b3 = kb3.b(p58.class);
        b3.a = "fire-sessions-component";
        b3.a(qx4.b(appContext));
        b3.a(qx4.b(backgroundDispatcher));
        b3.a(qx4.b(blockingDispatcher));
        b3.a(qx4.b(firebaseApp));
        b3.a(qx4.b(firebaseInstallationsApi));
        b3.a(new qx4(transportFactory, 1, 1));
        b3.f = new hg6(20);
        return b.j(b2, b3.b(), wba.q(LIBRARY_NAME, "3.0.7"));
    }
}
