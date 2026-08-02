package d0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import d0.AbstractC5990a;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5992c extends AbstractC5990a {

    /* renamed from: a, reason: collision with root package name */
    private final String f60875a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60876b;

    /* renamed from: c, reason: collision with root package name */
    private final Y0 f60877c;

    /* renamed from: d, reason: collision with root package name */
    private final int f60878d;

    /* renamed from: e, reason: collision with root package name */
    private final int f60879e;

    /* renamed from: f, reason: collision with root package name */
    private final int f60880f;

    /* renamed from: d0.c$a */
    static final class a extends AbstractC5990a.AbstractC0936a {

        /* renamed from: a, reason: collision with root package name */
        private String f60881a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f60882b;

        /* renamed from: c, reason: collision with root package name */
        private Y0 f60883c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f60884d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f60885e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f60886f;

        @Override // d0.AbstractC5990a.AbstractC0936a
        final AbstractC5990a a() {
            String str = this.f60881a == null ? " mimeType" : "";
            if (this.f60882b == null) {
                str = str.concat(" profile");
            }
            if (this.f60883c == null) {
                str = U7.d.e(str, " inputTimebase");
            }
            if (this.f60884d == null) {
                str = U7.d.e(str, " bitrate");
            }
            if (this.f60885e == null) {
                str = U7.d.e(str, " sampleRate");
            }
            if (this.f60886f == null) {
                str = U7.d.e(str, " channelCount");
            }
            if (str.isEmpty()) {
                return new C5992c(this.f60881a, this.f60882b.intValue(), this.f60883c, this.f60884d.intValue(), this.f60885e.intValue(), this.f60886f.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // d0.AbstractC5990a.AbstractC0936a
        public final AbstractC5990a.AbstractC0936a c(int i11) {
            this.f60884d = Integer.valueOf(i11);
            return this;
        }

        @Override // d0.AbstractC5990a.AbstractC0936a
        public final AbstractC5990a.AbstractC0936a d(int i11) {
            this.f60886f = Integer.valueOf(i11);
            return this;
        }

        @Override // d0.AbstractC5990a.AbstractC0936a
        public final AbstractC5990a.AbstractC0936a e(Y0 y02) {
            if (y02 == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f60883c = y02;
            return this;
        }

        @Override // d0.AbstractC5990a.AbstractC0936a
        public final AbstractC5990a.AbstractC0936a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f60881a = str;
            return this;
        }

        @Override // d0.AbstractC5990a.AbstractC0936a
        public final AbstractC5990a.AbstractC0936a g(int i11) {
            this.f60882b = Integer.valueOf(i11);
            return this;
        }

        @Override // d0.AbstractC5990a.AbstractC0936a
        public final AbstractC5990a.AbstractC0936a h(int i11) {
            this.f60885e = Integer.valueOf(i11);
            return this;
        }
    }

    C5992c(String str, int i11, Y0 y02, int i12, int i13, int i14) {
        this.f60875a = str;
        this.f60876b = i11;
        this.f60877c = y02;
        this.f60878d = i12;
        this.f60879e = i13;
        this.f60880f = i14;
    }

    @Override // d0.InterfaceC6001l
    @NonNull
    public final String a() {
        return this.f60875a;
    }

    @Override // d0.InterfaceC6001l
    @NonNull
    public final Y0 b() {
        return this.f60877c;
    }

    @Override // d0.AbstractC5990a
    public final int e() {
        return this.f60878d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5990a)) {
            return false;
        }
        AbstractC5990a abstractC5990a = (AbstractC5990a) obj;
        if (this.f60875a.equals(((C5992c) abstractC5990a).f60875a)) {
            return this.f60876b == abstractC5990a.g() && this.f60877c.equals(((C5992c) abstractC5990a).f60877c) && this.f60878d == abstractC5990a.e() && this.f60879e == abstractC5990a.h() && this.f60880f == abstractC5990a.f();
        }
        return false;
    }

    @Override // d0.AbstractC5990a
    public final int f() {
        return this.f60880f;
    }

    @Override // d0.AbstractC5990a
    public final int g() {
        return this.f60876b;
    }

    @Override // d0.AbstractC5990a
    public final int h() {
        return this.f60879e;
    }

    public final int hashCode() {
        return ((((((((((this.f60875a.hashCode() ^ 1000003) * 1000003) ^ this.f60876b) * 1000003) ^ this.f60877c.hashCode()) * 1000003) ^ this.f60878d) * 1000003) ^ this.f60879e) * 1000003) ^ this.f60880f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb2.append(this.f60875a);
        sb2.append(", profile=");
        sb2.append(this.f60876b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f60877c);
        sb2.append(", bitrate=");
        sb2.append(this.f60878d);
        sb2.append(", sampleRate=");
        sb2.append(this.f60879e);
        sb2.append(", channelCount=");
        return K00.b.e(this.f60880f, "}", sb2);
    }
}
