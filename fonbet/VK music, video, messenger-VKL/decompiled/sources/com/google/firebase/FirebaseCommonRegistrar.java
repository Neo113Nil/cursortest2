package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.a;
import defpackage.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import xsna.air;
import xsna.bir;
import xsna.g1v;
import xsna.go9;
import xsna.gzl;
import xsna.h1v;
import xsna.hgq0;
import xsna.i8i;
import xsna.nx1;
import xsna.s2z;
import xsna.tk5;
import xsna.toe0;
import xsna.v2z;
import xsna.vhr;
import xsna.wv5;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<i8i<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        i8i.a a = i8i.a(hgq0.class);
        a.a(new gzl(2, 0, s2z.class));
        a.f = new k0();
        arrayList.add(a.b());
        toe0 toe0Var = new toe0(wv5.class, Executor.class);
        i8i.a aVar = new i8i.a(a.class, new Class[]{h1v.class, HeartBeatInfo.class});
        aVar.a(gzl.b(Context.class));
        aVar.a(gzl.b(vhr.class));
        aVar.a(new gzl(2, 0, g1v.class));
        aVar.a(new gzl(1, 1, hgq0.class));
        aVar.a(new gzl((toe0<?>) toe0Var, 1, 0));
        aVar.f = new nx1(toe0Var);
        arrayList.add(aVar.b());
        arrayList.add(v2z.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(v2z.a("fire-core", "21.0.0"));
        arrayList.add(v2z.a("device-name", a(Build.PRODUCT)));
        arrayList.add(v2z.a("device-model", a(Build.DEVICE)));
        arrayList.add(v2z.a("device-brand", a(Build.BRAND)));
        arrayList.add(v2z.b("android-target-sdk", new go9()));
        arrayList.add(v2z.b("android-min-sdk", new air()));
        arrayList.add(v2z.b("android-platform", new tk5()));
        arrayList.add(v2z.b("android-installer", new bir()));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(v2z.a("kotlin", str));
        }
        return arrayList;
    }
}
