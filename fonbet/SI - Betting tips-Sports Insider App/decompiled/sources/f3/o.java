package f3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9403a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9404b;

    static {
        String g10 = e3.x.g("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f9403a = g10;
        f9404b = TimeUnit.HOURS.toMillis(1L);
    }
}
