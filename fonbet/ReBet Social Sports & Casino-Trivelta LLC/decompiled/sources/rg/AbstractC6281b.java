package rg;

/* renamed from: rg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6281b {

    /* renamed from: rg.b$a */
    public enum a {
        NO_ENCRYPTION(0, "NO_ENC", 0, "NO"),
        DEFAULT_PAYLOAD_ENCRYPTION(1, "AES-RSA", 256, "GCM"),
        AES_DEFAULT(2, "AES", 256, "GCM");


        /* renamed from: a, reason: collision with root package name */
        public final int f64385a;

        /* renamed from: b, reason: collision with root package name */
        public final String f64386b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64387c;

        /* renamed from: d, reason: collision with root package name */
        public final String f64388d;

        a(int i10, String str, int i11, String str2) {
            this.f64385a = i10;
            this.f64386b = str;
            this.f64387c = i11;
            this.f64388d = str2;
        }

        public String b() {
            return this.f64388d;
        }

        public int c() {
            return this.f64385a;
        }

        public String getAlgorithm() {
            return this.f64386b;
        }
    }

    public static a a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? a.DEFAULT_PAYLOAD_ENCRYPTION : a.AES_DEFAULT : a.DEFAULT_PAYLOAD_ENCRYPTION : a.NO_ENCRYPTION;
    }
}
