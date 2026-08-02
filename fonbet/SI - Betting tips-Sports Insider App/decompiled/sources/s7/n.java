package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f22890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22891b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22892c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22893d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22894e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22895f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22896g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f22897h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f22898i;
    public final Long j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f22899k;

    public n(String str, String str2, long j, long j6, long j10, long j11, long j12, Long l6, Long l10, Long l11, Boolean bool) {
        g6.v.e(str);
        g6.v.e(str2);
        g6.v.b(j >= 0);
        g6.v.b(j6 >= 0);
        g6.v.b(j10 >= 0);
        g6.v.b(j12 >= 0);
        this.f22890a = str;
        this.f22891b = str2;
        this.f22892c = j;
        this.f22893d = j6;
        this.f22894e = j10;
        this.f22895f = j11;
        this.f22896g = j12;
        this.f22897h = l6;
        this.f22898i = l10;
        this.j = l11;
        this.f22899k = bool;
    }

    public final n a(long j) {
        return new n(this.f22890a, this.f22891b, this.f22892c, this.f22893d, this.f22894e, j, this.f22896g, this.f22897h, this.f22898i, this.j, this.f22899k);
    }

    public final n b(Long l6, Long l10, Boolean bool) {
        return new n(this.f22890a, this.f22891b, this.f22892c, this.f22893d, this.f22894e, this.f22895f, this.f22896g, this.f22897h, l6, l10, bool);
    }
}
