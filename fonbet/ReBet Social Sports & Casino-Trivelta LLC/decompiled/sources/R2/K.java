package R2;

import Q2.AbstractC1508t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class K {

    @NotNull
    private static final String[] DATABASE_EXTRA_FILES;

    /* renamed from: a, reason: collision with root package name */
    public static final String f9954a;

    static {
        String i10 = AbstractC1508t.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WrkDbPathHelper\")");
        f9954a = i10;
        DATABASE_EXTRA_FILES = new String[]{"-journal", "-shm", "-wal"};
    }
}
