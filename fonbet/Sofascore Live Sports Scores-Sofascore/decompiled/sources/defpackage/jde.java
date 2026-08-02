package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class jde {
    public static final bw9 a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    static {
        Object obj;
        Class<?> cls;
        bw9 bw9Var;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                bw9Var = (bw9) cls.asSubclass(bw9.class).getConstructor(dti.class).newInstance(bw9.a);
            } catch (Throwable th2) {
                obj = th2;
            }
            if (bw9Var == null) {
                a = bw9Var;
            } else {
                a = new bw9();
            }
            if (obj == null) {
                try {
                    if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                        Class<?> cls2 = Class.forName("java.util.logging.Logger");
                        Object invoke = cls2.getMethod("getLogger", String.class).invoke(null, jde.class.getName());
                        Class<?> cls3 = Class.forName("java.util.logging.Level");
                        cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        bw9Var = null;
        if (bw9Var == null) {
        }
        if (obj == null) {
        }
    }

    public static void a() {
        a.getClass();
    }

    public static void b() {
        a.getClass();
    }

    public static void c() {
        a.getClass();
    }
}
