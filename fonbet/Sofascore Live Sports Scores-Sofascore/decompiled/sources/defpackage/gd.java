package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gd {
    public final xc a;

    public gd(ComponentName componentName) {
        xc xcVar = new xc(componentName);
        this.a = xcVar;
        String str = xcVar.a;
        if (str.length() <= 0) {
            a70.p("Package name must not be empty");
            throw null;
        }
        String str2 = xcVar.b;
        if (str2.length() <= 0) {
            a70.p("Activity class name must not be empty");
            throw null;
        }
        if (StringsKt.J(str, "*", false) && StringsKt.P(str, "*", 0, false, 6) != str.length() - 1) {
            a70.p("Wildcard in package name is only allowed at the end.");
            throw null;
        }
        if (!StringsKt.J(str2, "*", false) || StringsKt.P(str2, "*", 0, false, 6) == str2.length() - 1) {
            return;
        }
        a70.p("Wildcard in class name is only allowed at the end.");
        throw null;
    }

    public final boolean a(Activity activity) {
        boolean v;
        ComponentName componentName = activity.getComponentName();
        componentName.getClass();
        xc xcVar = new xc(componentName);
        xc xcVar2 = this.a;
        if (w1a.j(xcVar, xcVar2)) {
            v = true;
        } else {
            Intent intent = activity.getIntent();
            v = intent != null ? w1a.v(intent, xcVar2) : false;
        }
        return v;
    }

    public final boolean b(Intent intent) {
        return w1a.v(intent, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gd) {
            return this.a.equals(((gd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ActivityFilter(componentName=" + this.a + ", intentAction=null)";
    }
}
