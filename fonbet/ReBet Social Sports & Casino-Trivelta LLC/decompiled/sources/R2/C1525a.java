package R2;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1525a f9980a = new C1525a();

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
