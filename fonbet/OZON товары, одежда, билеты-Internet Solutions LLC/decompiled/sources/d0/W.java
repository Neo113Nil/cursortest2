package d0;

import android.media.MediaFormat;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import com.google.android.gms.common.Scopes;
import d0.C5993d;

/* loaded from: classes8.dex */
public abstract class W implements InterfaceC6001l {

    public static abstract class a {
        @NonNull
        public abstract W a();

        @NonNull
        public abstract a b(int i11);

        @NonNull
        public abstract a c(@NonNull X x11);

        @NonNull
        public abstract a d(int i11);

        @NonNull
        public abstract a e(@NonNull Y0 y02);

        @NonNull
        public abstract a f(@NonNull String str);

        @NonNull
        public abstract a g(int i11);

        @NonNull
        public abstract a h(@NonNull Size size);
    }

    W() {
    }

    @NonNull
    public static a d() {
        C5993d.a aVar = new C5993d.a();
        aVar.g(-1);
        aVar.j();
        aVar.i();
        aVar.c(X.f60869a);
        return aVar;
    }

    @Override // d0.InterfaceC6001l
    @NonNull
    public final MediaFormat c() {
        Size k11 = k();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(((C5993d) this).a(), k11.getWidth(), k11.getHeight());
        createVideoFormat.setInteger("color-format", f());
        createVideoFormat.setInteger("bitrate", e());
        createVideoFormat.setInteger("frame-rate", h());
        createVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            createVideoFormat.setInteger(Scopes.PROFILE, j());
        }
        X g10 = g();
        if (g10.b() != 0) {
            createVideoFormat.setInteger("color-standard", g10.b());
        }
        if (g10.c() != 0) {
            createVideoFormat.setInteger("color-transfer", g10.c());
        }
        if (g10.a() != 0) {
            createVideoFormat.setInteger("color-range", g10.a());
        }
        return createVideoFormat;
    }

    public abstract int e();

    public abstract int f();

    @NonNull
    public abstract X g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    @NonNull
    public abstract Size k();
}
