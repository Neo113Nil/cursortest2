package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import xsna.akr;
import xsna.b6z;
import xsna.ex1;
import xsna.f5k;
import xsna.gzl;
import xsna.i8i;
import xsna.o8a;
import xsna.pf7;
import xsna.toe0;
import xsna.uir;
import xsna.v2z;
import xsna.vhr;
import xsna.wi50;
import xsna.wv5;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final toe0<ExecutorService> a = new toe0<>(wv5.class, ExecutorService.class);
    public final toe0<ExecutorService> b = new toe0<>(pf7.class, ExecutorService.class);
    public final toe0<ExecutorService> c = new toe0<>(b6z.class, ExecutorService.class);

    static {
        SessionSubscriber.Name name = SessionSubscriber.Name.CRASHLYTICS;
        if (name == SessionSubscriber.Name.PERFORMANCE) {
            a aVar = a.a;
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<SessionSubscriber.Name, a.C0146a> map = a.b;
        if (map.containsKey(name)) {
            name.toString();
        } else {
            map.put(name, new a.C0146a(new wi50(true)));
            name.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(FirebaseCrashlytics.class);
        a.a = "fire-cls";
        a.a(gzl.b(vhr.class));
        a.a(gzl.b(uir.class));
        a.a(new gzl(this.a, 1, 0));
        a.a(new gzl(this.b, 1, 0));
        a.a(new gzl(this.c, 1, 0));
        a.a(new gzl(0, 2, f5k.class));
        a.a(new gzl(0, 2, ex1.class));
        a.a(new gzl(0, 2, akr.class));
        a.f = new o8a(this);
        a.c(2);
        return Arrays.asList(a.b(), v2z.a("fire-cls", "19.4.4"));
    }
}
