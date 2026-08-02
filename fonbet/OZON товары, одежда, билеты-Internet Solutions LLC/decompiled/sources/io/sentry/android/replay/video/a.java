package io.sentry.android.replay.video;

import B0.C2454a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseRequiresApi"})
@TargetApi(24)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f67689a;

    /* renamed from: b, reason: collision with root package name */
    private int f67690b;

    /* renamed from: c, reason: collision with root package name */
    private int f67691c;

    /* renamed from: d, reason: collision with root package name */
    private final int f67692d;

    /* renamed from: e, reason: collision with root package name */
    private final int f67693e;

    public a(File file, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter("video/avc", "mimeType");
        this.f67689a = file;
        this.f67690b = i11;
        this.f67691c = i12;
        this.f67692d = i13;
        this.f67693e = i14;
    }

    public final int a() {
        return this.f67693e;
    }

    @NotNull
    public final File b() {
        return this.f67689a;
    }

    public final int c() {
        return this.f67692d;
    }

    public final int d() {
        return this.f67691c;
    }

    public final int e() {
        return this.f67690b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67689a.equals(aVar.f67689a) && this.f67690b == aVar.f67690b && this.f67691c == aVar.f67691c && this.f67692d == aVar.f67692d && this.f67693e == aVar.f67693e;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.f67693e) + C2454a.a(this.f67692d, C2454a.a(this.f67691c, C2454a.a(this.f67690b, this.f67689a.hashCode() * 31, 31), 31), 31)) * 31) + 1331836730;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MuxerConfig(file=");
        sb2.append(this.f67689a);
        sb2.append(", recordingWidth=");
        sb2.append(this.f67690b);
        sb2.append(", recordingHeight=");
        sb2.append(this.f67691c);
        sb2.append(", frameRate=");
        sb2.append(this.f67692d);
        sb2.append(", bitRate=");
        return K00.b.e(this.f67693e, ", mimeType=video/avc)", sb2);
    }
}
