package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rum {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final Bitmap e;

    public rum(@NotNull String str, int i, long j, @Nullable String str2, @Nullable Bitmap bitmap) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
        this.e = bitmap;
    }

    public static rum copy$default(rum rumVar, String str, int i, long j, String str2, Bitmap bitmap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rumVar.a;
        }
        if ((i2 & 2) != 0) {
            i = rumVar.b;
        }
        if ((i2 & 4) != 0) {
            j = rumVar.c;
        }
        if ((i2 & 8) != 0) {
            str2 = rumVar.d;
        }
        if ((i2 & 16) != 0) {
            bitmap = rumVar.e;
        }
        rumVar.getClass();
        str.getClass();
        String str3 = str2;
        long j2 = j;
        return new rum(str, i, j2, str3, bitmap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rum)) {
            return false;
        }
        rum rumVar = (rum) obj;
        return Intrinsics.c(this.a, rumVar.a) && this.b == rumVar.b && this.c == rumVar.c && Intrinsics.c(this.d, rumVar.d) && Intrinsics.c(this.e, rumVar.e);
    }

    public final int hashCode() {
        int c = ljg.c(l4a.e(this.b, this.a.hashCode() * 31), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.e;
        return hashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "MediaViewingRecord(lastViewedItemId=" + this.a + ", lastViewedItemIndex=" + this.b + ", lastViewedItemPlayingPosition=" + this.c + ", previewImageUrl=" + this.d + ", lastSnapshotOfLastViewedItemBitmap=" + this.e + ')';
    }
}
