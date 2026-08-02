package og;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: og.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5894f {
    public static final boolean a(File file, String newName) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(newName, "newName");
        return file.renameTo(new File(file.getParent(), newName));
    }
}
