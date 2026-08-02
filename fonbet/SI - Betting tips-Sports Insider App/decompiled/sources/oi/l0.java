package oi;

import android.os.Build;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e6.r f21276a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f21277b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f21278c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f21276a = null;
            f21277b = new a(7);
            f21278c = new a(6);
        } else {
            if (!property.equals("Dalvik")) {
                f21276a = null;
                f21277b = new n0(7);
                f21278c = new c(6);
                return;
            }
            f21276a = new e6.r();
            if (Build.VERSION.SDK_INT >= 24) {
                f21277b = new m0(7);
                f21278c = new c(6);
            } else {
                f21277b = new a(7);
                f21278c = new a(6);
            }
        }
    }
}
