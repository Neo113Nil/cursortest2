package b9;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f3116b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3117c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f3118d;

    /* renamed from: a, reason: collision with root package name */
    public final y8.d f3119a;

    public k(y8.d dVar) {
        this.f3119a = dVar;
    }

    public final boolean a(c9.b bVar) {
        if (TextUtils.isEmpty(bVar.f3709c)) {
            return true;
        }
        long j = bVar.f3712f + bVar.f3711e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3119a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f3116b;
    }
}
