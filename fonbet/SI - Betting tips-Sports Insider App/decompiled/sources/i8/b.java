package i8;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f11001g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f11002h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f11003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11004b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11005c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f11006d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11007e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11008f;

    public b(String str, String str2, String str3, Date date, long j, long j6) {
        this.f11003a = str;
        this.f11004b = str2;
        this.f11005c = str3;
        this.f11006d = date;
        this.f11007e = j;
        this.f11008f = j6;
    }

    public final l8.a a() {
        l8.a aVar = new l8.a();
        aVar.f19394a = "frc";
        aVar.f19405m = this.f11006d.getTime();
        aVar.f19395b = this.f11003a;
        aVar.f19396c = this.f11004b;
        String str = this.f11005c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f19397d = str;
        aVar.f19398e = this.f11007e;
        aVar.j = this.f11008f;
        return aVar;
    }
}
