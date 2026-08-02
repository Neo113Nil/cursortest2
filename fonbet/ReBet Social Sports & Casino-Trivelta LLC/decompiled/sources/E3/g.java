package E3;

import com.airbnb.lottie.C2940j;
import z.j;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f2993b = new g();

    /* renamed from: a, reason: collision with root package name */
    public final j f2994a = new j(20);

    public static g b() {
        return f2993b;
    }

    public C2940j a(String str) {
        if (str == null) {
            return null;
        }
        return (C2940j) this.f2994a.get(str);
    }

    public void c(String str, C2940j c2940j) {
        if (str == null) {
            return;
        }
        this.f2994a.put(str, c2940j);
    }
}
