package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f51798a;

    /* renamed from: b, reason: collision with root package name */
    public int f51799b;

    /* renamed from: c, reason: collision with root package name */
    public int f51800c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51801d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51802e;

    /* renamed from: f, reason: collision with root package name */
    public final String f51803f;

    public a(File file, int i10, int i11, int i12, int i13, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f51798a = file;
        this.f51799b = i10;
        this.f51800c = i11;
        this.f51801d = i12;
        this.f51802e = i13;
        this.f51803f = mimeType;
    }

    public final int a() {
        return this.f51802e;
    }

    public final File b() {
        return this.f51798a;
    }

    public final int c() {
        return this.f51801d;
    }

    public final String d() {
        return this.f51803f;
    }

    public final int e() {
        return this.f51800c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f51798a, aVar.f51798a) && this.f51799b == aVar.f51799b && this.f51800c == aVar.f51800c && this.f51801d == aVar.f51801d && this.f51802e == aVar.f51802e && Intrinsics.areEqual(this.f51803f, aVar.f51803f);
    }

    public final int f() {
        return this.f51799b;
    }

    public int hashCode() {
        return (((((((((this.f51798a.hashCode() * 31) + Integer.hashCode(this.f51799b)) * 31) + Integer.hashCode(this.f51800c)) * 31) + Integer.hashCode(this.f51801d)) * 31) + Integer.hashCode(this.f51802e)) * 31) + this.f51803f.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f51798a + ", recordingWidth=" + this.f51799b + ", recordingHeight=" + this.f51800c + ", frameRate=" + this.f51801d + ", bitRate=" + this.f51802e + ", mimeType=" + this.f51803f + ')';
    }

    public /* synthetic */ a(File file, int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i10, i11, i12, i13, (i14 & 32) != 0 ? "video/avc" : str);
    }
}
