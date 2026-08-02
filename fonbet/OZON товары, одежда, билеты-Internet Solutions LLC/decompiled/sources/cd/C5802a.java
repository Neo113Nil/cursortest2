package cd;

import java.nio.file.Path;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: cd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5802a extends C5805d {
    @NotNull
    public static String a(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }
}
