package com.google.android.play.core.appupdate;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f6018a;

    public n(int i5) {
        this.f6018a = i5;
    }

    public static m a(int i5) {
        m mVar = new m();
        mVar.f6016a = i5;
        mVar.f6017b = (byte) (((byte) (mVar.f6017b | 1)) | 2);
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f6018a == ((n) obj).f6018a;
    }

    public final int hashCode() {
        return ((this.f6018a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return d9.e.f(this.f6018a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
