package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ac3;
import defpackage.gyj;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.ogj;
import defpackage.oif;
import defpackage.qx4;
import defpackage.s5b;
import defpackage.txj;
import defpackage.wba;
import defpackage.wxj;
import defpackage.zc2;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wxj lambda$getComponents$0(ac3 ac3Var) {
        gyj.b((Context) ac3Var.e(Context.class));
        return gyj.a().c(zc2.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wxj lambda$getComponents$1(ac3 ac3Var) {
        gyj.b((Context) ac3Var.e(Context.class));
        return gyj.a().c(zc2.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wxj lambda$getComponents$2(ac3 ac3Var) {
        gyj.b((Context) ac3Var.e(Context.class));
        return gyj.a().c(zc2.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<kb3> getComponents() {
        jb3 b = kb3.b(wxj.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(Context.class));
        b.f = new ogj(16);
        kb3 b2 = b.b();
        jb3 a = kb3.a(new oif(s5b.class, wxj.class));
        a.a(qx4.c(Context.class));
        a.f = new ogj(17);
        kb3 b3 = a.b();
        jb3 a2 = kb3.a(new oif(txj.class, wxj.class));
        a2.a(qx4.c(Context.class));
        a2.f = new ogj(18);
        return Arrays.asList(b2, b3, a2.b(), wba.q(LIBRARY_NAME, "19.0.0"));
    }
}
