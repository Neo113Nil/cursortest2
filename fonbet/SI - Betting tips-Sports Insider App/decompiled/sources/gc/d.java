package gc;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f9945a = "default";

    /* renamed from: b, reason: collision with root package name */
    public static volatile Locale f9946b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile String f9947c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile String f9948d;

    static {
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        f9946b = ROOT;
        f9948d = "default";
    }
}
