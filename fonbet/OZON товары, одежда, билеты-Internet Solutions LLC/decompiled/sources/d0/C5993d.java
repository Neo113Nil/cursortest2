package d0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import d0.W;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5993d extends W {

    /* renamed from: a, reason: collision with root package name */
    private final String f60887a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60888b;

    /* renamed from: c, reason: collision with root package name */
    private final Y0 f60889c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f60890d;

    /* renamed from: e, reason: collision with root package name */
    private final int f60891e;

    /* renamed from: f, reason: collision with root package name */
    private final X f60892f;

    /* renamed from: g, reason: collision with root package name */
    private final int f60893g;

    /* renamed from: h, reason: collision with root package name */
    private final int f60894h;

    /* renamed from: i, reason: collision with root package name */
    private final int f60895i;

    /* renamed from: d0.d$a */
    static final class a extends W.a {

        /* renamed from: a, reason: collision with root package name */
        private String f60896a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f60897b;

        /* renamed from: c, reason: collision with root package name */
        private Y0 f60898c;

        /* renamed from: d, reason: collision with root package name */
        private Size f60899d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f60900e;

        /* renamed from: f, reason: collision with root package name */
        private X f60901f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f60902g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f60903h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f60904i;

        @Override // d0.W.a
        public final W a() {
            String str = this.f60896a == null ? " mimeType" : "";
            if (this.f60897b == null) {
                str = str.concat(" profile");
            }
            if (this.f60898c == null) {
                str = U7.d.e(str, " inputTimebase");
            }
            if (this.f60899d == null) {
                str = U7.d.e(str, " resolution");
            }
            if (this.f60900e == null) {
                str = U7.d.e(str, " colorFormat");
            }
            if (this.f60901f == null) {
                str = U7.d.e(str, " dataSpace");
            }
            if (this.f60902g == null) {
                str = U7.d.e(str, " frameRate");
            }
            if (this.f60903h == null) {
                str = U7.d.e(str, " IFrameInterval");
            }
            if (this.f60904i == null) {
                str = U7.d.e(str, " bitrate");
            }
            if (str.isEmpty()) {
                return new C5993d(this.f60896a, this.f60897b.intValue(), this.f60898c, this.f60899d, this.f60900e.intValue(), this.f60901f, this.f60902g.intValue(), this.f60903h.intValue(), this.f60904i.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // d0.W.a
        public final W.a b(int i11) {
            this.f60904i = Integer.valueOf(i11);
            return this;
        }

        @Override // d0.W.a
        public final W.a c(X x11) {
            if (x11 == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f60901f = x11;
            return this;
        }

        @Override // d0.W.a
        public final W.a d(int i11) {
            this.f60902g = Integer.valueOf(i11);
            return this;
        }

        @Override // d0.W.a
        public final W.a e(Y0 y02) {
            if (y02 == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f60898c = y02;
            return this;
        }

        @Override // d0.W.a
        public final W.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f60896a = str;
            return this;
        }

        @Override // d0.W.a
        public final W.a g(int i11) {
            this.f60897b = Integer.valueOf(i11);
            return this;
        }

        @Override // d0.W.a
        public final W.a h(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f60899d = size;
            return this;
        }

        public final W.a i() {
            this.f60900e = 2130708361;
            return this;
        }

        public final W.a j() {
            this.f60903h = 1;
            return this;
        }
    }

    C5993d(String str, int i11, Y0 y02, Size size, int i12, X x11, int i13, int i14, int i15) {
        this.f60887a = str;
        this.f60888b = i11;
        this.f60889c = y02;
        this.f60890d = size;
        this.f60891e = i12;
        this.f60892f = x11;
        this.f60893g = i13;
        this.f60894h = i14;
        this.f60895i = i15;
    }

    @Override // d0.InterfaceC6001l
    @NonNull
    public final String a() {
        return this.f60887a;
    }

    @Override // d0.InterfaceC6001l
    @NonNull
    public final Y0 b() {
        return this.f60889c;
    }

    @Override // d0.W
    public final int e() {
        return this.f60895i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w11 = (W) obj;
        if (this.f60887a.equals(((C5993d) w11).f60887a)) {
            return this.f60888b == w11.j() && this.f60889c.equals(((C5993d) w11).f60889c) && this.f60890d.equals(w11.k()) && this.f60891e == w11.f() && this.f60892f.equals(w11.g()) && this.f60893g == w11.h() && this.f60894h == w11.i() && this.f60895i == w11.e();
        }
        return false;
    }

    @Override // d0.W
    public final int f() {
        return this.f60891e;
    }

    @Override // d0.W
    @NonNull
    public final X g() {
        return this.f60892f;
    }

    @Override // d0.W
    public final int h() {
        return this.f60893g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f60887a.hashCode() ^ 1000003) * 1000003) ^ this.f60888b) * 1000003) ^ this.f60889c.hashCode()) * 1000003) ^ this.f60890d.hashCode()) * 1000003) ^ this.f60891e) * 1000003) ^ this.f60892f.hashCode()) * 1000003) ^ this.f60893g) * 1000003) ^ this.f60894h) * 1000003) ^ this.f60895i;
    }

    @Override // d0.W
    public final int i() {
        return this.f60894h;
    }

    @Override // d0.W
    public final int j() {
        return this.f60888b;
    }

    @Override // d0.W
    @NonNull
    public final Size k() {
        return this.f60890d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb2.append(this.f60887a);
        sb2.append(", profile=");
        sb2.append(this.f60888b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f60889c);
        sb2.append(", resolution=");
        sb2.append(this.f60890d);
        sb2.append(", colorFormat=");
        sb2.append(this.f60891e);
        sb2.append(", dataSpace=");
        sb2.append(this.f60892f);
        sb2.append(", frameRate=");
        sb2.append(this.f60893g);
        sb2.append(", IFrameInterval=");
        sb2.append(this.f60894h);
        sb2.append(", bitrate=");
        return K00.b.e(this.f60895i, "}", sb2);
    }
}
