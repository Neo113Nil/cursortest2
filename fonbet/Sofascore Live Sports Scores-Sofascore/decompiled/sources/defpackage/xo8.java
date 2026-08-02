package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xo8 {
    public static final fhh b = new fhh(0);
    public final /* synthetic */ s a;

    public xo8(s sVar) {
        this.a = sVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        fhh fhhVar = b;
        fhh fhhVar2 = (fhh) fhhVar.get(classLoader);
        if (fhhVar2 == null) {
            fhhVar2 = new fhh(0);
            fhhVar.put(classLoader, fhhVar2);
        }
        Class cls = (Class) fhhVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        fhhVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new fb3(6, lnb.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), (Throwable) e);
        } catch (ClassNotFoundException e2) {
            throw new fb3(6, lnb.o("Unable to instantiate fragment ", str, ": make sure class name exists"), (Throwable) e2);
        }
    }

    public final Fragment a(String str) {
        return Fragment.instantiate(this.a.x.b, str, null);
    }
}
