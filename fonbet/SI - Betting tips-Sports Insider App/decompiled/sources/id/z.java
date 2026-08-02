package id;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ChronoUnit f11232a = ChronoUnit.DAYS;

    public static int a() {
        int b10;
        int i5;
        long epochSecond = LocalDateTime.now().truncatedTo(f11232a).toEpochSecond(ZoneOffset.UTC);
        int i10 = (int) epochSecond;
        int i11 = (int) (epochSecond >> 32);
        int i12 = ~i10;
        int i13 = (i10 << 10) ^ (i11 >>> 4);
        xf.g gVar = new xf.g();
        gVar.f25468c = i10;
        gVar.f25469d = i11;
        gVar.f25470e = 0;
        gVar.f25471f = 0;
        gVar.f25472g = i12;
        gVar.f25473h = i13;
        gVar.a();
        for (int i14 = 0; i14 < 64; i14++) {
            gVar.b();
        }
        do {
            b10 = gVar.b() >>> 1;
            i5 = b10 % 15;
        } while ((b10 - i5) + 14 < 0);
        return 35 + i5;
    }
}
