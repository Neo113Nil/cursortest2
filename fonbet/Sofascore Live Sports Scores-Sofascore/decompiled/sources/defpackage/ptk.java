package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ptk extends rtk {
    public static ptk c;
    public static final fff d = new fff(5);
    public final Application b;

    public ptk(Application application) {
        this.b = application;
    }

    @Override // defpackage.rtk, defpackage.qtk
    public final ltk a(Class cls, qzc qzcVar) {
        if (this.b != null) {
            return b(cls);
        }
        Application application = (Application) qzcVar.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!d50.class.isAssignableFrom(cls)) {
            return vha.o(cls);
        }
        a70.p("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // defpackage.rtk, defpackage.qtk
    public final ltk b(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        a70.m("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final ltk d(Class cls, Application application) {
        if (!d50.class.isAssignableFrom(cls)) {
            return vha.o(cls);
        }
        try {
            ltk ltkVar = (ltk) cls.getConstructor(Application.class).newInstance(application);
            ltkVar.getClass();
            return ltkVar;
        } catch (IllegalAccessException e) {
            vp2.e(ljg.l(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            vp2.e(ljg.l(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            vp2.e(ljg.l(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            vp2.e(ljg.l(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }
}
