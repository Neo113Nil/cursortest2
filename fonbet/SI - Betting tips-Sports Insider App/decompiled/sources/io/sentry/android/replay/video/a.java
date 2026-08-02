package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f16143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16147e;

    public a(File file, int i5, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter("video/avc", "mimeType");
        this.f16143a = file;
        this.f16144b = i5;
        this.f16145c = i10;
        this.f16146d = i11;
        this.f16147e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f16143a, aVar.f16143a) && this.f16144b == aVar.f16144b && this.f16145c == aVar.f16145c && this.f16146d == aVar.f16146d && this.f16147e == aVar.f16147e && Intrinsics.areEqual("video/avc", "video/avc");
    }

    public final int hashCode() {
        return (((((((((this.f16143a.hashCode() * 31) + this.f16144b) * 31) + this.f16145c) * 31) + this.f16146d) * 31) + this.f16147e) * 31) + 1331836730;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MuxerConfig(file=");
        sb2.append(this.f16143a);
        sb2.append(", recordingWidth=");
        sb2.append(this.f16144b);
        sb2.append(", recordingHeight=");
        sb2.append(this.f16145c);
        sb2.append(", frameRate=");
        sb2.append(this.f16146d);
        sb2.append(", bitRate=");
        return k.n(sb2, this.f16147e, ", mimeType=video/avc)");
    }
}
