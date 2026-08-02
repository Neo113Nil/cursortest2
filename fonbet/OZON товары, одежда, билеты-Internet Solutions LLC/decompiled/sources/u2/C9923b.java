package u2;

import K1.G;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9923b {
    @NotNull
    public static final File a(@NotNull Uri uri) {
        if (!Intrinsics.d(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(G.b(uri, "Uri lacks 'file' scheme: ").toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(G.b(uri, "Uri path is null: ").toString());
    }
}
