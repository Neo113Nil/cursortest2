package R2;

import Q2.AbstractC1508t;
import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f9953a = new J();

    public static final void d(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        J j10 = f9953a;
        if (j10.b(context).exists()) {
            AbstractC1508t e10 = AbstractC1508t.e();
            str = K.f9954a;
            e10.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : j10.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        AbstractC1508t e11 = AbstractC1508t.e();
                        str3 = K.f9954a;
                        e11.k(str3, "Over-writing contents of " + file2);
                    }
                    String str4 = file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed";
                    AbstractC1508t e12 = AbstractC1508t.e();
                    str2 = K.f9954a;
                    e12.a(str2, str4);
                }
            }
        }
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final File c(Context context) {
        return new File(C1525a.f9980a.a(context), "androidx.work.workdb");
    }

    public final Map e(Context context) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        File b10 = b(context);
        File a10 = a(context);
        strArr = K.DATABASE_EXTRA_FILES;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pair = TuplesKt.to(new File(b10.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.to(b10, a10));
    }
}
