package androidx.media3.transformer;

import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.vu5;

/* compiled from: TransformationRequest.java */
/* loaded from: classes12.dex */
public final class z {
    public final int a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;
    public final int d;

    /* compiled from: TransformationRequest.java */
    public static final class a {
        public int a;

        @Nullable
        public String b;

        @Nullable
        public String c;
        public int d;

        public final z a() {
            return new z(this.a, this.d, this.b, this.c);
        }
    }

    public z(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && Objects.equals(this.b, zVar.b) && Objects.equals(this.c, zVar.c) && this.d == zVar.d;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return vu5.b(sb, this.d, '}');
    }
}
