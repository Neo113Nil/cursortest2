package defpackage;

import android.content.ComponentName;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xc {
    public final String a;
    public final String b;

    public xc(ComponentName componentName) {
        componentName.getClass();
        String packageName = componentName.getPackageName();
        packageName.getClass();
        String className = componentName.getClassName();
        className.getClass();
        packageName.getClass();
        className.getClass();
        this.a = packageName;
        this.b = className;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xc xcVar = (xc) obj;
        return this.a.equals(xcVar.a) && this.b.equals(xcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassInfo { packageName: ");
        sb.append(this.a);
        sb.append(", className: ");
        return mz1.o(sb, this.b, " }");
    }
}
