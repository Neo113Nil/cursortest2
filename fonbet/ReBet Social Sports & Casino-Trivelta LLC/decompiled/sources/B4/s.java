package B4;

import B4.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class s implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f775a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f776b;

    public s(Resources resources, n nVar) {
        this.f776b = resources;
        this.f775a = nVar;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, com.bumptech.glide.load.j jVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f775a.b(d10, i10, i11, jVar);
    }

    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f776b.getResourcePackageName(num.intValue()) + '/' + this.f776b.getResourceTypeName(num.intValue()) + '/' + this.f776b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // B4.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f777a;

        public a(Resources resources) {
            this.f777a = resources;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new s(this.f777a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f778a;

        public b(Resources resources) {
            this.f778a = resources;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new s(this.f778a, rVar.d(Uri.class, InputStream.class));
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class c implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f779a;

        public c(Resources resources) {
            this.f779a = resources;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new s(this.f779a, w.c());
        }

        @Override // B4.o
        public void d() {
        }
    }
}
