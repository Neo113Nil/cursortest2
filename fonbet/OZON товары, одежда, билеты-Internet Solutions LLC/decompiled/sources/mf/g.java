package mf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes10.dex */
public final class g {
    public static void a(@NotNull C9681g.a cursor, @NotNull byte[] key) {
        long j11;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i11 = 0;
        do {
            byte[] bArr = cursor.f98714e;
            int i12 = cursor.f98715f;
            int i13 = cursor.f98716g;
            if (bArr != null) {
                while (i12 < i13) {
                    int i14 = i11 % length;
                    bArr[i12] = (byte) (bArr[i12] ^ key[i14]);
                    i12++;
                    i11 = i14 + 1;
                }
            }
            long j12 = cursor.f98713d;
            C9681g c9681g = cursor.f98710a;
            Intrinsics.f(c9681g);
            if (j12 == c9681g.size()) {
                throw new IllegalStateException("no more bytes");
            }
            j11 = cursor.f98713d;
        } while (cursor.d(j11 == -1 ? 0L : j11 + (cursor.f98716g - cursor.f98715f)) != -1);
    }
}
