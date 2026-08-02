package p5;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import kotlin.collections.C7714v;
import n5.C8441a;
import n5.EnumC8444d;
import n5.q;
import org.jetbrains.annotations.NotNull;
import p5.h;
import sf.z;
import v5.C10239m;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8856a implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f80212a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80213b;

    /* renamed from: p5.a$a, reason: collision with other inner class name */
    public static final class C1345a implements h.a<Uri> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            Uri uri = (Uri) obj;
            if (A5.k.f(uri)) {
                return new C8856a(uri, c10239m);
            }
            return null;
        }
    }

    public C8856a(@NotNull Uri uri, @NotNull C10239m c10239m) {
        this.f80212a = uri;
        this.f80213b = c10239m;
    }

    @Override // p5.h
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        String V11 = C7714v.V(C7714v.D(this.f80212a.getPathSegments(), 1), "/", null, null, null, 62);
        C10239m c10239m = this.f80213b;
        return new m(q.b(z.d(z.k(c10239m.f().getAssets().open(V11))), c10239m.f(), new C8441a()), A5.k.c(MimeTypeMap.getSingleton(), V11), EnumC8444d.DISK);
    }
}
