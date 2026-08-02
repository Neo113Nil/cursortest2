package com.google.firebase;

import Bk.C2638a;
import H8.c;
import H8.g;
import Ij.C3261b;
import J0.C3354v2;
import Nk.a;
import Sc.C4007i;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.internal.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m8.InterfaceC8103a;
import n8.C8451a;
import n8.n;
import n8.w;
import w8.e;
import w8.f;
import w8.h;
import w8.i;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? b(installerPackageName) : "";
    }

    private static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C8451a<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.a());
        w wVar = new w(InterfaceC8103a.class, Executor.class);
        C8451a.C1292a b11 = C8451a.b(e.class, h.class, i.class);
        b11.b(n.i(Context.class));
        b11.b(n.i(k8.e.class));
        b11.b(n.l(f.class));
        b11.b(n.k(H8.h.class));
        b11.b(n.j(wVar));
        b11.f(new b(wVar));
        arrayList.add(b11.d());
        arrayList.add(g.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(g.a("fire-core", "21.0.0"));
        arrayList.add(g.a("device-name", b(Build.PRODUCT)));
        arrayList.add(g.a("device-model", b(Build.DEVICE)));
        arrayList.add(g.a("device-brand", b(Build.BRAND)));
        arrayList.add(g.b("android-target-sdk", new a()));
        arrayList.add(g.b("android-min-sdk", new C2638a()));
        arrayList.add(g.b("android-platform", new C3261b()));
        arrayList.add(g.b("android-installer", new C3354v2()));
        try {
            str = C4007i.f26099f.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(g.a("kotlin", str));
        }
        return arrayList;
    }
}
