package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* compiled from: LoadingInfo.java */
/* loaded from: classes12.dex */
public final class f {
    public final long a;
    public final float b;
    public final long c;

    /* compiled from: LoadingInfo.java */
    public static final class a {
        public long a = C.TIME_UNSET;
        public float b = -3.4028235E38f;
        public long c = C.TIME_UNSET;
    }

    public f(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
