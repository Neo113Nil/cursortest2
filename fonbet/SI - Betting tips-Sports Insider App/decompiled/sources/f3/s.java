package f3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9417a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f9418b;

    static {
        String g10 = e3.x.g("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f9417a = g10;
        f9418b = new String[]{"-journal", "-shm", "-wal"};
    }
}
