package t2;

import b1.AbstractC2335D;
import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65178a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65179b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65181d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f65182a;

        /* renamed from: b, reason: collision with root package name */
        public String f65183b;

        /* renamed from: c, reason: collision with root package name */
        public String f65184c;

        /* renamed from: d, reason: collision with root package name */
        public int f65185d;

        public V0 a() {
            return new V0(this.f65182a, this.f65183b, this.f65184c, this.f65185d);
        }

        public b b(String str) {
            String u10 = AbstractC2335D.u(str);
            AbstractC4134a.b(u10 == null || AbstractC2335D.o(u10), "Not an audio MIME type: " + u10);
            this.f65183b = u10;
            return this;
        }

        public b c(int i10) {
            this.f65185d = i10;
            return this;
        }

        public b d(int i10) {
            this.f65182a = i10;
            return this;
        }

        public b e(String str) {
            String u10 = AbstractC2335D.u(str);
            AbstractC4134a.b(u10 == null || AbstractC2335D.t(u10), "Not a video MIME type: " + u10);
            this.f65184c = u10;
            return this;
        }

        public b() {
            this.f65182a = -1;
        }

        public b(V0 v02) {
            this.f65182a = v02.f65178a;
            this.f65183b = v02.f65179b;
            this.f65184c = v02.f65180c;
            this.f65185d = v02.f65181d;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return this.f65178a == v02.f65178a && Objects.equals(this.f65179b, v02.f65179b) && Objects.equals(this.f65180c, v02.f65180c) && this.f65181d == v02.f65181d;
    }

    public int hashCode() {
        int i10 = this.f65178a * 31;
        String str = this.f65179b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65180c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f65181d;
    }

    public String toString() {
        return "TransformationRequest{outputHeight=" + this.f65178a + ", audioMimeType='" + this.f65179b + "', videoMimeType='" + this.f65180c + "', hdrMode=" + this.f65181d + '}';
    }

    public V0(int i10, String str, String str2, int i11) {
        this.f65178a = i10;
        this.f65179b = str;
        this.f65180c = str2;
        this.f65181d = i11;
    }
}
