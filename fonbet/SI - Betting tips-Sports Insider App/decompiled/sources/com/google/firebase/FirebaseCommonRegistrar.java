package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.k;
import com.google.firebase.messaging.r;
import h8.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k2.x;
import kotlin.KotlinVersion;
import o8.a;
import o8.b;
import o8.h;
import o8.p;
import y8.c;
import y8.d;
import y8.e;
import y8.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a a7 = b.a(h9.b.class);
        a7.a(new h(2, 0, h9.a.class));
        a7.f21100f = new k(25);
        arrayList.add(a7.b());
        p pVar = new p(n8.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, f.class});
        aVar.a(h.a(Context.class));
        aVar.a(h.a(g.class));
        aVar.a(new h(2, 0, d.class));
        aVar.a(new h(1, 1, h9.b.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.f21100f = new r(pVar, 2);
        arrayList.add(aVar.b());
        arrayList.add(x.j("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(x.j("fire-core", "22.0.1"));
        arrayList.add(x.j("device-name", b(Build.PRODUCT)));
        arrayList.add(x.j("device-model", b(Build.DEVICE)));
        arrayList.add(x.j("device-brand", b(Build.BRAND)));
        arrayList.add(x.p("android-target-sdk", new k(21)));
        arrayList.add(x.p("android-min-sdk", new k(22)));
        arrayList.add(x.p("android-platform", new k(23)));
        arrayList.add(x.p("android-installer", new k(24)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(x.j("kotlin", str));
        }
        return arrayList;
    }
}
