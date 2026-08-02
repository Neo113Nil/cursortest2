package s7;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public long f22878c;

    /* renamed from: d, reason: collision with root package name */
    public String f22879d;

    @Override // s7.l1
    public final boolean k() {
        Calendar calendar = Calendar.getInstance();
        this.f22878c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f22879d = d9.e.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long n() {
        l();
        return this.f22878c;
    }

    public final String o() {
        l();
        return this.f22879d;
    }
}
