package io.sentry.android.replay;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f16137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16138b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16139c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16140d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16142f;

    public v(int i5, int i10, float f6, float f10, int i11, int i12) {
        this.f16137a = i5;
        this.f16138b = i10;
        this.f16139c = f6;
        this.f16140d = f10;
        this.f16141e = i11;
        this.f16142f = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f16137a == vVar.f16137a && this.f16138b == vVar.f16138b && Float.compare(this.f16139c, vVar.f16139c) == 0 && Float.compare(this.f16140d, vVar.f16140d) == 0 && this.f16141e == vVar.f16141e && this.f16142f == vVar.f16142f;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f16140d) + ((Float.floatToIntBits(this.f16139c) + (((this.f16137a * 31) + this.f16138b) * 31)) * 31)) * 31) + this.f16141e) * 31) + this.f16142f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb2.append(this.f16137a);
        sb2.append(", recordingHeight=");
        sb2.append(this.f16138b);
        sb2.append(", scaleFactorX=");
        sb2.append(this.f16139c);
        sb2.append(", scaleFactorY=");
        sb2.append(this.f16140d);
        sb2.append(", frameRate=");
        sb2.append(this.f16141e);
        sb2.append(", bitRate=");
        return d9.e.i(sb2, this.f16142f, ')');
    }
}
