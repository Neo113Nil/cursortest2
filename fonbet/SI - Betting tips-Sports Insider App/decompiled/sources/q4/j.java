package q4;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final c4.k f21999a = new c4.k(u4.a.f24049a);

    /* renamed from: b, reason: collision with root package name */
    public static final c4.k f22000b = new c4.k(v4.r.f24432b);

    /* renamed from: c, reason: collision with root package name */
    public static final c4.k f22001c = new c4.k(null);

    /* renamed from: d, reason: collision with root package name */
    public static final c4.k f22002d;

    /* renamed from: e, reason: collision with root package name */
    public static final c4.k f22003e;

    /* renamed from: f, reason: collision with root package name */
    public static final c4.k f22004f;

    /* renamed from: g, reason: collision with root package name */
    public static final c4.k f22005g;

    static {
        Boolean bool = Boolean.TRUE;
        f22002d = new c4.k(bool);
        f22003e = new c4.k(null);
        f22004f = new c4.k(bool);
        f22005g = new c4.k(Boolean.FALSE);
    }

    public static final Bitmap.Config a(n nVar) {
        return (Bitmap.Config) c4.p.f(nVar, f22000b);
    }

    public static final ColorSpace b(n nVar) {
        return com.google.firebase.messaging.k.g(c4.p.f(nVar, f22001c));
    }

    public static final void c(e eVar, int i5) {
        eVar.f21947k = new eb.b(i5, 10);
    }

    public static final void d(e eVar, ImageView imageView) {
        eVar.f21941d = new s4.a(imageView);
    }
}
