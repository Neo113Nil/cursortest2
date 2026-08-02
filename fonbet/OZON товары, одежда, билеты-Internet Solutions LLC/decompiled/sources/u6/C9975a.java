package u6;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9975a {

    /* renamed from: a, reason: collision with root package name */
    private final String f100341a;

    /* renamed from: b, reason: collision with root package name */
    private final String f100342b;

    /* renamed from: c, reason: collision with root package name */
    private final String f100343c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC9976b f100344d;

    public C9975a(String str, String str2, String str3, EnumC9976b enumC9976b) {
        this.f100341a = str;
        this.f100342b = str2;
        this.f100343c = str3;
        this.f100344d = enumC9976b;
    }

    public final String a() {
        return this.f100343c;
    }

    public final String b() {
        return this.f100342b;
    }

    public final String c() {
        return this.f100341a;
    }

    public final EnumC9976b d() {
        return this.f100344d;
    }

    public final String toString() {
        return "Card{mReferenceId='" + this.f100341a + "', mMaskedPan='" + this.f100342b + "', mExpiryDate='" + this.f100343c + "', mState=" + this.f100344d + '}';
    }
}
