package io.sentry.config;

import io.sentry.p3;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {
    @NotNull
    public static f a() {
        Properties a11;
        Properties a12;
        p3 p3Var = new p3();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i("sentry.", System.getProperties()));
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (a12 = new e(property, p3Var, true).a()) != null) {
            arrayList.add(new h(a12));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (a11 = new e(str, p3Var, true).a()) != null) {
            arrayList.add(new h(a11));
        }
        Properties a13 = new b(p3Var).a();
        if (a13 != null) {
            arrayList.add(new h(a13));
        }
        Properties a14 = new e("sentry.properties", p3Var, false).a();
        if (a14 != null) {
            arrayList.add(new h(a14));
        }
        return new c(arrayList);
    }
}
